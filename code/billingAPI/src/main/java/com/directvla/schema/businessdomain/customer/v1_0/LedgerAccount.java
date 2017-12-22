
package com.directvla.schema.businessdomain.customer.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.common.v1_0.Category;


/**
 * <p>Java class for LedgerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LedgerAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Category">
 *       &lt;sequence>
 *         &lt;element name="ReverseLedgerAccountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LedgerAccount", propOrder = {
    "reverseLedgerAccountId",
    "type"
})
public class LedgerAccount
    extends Category
{

    @XmlElement(name = "ReverseLedgerAccountId")
    protected Integer reverseLedgerAccountId;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the reverseLedgerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReverseLedgerAccountId() {
        return reverseLedgerAccountId;
    }

    /**
     * Sets the value of the reverseLedgerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReverseLedgerAccountId(Integer value) {
        this.reverseLedgerAccountId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
