
package com.directv.afe.billing.customer;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommercialProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgreementDetailSpearId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllowQtyToBeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowSleep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowedBusinessUnits" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="AllowedEventsId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AllowedForPurchasedOfferDefinition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowedMarketSegmentIds" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="AllowedModels" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}AllowedModelCollection" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}Availability" minOccurs="0"/>
 *         &lt;element name="AvailableDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CAEntitlements" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CAEntitlementCollection" minOccurs="0"/>
 *         &lt;element name="CaptureRuleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryWeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommercialProductIds" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="ContractPeriodIdToOverrideOnAD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DefaultChargePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DefaultFinanceOptionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EPCMappings" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CommercialProductEPCMappingCollection" minOccurs="0"/>
 *         &lt;element name="EditRulesId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExcludedCommercialProducts" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ProductCombinationScopeCollection" minOccurs="0"/>
 *         &lt;element name="Extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalProductCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Hyperlink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InvoiceLineTexts" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}CommercialProductInvoiceLineTextCollection" minOccurs="0"/>
 *         &lt;element name="IsUnitOfMeasurementRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxsdleepDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinSleepDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideCAEntitlements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrepaidRequiredBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RequiredCommercialProducts" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ProductCombinationScopeCollection" minOccurs="0"/>
 *         &lt;element name="SellFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SellTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxExternalProductCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TechnicalProductIds" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="TechnicalProducts" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}TechnicalProductCommercialProductCollection" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasurementId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UsersRoles" type="{http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialProduct", propOrder = {
    "agreementDetailSpearId",
    "allowQtyToBeUpdated",
    "allowSleep",
    "allowedBusinessUnits",
    "allowedEventsId",
    "allowedForPurchasedOfferDefinition",
    "allowedMarketSegmentIds",
    "allowedModels",
    "availability",
    "availableDate",
    "businessUnitId",
    "caEntitlements",
    "captureRuleId",
    "categoryId",
    "categoryWeight",
    "commercialProductIds",
    "contractPeriodIdToOverrideOnAD",
    "defaultChargePeriod",
    "defaultFinanceOptionId",
    "description",
    "epcMappings",
    "editRulesId",
    "excludedCommercialProducts",
    "extended",
    "externalProductCodeId",
    "hyperlink",
    "iconId",
    "id",
    "invoiceLineTexts",
    "isUnitOfMeasurementRequired",
    "matchQuantity",
    "maxsdleepDays",
    "minSleepDays",
    "name",
    "notes",
    "overrideCAEntitlements",
    "prepaidRequiredBalance",
    "requiredCommercialProducts",
    "sellFrom",
    "sellTo",
    "taxExternalProductCodeId",
    "technicalProductIds",
    "technicalProducts",
    "unitOfMeasurementId",
    "usersRoles"
})
public class CommercialProduct {

