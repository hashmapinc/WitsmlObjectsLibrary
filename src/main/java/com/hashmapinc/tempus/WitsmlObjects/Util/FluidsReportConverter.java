package com.hashmapinc.tempus.WitsmlObjects.Util;

import java.util.ArrayList;
import java.util.List;

import com.hashmapinc.tempus.WitsmlObjects.v20.Citation;
import com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport;

public class FluidsReportConverter {
    //=========================================================================
    // conversions to 1.3.1.1
    //=========================================================================
    public static com.hashmapinc.tempus.WitsmlObjects.v1311.ObjFluidsReport convertTo1311(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src){
    
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
    // conversions to 2.0
    //=========================================================================
	public static com.hashmapinc.tempus.WitsmlObjects.v20.FluidsReport convertTo20(com.hashmapinc.tempus.WitsmlObjects.v1411.ObjFluidsReport src) {
		
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
            List<com.hashmapinc.tempus.WitsmlObjects.v20.Fluid> destFluids = new ArrayList<>();
            for (com.hashmapinc.tempus.WitsmlObjects.v1411.CsFluid fluid : src.getFluid()){
                destFluids.add(fluid.to20Fluid());
            }
        }   
        return dest;
	} 
}
