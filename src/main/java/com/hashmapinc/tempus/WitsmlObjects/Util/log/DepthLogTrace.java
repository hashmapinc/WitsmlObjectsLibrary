package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.HashMap;
import java.util.Map;

/**
 * An implementation of AbstractDataTrace that represents a depth indexed trace
 * @param <T> The data type of the value.
 */
public class DepthLogTrace <T> extends AbstractDataTrace {

    private Map values = new HashMap<Double, T>();

    @Override
    public LogIndexType getIndexType(){
        return LogIndexType.DEPTH;
    }

    @Override
    public Map getValues() {
        return values;
    }
}
