package com.hashmapinc.tempus.WitsmlObjects.Util;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LogConverterTest {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    @Test
    public void shouldConvert1411to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog dest = LogConverter.convertTo1311(src);

        // check equality for non complex, non repeating fields
        assertEquals(src.getNameWell(), dest.getNameWell());
        assertEquals(src.getNameWellbore(), dest.getNameWellbore());
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.isObjectGrowing(), dest.isObjectGrowing());
        assertEquals(src.getServiceCompany(), dest.getServiceCompany());
        assertEquals(src.getRunNumber(), dest.getRunNumber());
        assertEquals(src.getBhaRunNumber(), dest.getBhaRunNumber());
        assertEquals(src.getPass(), dest.getPass());
        assertEquals(src.getUidWell(), dest.getUidWell());
        assertEquals(src.getUidWellbore(), dest.getUidWellbore());
        assertEquals(src.getUid(), dest.getUid());
        assertEquals(src.getCreationDate(), dest.getCreationDate());
        assertEquals(src.getDescription(), dest.getDescription());
        assertEquals(src.getNullValue(), dest.getNullValue());
        assertEquals(src.getStartDateTimeIndex(), dest.getStartDateTimeIndex());
        assertEquals(src.getEndDateTimeIndex(), dest.getEndDateTimeIndex());


        // check complex fields
        // indexType
        if (null != src.getIndexType())
            assertEquals(src.getIndexType(), dest.getIndexType());

        // startIndex
        if (null != src.getStartIndex()) {
            assertEquals(src.getStartIndex().getUom(), dest.getStartIndex().getUom());
            assertEquals(src.getStartIndex().getValue(), dest.getStartIndex().getValue());
        }

        // endIndex
        if (null != src.getEndIndex()) {
            assertEquals(src.getEndIndex().getUom(), dest.getEndIndex().getUom());
            assertEquals(src.getEndIndex().getValue(), dest.getEndIndex().getValue());
        }

        // stepIncrement
        if (null != src.getStepIncrement()) {
            assertEquals(src.getStepIncrement().getUom(), dest.getStepIncrement().getUom());
            assertEquals(src.getStepIncrement().getValue(), dest.getStepIncrement().getValue());
            assertEquals(src.getStepIncrement().getNumerator(), dest.getStepIncrement().getNumerator());
            assertEquals(src.getStepIncrement().getDenominator(), dest.getStepIncrement().getDenominator());
        }

        // direction
        if (null != src.getDirection())
            assertEquals(src.getDirection(), dest.getDirection());

        // indexCurve
        if (null != src.getIndexCurve())
            assertEquals(src.getIndexCurve(), dest.getIndexCurve().getValue());

        // logData
        if (null != src.getLogData())
            assertEquals(src.getLogData().get(0).getData(), dest.getLogData().getData()); // TODO: confirm this conversion

        // commonData
        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState(), dest.getCommonData().getItemState());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }

        // customData
        if (null != src.getCustomData() && null != src.getCustomData().getAny()){
            for (int i = 0; i < src.getCustomData().getAny().size(); i++)
                assertEquals(src.getCustomData().getAny().get(i), dest.getCustomData().getAny().get(i));
        }

        // check repeating fields
        // logParam
        if (null != src.getLogParam()) {
            for (int i = 0; i < src.getLogParam().size(); i++) {
                assertEquals(src.getLogParam().get(i).getDescription(), dest.getLogParam().get(i).getDescription());
                assertEquals(src.getLogParam().get(i).getValue(), dest.getLogParam().get(i).getValue());
                assertEquals(src.getLogParam().get(i).getIndex(), dest.getLogParam().get(i).getIndex());
                assertEquals(src.getLogParam().get(i).getName(), dest.getLogParam().get(i).getName());
                assertEquals(src.getLogParam().get(i).getUom(), dest.getLogParam().get(i).getUom());
            }
        }

        // logCurveInfo
        if (null != src.getLogCurveInfo()) {
            for (int i = 0; i < src.getLogCurveInfo().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo srcInfo = src.getLogCurveInfo().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo destInfo = dest.getLogCurveInfo().get(i);

                // simple fields
                assertEquals(srcInfo.getClassWitsml(), destInfo.getClassWitsml());
                assertEquals(srcInfo.getUnit(), destInfo.getUnit());
                assertEquals(srcInfo.getNullValue(), destInfo.getNullValue());
                assertEquals(srcInfo.isAlternateIndex(), destInfo.isAlternateIndex());
                assertEquals(srcInfo.getMinDateTimeIndex(), destInfo.getMinDateTimeIndex());
                assertEquals(srcInfo.getMaxDateTimeIndex(), destInfo.getMaxDateTimeIndex());
                assertEquals(srcInfo.getCurveDescription(), destInfo.getCurveDescription());
                assertEquals(srcInfo.getDataSource(), destInfo.getDataSource());
                assertEquals(srcInfo.getUid(), destInfo.getUid());

                // complex fields
                // mnemonic
                if (null != srcInfo.getMnemonic())
                    assertEquals(srcInfo.getMnemonic().getValue(), destInfo.getMnemonic());

                // mnemAlias
                if (null != srcInfo.getMnemAlias())
                    assertEquals(srcInfo.getMnemAlias().getValue(), destInfo.getMnemAlias());

                // wellDatum
                if (null != srcInfo.getWellDatum()) {
                    assertEquals(srcInfo.getWellDatum().getValue(), destInfo.getWellDatum().getValue());
                    assertEquals(srcInfo.getWellDatum().getUidRef(), destInfo.getWellDatum().getUidRef());
                }

                // minIndex
                if (null != srcInfo.getMinIndex()) {
                    assertEquals(srcInfo.getMinIndex().getValue(), destInfo.getMinIndex().getValue());
                    assertEquals(srcInfo.getMinIndex().getUom(), destInfo.getMinIndex().getUom());
                }

                // maxIndex
                if (null != srcInfo.getMaxIndex()) {
                    assertEquals(srcInfo.getMaxIndex().getValue(), destInfo.getMaxIndex().getValue());
                    assertEquals(srcInfo.getMaxIndex().getUom(), destInfo.getMaxIndex().getUom());
                }

                // sensorOffset
                if (null != srcInfo.getSensorOffset()) {
                    assertEquals(srcInfo.getSensorOffset().getValue(), destInfo.getSensorOffset().getValue());
                    assertEquals(srcInfo.getSensorOffset().getUom(), destInfo.getSensorOffset().getUom());
                }

                // densData
                if (null != srcInfo.getDensData()) {
                    assertEquals(srcInfo.getDensData().getValue(), destInfo.getDensData().getValue());
                    assertEquals(srcInfo.getDensData().getUom(), destInfo.getDensData().getUom());
                }

                // traceState
                if (null != srcInfo.getTraceState())
                    assertEquals(srcInfo.getTraceState(), destInfo.getTraceState());

                // traceOrigin
                if (null != srcInfo.getTraceOrigin())
                    assertEquals(srcInfo.getTraceOrigin(), destInfo.getTraceOrigin());

                // typeLogData
                if (null != srcInfo.getTypeLogData())
                    assertEquals(srcInfo.getTypeLogData(), destInfo.getTypeLogData());

                // repeating fields
                if (null != srcInfo.getAxisDefinition()) {
                    for (int j = 0; j < srcInfo.getAxisDefinition().size(); j++) {
                        com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition srcDef = srcInfo.getAxisDefinition().get(j);
                        com.hashmapinc.tempus.WitsmlObjects.v1311.CsAxisDefinition destDef = destInfo.getAxisDefinition().get(j);

                        // simple fields
                        assertEquals(srcDef.getOrder(), destDef.getOrder());
                        assertEquals(srcDef.getCount(), destDef.getCount());
                        assertEquals(srcDef.getName(), destDef.getName());
                        assertEquals(srcDef.getPropertyType(), destDef.getPropertyType());
                        assertEquals(srcDef.getUom(), destDef.getUom());
                        assertEquals(srcDef.getUid(), destDef.getUid());
                        assertEquals(srcDef.getDoubleValues(), destDef.getDoubleValues());
                        assertEquals(srcDef.getStringValues(), destDef.getStringValues());
                    }
                }
            }
        }
    }

    @Test
    public void shouldConvert20to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log20.xml");
        com.hashmapinc.tempus.WitsmlObjects.v20.Log src = WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v20.Log.class);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog dest = LogConverter.convertTo1311(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    @Test
    public void shouldConvert1311to1411()  throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = LogConverter.convertTo1411(src);

        // check equality for non complex, non repeating fields
        assertEquals(src.getNameWell(), dest.getNameWell());
        assertEquals(src.getNameWellbore(), dest.getNameWellbore());
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.isObjectGrowing(), dest.isObjectGrowing());
        assertEquals(src.getServiceCompany(), dest.getServiceCompany());
        assertEquals(src.getRunNumber(), dest.getRunNumber());
        assertEquals(src.getBhaRunNumber(), dest.getBhaRunNumber());
        assertEquals(src.getPass(), dest.getPass());
        assertEquals(src.getUidWell(), dest.getUidWell());
        assertEquals(src.getUidWellbore(), dest.getUidWellbore());
        assertEquals(src.getUid(), dest.getUid());
        assertEquals(src.getCreationDate(), dest.getCreationDate());
        assertEquals(src.getDescription(), dest.getDescription());
        assertEquals(src.getNullValue(), dest.getNullValue());
        assertEquals(src.getStartDateTimeIndex(), dest.getStartDateTimeIndex());
        assertEquals(src.getEndDateTimeIndex(), dest.getEndDateTimeIndex());


        // check complex fields
        // indexType
        if (null != src.getIndexType())
            assertEquals(src.getIndexType(), dest.getIndexType());

        // startIndex
        if (null != src.getStartIndex()) {
            assertEquals(src.getStartIndex().getUom(), dest.getStartIndex().getUom());
            assertEquals(src.getStartIndex().getValue(), dest.getStartIndex().getValue());
        }

        // endIndex
        if (null != src.getEndIndex()) {
            assertEquals(src.getEndIndex().getUom(), dest.getEndIndex().getUom());
            assertEquals(src.getEndIndex().getValue(), dest.getEndIndex().getValue());
        }

        // stepIncrement
        if (null != src.getStepIncrement()) {
            assertEquals(src.getStepIncrement().getUom(), dest.getStepIncrement().getUom());
            assertEquals(src.getStepIncrement().getValue(), dest.getStepIncrement().getValue());
            assertEquals(src.getStepIncrement().getNumerator(), dest.getStepIncrement().getNumerator());
            assertEquals(src.getStepIncrement().getDenominator(), dest.getStepIncrement().getDenominator());
        }

        // direction
        if (null != src.getDirection())
            assertEquals(src.getDirection(), dest.getDirection());

        // indexCurve
        if (null != src.getIndexCurve())
            assertEquals(src.getIndexCurve().getValue(), dest.getIndexCurve());

        // logData
        if (null != src.getLogData())
            assertEquals(src.getLogData().getData(), dest.getLogData().get(0).getData()); // TODO: confirm this conversion

        // commonData
        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState(), dest.getCommonData().getItemState());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }

        // customData
        if (null != src.getCustomData() && null != src.getCustomData().getAny()){
            for (int i = 0; i < src.getCustomData().getAny().size(); i++)
                assertEquals(src.getCustomData().getAny().get(i), dest.getCustomData().getAny().get(i));
        }

        // check repeating fields
        // logParam
        if (null != src.getLogParam()) {
            for (int i = 0; i < src.getLogParam().size(); i++) {
                assertEquals(src.getLogParam().get(i).getDescription(), dest.getLogParam().get(i).getDescription());
                assertEquals(src.getLogParam().get(i).getValue(), dest.getLogParam().get(i).getValue());
                assertEquals(src.getLogParam().get(i).getIndex(), dest.getLogParam().get(i).getIndex());
                assertEquals(src.getLogParam().get(i).getName(), dest.getLogParam().get(i).getName());
                assertEquals(src.getLogParam().get(i).getUom(), dest.getLogParam().get(i).getUom());
            }
        }

        // logCurveInfo
        if (null != src.getLogCurveInfo()) {
            for (int i = 0; i < src.getLogCurveInfo().size(); i++) {
                com.hashmapinc.tempus.WitsmlObjects.v1311.CsLogCurveInfo srcInfo = src.getLogCurveInfo().get(i);
                com.hashmapinc.tempus.WitsmlObjects.v1411.CsLogCurveInfo destInfo = dest.getLogCurveInfo().get(i);

                // simple fields
                assertEquals(srcInfo.getClassWitsml(), destInfo.getClassWitsml());
                assertEquals(srcInfo.getUnit(), destInfo.getUnit());
                assertEquals(srcInfo.getNullValue(), destInfo.getNullValue());
                assertEquals(srcInfo.isAlternateIndex(), destInfo.isAlternateIndex());
                assertEquals(srcInfo.getMinDateTimeIndex(), destInfo.getMinDateTimeIndex());
                assertEquals(srcInfo.getMaxDateTimeIndex(), destInfo.getMaxDateTimeIndex());
                assertEquals(srcInfo.getCurveDescription(), destInfo.getCurveDescription());
                assertEquals(srcInfo.getDataSource(), destInfo.getDataSource());
                assertEquals(srcInfo.getUid(), destInfo.getUid());

                // complex fields
                // mnemonic
                if (null != srcInfo.getMnemonic())
                    assertEquals(srcInfo.getMnemonic(), destInfo.getMnemonic().getValue());

                // mnemAlias
                if (null != srcInfo.getMnemAlias())
                    assertEquals(srcInfo.getMnemAlias(), destInfo.getMnemAlias().getValue());

                // wellDatum
                if (null != srcInfo.getWellDatum()) {
                    assertEquals(srcInfo.getWellDatum().getValue(), destInfo.getWellDatum().getValue());
                    assertEquals(srcInfo.getWellDatum().getUidRef(), destInfo.getWellDatum().getUidRef());
                }

                // minIndex
                if (null != srcInfo.getMinIndex()) {
                    assertEquals(srcInfo.getMinIndex().getValue(), destInfo.getMinIndex().getValue());
                    assertEquals(srcInfo.getMinIndex().getUom(), destInfo.getMinIndex().getUom());
                }

                // maxIndex
                if (null != srcInfo.getMaxIndex()) {
                    assertEquals(srcInfo.getMaxIndex().getValue(), destInfo.getMaxIndex().getValue());
                    assertEquals(srcInfo.getMaxIndex().getUom(), destInfo.getMaxIndex().getUom());
                }

                // sensorOffset
                if (null != srcInfo.getSensorOffset()) {
                    assertEquals(srcInfo.getSensorOffset().getValue(), destInfo.getSensorOffset().getValue());
                    assertEquals(srcInfo.getSensorOffset().getUom(), destInfo.getSensorOffset().getUom());
                }

                // densData
                if (null != srcInfo.getDensData()) {
                    assertEquals(srcInfo.getDensData().getValue(), destInfo.getDensData().getValue());
                    assertEquals(srcInfo.getDensData().getUom(), destInfo.getDensData().getUom());
                }

                // traceState
                if (null != srcInfo.getTraceState())
                    assertEquals(srcInfo.getTraceState(), destInfo.getTraceState());

                // traceOrigin
                if (null != srcInfo.getTraceOrigin())
                    assertEquals(srcInfo.getTraceOrigin(), destInfo.getTraceOrigin());

                // typeLogData
                if (null != srcInfo.getTypeLogData())
                    assertEquals(srcInfo.getTypeLogData(), destInfo.getTypeLogData());

                // repeating fields
                if (null != srcInfo.getAxisDefinition()) {
                    for (int j = 0; j < srcInfo.getAxisDefinition().size(); j++) {
                        com.hashmapinc.tempus.WitsmlObjects.v1311.CsAxisDefinition srcDef = srcInfo.getAxisDefinition().get(j);
                        com.hashmapinc.tempus.WitsmlObjects.v1411.CsAxisDefinition destDef = destInfo.getAxisDefinition().get(j);

                        // simple fields
                        assertEquals(srcDef.getOrder(), destDef.getOrder());
                        assertEquals(srcDef.getCount(), destDef.getCount());
                        assertEquals(srcDef.getName(), destDef.getName());
                        assertEquals(srcDef.getPropertyType(), destDef.getPropertyType());
                        assertEquals(srcDef.getUom(), destDef.getUom());
                        assertEquals(srcDef.getUid(), destDef.getUid());
                        assertEquals(srcDef.getDoubleValues(), destDef.getDoubleValues());
                        assertEquals(srcDef.getStringValues(), destDef.getStringValues());
                    }
                }
            }
        }
    }

    @Test
    public void shouldConvert20to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log20.xml");
        com.hashmapinc.tempus.WitsmlObjects.v20.Log src = WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v20.Log.class);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = LogConverter.convertTo1411(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    @Test
    public void shouldConvert1311to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v20.Log dest = LogConverter.convertTo20(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }

    @Test
    public void shouldConvert1411to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("log_converter/log1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLogs)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog.class)).getLog().get(0);

        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v20.Log dest = LogConverter.convertTo20(src);

        // check equality for non complex, non repeating fields

        // check complex fields

        // check repeating fields

    }
    //=========================================================================
}
