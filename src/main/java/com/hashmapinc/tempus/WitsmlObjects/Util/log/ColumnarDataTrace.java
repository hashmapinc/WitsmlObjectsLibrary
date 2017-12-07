package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ColumnarDataTrace <I, V> {
    private String mnemonic;

    private String unitOfMeasure;

    private String logName;

    private String logUid;
    
    private String index;
    
    private String indexString;
    
    

    public String getIndexString() {
		return indexString;
	}

	public void setIndexString(String indexString) {
		this.indexString = indexString;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

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
    
    //New method overridden to accept the convert filter as parameter.
    public void createDataPoint(I index, V value,String typeConvertFilter){
        ColumnarDataPoint<I, V> datapoint = new ColumnarDataPoint<>();
        datapoint.setMneumoic(this.mnemonic);
        datapoint.setIndex(index);
        datapoint.setValue(value);
        datapoint.setLogName(logName);
        datapoint.setWellboreUid(wellboreUid);
        datapoint.setWellUid(wellUid);
        try{
    	   if(StringUtils.isNotEmpty(typeConvertFilter) && StringUtils.isNumeric(typeConvertFilter)){
    		   int dataLength = Integer.valueOf(typeConvertFilter);
    		   String indexvalue = String.valueOf(index);
    		   if(StringUtils.isNotEmpty(indexvalue) && indexvalue.length() < dataLength){
    			   datapoint.setIndexString(StringUtils.leftPad(indexvalue, dataLength, "0"));
    		   }
    	   }
       }catch(Exception exp){
    	 exp.printStackTrace();
       }
       
        this.dataPoints.add(datapoint);
    }
}
