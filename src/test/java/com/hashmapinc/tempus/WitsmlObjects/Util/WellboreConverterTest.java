package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbore;
import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbores;
import com.hashmapinc.tempus.WitsmlObjects.v20.Wellbore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WellboreConverterTest {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    @Test
    public void shouldConvert1411to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore.class)).getWellbore().get(0);

        // get converted wellbore
        ObjWellbore dest = WellboreConverter.convertTo1311(src);

        // check fields
        assertEquals(src.getMd().getValue(), dest.getMdCurrent().getValue());
    }

    @Test
    public void shouldConvert20to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore20.xml");
        Wellbore src = WitsmlMarshal.deserialize(srcXML, Wellbore.class);

        // get converted wellbore
        ObjWellbore dest = WellboreConverter.convertTo1311(src);

        // check fields
        assertEquals(src.getMd().getValue(), dest.getMdCurrent().getValue());

    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    @Test
    public void shouldConvert1311to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore1311.xml");
        ObjWellbore src = ((ObjWellbores)WitsmlMarshal.deserialize(srcXML, ObjWellbore.class)).getWellbore().get(0);

        // get converted wellbore
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore dest = WellboreConverter.convertTo1411(src);

        // check fields
        assertEquals(src.getMdCurrent().getValue(), dest.getMd().getValue());
    }

    @Test
    public void shouldConvert20to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore20.xml");
        Wellbore src = WitsmlMarshal.deserialize(srcXML, Wellbore.class);

        // get converted wellbore
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore dest = WellboreConverter.convertTo1411(src);

        // check fields
        assertEquals(src.getMd().getValue(), dest.getMd().getValue());
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    @Test
    public void shouldConvert1311to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore1311.xml");
        ObjWellbore src = ((ObjWellbores)WitsmlMarshal.deserialize(srcXML, ObjWellbore.class)).getWellbore().get(0);

        // get converted wellbore
        Wellbore dest = WellboreConverter.convertTo20(src);

        // check fields
        assertEquals(src.getMdCurrent().getValue(), dest.getMd().getValue());
    }

    @Test
    public void shouldConvert1411to20() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("wellbore_converter/wellbore1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbores)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore.class)).getWellbore().get(0);

        // get converted wellbore
        Wellbore dest = WellboreConverter.convertTo20(src);

        // check fields
        assertEquals(src.getMd().getValue(), dest.getMd().getValue());
    }
    //=========================================================================
}
