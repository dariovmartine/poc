
package com.directvla.schema.businessdomain.common.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This class is an abstract base class that represents various Technician roles. These roles connote specific technical training and competence in a specific area, such as telecom.
 *             This is a DEN-ng class.
 * 
 * <p>Java class for Technician complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Technician">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}ValueNetworkRole">
 *       &lt;sequence>
 *         &lt;element name="IndividualRole" type="{http://directvla.com/schema/businessdomain/common/v1-0}Individual" minOccurs="0"/>
 *         &lt;element name="OwnsResource" type="{http://directvla.com/schema/businessdomain/common/v1-0}PhysicalDeviceCollection"/>
 *         &lt;element name="Dealer" type="{http://directvla.com/schema/businessdomain/common/v1-0}ServiceProvider"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Technician", propOrder = {
    "individualRole",
    "ownsResource",
    "dealer"
})
@XmlSeeAlso({
    TelecomTechnician.class
})
public abstract class Technician
    extends ValueNetworkRole
{

    @XmlElement(name = "IndividualRole")
    protected Individual individualRole;
    @XmlElement(name = "OwnsResource", required = true)
    protected PhysicalDeviceCollection ownsResource;
    @XmlElement(name = "Dealer", required = true)
    protected ServiceProvider dealer;

    /**
     * Gets the value of the individualRole property.
     * 
     * @return
     *     possible object is
     *     {@link Individual }
     *     
     */
    public Individual getIndividualRole() {
        return individualRole;
    }

    /**
     * Sets the value of the individualRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual }
     *     
     */
    public void setIndividualRole(Individual value) {
        this.individualRole = value;
    }

    /**
     * Gets the value of the ownsResource property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDeviceCollection }
     *     
     */
    public PhysicalDeviceCollection getOwnsResource() {
        return ownsResource;
    }

    /**
     * Sets the value of the ownsResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDeviceCollection }
     *     
     */
    public void setOwnsResource(PhysicalDeviceCollection value) {
        this.ownsResource = value;
    }

    /**
     * Gets the value of the dealer property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProvider }
     *     
     */
    public ServiceProvider getDealer() {
        return dealer;
    }

    /**
     * Sets the value of the dealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProvider }
     *     
     */
    public void setDealer(ServiceProvider value) {
        this.dealer = value;
    }

}
