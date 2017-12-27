
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductCharacteristicValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCharacteristicValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="ProductSpecCharacteristic" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductSpecCharacteristic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristicValue", namespace = "http://directvla.com/schema/businessdomain/product/v1-0", propOrder = {
    "value",
    "validFor",
    "productSpecCharacteristic"
})
public class ProductCharacteristicValue {

    protected String value;
    protected TimePeriod validFor;
    @XmlElement(name = "ProductSpecCharacteristic")
    protected ProductSpecCharacteristic productSpecCharacteristic;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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
     * Gets the value of the productSpecCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecCharacteristic }
     *     
     */
    public ProductSpecCharacteristic getProductSpecCharacteristic() {
        return productSpecCharacteristic;
    }

    /**
     * Sets the value of the productSpecCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecCharacteristic }
     *     
     */
    public void setProductSpecCharacteristic(ProductSpecCharacteristic value) {
        this.productSpecCharacteristic = value;
    }

}