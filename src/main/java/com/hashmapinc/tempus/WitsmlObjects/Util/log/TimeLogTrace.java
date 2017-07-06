package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.HashMap;
import java.util.Map;

/**
 * An implementation of AbstractDataTrace that represents a time indexed trace
 * @param <V> The data type of the value.
 */
public class TimeLogTrace <V> extends AbstractDataTrace {

    private Map<String, V> values = new HashMap<String, V>();

    @Override
    public LogIndexType getIndexType(){
        return LogIndexType.TIME;
    }

    @Override
    public Map getValues() {
        return values;
    }
}
