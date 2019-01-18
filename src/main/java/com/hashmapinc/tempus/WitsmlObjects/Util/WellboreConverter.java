package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbore;
import com.hashmapinc.tempus.WitsmlObjects.v20.Wellbore;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This class converts wellbore singular
 * objects between 1.3.1.1, 1.4.1.1, and 2.0 objects.
 *
 * NOTE: fields are mapped with best effort conversions. Where
 * direct mapping is not possible, null values are provided (see uid/uuid mappings).
 * It is up to the user of this library to use field setters on converted objects to
 * create valid WITSML objects.
 */
public class WellboreConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    public static ObjWellbore convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore src) {
        ObjWellbore dest = new ObjWellbore();
        dest.setNameWell(src.getNameWell());
        dest.setName(src.getName());

        if (null != src.getParentWellbore()) {
            com.hashmapinc.tempus.WitsmlObjects.v1311.RefNameString parentWellbore = new com.hashmapinc.tempus.WitsmlObjects.v1311.RefNameString();
            parentWellbore.setValue(src.getParentWellbore().getValue());
            parentWellbore.setUidRef(src.getParentWellbore().getUidRef());
            dest.setParentWellbore(parentWellbore);
        }

        dest.setNumber(src.getNumber());
        dest.setSuffixAPI(src.getSuffixAPI());
        dest.setNumGovt(src.getNumGovt());

