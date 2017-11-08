package com.hashmapinc.tempus.WitsmlObjects.common;

import javax.xml.bind.annotation.*;

@XmlTransient
public abstract class AbstractMeasure {

    @XmlValue
    protected Double value;

    /**
     * This type disallows an "empty" double value.
     * 			This type should not be used directly except to derive another type.
     * @return returns the value as a Double
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * @param value The value to set as a Double
     */
    public void setValue(double value) {
        this.value = value;
    }
}
