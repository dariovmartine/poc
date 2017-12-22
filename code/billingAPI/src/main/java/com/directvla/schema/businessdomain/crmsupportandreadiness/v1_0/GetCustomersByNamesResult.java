
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.CustomerCollection;


/**
 * <p>Java class for GetCustomersByNamesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomersByNamesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customers" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomersByNamesResult", propOrder = {
    "customers"
})
public class GetCustomersByNamesResult {

    protected CustomerCollection customers;

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCollection }
     *     
     */
    public CustomerCollection getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCollection }
     *     
     */
    public void setCustomers(CustomerCollection value) {
        this.customers = value;
    }

}
