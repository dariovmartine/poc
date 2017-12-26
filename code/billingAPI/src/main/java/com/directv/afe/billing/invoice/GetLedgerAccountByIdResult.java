
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLedgerAccountByIdResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLedgerAccountByIdResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LedgerAccount" type="{http://directvla.com/schema/businessdomain/customer/v1-0}LedgerAccount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLedgerAccountByIdResult", namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", propOrder = {
    "ledgerAccount"
})
public class GetLedgerAccountByIdResult {

    @XmlElement(name = "LedgerAccount", required = true)
    protected LedgerAccount ledgerAccount;

    /**
     * Gets the value of the ledgerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link LedgerAccount }
     *     
     */
    public LedgerAccount getLedgerAccount() {
        return ledgerAccount;
    }

    /**
     * Sets the value of the ledgerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LedgerAccount }
     *     
     */
    public void setLedgerAccount(LedgerAccount value) {
        this.ledgerAccount = value;
    }

}
