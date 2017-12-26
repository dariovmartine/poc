
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerProduct" type="{http://directvla.com/schema/businessdomain/product/v1-0}Product"/>
 *         &lt;element name="CustomerOffers" type="{http://directvla.com/schema/businessdomain/product/v1-0}CustomerProductOffer" minOccurs="0"/>
 *         &lt;element name="ShippingOrder" type="{http://directvla.com/schema/businessdomain/common/v1-0}ShippingOrder"/>
 *         &lt;element name="LedgerAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder", propOrder = {
    "customerKey",
    "customerProduct",
    "customerOffers",
    "shippingOrder",
    "ledgerAccount"
})
public class CustomerOrder {

    @XmlElement(name = "CustomerKey", required = true)
    protected String customerKey;
    @XmlElement(name = "CustomerProduct", required = true)
    protected Product customerProduct;
    @XmlElement(name = "CustomerOffers")
    protected CustomerProductOffer customerOffers;
    @XmlElement(name = "ShippingOrder", required = true)
    protected ShippingOrder shippingOrder;
    @XmlElement(name = "LedgerAccount", required = true)
    protected String ledgerAccount;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the customerProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getCustomerProduct() {
        return customerProduct;
    }

    /**
     * Sets the value of the customerProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setCustomerProduct(Product value) {
        this.customerProduct = value;
    }

    /**
     * Gets the value of the customerOffers property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProductOffer }
     *     
     */
    public CustomerProductOffer getCustomerOffers() {
        return customerOffers;
    }

    /**
     * Sets the value of the customerOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProductOffer }
     *     
     */
    public void setCustomerOffers(CustomerProductOffer value) {
        this.customerOffers = value;
    }

    /**
     * Gets the value of the shippingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrder }
     *     
     */
    public ShippingOrder getShippingOrder() {
        return shippingOrder;
    }

    /**
     * Sets the value of the shippingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrder }
     *     
     */
    public void setShippingOrder(ShippingOrder value) {
        this.shippingOrder = value;
    }

    /**
     * Gets the value of the ledgerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerAccount() {
        return ledgerAccount;
    }

    /**
     * Sets the value of the ledgerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerAccount(String value) {
        this.ledgerAccount = value;
    }

}
