
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacteristicSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Category">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicSpecRef" type="{http://directvla.com/schema/businessdomain/common/v1-0}CharacteristicSpec" minOccurs="0"/>
 *         &lt;element name="CharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicSpec", propOrder = {
    "characteristicSpecRef",
    "characteristicValue",
    "description"
})
public class CharacteristicSpec
    extends Category
{

    @XmlElement(name = "CharacteristicSpecRef")
    protected CharacteristicSpec characteristicSpecRef;
    @XmlElement(name = "CharacteristicValue")
    protected String characteristicValue;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the characteristicSpecRef property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicSpec }
     *     
     */
    public CharacteristicSpec getCharacteristicSpecRef() {
        return characteristicSpecRef;
    }

    /**
     * Sets the value of the characteristicSpecRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicSpec }
     *     
     */
    public void setCharacteristicSpecRef(CharacteristicSpec value) {
        this.characteristicSpecRef = value;
    }

    /**
     * Gets the value of the characteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicValue() {
        return characteristicValue;
    }

    /**
     * Sets the value of the characteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicValue(String value) {
        this.characteristicValue = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
