
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerHistoryEventCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerHistoryEventCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerHistoryEventItem" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerHistoryEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerHistoryEventCollection", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "customerHistoryEventItem"
})
public class CustomerHistoryEventCollection {

    @XmlElement(name = "CustomerHistoryEventItem", nillable = true)
    protected List<CustomerHistoryEvent> customerHistoryEventItem;

    /**
     * Gets the value of the customerHistoryEventItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerHistoryEventItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerHistoryEventItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerHistoryEvent }
     * 
     * 
     */
    public List<CustomerHistoryEvent> getCustomerHistoryEventItem() {
        if (customerHistoryEventItem == null) {
            customerHistoryEventItem = new ArrayList<CustomerHistoryEvent>();
        }
        return this.customerHistoryEventItem;
    }

}