        if (null != src.getStatusWellbore())
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore())
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore())
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape())
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreShape.fromValue(src.getShape().value()));

        dest.setDTimKickoff(src.getDTimKickoff());
        dest.setAchievedTD(src.isAchievedTD());

        if (null != src.getMd())
            dest.setMdCurrent(src.getMd().to1311MeasuredDepthCoord());
        if (null != src.getTvd())
            dest.setTvdCurrent(src.getTvd().to1311VerticalDepthCoord());
        if (null != src.getMdKickoff())
            dest.setMdKickoff(src.getMdKickoff().to1311MeasuredDepthCoord());
        if (null != src.getTvdKickoff())
            dest.setTvdKickoff(src.getTvdKickoff().to1311VerticalDepthCoord());
        if (null != src.getMdPlanned());
            dest.setMdPlanned(src.getMdPlanned().to1311MeasuredDepthCoord());
        if (null != src.getTvdPlanned())
            dest.setTvdPlanned(src.getTvdPlanned().to1311VerticalDepthCoord());
        if (null != src.getMdSubSeaPlanned())
            dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1311MeasuredDepthCoord());
        if (null != src.getTvdSubSeaPlanned())
            dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned().to1311VerticalDepthCoord());

        if (null != src.getDayTarget()) {
            com.hashmapinc.tempus.WitsmlObjects.v1311.TimeMeasure dayTarget = new com.hashmapinc.tempus.WitsmlObjects.v1311.TimeMeasure();
            dayTarget.setUom(src.getDayTarget().getUom());
            dayTarget.setValue(src.getDayTarget().getValue());
            dest.setDayTarget(dayTarget);
        }

        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1311CommonData());
        if (null != src.getCustomData())
            dest.setCustomData(src.getCustomData().to1311CustomData());

        dest.setUidWell(src.getUidWell());
        dest.setUid(src.getUid());
        return dest;
    }

    public static ObjWellbore convertTo1311(Wellbore src) throws DatatypeConfigurationException {
        ObjWellbore dest = new ObjWellbore();

        // get well info
        if (null != src.getWell())
            dest.setNameWell(src.getWell().getTitle());

        dest.setNumber(src.getNumber());
        dest.setSuffixAPI(src.getSuffixAPI());
        dest.setNumGovt(src.getNumGovt());

        if (null != src.getStatusWellbore())
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore())
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore())
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape())
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreShape.fromValue(src.getShape().value()));

        // convert dtim string to object
        if (null != src.getDTimKickoff()) {
            XMLGregorianCalendar dtim = DatatypeFactory.newInstance().newXMLGregorianCalendar(src.getDTimKickoff());
            dest.setDTimKickoff(dtim);
        }

        dest.setAchievedTD(src.isAchievedTD());
        if(null != src.getMd())
            dest.setMdCurrent(src.getMd().to1311MeasuredDepthCoord());
        if(null != src.getTvd())
            dest.setTvdCurrent(src.getTvd().to1311VerticalDepthCoord());
        if(null != src.getMdKickoff())
            dest.setMdKickoff(src.getMdKickoff().to1311MeasuredDepthCoord());
        if(null != src.getTvdKickoff())
            dest.setTvdKickoff(src.getTvdKickoff().to1311VerticalDepthCoord());
        if(null != src.getMdPlanned())
            dest.setMdPlanned(src.getMdPlanned().to1311MeasuredDepthCoord());
        if(null != src.getTvdPlanned())
            dest.setTvdPlanned(src.getTvdPlanned().to1311VerticalDepthCoord());
        if(null != src.getMdSubSeaPlanned())
            dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1311MeasuredDepthCoord());
        if(null != src.getTvdSubSeaPlanned())
            dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned().to1311VerticalDepthCoord());

        if (null != src.getDayTarget()) {
            com.hashmapinc.tempus.WitsmlObjects.v1311.TimeMeasure dayTarget = new com.hashmapinc.tempus.WitsmlObjects.v1311.TimeMeasure();
            dayTarget.setUom(src.getDayTarget().getUom());
            dayTarget.setValue(src.getDayTarget().getValue());
            dest.setDayTarget(dayTarget);
        }


        // get custom data
        if(null != src.getCustomData()) {
            com.hashmapinc.tempus.WitsmlObjects.v1311.CsCustomData customData = new com.hashmapinc.tempus.WitsmlObjects.v1311.CsCustomData();
            customData.setAny(src.getCustomData().getAny());
            dest.setCustomData(customData);
        }
        return dest;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore convertTo1411(ObjWellbore src) {
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore();
        dest.setNameWell(src.getNameWell());
        dest.setName(src.getName());

        if (null != src.getParentWellbore()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString parentWellbore = new com.hashmapinc.tempus.WitsmlObjects.v1411.RefNameString();
            parentWellbore.setValue(src.getParentWellbore().getValue());
            parentWellbore.setUidRef(src.getParentWellbore().getUidRef());
            dest.setParentWellbore(parentWellbore);
        }

        dest.setNumber(src.getNumber());
        dest.setSuffixAPI(src.getSuffixAPI());
        dest.setNumGovt(src.getNumGovt());

        if (null != src.getStatusWellbore())
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore())
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore())
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape())
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreShape.fromValue(src.getShape().value()));

        dest.setDTimKickoff(src.getDTimKickoff());
        dest.setAchievedTD(src.isAchievedTD());

        if (null != src.getMdCurrent())
            dest.setMd(src.getMdCurrent().to1411MeasuredDepthCoord());
        if (null != src.getTvdCurrent())
            dest.setTvd(src.getTvdCurrent().to1411VerticalDepthCoord());
        if (null != src.getMdKickoff())
            dest.setMdKickoff(src.getMdKickoff().to1411MeasuredDepthCoord());
        if (null != src.getTvdKickoff())
            dest.setTvdKickoff(src.getTvdKickoff().to1411VerticalDepthCoord());
        if (null != src.getMdPlanned());
        dest.setMdPlanned(src.getMdPlanned().to1411MeasuredDepthCoord());
        if (null != src.getTvdPlanned())
            dest.setTvdPlanned(src.getTvdPlanned().to1411VerticalDepthCoord());
        if (null != src.getMdSubSeaPlanned())
            dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1411MeasuredDepthCoord());
        if (null != src.getTvdSubSeaPlanned())
            dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned().to1411VerticalDepthCoord());

        if (null != src.getDayTarget()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.TimeMeasure dayTarget = new com.hashmapinc.tempus.WitsmlObjects.v1411.TimeMeasure();
            dayTarget.setUom(src.getDayTarget().getUom());
            dayTarget.setValue(src.getDayTarget().getValue());
            dest.setDayTarget(dayTarget);
        }

        if (null != src.getCommonData())
            dest.setCommonData(src.getCommonData().to1411CommonData());
        if (null != src.getCustomData())
            dest.setCustomData(src.getCustomData().to1411CustomData());

        dest.setUidWell(src.getUidWell());
        dest.setUid(src.getUid());
        return dest;
    }
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore convertTo1411(Wellbore src) throws DatatypeConfigurationException {
        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore dest = new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore();

        // get well info
        if (null != src.getWell())
            dest.setNameWell(src.getWell().getTitle());

        dest.setNumber(src.getNumber());
        dest.setSuffixAPI(src.getSuffixAPI());
        dest.setNumGovt(src.getNumGovt());

        if (null != src.getStatusWellbore())
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore())
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore())
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape())
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v1411.WellboreShape.fromValue(src.getShape().value()));

        // convert dtim string to object
        if (null != src.getDTimKickoff()) {
            XMLGregorianCalendar dtim = DatatypeFactory.newInstance().newXMLGregorianCalendar(src.getDTimKickoff());
            dest.setDTimKickoff(dtim);
        }

        dest.setAchievedTD(src.isAchievedTD());
        if(null != src.getMd())
            dest.setMd(src.getMd().to1411MeasuredDepthCoord());
        if(null != src.getTvd())
            dest.setTvd(src.getTvd().to1411VerticalDepthCoord());
        if(null != src.getMdKickoff())
            dest.setMdKickoff(src.getMdKickoff().to1411MeasuredDepthCoord());
        if(null != src.getTvdKickoff())
            dest.setTvdKickoff(src.getTvdKickoff().to1411VerticalDepthCoord());
        if(null != src.getMdPlanned())
            dest.setMdPlanned(src.getMdPlanned().to1411MeasuredDepthCoord());
        if(null != src.getTvdPlanned())
            dest.setTvdPlanned(src.getTvdPlanned().to1411VerticalDepthCoord());
        if(null != src.getMdSubSeaPlanned())
            dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1411MeasuredDepthCoord());
        if(null != src.getTvdSubSeaPlanned())
            dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned().to1411VerticalDepthCoord());

        if (null != src.getDayTarget()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.TimeMeasure dayTarget = new com.hashmapinc.tempus.WitsmlObjects.v1411.TimeMeasure();
            dayTarget.setUom(src.getDayTarget().getUom());
            dayTarget.setValue(src.getDayTarget().getValue());
            dest.setDayTarget(dayTarget);
        }

        // get custom data
        if(null != src.getCustomData()) {
            com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData customData = new com.hashmapinc.tempus.WitsmlObjects.v1411.CsCustomData();
            customData.setAny(src.getCustomData().getAny());
            dest.setCustomData(customData);
        }
        return dest;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static Wellbore convertTo20(ObjWellbore src) {
        return null;
    }
    public static Wellbore convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore src) {
        Wellbore dest = new Wellbore();

        dest.setNumber(src.getNumber());
        dest.setSuffixAPI(src.getSuffixAPI());
        dest.setNumGovt(src.getNumGovt());

        if (null != src.getStatusWellbore())
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v20.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore())
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v20.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore())
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v20.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape())
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v20.WellboreShape.fromValue(src.getShape().value()));
        if (null != src.getDTimKickoff())
            dest.setDTimKickoff(src.getDTimKickoff().toString());

        dest.setAchievedTD(src.isAchievedTD());

        if(null != src.getMd())
            dest.setMd(src.getMd().to20DepthCoord());
        if(null != src.getTvd())
            dest.setTvd(src.getTvd().to20DepthCoord());
        if(null != src.getMdKickoff())
            dest.setMdKickoff(src.getMdKickoff().to20DepthCoord());
        if(null != src.getTvdKickoff())
            dest.setTvdKickoff(src.getTvdKickoff().to20DepthCoord());
        if(null != src.getMdPlanned())
            dest.setMdPlanned(src.getMdPlanned().to20DepthCoord());
        if(null != src.getTvdPlanned())
            dest.setTvdPlanned(src.getTvdPlanned().to20DepthCoord());
        if(null != src.getMdSubSeaPlanned())
            dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to20DepthCoord());
        if(null != src.getTvdSubSeaPlanned())
            dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned().to20DepthCoord());

        if (null != src.getDayTarget()) {
            com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure dayTarget = new com.hashmapinc.tempus.WitsmlObjects.v20.DimensionlessMeasure();
            dayTarget.setUom(src.getDayTarget().getUom());
            dayTarget.setValue(src.getDayTarget().getValue());
            dest.setDayTarget(dayTarget);
        }

        // get custom data
        if(null != src.getCustomData()) {
            com.hashmapinc.tempus.WitsmlObjects.v20.CustomData customData = new com.hashmapinc.tempus.WitsmlObjects.v20.CustomData();
            customData.setAny(src.getCustomData().getAny());
            dest.setCustomData(customData);
        }
        return dest;
    }
    //=========================================================================
}
