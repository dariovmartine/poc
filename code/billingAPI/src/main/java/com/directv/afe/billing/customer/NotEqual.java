
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotEqual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotEqual">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Restriction">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValueOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEqual", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "value",
    "valueOption"
})
public class NotEqual
    extends Restriction
{

    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "ValueOption")
    protected String valueOption;

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
     * Gets the value of the valueOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueOption() {
        return valueOption;
    }

    /**
     * Sets the value of the valueOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueOption(String value) {
        this.valueOption = value;
    }

}
