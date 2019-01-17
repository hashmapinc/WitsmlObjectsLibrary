package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v1311.ObjWellbore;
import com.hashmapinc.tempus.WitsmlObjects.v20.Wellbore;

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
        return null;
    }
    public static ObjWellbore convertTo1311(Wellbore src) {
        return null;
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
