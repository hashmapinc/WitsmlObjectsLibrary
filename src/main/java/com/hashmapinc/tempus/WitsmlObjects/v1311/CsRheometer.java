package com.hashmapinc.tempus.WitsmlObjects.v1311;

// import com.hashmapinc.tempus.WitsmlObjects.v1311.CsExtensionNameValue;

import com.hashmapinc.tempus.WitsmlObjects.v1411.CsExtensionNameValue;
import com.hashmapinc.tempus.WitsmlObjects.v20.ExtensionNameValue;
import com.hashmapinc.tempus.WitsmlObjects.v20.RheometerViscosity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 *  WITSML - Rheometer Component Schema 
 * 
 * <p>Java class for cs_rheometer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_rheometer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tempRheom" type="{http://www.witsml.org/schemas/131}thermodynamicTemperatureMeasure" minOccurs="0"/>
 *         <element name="presRheom" type="{http://www.witsml.org/schemas/131}pressureMeasure" minOccurs="0"/>
 *         <element name="vis3Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis6Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis100Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis200Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis300Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *         <element name="vis600Rpm" type="{http://www.witsml.org/schemas/131}unitlessQuantity" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://www.witsml.org/schemas/131}attgrp_uid"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_rheometer", propOrder = {
    "tempRheom",
    "presRheom",
    "vis3Rpm",
    "vis6Rpm",
    "vis100Rpm",
    "vis200Rpm",
    "vis300Rpm",
    "vis600Rpm"
})
public class CsRheometer {

    protected GenericMeasure tempRheom;
    protected GenericMeasure presRheom;
    protected Double vis3Rpm;
    protected Double vis6Rpm;
    protected Double vis100Rpm;
    protected Double vis200Rpm;
    protected Double vis300Rpm;
    protected Double vis600Rpm;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the tempRheom property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getTempRheom() {
        return tempRheom;
    }

    /**
     * Sets the value of the tempRheom property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setTempRheom(GenericMeasure value) {
        this.tempRheom = value;
    }

    /**
     * Gets the value of the presRheom property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMeasure }
     *     
     */
    public GenericMeasure getPresRheom() {
        return presRheom;
    }

    /**
     * Sets the value of the presRheom property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMeasure }
     *     
     */
    public void setPresRheom(GenericMeasure value) {
        this.presRheom = value;
    }

