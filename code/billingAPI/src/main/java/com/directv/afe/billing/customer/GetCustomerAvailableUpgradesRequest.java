
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestMetadataType"/>
 *         &lt;element name="GetCustomerAvailableUpgrades" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerAvailableUpgrades"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestMetadata",
    "getCustomerAvailableUpgrades"
})
@XmlRootElement(name = "GetCustomerAvailableUpgradesRequest")
public class GetCustomerAvailableUpgradesRequest {

    @XmlElement(required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCustomerAvailableUpgrades", required = true)
    protected GetCustomerAvailableUpgrades getCustomerAvailableUpgrades;

    /**
     * Gets the value of the requestMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMetadataType }
     *     
     */
    public RequestMetadataType getRequestMetadata() {
        return requestMetadata;
    }

    /**
     * Sets the value of the requestMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMetadataType }
     *     
     */
    public void setRequestMetadata(RequestMetadataType value) {
        this.requestMetadata = value;
    }

    /**
     * Gets the value of the getCustomerAvailableUpgrades property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerAvailableUpgrades }
     *     
     */
    public GetCustomerAvailableUpgrades getGetCustomerAvailableUpgrades() {
        return getCustomerAvailableUpgrades;
    }

    /**
     * Sets the value of the getCustomerAvailableUpgrades property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerAvailableUpgrades }
     *     
     */
    public void setGetCustomerAvailableUpgrades(GetCustomerAvailableUpgrades value) {
        this.getCustomerAvailableUpgrades = value;
    }

}
