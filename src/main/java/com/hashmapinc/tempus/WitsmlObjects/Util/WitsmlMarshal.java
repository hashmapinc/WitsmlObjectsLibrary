package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;

import javax.xml.bind.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * This class provides static methods for the serialization and deserialization of WITSML data objects.
 */
public class WitsmlMarshal {
    // get logger
    private static final Logger LOG = Logger.getLogger(WitsmlMarshal.class.getName());

    /**
     * Deserializes an WITSML XML string into an Object.
     * The object type is passed in via witsmlClass and the witsml is passed in as a string.
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

        // TODO Pull this out for production
        // If you need to Debug JAXB this is your ticket.
        // Don't use this for production just when debugging.
        // jaxbUnmarshaller.setEventHandler(new javax.xml.bind.helpers.DefaultValidationEventHandler());

        return (T) JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(witsmlReader));
    }

    /**
     * Serializes a WITSML object into a corresponding legal WITSML string
     * @param witsmlObj The witsml object to serialize into a string
     * @return a legal WITSML string
     * @throws JAXBException
     */
    public static String serialize(Object witsmlObj) throws JAXBException {
        StringWriter witsmlWriter = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(witsmlObj.getClass());
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(witsmlObj, witsmlWriter);
        return witsmlWriter.toString();
    }

    /**
     * Serializes a WITSML object into a corresponding legal WITSML json string
     * @param witsmlObj The witsml object to serialize into a json string
     * @return a legal WITSML json string
     */
    public static <T> String serializeToJSON(T witsmlObj) throws JsonProcessingException{
        ObjectMapper om = new ObjectMapper();
        om.setDateFormat(new StdDateFormat());
        return om.writerWithDefaultPrettyPrinter().writeValueAsString(witsmlObj);
    }


    public static <T> T deserializeFromJSON(
        String json, 
        Class witsmlClass
    ) throws IOException {
        ObjectMapper om = new ObjectMapper();
        om.setDateFormat(new StdDateFormat());
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (T) om.readValue(json, witsmlClass);
    }
}
