
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for In complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="In">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Restriction">
 *       &lt;sequence>
 *         &lt;element name="Values" type="{http://directvla.com/schema/businessdomain/common/v1-0}ValueCollection"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "In", namespace = "http://directvla.com/schema/businessdomain/common/v1-0", propOrder = {
    "values"
})
public class In
    extends Restriction
{

    @XmlElement(name = "Values", required = true)
    protected ValueCollection values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ValueCollection }
     *     
     */
    public ValueCollection getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCollection }
     *     
     */
    public void setValues(ValueCollection value) {
        this.values = value;
    }

}
