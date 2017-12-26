
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
 *         &lt;element name="GetCustomersByInternetUserIdResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomersByInternetUserIdResult"/>
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
    "getCustomersByInternetUserIdResult"
})
@XmlRootElement(name = "GetCustomersByInternetUserIdResponse")
public class GetCustomersByInternetUserIdResponse {

    @XmlElement(required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomersByInternetUserIdResult", required = true)
    protected GetCustomersByInternetUserIdResult getCustomersByInternetUserIdResult;

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
     * Gets the value of the getCustomersByInternetUserIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomersByInternetUserIdResult }
     *     
     */
    public GetCustomersByInternetUserIdResult getGetCustomersByInternetUserIdResult() {
        return getCustomersByInternetUserIdResult;
    }

    /**
     * Sets the value of the getCustomersByInternetUserIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomersByInternetUserIdResult }
     *     
     */
    public void setGetCustomersByInternetUserIdResult(GetCustomersByInternetUserIdResult value) {
        this.getCustomersByInternetUserIdResult = value;
    }

}
