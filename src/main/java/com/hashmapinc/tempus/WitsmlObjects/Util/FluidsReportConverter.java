package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.ArrayList;
import java.util.List;

import com.hashmapinc.tempus.WitsmlObjects.v20
        .Citation;
import com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class FluidsReportConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    // 1.4.1.1 -> 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport
                        convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src)
    {
    
        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport dest = new com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport();

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
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsFluid> destFluids = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid fluid : src.getFluid()){
                destFluids.add(fluid.to1311Fluid());
            }
        }   
        return dest;
    }

    //=========================================================================
    // 2.0 -> 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport
                        convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport src)
                                        throws javax.xml.datatype.DatatypeConfigurationException {

        com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport();

        // Fields available within the src:
        src.getAliases();
        src.getExistenceKind();
        src.getExtensionNameValue();
        src.getObjectVersion();
        src.getSchemaVersion();
        src.getClass(); // extends FluidsReport

        dest.setNameWell();
        // NO CommonData in V2.0

        Citation c = new Citation();
        dest.setName(c.getTitle());

        if (src.getDTim() != null)
            dest.setDTim(DatatypeFactory.newInstance().newXMLGregorianCalendar(src.getDTim()));
        dest.setNumReport(src.getNumReport().shortValue());
        if (src.getMd() != null)
            dest.setMd(src.getMd().to1311MeasuredDepthCoord());
        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1311VerticalDepthCoord());
        if (src.getWellbore().getTitle() != null)
            dest.setNameWellbore(src.getWellbore().getTitle());


        // EXAMPLE is 1411 (src) -> 20 (dest)
        // 2.0 (src) -> 1.3.1.1 (dest)
        // check repeating fields
        if (src.getFluid() != null){
            List<com.hashmapinc.tempus.WitsmlObjects.v1311.CsFluid> destFluids = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v20.Fluid fluid : src.getFluid()){
                // destFluids.add(fluid.to1311Fluid());
                destFluids.add(fluid.to1311Fluid());
            }
        }
        return dest;
    }

    //=========================================================================
    // conversions to 1.4.1.1
    //=========================================================================
    // 2.0 -> 1.4.1.1
    public static com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport
    convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport src)
            throws javax.xml.datatype.DatatypeConfigurationException {

        com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport();

        // Fields available within the src:
        src.getAliases();
        src.getExistenceKind();
        src.getExtensionNameValue();
        src.getObjectVersion();
        src.getSchemaVersion();
        src.getClass(); // extends FluidsReport

        dest.setNameWell();
        // NO CommonData in V2.0

        Citation c = new Citation();
        dest.setName(c.getTitle());

        if (src.getDTim() != null)
            dest.setDTim(DatatypeFactory.newInstance().newXMLGregorianCalendar(src.getDTim()));
        dest.setNumReport(src.getNumReport().shortValue());
        if (src.getMd() != null)
            dest.setMd(src.getMd().to1411MeasuredDepthCoord());
        if (src.getCustomData() != null)
            dest.setCustomData(src.getCustomData());
        if (src.getTvd() != null)
            dest.setTvd(src.getTvd().to1411VerticalDepthCoord());
        if (src.getWellbore().getTitle() != null)
            dest.setNameWellbore(src.getWellbore().getTitle());

        // 2.0 (src) -> 1.4.1.1 (dest)
        // check repeating fields
        if (src.getFluid() != null){
            List<com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid> destFluids = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v20.Fluid fluid : src.getFluid()){
                // destFluids.add(fluid.to1311Fluid());
                destFluids.add(fluid.to1411Fluid());
            }
        }
        return dest;
    }

    //=========================================================================
    // conversions to 2.0
    //=========================================================================
    // 1.4.1.1 -> 2.0
	public static com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport
                        convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src)
    {
        com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport dest = new FluidsReport();

        // check non-complex, non-repeating fields
        Citation c = new Citation();
        c.setTitle(src.getName());
        
        dest.setCitation(c);

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim().toXMLFormat());
        
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
        com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport dest = new FluidsReport();

        // check non-complex, non-repeating fields
        Citation c = new Citation();
        c.setTitle(src.getName());

        dest.setCitation(c);

        if (src.getDTim() != null)
            dest.setDTim(src.getDTim().toXMLFormat());

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
