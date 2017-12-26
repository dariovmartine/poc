
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddCustomerCharacteristicResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerCharacteristicResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerCharacteristicResult", propOrder = {
    "characteristicID"
})
public class AddCustomerCharacteristicResult {

    @XmlElement(name = "CharacteristicID")
    protected int characteristicID;

    /**
     * Gets the value of the characteristicID property.
     * 
     */
    public int getCharacteristicID() {
        return characteristicID;
    }

    /**
     * Sets the value of the characteristicID property.
     * 
     */
    public void setCharacteristicID(int value) {
        this.characteristicID = value;
    }

}
