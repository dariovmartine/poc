
package com.directvla.schema.businessdomain.product.v1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.directvla.schema.businessdomain.common.v1_0.Agreement;
import com.directvla.schema.businessdomain.common.v1_0.Category;
import com.directvla.schema.businessdomain.common.v1_0.PhysicalResourceCollection;
import com.directvla.schema.businessdomain.common.v1_0.TimePeriod;
import com.directvla.schema.businessdomain.common.v1_0.Vendor;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productStatus" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductStatus" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://directvla.com/schema/businessdomain/common/v1-0}TimePeriod" minOccurs="0"/>
 *         &lt;element name="productCategory" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductCategory" minOccurs="0"/>
 *         &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractStartDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractEndDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="financeOption" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="contractPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="financialAccountID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="agreement" type="{http://directvla.com/schema/businessdomain/common/v1-0}Agreement" minOccurs="0"/>
 *         &lt;element name="marketSegment" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *         &lt;element name="warrantyEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ProductHasPhysicalResources" type="{http://directvla.com/schema/businessdomain/common/v1-0}PhysicalResourceCollection" minOccurs="0"/>
 *         &lt;element name="ProductPriceCollection" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductPriceCollection" minOccurs="0"/>
 *         &lt;element name="ProductCharacteristicValueCollection" type="{http://directvla.com/schema/businessdomain/product/v1-0}ProductCharacteristicValueCollection" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://directvla.com/schema/businessdomain/common/v1-0}Vendor" minOccurs="0"/>
 *         &lt;element name="commissionOption" type="{http://directvla.com/schema/businessdomain/common/v1-0}Category" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "productKey",
    "id",
    "customerKey",
    "name",
    "code",
    "description",
    "productStatus",
    "validFor",
    "productCategory",
    "productPrice",
    "contractStartDatetime",
    "contractEndDatetime",
    "financeOption",
    "contractPeriod",
    "financialAccountID",
    "agreement",
    "marketSegment",
    "warrantyEndDate",
    "productHasPhysicalResources",
    "productPriceCollection",
    "productCharacteristicValueCollection",
    "vendor",
    "commissionOption"
})
public class Product {

    @XmlElement(required = true)
    protected String productKey;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "CustomerKey")
    protected String customerKey;
    protected String name;
    protected String code;
    protected String description;
    protected ProductStatus productStatus;
    protected TimePeriod validFor;
    protected ProductCategory productCategory;
    protected BigDecimal productPrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractStartDatetime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractEndDatetime;
    protected Category financeOption;
    protected Integer contractPeriod;
    protected Integer financialAccountID;
    protected Agreement agreement;
    protected Category marketSegment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar warrantyEndDate;
    @XmlElement(name = "ProductHasPhysicalResources")
    protected PhysicalResourceCollection productHasPhysicalResources;
    @XmlElement(name = "ProductPriceCollection")
    protected ProductPriceCollection productPriceCollection;
    @XmlElement(name = "ProductCharacteristicValueCollection")
    protected ProductCharacteristicValueCollection productCharacteristicValueCollection;
    protected Vendor vendor;
    protected Category commissionOption;

    /**
     * Gets the value of the productKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getProductStatus() {
        return productStatus;
    }

    /**
     * Sets the value of the productStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setProductStatus(ProductStatus value) {
        this.productStatus = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory }
     *     
     */
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory }
     *     
     */
    public void setProductCategory(ProductCategory value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPrice(BigDecimal value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the contractStartDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDatetime() {
        return contractStartDatetime;
    }

    /**
     * Sets the value of the contractStartDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDatetime(XMLGregorianCalendar value) {
        this.contractStartDatetime = value;
    }

    /**
     * Gets the value of the contractEndDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDatetime() {
        return contractEndDatetime;
    }

    /**
     * Sets the value of the contractEndDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDatetime(XMLGregorianCalendar value) {
        this.contractEndDatetime = value;
    }

    /**
     * Gets the value of the financeOption property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getFinanceOption() {
        return financeOption;
    }

    /**
     * Sets the value of the financeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setFinanceOption(Category value) {
        this.financeOption = value;
    }

    /**
     * Gets the value of the contractPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractPeriod() {
        return contractPeriod;
    }

    /**
     * Sets the value of the contractPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractPeriod(Integer value) {
        this.contractPeriod = value;
    }

    /**
     * Gets the value of the financialAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialAccountID() {
        return financialAccountID;
    }

    /**
     * Sets the value of the financialAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialAccountID(Integer value) {
        this.financialAccountID = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement }
     *     
     */
    public Agreement getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement }
     *     
     */
    public void setAgreement(Agreement value) {
        this.agreement = value;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getMarketSegment() {
        return marketSegment;
    }

    /**
     * Sets the value of the marketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setMarketSegment(Category value) {
        this.marketSegment = value;
    }

    /**
     * Gets the value of the warrantyEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantyEndDate() {
        return warrantyEndDate;
    }

    /**
     * Sets the value of the warrantyEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantyEndDate(XMLGregorianCalendar value) {
        this.warrantyEndDate = value;
    }

    /**
     * Gets the value of the productHasPhysicalResources property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalResourceCollection }
     *     
     */
    public PhysicalResourceCollection getProductHasPhysicalResources() {
        return productHasPhysicalResources;
    }

    /**
     * Sets the value of the productHasPhysicalResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalResourceCollection }
     *     
     */
    public void setProductHasPhysicalResources(PhysicalResourceCollection value) {
        this.productHasPhysicalResources = value;
    }

    /**
     * Gets the value of the productPriceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPriceCollection }
     *     
     */
    public ProductPriceCollection getProductPriceCollection() {
        return productPriceCollection;
    }

    /**
     * Sets the value of the productPriceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPriceCollection }
     *     
     */
    public void setProductPriceCollection(ProductPriceCollection value) {
        this.productPriceCollection = value;
    }

    /**
     * Gets the value of the productCharacteristicValueCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristicValueCollection }
     *     
     */
    public ProductCharacteristicValueCollection getProductCharacteristicValueCollection() {
        return productCharacteristicValueCollection;
    }

    /**
     * Sets the value of the productCharacteristicValueCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristicValueCollection }
     *     
     */
    public void setProductCharacteristicValueCollection(ProductCharacteristicValueCollection value) {
        this.productCharacteristicValueCollection = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the commissionOption property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCommissionOption() {
        return commissionOption;
    }

    /**
     * Sets the value of the commissionOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCommissionOption(Category value) {
        this.commissionOption = value;
    }

}
