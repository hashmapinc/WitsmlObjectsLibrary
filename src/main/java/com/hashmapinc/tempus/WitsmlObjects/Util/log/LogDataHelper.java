package com.hashmapinc.tempus.WitsmlObjects.Util.log;

import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlMarshal;
import com.hashmapinc.tempus.WitsmlObjects.Util.WitsmlVersionTransformer;
import com.hashmapinc.tempus.WitsmlObjects.v1411.*;
import com.hashmapinc.tempus.WitsmlObjects.v1411.LogIndexType;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class LogDataHelper {

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
        return trace;
    }

    public static List<AbstractDataTrace> processData(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs log) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, JAXBException, TransformerException {
        String witsml = WitsmlMarshal.serialize(log);
        WitsmlVersionTransformer transformer = new WitsmlVersionTransformer();
        String newWitsmlLog = transformer.convertVersion(witsml);
        return processData((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs)(WitsmlMarshal.deserialize(newWitsmlLog, ObjLogs.class)));
    }

}
