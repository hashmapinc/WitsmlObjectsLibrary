package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.HashMap;
import java.util.Map;

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
