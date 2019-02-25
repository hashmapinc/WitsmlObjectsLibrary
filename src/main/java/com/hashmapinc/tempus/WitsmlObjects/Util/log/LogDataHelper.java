package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo;
import com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a helper class that can process the log data and return it in a much more streamlined structure for processing. This class
 * can either generate a list of AbstractDataTraces or a CSV string.
 */
public class LogDataHelper {

    /**
     * Takes a 1.4.1.1 logs object and returns a list of all the AbstractDataTraces contained within the log. Each
     * AbstractDataTrace represents one log curve. The logs input can only contain 1 log within the collection, and
     * the log must contain the logData element.
     * @param log The 1.4.1.1 log object to process
     * @return A list of AbstractDataTraces each representing one log curve
     */
    public static List<AbstractDataTrace> processData(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs log){
        if (log.getLog().size() > 1)
            throw new IllegalArgumentException("Object cannot contain more than one log per request");

        List<AbstractDataTrace> curves = new ArrayList<>();

        ObjLog logToProcess = log.getLog().get(0);

        for (int i = 0; i < logToProcess.getLogCurveInfo().size(); i++){
            if (i == 0)
                continue;
            curves.add(createDataTrace(logToProcess.getIndexType(), logToProcess.getLogCurveInfo().get(i)));
        }

        return fillTraceValues(logToProcess, curves);
    }

    public static List<ColumnarDataTrace> getColumnarDataPoints(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs log, boolean omitNulls){
        if (log.getLog().size() > 1)
            throw new IllegalArgumentException("Object cannot contain more than one log per request");

        List<ColumnarDataTrace> traces = new ArrayList<>();

        ObjLog logToProcess = log.getLog().get(0);

        for (int i = 0; i < logToProcess.getLogCurveInfo().size(); i++){
            if (i == 0)
                continue;
            ColumnarDataTrace trace = createColumnarDataTrace(logToProcess.getIndexType(), logToProcess.getName(), logToProcess.getUid(), logToProcess.getLogCurveInfo().get(i), logToProcess.getUidWellbore(), logToProcess.getUidWell());
            if (trace == null)
                continue;
            traces.add(trace);
        }

        return fillColumnarValues(logToProcess, traces, omitNulls);
    }
    
    //New method created to change the index type to String as specified length from the ListObjectProcessor "Data Type Convert Filter"
    public static List<ColumnarDataTrace> getColumnarDataPoints(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs log, boolean omitNulls,String typeConvertFilter){
        if (log.getLog().size() > 1)
            throw new IllegalArgumentException("Object cannot contain more than one log per request");

        List<ColumnarDataTrace> traces = new ArrayList<>();

        ObjLog logToProcess = log.getLog().get(0);

        for (int i = 0; i < logToProcess.getLogCurveInfo().size(); i++){
            if (i == 0)
                continue;
            ColumnarDataTrace trace = createColumnarDataTrace(logToProcess.getIndexType(), logToProcess.getName(), logToProcess.getUid(), logToProcess.getLogCurveInfo().get(i), logToProcess.getUidWellbore(), logToProcess.getUidWell());
            if (trace == null)
                continue;
            traces.add(trace);
        }

        return fillColumnarValues(logToProcess, traces, omitNulls,typeConvertFilter);
    }
    
    //New method created to change the index type to String as specified length from the ListObjectProcessor "Data Type Convert Filter"
    private static List<ColumnarDataTrace> fillColumnarValues(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog log, List<ColumnarDataTrace> traces, boolean omitNulls,String typeConvertFilter){
        log.getLogData().get(0).getData().forEach(logData -> {
            String data[] = logData.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            for(int i = 0; i < data.length - 1; i++){
                if (i == 0)
                    continue;
                if (omitNulls && data[i].equals(""))
                    continue;
                traces.get(i).createDataPoint(data[0], data[i],typeConvertFilter);
            }
        });
        return traces;
    }

    private static List<ColumnarDataTrace> fillColumnarValues(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog log, List<ColumnarDataTrace> traces, boolean omitNulls){
        log.getLogData().get(0).getData().forEach(logData -> {
            String data[] = logData.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            for(int i = 0; i < data.length - 1; i++){
                if (i == 0)
                    continue;
                if (omitNulls && data[i].equals(""))
                    continue;
                traces.get(i).createDataPoint(data[0], data[i]);
            }
        });
        return traces;
    }

