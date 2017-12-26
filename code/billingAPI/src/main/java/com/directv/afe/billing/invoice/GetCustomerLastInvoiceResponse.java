
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
 *         &lt;element name="ResponseMetadata" type="{http://directvla.com/schema/util/commondatatypes/v1-0}ResponseMetadataType"/>
 *         &lt;element name="GetCustomerLastInvoiceResult" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}GetCustomerLastInvoiceResult"/>
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
    "getCustomerLastInvoiceResult"
})
@XmlRootElement(name = "GetCustomerLastInvoiceResponse", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class GetCustomerLastInvoiceResponse {

    @XmlElement(name = "ResponseMetadata", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerLastInvoiceResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected GetCustomerLastInvoiceResult getCustomerLastInvoiceResult;

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
     * Gets the value of the getCustomerLastInvoiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerLastInvoiceResult }
     *     
     */
    public GetCustomerLastInvoiceResult getGetCustomerLastInvoiceResult() {
        return getCustomerLastInvoiceResult;
    }

    /**
     * Sets the value of the getCustomerLastInvoiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerLastInvoiceResult }
     *     
     */
    public void setGetCustomerLastInvoiceResult(GetCustomerLastInvoiceResult value) {
        this.getCustomerLastInvoiceResult = value;
    }

}
