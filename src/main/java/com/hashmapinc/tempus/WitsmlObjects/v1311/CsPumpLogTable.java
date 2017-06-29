package com.hashmapinc.tempus.WitsmlObjects.v1311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data type supporting a pump log for DST fiber installation data.
 * 
 * <p>Java class for cs_pumpLogTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre> {@code
 * <complexType name="cs_pumpLogTable">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tableRow" type="{http://www.witsml.org/schemas/131}cs_pumpLogRow" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * } </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cs_pumpLogTable", propOrder = {
    "tableRow"
})
public class CsPumpLogTable {

    @XmlElement(required = true)
    protected List<CsPumpLogRow> tableRow;

    /**
     * Gets the value of the tableRow property.
     * 
     *
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRow property.
     * 
     *
     * For example, to add a new item, do as follows:
     * <pre> {@code
     *    getTableRow().add(newItem);
     * } </pre>
     * 
     * 
     *
     * Objects of the following type(s) are allowed in the list
     * {@link CsPumpLogRow }
     * 
     * 
     */
    public List<CsPumpLogRow> getTableRow() {
        if (tableRow == null) {
            tableRow = new ArrayList<CsPumpLogRow>();
        }
        return this.tableRow;
    }

}
