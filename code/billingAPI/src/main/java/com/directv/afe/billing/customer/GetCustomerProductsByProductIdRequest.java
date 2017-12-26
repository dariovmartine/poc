
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
 *         &lt;element name="GetCustomerProductByProductId" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}GetCustomerProductsByProductId"/>
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
    "getCustomerProductByProductId"
})
@XmlRootElement(name = "GetCustomerProductsByProductIdRequest")
public class GetCustomerProductsByProductIdRequest {

    @XmlElement(required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCustomerProductByProductId", required = true)
    protected GetCustomerProductsByProductId getCustomerProductByProductId;

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
     * Gets the value of the getCustomerProductByProductId property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerProductsByProductId }
     *     
     */
    public GetCustomerProductsByProductId getGetCustomerProductByProductId() {
        return getCustomerProductByProductId;
    }

    /**
     * Sets the value of the getCustomerProductByProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerProductsByProductId }
     *     
     */
    public void setGetCustomerProductByProductId(GetCustomerProductsByProductId value) {
        this.getCustomerProductByProductId = value;
    }

}
