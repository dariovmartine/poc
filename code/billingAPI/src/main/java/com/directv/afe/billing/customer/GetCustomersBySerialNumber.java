
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomersBySerialNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomersBySerialNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PhysicalResourceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomersBySerialNumber", propOrder = {
    "physicalResourceSerialNumber"
})
public class GetCustomersBySerialNumber {

    @XmlElement(name = "PhysicalResourceSerialNumber", required = true)
    protected String physicalResourceSerialNumber;

    /**
     * Gets the value of the physicalResourceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalResourceSerialNumber() {
        return physicalResourceSerialNumber;
    }

    /**
     * Sets the value of the physicalResourceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalResourceSerialNumber(String value) {
        this.physicalResourceSerialNumber = value;
    }

}
