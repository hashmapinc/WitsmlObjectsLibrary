package com.hashmapinc.tempus.WitsmlObjects.Util;

import javax.xml.bind.*;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;

/**
 * This class provides static methods for the serialization and deserialization of WITSML data objects.
 */
public class WitsmlMarshal {

    /**
     * Deserializes an WITSML XML string into an Object. The object type is passed in via witsmlClass and the witsml is passed in as a string.
     * @param witsml The String containing the WITSML data
     * @param witsmlClass The class to serialize the WITSML string into
     * @param <T> The type of class that is going to be returned
     * @return The serialized object that represents the WITSML String that was passsed in
     * @throws JAXBException Thrown on a parsing exception
     */
    public static <T> T deserialize(String witsml, Class witsmlClass) throws JAXBException {
        StringReader witsmlReader = new StringReader(witsml);
        JAXBContext jaxbContext = JAXBContext.newInstance(witsmlClass);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return (T) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(witsmlReader));
    }

    /**
     * Serializes a WITSML object into a corresponding legal WITSML string
     * @param witsmlObj The witsml object to serialize into a string
     * @return a legal WITSML string
     * @throws JAXBException
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static String serialize(Object witsmlObj) throws JAXBException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        StringWriter witsmlWriter = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(witsmlObj.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(witsmlObj, witsmlWriter);
        return witsmlWriter.toString();
    }
}