    @XmlElementRef(name = "AgreementDetailSpearId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> agreementDetailSpearId;
    @XmlElementRef(name = "AllowQtyToBeUpdated", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowQtyToBeUpdated;
    @XmlElementRef(name = "AllowSleep", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowSleep;
    @XmlElementRef(name = "AllowedBusinessUnits", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> allowedBusinessUnits;
    @XmlElementRef(name = "AllowedEventsId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> allowedEventsId;
    @XmlElementRef(name = "AllowedForPurchasedOfferDefinition", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowedForPurchasedOfferDefinition;
    @XmlElementRef(name = "AllowedMarketSegmentIds", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> allowedMarketSegmentIds;
    @XmlElementRef(name = "AllowedModels", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<AllowedModelCollection> allowedModels;
    @XmlElement(name = "Availability")
    @XmlSchemaType(name = "string")
    protected Availability availability;
    @XmlElementRef(name = "AvailableDate", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> availableDate;
    @XmlElementRef(name = "BusinessUnitId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> businessUnitId;
    @XmlElementRef(name = "CAEntitlements", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<CAEntitlementCollection> caEntitlements;
    @XmlElementRef(name = "CaptureRuleId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> captureRuleId;
    @XmlElementRef(name = "CategoryId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> categoryId;
    @XmlElementRef(name = "CategoryWeight", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> categoryWeight;
    @XmlElementRef(name = "CommercialProductIds", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> commercialProductIds;
    @XmlElementRef(name = "ContractPeriodIdToOverrideOnAD", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> contractPeriodIdToOverrideOnAD;
    @XmlElementRef(name = "DefaultChargePeriod", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> defaultChargePeriod;
    @XmlElementRef(name = "DefaultFinanceOptionId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> defaultFinanceOptionId;
    @XmlElementRef(name = "Description", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EPCMappings", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<CommercialProductEPCMappingCollection> epcMappings;
    @XmlElementRef(name = "EditRulesId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> editRulesId;
    @XmlElementRef(name = "ExcludedCommercialProducts", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductCombinationScopeCollection> excludedCommercialProducts;
    @XmlElementRef(name = "Extended", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extended;
    @XmlElementRef(name = "ExternalProductCodeId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> externalProductCodeId;
    @XmlElementRef(name = "Hyperlink", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hyperlink;
    @XmlElementRef(name = "IconId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> iconId;
    @XmlElementRef(name = "Id", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "InvoiceLineTexts", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<CommercialProductInvoiceLineTextCollection> invoiceLineTexts;
    @XmlElementRef(name = "IsUnitOfMeasurementRequired", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isUnitOfMeasurementRequired;
    @XmlElementRef(name = "MatchQuantity", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> matchQuantity;
    @XmlElementRef(name = "MaxsdleepDays", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> maxsdleepDays;
    @XmlElementRef(name = "MinSleepDays", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> minSleepDays;
    @XmlElementRef(name = "Name", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Notes", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "OverrideCAEntitlements", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> overrideCAEntitlements;
    @XmlElementRef(name = "PrepaidRequiredBalance", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> prepaidRequiredBalance;
    @XmlElementRef(name = "RequiredCommercialProducts", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductCombinationScopeCollection> requiredCommercialProducts;
    @XmlElementRef(name = "SellFrom", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sellFrom;
    @XmlElementRef(name = "SellTo", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sellTo;
    @XmlElementRef(name = "TaxExternalProductCodeId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> taxExternalProductCodeId;
    @XmlElementRef(name = "TechnicalProductIds", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> technicalProductIds;
    @XmlElementRef(name = "TechnicalProducts", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<TechnicalProductCommercialProductCollection> technicalProducts;
    @XmlElementRef(name = "UnitOfMeasurementId", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> unitOfMeasurementId;
    @XmlElementRef(name = "UsersRoles", namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> usersRoles;

    /**
     * Gets the value of the agreementDetailSpearId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAgreementDetailSpearId() {
        return agreementDetailSpearId;
    }

    /**
     * Sets the value of the agreementDetailSpearId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAgreementDetailSpearId(JAXBElement<Integer> value) {
        this.agreementDetailSpearId = value;
    }

    /**
     * Gets the value of the allowQtyToBeUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowQtyToBeUpdated() {
        return allowQtyToBeUpdated;
    }

    /**
     * Sets the value of the allowQtyToBeUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowQtyToBeUpdated(JAXBElement<Boolean> value) {
        this.allowQtyToBeUpdated = value;
    }

    /**
     * Gets the value of the allowSleep property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowSleep() {
        return allowSleep;
    }

    /**
     * Sets the value of the allowSleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowSleep(JAXBElement<Boolean> value) {
        this.allowSleep = value;
    }

    /**
     * Gets the value of the allowedBusinessUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getAllowedBusinessUnits() {
        return allowedBusinessUnits;
    }

    /**
     * Sets the value of the allowedBusinessUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setAllowedBusinessUnits(JAXBElement<ArrayOfint> value) {
        this.allowedBusinessUnits = value;
    }

    /**
     * Gets the value of the allowedEventsId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAllowedEventsId() {
        return allowedEventsId;
    }

    /**
     * Sets the value of the allowedEventsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAllowedEventsId(JAXBElement<Integer> value) {
        this.allowedEventsId = value;
    }

    /**
     * Gets the value of the allowedForPurchasedOfferDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowedForPurchasedOfferDefinition() {
        return allowedForPurchasedOfferDefinition;
    }

    /**
     * Sets the value of the allowedForPurchasedOfferDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowedForPurchasedOfferDefinition(JAXBElement<Boolean> value) {
        this.allowedForPurchasedOfferDefinition = value;
    }

    /**
     * Gets the value of the allowedMarketSegmentIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getAllowedMarketSegmentIds() {
        return allowedMarketSegmentIds;
    }

    /**
     * Sets the value of the allowedMarketSegmentIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setAllowedMarketSegmentIds(JAXBElement<ArrayOfint> value) {
        this.allowedMarketSegmentIds = value;
    }

    /**
     * Gets the value of the allowedModels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllowedModelCollection }{@code >}
     *     
     */
    public JAXBElement<AllowedModelCollection> getAllowedModels() {
        return allowedModels;
    }

    /**
     * Sets the value of the allowedModels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllowedModelCollection }{@code >}
     *     
     */
    public void setAllowedModels(JAXBElement<AllowedModelCollection> value) {
        this.allowedModels = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link Availability }
     *     
     */
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Availability }
     *     
     */
    public void setAvailability(Availability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the availableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAvailableDate() {
        return availableDate;
    }

    /**
     * Sets the value of the availableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAvailableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.availableDate = value;
    }

    /**
     * Gets the value of the businessUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Sets the value of the businessUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBusinessUnitId(JAXBElement<Integer> value) {
        this.businessUnitId = value;
    }

    /**
     * Gets the value of the caEntitlements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CAEntitlementCollection }{@code >}
     *     
     */
    public JAXBElement<CAEntitlementCollection> getCAEntitlements() {
        return caEntitlements;
    }

    /**
     * Sets the value of the caEntitlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CAEntitlementCollection }{@code >}
     *     
     */
    public void setCAEntitlements(JAXBElement<CAEntitlementCollection> value) {
        this.caEntitlements = value;
    }

    /**
     * Gets the value of the captureRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCaptureRuleId() {
        return captureRuleId;
    }

    /**
     * Sets the value of the captureRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCaptureRuleId(JAXBElement<Integer> value) {
        this.captureRuleId = value;
    }

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCategoryId(JAXBElement<Integer> value) {
        this.categoryId = value;
    }

    /**
     * Gets the value of the categoryWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCategoryWeight() {
        return categoryWeight;
    }

    /**
     * Sets the value of the categoryWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCategoryWeight(JAXBElement<Integer> value) {
        this.categoryWeight = value;
    }

    /**
     * Gets the value of the commercialProductIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getCommercialProductIds() {
        return commercialProductIds;
    }

    /**
     * Sets the value of the commercialProductIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setCommercialProductIds(JAXBElement<ArrayOfint> value) {
        this.commercialProductIds = value;
    }

    /**
     * Gets the value of the contractPeriodIdToOverrideOnAD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getContractPeriodIdToOverrideOnAD() {
        return contractPeriodIdToOverrideOnAD;
    }

    /**
     * Sets the value of the contractPeriodIdToOverrideOnAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setContractPeriodIdToOverrideOnAD(JAXBElement<Integer> value) {
        this.contractPeriodIdToOverrideOnAD = value;
    }

    /**
     * Gets the value of the defaultChargePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDefaultChargePeriod() {
        return defaultChargePeriod;
    }

    /**
     * Sets the value of the defaultChargePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDefaultChargePeriod(JAXBElement<Integer> value) {
        this.defaultChargePeriod = value;
    }

    /**
     * Gets the value of the defaultFinanceOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDefaultFinanceOptionId() {
        return defaultFinanceOptionId;
    }

    /**
     * Sets the value of the defaultFinanceOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDefaultFinanceOptionId(JAXBElement<Integer> value) {
        this.defaultFinanceOptionId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the epcMappings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommercialProductEPCMappingCollection }{@code >}
     *     
     */
    public JAXBElement<CommercialProductEPCMappingCollection> getEPCMappings() {
        return epcMappings;
    }

    /**
     * Sets the value of the epcMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommercialProductEPCMappingCollection }{@code >}
     *     
     */
    public void setEPCMappings(JAXBElement<CommercialProductEPCMappingCollection> value) {
        this.epcMappings = value;
    }

    /**
     * Gets the value of the editRulesId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEditRulesId() {
        return editRulesId;
    }

    /**
     * Sets the value of the editRulesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEditRulesId(JAXBElement<Integer> value) {
        this.editRulesId = value;
    }

    /**
     * Gets the value of the excludedCommercialProducts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}
     *     
     */
    public JAXBElement<ProductCombinationScopeCollection> getExcludedCommercialProducts() {
        return excludedCommercialProducts;
    }

    /**
     * Sets the value of the excludedCommercialProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}
     *     
     */
    public void setExcludedCommercialProducts(JAXBElement<ProductCombinationScopeCollection> value) {
        this.excludedCommercialProducts = value;
    }

    /**
     * Gets the value of the extended property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtended(JAXBElement<String> value) {
        this.extended = value;
    }

    /**
     * Gets the value of the externalProductCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExternalProductCodeId() {
        return externalProductCodeId;
    }

    /**
     * Sets the value of the externalProductCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExternalProductCodeId(JAXBElement<Integer> value) {
        this.externalProductCodeId = value;
    }

    /**
     * Gets the value of the hyperlink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHyperlink() {
        return hyperlink;
    }

    /**
     * Sets the value of the hyperlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHyperlink(JAXBElement<String> value) {
        this.hyperlink = value;
    }

    /**
     * Gets the value of the iconId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIconId() {
        return iconId;
    }

    /**
     * Sets the value of the iconId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIconId(JAXBElement<Integer> value) {
        this.iconId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = value;
    }

    /**
     * Gets the value of the invoiceLineTexts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommercialProductInvoiceLineTextCollection }{@code >}
     *     
     */
    public JAXBElement<CommercialProductInvoiceLineTextCollection> getInvoiceLineTexts() {
        return invoiceLineTexts;
    }

    /**
     * Sets the value of the invoiceLineTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommercialProductInvoiceLineTextCollection }{@code >}
     *     
     */
    public void setInvoiceLineTexts(JAXBElement<CommercialProductInvoiceLineTextCollection> value) {
        this.invoiceLineTexts = value;
    }

    /**
     * Gets the value of the isUnitOfMeasurementRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsUnitOfMeasurementRequired() {
        return isUnitOfMeasurementRequired;
    }

    /**
     * Sets the value of the isUnitOfMeasurementRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsUnitOfMeasurementRequired(JAXBElement<Boolean> value) {
        this.isUnitOfMeasurementRequired = value;
    }

    /**
     * Gets the value of the matchQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMatchQuantity() {
        return matchQuantity;
    }

    /**
     * Sets the value of the matchQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMatchQuantity(JAXBElement<Boolean> value) {
        this.matchQuantity = value;
    }

    /**
     * Gets the value of the maxsdleepDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMaxsdleepDays() {
        return maxsdleepDays;
    }

    /**
     * Sets the value of the maxsdleepDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMaxsdleepDays(JAXBElement<Integer> value) {
        this.maxsdleepDays = value;
    }

    /**
     * Gets the value of the minSleepDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMinSleepDays() {
        return minSleepDays;
    }

    /**
     * Sets the value of the minSleepDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMinSleepDays(JAXBElement<Integer> value) {
        this.minSleepDays = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the overrideCAEntitlements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOverrideCAEntitlements() {
        return overrideCAEntitlements;
    }

    /**
     * Sets the value of the overrideCAEntitlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOverrideCAEntitlements(JAXBElement<Boolean> value) {
        this.overrideCAEntitlements = value;
    }

    /**
     * Gets the value of the prepaidRequiredBalance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrepaidRequiredBalance() {
        return prepaidRequiredBalance;
    }

    /**
     * Sets the value of the prepaidRequiredBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrepaidRequiredBalance(JAXBElement<BigDecimal> value) {
        this.prepaidRequiredBalance = value;
    }

    /**
     * Gets the value of the requiredCommercialProducts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}
     *     
     */
    public JAXBElement<ProductCombinationScopeCollection> getRequiredCommercialProducts() {
        return requiredCommercialProducts;
    }

    /**
     * Sets the value of the requiredCommercialProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}
     *     
     */
    public void setRequiredCommercialProducts(JAXBElement<ProductCombinationScopeCollection> value) {
        this.requiredCommercialProducts = value;
    }

    /**
     * Gets the value of the sellFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSellFrom() {
        return sellFrom;
    }

    /**
     * Sets the value of the sellFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSellFrom(JAXBElement<XMLGregorianCalendar> value) {
        this.sellFrom = value;
    }

    /**
     * Gets the value of the sellTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSellTo() {
        return sellTo;
    }

    /**
     * Sets the value of the sellTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSellTo(JAXBElement<XMLGregorianCalendar> value) {
        this.sellTo = value;
    }

    /**
     * Gets the value of the taxExternalProductCodeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTaxExternalProductCodeId() {
        return taxExternalProductCodeId;
    }

    /**
     * Sets the value of the taxExternalProductCodeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTaxExternalProductCodeId(JAXBElement<Integer> value) {
        this.taxExternalProductCodeId = value;
    }

    /**
     * Gets the value of the technicalProductIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getTechnicalProductIds() {
        return technicalProductIds;
    }

    /**
     * Sets the value of the technicalProductIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setTechnicalProductIds(JAXBElement<ArrayOfint> value) {
        this.technicalProductIds = value;
    }

    /**
     * Gets the value of the technicalProducts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TechnicalProductCommercialProductCollection }{@code >}
     *     
     */
    public JAXBElement<TechnicalProductCommercialProductCollection> getTechnicalProducts() {
        return technicalProducts;
    }

    /**
     * Sets the value of the technicalProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TechnicalProductCommercialProductCollection }{@code >}
     *     
     */
    public void setTechnicalProducts(JAXBElement<TechnicalProductCommercialProductCollection> value) {
        this.technicalProducts = value;
    }

    /**
     * Gets the value of the unitOfMeasurementId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUnitOfMeasurementId() {
        return unitOfMeasurementId;
    }

    /**
     * Sets the value of the unitOfMeasurementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUnitOfMeasurementId(JAXBElement<Integer> value) {
        this.unitOfMeasurementId = value;
    }

    /**
     * Gets the value of the usersRoles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getUsersRoles() {
        return usersRoles;
    }

    /**
     * Sets the value of the usersRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setUsersRoles(JAXBElement<ArrayOfstring> value) {
        this.usersRoles = value;
    }

}
