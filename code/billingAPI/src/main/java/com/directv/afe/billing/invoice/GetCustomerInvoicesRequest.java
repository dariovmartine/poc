
package com.directv.afe.billing.invoice;

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
 *         &lt;element name="RequestMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}RequestMetadataType"/>
 *         &lt;element name="GetCustomerInvoices" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}GetCustomerInvoices"/>
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
    "getCustomerInvoices"
})
@XmlRootElement(name = "GetCustomerInvoicesRequest", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class GetCustomerInvoicesRequest {

    @XmlElement(name = "RequestMetadata", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCustomerInvoices", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected GetCustomerInvoices getCustomerInvoices;

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
     * Gets the value of the getCustomerInvoices property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerInvoices }
     *     
     */
    public GetCustomerInvoices getGetCustomerInvoices() {
        return getCustomerInvoices;
    }

    /**
     * Sets the value of the getCustomerInvoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerInvoices }
     *     
     */
    public void setGetCustomerInvoices(GetCustomerInvoices value) {
        this.getCustomerInvoices = value;
    }

}
