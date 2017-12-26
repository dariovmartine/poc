
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerFinancialTransactionsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerFinancialTransactionsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerFinancialTransactions" type="{http://directvla.com/schema/businessdomain/customer/v1-0}FinancialTransactionCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerFinancialTransactionsResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "customerFinancialTransactions"
})
public class GetCustomerFinancialTransactionsResult {

    @XmlElement(name = "CustomerFinancialTransactions", required = true)
    protected FinancialTransactionCollection customerFinancialTransactions;

    /**
     * Gets the value of the customerFinancialTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialTransactionCollection }
     *     
     */
    public FinancialTransactionCollection getCustomerFinancialTransactions() {
        return customerFinancialTransactions;
    }

    /**
     * Sets the value of the customerFinancialTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialTransactionCollection }
     *     
     */
    public void setCustomerFinancialTransactions(FinancialTransactionCollection value) {
        this.customerFinancialTransactions = value;
    }

}
