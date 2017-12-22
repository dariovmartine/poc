
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.CustomerCollection;


/**
 * <p>Java class for GetCustomersBySerialNumberResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomersBySerialNumberResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerList" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomersBySerialNumberResult", propOrder = {
    "customerList"
})
public class GetCustomersBySerialNumberResult {

    @XmlElement(name = "CustomerList", required = true)
    protected CustomerCollection customerList;

    /**
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCollection }
     *     
     */
    public CustomerCollection getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCollection }
     *     
     */
    public void setCustomerList(CustomerCollection value) {
        this.customerList = value;
    }

}
