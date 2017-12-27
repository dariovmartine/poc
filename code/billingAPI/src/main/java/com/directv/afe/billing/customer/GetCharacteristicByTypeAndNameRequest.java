
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
 *         &lt;element name="GetCharacteristicByTypeAndName" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCharacteristicByTypeAndName"/>
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
    "getCharacteristicByTypeAndName"
})
@XmlRootElement(name = "GetCharacteristicByTypeAndNameRequest")
public class GetCharacteristicByTypeAndNameRequest {

    @XmlElement(required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCharacteristicByTypeAndName", required = true)
    protected GetCharacteristicByTypeAndName getCharacteristicByTypeAndName;

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
     * Gets the value of the getCharacteristicByTypeAndName property.
     * 
     * @return
     *     possible object is
     *     {@link GetCharacteristicByTypeAndName }
     *     
     */
    public GetCharacteristicByTypeAndName getGetCharacteristicByTypeAndName() {
        return getCharacteristicByTypeAndName;
    }

    /**
     * Sets the value of the getCharacteristicByTypeAndName property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCharacteristicByTypeAndName }
     *     
     */
    public void setGetCharacteristicByTypeAndName(GetCharacteristicByTypeAndName value) {
        this.getCharacteristicByTypeAndName = value;
    }

}