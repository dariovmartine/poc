
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCustomerScheduleById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCustomerScheduleById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScheduleId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReasonId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCustomerScheduleById", propOrder = {
    "scheduleId",
    "reasonId"
})
public class DeleteCustomerScheduleById {

    @XmlElement(name = "ScheduleId")
    protected int scheduleId;
    @XmlElement(name = "ReasonId")
    protected int reasonId;

    /**
     * Gets the value of the scheduleId property.
     * 
     */
    public int getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     */
    public void setScheduleId(int value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the reasonId property.
     * 
     */
    public int getReasonId() {
        return reasonId;
    }

    /**
     * Sets the value of the reasonId property.
     * 
     */
    public void setReasonId(int value) {
        this.reasonId = value;
    }

}
