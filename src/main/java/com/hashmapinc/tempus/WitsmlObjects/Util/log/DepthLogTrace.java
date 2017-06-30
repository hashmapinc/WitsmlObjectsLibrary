package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.HashMap;
import java.util.Map;

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
