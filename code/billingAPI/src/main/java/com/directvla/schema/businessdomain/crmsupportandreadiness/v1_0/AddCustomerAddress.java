
package com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.directvla.schema.businessdomain.common.v1_0.UrbanPropertyAddress;
import com.directvla.schema.businessdomain.customer.v1_0.Customer;


/**
 * <p>Java class for AddCustomerAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddCustomerAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cust" type="{http://directvla.com/schema/businessdomain/customer/v1-0}Customer"/>
 *         &lt;element name="CustAddr" type="{http://directvla.com/schema/businessdomain/common/v1-0}UrbanPropertyAddress"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomerAddress", propOrder = {
    "cust",
    "custAddr",
    "reason"
})
public class AddCustomerAddress {

    @XmlElement(name = "Cust", required = true)
    protected Customer cust;
    @XmlElement(name = "CustAddr", required = true)
    protected UrbanPropertyAddress custAddr;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the cust property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCust() {
        return cust;
    }

    /**
     * Sets the value of the cust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCust(Customer value) {
        this.cust = value;
    }

    /**
     * Gets the value of the custAddr property.
     * 
     * @return
     *     possible object is
     *     {@link UrbanPropertyAddress }
     *     
     */
    public UrbanPropertyAddress getCustAddr() {
        return custAddr;
    }

    /**
     * Sets the value of the custAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrbanPropertyAddress }
     *     
     */
    public void setCustAddr(UrbanPropertyAddress value) {
        this.custAddr = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     */
    public int getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     */
    public void setReason(int value) {
        this.reason = value;
    }

}
