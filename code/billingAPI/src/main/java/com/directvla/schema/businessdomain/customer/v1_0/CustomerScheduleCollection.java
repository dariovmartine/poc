
package com.directvla.schema.businessdomain.customer.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerScheduleCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerScheduleCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSchedules" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerScheduleCollection", propOrder = {
    "customerSchedules"
})
public class CustomerScheduleCollection {

    @XmlElement(name = "CustomerSchedules")
    protected List<CustomerSchedule> customerSchedules;

    /**
     * Gets the value of the customerSchedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerSchedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSchedule }
     * 
     * 
     */
    public List<CustomerSchedule> getCustomerSchedules() {
        if (customerSchedules == null) {
            customerSchedules = new ArrayList<CustomerSchedule>();
        }
        return this.customerSchedules;
    }

}
