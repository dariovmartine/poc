
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerFinancialTransactionsByCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerFinancialTransactionsByCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Criterias" type="{http://directvla.com/schema/businessdomain/common/v1-0}CriteriaSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerFinancialTransactionsByCriteria", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "customerKey",
    "criterias"
})
public class GetCustomerFinancialTransactionsByCriteria {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "Criterias", required = true)
    protected CriteriaSpecification criterias;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the criterias property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaSpecification }
     *     
     */
    public CriteriaSpecification getCriterias() {
        return criterias;
    }

    /**
     * Sets the value of the criterias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaSpecification }
     *     
     */
    public void setCriterias(CriteriaSpecification value) {
        this.criterias = value;
    }

}
