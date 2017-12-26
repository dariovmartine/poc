
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyRoleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://directvla.com/schema/businessdomain/common/v1-0}UrbanPropertyAddressCollection" minOccurs="0"/>
 *         &lt;element name="ContactableVia" type="{http://directvla.com/schema/businessdomain/common/v1-0}ContactMediumCollection" minOccurs="0"/>
 *         &lt;element name="WorkOrderList" type="{http://directvla.com/schema/businessdomain/common/v1-0}WorkOrderCollection" minOccurs="0"/>
 *         &lt;element name="ProductInvolvementList" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductCollection" minOccurs="0"/>
 *         &lt;element name="BusinessRoles" type="{http://directvla.com/schema/businessdomain/common/v1-0}PartyRoleCollection" minOccurs="0"/>
 *         &lt;element name="CategorizedBy" type="{http://directvla.com/schema/businessdomain/common/v1-0}PartyRoleCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRole", propOrder = {
    "partyRoleId",
    "status",
    "name",
    "validFor",
    "addressList",
    "contactableVia",
    "workOrderList",
    "productInvolvementList",
    "businessRoles",
    "categorizedBy"
})
@XmlSeeAlso({
    Customer.class,
    ServiceProvider.class,
    User.class,
    FunctionOrProcessProvider.class,
    Intermediary.class,
    Vendor.class
})
public abstract class PartyRole {

    protected String partyRoleId;
    protected Category status;
    protected String name;
    protected TimePeriod validFor;
    @XmlElement(name = "AddressList")
    protected UrbanPropertyAddressCollection addressList;
    @XmlElement(name = "ContactableVia")
    protected ContactMediumCollection contactableVia;
    @XmlElement(name = "WorkOrderList")
    protected WorkOrderCollection workOrderList;
    @XmlElement(name = "ProductInvolvementList")
    protected ProductCollection productInvolvementList;
    @XmlElement(name = "BusinessRoles")
    protected PartyRoleCollection businessRoles;
    @XmlElement(name = "CategorizedBy")
    protected PartyRoleCategory categorizedBy;

    /**
     * Gets the value of the partyRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleId() {
        return partyRoleId;
    }

    /**
     * Sets the value of the partyRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleId(String value) {
        this.partyRoleId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setStatus(Category value) {
        this.status = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanPropertyAddressCollection }
     *     
     */
    public UrbanPropertyAddressCollection getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanPropertyAddressCollection }
     *     
     */
    public void setAddressList(UrbanPropertyAddressCollection value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the contactableVia property.
     * 
     * @return
     *     possible object is
     *     {@link ContactMediumCollection }
     *     
     */
    public ContactMediumCollection getContactableVia() {
        return contactableVia;
    }

    /**
     * Sets the value of the contactableVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMediumCollection }
     *     
     */
    public void setContactableVia(ContactMediumCollection value) {
        this.contactableVia = value;
    }

    /**
     * Gets the value of the workOrderList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderCollection }
     *     
     */
    public WorkOrderCollection getWorkOrderList() {
        return workOrderList;
    }

    /**
     * Sets the value of the workOrderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderCollection }
     *     
     */
    public void setWorkOrderList(WorkOrderCollection value) {
        this.workOrderList = value;
    }

    /**
     * Gets the value of the productInvolvementList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCollection }
     *     
     */
    public ProductCollection getProductInvolvementList() {
        return productInvolvementList;
    }

    /**
     * Sets the value of the productInvolvementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCollection }
     *     
     */
    public void setProductInvolvementList(ProductCollection value) {
        this.productInvolvementList = value;
    }

    /**
     * Gets the value of the businessRoles property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleCollection }
     *     
     */
    public PartyRoleCollection getBusinessRoles() {
        return businessRoles;
    }

    /**
     * Sets the value of the businessRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleCollection }
     *     
     */
    public void setBusinessRoles(PartyRoleCollection value) {
        this.businessRoles = value;
    }

    /**
     * Gets the value of the categorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleCategory }
     *     
     */
    public PartyRoleCategory getCategorizedBy() {
        return categorizedBy;
    }

    /**
     * Sets the value of the categorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleCategory }
     *     
     */
    public void setCategorizedBy(PartyRoleCategory value) {
        this.categorizedBy = value;
    }

}