    /**
     * Gets the value of the vis3Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis3Rpm() {
        return vis3Rpm;
    }

    /**
     * Sets the value of the vis3Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis3Rpm(Double value) {
        this.vis3Rpm = value;
    }

    /**
     * Gets the value of the vis6Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis6Rpm() {
        return vis6Rpm;
    }

    /**
     * Sets the value of the vis6Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis6Rpm(Double value) {
        this.vis6Rpm = value;
    }

    /**
     * Gets the value of the vis100Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis100Rpm() {
        return vis100Rpm;
    }

    /**
     * Sets the value of the vis100Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis100Rpm(Double value) {
        this.vis100Rpm = value;
    }

    /**
     * Gets the value of the vis200Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis200Rpm() {
        return vis200Rpm;
    }

    /**
     * Sets the value of the vis200Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis200Rpm(Double value) {
        this.vis200Rpm = value;
    }

    /**
     * Gets the value of the vis300Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis300Rpm() {
        return vis300Rpm;
    }

    /**
     * Sets the value of the vis300Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis300Rpm(Double value) {
        this.vis300Rpm = value;
    }

    /**
     * Gets the value of the vis600Rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVis600Rpm() {
        return vis600Rpm;
    }

    /**
     * Sets the value of the vis600Rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVis600Rpm(Double value) {
        this.vis600Rpm = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    //=========================================================================
    // 1.3.1.1 -> 2.0
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v20.Rheometer to20Rheometer() {
        com.hashmapinc.tempus.WitsmlObjects.v20.Rheometer dest =
                new com.hashmapinc.tempus.WitsmlObjects.v20.Rheometer();

        // check non-complex, non-repeating fields
        dest.setUid(this.getUid());

        // check complex fields
        if (this.getTempRheom() != null)
            dest.setTempRheom(this.getTempRheom().to20GenericMeasure());

        if (this.getPresRheom() != null)
            dest.setPresRheom(this.getPresRheom().to20GenericMeasure());

        RheometerViscosity rv = null;
        if (this.getVis100Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)100);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis100Rpm());
            rv.setUid("vis100rpm");
            dest.getViscosity().add(rv);
        }

        if (this.getVis3Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)3);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis3Rpm());
            rv.setUid("vis3rpm");
            dest.getViscosity().add(rv);
        }

        if (this.getVis6Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)6);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis6Rpm());
            rv.setUid("vis6rpm");
            dest.getViscosity().add(rv);
        }

        if (this.getVis200Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)200);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis200Rpm());
            rv.setUid("vis200rpm");
            dest.getViscosity().add(rv);
        }

        if (this.getVis300Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)300);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis300Rpm());
            rv.setUid("vis300rpm");
            dest.getViscosity().add(rv);
        }

        if (this.getVis600Rpm() != null)
        {
            com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure gm =
                    new com.hashmapinc.tempus.WitsmlObjects.v20.GenericMeasure();
            rv = new RheometerViscosity();
            gm.setUom("rpm");
            gm.setValue((double)600);
            rv.setSpeed(gm);
            rv.setViscosity(this.getVis600Rpm());
            rv.setUid("vis600rpm");
            dest.getViscosity().add(rv);
        }

        // TODO Verify the following...
        /*
        // While ExtensionNameValue exists in 1.4.1.1 and 2.0,
        // it is not present in 1.3.1.1
        if (this.extensionNameValue != null){
            List<ExtensionNameValue> destArray = new ArrayList<>();
            for (CsExtensionNameValue value : this.extensionNameValue){
                destArray.add(value.to20ExtensionNameValue());
            }
        }
        */

        return dest;
    }

    //=========================================================================
    // 1.3.1.1 -> 1.4.1.1
    //=========================================================================
    public com.hashmapinc.tempus.WitsmlObjects.v1411.CsRheometer to1411CsRheometer() {
        com.hashmapinc.tempus.WitsmlObjects.v1411.CsRheometer dest =
                new com.hashmapinc.tempus.WitsmlObjects.v1411.CsRheometer();

        // check non-complex, non-repeating fields
        dest.setUid(this.getUid());

        // check complex fields
        if (this.getTempRheom() != null)
            dest.setTempRheom(this.getTempRheom().to1411GenericMeasure());

        if (this.getPresRheom() != null)
            dest.setPresRheom(this.getPresRheom().to1411GenericMeasure());

        RheometerViscosity rv = new RheometerViscosity();
        if (this.getVis100Rpm() != null)
            dest.setVis100Rpm(this.getVis100Rpm());

        if (this.getVis3Rpm() != null)
            dest.setVis3Rpm(this.getVis3Rpm());

        if (this.getVis6Rpm() != null)
            dest.setVis6Rpm(this.getVis6Rpm());

        if (this.getVis200Rpm() != null)
            dest.setVis200Rpm(this.getVis200Rpm());

        if (this.getVis300Rpm() != null)
            dest.setVis300Rpm(this.getVis300Rpm());

        if (this.getVis600Rpm() != null)
            dest.setVis600Rpm(this.getVis300Rpm());

        // TODO Verify the following...
        /*
        // While ExtensionNameValue exists in 1.4.1.1 and 2.0,
        // it is not present in 1.3.1.1
        if (this.extensionNameValue != null){
            List<ExtensionNameValue> destArray = new ArrayList<>();
            for (CsExtensionNameValue value : this.extensionNameValue){
                destArray.add(value.to20ExtensionNameValue());
            }
        }
        */

        return dest;
    }

}
