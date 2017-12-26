
package com.directv.afe.billing.invoice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "LedgerAccount", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", propOrder = {
    "rest"
})
public class LedgerAccount
    extends Category
{

    @XmlElementRefs({
        @XmlElementRef(name = "ReverseLedgerAccountId", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Code", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Type", namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Code" is used by two different parts of a schema. See: 
     * line 263 of http://rgqamesb.dtvdev.net:80/DTVLA-Services/ManageBillingEventsService?SCHEMA%2FDTVLA-Services%2FManageBillingEventsService%2FResources%2FSchemas%2FXMLSchema_1383193253
     * line 302 of http://rgqamesb.dtvdev.net:80/DTVLA-Services/ManageBillingEventsService?SCHEMA%2FDTVLA-Services%2FManageBillingEventsService%2FResources%2FSchemas%2FXMLSchema_-1452033678
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.rest;
    }

}
