package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.Map;

public abstract class AbstractDataTrace <K,V> {

    private String mnemonic;


    public abstract LogIndexType getIndexType();

    public String getMnemonic(){
        return mnemonic;
    }

    public void setMneumoic(String mneumoic){
        this.mnemonic = mneumoic;
    }

    public abstract Map<K,V> getValues();
}
