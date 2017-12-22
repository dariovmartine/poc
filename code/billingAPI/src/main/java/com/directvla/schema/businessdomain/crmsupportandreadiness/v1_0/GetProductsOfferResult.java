
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.product.v1_0.ProductOfferCollection;


/**
 * <p>Java class for GetProductsOfferResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProductsOfferResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductsOffer" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductOfferCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductsOfferResult", propOrder = {
    "productsOffer"
})
public class GetProductsOfferResult {

    @XmlElement(name = "ProductsOffer", required = true)
    protected ProductOfferCollection productsOffer;

    /**
     * Gets the value of the productsOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOfferCollection }
     *     
     */
    public ProductOfferCollection getProductsOffer() {
        return productsOffer;
    }

    /**
     * Sets the value of the productsOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOfferCollection }
     *     
     */
    public void setProductsOffer(ProductOfferCollection value) {
        this.productsOffer = value;
    }

}
