
package com.directvla.schema.businessdomain.product.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerProductOfferCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProductOfferCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerProductOffer" type="{http://directvla.com/schema/businessdomain/product/v1-0}CustomerProductOffer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProductOfferCollection", propOrder = {
    "customerProductOffer"
})
public class CustomerProductOfferCollection {

    @XmlElement(name = "CustomerProductOffer")
    protected List<CustomerProductOffer> customerProductOffer;

    /**
     * Gets the value of the customerProductOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerProductOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerProductOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProductOffer }
     * 
     * 
     */
    public List<CustomerProductOffer> getCustomerProductOffer() {
        if (customerProductOffer == null) {
            customerProductOffer = new ArrayList<CustomerProductOffer>();
        }
        return this.customerProductOffer;
    }

}