package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.ArrayList;
import java.util.List;

public class ColumnarDataTrace <I, V> {
    private String mnemonic;

    private String unitOfMeasure;

    private String logName;

    private String logUid;

    public String getWellUid() {
        return wellUid;
    }

    public void setWellUid(String wellUid) {
        this.wellUid = wellUid;
    }

    private String wellUid;

    public String getWellboreUid() {
        return wellboreUid;
    }

    public void setWellboreUid(String wellboreUid) {
        this.wellboreUid = wellboreUid;
    }

    private String wellboreUid;

    private List<ColumnarDataPoint<I, V>> dataPoints = new ArrayList<>();

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogUid() {
        return logUid;
    }

    public void setLogUid(String logUid) {
        this.logUid = logUid;
    }

    public List<ColumnarDataPoint<I, V>> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<ColumnarDataPoint<I, V>> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public void createDataPoint(I index, V value){
        ColumnarDataPoint<I, V> datapoint = new ColumnarDataPoint<>();
        datapoint.setMneumoic(this.mnemonic);
        datapoint.setIndex(index);
        datapoint.setValue(value);
        datapoint.setLogName(logName);
        datapoint.setWellboreUid(wellboreUid);
        datapoint.setWellUid(wellUid);
        this.dataPoints.add(datapoint);
    }
}
