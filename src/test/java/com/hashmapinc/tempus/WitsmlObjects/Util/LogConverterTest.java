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

        // check complex fields

        // check repeating fields

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
        private List<IndexedObject> logParam;
        private List<CsLogCurveInfo> logCurveInfo;

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
