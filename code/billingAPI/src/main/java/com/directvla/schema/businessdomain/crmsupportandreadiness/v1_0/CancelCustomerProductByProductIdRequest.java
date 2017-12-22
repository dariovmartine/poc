
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.util.commondatatypes.v1_0.RequestMetadataType;


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
 *         &lt;element name="RequestMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestMetadataType"/>
 *         &lt;element name="CancelCustomerProductByProductId" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CancelCustomerProductByProductId"/>
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
    "cancelCustomerProductByProductId"
})
@XmlRootElement(name = "CancelCustomerProductByProductIdRequest")
public class CancelCustomerProductByProductIdRequest {

    @XmlElement(name = "RequestMetadata", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "CancelCustomerProductByProductId", required = true)
    protected CancelCustomerProductByProductId cancelCustomerProductByProductId;

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
     * Gets the value of the cancelCustomerProductByProductId property.
     * 
     * @return
     *     possible object is
     *     {@link CancelCustomerProductByProductId }
     *     
     */
    public CancelCustomerProductByProductId getCancelCustomerProductByProductId() {
        return cancelCustomerProductByProductId;
    }

    /**
     * Sets the value of the cancelCustomerProductByProductId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelCustomerProductByProductId }
     *     
     */
    public void setCancelCustomerProductByProductId(CancelCustomerProductByProductId value) {
        this.cancelCustomerProductByProductId = value;
    }

}
