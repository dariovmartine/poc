
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
 *         &lt;element name="responseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="GetCharacteristicByTypeAndNameResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCharacteristicByTypeAndNameResult"/>
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
    "responseMetadata",
    "getCharacteristicByTypeAndNameResult"
})
@XmlRootElement(name = "GetCharacteristicByTypeAndNameResponse")
public class GetCharacteristicByTypeAndNameResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCharacteristicByTypeAndNameResult", required = true)
    protected GetCharacteristicByTypeAndNameResult getCharacteristicByTypeAndNameResult;

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadataType }
     *     
     */
    public ResponseMetadataType getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadataType }
     *     
     */
    public void setResponseMetadata(ResponseMetadataType value) {
        this.responseMetadata = value;
    }

    /**
     * Gets the value of the getCharacteristicByTypeAndNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCharacteristicByTypeAndNameResult }
     *     
     */
    public GetCharacteristicByTypeAndNameResult getGetCharacteristicByTypeAndNameResult() {
        return getCharacteristicByTypeAndNameResult;
    }

    /**
     * Sets the value of the getCharacteristicByTypeAndNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCharacteristicByTypeAndNameResult }
     *     
     */
    public void setGetCharacteristicByTypeAndNameResult(GetCharacteristicByTypeAndNameResult value) {
        this.getCharacteristicByTypeAndNameResult = value;
    }

}
