
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteractionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://directvla.com/schema/businessdomain/common/v1-0}Quantity"/>
 *         &lt;element name="BusinessInteractionItemReferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesService" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesResource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesResourceSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesServiceSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolves" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesProductSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOrderItemReferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteractionItem", propOrder = {
    "id",
    "action",
    "quantity",
    "businessInteractionItemReferences",
    "businessInteractionItemInvolvesService",
    "businessInteractionItemInvolvesResource",
    "businessInteractionItemInvolvesResourceSpecification",
    "businessInteractionItemInvolvesServiceSpecification",
    "businessInteractionItemInvolves",
    "businessInteractionItemInvolvesProductSpecification",
    "businessInteractionItemInvolvesProduct",
    "workOrderItemReferences"
})
@XmlSeeAlso({
    WorkOrderItem.class
})
public class BusinessInteractionItem {

    @XmlElement(name = "ID")
    protected Integer id;
    protected String action;
    @XmlElement(required = true)
    protected Quantity quantity;
    @XmlElement(name = "BusinessInteractionItemReferences")
    protected String businessInteractionItemReferences;
    @XmlElement(name = "BusinessInteractionItemInvolvesService")
    protected Category businessInteractionItemInvolvesService;
    @XmlElement(name = "BusinessInteractionItemInvolvesResource")
    protected String businessInteractionItemInvolvesResource;
    @XmlElement(name = "BusinessInteractionItemInvolvesResourceSpecification")
    protected String businessInteractionItemInvolvesResourceSpecification;
    @XmlElement(name = "BusinessInteractionItemInvolvesServiceSpecification")
    protected String businessInteractionItemInvolvesServiceSpecification;
    @XmlElement(name = "BusinessInteractionItemInvolves")
    protected String businessInteractionItemInvolves;
    @XmlElement(name = "BusinessInteractionItemInvolvesProductSpecification")
    protected String businessInteractionItemInvolvesProductSpecification;
    @XmlElement(name = "BusinessInteractionItemInvolvesProduct")
    protected String businessInteractionItemInvolvesProduct;
    @XmlElement(name = "WorkOrderItemReferences")
    protected String workOrderItemReferences;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the businessInteractionItemReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemReferences() {
        return businessInteractionItemReferences;
    }

    /**
     * Sets the value of the businessInteractionItemReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemReferences(String value) {
        this.businessInteractionItemReferences = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesService property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getBusinessInteractionItemInvolvesService() {
        return businessInteractionItemInvolvesService;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setBusinessInteractionItemInvolvesService(Category value) {
        this.businessInteractionItemInvolvesService = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesResource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolvesResource() {
        return businessInteractionItemInvolvesResource;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolvesResource(String value) {
        this.businessInteractionItemInvolvesResource = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesResourceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolvesResourceSpecification() {
        return businessInteractionItemInvolvesResourceSpecification;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesResourceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolvesResourceSpecification(String value) {
        this.businessInteractionItemInvolvesResourceSpecification = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesServiceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolvesServiceSpecification() {
        return businessInteractionItemInvolvesServiceSpecification;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesServiceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolvesServiceSpecification(String value) {
        this.businessInteractionItemInvolvesServiceSpecification = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolves property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolves() {
        return businessInteractionItemInvolves;
    }

    /**
     * Sets the value of the businessInteractionItemInvolves property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolves(String value) {
        this.businessInteractionItemInvolves = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesProductSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolvesProductSpecification() {
        return businessInteractionItemInvolvesProductSpecification;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesProductSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolvesProductSpecification(String value) {
        this.businessInteractionItemInvolvesProductSpecification = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionItemInvolvesProduct() {
        return businessInteractionItemInvolvesProduct;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionItemInvolvesProduct(String value) {
        this.businessInteractionItemInvolvesProduct = value;
    }

    /**
     * Gets the value of the workOrderItemReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderItemReferences() {
        return workOrderItemReferences;
    }

    /**
     * Sets the value of the workOrderItemReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderItemReferences(String value) {
        this.workOrderItemReferences = value;
    }

}
