package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.List;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WellConverterTest {
    @Test
    public void shouldConvert1311to1411() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("well_converter/well1311.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell src = ((com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWells)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell.class)).getWell().get(0);

        // get converted well
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
        assertEquals(src.getNumAPI(), dest.getNumAPI());
        assertEquals(src.getDTimSpud(), dest.getDTimSpud());
        assertEquals(src.getDTimPa(), dest.getDTimPa());


        // check equality for complex fields
        if (null != src.getPcInterest()) {
            assertEquals(src.getPcInterest().getUom(), dest.getPcInterest().getUom());
            assertEquals(src.getPcInterest().getValue(), dest.getPcInterest().getValue());
        }

        if (null != src.getStatusWell())
            assertEquals(src.getStatusWell(), dest.getStatusWell());
        if (null != src.getPurposeWell())
            assertEquals(src.getPurposeWell(), dest.getPurposeWell());

        if (null != src.getFluidWell())
            assertEquals(src.getFluidWell(), dest.getFluidWell());

        if (null != src.getDirectionWell())
            assertEquals(src.getDirectionWell(), dest.getDirectionWell());

        if (null != src.getWellheadElevation()) {
            assertEquals(src.getWellheadElevation().getDatum(), dest.getWellheadElevation().getDatum());
            assertEquals(src.getWellheadElevation().getValue(), dest.getWellheadElevation().getValue());
            assertEquals(src.getWellheadElevation().getUom(), dest.getWellheadElevation().getUom());
        }

        if (null != src.getGroundElevation()) {
            assertEquals(src.getGroundElevation().getDatum(), dest.getGroundElevation().getDatum());
            assertEquals(src.getGroundElevation().getUom(), dest.getGroundElevation().getUom());
            assertEquals(src.getGroundElevation().getValue(), dest.getGroundElevation().getValue());
        }

        if (null != src.getWaterDepth()) {
            assertEquals(src.getWaterDepth().getUom(), dest.getWaterDepth().getUom());
            assertEquals(src.getWaterDepth().getValue(), dest.getWaterDepth().getValue());
        }

        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }


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
                    assertEquals(srcWellDatum.get(i).getElevation().getUom(), destWellDatum.get(i).getElevation().getUom());
                    assertEquals(srcWellDatum.get(i).getElevation().getValue(), destWellDatum.get(i).getElevation().getValue());
                }

                // measured depth
                if (null != srcWellDatum.get(i).getMeasuredDepth()) {
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getDatum(), destWellDatum.get(i).getMeasuredDepth().getDatum());
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getUom(), destWellDatum.get(i).getMeasuredDepth().getUom());
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
                    assertEquals(srcWellLoc.get(i).getLongitude().getUom(), destWellLoc.get(i).getLongitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLongitude().getValue(), destWellLoc.get(i).getLongitude().getValue());
                }

                // easting
                if (null != srcWellLoc.get(i).getEasting()) {
                    assertEquals(srcWellLoc.get(i).getEasting().getUom(), destWellLoc.get(i).getEasting().getUom());
                    assertEquals(srcWellLoc.get(i).getEasting().getValue(), destWellLoc.get(i).getEasting().getValue());
                }

                // northing
                if (null != srcWellLoc.get(i).getNorthing()) {
                    assertEquals(srcWellLoc.get(i).getNorthing().getUom(), destWellLoc.get(i).getNorthing().getUom());
                    assertEquals(srcWellLoc.get(i).getNorthing().getValue(), destWellLoc.get(i).getNorthing().getValue());
                }

                // westing
                if (null != srcWellLoc.get(i).getWesting()) {
                    assertEquals(srcWellLoc.get(i).getWesting().getUom(), destWellLoc.get(i).getWesting().getUom());
                    assertEquals(srcWellLoc.get(i).getWesting().getValue(), destWellLoc.get(i).getWesting().getValue());
                }

                // southing
                if (null != srcWellLoc.get(i).getSouthing()) {
                    assertEquals(srcWellLoc.get(i).getSouthing().getUom(), destWellLoc.get(i).getSouthing().getUom());
                    assertEquals(srcWellLoc.get(i).getSouthing().getValue(), destWellLoc.get(i).getSouthing().getValue());
                }

                // projectedX
                if (null != srcWellLoc.get(i).getProjectedX()) {
                    assertEquals(srcWellLoc.get(i).getProjectedX().getUom(), destWellLoc.get(i).getProjectedX().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedX().getValue(), destWellLoc.get(i).getProjectedX().getValue());
                }

                // projectedY
                if (null != srcWellLoc.get(i).getProjectedY()) {
                    assertEquals(srcWellLoc.get(i).getProjectedY().getUom(), destWellLoc.get(i).getProjectedY().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedY().getValue(), destWellLoc.get(i).getProjectedY().getValue());
                }

                // localX
                if (null != srcWellLoc.get(i).getLocalX()) {
                    assertEquals(srcWellLoc.get(i).getLocalX().getUom(), destWellLoc.get(i).getLocalX().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalX().getValue(), destWellLoc.get(i).getLocalX().getValue());
                }

                // localY
                if (null != srcWellLoc.get(i).getLocalY()) {
                    assertEquals(srcWellLoc.get(i).getLocalY().getUom(), destWellLoc.get(i).getLocalY().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalY().getValue(), destWellLoc.get(i).getLocalY().getValue());
                }

                assertEquals(srcWellLoc.get(i).isOriginal(), destWellLoc.get(i).isOriginal());
                assertEquals(srcWellLoc.get(i).getDescription(), destWellLoc.get(i).getDescription());
                assertEquals(srcWellLoc.get(i).getUid(), destWellLoc.get(i).getUid());
            }
        }

        // referencePoint
        if (null != src.getReferencePoint()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsReferencePoint> srcRefPoint = src.getReferencePoint();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsReferencePoint> destRefPoint = dest.getReferencePoint();
            for (int i = 0; i < srcRefPoint.size(); i++) {
                assertEquals(srcRefPoint.get(i).getName(), destRefPoint.get(i).getName());
                assertEquals(srcRefPoint.get(i).getType(), destRefPoint.get(i).getType());
                assertEquals(srcRefPoint.get(i).getDescription(), destRefPoint.get(i).getDescription());
                assertEquals(srcRefPoint.get(i).getUid(), destRefPoint.get(i).getUid());

                // elevation
                if (null != srcRefPoint.get(i).getElevation()) {
                    assertEquals(srcRefPoint.get(i).getElevation().getDatum(), destRefPoint.get(i).getElevation().getDatum());
                    assertEquals(srcRefPoint.get(i).getElevation().getUom(), destRefPoint.get(i).getElevation().getUom());
                    assertEquals(srcRefPoint.get(i).getElevation().getValue(), destRefPoint.get(i).getElevation().getValue());
                }

                // measuredDepth
                if (null != srcRefPoint.get(i).getMeasuredDepth()) {
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getDatum(), destRefPoint.get(i).getMeasuredDepth().getDatum());
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getUom(), destRefPoint.get(i).getMeasuredDepth().getUom());
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getValue(), destRefPoint.get(i).getMeasuredDepth().getValue());
                }

                // location
                if (null != srcRefPoint.get(i).getLocation()) {
                    List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> srcRefPointLocation = srcRefPoint.get(i).getLocation();
                    List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> destRefPointLocation = destRefPoint.get(i).getLocation();
                    for (int j = 0; j < srcRefPointLocation.size(); j++) {

                        // well crs
                        if (null != srcRefPointLocation.get(j).getWellCRS()) {
                            assertEquals(srcRefPointLocation.get(j).getWellCRS().getUidRef(), destRefPointLocation.get(j).getWellCRS().getUidRef());
                            assertEquals(srcRefPointLocation.get(j).getWellCRS().getValue(), destRefPointLocation.get(j).getWellCRS().getValue());
                        }

                        // latitude
                        if (null != srcRefPointLocation.get(j).getLatitude()) {
                            assertEquals(srcRefPointLocation.get(j).getLatitude().getUom(), destRefPointLocation.get(j).getLatitude().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLatitude().getValue(), destRefPointLocation.get(j).getLatitude().getValue());
                        }

                        // longitude
                        if (null != srcRefPointLocation.get(j).getLongitude()) {
                            assertEquals(srcRefPointLocation.get(j).getLongitude().getUom(), destRefPointLocation.get(j).getLongitude().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLongitude().getValue(), destRefPointLocation.get(j).getLongitude().getValue());
                        }

                        // easting
                        if (null != srcRefPointLocation.get(j).getEasting()) {
                            assertEquals(srcRefPointLocation.get(j).getEasting().getUom(), destRefPointLocation.get(j).getEasting().getUom());
                            assertEquals(srcRefPointLocation.get(j).getEasting().getValue(), destRefPointLocation.get(j).getEasting().getValue());
                        }

                        // northing
                        if (null != srcRefPointLocation.get(j).getNorthing()) {
                            assertEquals(srcRefPointLocation.get(j).getNorthing().getUom(), destRefPointLocation.get(j).getNorthing().getUom());
                            assertEquals(srcRefPointLocation.get(j).getNorthing().getValue(), destRefPointLocation.get(j).getNorthing().getValue());
                        }

                        // westing
                        if (null != srcRefPointLocation.get(j).getWesting()) {
                            assertEquals(srcRefPointLocation.get(j).getWesting().getUom(), destRefPointLocation.get(j).getWesting().getUom());
                            assertEquals(srcRefPointLocation.get(j).getWesting().getValue(), destRefPointLocation.get(j).getWesting().getValue());
                        }

                        // southing
                        if (null != srcRefPointLocation.get(j).getSouthing()) {
                            assertEquals(srcRefPointLocation.get(j).getSouthing().getUom(), destRefPointLocation.get(j).getSouthing().getUom());
                            assertEquals(srcRefPointLocation.get(j).getSouthing().getValue(), destRefPointLocation.get(j).getSouthing().getValue());
                        }

                        // projectedX
                        if (null != srcRefPointLocation.get(j).getProjectedX()) {
                            assertEquals(srcRefPointLocation.get(j).getProjectedX().getUom(), destRefPointLocation.get(j).getProjectedX().getUom());
                            assertEquals(srcRefPointLocation.get(j).getProjectedX().getValue(), destRefPointLocation.get(j).getProjectedX().getValue());
                        }

                        // projectedY
                        if (null != srcRefPointLocation.get(j).getProjectedY()) {
                            assertEquals(srcRefPointLocation.get(j).getProjectedY().getUom(), destRefPointLocation.get(j).getProjectedY().getUom());
                            assertEquals(srcRefPointLocation.get(j).getProjectedY().getValue(), destRefPointLocation.get(j).getProjectedY().getValue());
                        }

                        // localX
                        if (null != srcRefPointLocation.get(j).getLocalX()) {
                            assertEquals(srcRefPointLocation.get(j).getLocalX().getUom(), destRefPointLocation.get(j).getLocalX().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLocalX().getValue(), destRefPointLocation.get(j).getLocalX().getValue());
                        }

                        // localY
                        if (null != srcRefPointLocation.get(j).getLocalY()) {
                            assertEquals(srcRefPointLocation.get(j).getLocalY().getUom(), destRefPointLocation.get(j).getLocalY().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLocalY().getValue(), destRefPointLocation.get(j).getLocalY().getValue());
                        }

                        assertEquals(srcRefPointLocation.get(j).isOriginal(), destRefPointLocation.get(j).isOriginal());
                        assertEquals(srcRefPointLocation.get(j).getDescription(), destRefPointLocation.get(j).getDescription());
                        assertEquals(srcRefPointLocation.get(j).getUid(), destRefPointLocation.get(j).getUid());
                    }
                }
            }
        }

        // wellCRS
        if (null != src.getWellCRS()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellCRS> srcWellCRS = src.getWellCRS();
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS> destWellCRS = dest.getWellCRS();
            for (int i = 0; i < srcWellCRS.size(); i++) {
                assertEquals(srcWellCRS.get(i).getName(), destWellCRS.get(i).getName());
                assertEquals(srcWellCRS.get(i).getDescription(), destWellCRS.get(i).getDescription());
                assertEquals(srcWellCRS.get(i).getUid(), destWellCRS.get(i).getUid());

                // mapProjection
                if (null != srcWellCRS.get(i).getMapProjection()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getMapProjection().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getValue(), destWellCRS.get(i).getMapProjection().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem(), destWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getCode(), destWellCRS.get(i).getMapProjection().getNameCRS().getCode());
                    }

                    // projectionCode
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectionCode())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectionCode().value(), destWellCRS.get(i).getMapProjection().getProjectionCode().value());

                    // projectedFrom
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectedFrom()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getValue(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef());
                    }

                    // stdParallel1
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel1().getUom());
                    }

                    // stdParallel2
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel2().getUom());
                    }

                    // centralMeridian
                    if (null != srcWellCRS.get(i).getMapProjection().getCentralMeridian()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getValue(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getUom(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getUom());
                    }

                    // originLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getUom());
                    }

                    // originLongitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLongitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getUom());
                    }

                    // latitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getValue(), destWellCRS.get(i).getMapProjection().getLatitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getUom(), destWellCRS.get(i).getMapProjection().getLatitude1().getUom());
                    }

                    // longitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getValue(), destWellCRS.get(i).getMapProjection().getLongitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getUom(), destWellCRS.get(i).getMapProjection().getLongitude1().getUom());
                    }

                    // latitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getValue(), destWellCRS.get(i).getMapProjection().getLatitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getUom(), destWellCRS.get(i).getMapProjection().getLatitude2().getUom());
                    }

                    // longitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getValue(), destWellCRS.get(i).getMapProjection().getLongitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getUom(), destWellCRS.get(i).getMapProjection().getLongitude2().getUom());
                    }

                    // latitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom());
                    }

                    // longitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom());
                    }

                    // trueScaleLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom());
                    }

                    // spheroidRadius
                    if (null != srcWellCRS.get(i).getMapProjection().getSpheroidRadius()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getScaleFactor(), destWellCRS.get(i).getMapProjection().getScaleFactor());

                    // methodVariant
                    if (null != srcWellCRS.get(i).getMapProjection().getMethodVariant())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getMethodVariant().value(), destWellCRS.get(i).getMapProjection().getMethodVariant().value());

                    // perspectiveHeight
                    if (null != srcWellCRS.get(i).getMapProjection().getPerspectiveHeight()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getZone(), destWellCRS.get(i).getMapProjection().getZone());

                    // nadType
                    if (null != srcWellCRS.get(i).getMapProjection().getNADType())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNADType().value(), destWellCRS.get(i).getMapProjection().getNADType().value());

                    // falseEasting
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseEasting()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getValue(), destWellCRS.get(i).getMapProjection().getFalseEasting().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getUom(), destWellCRS.get(i).getMapProjection().getFalseEasting().getUom());
                    }

                    // falseNorthing
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseNorthing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getValue(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getUom(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getUom());
                    }

                    // bearing
                    if (null != srcWellCRS.get(i).getMapProjection().getBearing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getValue(), destWellCRS.get(i).getMapProjection().getBearing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getUom(), destWellCRS.get(i).getMapProjection().getBearing().getUom());
                    }

                    // hemisphere
                    if (null != srcWellCRS.get(i).getMapProjection().getHemisphere())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getHemisphere().value(), destWellCRS.get(i).getMapProjection().getHemisphere().value());

                    assertEquals(srcWellCRS.get(i).getMapProjection().getDescription(), destWellCRS.get(i).getMapProjection().getDescription());

                    // parameter
                    if (null != srcWellCRS.get(i).getMapProjection().getParameter()) {
                        List<com.hashmapinc.tempus.WitsmlObjects.v1311.IndexedObject> srcWellCRSParam = srcWellCRS.get(i).getMapProjection().getParameter();
                        List<com.hashmapinc.tempus.WitsmlObjects.v1411.IndexedObject> destWellCRSParam = destWellCRS.get(i).getMapProjection().getParameter();
                        for (int j = 0; j < srcWellCRSParam.size(); j++) {
                            assertEquals(srcWellCRSParam.get(j).getValue(), destWellCRSParam.get(j).getValue());
                            assertEquals(srcWellCRSParam.get(j).getIndex(), destWellCRSParam.get(j).getIndex());
                            assertEquals(srcWellCRSParam.get(j).getName(), destWellCRSParam.get(j).getName());
                            assertEquals(srcWellCRSParam.get(j).getUom(), destWellCRSParam.get(j).getUom());
                            assertEquals(srcWellCRSParam.get(j).getDescription(), destWellCRSParam.get(j).getDescription());
                        }
                    }
                }

                // geographic
                if (null != srcWellCRS.get(i).getGeographic()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getGeographic().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getValue(), destWellCRS.get(i).getGeographic().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem(), destWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getCode(), destWellCRS.get(i).getGeographic().getNameCRS().getCode());
                    }

                    // geodeticDatumCode
                    if (null != srcWellCRS.get(i).getGeographic().getGeodeticDatumCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getGeodeticDatumCode().value(), destWellCRS.get(i).getGeographic().getGeodeticDatumCode().value());

                    // xTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getXTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getUom(), destWellCRS.get(i).getGeographic().getXTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getValue(), destWellCRS.get(i).getGeographic().getXTranslation().getValue());
                    }

                    // yTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getYTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getUom(), destWellCRS.get(i).getGeographic().getYTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getValue(), destWellCRS.get(i).getGeographic().getYTranslation().getValue());
                    }

                    // zTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getZTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getUom(), destWellCRS.get(i).getGeographic().getZTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getValue(), destWellCRS.get(i).getGeographic().getZTranslation().getValue());
                    }

                    // xRotation
                    if (null != srcWellCRS.get(i).getGeographic().getXRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getUom(), destWellCRS.get(i).getGeographic().getXRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getValue(), destWellCRS.get(i).getGeographic().getXRotation().getValue());
                    }

                    // yRotation
                    if (null != srcWellCRS.get(i).getGeographic().getYRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getUom(), destWellCRS.get(i).getGeographic().getYRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getValue(), destWellCRS.get(i).getGeographic().getYRotation().getValue());
                    }

                    // zRotation
                    if (null != srcWellCRS.get(i).getGeographic().getZRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getUom(), destWellCRS.get(i).getGeographic().getZRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getValue(), destWellCRS.get(i).getGeographic().getZRotation().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getScaleFactor(), destWellCRS.get(i).getGeographic().getScaleFactor());

                    // ellipsoidCode
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidCode().value(), destWellCRS.get(i).getGeographic().getEllipsoidCode().value());

                    // ellipsoidSemiMajorAxis
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening(), destWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening());
                }

                // localCRS
                if (null != srcWellCRS.get(i).getLocalCRS()) {
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin(), destWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin());

                    // origin
                    if (null != srcWellCRS.get(i).getLocalCRS().getOrigin()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getUidRef(), destWellCRS.get(i).getLocalCRS().getOrigin().getUidRef());
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getValue(), destWellCRS.get(i).getLocalCRS().getOrigin().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getOriginDescription(), destWellCRS.get(i).getLocalCRS().getOriginDescription());

                    // yAxisAzimuth
                    if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom());

                        // northDirection
                        if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection())
                            assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisDescription(), destWellCRS.get(i).getLocalCRS().getYAxisDescription());
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise(), destWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise());
                }
            }
        }
    }

    @Test
    public void shouldConvert1411to1311() throws Exception {
        String srcXML = TestUtilities.getResourceAsString("well_converter/well1411.xml");
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell src = ((com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWells)WitsmlMarshal.deserialize(srcXML, com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWell.class)).getWell().get(0);

        // get converted well
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWell dest = WellConverter.convertTo1311(src);

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
        assertEquals(src.getNumAPI(), dest.getNumAPI());
        assertEquals(src.getDTimSpud(), dest.getDTimSpud());
        assertEquals(src.getDTimPa(), dest.getDTimPa());


        // check equality for complex fields
        if (null != src.getPcInterest()) {
            assertEquals(src.getPcInterest().getUom(), dest.getPcInterest().getUom());
            assertEquals(src.getPcInterest().getValue(), dest.getPcInterest().getValue());
        }

        if (null != src.getStatusWell())
            assertEquals(src.getStatusWell(), dest.getStatusWell());
        if (null != src.getPurposeWell())
            assertEquals(src.getPurposeWell(), dest.getPurposeWell());

        if (null != src.getFluidWell())
            assertEquals(src.getFluidWell(), dest.getFluidWell());

        if (null != src.getDirectionWell())
            assertEquals(src.getDirectionWell(), dest.getDirectionWell());

        if (null != src.getWellheadElevation()) {
            assertEquals(src.getWellheadElevation().getDatum(), dest.getWellheadElevation().getDatum());
            assertEquals(src.getWellheadElevation().getValue(), dest.getWellheadElevation().getValue());
            assertEquals(src.getWellheadElevation().getUom(), dest.getWellheadElevation().getUom());
        }

        if (null != src.getGroundElevation()) {
            assertEquals(src.getGroundElevation().getDatum(), dest.getGroundElevation().getDatum());
            assertEquals(src.getGroundElevation().getUom(), dest.getGroundElevation().getUom());
            assertEquals(src.getGroundElevation().getValue(), dest.getGroundElevation().getValue());
        }

        if (null != src.getWaterDepth()) {
            assertEquals(src.getWaterDepth().getUom(), dest.getWaterDepth().getUom());
            assertEquals(src.getWaterDepth().getValue(), dest.getWaterDepth().getValue());
        }

        if (null != src.getCommonData()) {
            assertEquals(src.getCommonData().getSourceName(), dest.getCommonData().getSourceName());
            assertEquals(src.getCommonData().getDTimCreation(), dest.getCommonData().getDTimCreation());
            assertEquals(src.getCommonData().getDTimLastChange(), dest.getCommonData().getDTimLastChange());
            assertEquals(src.getCommonData().getItemState().value(), dest.getCommonData().getItemState().value());
            assertEquals(src.getCommonData().getComments(), dest.getCommonData().getComments());
        }


        // check equality for repeating fields
        // well datum
        if (null != src.getWellDatum()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellDatum> srcWellDatum = src.getWellDatum();
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellDatum> destWellDatum = dest.getWellDatum();
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
                    assertEquals(srcWellDatum.get(i).getElevation().getUom(), destWellDatum.get(i).getElevation().getUom());
                    assertEquals(srcWellDatum.get(i).getElevation().getValue(), destWellDatum.get(i).getElevation().getValue());
                }

                // measured depth
                if (null != srcWellDatum.get(i).getMeasuredDepth()) {
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getDatum(), destWellDatum.get(i).getMeasuredDepth().getDatum());
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getUom(), destWellDatum.get(i).getMeasuredDepth().getUom());
                    assertEquals(srcWellDatum.get(i).getMeasuredDepth().getValue(), destWellDatum.get(i).getMeasuredDepth().getValue());
                }
            }
        }

        // wellLocation
        if (null != src.getWellLocation()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> srcWellLoc = src.getWellLocation();
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> destWellLoc = dest.getWellLocation();
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
                    assertEquals(srcWellLoc.get(i).getLongitude().getUom(), destWellLoc.get(i).getLongitude().getUom());
                    assertEquals(srcWellLoc.get(i).getLongitude().getValue(), destWellLoc.get(i).getLongitude().getValue());
                }

                // easting
                if (null != srcWellLoc.get(i).getEasting()) {
                    assertEquals(srcWellLoc.get(i).getEasting().getUom(), destWellLoc.get(i).getEasting().getUom());
                    assertEquals(srcWellLoc.get(i).getEasting().getValue(), destWellLoc.get(i).getEasting().getValue());
                }

                // northing
                if (null != srcWellLoc.get(i).getNorthing()) {
                    assertEquals(srcWellLoc.get(i).getNorthing().getUom(), destWellLoc.get(i).getNorthing().getUom());
                    assertEquals(srcWellLoc.get(i).getNorthing().getValue(), destWellLoc.get(i).getNorthing().getValue());
                }

                // westing
                if (null != srcWellLoc.get(i).getWesting()) {
                    assertEquals(srcWellLoc.get(i).getWesting().getUom(), destWellLoc.get(i).getWesting().getUom());
                    assertEquals(srcWellLoc.get(i).getWesting().getValue(), destWellLoc.get(i).getWesting().getValue());
                }

                // southing
                if (null != srcWellLoc.get(i).getSouthing()) {
                    assertEquals(srcWellLoc.get(i).getSouthing().getUom(), destWellLoc.get(i).getSouthing().getUom());
                    assertEquals(srcWellLoc.get(i).getSouthing().getValue(), destWellLoc.get(i).getSouthing().getValue());
                }

                // projectedX
                if (null != srcWellLoc.get(i).getProjectedX()) {
                    assertEquals(srcWellLoc.get(i).getProjectedX().getUom(), destWellLoc.get(i).getProjectedX().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedX().getValue(), destWellLoc.get(i).getProjectedX().getValue());
                }

                // projectedY
                if (null != srcWellLoc.get(i).getProjectedY()) {
                    assertEquals(srcWellLoc.get(i).getProjectedY().getUom(), destWellLoc.get(i).getProjectedY().getUom());
                    assertEquals(srcWellLoc.get(i).getProjectedY().getValue(), destWellLoc.get(i).getProjectedY().getValue());
                }

                // localX
                if (null != srcWellLoc.get(i).getLocalX()) {
                    assertEquals(srcWellLoc.get(i).getLocalX().getUom(), destWellLoc.get(i).getLocalX().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalX().getValue(), destWellLoc.get(i).getLocalX().getValue());
                }

                // localY
                if (null != srcWellLoc.get(i).getLocalY()) {
                    assertEquals(srcWellLoc.get(i).getLocalY().getUom(), destWellLoc.get(i).getLocalY().getUom());
                    assertEquals(srcWellLoc.get(i).getLocalY().getValue(), destWellLoc.get(i).getLocalY().getValue());
                }

                assertEquals(srcWellLoc.get(i).isOriginal(), destWellLoc.get(i).isOriginal());
                assertEquals(srcWellLoc.get(i).getDescription(), destWellLoc.get(i).getDescription());
                assertEquals(srcWellLoc.get(i).getUid(), destWellLoc.get(i).getUid());
            }
        }

        // referencePoint
        if (null != src.getReferencePoint()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsReferencePoint> srcRefPoint = src.getReferencePoint();
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsReferencePoint> destRefPoint = dest.getReferencePoint();
            for (int i = 0; i < srcRefPoint.size(); i++) {
                assertEquals(srcRefPoint.get(i).getName(), destRefPoint.get(i).getName());
                assertEquals(srcRefPoint.get(i).getType(), destRefPoint.get(i).getType());
                assertEquals(srcRefPoint.get(i).getDescription(), destRefPoint.get(i).getDescription());
                assertEquals(srcRefPoint.get(i).getUid(), destRefPoint.get(i).getUid());

                // elevation
                if (null != srcRefPoint.get(i).getElevation()) {
                    assertEquals(srcRefPoint.get(i).getElevation().getDatum(), destRefPoint.get(i).getElevation().getDatum());
                    assertEquals(srcRefPoint.get(i).getElevation().getUom(), destRefPoint.get(i).getElevation().getUom());
                    assertEquals(srcRefPoint.get(i).getElevation().getValue(), destRefPoint.get(i).getElevation().getValue());
                }

                // measuredDepth
                if (null != srcRefPoint.get(i).getMeasuredDepth()) {
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getDatum(), destRefPoint.get(i).getMeasuredDepth().getDatum());
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getUom(), destRefPoint.get(i).getMeasuredDepth().getUom());
                    assertEquals(srcRefPoint.get(i).getMeasuredDepth().getValue(), destRefPoint.get(i).getMeasuredDepth().getValue());
                }

                // location
                if (null != srcRefPoint.get(i).getLocation()) {
                    List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsLocation> srcRefPointLocation = srcRefPoint.get(i).getLocation();
                    List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsLocation> destRefPointLocation = destRefPoint.get(i).getLocation();
                    for (int j = 0; j < srcRefPointLocation.size(); j++) {

                        // well crs
                        if (null != srcRefPointLocation.get(j).getWellCRS()) {
                            assertEquals(srcRefPointLocation.get(j).getWellCRS().getUidRef(), destRefPointLocation.get(j).getWellCRS().getUidRef());
                            assertEquals(srcRefPointLocation.get(j).getWellCRS().getValue(), destRefPointLocation.get(j).getWellCRS().getValue());
                        }

                        // latitude
                        if (null != srcRefPointLocation.get(j).getLatitude()) {
                            assertEquals(srcRefPointLocation.get(j).getLatitude().getUom(), destRefPointLocation.get(j).getLatitude().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLatitude().getValue(), destRefPointLocation.get(j).getLatitude().getValue());
                        }

                        // longitude
                        if (null != srcRefPointLocation.get(j).getLongitude()) {
                            assertEquals(srcRefPointLocation.get(j).getLongitude().getUom(), destRefPointLocation.get(j).getLongitude().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLongitude().getValue(), destRefPointLocation.get(j).getLongitude().getValue());
                        }

                        // easting
                        if (null != srcRefPointLocation.get(j).getEasting()) {
                            assertEquals(srcRefPointLocation.get(j).getEasting().getUom(), destRefPointLocation.get(j).getEasting().getUom());
                            assertEquals(srcRefPointLocation.get(j).getEasting().getValue(), destRefPointLocation.get(j).getEasting().getValue());
                        }

                        // northing
                        if (null != srcRefPointLocation.get(j).getNorthing()) {
                            assertEquals(srcRefPointLocation.get(j).getNorthing().getUom(), destRefPointLocation.get(j).getNorthing().getUom());
                            assertEquals(srcRefPointLocation.get(j).getNorthing().getValue(), destRefPointLocation.get(j).getNorthing().getValue());
                        }

                        // westing
                        if (null != srcRefPointLocation.get(j).getWesting()) {
                            assertEquals(srcRefPointLocation.get(j).getWesting().getUom(), destRefPointLocation.get(j).getWesting().getUom());
                            assertEquals(srcRefPointLocation.get(j).getWesting().getValue(), destRefPointLocation.get(j).getWesting().getValue());
                        }

                        // southing
                        if (null != srcRefPointLocation.get(j).getSouthing()) {
                            assertEquals(srcRefPointLocation.get(j).getSouthing().getUom(), destRefPointLocation.get(j).getSouthing().getUom());
                            assertEquals(srcRefPointLocation.get(j).getSouthing().getValue(), destRefPointLocation.get(j).getSouthing().getValue());
                        }

                        // projectedX
                        if (null != srcRefPointLocation.get(j).getProjectedX()) {
                            assertEquals(srcRefPointLocation.get(j).getProjectedX().getUom(), destRefPointLocation.get(j).getProjectedX().getUom());
                            assertEquals(srcRefPointLocation.get(j).getProjectedX().getValue(), destRefPointLocation.get(j).getProjectedX().getValue());
                        }

                        // projectedY
                        if (null != srcRefPointLocation.get(j).getProjectedY()) {
                            assertEquals(srcRefPointLocation.get(j).getProjectedY().getUom(), destRefPointLocation.get(j).getProjectedY().getUom());
                            assertEquals(srcRefPointLocation.get(j).getProjectedY().getValue(), destRefPointLocation.get(j).getProjectedY().getValue());
                        }

                        // localX
                        if (null != srcRefPointLocation.get(j).getLocalX()) {
                            assertEquals(srcRefPointLocation.get(j).getLocalX().getUom(), destRefPointLocation.get(j).getLocalX().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLocalX().getValue(), destRefPointLocation.get(j).getLocalX().getValue());
                        }

                        // localY
                        if (null != srcRefPointLocation.get(j).getLocalY()) {
                            assertEquals(srcRefPointLocation.get(j).getLocalY().getUom(), destRefPointLocation.get(j).getLocalY().getUom());
                            assertEquals(srcRefPointLocation.get(j).getLocalY().getValue(), destRefPointLocation.get(j).getLocalY().getValue());
                        }

                        assertEquals(srcRefPointLocation.get(j).isOriginal(), destRefPointLocation.get(j).isOriginal());
                        assertEquals(srcRefPointLocation.get(j).getDescription(), destRefPointLocation.get(j).getDescription());
                        assertEquals(srcRefPointLocation.get(j).getUid(), destRefPointLocation.get(j).getUid());
                    }
                }
            }
        }

        // wellCRS
        if (null != src.getWellCRS()) {
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsWellCRS> srcWellCRS = src.getWellCRS();
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsWellCRS> destWellCRS = dest.getWellCRS();
            for (int i = 0; i < srcWellCRS.size(); i++) {
                assertEquals(srcWellCRS.get(i).getName(), destWellCRS.get(i).getName());
                assertEquals(srcWellCRS.get(i).getDescription(), destWellCRS.get(i).getDescription());
                assertEquals(srcWellCRS.get(i).getUid(), destWellCRS.get(i).getUid());

                // mapProjection
                if (null != srcWellCRS.get(i).getMapProjection()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getMapProjection().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getValue(), destWellCRS.get(i).getMapProjection().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem(), destWellCRS.get(i).getMapProjection().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNameCRS().getCode(), destWellCRS.get(i).getMapProjection().getNameCRS().getCode());
                    }

                    // projectionCode
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectionCode())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectionCode().value(), destWellCRS.get(i).getMapProjection().getProjectionCode().value());

                    // projectedFrom
                    if (null != srcWellCRS.get(i).getMapProjection().getProjectedFrom()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getValue(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef(), destWellCRS.get(i).getMapProjection().getProjectedFrom().getUidRef());
                    }

                    // stdParallel1
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel1().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel1().getUom());
                    }

                    // stdParallel2
                    if (null != srcWellCRS.get(i).getMapProjection().getStdParallel2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getValue(), destWellCRS.get(i).getMapProjection().getStdParallel2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getStdParallel2().getUom(), destWellCRS.get(i).getMapProjection().getStdParallel2().getUom());
                    }

                    // centralMeridian
                    if (null != srcWellCRS.get(i).getMapProjection().getCentralMeridian()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getValue(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getCentralMeridian().getUom(), destWellCRS.get(i).getMapProjection().getCentralMeridian().getUom());
                    }

                    // originLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLatitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLatitude().getUom());
                    }

                    // originLongitude
                    if (null != srcWellCRS.get(i).getMapProjection().getOriginLongitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getValue(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getOriginLongitude().getUom(), destWellCRS.get(i).getMapProjection().getOriginLongitude().getUom());
                    }

                    // latitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getValue(), destWellCRS.get(i).getMapProjection().getLatitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude1().getUom(), destWellCRS.get(i).getMapProjection().getLatitude1().getUom());
                    }

                    // longitude1
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude1()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getValue(), destWellCRS.get(i).getMapProjection().getLongitude1().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude1().getUom(), destWellCRS.get(i).getMapProjection().getLongitude1().getUom());
                    }

                    // latitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getValue(), destWellCRS.get(i).getMapProjection().getLatitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitude2().getUom(), destWellCRS.get(i).getMapProjection().getLatitude2().getUom());
                    }

                    // longitude2
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitude2()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getValue(), destWellCRS.get(i).getMapProjection().getLongitude2().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitude2().getUom(), destWellCRS.get(i).getMapProjection().getLongitude2().getUom());
                    }

                    // latitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLatitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLatitudeForScale().getUom());
                    }

                    // longitudeForScale
                    if (null != srcWellCRS.get(i).getMapProjection().getLongitudeForScale()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom(), destWellCRS.get(i).getMapProjection().getLongitudeForScale().getUom());
                    }

                    // trueScaleLatitude
                    if (null != srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom(), destWellCRS.get(i).getMapProjection().getTrueScaleLatitude().getUom());
                    }

                    // spheroidRadius
                    if (null != srcWellCRS.get(i).getMapProjection().getSpheroidRadius()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom(), destWellCRS.get(i).getMapProjection().getSpheroidRadius().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getScaleFactor(), destWellCRS.get(i).getMapProjection().getScaleFactor());

                    // methodVariant
                    if (null != srcWellCRS.get(i).getMapProjection().getMethodVariant())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getMethodVariant().value(), destWellCRS.get(i).getMapProjection().getMethodVariant().value());

                    // perspectiveHeight
                    if (null != srcWellCRS.get(i).getMapProjection().getPerspectiveHeight()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom(), destWellCRS.get(i).getMapProjection().getPerspectiveHeight().getUom());
                    }

                    assertEquals(srcWellCRS.get(i).getMapProjection().getZone(), destWellCRS.get(i).getMapProjection().getZone());

                    // nadType
                    if (null != srcWellCRS.get(i).getMapProjection().getNADType())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getNADType().value(), destWellCRS.get(i).getMapProjection().getNADType().value());

                    // falseEasting
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseEasting()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getValue(), destWellCRS.get(i).getMapProjection().getFalseEasting().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseEasting().getUom(), destWellCRS.get(i).getMapProjection().getFalseEasting().getUom());
                    }

                    // falseNorthing
                    if (null != srcWellCRS.get(i).getMapProjection().getFalseNorthing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getValue(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getFalseNorthing().getUom(), destWellCRS.get(i).getMapProjection().getFalseNorthing().getUom());
                    }

                    // bearing
                    if (null != srcWellCRS.get(i).getMapProjection().getBearing()) {
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getValue(), destWellCRS.get(i).getMapProjection().getBearing().getValue());
                        assertEquals(srcWellCRS.get(i).getMapProjection().getBearing().getUom(), destWellCRS.get(i).getMapProjection().getBearing().getUom());
                    }

                    // hemisphere
                    if (null != srcWellCRS.get(i).getMapProjection().getHemisphere())
                        assertEquals(srcWellCRS.get(i).getMapProjection().getHemisphere().value(), destWellCRS.get(i).getMapProjection().getHemisphere().value());

                    assertEquals(srcWellCRS.get(i).getMapProjection().getDescription(), destWellCRS.get(i).getMapProjection().getDescription());

                    // parameter
                    if (null != srcWellCRS.get(i).getMapProjection().getParameter()) {
                        List<com.hashmapinc.tempus.WitsmlObjects.v1411.IndexedObject> srcWellCRSParam = srcWellCRS.get(i).getMapProjection().getParameter();
                        List<com.hashmapinc.tempus.WitsmlObjects.v1311.IndexedObject> destWellCRSParam = destWellCRS.get(i).getMapProjection().getParameter();
                        for (int j = 0; j < srcWellCRSParam.size(); j++) {
                            assertEquals(srcWellCRSParam.get(j).getValue(), destWellCRSParam.get(j).getValue());
                            assertEquals(srcWellCRSParam.get(j).getIndex(), destWellCRSParam.get(j).getIndex());
                            assertEquals(srcWellCRSParam.get(j).getName(), destWellCRSParam.get(j).getName());
                            assertEquals(srcWellCRSParam.get(j).getUom(), destWellCRSParam.get(j).getUom());
                            assertEquals(srcWellCRSParam.get(j).getDescription(), destWellCRSParam.get(j).getDescription());
                        }
                    }
                }

                // geographic
                if (null != srcWellCRS.get(i).getGeographic()) {
                    // nameCRS
                    if (null != srcWellCRS.get(i).getGeographic().getNameCRS()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getValue(), destWellCRS.get(i).getGeographic().getNameCRS().getValue());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem(), destWellCRS.get(i).getGeographic().getNameCRS().getNamingSystem());
                        assertEquals(srcWellCRS.get(i).getGeographic().getNameCRS().getCode(), destWellCRS.get(i).getGeographic().getNameCRS().getCode());
                    }

                    // geodeticDatumCode
                    if (null != srcWellCRS.get(i).getGeographic().getGeodeticDatumCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getGeodeticDatumCode().value(), destWellCRS.get(i).getGeographic().getGeodeticDatumCode().value());

                    // xTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getXTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getUom(), destWellCRS.get(i).getGeographic().getXTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXTranslation().getValue(), destWellCRS.get(i).getGeographic().getXTranslation().getValue());
                    }

                    // yTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getYTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getUom(), destWellCRS.get(i).getGeographic().getYTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYTranslation().getValue(), destWellCRS.get(i).getGeographic().getYTranslation().getValue());
                    }

                    // zTranslation
                    if (null != srcWellCRS.get(i).getGeographic().getZTranslation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getUom(), destWellCRS.get(i).getGeographic().getZTranslation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZTranslation().getValue(), destWellCRS.get(i).getGeographic().getZTranslation().getValue());
                    }

                    // xRotation
                    if (null != srcWellCRS.get(i).getGeographic().getXRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getUom(), destWellCRS.get(i).getGeographic().getXRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getXRotation().getValue(), destWellCRS.get(i).getGeographic().getXRotation().getValue());
                    }

                    // yRotation
                    if (null != srcWellCRS.get(i).getGeographic().getYRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getUom(), destWellCRS.get(i).getGeographic().getYRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getYRotation().getValue(), destWellCRS.get(i).getGeographic().getYRotation().getValue());
                    }

                    // zRotation
                    if (null != srcWellCRS.get(i).getGeographic().getZRotation()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getUom(), destWellCRS.get(i).getGeographic().getZRotation().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getZRotation().getValue(), destWellCRS.get(i).getGeographic().getZRotation().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getScaleFactor(), destWellCRS.get(i).getGeographic().getScaleFactor());

                    // ellipsoidCode
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidCode())
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidCode().value(), destWellCRS.get(i).getGeographic().getEllipsoidCode().value());

                    // ellipsoidSemiMajorAxis
                    if (null != srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis()) {
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getUom());
                        assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue(), destWellCRS.get(i).getGeographic().getEllipsoidSemiMajorAxis().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening(), destWellCRS.get(i).getGeographic().getEllipsoidInverseFlattening());
                }

                // localCRS
                if (null != srcWellCRS.get(i).getLocalCRS()) {
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin(), destWellCRS.get(i).getLocalCRS().isUsesWellAsOrigin());

                    // origin
                    if (null != srcWellCRS.get(i).getLocalCRS().getOrigin()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getUidRef(), destWellCRS.get(i).getLocalCRS().getOrigin().getUidRef());
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getOrigin().getValue(), destWellCRS.get(i).getLocalCRS().getOrigin().getValue());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getOriginDescription(), destWellCRS.get(i).getLocalCRS().getOriginDescription());

                    // yAxisAzimuth
                    if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth()) {
                        assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getUom());

                        // northDirection
                        if (null != srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection())
                            assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value(), destWellCRS.get(i).getLocalCRS().getYAxisAzimuth().getNorthDirection().value());
                    }

                    assertEquals(srcWellCRS.get(i).getLocalCRS().getYAxisDescription(), destWellCRS.get(i).getLocalCRS().getYAxisDescription());
                    assertEquals(srcWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise(), destWellCRS.get(i).getLocalCRS().isXRotationCounterClockwise());
                }
            }
        }
    }
}
