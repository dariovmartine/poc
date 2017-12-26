
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerBillingCycleSpecificationCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleSpecificationCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerBillingCycleSpecification" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerBillingCycleSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleSpecificationCollection", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "customerBillingCycleSpecification"
})
public class CustomerBillingCycleSpecificationCollection {

    @XmlElement(name = "CustomerBillingCycleSpecification")
    protected List<CustomerBillingCycleSpecification> customerBillingCycleSpecification;

    /**
     * Gets the value of the customerBillingCycleSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBillingCycleSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerBillingCycleSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBillingCycleSpecification }
     * 
     * 
     */
    public List<CustomerBillingCycleSpecification> getCustomerBillingCycleSpecification() {
        if (customerBillingCycleSpecification == null) {
            customerBillingCycleSpecification = new ArrayList<CustomerBillingCycleSpecification>();
        }
        return this.customerBillingCycleSpecification;
    }

}
