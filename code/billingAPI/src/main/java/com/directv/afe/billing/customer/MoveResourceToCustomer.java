
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveResourceToCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveResourceToCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stockHandlerFrom" type="{http://directvla.com/schema/businessdomain/common/v1-0}FunctionOrProcessProvider"/>
 *         &lt;element name="CustomerTo" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Customer"/>
 *         &lt;element name="movementCategory" type="{http://directvla.com/schema/businessdomain/common/v1-0}MovementCategoryType"/>
 *         &lt;element name="physicalResource" type="{http://directvla.com/schema/businessdomain/common/v1-0}PhysicalResource"/>
 *         &lt;element name="physicalResourceAssociated" type="{http://directvla.com/schema/businessdomain/common/v1-0}PhysicalResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveResourceToCustomer", propOrder = {
    "stockHandlerFrom",
    "customerTo",
    "movementCategory",
    "physicalResource",
    "physicalResourceAssociated"
})
public class MoveResourceToCustomer {

    @XmlElement(required = true)
    protected FunctionOrProcessProvider stockHandlerFrom;
    @XmlElement(name = "CustomerTo", required = true)
    protected Customer customerTo;
    @XmlElement(required = true)
    protected MovementCategoryType movementCategory;
    @XmlElement(required = true)
    protected PhysicalResource physicalResource;
    protected PhysicalResource physicalResourceAssociated;

    /**
     * Gets the value of the stockHandlerFrom property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionOrProcessProvider }
     *     
     */
    public FunctionOrProcessProvider getStockHandlerFrom() {
        return stockHandlerFrom;
    }

    /**
     * Sets the value of the stockHandlerFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionOrProcessProvider }
     *     
     */
    public void setStockHandlerFrom(FunctionOrProcessProvider value) {
        this.stockHandlerFrom = value;
    }

    /**
     * Gets the value of the customerTo property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomerTo() {
        return customerTo;
    }

    /**
     * Sets the value of the customerTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomerTo(Customer value) {
        this.customerTo = value;
    }

    /**
     * Gets the value of the movementCategory property.
     * 
     * @return
     *     possible object is
     *     {@link MovementCategoryType }
     *     
     */
    public MovementCategoryType getMovementCategory() {
        return movementCategory;
    }

    /**
     * Sets the value of the movementCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementCategoryType }
     *     
     */
    public void setMovementCategory(MovementCategoryType value) {
        this.movementCategory = value;
    }

    /**
     * Gets the value of the physicalResource property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResource }
     *     
     */
    public PhysicalResource getPhysicalResource() {
        return physicalResource;
    }

    /**
     * Sets the value of the physicalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResource }
     *     
     */
    public void setPhysicalResource(PhysicalResource value) {
        this.physicalResource = value;
    }

    /**
     * Gets the value of the physicalResourceAssociated property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResource }
     *     
     */
    public PhysicalResource getPhysicalResourceAssociated() {
        return physicalResourceAssociated;
    }

    /**
     * Sets the value of the physicalResourceAssociated property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResource }
     *     
     */
    public void setPhysicalResourceAssociated(PhysicalResource value) {
        this.physicalResourceAssociated = value;
    }

}
