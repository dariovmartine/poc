
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.common.v1_0.CharacteristicSpecCollection;


/**
 * <p>Java class for GetCharacteristicsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCharacteristicsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsList" type="{http://directvla.com/schema/businessdomain/common/v1-0}CharacteristicSpecCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharacteristicsResult", propOrder = {
    "characteristicsList"
})
public class GetCharacteristicsResult {

    @XmlElement(name = "CharacteristicsList")
    protected CharacteristicSpecCollection characteristicsList;

    /**
     * Gets the value of the characteristicsList property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicSpecCollection }
     *     
     */
    public CharacteristicSpecCollection getCharacteristicsList() {
        return characteristicsList;
    }

    /**
     * Sets the value of the characteristicsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicSpecCollection }
     *     
     */
    public void setCharacteristicsList(CharacteristicSpecCollection value) {
        this.characteristicsList = value;
    }

}
