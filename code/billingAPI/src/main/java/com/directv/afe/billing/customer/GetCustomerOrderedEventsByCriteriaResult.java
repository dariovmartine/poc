
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerOrderedEventsByCriteriaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerOrderedEventsByCriteriaResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderedEventCollection" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerOrderedEventsByCriteriaResult", propOrder = {
    "orderedEventCollection"
})
public class GetCustomerOrderedEventsByCriteriaResult {

    @XmlElement(name = "OrderedEventCollection", required = true)
    protected ProductCollection orderedEventCollection;

    /**
     * Gets the value of the orderedEventCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCollection }
     *     
     */
    public ProductCollection getOrderedEventCollection() {
        return orderedEventCollection;
    }

    /**
     * Sets the value of the orderedEventCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCollection }
     *     
     */
    public void setOrderedEventCollection(ProductCollection value) {
        this.orderedEventCollection = value;
    }

}
