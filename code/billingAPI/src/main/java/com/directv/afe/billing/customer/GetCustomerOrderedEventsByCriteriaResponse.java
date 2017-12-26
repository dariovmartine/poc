
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
 *         &lt;element name="GetCustomerOrderedEventsByCriteriaResult" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerOrderedEventsByCriteriaResult"/>
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
    "getCustomerOrderedEventsByCriteriaResult"
})
@XmlRootElement(name = "GetCustomerOrderedEventsByCriteriaResponse")
public class GetCustomerOrderedEventsByCriteriaResponse {

    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerOrderedEventsByCriteriaResult", required = true)
    protected GetCustomerOrderedEventsByCriteriaResult getCustomerOrderedEventsByCriteriaResult;

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
     * Gets the value of the getCustomerOrderedEventsByCriteriaResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerOrderedEventsByCriteriaResult }
     *     
     */
    public GetCustomerOrderedEventsByCriteriaResult getGetCustomerOrderedEventsByCriteriaResult() {
        return getCustomerOrderedEventsByCriteriaResult;
    }

    /**
     * Sets the value of the getCustomerOrderedEventsByCriteriaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerOrderedEventsByCriteriaResult }
     *     
     */
    public void setGetCustomerOrderedEventsByCriteriaResult(GetCustomerOrderedEventsByCriteriaResult value) {
        this.getCustomerOrderedEventsByCriteriaResult = value;
    }

}
