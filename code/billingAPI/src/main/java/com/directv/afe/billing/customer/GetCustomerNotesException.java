
package com.directv.afe.billing.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="EntityAlreadyExistsException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}EntityAlreadyExistsException"/>
 *         &lt;element name="EntityNotFoundException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}EntityNotFoundException"/>
 *         &lt;element name="EntityInUseException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}EntityInUseException"/>
 *         &lt;element name="InternalErrorException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InternalErrorException"/>
 *         &lt;element name="MissingParameterException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}MissingParameterException"/>
 *         &lt;element name="InvalidParameterValueException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InvalidParameterValueException"/>
 *         &lt;element name="InvalidQueryParameterException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InvalidQueryParameterException"/>
 *         &lt;element name="InvalidRequestException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InvalidRequestException"/>
 *         &lt;element name="InvalidResponseException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InvalidResponseException"/>
 *         &lt;element name="InvalidSecurityTokenException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}InvalidSecurityTokenException"/>
 *         &lt;element name="AccessDeniedException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}AccessDeniedException"/>
 *         &lt;element name="ServiceUnavailableException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}ServiceUnavailableException"/>
 *         &lt;element name="OperationNotYetImplementedException" type="{http://directvla.com/schema/util/commonexceptions/v1-0}OperationNotYetImplementedException"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityAlreadyExistsException",
    "entityNotFoundException",
    "entityInUseException",
    "internalErrorException",
    "missingParameterException",
    "invalidParameterValueException",
    "invalidQueryParameterException",
    "invalidRequestException",
    "invalidResponseException",
    "invalidSecurityTokenException",
    "accessDeniedException",
    "serviceUnavailableException",
    "operationNotYetImplementedException"
})
@XmlRootElement(name = "GetCustomerNotesException")
public class GetCustomerNotesException {

    @XmlElement(name = "EntityAlreadyExistsException")
    protected EntityAlreadyExistsException entityAlreadyExistsException;
    @XmlElement(name = "EntityNotFoundException")
    protected EntityNotFoundException entityNotFoundException;
    @XmlElement(name = "EntityInUseException")
    protected EntityInUseException entityInUseException;
    @XmlElement(name = "InternalErrorException")
    protected InternalErrorException internalErrorException;
    @XmlElement(name = "MissingParameterException")
    protected MissingParameterException missingParameterException;
    @XmlElement(name = "InvalidParameterValueException")
    protected InvalidParameterValueException invalidParameterValueException;
    @XmlElement(name = "InvalidQueryParameterException")
    protected InvalidQueryParameterException invalidQueryParameterException;
    @XmlElement(name = "InvalidRequestException")
    protected InvalidRequestException invalidRequestException;
    @XmlElement(name = "InvalidResponseException")
    protected InvalidResponseException invalidResponseException;
    @XmlElement(name = "InvalidSecurityTokenException")
    protected InvalidSecurityTokenException invalidSecurityTokenException;
    @XmlElement(name = "AccessDeniedException")
    protected AccessDeniedException accessDeniedException;
    @XmlElement(name = "ServiceUnavailableException")
    protected ServiceUnavailableException serviceUnavailableException;
    @XmlElement(name = "OperationNotYetImplementedException")
    protected OperationNotYetImplementedException operationNotYetImplementedException;

    /**
     * Gets the value of the entityAlreadyExistsException property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAlreadyExistsException }
     *     
     */
    public EntityAlreadyExistsException getEntityAlreadyExistsException() {
        return entityAlreadyExistsException;
    }

    /**
     * Sets the value of the entityAlreadyExistsException property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAlreadyExistsException }
     *     
     */
    public void setEntityAlreadyExistsException(EntityAlreadyExistsException value) {
        this.entityAlreadyExistsException = value;
    }

    /**
     * Gets the value of the entityNotFoundException property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNotFoundException }
     *     
     */
    public EntityNotFoundException getEntityNotFoundException() {
        return entityNotFoundException;
    }

    /**
     * Sets the value of the entityNotFoundException property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNotFoundException }
     *     
     */
    public void setEntityNotFoundException(EntityNotFoundException value) {
        this.entityNotFoundException = value;
    }

    /**
     * Gets the value of the entityInUseException property.
     * 
     * @return
     *     possible object is
     *     {@link EntityInUseException }
     *     
     */
    public EntityInUseException getEntityInUseException() {
        return entityInUseException;
    }

