package com.hashmapinc.tempus.WitsmlObjects.Util;

import com.hashmapinc.tempus.WitsmlObjects.v20
        .Citation;
import com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport;

import javax.xml.datatype.DatatypeFactory;

public class FluidsReportConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    // 1.4.1.1 -> 1.3.1.1 (base)
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport
                        convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src)
    {
    
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport();

        // check non-complex, non-repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setNumReport(src.getNumReport()); 
             
        // check complex fields
        if (src.getDTim() != null)
            dest.setDTim(src.getDTim());

        if (src.getCommonData() != null)
            dest.setCommonData(src.getCommonData().to1311CommonData());

        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());

        if (src.getMd() != null)    
            dest.setMd(src.getMd().to1311MeasuredDepthCoord());
        
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1311VerticalDepthCoord());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to1311Fluid());
            }
        }   
        return dest;
    }

    //=========================================================================
    // 2.0 -> 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport
                        convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport src)
                                        throws javax.xml.datatype.DatatypeConfigurationException
    {

        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport();

        // TODO 20 does not have NameWell
        // dest.setNameWell();

        Citation c = new Citation();
        if (c.getTitle() != null)
            dest.setName(c.getTitle());

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim());
        /*
                    DatatypeFactory
                    .newInstance()
                    .newXMLGregorianCalendar(src.getDTim()));
        */
        if (src.getNumReport() != null)
            dest.setNumReport(src.getNumReport().shortValue());
        if (src.getMd() != null)
            dest.setMd(src.getMd().to1311MeasuredDepthCoord());
        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1311VerticalDepthCoord());
        if (src.getWellbore().getTitle() != null)
            dest.setNameWellbore(src.getWellbore().getTitle());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v20.Fluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to1311CsFluid());
            }
        }
        return dest;
    }

    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    // 1.3.1.1 -> 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport
            convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport src)
    {

        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport();

        // check non-complex, non-repeating fields
        dest.setNameWell(src.getNameWell());
        dest.setNameWellbore(src.getNameWellbore());
        dest.setName(src.getName());
        dest.setNumReport(src.getNumReport());

        // check complex fields
        if (src.getDTim() != null)
            dest.setDTim(src.getDTim());

        if (src.getCommonData() != null)
            dest.setCommonData(src.getCommonData().to1411CommonData());

        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());

        if (src.getMd() != null)
            dest.setMd(src.getMd().to1411MeasuredDepthCoord());

        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1411VerticalDepthCoord());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsFluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to1411CsFluid());
            }
        }
        return dest;
    }
    //=========================================================================
    // 2.0 -> 1.4.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport
                          convertTo1411(com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport src)
                                            throws javax.xml.datatype.DatatypeConfigurationException {

        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport();

        Citation c = new Citation();
        if (c.getTitle() != null)
            dest.setName(c.getTitle());

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim());
        /*
                    DatatypeFactory
                    .newInstance()
                    .newXMLGregorianCalendar(src.getDTim()));
        */
        if (src.getNumReport() != null)
            dest.setNumReport(src.getNumReport().shortValue());
        if (src.getMd() != null)
            dest.setMd(src.getMd().to1411MeasuredDepthCoord());
        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1411VerticalDepthCoord());
        if (src.getWellbore().getTitle() != null)
            dest.setNameWellbore(src.getWellbore().getTitle());
        if (src.getUid() != null)
            dest.setUid(src.getUid());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v20.Fluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to1411CsFluid());
            }
        }

        return dest;
    }

    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    // 1.4.1.1 -> 2.0 (base)
    //=========================================================================
	public static com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport
                        convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src)
    {
        com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport dest =
                new FluidsReport();

        // check non-complex, non-repeating fields
        Citation c = new Citation();
        if (src.getName() != null) {
            c.setTitle(src.getName());
            dest.setCitation(c);
        }

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim()); //.toXMLFormat());
        
        if (src.getNumReport() != null)
            dest.setNumReport((int)src.getNumReport()); 

        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());

        if (src.getMd() != null)    
            dest.setMd(src.getMd().to20DepthCoord());
        
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to20DepthCoord());

        if (src.getUid() != null)
            dest.setUid(src.getUid());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to20Fluid());
            }
        }

        return dest;
	}

    //=========================================================================
    // 1.3.1.1 -> 2.0
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport
                        convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport src)
    {
        com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport dest =
                new FluidsReport();

        // check non-complex, non-repeating fields
        Citation c = new Citation();
        if (src.getName() != null) {
            c.setTitle(src.getName());
            dest.setCitation(c);
        }

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim()); //.toXMLFormat());

        if (src.getNumReport() != null)
            dest.setNumReport((int)src.getNumReport());

        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());

        if (src.getMd() != null)
            dest.setMd(src.getMd().to20DepthCoord());

        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to20DepthCoord());

        // check repeating fields
        if (src.getFluid() != null){
            for (com.hashmapinc.tempus.WitsmlObjects.v1311.CsFluid fluid : src.getFluid()){
                dest.getFluid().add(fluid.to20Fluid());
            }
        }

        return dest;
    }

}
