
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerNoteResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerNoteResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNoteID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerNoteResult", propOrder = {
    "customerNoteID"
})
public class AddCustomerNoteResult {

    @XmlElement(name = "CustomerNoteID")
    protected int customerNoteID;

    /**
     * Gets the value of the customerNoteID property.
     * 
     */
    public int getCustomerNoteID() {
        return customerNoteID;
    }

    /**
     * Sets the value of the customerNoteID property.
     * 
     */
    public void setCustomerNoteID(int value) {
        this.customerNoteID = value;
    }

}