    /**
     * Sets the value of the entityInUseException property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityInUseException }
     *     
     */
    public void setEntityInUseException(EntityInUseException value) {
        this.entityInUseException = value;
    }

    /**
     * Gets the value of the internalErrorException property.
     * 
     * @return
     *     possible object is
     *     {@link InternalErrorException }
     *     
     */
    public InternalErrorException getInternalErrorException() {
        return internalErrorException;
    }

    /**
     * Sets the value of the internalErrorException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalErrorException }
     *     
     */
    public void setInternalErrorException(InternalErrorException value) {
        this.internalErrorException = value;
    }

    /**
     * Gets the value of the missingParameterException property.
     * 
     * @return
     *     possible object is
     *     {@link MissingParameterException }
     *     
     */
    public MissingParameterException getMissingParameterException() {
        return missingParameterException;
    }

    /**
     * Sets the value of the missingParameterException property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingParameterException }
     *     
     */
    public void setMissingParameterException(MissingParameterException value) {
        this.missingParameterException = value;
    }

    /**
     * Gets the value of the invalidParameterValueException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidParameterValueException }
     *     
     */
    public InvalidParameterValueException getInvalidParameterValueException() {
        return invalidParameterValueException;
    }

    /**
     * Sets the value of the invalidParameterValueException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidParameterValueException }
     *     
     */
    public void setInvalidParameterValueException(InvalidParameterValueException value) {
        this.invalidParameterValueException = value;
    }

    /**
     * Gets the value of the invalidQueryParameterException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidQueryParameterException }
     *     
     */
    public InvalidQueryParameterException getInvalidQueryParameterException() {
        return invalidQueryParameterException;
    }

    /**
     * Sets the value of the invalidQueryParameterException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidQueryParameterException }
     *     
     */
    public void setInvalidQueryParameterException(InvalidQueryParameterException value) {
        this.invalidQueryParameterException = value;
    }

    /**
     * Gets the value of the invalidRequestException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidRequestException }
     *     
     */
    public InvalidRequestException getInvalidRequestException() {
        return invalidRequestException;
    }

    /**
     * Sets the value of the invalidRequestException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidRequestException }
     *     
     */
    public void setInvalidRequestException(InvalidRequestException value) {
        this.invalidRequestException = value;
    }

    /**
     * Gets the value of the invalidResponseException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidResponseException }
     *     
     */
    public InvalidResponseException getInvalidResponseException() {
        return invalidResponseException;
    }

    /**
     * Sets the value of the invalidResponseException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidResponseException }
     *     
     */
    public void setInvalidResponseException(InvalidResponseException value) {
        this.invalidResponseException = value;
    }

    /**
     * Gets the value of the invalidSecurityTokenException property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidSecurityTokenException }
     *     
     */
    public InvalidSecurityTokenException getInvalidSecurityTokenException() {
        return invalidSecurityTokenException;
    }

    /**
     * Sets the value of the invalidSecurityTokenException property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidSecurityTokenException }
     *     
     */
    public void setInvalidSecurityTokenException(InvalidSecurityTokenException value) {
        this.invalidSecurityTokenException = value;
    }

    /**
     * Gets the value of the accessDeniedException property.
     * 
     * @return
     *     possible object is
     *     {@link AccessDeniedException }
     *     
     */
    public AccessDeniedException getAccessDeniedException() {
        return accessDeniedException;
    }

    /**
     * Sets the value of the accessDeniedException property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDeniedException }
     *     
     */
    public void setAccessDeniedException(AccessDeniedException value) {
        this.accessDeniedException = value;
    }

    /**
     * Gets the value of the serviceUnavailableException property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceUnavailableException }
     *     
     */
    public ServiceUnavailableException getServiceUnavailableException() {
        return serviceUnavailableException;
    }

    /**
     * Sets the value of the serviceUnavailableException property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceUnavailableException }
     *     
     */
    public void setServiceUnavailableException(ServiceUnavailableException value) {
        this.serviceUnavailableException = value;
    }

    /**
     * Gets the value of the operationNotYetImplementedException property.
     * 
     * @return
     *     possible object is
     *     {@link OperationNotYetImplementedException }
     *     
     */
    public OperationNotYetImplementedException getOperationNotYetImplementedException() {
        return operationNotYetImplementedException;
    }

    /**
     * Sets the value of the operationNotYetImplementedException property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationNotYetImplementedException }
     *     
     */
    public void setOperationNotYetImplementedException(OperationNotYetImplementedException value) {
        this.operationNotYetImplementedException = value;
    }

}
