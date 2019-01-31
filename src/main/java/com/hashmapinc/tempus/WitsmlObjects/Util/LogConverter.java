package com.hashmapinc.tempus.WitsmlObjects.Util;

public class LogConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src) {
        return null;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.Log src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src) {
        // get converted log
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog();

        // check equality for non complex, non repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setObjectGrowing(src.isObjectGrowing());
        dest.setServiceCompany(src.getServiceCompany());
        dest.setRunNumber(src.getRunNumber());
        dest.setBhaRunNumber(src.getBhaRunNumber());
        dest.setPass(src.getPass());
        dest.setUidWell(src.getUidWell());
        dest.setUidWellbore(src.getUidWellbore());
        dest.setUid(src.getUid());
        dest.setCreationDate(src.getCreationDate());
        dest.setDescription(src.getDescription());
        dest.setNullValue(src.getNullValue());
        dest.setStartDateTimeIndex(src.getStartDateTimeIndex());
        dest.setEndDateTimeIndex(src.getEndDateTimeIndex());

        // check complex fields
        // indexType
        if (null != src.getIndexType())
            assertEquals(src.getIndexType().value(), dest.getIndexType().value());

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
            assertEquals(src.getDirection().value(), dest.getDirection().value());

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
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
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

        // logParam
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
                    assertEquals(srcInfo.getTraceState().value(), destInfo.getTraceState().value());

                // traceOrigin
                if (null != srcInfo.getTraceOrigin())
                    assertEquals(srcInfo.getTraceOrigin().value(), destInfo.getTraceOrigin().value());

                // typeLogData
                if (null != srcInfo.getTypeLogData())
                    assertEquals(srcInfo.getTypeLogData().value(), destInfo.getTypeLogData().value());

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

    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v20.Log src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v20.Log convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjLog src) {
        return null;
    }

    public static com.hashmapinc.tempus.WitsmlObjects.v20.Log convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjLog src) {
        return null;
    }
    //=========================================================================
}
