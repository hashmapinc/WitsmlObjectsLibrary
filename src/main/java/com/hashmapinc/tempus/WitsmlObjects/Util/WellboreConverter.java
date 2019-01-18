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

        if (null != src.getStatusWellbore()) {
            dest.setStatusWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellStatus.fromValue(src.getStatusWellbore().value()));
        if (null != src.getPurposeWellbore()) {
            dest.setPurposeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellPurpose.fromValue(src.getPurposeWellbore().value()));
        if (null != src.getTypeWellbore()) {
            dest.setTypeWellbore(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreType.fromValue(src.getTypeWellbore().value()));
        if (null != src.getShape()) {
            dest.setShape(com.hashmapinc.tempus.WitsmlObjects.v1311.WellboreShape.fromValue(src.getShape().value()));

        dest.setDTimKickoff(src.getDTimKickoff());
        dest.setAchievedTD(src.isAchievedTD());

        if (null != src.getMd())

        dest.setMdCurrent(src.getMd().to1311MeasuredDepthCoord());
        dest.setTvdCurrent(src.getTvd());
        dest.setMdKickoff(src.getMdKickoff().to1311MeasuredDepthCoord());
        dest.setTvdKickoff(src.getTvdKickoff());
        dest.setMdPlanned(src.getMdPlanned().to1311MeasuredDepthCoord());
        dest.setTvdPlanned(src.getTvdPlanned());
        dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1311MeasuredDepthCoord());
        dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned());

        dest.setDayTarget(src.getDayTarget());
        dest.setCommonData(src.getCommonData());
        dest.setCustomData(src.getCustomData());
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
        dest.setStatusWellbore(src.getStatusWellbore());
        dest.setPurposeWellbore(src.getPurposeWellbore());
        dest.setTypeWellbore(src.getTypeWellbore());
        dest.setShape(src.getShape());

        // convert dtim string to object
        if (null != src.getDTimKickoff()) {// TODO: an adult should unit test the heck otu of this
            XMLGregorianCalendar dtim = DatatypeFactory.newInstance().newXMLGregorianCalendar(src.getDTimKickoff());
            dest.setDTimKickoff(dtim);
        }


        dest.setAchievedTD(src.isAchievedTD());
        dest.setMdCurrent(src.getMd().to1311MeasuredDepthCoord());
        dest.setTvdCurrent(src.getTvd());
        dest.setMdKickoff(src.getMdKickoff().to1311MeasuredDepthCoord());
        dest.setTvdKickoff(src.getTvdKickoff());
        dest.setMdPlanned(src.getMdPlanned().to1311MeasuredDepthCoord());
        dest.setTvdPlanned(src.getTvdPlanned());
        dest.setMdSubSeaPlanned(src.getMdSubSeaPlanned().to1311MeasuredDepthCoord());
        dest.setTvdSubSeaPlanned(src.getTvdSubSeaPlanned());
        dest.setDayTarget(src.getDayTarget());

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
    // conversions to 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore convertTo1411(ObjWellbore src) {
        return null;
    }
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore convertTo1411(Wellbore src) {
        return null;
    }
    //=========================================================================


    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    public static Wellbore convertTo20(ObjWellbore src) {
        return null;
    }
    public static Wellbore convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjWellbore src) {
        return null;
    }
    //=========================================================================
}
