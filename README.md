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



 