    private static ColumnarDataTrace createColumnarDataTrace(String indexType, String logName, String logUid, CsLogCurveInfo info, String wellboreId, String wellId){

        ColumnarDataTrace trace = null;

        if (indexType.equals("measured depth") ||
                indexType.equals("vertical depth") ||
                indexType.equals("length")){
            switch (info.getTypeLogData()){
                case "int":
                    trace = new ColumnarDataTrace<Double, Integer>();
                    break;
                case "byte":
                    trace = new ColumnarDataTrace<Double, Byte>();
                    break;
                case "long":
                    trace = new ColumnarDataTrace<Double, Long>();
                    break;
                case "float":
                    trace = new ColumnarDataTrace<Double, Float>();
                    break;
                case "short":
                    trace = new ColumnarDataTrace<Double, Short>();
                    break;
                case "Double":
                    trace = new ColumnarDataTrace<Double, Double>();
                    break;
                case "string":
                case "date time":
                case "unknown":
                case "string16":
                case "string40":
                    trace = new ColumnarDataTrace<Double, String>();
                    break;
            }
        }
        else if (indexType.equals("date time") ||
                indexType.equals("elapsed time")) {
            switch (info.getTypeLogData()) {
                case "int":
                    trace = new ColumnarDataTrace<String, Integer>();
                    break;
                case "byte":
                    trace = new ColumnarDataTrace<String, Byte>();
                    break;
                case "long":
                    trace = new ColumnarDataTrace<String, Long>();
                    break;
                case "float":
                    trace = new ColumnarDataTrace<String, Float>();
                    break;
                case "short":
                    trace = new ColumnarDataTrace<String, Short>();
                    break;
                case "Double":
                    trace = new ColumnarDataTrace<String, Double>();
                    break;
                case "string":
                case "date time":
                case "unknown":
                case "string16":
                case "string40":
                    trace = new ColumnarDataTrace<String, String>();
                    break;
            }
        }

        if (trace == null)
            return null;

        trace.setLogName(logName);
        trace.setLogUid(logUid);
        trace.setMnemonic(info.getMnemonic().getValue());
        trace.setUnitOfMeasure(info.getUnit());
        trace.setWellboreUid(wellboreId);
        trace.setWellUid(wellId);
        return trace;
    }

    /**
     * Takes a 1.4.1.1 log object and produces an equivalent CSV file representing the data. The first row is the mneumonic,
     * the second row is the unit (if requested).
     * @param log The 1.4.1.1 log object to process.
     * @param withUnits When true, the csv will contain the unit row in the second position, when false, the unit row will not be included.
     * @return A string representing a CSV from the data conatined within the 1.4.1.1 log object
     */
    public static String getCSV(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog log, Boolean withUnits){
        StringBuilder builder = new StringBuilder();

        builder.append(log.getLogData().get(0).getMnemonicList()).append(System.lineSeparator());
        if (withUnits)
            builder.append(log.getLogData().get(0).getUnitList()).append(System.lineSeparator());

        log.getLogData().get(0).getData().forEach(csLogData -> {
            builder.append(csLogData).append(System.lineSeparator());
        });

        return builder.toString();
    }

    // Creates the correct type of data trace depending on the metadata of the log
    private static AbstractDataTrace createDataTrace(String indexType, CsLogCurveInfo info){

        AbstractDataTrace trace = null;

        if ("measured depth".equals(indexType) ||
                "vertical depth".equals(indexType) ||
                "length".equals(indexType)) {
            switch (info.getTypeLogData()){
                case "int":
                    trace = new DepthLogTrace<Integer>();
                    break;
                case "byte":
                    trace = new DepthLogTrace<Byte>();
                    break;
                case "long":
                    trace = new DepthLogTrace<Long>();
                    break;
                case "float":
                    trace = new DepthLogTrace<Float>();
                    break;
                case "short":
                    trace = new DepthLogTrace<Short>();
                    break;
                case "Double":
                    trace = new DepthLogTrace<Double>();
                    break;
                case "string":
                case "date time":
                case "unknown":
                case "string16":
                case "string40":
                    trace = new DepthLogTrace<String>();
                    break;
            }
        }
        else if ("date time".equals(indexType) ||
                "elapsed time".equals(indexType)) {
            switch (info.getTypeLogData()) {
                case "int":
                    trace = new TimeLogTrace<Integer>();
                    break;
                case "byte":
                    trace = new TimeLogTrace<Byte>();
                    break;
                case "long":
                    trace = new TimeLogTrace<Long>();
                    break;
                case "float":
                    trace = new TimeLogTrace<Float>();
                    break;
                case "short":
                    trace = new TimeLogTrace<Short>();
                    break;
                case "Double":
                    trace = new TimeLogTrace<Double>();
                    break;
                case "string":
                case "date time":
                case "unknown":
                case "string16":
                case "string40":
                    trace = new TimeLogTrace<String>();
                    break;
            }
        }
        trace.setMneumoic(info.getMnemonic().getValue());
        trace.setUnitOfMeasure(info.getUnit());

        return trace;
    }

    // Fills the trace collection that was created only with the metadata values with the actual data values.
    private static List<AbstractDataTrace> fillTraceValues(ObjLog log, List<AbstractDataTrace> traces){
        log.getLogData().get(0).getData().forEach(logData -> {
            String data[] = logData.split(",");
            for(int i = 0; i < data.length - 1; i++){
                if (i == 0)
                    continue;

                traces.get(i).getValues().put(data[0], data[i]);
            }
        });
        return traces;
    }
}
