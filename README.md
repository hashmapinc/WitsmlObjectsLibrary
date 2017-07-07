<img src="https://hashmapinc.github.io/hashmap.github.io/images/tempus/Tempus_Black.png" width="200" height="245" alt="Hashmap, Inc Tempus"/>

[![Build Status](https://travis-ci.org/hashmapinc/WitsmlObjectsLibrary.svg?branch=master)](https://travis-ci.org/hashmapinc/WitsmlObjectsLibrary)
[![License](http://img.shields.io/:license-Apache%202-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)

# WitsmlObjectsLibrary
This library aims to help users who need to ingest or deal with WITSML-based data from within a Linux, or cross platform
environment, especially the Hadoop ecosystem, process and operate on WITSML data. WITSML is maintained by Energistics, a 
global consortium that facilitate the development of standards for the upstream oil and gas industry. WITSML itself is an
XML based specification that is used to transmit, and sometimes archive data that was generated throughout the construction
phase of a well. At this time currently only the legacy 1.3.1.1 and 1.4.1.1 versions are supported. The intention is that this
library can be used within Spark, Storm, NiFi, HDFS, or anywhere where WITSML data needs to be parsed and handled. Note 
that this is a sub-project that will support the continuing work of developing a WITSML client for use in applications 
such as Apache NiFi as well.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Documentation](#documentation)
- [License](#license)

## Features

This library aims to provide a few key features:

* POJO's representing each of the WITSML 1.3.1.1 and 1.4.1.1 objects.
* A conversion utility for converting WITSML between 1.3.1.1 and 1.4.1.1
* A helper library to process log data and output a CSV or a List of data objects
* A serializer and deserializer for each of the WITSML objects in 1.3.1.1 and 1.4.1.1

## Requirements

* JDK 1.8 at a minimum
* Maven 3.1 or newer
* Git client (to build locally)

## Getting Started
To build the library and get started first off clone the GitHub repository 

    git clone https://github.com/hashmapinc/WitsmlObjectsLibrary.git

Change directory into the WitsmlObjectsLibrary

    cd WitsmlObjectsLibrary
    
Execute a maven clean install

    mvn clean install
    
A Build success message should appear
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 13.271 s
    [INFO] Finished at: 2017-06-30T15:14:58-05:00
    [INFO] Final Memory: 20M/377M
    [INFO] ------------------------------------------------------------------------

To generate the documentation, execute a javadoc build

    mvn javadoc:javadoc
    
A build success message should appear again    
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 9.320 s
    [INFO] Finished at: 2017-06-30T15:15:54-05:00
    [INFO] Final Memory: 17M/309M
    [INFO] ------------------------------------------------------------------------
   
The documentation should now be available in /targets/site/apidocs

## Usage
The intention was to make it as straight forward to use the library as possible. The majority of the interaction will be 
through the Util classes (WitsmlMarshal, WitsmlVersionTransformer, LogDataHelper). 

### WitsmlMarshal
This class contains the static methods needed to serialize or deserialize a WITSML object.

#### Deserialization
```java
public void testWellMarshalling1411(){
    try {
        //read in the WITSML file
        String wellXml = TestUtilities.getResourceAsString("well_no_xsl_1411.xml");
        //deserialize using the hleper into the object
        ObjWells wells = WitsmlMarshal.deserialize(wellXml, ObjWells.class);
    } catch (IOException | JAXBException e) {
        e.printStackTrace();
    }
}
```

#### Serialization
```java
public void testWellUnMarshalling1411(){
    try {
        //read in the WITSML file
        String wellXmlIn = TestUtilities.getResourceAsString("well_no_xsl_1411.xml");
        //deserialize to an object
        ObjWells wellsIn = WitsmlMarshal.deserialize(wellXmlIn, ObjWells.class);
        //serialize back to a witsml string
        String wellXmlOut = WitsmlMarshal.serialize(wellsIn);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

### WitsmlVersionTransformer

#### Transforming between versions

The reason for the transformer not being a singleton is that the creation of the transformer in parsing the XSLT is quite
expensive. In normal useage, if the convertVersion method will be called in a loop or repeately on a timer, then a single
instance of the transformer should be created and then be reused.

```java
public void testForwardTransformWells(){
        String forwardConvert = "";
        try {
            // create the transformer
            WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
            // perform the translation
            forwardConvert = transformer.convertVersion(TestUtilities.getResourceAsString("well_no_xsl_1311.xml"));
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }
        try {
            // deserialize the new 1.4.1.1 object
            ObjWells convertedWell = WitsmlMarshal.deserialize(forwardConvert, ObjWells.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
```
### LogDataHelper

#### Creating a CSV from a 1.4.1.1 Log Object (only 3 lines!)

```java
public void testExportCSV1411(){
    try {
        //read witsml
        String data = TestUtilities.getResourceAsString("log_with_data_1411.xml");
        //deserialize object
        ObjLogs logs = WitsmlMarshal.deserialize(data, ObjLogs.class);
        //get csv
        String csv = LogDataHelper.getCSV(logs.getLog().get(0), true);
    } catch (IOException | JAXBException e) {
        e.printStackTrace();
    }
}
```

#### Creating a CSV from a 1.3.1.1 Log Object

```java
public void testExportCSV1311(){
    try {
        //read in witsml data
        String data = TestUtilities.getResourceAsString("log_with_data_1311.xml");
        try {
            //create the version transformer
            WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
            //convert to 1.4.1.1
            String convertedData = transformer.convertVersion(data);
            //deserialize the data
            ObjLogs logs = WitsmlMarshal.deserialize(convertedData, ObjLogs.class);
            //get the csv
            String csv = LogDataHelper.getCSV(logs.getLog().get(0), true);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    } catch (IOException | JAXBException e) {
        e.printStackTrace();
    }
}
```

#### Creating a List of values from log data

This will return a typesafe list of values from the WITSML log object that can the be processed for upsertion into Hbase or 
processed by NiFi, etc...

```java
public void testProcess1411Log(){
    try {
        //get the witsml data
        String data = TestUtilities.getResourceAsString("log_with_data_1411.xml");
        //get the log data
        ObjLogs logs = WitsmlMarshal.deserialize(data, ObjLogs.class);
        //get the list of points
        List<AbstractDataTrace> traces = LogDataHelper.processData(logs);
    } catch (IOException | JAXBException e) {
        e.printStackTrace();
    }
}
```
## Documentation
[Online Documentation](https://hashmapinc.github.io/hashmap.github.io/tempus/WitsmlObjectsLibrary/docs/)

- The API documentation is contained within the /docs folder once the repository is cloned, or can be generated by following
the instructions in the [Getting Started](#getting-started) section.

## License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 

