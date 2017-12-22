
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.product.v1_0.CustomerProductOfferCollection;


/**
 * <p>Java class for GetCustomerProductsOfferResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerProductsOfferResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProductsOffer" type="{http://directvla.com/schema/businessdomain/product/v1-0}CustomerProductOfferCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerProductsOfferResult", propOrder = {
    "customerProductsOffer"
})
public class GetCustomerProductsOfferResult {

    @XmlElement(name = "CustomerProductsOffer", required = true)
    protected CustomerProductOfferCollection customerProductsOffer;

    /**
     * Gets the value of the customerProductsOffer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProductOfferCollection }
     *     
     */
    public CustomerProductOfferCollection getCustomerProductsOffer() {
        return customerProductsOffer;
    }

    /**
     * Sets the value of the customerProductsOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProductOfferCollection }
     *     
     */
    public void setCustomerProductsOffer(CustomerProductOfferCollection value) {
        this.customerProductsOffer = value;
    }

}
