
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCharacteristicByTypeAndNameResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCharacteristicByTypeAndNameResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Characteristic" type="{http://directvla.com/schema/businessdomain/common/v1-0}CharacteristicSpec"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCharacteristicByTypeAndNameResult", propOrder = {
    "characteristic"
})
public class GetCharacteristicByTypeAndNameResult {

    @XmlElement(name = "Characteristic", required = true)
    protected CharacteristicSpec characteristic;

    /**
     * Gets the value of the characteristic property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicSpec }
     *     
     */
    public CharacteristicSpec getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicSpec }
     *     
     */
    public void setCharacteristic(CharacteristicSpec value) {
        this.characteristic = value;
    }

}
