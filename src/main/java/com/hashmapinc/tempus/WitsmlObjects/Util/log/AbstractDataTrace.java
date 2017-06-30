package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.Map;

/**
 * An abstract implementation of a data trace. This object holds the Mnemonic and IndexType and Map of values with Index
 * as the key, and the value of the trace as the value at that index
 * @param <K> The type of the Index
 * @param <V> The type of the Value
 */
public abstract class AbstractDataTrace <K,V> {

    private String mnemonic;

    /**
     * The index type of the trace, either Depth or Time
     * @return The index type
     */
    public abstract LogIndexType getIndexType();

    /**
     * The Mnemonic of the trace contained in the object
     * @return the mnemonic in string
     */
    public String getMnemonic(){
        return mnemonic;
    }

    /**
     * Sets the mnemonic of the trace contained in the object
     * @param mneumoic the mnemonic in the string
     */
    public void setMneumoic(String mneumoic){
        this.mnemonic = mneumoic;
    }

    /**
     * The values that were contained within the log for the trace
     * @return the values in a Map Index, Value pair
     */
    public abstract Map<K,V> getValues();
}
