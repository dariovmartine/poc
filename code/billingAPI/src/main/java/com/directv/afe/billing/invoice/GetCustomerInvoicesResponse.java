
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
 *         &lt;element name="GetCustomerInvoicesResult" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}GetCustomerInvoicesResult"/>
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
    "getCustomerInvoicesResult"
})
@XmlRootElement(name = "GetCustomerInvoicesResponse", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class GetCustomerInvoicesResponse {

    @XmlElement(name = "ResponseMetadata", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerInvoicesResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected GetCustomerInvoicesResult getCustomerInvoicesResult;

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
     * Gets the value of the getCustomerInvoicesResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerInvoicesResult }
     *     
     */
    public GetCustomerInvoicesResult getGetCustomerInvoicesResult() {
        return getCustomerInvoicesResult;
    }

    /**
     * Sets the value of the getCustomerInvoicesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerInvoicesResult }
     *     
     */
    public void setGetCustomerInvoicesResult(GetCustomerInvoicesResult value) {
        this.getCustomerInvoicesResult = value;
    }

}