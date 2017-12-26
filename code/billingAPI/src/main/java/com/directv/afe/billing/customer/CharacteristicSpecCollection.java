
package com.directv.afe.billing.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacteristicSpecCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicSpecCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicSpec" type="{http://directvla.com/schema/businessdomain/common/v1-0}CharacteristicSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacteristicSpecCollection", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "characteristicSpec"
})
public class CharacteristicSpecCollection {

    @XmlElement(name = "CharacteristicSpec")
    protected List<CharacteristicSpec> characteristicSpec;

    /**
     * Gets the value of the characteristicSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicSpec }
     * 
     * 
     */
    public List<CharacteristicSpec> getCharacteristicSpec() {
        if (characteristicSpec == null) {
            characteristicSpec = new ArrayList<CharacteristicSpec>();
        }
        return this.characteristicSpec;
    }

}
