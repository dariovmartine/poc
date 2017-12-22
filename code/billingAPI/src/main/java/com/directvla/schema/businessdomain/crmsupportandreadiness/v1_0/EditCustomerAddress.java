
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.common.v1_0.UrbanPropertyAddress;


/**
 * <p>Java class for EditCustomerAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditCustomerAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://directvla.com/schema/businessdomain/common/v1-0}UrbanPropertyAddress"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditCustomerAddress", propOrder = {
    "address",
    "reason"
})
public class EditCustomerAddress {

    @XmlElement(name = "Address", required = true)
    protected UrbanPropertyAddress address;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanPropertyAddress }
     *     
     */
    public UrbanPropertyAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanPropertyAddress }
     *     
     */
    public void setAddress(UrbanPropertyAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     */
    public int getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     */
    public void setReason(int value) {
        this.reason = value;
    }

}
