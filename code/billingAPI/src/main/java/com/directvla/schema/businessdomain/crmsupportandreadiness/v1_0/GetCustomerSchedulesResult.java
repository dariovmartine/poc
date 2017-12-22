
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.customer.v1_0.CustomerScheduleCollection;


/**
 * <p>Java class for GetCustomerSchedulesResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerSchedulesResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Schedules" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerScheduleCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerSchedulesResult", propOrder = {
    "schedules"
})
public class GetCustomerSchedulesResult {

    @XmlElement(name = "Schedules", required = true)
    protected CustomerScheduleCollection schedules;

    /**
     * Gets the value of the schedules property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerScheduleCollection }
     *     
     */
    public CustomerScheduleCollection getSchedules() {
        return schedules;
    }

    /**
     * Sets the value of the schedules property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerScheduleCollection }
     *     
     */
    public void setSchedules(CustomerScheduleCollection value) {
        this.schedules = value;
    }

}
