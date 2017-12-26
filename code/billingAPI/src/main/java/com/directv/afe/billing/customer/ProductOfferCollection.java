
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOfferCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOfferCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductOffer" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductOffer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOfferCollection", namespace = "http://directvla.com/schema/businessdomain/product/v1-0", propOrder = {
    "productOffer"
})
public class ProductOfferCollection {

    @XmlElement(name = "ProductOffer")
    protected List<ProductOffer> productOffer;

    /**
     * Gets the value of the productOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOffer }
     * 
     * 
     */
    public List<ProductOffer> getProductOffer() {
        if (productOffer == null) {
            productOffer = new ArrayList<ProductOffer>();
        }
        return this.productOffer;
    }

}
