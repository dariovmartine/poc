
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerFinancialTransactionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerFinancialTransactionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerFinancialTransaction" type="{http://directvla.com/schema/businessdomain/customer/v1-0}FinancialTransaction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerFinancialTransactionResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "customerFinancialTransaction"
})
public class GetCustomerFinancialTransactionResult {

    @XmlElement(name = "CustomerFinancialTransaction", required = true)
    protected FinancialTransaction customerFinancialTransaction;

    /**
     * Gets the value of the customerFinancialTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransaction }
     *     
     */
    public FinancialTransaction getCustomerFinancialTransaction() {
        return customerFinancialTransaction;
    }

    /**
     * Sets the value of the customerFinancialTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransaction }
     *     
     */
    public void setCustomerFinancialTransaction(FinancialTransaction value) {
        this.customerFinancialTransaction = value;
    }

}
