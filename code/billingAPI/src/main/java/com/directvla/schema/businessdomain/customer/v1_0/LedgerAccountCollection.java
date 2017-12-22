
package com.directvla.schema.businessdomain.customer.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LedgerAccountCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LedgerAccountCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LedgerAccount" type="{http://directvla.com/schema/businessdomain/customer/v1-0}LedgerAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LedgerAccountCollection", propOrder = {
    "ledgerAccount"
})
public class LedgerAccountCollection {

    @XmlElement(name = "LedgerAccount")
    protected List<LedgerAccount> ledgerAccount;

    /**
     * Gets the value of the ledgerAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ledgerAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLedgerAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LedgerAccount }
     * 
     * 
     */
    public List<LedgerAccount> getLedgerAccount() {
        if (ledgerAccount == null) {
            ledgerAccount = new ArrayList<LedgerAccount>();
        }
        return this.ledgerAccount;
    }

}