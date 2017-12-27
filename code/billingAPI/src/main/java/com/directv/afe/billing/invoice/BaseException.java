
package com.directv.afe.billing.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://directvla.com/schema/util/commondatatypes/v1-0}CodeType"/>
 *         &lt;element name="message" type="{http://directvla.com/schema/util/commondatatypes/v1-0}MessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseException", namespace = "http://directvla.com/schema/util/commonexceptions/v1-0", propOrder = {
    "code",
    "message"
})
@XmlSeeAlso({
    EntityAlreadyExistsException.class,
    EntityNotFoundException.class,
    EntityInUseException.class,
    InternalErrorException.class,
    MissingParameterException.class,
    InvalidParameterValueException.class,
    InvalidQueryParameterException.class,
    InvalidRequestException.class,
    InvalidResponseException.class,
    InvalidSecurityTokenException.class,
    AccessDeniedException.class,
    ServiceUnavailableException.class,
    OperationNotYetImplementedException.class
})
public abstract class BaseException {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}