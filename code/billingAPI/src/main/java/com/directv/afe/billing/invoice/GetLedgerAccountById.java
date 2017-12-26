
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLedgerAccountById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLedgerAccountById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LedgerAccountId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLedgerAccountById", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "ledgerAccountId"
})
public class GetLedgerAccountById {

    @XmlElement(name = "LedgerAccountId")
    protected int ledgerAccountId;

    /**
     * Gets the value of the ledgerAccountId property.
     * 
     */
    public int getLedgerAccountId() {
        return ledgerAccountId;
    }

    /**
     * Sets the value of the ledgerAccountId property.
     * 
     */
    public void setLedgerAccountId(int value) {
        this.ledgerAccountId = value;
    }

}
