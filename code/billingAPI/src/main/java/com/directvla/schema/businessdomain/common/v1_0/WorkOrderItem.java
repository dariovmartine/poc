
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}BusinessInteractionItem">
 *       &lt;sequence>
 *         &lt;element name="ProblemDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOrderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PhysicalResourceModel" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderItem", propOrder = {
    "problemDescription",
    "workOrderID",
    "physicalResourceModel"
})
public class WorkOrderItem
    extends BusinessInteractionItem
{

    @XmlElement(name = "ProblemDescription")
    protected String problemDescription;
    @XmlElement(name = "WorkOrderID")
    protected Integer workOrderID;
    @XmlElement(name = "PhysicalResourceModel")
    protected Category physicalResourceModel;

    /**
     * Gets the value of the problemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * Sets the value of the problemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemDescription(String value) {
        this.problemDescription = value;
    }

    /**
     * Gets the value of the workOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWorkOrderID() {
        return workOrderID;
    }

    /**
     * Sets the value of the workOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWorkOrderID(Integer value) {
        this.workOrderID = value;
    }

    /**
     * Gets the value of the physicalResourceModel property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getPhysicalResourceModel() {
        return physicalResourceModel;
    }

    /**
     * Sets the value of the physicalResourceModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setPhysicalResourceModel(Category value) {
        this.physicalResourceModel = value;
    }

}
