
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.CustomerHistoryEventCollection;


/**
 * <p>Java class for GetCustomerHistoriesByDaysResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerHistoriesByDaysResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerHistories" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerHistoryEventCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerHistoriesByDaysResult", propOrder = {
    "customerHistories"
})
public class GetCustomerHistoriesByDaysResult {

    @XmlElement(name = "CustomerHistories")
    protected CustomerHistoryEventCollection customerHistories;

    /**
     * Gets the value of the customerHistories property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerHistoryEventCollection }
     *     
     */
    public CustomerHistoryEventCollection getCustomerHistories() {
        return customerHistories;
    }

    /**
     * Sets the value of the customerHistories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerHistoryEventCollection }
     *     
     */
    public void setCustomerHistories(CustomerHistoryEventCollection value) {
        this.customerHistories = value;
    }

}
