package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo;
import com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexType;
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
    private static AbstractDataTrace createDataTrace(com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexType indexType, CsLogCurveInfo info){

        AbstractDataTrace trace = null;

        if (indexType.equals(com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexType.MEASURED_DEPTH) ||
                indexType.equals(LogIndexType.VERTICAL_DEPTH) ||
                indexType.equals(LogIndexType.LENGTH)){
            switch (info.getTypeLogData()){
                case INT:
                    trace = new DepthLogTrace<Integer>();
                    break;
                case BYTE:
                    trace = new DepthLogTrace<Byte>();
                    break;
                case LONG:
                    trace = new DepthLogTrace<Long>();
                    break;
                case FLOAT:
                    trace = new DepthLogTrace<Float>();
                    break;
                case SHORT:
                    trace = new DepthLogTrace<Short>();
                    break;
                case DOUBLE:
                    trace = new DepthLogTrace<Double>();
                    break;
                case STRING:
                case DATE_TIME:
                case UNKNOWN:
                case STRING_16:
                case STRING_40:
                    trace = new DepthLogTrace<String>();
                    break;
            }
        }
        else if (indexType.equals(LogIndexType.DATE_TIME) ||
                indexType.equals(LogIndexType.ELAPSED_TIME)) {
            switch (info.getTypeLogData()) {
                case INT:
                    trace = new TimeLogTrace<Integer>();
                    break;
                case BYTE:
                    trace = new TimeLogTrace<Byte>();
                    break;
                case LONG:
                    trace = new TimeLogTrace<Long>();
                    break;
                case FLOAT:
                    trace = new TimeLogTrace<Float>();
                    break;
                case SHORT:
                    trace = new TimeLogTrace<Short>();
                    break;
                case DOUBLE:
                    trace = new TimeLogTrace<Double>();
                    break;
                case STRING:
                case DATE_TIME:
                case UNKNOWN:
                case STRING_16:
                case STRING_40:
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
