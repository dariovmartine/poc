
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.CustomerNoteCollection;


/**
 * <p>Java class for GetCustomerNotesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerNotesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerNotes" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerNoteCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerNotesResult", propOrder = {
    "customerNotes"
})
public class GetCustomerNotesResult {

    @XmlElement(name = "CustomerNotes", required = true)
    protected CustomerNoteCollection customerNotes;

    /**
     * Gets the value of the customerNotes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerNoteCollection }
     *     
     */
    public CustomerNoteCollection getCustomerNotes() {
        return customerNotes;
    }

    /**
     * Sets the value of the customerNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerNoteCollection }
     *     
     */
    public void setCustomerNotes(CustomerNoteCollection value) {
        this.customerNotes = value;
    }

}
