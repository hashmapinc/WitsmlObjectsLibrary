package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.Map;

/**
 * An abstract implementation of a data trace. This object holds the Mnemonic and IndexType and Map of values with Index
 * as the key, and the value of the trace as the value at that index
 * @param <I> The type of the Index
 * @param <V> The type of the Value
 */
public class ColumnarDataPoint<I,V> {

    private String mnemonic;

    private I index;

    private V value;

    /**
     * The index of the point
     * @return The index type
     */
    public I getIndex(){
        return this.index;
    }

    public V getValue(){
        return this.value;
    }

    public void setValue(V value){
        this.value = value;
    }

    public void setIndex(I index){
        this.index = index;
    }

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

}