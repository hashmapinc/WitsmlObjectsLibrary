package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.List;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WellConverterTest {
    @Test
    public void shouldConvert1311to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("well_converter/well1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell.class)).getWell().get(0);

        // get converted wellbore
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell dest = WellConverter.convertTo1411(src);

        // check equality for non complex, non repeating fields
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
        assertEquals(src.getGroundElevation().getDatum(), dest.getGroundElevation().getDatum());
        assertEquals(src.getGroundElevation().getUom().value(), dest.getGroundElevation().getUom().value());
        assertEquals(src.getGroundElevation().getValue(), dest.getGroundElevation().getValue());
        assertEquals(src.getWaterDepth().getUom().value(), dest.getWaterDepth().getUom());
        assertEquals(src.getWaterDepth().getValue(), dest.getWaterDepth().getValue());
        assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
        assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
        assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
        assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
        assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());


        // check equality for repeating fields
        // well datum
        if (null != src.getWellDatum()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellDatum> srcWellDatum = src.getWellDatum();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum> destWellDatum = dest.getWellDatum();
            assertEquals(srcWellDatum.size(), destWellDatum.size());
            for (int i = 0; i < srcWellDatum.size(); i++) {
                // non complex objects
                assertEquals(srcWellDatum.get(i).getName(), destWellDatum.get(i).getName());
                assertEquals(srcWellDatum.get(i).getKind(), destWellDatum.get(i).getKind());
                assertEquals(srcWellDatum.get(i).getComment(), destWellDatum.get(i).getComment());
                assertEquals(srcWellDatum.get(i).getUid(), destWellDatum.get(i).getUid());

                // code
                if (null != srcWellDatum.get(i).getCode())
                    assertEquals(srcWellDatum.get(i).getCode().value(), destWellDatum.get(i).getCode().value());

                // datum name
                if (null != srcWellDatum.get(i).getDatumName()) {
                    assertEquals(srcWellDatum.get(i).getDatumName().getCode(), destWellDatum.get(i).getDatumName().getCode());
                    assertEquals(srcWellDatum.get(i).getDatumName().getValue(), destWellDatum.get(i).getDatumName().getValue());
                    assertEquals(srcWellDatum.get(i).getDatumName().getNamingSystem(), destWellDatum.get(i).getDatumName().getNamingSystem());
                }

                // wellbore
                if (null != srcWellDatum.get(i).getWellbore()) {
                    if (null != srcWellDatum.get(i).getWellbore().getWellboreReference()) {
                        assertEquals(srcWellDatum.get(i).getWellbore().getWellboreReference().getUidRef(), destWellDatum.get(i).getWellbore().getWellboreReference().getUidRef());
                        assertEquals(srcWellDatum.get(i).getWellbore().getWellboreReference().getValue(), destWellDatum.get(i).getWellbore().getWellboreReference().getValue());
                    }
                    if (null != srcWellDatum.get(i).getWellbore().getWellParent()) {
                        assertEquals(srcWellDatum.get(i).getWellbore().getWellParent().getValue(), destWellDatum.get(i).getWellbore().getWellParent().getValue());
                        assertEquals(srcWellDatum.get(i).getWellbore().getWellParent().getUidRef(), destWellDatum.get(i).getWellbore().getWellParent().getUidRef());
                    }
                }

                // rig
                if (null != src.getWellDatum().get(i).getRig()) {
                    if (null != src.getWellDatum().get(i).getRig().getRigReference()) {
                        assertEquals(srcWellDatum.get(i).getRig().getRigReference().getUidRef(), destWellDatum.get(i).getRig().getRigReference().getUidRef());
                        assertEquals(srcWellDatum.get(i).getRig().getRigReference().getValue(), destWellDatum.get(i).getRig().getRigReference().getValue());
                    }
                    if (null != src.getWellDatum().get(i).getRig().getWellboreParent()) {
                        assertEquals(srcWellDatum.get(i).getRig().getWellboreParent().getUidRef(), destWellDatum.get(i).getRig().getWellboreParent().getUidRef());
                        assertEquals(srcWellDatum.get(i).getRig().getWellboreParent().getValue(), destWellDatum.get(i).getRig().getWellboreParent().getValue());
                    }
                    if (null != src.getWellDatum().get(i).getRig().getWellParent()) {
                        assertEquals(srcWellDatum.get(i).getRig().getWellParent().getUidRef(), destWellDatum.get(i).getRig().getWellParent().getUidRef());
                        assertEquals(srcWellDatum.get(i).getRig().getWellParent().getValue(), destWellDatum.get(i).getRig().getWellParent().getValue());
                    }
                }

                // elevation
                if (null != srcWellDatum.get(i).getElevation()) {
                    assertEquals(srcWellDatum.get(i).getElevation().getDatum(), destWellDatum.get(i).getElevation().getDatum());
                    assertEquals(srcWellDatum.get(i).getElevation().getUom().value(), destWellDatum.get(i).getElevation().getUom().value());
                    assertEquals(srcWellDatum.get(i).getElevation().getValue(), destWellDatum.get(i).getElevation().getValue());
                }

                // measured depth
                if (null != srcWellDatum.get(i).getMeasuredDepth()) {
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getDatum(), destWellDatum.get(i).getMeasuredDepth().getDatum());
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getUom().value(), destWellDatum.get(i).getMeasuredDepth().getUom().value());
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getValue(), destWellDatum.get(i).getMeasuredDepth().getValue());
                }
            }
        }

        // wellLocation
        if (null != src.getWellLocation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> srcWellLoc = src.getWellLocation();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> destWellLoc = dest.getWellLocation();
            for (int i = 0; i < srcWellLoc.size(); i++) {
                // well crs
                if (null != srcWellLoc.get(i).getWellCRS()) {
                    assertEquals(srcWellLoc.get(i).getWellCRS().getUidRef(), destWellLoc.get(i).getWellCRS().getUidRef());
                    assertEquals(srcWellLoc.get(i).getWellCRS().getValue(), destWellLoc.get(i).getWellCRS().getValue());
                }

                // latitude
                if (null != srcWellLoc.get(i).getLatitude()) {
                    assertEquals(srcWellLoc.get(i).getLatitude().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLatitude().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // longitude
                if (null != srcWellLoc.get(i).getLongitude()) {
                    assertEquals(srcWellLoc.get(i).getLongitude().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLongitude().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // easting
                if (null != srcWellLoc.get(i).getEasting()) {
                    assertEquals(srcWellLoc.get(i).getEasting().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getEasting().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // northing
                if (null != srcWellLoc.get(i).getNorthing()) {
                    assertEquals(srcWellLoc.get(i).getNorthing().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getNorthing().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // westing
                if (null != srcWellLoc.get(i).getWesting()) {
                    assertEquals(srcWellLoc.get(i).getWesting().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getWesting().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // southing
                if (null != srcWellLoc.get(i).getSouthing()) {
                    assertEquals(srcWellLoc.get(i).getSouthing().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getSouthing().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // projectedX
                if (null != srcWellLoc.get(i).getProjectedX()) {
                    assertEquals(srcWellLoc.get(i).getProjectedX().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedX().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // projectedY
                if (null != srcWellLoc.get(i).getProjectedY()) {
                    assertEquals(srcWellLoc.get(i).getProjectedY().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedY().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // localX
                if (null != srcWellLoc.get(i).getLocalX()) {
                    assertEquals(srcWellLoc.get(i).getLocalX().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalX().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                // localY
                if (null != srcWellLoc.get(i).getLocalY()) {
                    assertEquals(srcWellLoc.get(i).getLocalY().getUom(), destWellLoc.get(i).getLatitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalY().getValue(), destWellLoc.get(i).getLatitude().getValue());
                }

                assertEquals(srcWellLoc.get(i).isOriginal(), destWellLoc.get(i).isOriginal());
                assertEquals(srcWellLoc.get(i).getDescription(), destWellLoc.get(i).getDescription());
                assertEquals(srcWellLoc.get(i).getUid(), destWellLoc.get(i).getUid());
            }
        }


        // referencePoint

        // wellCRS
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
