
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
 *         &lt;element name="GetCustomerProductsOfferResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerProductsOfferResult"/>
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
    "getCustomerProductsOfferResult"
})
@XmlRootElement(name = "GetCustomerProductsOfferResponse")
public class GetCustomerProductsOfferResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerProductsOfferResult", required = true)
    protected GetCustomerProductsOfferResult getCustomerProductsOfferResult;

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
     * Gets the value of the getCustomerProductsOfferResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerProductsOfferResult }
     *     
     */
    public GetCustomerProductsOfferResult getGetCustomerProductsOfferResult() {
        return getCustomerProductsOfferResult;
    }

    /**
     * Sets the value of the getCustomerProductsOfferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerProductsOfferResult }
     *     
     */
    public void setGetCustomerProductsOfferResult(GetCustomerProductsOfferResult value) {
        this.getCustomerProductsOfferResult = value;
    }

}
