
package com.directvla.schema.businessdomain.common.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.product.v1_0.ProductCollection;


/**
 * <p>Java class for ShippingOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://directvla.com/schema/businessdomain/common/v1-0}Request">
 *       &lt;sequence>
 *         &lt;element name="shippingOrderKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installationPrice" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="activationPrice" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductList" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductCollection" minOccurs="0"/>
 *         &lt;element name="SoldBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingMethodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StampDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinancialAccountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AgreementId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingOrder", propOrder = {
    "shippingOrderKey",
    "name",
    "code",
    "installationPrice",
    "activationPrice",
    "productList",
    "soldBy",
    "shippingMethodId",
    "contractNumber",
    "contractCode",
    "stampDate",
    "financialAccountId",
    "agreementId"
})
public class ShippingOrder
    extends Request
{

    protected String shippingOrderKey;
    protected String name;
    protected String code;
    @XmlElement(type = Long.class)
    protected List<Long> installationPrice;
    @XmlElement(type = Long.class)
    protected List<Long> activationPrice;
    @XmlElement(name = "ProductList")
    protected ProductCollection productList;
    @XmlElement(name = "SoldBy")
    protected String soldBy;
    @XmlElement(name = "ShippingMethodId")
    protected String shippingMethodId;
    protected String contractNumber;
    protected String contractCode;
    @XmlElement(name = "StampDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stampDate;
    @XmlElement(name = "FinancialAccountId")
    protected Integer financialAccountId;
    @XmlElement(name = "AgreementId")
    protected Integer agreementId;

    /**
     * Gets the value of the shippingOrderKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOrderKey() {
        return shippingOrderKey;
    }

    /**
     * Sets the value of the shippingOrderKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOrderKey(String value) {
        this.shippingOrderKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the installationPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the installationPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstallationPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getInstallationPrice() {
        if (installationPrice == null) {
            installationPrice = new ArrayList<Long>();
        }
        return this.installationPrice;
    }

    /**
     * Gets the value of the activationPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getActivationPrice() {
        if (activationPrice == null) {
            activationPrice = new ArrayList<Long>();
        }
        return this.activationPrice;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCollection }
     *     
     */
    public ProductCollection getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCollection }
     *     
     */
    public void setProductList(ProductCollection value) {
        this.productList = value;
    }

    /**
     * Gets the value of the soldBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldBy(String value) {
        this.soldBy = value;
    }

    /**
     * Gets the value of the shippingMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingMethodId() {
        return shippingMethodId;
    }

    /**
     * Sets the value of the shippingMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingMethodId(String value) {
        this.shippingMethodId = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Gets the value of the stampDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStampDate() {
        return stampDate;
    }

    /**
     * Sets the value of the stampDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStampDate(XMLGregorianCalendar value) {
        this.stampDate = value;
    }

    /**
     * Gets the value of the financialAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialAccountId() {
        return financialAccountId;
    }

    /**
     * Sets the value of the financialAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialAccountId(Integer value) {
        this.financialAccountId = value;
    }

    /**
     * Gets the value of the agreementId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgreementId() {
        return agreementId;
    }

    /**
     * Sets the value of the agreementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgreementId(Integer value) {
        this.agreementId = value;
    }

}
