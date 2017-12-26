
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
 *         &lt;element name="GetCustomerFinancialTransactionsResult" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}GetCustomerFinancialTransactionsResult"/>
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
    "getCustomerFinancialTransactionsResult"
})
@XmlRootElement(name = "GetCustomerFinancialTransactionsResponse", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class GetCustomerFinancialTransactionsResponse {

    @XmlElement(name = "ResponseMetadata", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "GetCustomerFinancialTransactionsResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected GetCustomerFinancialTransactionsResult getCustomerFinancialTransactionsResult;

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
     * Gets the value of the getCustomerFinancialTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerFinancialTransactionsResult }
     *     
     */
    public GetCustomerFinancialTransactionsResult getGetCustomerFinancialTransactionsResult() {
        return getCustomerFinancialTransactionsResult;
    }

    /**
     * Sets the value of the getCustomerFinancialTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerFinancialTransactionsResult }
     *     
     */
    public void setGetCustomerFinancialTransactionsResult(GetCustomerFinancialTransactionsResult value) {
        this.getCustomerFinancialTransactionsResult = value;
    }

}
