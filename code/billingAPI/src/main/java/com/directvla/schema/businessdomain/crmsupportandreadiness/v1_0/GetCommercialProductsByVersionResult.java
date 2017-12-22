
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCommercialProductsByVersionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCommercialProductsByVersionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialProductCollection" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CommercialProductCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCommercialProductsByVersionResult", propOrder = {
    "commercialProductCollection"
})
public class GetCommercialProductsByVersionResult {

    @XmlElement(name = "CommercialProductCollection", required = true)
    protected CommercialProductCollection commercialProductCollection;

    /**
     * Gets the value of the commercialProductCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialProductCollection }
     *     
     */
    public CommercialProductCollection getCommercialProductCollection() {
        return commercialProductCollection;
    }

    /**
     * Sets the value of the commercialProductCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialProductCollection }
     *     
     */
    public void setCommercialProductCollection(CommercialProductCollection value) {
        this.commercialProductCollection = value;
    }

}
