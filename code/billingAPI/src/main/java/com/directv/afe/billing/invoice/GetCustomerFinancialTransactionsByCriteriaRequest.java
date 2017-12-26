
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
 *         &lt;element name="GetCustomerFinancialTransactionsByCriteria" type="{http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0}GetCustomerFinancialTransactionsByCriteria"/>
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
    "getCustomerFinancialTransactionsByCriteria"
})
@XmlRootElement(name = "GetCustomerFinancialTransactionsByCriteriaRequest", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0")
public class GetCustomerFinancialTransactionsByCriteriaRequest {

    @XmlElement(name = "RequestMetadata", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected RequestMetadataType requestMetadata;
    @XmlElement(name = "GetCustomerFinancialTransactionsByCriteria", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", required = true)
    protected GetCustomerFinancialTransactionsByCriteria getCustomerFinancialTransactionsByCriteria;

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
     * Gets the value of the getCustomerFinancialTransactionsByCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerFinancialTransactionsByCriteria }
     *     
     */
    public GetCustomerFinancialTransactionsByCriteria getGetCustomerFinancialTransactionsByCriteria() {
        return getCustomerFinancialTransactionsByCriteria;
    }

    /**
     * Sets the value of the getCustomerFinancialTransactionsByCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerFinancialTransactionsByCriteria }
     *     
     */
    public void setGetCustomerFinancialTransactionsByCriteria(GetCustomerFinancialTransactionsByCriteria value) {
        this.getCustomerFinancialTransactionsByCriteria = value;
    }

}
