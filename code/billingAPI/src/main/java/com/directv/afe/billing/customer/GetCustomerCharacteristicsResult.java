
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomerCharacteristicsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerCharacteristicsResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsList" type="{http://directvla.com/schema/businessdomain/common/v1-0}CharacteristicsCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerCharacteristicsResult", propOrder = {
    "characteristicsList"
})
public class GetCustomerCharacteristicsResult {

    @XmlElement(name = "CharacteristicsList")
    protected CharacteristicsCollection characteristicsList;

    /**
     * Gets the value of the characteristicsList property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsCollection }
     *     
     */
    public CharacteristicsCollection getCharacteristicsList() {
        return characteristicsList;
    }

    /**
     * Sets the value of the characteristicsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsCollection }
     *     
     */
    public void setCharacteristicsList(CharacteristicsCollection value) {
        this.characteristicsList = value;
    }

}
