
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAccountTaxExemptionCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountTaxExemptionCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerAccountTaxExemption" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerAccountTaxExemption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountTaxExemptionCollection", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "customerAccountTaxExemption"
})
public class CustomerAccountTaxExemptionCollection {

    @XmlElement(name = "CustomerAccountTaxExemption")
    protected List<CustomerAccountTaxExemption> customerAccountTaxExemption;

    /**
     * Gets the value of the customerAccountTaxExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccountTaxExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountTaxExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountTaxExemption }
     * 
     * 
     */
    public List<CustomerAccountTaxExemption> getCustomerAccountTaxExemption() {
        if (customerAccountTaxExemption == null) {
            customerAccountTaxExemption = new ArrayList<CustomerAccountTaxExemption>();
        }
        return this.customerAccountTaxExemption;
    }

}
