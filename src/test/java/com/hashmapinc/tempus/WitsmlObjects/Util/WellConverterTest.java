package com.hashmapinc.tempus.WitsmlObjects.Util;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WellConverterTest {
    @Test
    public void shouldConvert1311to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("well_converter/well1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell.class)).getWell().get(0);

        // get converted wellbore
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell dest = WellConverter.convertTo1411(src);

        // check equality for non repeating fields
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.getNameLegal(), dest.getNameLegal());
        assertEquals(src.getNumLicense(), dest.getNumLicense());
        assertEquals(src.getNumGovt(), dest.getNumGovt());
        assertEquals(src.getDTimLicense(), dest.getDTimLicense());
        assertEquals(src.getField(), dest.getField());
        assertEquals(src.getCountry(), dest.getCountry());
        assertEquals(src.getState(), dest.getState());
        assertEquals(src.getCounty(), dest.getCounty());
        assertEquals(src.getRegion(), dest.getRegion());
        assertEquals(src.getDistrict(), dest.getDistrict());
        assertEquals(src.getBlock(), dest.getBlock());
        assertEquals(src.getTimeZone(), dest.getTimeZone());
        assertEquals(src.getOperator(), dest.getOperator());
        assertEquals(src.getOperatorDiv(), dest.getOperatorDiv());
        assertEquals(src.getPcInterest().getUom(), dest.getPcInterest().getUom());
        assertEquals(src.getPcInterest().getValue(), dest.getPcInterest().getValue());
        assertEquals(src.getNumAPI(), dest.getNumAPI());
        assertEquals(src.getStatusWell().value(), dest.getStatusWell().value());
        assertEquals(src.getPurposeWell().value(), dest.getPurposeWell().value());
        assertEquals(src.getFluidWell().value(), dest.getFluidWell().value());
        assertEquals(src.getDirectionWell().value(), dest.getDirectionWell().value());
        assertEquals(src.getDTimSpud(), dest.getDTimSpud());
        assertEquals(src.getDTimPa(), dest.getDTimPa());
        assertEquals(src.getWellheadElevation().getDatum(), dest.getWellheadElevation().getDatum());
        assertEquals(src.getWellheadElevation().getValue(), dest.getWellheadElevation().getValue());
        assertEquals(src.getWellheadElevation().getUom().value(), dest.getWellheadElevation().getUom().value());
        assertEquals(src.getWellDatum().size(), dest.getWellDatum().size());
        assertEquals(src.getGroundElevation().getDatum(), dest.getGroundElevation().getDatum());
        assertEquals(src.getGroundElevation().getUom().value(), dest.getGroundElevation().getUom().value());
        assertEquals(src.getGroundElevation().getValue(), dest.getGroundElevation().getValue());
        assertEquals(src.getWaterDepth().getUom().value(), dest.getWaterDepth().getUom());
        assertEquals(src.getWaterDepth().getValue(), dest.getWaterDepth().getValue());
        assertEquals(src.getWellLocation().size(), dest.getWellLocation().size());
        assertEquals(src.getReferencePoint().size(), dest.getReferencePoint().size());
        assertEquals(src.getWellCRS().size(), dest.getWellCRS().size());
        assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
        assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
        assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
        assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
        assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
    }

    @Test
    public void shouldConvert1411to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("well_converter/well1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class)).getWell().get(0);

        // get converted wellbore
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell dest = WellConverter.convertTo1311(src);

        // check equality for non repeating fields
        assertEquals(src.getName(), dest.getName());
        assertEquals(src.getNameLegal(), dest.getNameLegal());
        assertEquals(src.getNumLicense(), dest.getNumLicense());
        assertEquals(src.getNumGovt(), dest.getNumGovt());
        assertEquals(src.getDTimLicense(), dest.getDTimLicense());
        assertEquals(src.getField(), dest.getField());
        assertEquals(src.getCountry(), dest.getCountry());
        assertEquals(src.getState(), dest.getState());
        assertEquals(src.getCounty(), dest.getCounty());
        assertEquals(src.getRegion(), dest.getRegion());
        assertEquals(src.getDistrict(), dest.getDistrict());
        assertEquals(src.getBlock(), dest.getBlock());
        assertEquals(src.getTimeZone(), dest.getTimeZone());
        assertEquals(src.getOperator(), dest.getOperator());
        assertEquals(src.getOperatorDiv(), dest.getOperatorDiv());
        assertEquals(src.getPcInterest().getUom(), dest.getPcInterest().getUom());
        assertEquals(src.getPcInterest().getValue(), dest.getPcInterest().getValue());
        assertEquals(src.getNumAPI(), dest.getNumAPI());
        assertEquals(src.getStatusWell().value(), dest.getStatusWell().value());
        assertEquals(src.getPurposeWell().value(), dest.getPurposeWell().value());
        assertEquals(src.getFluidWell().value(), dest.getFluidWell().value());
        assertEquals(src.getDirectionWell().value(), dest.getDirectionWell().value());
        assertEquals(src.getDTimSpud(), dest.getDTimSpud());
        assertEquals(src.getDTimPa(), dest.getDTimPa());
        assertEquals(src.getWellheadElevation().getDatum(), dest.getWellheadElevation().getDatum());
        assertEquals(src.getWellheadElevation().getValue(), dest.getWellheadElevation().getValue());
        assertEquals(src.getWellheadElevation().getUom().value(), dest.getWellheadElevation().getUom().value());
        assertEquals(src.getWellDatum().size(), dest.getWellDatum().size());
        assertEquals(src.getGroundElevation().getDatum(), dest.getGroundElevation().getDatum());
        assertEquals(src.getGroundElevation().getUom().value(), dest.getGroundElevation().getUom().value());
        assertEquals(src.getGroundElevation().getValue(), dest.getGroundElevation().getValue());
        assertEquals(src.getWaterDepth().getUom(), dest.getWaterDepth().getUom().value());
        assertEquals(src.getWaterDepth().getValue(), dest.getWaterDepth().getValue());
        assertEquals(src.getWellLocation().size(), dest.getWellLocation().size());
        assertEquals(src.getReferencePoint().size(), dest.getReferencePoint().size());
        assertEquals(src.getWellCRS().size(), dest.getWellCRS().size());
        assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
        assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
        assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
        assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
        assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
    }
}
