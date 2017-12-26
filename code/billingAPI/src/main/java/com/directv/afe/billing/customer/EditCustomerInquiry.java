
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditCustomerInquiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditCustomerInquiry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustInqr" type="{http://directvla.com/schema/businessdomain/customer/v1-0}CustomerInquiry"/>
 *         &lt;element name="Response" type="{http://directvla.com/schema/businessdomain/common/v1-0}Response"/>
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
@XmlType(name = "EditCustomerInquiry", propOrder = {
    "custInqr",
    "response",
    "reason"
})
public class EditCustomerInquiry {

    @XmlElement(name = "CustInqr", required = true)
    protected CustomerInquiry custInqr;
    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "Reason")
    protected int reason;

    /**
     * Gets the value of the custInqr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInquiry }
     *     
     */
    public CustomerInquiry getCustInqr() {
        return custInqr;
    }

    /**
     * Sets the value of the custInqr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInquiry }
     *     
     */
    public void setCustInqr(CustomerInquiry value) {
        this.custInqr = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
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
