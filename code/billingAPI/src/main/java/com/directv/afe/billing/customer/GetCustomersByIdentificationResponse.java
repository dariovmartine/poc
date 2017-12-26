
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
 *         &lt;element name="ResponseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="GetCustomersByIdentificationResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomersByIdentificationResult"/>
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
    "getCustomersByIdentificationResult"
})
@XmlRootElement(name = "GetCustomersByIdentificationResponse")
public class GetCustomersByIdentificationResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomersByIdentificationResult", required = true)
    protected GetCustomersByIdentificationResult getCustomersByIdentificationResult;

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
     * Gets the value of the getCustomersByIdentificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomersByIdentificationResult }
     *     
     */
    public GetCustomersByIdentificationResult getGetCustomersByIdentificationResult() {
        return getCustomersByIdentificationResult;
    }

    /**
     * Sets the value of the getCustomersByIdentificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomersByIdentificationResult }
     *     
     */
    public void setGetCustomersByIdentificationResult(GetCustomersByIdentificationResult value) {
        this.getCustomersByIdentificationResult = value;
    }

}
