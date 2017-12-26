
package com.directv.afe.billing.customer;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.directv.afe.billing.customer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WorkOrderType_QNAME = new QName("http://directvla.com/schema/businessdomain/common/v1-0", "WorkOrderType");
    private final static QName _WorkOrderItemType_QNAME = new QName("http://directvla.com/schema/businessdomain/common/v1-0", "WorkOrderItemType");
    private final static QName _UrbanPropertyAddress_QNAME = new QName("http://directvla.com/schema/businessdomain/common/v1-0", "UrbanPropertyAddress");
    private final static QName _Product_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "Product");
    private final static QName _ProductType_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "ProductType");
    private final static QName _FilterItem_QNAME = new QName("http://directvla.com/schema/businessdomain/common/v1-0", "FilterItem");
    private final static QName _CustomerSchedules_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "CustomerSchedules");
    private final static QName _CustomerType_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "CustomerType");
    private final static QName _WorkOrderItem_QNAME = new QName("http://directvla.com/schema/businessdomain/common/v1-0", "WorkOrderItem");
    private final static QName _CustomerAccountChargeSumBalanceCollectionType_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "CustomerAccountChargeSumBalanceCollectionType");
    private final static QName _InputIds_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "inputIds");
    private final static QName _CommercialProductInvoiceLineTextCollectionItems_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Items");
    private final static QName _TechnicalProductCommercialProductExtended_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Extended");
    private final static QName _TechnicalProductCommercialProductExternalProductId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ExternalProductId");
    private final static QName _TechnicalProductCommercialProductId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Id");
    private final static QName _TechnicalProductCommercialProductBusinessUnitId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "BusinessUnitId");
    private final static QName _TechnicalProductCommercialProductTechnicalProductId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "TechnicalProductId");
    private final static QName _CommercialProductInvoiceLineTextText_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Text");
    private final static QName _CommercialProductInvoiceLineTextLanguageKey_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "LanguageKey");
    private final static QName _CommercialProductInvoiceLineTextReversalText_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ReversalText");
    private final static QName _CommercialProductAllowedModels_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowedModels");
    private final static QName _CommercialProductEditRulesId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "EditRulesId");
    private final static QName _CommercialProductNotes_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Notes");
    private final static QName _CommercialProductCaptureRuleId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CaptureRuleId");
    private final static QName _CommercialProductExternalProductCodeId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ExternalProductCodeId");
    private final static QName _CommercialProductCommercialProductIds_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CommercialProductIds");
    private final static QName _CommercialProductTechnicalProducts_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "TechnicalProducts");
    private final static QName _CommercialProductAgreementDetailSpearId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AgreementDetailSpearId");
    private final static QName _CommercialProductEPCMappings_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "EPCMappings");
    private final static QName _CommercialProductIsUnitOfMeasurementRequired_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IsUnitOfMeasurementRequired");
    private final static QName _CommercialProductMinSleepDays_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "MinSleepDays");
    private final static QName _CommercialProductName_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Name");
    private final static QName _CommercialProductSellFrom_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "SellFrom");
    private final static QName _CommercialProductAvailableDate_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AvailableDate");
    private final static QName _CommercialProductTechnicalProductIds_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "TechnicalProductIds");
    private final static QName _CommercialProductCategoryWeight_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CategoryWeight");
    private final static QName _CommercialProductUsersRoles_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "UsersRoles");
    private final static QName _CommercialProductCategoryId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CategoryId");
    private final static QName _CommercialProductMatchQuantity_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "MatchQuantity");
    private final static QName _CommercialProductAllowSleep_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowSleep");
    private final static QName _CommercialProductDescription_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Description");
    private final static QName _CommercialProductHyperlink_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Hyperlink");
    private final static QName _CommercialProductOverrideCAEntitlements_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "OverrideCAEntitlements");
    private final static QName _CommercialProductUnitOfMeasurementId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "UnitOfMeasurementId");
    private final static QName _CommercialProductRequiredCommercialProducts_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "RequiredCommercialProducts");
    private final static QName _CommercialProductAllowedEventsId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowedEventsId");
    private final static QName _CommercialProductAllowedForPurchasedOfferDefinition_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowedForPurchasedOfferDefinition");
    private final static QName _CommercialProductDefaultChargePeriod_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "DefaultChargePeriod");
    private final static QName _CommercialProductInvoiceLineTexts_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "InvoiceLineTexts");
    private final static QName _CommercialProductDefaultFinanceOptionId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "DefaultFinanceOptionId");
    private final static QName _CommercialProductTaxExternalProductCodeId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "TaxExternalProductCodeId");
    private final static QName _CommercialProductExcludedCommercialProducts_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ExcludedCommercialProducts");
    private final static QName _CommercialProductIconId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IconId");
    private final static QName _CommercialProductAllowedBusinessUnits_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowedBusinessUnits");
    private final static QName _CommercialProductMaxsdleepDays_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "MaxsdleepDays");
    private final static QName _CommercialProductPrepaidRequiredBalance_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "PrepaidRequiredBalance");
    private final static QName _CommercialProductAllowedMarketSegmentIds_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowedMarketSegmentIds");
    private final static QName _CommercialProductSellTo_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "SellTo");
    private final static QName _CommercialProductContractPeriodIdToOverrideOnAD_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ContractPeriodIdToOverrideOnAD");
    private final static QName _CommercialProductAllowQtyToBeUpdated_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "AllowQtyToBeUpdated");
    private final static QName _CommercialProductCAEntitlements_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CAEntitlements");
    private final static QName _AllowedModelModelId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ModelId");
    private final static QName _CAEntitlementEntitlements2_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Entitlements2");
    private final static QName _CAEntitlementEntitlements3_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Entitlements3");
    private final static QName _CAEntitlementEntitlements1_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "Entitlements1");
    private final static QName _CAEntitlementEntitlementGeoRegionFilterList_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "EntitlementGeoRegionFilterList");
    private final static QName _CAEntitlementCASystemId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CASystemId");
    private final static QName _ProductCombinationScopeIsAgreementLevel_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IsAgreementLevel");
    private final static QName _ProductCombinationScopeIsFinancialAccountLevel_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IsFinancialAccountLevel");
    private final static QName _ProductCombinationScopeProductCombinationId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ProductCombinationId");
    private final static QName _ProductCombinationScopeIsCustomerLevel_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IsCustomerLevel");
    private final static QName _ProductCombinationScopeIsDevicesLevel_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "IsDevicesLevel");
    private final static QName _CommercialProductEPCMappingCommercialProductId_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "CommercialProductId");
    private final static QName _CommercialProductEPCMappingExternalProductCodeIdIfCommissionable_QNAME = new QName("http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", "ExternalProductCodeIdIfCommissionable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.directv.afe.billing.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerProductByStatusRequest }
     * 
     */
    public GetCustomerProductByStatusRequest createGetCustomerProductByStatusRequest() {
        return new GetCustomerProductByStatusRequest();
    }

    /**
     * Create an instance of {@link RequestMetadataType }
     * 
     */
    public RequestMetadataType createRequestMetadataType() {
        return new RequestMetadataType();
    }

    /**
     * Create an instance of {@link GetCustomerProductByStatus }
     * 
     */
    public GetCustomerProductByStatus createGetCustomerProductByStatus() {
        return new GetCustomerProductByStatus();
    }

    /**
     * Create an instance of {@link GetCustomersByInternetUserIdRequest }
     * 
     */
    public GetCustomersByInternetUserIdRequest createGetCustomersByInternetUserIdRequest() {
        return new GetCustomersByInternetUserIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomersByInternetUserId }
     * 
     */
    public GetCustomersByInternetUserId createGetCustomersByInternetUserId() {
        return new GetCustomersByInternetUserId();
    }

    /**
     * Create an instance of {@link EditCustomerProductOfferResponse }
     * 
     */
    public EditCustomerProductOfferResponse createEditCustomerProductOfferResponse() {
        return new EditCustomerProductOfferResponse();
    }

    /**
     * Create an instance of {@link ResponseMetadataType }
     * 
     */
    public ResponseMetadataType createResponseMetadataType() {
        return new ResponseMetadataType();
    }

    /**
     * Create an instance of {@link GetCommandStatusException }
     * 
     */
    public GetCommandStatusException createGetCommandStatusException() {
        return new GetCommandStatusException();
    }

    /**
     * Create an instance of {@link EntityAlreadyExistsException }
     * 
     */
    public EntityAlreadyExistsException createEntityAlreadyExistsException() {
        return new EntityAlreadyExistsException();
    }

    /**
     * Create an instance of {@link EntityNotFoundException }
     * 
     */
    public EntityNotFoundException createEntityNotFoundException() {
        return new EntityNotFoundException();
    }

    /**
     * Create an instance of {@link EntityInUseException }
     * 
     */
    public EntityInUseException createEntityInUseException() {
        return new EntityInUseException();
    }

    /**
     * Create an instance of {@link InternalErrorException }
     * 
     */
    public InternalErrorException createInternalErrorException() {
        return new InternalErrorException();
    }

    /**
     * Create an instance of {@link MissingParameterException }
     * 
     */
    public MissingParameterException createMissingParameterException() {
        return new MissingParameterException();
    }

    /**
     * Create an instance of {@link InvalidParameterValueException }
     * 
     */
    public InvalidParameterValueException createInvalidParameterValueException() {
        return new InvalidParameterValueException();
    }

    /**
     * Create an instance of {@link InvalidQueryParameterException }
     * 
     */
    public InvalidQueryParameterException createInvalidQueryParameterException() {
        return new InvalidQueryParameterException();
    }

    /**
     * Create an instance of {@link InvalidRequestException }
     * 
     */
    public InvalidRequestException createInvalidRequestException() {
        return new InvalidRequestException();
    }

    /**
     * Create an instance of {@link InvalidResponseException }
     * 
     */
    public InvalidResponseException createInvalidResponseException() {
        return new InvalidResponseException();
    }

    /**
     * Create an instance of {@link InvalidSecurityTokenException }
     * 
     */
    public InvalidSecurityTokenException createInvalidSecurityTokenException() {
        return new InvalidSecurityTokenException();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link ServiceUnavailableException }
     * 
     */
    public ServiceUnavailableException createServiceUnavailableException() {
        return new ServiceUnavailableException();
    }

    /**
     * Create an instance of {@link OperationNotYetImplementedException }
     * 
     */
    public OperationNotYetImplementedException createOperationNotYetImplementedException() {
        return new OperationNotYetImplementedException();
    }

    /**
     * Create an instance of {@link DeleteCustomerCharacteristicException }
     * 
     */
    public DeleteCustomerCharacteristicException createDeleteCustomerCharacteristicException() {
        return new DeleteCustomerCharacteristicException();
    }

    /**
     * Create an instance of {@link ResourceEndMovingResponse }
     * 
     */
    public ResourceEndMovingResponse createResourceEndMovingResponse() {
        return new ResourceEndMovingResponse();
    }

    /**
     * Create an instance of {@link GetCommercialProductsByVersionException }
     * 
     */
    public GetCommercialProductsByVersionException createGetCommercialProductsByVersionException() {
        return new GetCommercialProductsByVersionException();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysRequest }
     * 
     */
    public GetCustomerHistoriesByDaysRequest createGetCustomerHistoriesByDaysRequest() {
        return new GetCustomerHistoriesByDaysRequest();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDays }
     * 
     */
    public GetCustomerHistoriesByDays createGetCustomerHistoriesByDays() {
        return new GetCustomerHistoriesByDays();
    }

    /**
     * Create an instance of {@link GetCustomerSchedulesResponse }
     * 
     */
    public GetCustomerSchedulesResponse createGetCustomerSchedulesResponse() {
        return new GetCustomerSchedulesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerSchedulesResult }
     * 
     */
    public GetCustomerSchedulesResult createGetCustomerSchedulesResult() {
        return new GetCustomerSchedulesResult();
    }

    /**
     * Create an instance of {@link ResourceStartMovingException }
     * 
     */
    public ResourceStartMovingException createResourceStartMovingException() {
        return new ResourceStartMovingException();
    }

    /**
     * Create an instance of {@link AddCustomerAgreementRequest }
     * 
     */
    public AddCustomerAgreementRequest createAddCustomerAgreementRequest() {
        return new AddCustomerAgreementRequest();
    }

    /**
     * Create an instance of {@link AddCustomerAgreement }
     * 
     */
    public AddCustomerAgreement createAddCustomerAgreement() {
        return new AddCustomerAgreement();
    }

    /**
     * Create an instance of {@link GetCustomersByPhoneNumberResponse }
     * 
     */
    public GetCustomersByPhoneNumberResponse createGetCustomersByPhoneNumberResponse() {
        return new GetCustomersByPhoneNumberResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByPhoneNumberResult }
     * 
     */
    public GetCustomersByPhoneNumberResult createGetCustomersByPhoneNumberResult() {
        return new GetCustomersByPhoneNumberResult();
    }

    /**
     * Create an instance of {@link AddOrUpgradeCustomerProductInvolvementRequest }
     * 
     */
    public AddOrUpgradeCustomerProductInvolvementRequest createAddOrUpgradeCustomerProductInvolvementRequest() {
        return new AddOrUpgradeCustomerProductInvolvementRequest();
    }

    /**
     * Create an instance of {@link AddOrUpgradeCustomerProductInvolvement }
     * 
     */
    public AddOrUpgradeCustomerProductInvolvement createAddOrUpgradeCustomerProductInvolvement() {
        return new AddOrUpgradeCustomerProductInvolvement();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysAndEventTypeException }
     * 
     */
    public GetCustomerHistoriesByDaysAndEventTypeException createGetCustomerHistoriesByDaysAndEventTypeException() {
        return new GetCustomerHistoriesByDaysAndEventTypeException();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesByCriteriaRequest }
     * 
     */
    public GetCustomerResourcesByCriteriaRequest createGetCustomerResourcesByCriteriaRequest() {
        return new GetCustomerResourcesByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesByCriteria }
     * 
     */
    public GetCustomerResourcesByCriteria createGetCustomerResourcesByCriteria() {
        return new GetCustomerResourcesByCriteria();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductsRequest }
     * 
     */
    public ReconnectCustomerProductsRequest createReconnectCustomerProductsRequest() {
        return new ReconnectCustomerProductsRequest();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProducts }
     * 
     */
    public ReconnectCustomerProducts createReconnectCustomerProducts() {
        return new ReconnectCustomerProducts();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementWithResourceException }
     * 
     */
    public AddCustomerAccountProductInvolvementWithResourceException createAddCustomerAccountProductInvolvementWithResourceException() {
        return new AddCustomerAccountProductInvolvementWithResourceException();
    }

    /**
     * Create an instance of {@link GetCustomerProductByStatusResponse }
     * 
     */
    public GetCustomerProductByStatusResponse createGetCustomerProductByStatusResponse() {
        return new GetCustomerProductByStatusResponse();
    }

    /**
     * Create an instance of {@link GetCustomerProductByStatusResult }
     * 
     */
    public GetCustomerProductByStatusResult createGetCustomerProductByStatusResult() {
        return new GetCustomerProductByStatusResult();
    }

    /**
     * Create an instance of {@link GetCustomersByCreditCardResponse }
     * 
     */
    public GetCustomersByCreditCardResponse createGetCustomersByCreditCardResponse() {
        return new GetCustomersByCreditCardResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByCreditCardResult }
     * 
     */
    public GetCustomersByCreditCardResult createGetCustomersByCreditCardResult() {
        return new GetCustomersByCreditCardResult();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerResourceRequest }
     * 
     */
    public UpgradeDowngradeCustomerResourceRequest createUpgradeDowngradeCustomerResourceRequest() {
        return new UpgradeDowngradeCustomerResourceRequest();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerResource }
     * 
     */
    public UpgradeDowngradeCustomerResource createUpgradeDowngradeCustomerResource() {
        return new UpgradeDowngradeCustomerResource();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerProductResponse }
     * 
     */
    public UpgradeDowngradeCustomerProductResponse createUpgradeDowngradeCustomerProductResponse() {
        return new UpgradeDowngradeCustomerProductResponse();
    }

    /**
     * Create an instance of {@link EditCustomerProductRequest }
     * 
     */
    public EditCustomerProductRequest createEditCustomerProductRequest() {
        return new EditCustomerProductRequest();
    }

    /**
     * Create an instance of {@link EditCustomerProduct }
     * 
     */
    public EditCustomerProduct createEditCustomerProduct() {
        return new EditCustomerProduct();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsByCriteriaException }
     * 
     */
    public GetCustomerOrderedEventsByCriteriaException createGetCustomerOrderedEventsByCriteriaException() {
        return new GetCustomerOrderedEventsByCriteriaException();
    }

    /**
     * Create an instance of {@link GetCustomerAgreementsRequest }
     * 
     */
    public GetCustomerAgreementsRequest createGetCustomerAgreementsRequest() {
        return new GetCustomerAgreementsRequest();
    }

    /**
     * Create an instance of {@link GetCustomerAgreements }
     * 
     */
    public GetCustomerAgreements createGetCustomerAgreements() {
        return new GetCustomerAgreements();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleResponse }
     * 
     */
    public DeleteCustomerScheduleResponse createDeleteCustomerScheduleResponse() {
        return new DeleteCustomerScheduleResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResult }
     * 
     */
    public GetCustomerResult createGetCustomerResult() {
        return new GetCustomerResult();
    }

    /**
     * Create an instance of {@link DeleteAllActiveCustomerSchedulesRequest }
     * 
     */
    public DeleteAllActiveCustomerSchedulesRequest createDeleteAllActiveCustomerSchedulesRequest() {
        return new DeleteAllActiveCustomerSchedulesRequest();
    }

    /**
     * Create an instance of {@link DeleteAllActiveCustomerSchedules }
     * 
     */
    public DeleteAllActiveCustomerSchedules createDeleteAllActiveCustomerSchedules() {
        return new DeleteAllActiveCustomerSchedules();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByProductIdResponse }
     * 
     */
    public GetCustomerProductsByProductIdResponse createGetCustomerProductsByProductIdResponse() {
        return new GetCustomerProductsByProductIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByProductIdResult }
     * 
     */
    public GetCustomerProductsByProductIdResult createGetCustomerProductsByProductIdResult() {
        return new GetCustomerProductsByProductIdResult();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAddressesRequest }
     * 
     */
    public GetCustomerAddressesRequest createGetCustomerAddressesRequest() {
        return new GetCustomerAddressesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerAddresses }
     * 
     */
    public GetCustomerAddresses createGetCustomerAddresses() {
        return new GetCustomerAddresses();
    }

    /**
     * Create an instance of {@link DisconnectCustomerProductsResponse }
     * 
     */
    public DisconnectCustomerProductsResponse createDisconnectCustomerProductsResponse() {
        return new DisconnectCustomerProductsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesByCriteriaException }
     * 
     */
    public GetCustomerResourcesByCriteriaException createGetCustomerResourcesByCriteriaException() {
        return new GetCustomerResourcesByCriteriaException();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleException }
     * 
     */
    public DeleteCustomerScheduleException createDeleteCustomerScheduleException() {
        return new DeleteCustomerScheduleException();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsByCriteriaRequest }
     * 
     */
    public GetCustomerOrderedEventsByCriteriaRequest createGetCustomerOrderedEventsByCriteriaRequest() {
        return new GetCustomerOrderedEventsByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsByCriteria }
     * 
     */
    public GetCustomerOrderedEventsByCriteria createGetCustomerOrderedEventsByCriteria() {
        return new GetCustomerOrderedEventsByCriteria();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsRequest }
     * 
     */
    public GetCustomerOrderedEventsRequest createGetCustomerOrderedEventsRequest() {
        return new GetCustomerOrderedEventsRequest();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEvents }
     * 
     */
    public GetCustomerOrderedEvents createGetCustomerOrderedEvents() {
        return new GetCustomerOrderedEvents();
    }

    /**
     * Create an instance of {@link GetCustomerAvailableUpgradesException }
     * 
     */
    public GetCustomerAvailableUpgradesException createGetCustomerAvailableUpgradesException() {
        return new GetCustomerAvailableUpgradesException();
    }

    /**
     * Create an instance of {@link EditCustomerAgreementException }
     * 
     */
    public EditCustomerAgreementException createEditCustomerAgreementException() {
        return new EditCustomerAgreementException();
    }

    /**
     * Create an instance of {@link GetCustomerRelationsException }
     * 
     */
    public GetCustomerRelationsException createGetCustomerRelationsException() {
        return new GetCustomerRelationsException();
    }

    /**
     * Create an instance of {@link DisconnectCustomerProductsRequest }
     * 
     */
    public DisconnectCustomerProductsRequest createDisconnectCustomerProductsRequest() {
        return new DisconnectCustomerProductsRequest();
    }

    /**
     * Create an instance of {@link DisconnectCustomerProducts }
     * 
     */
    public DisconnectCustomerProducts createDisconnectCustomerProducts() {
        return new DisconnectCustomerProducts();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleByIdResponse }
     * 
     */
    public DeleteCustomerScheduleByIdResponse createDeleteCustomerScheduleByIdResponse() {
        return new DeleteCustomerScheduleByIdResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementResponse }
     * 
     */
    public AddCustomerAccountProductInvolvementResponse createAddCustomerAccountProductInvolvementResponse() {
        return new AddCustomerAccountProductInvolvementResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementResult }
     * 
     */
    public AddCustomerAccountProductInvolvementResult createAddCustomerAccountProductInvolvementResult() {
        return new AddCustomerAccountProductInvolvementResult();
    }

    /**
     * Create an instance of {@link GetCommercialProductsByVersionResponse }
     * 
     */
    public GetCommercialProductsByVersionResponse createGetCommercialProductsByVersionResponse() {
        return new GetCommercialProductsByVersionResponse();
    }

    /**
     * Create an instance of {@link GetCommercialProductsByVersionResult }
     * 
     */
    public GetCommercialProductsByVersionResult createGetCommercialProductsByVersionResult() {
        return new GetCommercialProductsByVersionResult();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleRequest }
     * 
     */
    public DeleteCustomerScheduleRequest createDeleteCustomerScheduleRequest() {
        return new DeleteCustomerScheduleRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerSchedule }
     * 
     */
    public DeleteCustomerSchedule createDeleteCustomerSchedule() {
        return new DeleteCustomerSchedule();
    }

    /**
     * Create an instance of {@link EditCustomerAccountResponse }
     * 
     */
    public EditCustomerAccountResponse createEditCustomerAccountResponse() {
        return new EditCustomerAccountResponse();
    }

    /**
     * Create an instance of {@link AddCustomerRelationException }
     * 
     */
    public AddCustomerRelationException createAddCustomerRelationException() {
        return new AddCustomerRelationException();
    }

    /**
     * Create an instance of {@link GetCustomerNotesResponse }
     * 
     */
    public GetCustomerNotesResponse createGetCustomerNotesResponse() {
        return new GetCustomerNotesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerNotesResult }
     * 
     */
    public GetCustomerNotesResult createGetCustomerNotesResult() {
        return new GetCustomerNotesResult();
    }

    /**
     * Create an instance of {@link EditCustomerAccountRequest }
     * 
     */
    public EditCustomerAccountRequest createEditCustomerAccountRequest() {
        return new EditCustomerAccountRequest();
    }

    /**
     * Create an instance of {@link EditCustomerAccount }
     * 
     */
    public EditCustomerAccount createEditCustomerAccount() {
        return new EditCustomerAccount();
    }

    /**
     * Create an instance of {@link ArrayOfIds }
     * 
     */
    public ArrayOfIds createArrayOfIds() {
        return new ArrayOfIds();
    }

    /**
     * Create an instance of {@link AddCustomerNoteResponse }
     * 
     */
    public AddCustomerNoteResponse createAddCustomerNoteResponse() {
        return new AddCustomerNoteResponse();
    }

    /**
     * Create an instance of {@link AddCustomerNoteResult }
     * 
     */
    public AddCustomerNoteResult createAddCustomerNoteResult() {
        return new AddCustomerNoteResult();
    }

    /**
     * Create an instance of {@link GetCustomerSchedulesRequest }
     * 
     */
    public GetCustomerSchedulesRequest createGetCustomerSchedulesRequest() {
        return new GetCustomerSchedulesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerSchedules }
     * 
     */
    public GetCustomerSchedules createGetCustomerSchedules() {
        return new GetCustomerSchedules();
    }

    /**
     * Create an instance of {@link GetCharacteristicsException }
     * 
     */
    public GetCharacteristicsException createGetCharacteristicsException() {
        return new GetCharacteristicsException();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByCriteriaRequest }
     * 
     */
    public GetCustomerHistoriesByCriteriaRequest createGetCustomerHistoriesByCriteriaRequest() {
        return new GetCustomerHistoriesByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByCriteria }
     * 
     */
    public GetCustomerHistoriesByCriteria createGetCustomerHistoriesByCriteria() {
        return new GetCustomerHistoriesByCriteria();
    }

    /**
     * Create an instance of {@link AddOrUpgradeCustomerProductInvolvementResponse }
     * 
     */
    public AddOrUpgradeCustomerProductInvolvementResponse createAddOrUpgradeCustomerProductInvolvementResponse() {
        return new AddOrUpgradeCustomerProductInvolvementResponse();
    }

    /**
     * Create an instance of {@link AddOrUpgradeCustomerProductInvolvementResult }
     * 
     */
    public AddOrUpgradeCustomerProductInvolvementResult createAddOrUpgradeCustomerProductInvolvementResult() {
        return new AddOrUpgradeCustomerProductInvolvementResult();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductByProductIdResponse }
     * 
     */
    public ReconnectCustomerProductByProductIdResponse createReconnectCustomerProductByProductIdResponse() {
        return new ReconnectCustomerProductByProductIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByIdentificationRequest }
     * 
     */
    public GetCustomersByIdentificationRequest createGetCustomersByIdentificationRequest() {
        return new GetCustomersByIdentificationRequest();
    }

    /**
     * Create an instance of {@link GetCustomersByIdentification }
     * 
     */
    public GetCustomersByIdentification createGetCustomersByIdentification() {
        return new GetCustomersByIdentification();
    }

    /**
     * Create an instance of {@link ReauthorizeCustomerResourcesRequest }
     * 
     */
    public ReauthorizeCustomerResourcesRequest createReauthorizeCustomerResourcesRequest() {
        return new ReauthorizeCustomerResourcesRequest();
    }

    /**
     * Create an instance of {@link ReauthorizeCustomerResources }
     * 
     */
    public ReauthorizeCustomerResources createReauthorizeCustomerResources() {
        return new ReauthorizeCustomerResources();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByCriteriaResponse }
     * 
     */
    public GetCustomerProductsByCriteriaResponse createGetCustomerProductsByCriteriaResponse() {
        return new GetCustomerProductsByCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByCriteriaResult }
     * 
     */
    public GetCustomerProductsByCriteriaResult createGetCustomerProductsByCriteriaResult() {
        return new GetCustomerProductsByCriteriaResult();
    }

    /**
     * Create an instance of {@link GetCustomersBySerialNumberRequest }
     * 
     */
    public GetCustomersBySerialNumberRequest createGetCustomersBySerialNumberRequest() {
        return new GetCustomersBySerialNumberRequest();
    }

    /**
     * Create an instance of {@link GetCustomersBySerialNumber }
     * 
     */
    public GetCustomersBySerialNumber createGetCustomersBySerialNumber() {
        return new GetCustomersBySerialNumber();
    }

    /**
     * Create an instance of {@link AddCustomerCharacteristicException }
     * 
     */
    public AddCustomerCharacteristicException createAddCustomerCharacteristicException() {
        return new AddCustomerCharacteristicException();
    }

    /**
     * Create an instance of {@link GetCustomersBySerialNumberException }
     * 
     */
    public GetCustomersBySerialNumberException createGetCustomersBySerialNumberException() {
        return new GetCustomersBySerialNumberException();
    }

    /**
     * Create an instance of {@link DeleteCustomerCharacteristicRequest }
     * 
     */
    public DeleteCustomerCharacteristicRequest createDeleteCustomerCharacteristicRequest() {
        return new DeleteCustomerCharacteristicRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerCharacteristic }
     * 
     */
    public DeleteCustomerCharacteristic createDeleteCustomerCharacteristic() {
        return new DeleteCustomerCharacteristic();
    }

    /**
     * Create an instance of {@link ReauthorizeCustomerResourcesResponse }
     * 
     */
    public ReauthorizeCustomerResourcesResponse createReauthorizeCustomerResourcesResponse() {
        return new ReauthorizeCustomerResourcesResponse();
    }

    /**
     * Create an instance of {@link ReauthorizeCustomerResourcesResult }
     * 
     */
    public ReauthorizeCustomerResourcesResult createReauthorizeCustomerResourcesResult() {
        return new ReauthorizeCustomerResourcesResult();
    }

    /**
     * Create an instance of {@link GetCustomersByNamesResponse }
     * 
     */
    public GetCustomersByNamesResponse createGetCustomersByNamesResponse() {
        return new GetCustomersByNamesResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByNamesResult }
     * 
     */
    public GetCustomersByNamesResult createGetCustomersByNamesResult() {
        return new GetCustomersByNamesResult();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByCriteriaException }
     * 
     */
    public GetCustomerProductsByCriteriaException createGetCustomerProductsByCriteriaException() {
        return new GetCustomerProductsByCriteriaException();
    }

    /**
     * Create an instance of {@link GetCommandStatusResponse }
     * 
     */
    public GetCommandStatusResponse createGetCommandStatusResponse() {
        return new GetCommandStatusResponse();
    }

    /**
     * Create an instance of {@link GetCommandStatusResult }
     * 
     */
    public GetCommandStatusResult createGetCommandStatusResult() {
        return new GetCommandStatusResult();
    }

    /**
     * Create an instance of {@link ResourceChangeMigrationResponse }
     * 
     */
    public ResourceChangeMigrationResponse createResourceChangeMigrationResponse() {
        return new ResourceChangeMigrationResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferResponse }
     * 
     */
    public DeleteCustomerProductOfferResponse createDeleteCustomerProductOfferResponse() {
        return new DeleteCustomerProductOfferResponse();
    }

    /**
     * Create an instance of {@link GetCustomerProductsOfferRequest }
     * 
     */
    public GetCustomerProductsOfferRequest createGetCustomerProductsOfferRequest() {
        return new GetCustomerProductsOfferRequest();
    }

    /**
     * Create an instance of {@link GetCustomerProductsOffer }
     * 
     */
    public GetCustomerProductsOffer createGetCustomerProductsOffer() {
        return new GetCustomerProductsOffer();
    }

    /**
     * Create an instance of {@link GetCharacteristicsRequest }
     * 
     */
    public GetCharacteristicsRequest createGetCharacteristicsRequest() {
        return new GetCharacteristicsRequest();
    }

    /**
     * Create an instance of {@link AddCustomerRelationRequest }
     * 
     */
    public AddCustomerRelationRequest createAddCustomerRelationRequest() {
        return new AddCustomerRelationRequest();
    }

    /**
     * Create an instance of {@link AddCustomerRelation }
     * 
     */
    public AddCustomerRelation createAddCustomerRelation() {
        return new AddCustomerRelation();
    }

    /**
     * Create an instance of {@link EditCustomerInquiryException }
     * 
     */
    public EditCustomerInquiryException createEditCustomerInquiryException() {
        return new EditCustomerInquiryException();
    }

    /**
     * Create an instance of {@link GetProductsOfferRequest }
     * 
     */
    public GetProductsOfferRequest createGetProductsOfferRequest() {
        return new GetProductsOfferRequest();
    }

    /**
     * Create an instance of {@link EditCustomerAddressException }
     * 
     */
    public EditCustomerAddressException createEditCustomerAddressException() {
        return new EditCustomerAddressException();
    }

    /**
     * Create an instance of {@link EditInvoiceResponse }
     * 
     */
    public EditInvoiceResponse createEditInvoiceResponse() {
        return new EditInvoiceResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByInternetUserIdException }
     * 
     */
    public GetCustomersByInternetUserIdException createGetCustomersByInternetUserIdException() {
        return new GetCustomersByInternetUserIdException();
    }

    /**
     * Create an instance of {@link EditCustomerCharacteristicResponse }
     * 
     */
    public EditCustomerCharacteristicResponse createEditCustomerCharacteristicResponse() {
        return new EditCustomerCharacteristicResponse();
    }

    /**
     * Create an instance of {@link EditCustomerException }
     * 
     */
    public EditCustomerException createEditCustomerException() {
        return new EditCustomerException();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleByIdRequest }
     * 
     */
    public DeleteCustomerScheduleByIdRequest createDeleteCustomerScheduleByIdRequest() {
        return new DeleteCustomerScheduleByIdRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleById }
     * 
     */
    public DeleteCustomerScheduleById createDeleteCustomerScheduleById() {
        return new DeleteCustomerScheduleById();
    }

    /**
     * Create an instance of {@link ResourceStartMovingRequest }
     * 
     */
    public ResourceStartMovingRequest createResourceStartMovingRequest() {
        return new ResourceStartMovingRequest();
    }

    /**
     * Create an instance of {@link ResourceStartMoving }
     * 
     */
    public ResourceStartMoving createResourceStartMoving() {
        return new ResourceStartMoving();
    }

    /**
     * Create an instance of {@link SendCommandRequest }
     * 
     */
    public SendCommandRequest createSendCommandRequest() {
        return new SendCommandRequest();
    }

    /**
     * Create an instance of {@link SendCommand }
     * 
     */
    public SendCommand createSendCommand() {
        return new SendCommand();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementWithResourceResponse }
     * 
     */
    public AddCustomerAccountProductInvolvementWithResourceResponse createAddCustomerAccountProductInvolvementWithResourceResponse() {
        return new AddCustomerAccountProductInvolvementWithResourceResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementWithResourceResult }
     * 
     */
    public AddCustomerAccountProductInvolvementWithResourceResult createAddCustomerAccountProductInvolvementWithResourceResult() {
        return new AddCustomerAccountProductInvolvementWithResourceResult();
    }

    /**
     * Create an instance of {@link GetCustomerCharacteristicsRequest }
     * 
     */
    public GetCustomerCharacteristicsRequest createGetCustomerCharacteristicsRequest() {
        return new GetCustomerCharacteristicsRequest();
    }

    /**
     * Create an instance of {@link GetCustomerCharacteristics }
     * 
     */
    public GetCustomerCharacteristics createGetCustomerCharacteristics() {
        return new GetCustomerCharacteristics();
    }

    /**
     * Create an instance of {@link GetCustomerSchedulesException }
     * 
     */
    public GetCustomerSchedulesException createGetCustomerSchedulesException() {
        return new GetCustomerSchedulesException();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferByProductOfferIdResponse }
     * 
     */
    public DeleteCustomerProductOfferByProductOfferIdResponse createDeleteCustomerProductOfferByProductOfferIdResponse() {
        return new DeleteCustomerProductOfferByProductOfferIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomersBySerialNumberResponse }
     * 
     */
    public GetCustomersBySerialNumberResponse createGetCustomersBySerialNumberResponse() {
        return new GetCustomersBySerialNumberResponse();
    }

    /**
     * Create an instance of {@link GetCustomersBySerialNumberResult }
     * 
     */
    public GetCustomersBySerialNumberResult createGetCustomersBySerialNumberResult() {
        return new GetCustomersBySerialNumberResult();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesException }
     * 
     */
    public GetCustomerResourcesException createGetCustomerResourcesException() {
        return new GetCustomerResourcesException();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsException }
     * 
     */
    public GetCustomerOrderedEventsException createGetCustomerOrderedEventsException() {
        return new GetCustomerOrderedEventsException();
    }

    /**
     * Create an instance of {@link GetCustomerAvailableUpgradesRequest }
     * 
     */
    public GetCustomerAvailableUpgradesRequest createGetCustomerAvailableUpgradesRequest() {
        return new GetCustomerAvailableUpgradesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerAvailableUpgrades }
     * 
     */
    public GetCustomerAvailableUpgrades createGetCustomerAvailableUpgrades() {
        return new GetCustomerAvailableUpgrades();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysException }
     * 
     */
    public GetCustomerHistoriesByDaysException createGetCustomerHistoriesByDaysException() {
        return new GetCustomerHistoriesByDaysException();
    }

    /**
     * Create an instance of {@link GetProductsOfferResponse }
     * 
     */
    public GetProductsOfferResponse createGetProductsOfferResponse() {
        return new GetProductsOfferResponse();
    }

    /**
     * Create an instance of {@link GetProductsOfferResult }
     * 
     */
    public GetProductsOfferResult createGetProductsOfferResult() {
        return new GetProductsOfferResult();
    }

    /**
     * Create an instance of {@link DisconnectCustomerProductsException }
     * 
     */
    public DisconnectCustomerProductsException createDisconnectCustomerProductsException() {
        return new DisconnectCustomerProductsException();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferByProductOfferIdException }
     * 
     */
    public DeleteCustomerProductOfferByProductOfferIdException createDeleteCustomerProductOfferByProductOfferIdException() {
        return new DeleteCustomerProductOfferByProductOfferIdException();
    }

    /**
     * Create an instance of {@link GetCustomersByInternetUserIdResponse }
     * 
     */
    public GetCustomersByInternetUserIdResponse createGetCustomersByInternetUserIdResponse() {
        return new GetCustomersByInternetUserIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByInternetUserIdResult }
     * 
     */
    public GetCustomersByInternetUserIdResult createGetCustomersByInternetUserIdResult() {
        return new GetCustomersByInternetUserIdResult();
    }

    /**
     * Create an instance of {@link ScheduleCancelCustomerProductBySerialNumberResponse }
     * 
     */
    public ScheduleCancelCustomerProductBySerialNumberResponse createScheduleCancelCustomerProductBySerialNumberResponse() {
        return new ScheduleCancelCustomerProductBySerialNumberResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAccountException }
     * 
     */
    public AddCustomerAccountException createAddCustomerAccountException() {
        return new AddCustomerAccountException();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferRequest }
     * 
     */
    public DeleteCustomerProductOfferRequest createDeleteCustomerProductOfferRequest() {
        return new DeleteCustomerProductOfferRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOffer }
     * 
     */
    public DeleteCustomerProductOffer createDeleteCustomerProductOffer() {
        return new DeleteCustomerProductOffer();
    }

    /**
     * Create an instance of {@link GetCustomersByIdentificationResponse }
     * 
     */
    public GetCustomersByIdentificationResponse createGetCustomersByIdentificationResponse() {
        return new GetCustomersByIdentificationResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByIdentificationResult }
     * 
     */
    public GetCustomersByIdentificationResult createGetCustomersByIdentificationResult() {
        return new GetCustomersByIdentificationResult();
    }

    /**
     * Create an instance of {@link EditCustomerAgreementRequest }
     * 
     */
    public EditCustomerAgreementRequest createEditCustomerAgreementRequest() {
        return new EditCustomerAgreementRequest();
    }

    /**
     * Create an instance of {@link EditCustomerAgreement }
     * 
     */
    public EditCustomerAgreement createEditCustomerAgreement() {
        return new EditCustomerAgreement();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferException }
     * 
     */
    public DeleteCustomerProductOfferException createDeleteCustomerProductOfferException() {
        return new DeleteCustomerProductOfferException();
    }

    /**
     * Create an instance of {@link GetCharacteristicByTypeAndNameRequest }
     * 
     */
    public GetCharacteristicByTypeAndNameRequest createGetCharacteristicByTypeAndNameRequest() {
        return new GetCharacteristicByTypeAndNameRequest();
    }

    /**
     * Create an instance of {@link GetCharacteristicByTypeAndName }
     * 
     */
    public GetCharacteristicByTypeAndName createGetCharacteristicByTypeAndName() {
        return new GetCharacteristicByTypeAndName();
    }

    /**
     * Create an instance of {@link CancelCustomerProductByProductIdException }
     * 
     */
    public CancelCustomerProductByProductIdException createCancelCustomerProductByProductIdException() {
        return new CancelCustomerProductByProductIdException();
    }

    /**
     * Create an instance of {@link GetCustomerAddressesResponse }
     * 
     */
    public GetCustomerAddressesResponse createGetCustomerAddressesResponse() {
        return new GetCustomerAddressesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAddressesResult }
     * 
     */
    public GetCustomerAddressesResult createGetCustomerAddressesResult() {
        return new GetCustomerAddressesResult();
    }

    /**
     * Create an instance of {@link EditInvoiceException }
     * 
     */
    public EditInvoiceException createEditInvoiceException() {
        return new EditInvoiceException();
    }

    /**
     * Create an instance of {@link ResourceChangeMigrationException }
     * 
     */
    public ResourceChangeMigrationException createResourceChangeMigrationException() {
        return new ResourceChangeMigrationException();
    }

    /**
     * Create an instance of {@link CancelCustomerProductsException }
     * 
     */
    public CancelCustomerProductsException createCancelCustomerProductsException() {
        return new CancelCustomerProductsException();
    }

    /**
     * Create an instance of {@link GetCustomerCharacteristicsException }
     * 
     */
    public GetCustomerCharacteristicsException createGetCustomerCharacteristicsException() {
        return new GetCustomerCharacteristicsException();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductByProductIdRequest }
     * 
     */
    public ReconnectCustomerProductByProductIdRequest createReconnectCustomerProductByProductIdRequest() {
        return new ReconnectCustomerProductByProductIdRequest();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductByProductId }
     * 
     */
    public ReconnectCustomerProductByProductId createReconnectCustomerProductByProductId() {
        return new ReconnectCustomerProductByProductId();
    }

    /**
     * Create an instance of {@link DeleteAllActiveCustomerSchedulesResponse }
     * 
     */
    public DeleteAllActiveCustomerSchedulesResponse createDeleteAllActiveCustomerSchedulesResponse() {
        return new DeleteAllActiveCustomerSchedulesResponse();
    }

    /**
     * Create an instance of {@link DeleteAllActiveCustomerSchedulesResult }
     * 
     */
    public DeleteAllActiveCustomerSchedulesResult createDeleteAllActiveCustomerSchedulesResult() {
        return new DeleteAllActiveCustomerSchedulesResult();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerResourceException }
     * 
     */
    public UpgradeDowngradeCustomerResourceException createUpgradeDowngradeCustomerResourceException() {
        return new UpgradeDowngradeCustomerResourceException();
    }

    /**
     * Create an instance of {@link GetCustomerAvailableUpgradesResponse }
     * 
     */
    public GetCustomerAvailableUpgradesResponse createGetCustomerAvailableUpgradesResponse() {
        return new GetCustomerAvailableUpgradesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAvailableUpgradesResult }
     * 
     */
    public GetCustomerAvailableUpgradesResult createGetCustomerAvailableUpgradesResult() {
        return new GetCustomerAvailableUpgradesResult();
    }

    /**
     * Create an instance of {@link EditInvoiceRequest }
     * 
     */
    public EditInvoiceRequest createEditInvoiceRequest() {
        return new EditInvoiceRequest();
    }

    /**
     * Create an instance of {@link EditInvoice }
     * 
     */
    public EditInvoice createEditInvoice() {
        return new EditInvoice();
    }

    /**
     * Create an instance of {@link EditCustomerAddressRequest }
     * 
     */
    public EditCustomerAddressRequest createEditCustomerAddressRequest() {
        return new EditCustomerAddressRequest();
    }

    /**
     * Create an instance of {@link EditCustomerAddress }
     * 
     */
    public EditCustomerAddress createEditCustomerAddress() {
        return new EditCustomerAddress();
    }

    /**
     * Create an instance of {@link ReauthorizeCustomerResourcesException }
     * 
     */
    public ReauthorizeCustomerResourcesException createReauthorizeCustomerResourcesException() {
        return new ReauthorizeCustomerResourcesException();
    }

    /**
     * Create an instance of {@link ScheduleReconnectCustomerProductsException }
     * 
     */
    public ScheduleReconnectCustomerProductsException createScheduleReconnectCustomerProductsException() {
        return new ScheduleReconnectCustomerProductsException();
    }

    /**
     * Create an instance of {@link GetCustomerNotesException }
     * 
     */
    public GetCustomerNotesException createGetCustomerNotesException() {
        return new GetCustomerNotesException();
    }

    /**
     * Create an instance of {@link CancelCustomerProductsRequest }
     * 
     */
    public CancelCustomerProductsRequest createCancelCustomerProductsRequest() {
        return new CancelCustomerProductsRequest();
    }

    /**
     * Create an instance of {@link CancelCustomerProducts }
     * 
     */
    public CancelCustomerProducts createCancelCustomerProducts() {
        return new CancelCustomerProducts();
    }

    /**
     * Create an instance of {@link ResourceEndMovingException }
     * 
     */
    public ResourceEndMovingException createResourceEndMovingException() {
        return new ResourceEndMovingException();
    }

    /**
     * Create an instance of {@link GetCustomerAgreementsResponse }
     * 
     */
    public GetCustomerAgreementsResponse createGetCustomerAgreementsResponse() {
        return new GetCustomerAgreementsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerAgreementsResult }
     * 
     */
    public GetCustomerAgreementsResult createGetCustomerAgreementsResult() {
        return new GetCustomerAgreementsResult();
    }

    /**
     * Create an instance of {@link GetCommercialProductsByVersionRequest }
     * 
     */
    public GetCommercialProductsByVersionRequest createGetCommercialProductsByVersionRequest() {
        return new GetCommercialProductsByVersionRequest();
    }

    /**
     * Create an instance of {@link GetCommercialProductsByVersion }
     * 
     */
    public GetCommercialProductsByVersion createGetCommercialProductsByVersion() {
        return new GetCommercialProductsByVersion();
    }

    /**
     * Create an instance of {@link AddCustomerCharacteristicResponse }
     * 
     */
    public AddCustomerCharacteristicResponse createAddCustomerCharacteristicResponse() {
        return new AddCustomerCharacteristicResponse();
    }

    /**
     * Create an instance of {@link AddCustomerCharacteristicResult }
     * 
     */
    public AddCustomerCharacteristicResult createAddCustomerCharacteristicResult() {
        return new AddCustomerCharacteristicResult();
    }

    /**
     * Create an instance of {@link EditCustomerInquiryRequest }
     * 
     */
    public EditCustomerInquiryRequest createEditCustomerInquiryRequest() {
        return new EditCustomerInquiryRequest();
    }

    /**
     * Create an instance of {@link EditCustomerInquiry }
     * 
     */
    public EditCustomerInquiry createEditCustomerInquiry() {
        return new EditCustomerInquiry();
    }

    /**
     * Create an instance of {@link GetCustomersByNamesRequest }
     * 
     */
    public GetCustomersByNamesRequest createGetCustomersByNamesRequest() {
        return new GetCustomersByNamesRequest();
    }

    /**
     * Create an instance of {@link GetCustomersByNames }
     * 
     */
    public GetCustomersByNames createGetCustomersByNames() {
        return new GetCustomersByNames();
    }

    /**
     * Create an instance of {@link AddCustomerNoteException }
     * 
     */
    public AddCustomerNoteException createAddCustomerNoteException() {
        return new AddCustomerNoteException();
    }

    /**
     * Create an instance of {@link AddCustomerProductOfferResponse }
     * 
     */
    public AddCustomerProductOfferResponse createAddCustomerProductOfferResponse() {
        return new AddCustomerProductOfferResponse();
    }

    /**
     * Create an instance of {@link AddCustomerProductOfferResult }
     * 
     */
    public AddCustomerProductOfferResult createAddCustomerProductOfferResult() {
        return new AddCustomerProductOfferResult();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesByCriteriaResponse }
     * 
     */
    public GetCustomerResourcesByCriteriaResponse createGetCustomerResourcesByCriteriaResponse() {
        return new GetCustomerResourcesByCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesByCriteriaResult }
     * 
     */
    public GetCustomerResourcesByCriteriaResult createGetCustomerResourcesByCriteriaResult() {
        return new GetCustomerResourcesByCriteriaResult();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByProductIdException }
     * 
     */
    public GetCustomerProductsByProductIdException createGetCustomerProductsByProductIdException() {
        return new GetCustomerProductsByProductIdException();
    }

    /**
     * Create an instance of {@link GetCustomersByCreditCardRequest }
     * 
     */
    public GetCustomersByCreditCardRequest createGetCustomersByCreditCardRequest() {
        return new GetCustomersByCreditCardRequest();
    }

    /**
     * Create an instance of {@link GetCustomersByCreditCard }
     * 
     */
    public GetCustomersByCreditCard createGetCustomersByCreditCard() {
        return new GetCustomersByCreditCard();
    }

    /**
     * Create an instance of {@link AddCustomerAddressResponse }
     * 
     */
    public AddCustomerAddressResponse createAddCustomerAddressResponse() {
        return new AddCustomerAddressResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAddressResult }
     * 
     */
    public AddCustomerAddressResult createAddCustomerAddressResult() {
        return new AddCustomerAddressResult();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferByProductOfferIdRequest }
     * 
     */
    public DeleteCustomerProductOfferByProductOfferIdRequest createDeleteCustomerProductOfferByProductOfferIdRequest() {
        return new DeleteCustomerProductOfferByProductOfferIdRequest();
    }

    /**
     * Create an instance of {@link DeleteCustomerProductOfferByProductOfferId }
     * 
     */
    public DeleteCustomerProductOfferByProductOfferId createDeleteCustomerProductOfferByProductOfferId() {
        return new DeleteCustomerProductOfferByProductOfferId();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementRequest }
     * 
     */
    public AddCustomerAccountProductInvolvementRequest createAddCustomerAccountProductInvolvementRequest() {
        return new AddCustomerAccountProductInvolvementRequest();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvement }
     * 
     */
    public AddCustomerAccountProductInvolvement createAddCustomerAccountProductInvolvement() {
        return new AddCustomerAccountProductInvolvement();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByCriteriaResponse }
     * 
     */
    public GetCustomerHistoriesByCriteriaResponse createGetCustomerHistoriesByCriteriaResponse() {
        return new GetCustomerHistoriesByCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByCriteriaResult }
     * 
     */
    public GetCustomerHistoriesByCriteriaResult createGetCustomerHistoriesByCriteriaResult() {
        return new GetCustomerHistoriesByCriteriaResult();
    }

    /**
     * Create an instance of {@link AddCustomerAccountRequest }
     * 
     */
    public AddCustomerAccountRequest createAddCustomerAccountRequest() {
        return new AddCustomerAccountRequest();
    }

    /**
     * Create an instance of {@link AddCustomerAccount }
     * 
     */
    public AddCustomerAccount createAddCustomerAccount() {
        return new AddCustomerAccount();
    }

    /**
     * Create an instance of {@link SendCommandException }
     * 
     */
    public SendCommandException createSendCommandException() {
        return new SendCommandException();
    }

    /**
     * Create an instance of {@link GetCustomerRequest }
     * 
     */
    public GetCustomerRequest createGetCustomerRequest() {
        return new GetCustomerRequest();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductsResponse }
     * 
     */
    public ReconnectCustomerProductsResponse createReconnectCustomerProductsResponse() {
        return new ReconnectCustomerProductsResponse();
    }

    /**
     * Create an instance of {@link EditCustomerRequest }
     * 
     */
    public EditCustomerRequest createEditCustomerRequest() {
        return new EditCustomerRequest();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductByProductIdException }
     * 
     */
    public ReconnectCustomerProductByProductIdException createReconnectCustomerProductByProductIdException() {
        return new ReconnectCustomerProductByProductIdException();
    }

    /**
     * Create an instance of {@link EditCustomerInquiryResponse }
     * 
     */
    public EditCustomerInquiryResponse createEditCustomerInquiryResponse() {
        return new EditCustomerInquiryResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByCreditCardException }
     * 
     */
    public GetCustomersByCreditCardException createGetCustomersByCreditCardException() {
        return new GetCustomersByCreditCardException();
    }

    /**
     * Create an instance of {@link DeleteCustomerCharacteristicResponse }
     * 
     */
    public DeleteCustomerCharacteristicResponse createDeleteCustomerCharacteristicResponse() {
        return new DeleteCustomerCharacteristicResponse();
    }

    /**
     * Create an instance of {@link GetCustomersByPhoneNumberException }
     * 
     */
    public GetCustomersByPhoneNumberException createGetCustomersByPhoneNumberException() {
        return new GetCustomersByPhoneNumberException();
    }

    /**
     * Create an instance of {@link GetCustomerProductsOfferResponse }
     * 
     */
    public GetCustomerProductsOfferResponse createGetCustomerProductsOfferResponse() {
        return new GetCustomerProductsOfferResponse();
    }

    /**
     * Create an instance of {@link GetCustomerProductsOfferResult }
     * 
     */
    public GetCustomerProductsOfferResult createGetCustomerProductsOfferResult() {
        return new GetCustomerProductsOfferResult();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysAndEventTypeRequest }
     * 
     */
    public GetCustomerHistoriesByDaysAndEventTypeRequest createGetCustomerHistoriesByDaysAndEventTypeRequest() {
        return new GetCustomerHistoriesByDaysAndEventTypeRequest();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysAndEventType }
     * 
     */
    public GetCustomerHistoriesByDaysAndEventType createGetCustomerHistoriesByDaysAndEventType() {
        return new GetCustomerHistoriesByDaysAndEventType();
    }

    /**
     * Create an instance of {@link GetCustomersByIdentificationException }
     * 
     */
    public GetCustomersByIdentificationException createGetCustomersByIdentificationException() {
        return new GetCustomersByIdentificationException();
    }

    /**
     * Create an instance of {@link AddCustomerAddressRequest }
     * 
     */
    public AddCustomerAddressRequest createAddCustomerAddressRequest() {
        return new AddCustomerAddressRequest();
    }

    /**
     * Create an instance of {@link AddCustomerAddress }
     * 
     */
    public AddCustomerAddress createAddCustomerAddress() {
        return new AddCustomerAddress();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByProductIdRequest }
     * 
     */
    public GetCustomerProductsByProductIdRequest createGetCustomerProductsByProductIdRequest() {
        return new GetCustomerProductsByProductIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByProductId }
     * 
     */
    public GetCustomerProductsByProductId createGetCustomerProductsByProductId() {
        return new GetCustomerProductsByProductId();
    }

    /**
     * Create an instance of {@link AddCustomerAddressException }
     * 
     */
    public AddCustomerAddressException createAddCustomerAddressException() {
        return new AddCustomerAddressException();
    }

    /**
     * Create an instance of {@link MoveResourceToCustomerResponse }
     * 
     */
    public MoveResourceToCustomerResponse createMoveResourceToCustomerResponse() {
        return new MoveResourceToCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomerRelationsResponse }
     * 
     */
    public GetCustomerRelationsResponse createGetCustomerRelationsResponse() {
        return new GetCustomerRelationsResponse();
    }

    /**
     * Create an instance of {@link CustomerRelationsResult }
     * 
     */
    public CustomerRelationsResult createCustomerRelationsResult() {
        return new CustomerRelationsResult();
    }

    /**
     * Create an instance of {@link AddCustomerAgreementException }
     * 
     */
    public AddCustomerAgreementException createAddCustomerAgreementException() {
        return new AddCustomerAgreementException();
    }

    /**
     * Create an instance of {@link EditCustomerAgreementResponse }
     * 
     */
    public EditCustomerAgreementResponse createEditCustomerAgreementResponse() {
        return new EditCustomerAgreementResponse();
    }

    /**
     * Create an instance of {@link EditCustomerProductOfferRequest }
     * 
     */
    public EditCustomerProductOfferRequest createEditCustomerProductOfferRequest() {
        return new EditCustomerProductOfferRequest();
    }

    /**
     * Create an instance of {@link EditCustomerProductOffer }
     * 
     */
    public EditCustomerProductOffer createEditCustomerProductOffer() {
        return new EditCustomerProductOffer();
    }

    /**
     * Create an instance of {@link ScheduleCancelCustomerProductBySerialNumberRequest }
     * 
     */
    public ScheduleCancelCustomerProductBySerialNumberRequest createScheduleCancelCustomerProductBySerialNumberRequest() {
        return new ScheduleCancelCustomerProductBySerialNumberRequest();
    }

    /**
     * Create an instance of {@link ScheduleCancelCustomerProductBySerialNumber }
     * 
     */
    public ScheduleCancelCustomerProductBySerialNumber createScheduleCancelCustomerProductBySerialNumber() {
        return new ScheduleCancelCustomerProductBySerialNumber();
    }

    /**
     * Create an instance of {@link GetCharacteristicByTypeAndNameException }
     * 
     */
    public GetCharacteristicByTypeAndNameException createGetCharacteristicByTypeAndNameException() {
        return new GetCharacteristicByTypeAndNameException();
    }

    /**
     * Create an instance of {@link EditCustomerProductResponse }
     * 
     */
    public EditCustomerProductResponse createEditCustomerProductResponse() {
        return new EditCustomerProductResponse();
    }

    /**
     * Create an instance of {@link GetCharacteristicByTypeAndNameResponse }
     * 
     */
    public GetCharacteristicByTypeAndNameResponse createGetCharacteristicByTypeAndNameResponse() {
        return new GetCharacteristicByTypeAndNameResponse();
    }

    /**
     * Create an instance of {@link GetCharacteristicByTypeAndNameResult }
     * 
     */
    public GetCharacteristicByTypeAndNameResult createGetCharacteristicByTypeAndNameResult() {
        return new GetCharacteristicByTypeAndNameResult();
    }

    /**
     * Create an instance of {@link EditCustomerCharacteristicException }
     * 
     */
    public EditCustomerCharacteristicException createEditCustomerCharacteristicException() {
        return new EditCustomerCharacteristicException();
    }

    /**
     * Create an instance of {@link GetCustomersByNamesException }
     * 
     */
    public GetCustomersByNamesException createGetCustomersByNamesException() {
        return new GetCustomersByNamesException();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerResourceResponse }
     * 
     */
    public UpgradeDowngradeCustomerResourceResponse createUpgradeDowngradeCustomerResourceResponse() {
        return new UpgradeDowngradeCustomerResourceResponse();
    }

    /**
     * Create an instance of {@link ScheduleReconnectCustomerProductsResponse }
     * 
     */
    public ScheduleReconnectCustomerProductsResponse createScheduleReconnectCustomerProductsResponse() {
        return new ScheduleReconnectCustomerProductsResponse();
    }

    /**
     * Create an instance of {@link EditCustomerCharacteristicRequest }
     * 
     */
    public EditCustomerCharacteristicRequest createEditCustomerCharacteristicRequest() {
        return new EditCustomerCharacteristicRequest();
    }

    /**
     * Create an instance of {@link EditCustomerCharacteristic }
     * 
     */
    public EditCustomerCharacteristic createEditCustomerCharacteristic() {
        return new EditCustomerCharacteristic();
    }

    /**
     * Create an instance of {@link EditCustomerAddressResponse }
     * 
     */
    public EditCustomerAddressResponse createEditCustomerAddressResponse() {
        return new EditCustomerAddressResponse();
    }

    /**
     * Create an instance of {@link GetCommandStatusRequest }
     * 
     */
    public GetCommandStatusRequest createGetCommandStatusRequest() {
        return new GetCommandStatusRequest();
    }

    /**
     * Create an instance of {@link GetCommandStatus }
     * 
     */
    public GetCommandStatus createGetCommandStatus() {
        return new GetCommandStatus();
    }

    /**
     * Create an instance of {@link CancelCustomerProductsResponse }
     * 
     */
    public CancelCustomerProductsResponse createCancelCustomerProductsResponse() {
        return new CancelCustomerProductsResponse();
    }

    /**
     * Create an instance of {@link ReconnectCustomerProductsException }
     * 
     */
    public ReconnectCustomerProductsException createReconnectCustomerProductsException() {
        return new ReconnectCustomerProductsException();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsByCriteriaResponse }
     * 
     */
    public GetCustomerOrderedEventsByCriteriaResponse createGetCustomerOrderedEventsByCriteriaResponse() {
        return new GetCustomerOrderedEventsByCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsByCriteriaResult }
     * 
     */
    public GetCustomerOrderedEventsByCriteriaResult createGetCustomerOrderedEventsByCriteriaResult() {
        return new GetCustomerOrderedEventsByCriteriaResult();
    }

    /**
     * Create an instance of {@link MoveResourceToCustomerRequest }
     * 
     */
    public MoveResourceToCustomerRequest createMoveResourceToCustomerRequest() {
        return new MoveResourceToCustomerRequest();
    }

    /**
     * Create an instance of {@link MoveResourceToCustomer }
     * 
     */
    public MoveResourceToCustomer createMoveResourceToCustomer() {
        return new MoveResourceToCustomer();
    }

    /**
     * Create an instance of {@link ScheduleReconnectCustomerProductsRequest }
     * 
     */
    public ScheduleReconnectCustomerProductsRequest createScheduleReconnectCustomerProductsRequest() {
        return new ScheduleReconnectCustomerProductsRequest();
    }

    /**
     * Create an instance of {@link ScheduleReconnectCustomerProducts }
     * 
     */
    public ScheduleReconnectCustomerProducts createScheduleReconnectCustomerProducts() {
        return new ScheduleReconnectCustomerProducts();
    }

    /**
     * Create an instance of {@link DeleteAllActiveCustomerSchedulesException }
     * 
     */
    public DeleteAllActiveCustomerSchedulesException createDeleteAllActiveCustomerSchedulesException() {
        return new DeleteAllActiveCustomerSchedulesException();
    }

    /**
     * Create an instance of {@link AddCustomerAccountResponse }
     * 
     */
    public AddCustomerAccountResponse createAddCustomerAccountResponse() {
        return new AddCustomerAccountResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAccountResult }
     * 
     */
    public AddCustomerAccountResult createAddCustomerAccountResult() {
        return new AddCustomerAccountResult();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsResponse }
     * 
     */
    public GetCustomerOrderedEventsResponse createGetCustomerOrderedEventsResponse() {
        return new GetCustomerOrderedEventsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerOrderedEventsResult }
     * 
     */
    public GetCustomerOrderedEventsResult createGetCustomerOrderedEventsResult() {
        return new GetCustomerOrderedEventsResult();
    }

    /**
     * Create an instance of {@link AddCustomerCharacteristicRequest }
     * 
     */
    public AddCustomerCharacteristicRequest createAddCustomerCharacteristicRequest() {
        return new AddCustomerCharacteristicRequest();
    }

    /**
     * Create an instance of {@link AddCustomerCharacteristic }
     * 
     */
    public AddCustomerCharacteristic createAddCustomerCharacteristic() {
        return new AddCustomerCharacteristic();
    }

    /**
     * Create an instance of {@link CancelCustomerProductByProductIdRequest }
     * 
     */
    public CancelCustomerProductByProductIdRequest createCancelCustomerProductByProductIdRequest() {
        return new CancelCustomerProductByProductIdRequest();
    }

    /**
     * Create an instance of {@link CancelCustomerProductByProductId }
     * 
     */
    public CancelCustomerProductByProductId createCancelCustomerProductByProductId() {
        return new CancelCustomerProductByProductId();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerProductException }
     * 
     */
    public UpgradeDowngradeCustomerProductException createUpgradeDowngradeCustomerProductException() {
        return new UpgradeDowngradeCustomerProductException();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerProductRequest }
     * 
     */
    public UpgradeDowngradeCustomerProductRequest createUpgradeDowngradeCustomerProductRequest() {
        return new UpgradeDowngradeCustomerProductRequest();
    }

    /**
     * Create an instance of {@link UpgradeDowngradeCustomerProduct }
     * 
     */
    public UpgradeDowngradeCustomerProduct createUpgradeDowngradeCustomerProduct() {
        return new UpgradeDowngradeCustomerProduct();
    }

    /**
     * Create an instance of {@link AddCustomerRelationResponse }
     * 
     */
    public AddCustomerRelationResponse createAddCustomerRelationResponse() {
        return new AddCustomerRelationResponse();
    }

    /**
     * Create an instance of {@link AddCustomerRelationResult }
     * 
     */
    public AddCustomerRelationResult createAddCustomerRelationResult() {
        return new AddCustomerRelationResult();
    }

    /**
     * Create an instance of {@link GetCustomerAgreementsException }
     * 
     */
    public GetCustomerAgreementsException createGetCustomerAgreementsException() {
        return new GetCustomerAgreementsException();
    }

    /**
     * Create an instance of {@link GetCustomerAddressesException }
     * 
     */
    public GetCustomerAddressesException createGetCustomerAddressesException() {
        return new GetCustomerAddressesException();
    }

    /**
     * Create an instance of {@link ScheduleCancelCustomerProductBySerialNumberException }
     * 
     */
    public ScheduleCancelCustomerProductBySerialNumberException createScheduleCancelCustomerProductBySerialNumberException() {
        return new ScheduleCancelCustomerProductBySerialNumberException();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesRequest }
     * 
     */
    public GetCustomerResourcesRequest createGetCustomerResourcesRequest() {
        return new GetCustomerResourcesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerResources }
     * 
     */
    public GetCustomerResources createGetCustomerResources() {
        return new GetCustomerResources();
    }

    /**
     * Create an instance of {@link AddCustomerAgreementResponse }
     * 
     */
    public AddCustomerAgreementResponse createAddCustomerAgreementResponse() {
        return new AddCustomerAgreementResponse();
    }

    /**
     * Create an instance of {@link AddCustomerAgreementResult }
     * 
     */
    public AddCustomerAgreementResult createAddCustomerAgreementResult() {
        return new AddCustomerAgreementResult();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByCriteriaException }
     * 
     */
    public GetCustomerHistoriesByCriteriaException createGetCustomerHistoriesByCriteriaException() {
        return new GetCustomerHistoriesByCriteriaException();
    }

    /**
     * Create an instance of {@link SendCommandResponse }
     * 
     */
    public SendCommandResponse createSendCommandResponse() {
        return new SendCommandResponse();
    }

    /**
     * Create an instance of {@link SendCommandResult }
     * 
     */
    public SendCommandResult createSendCommandResult() {
        return new SendCommandResult();
    }

    /**
     * Create an instance of {@link GetCustomerNotesRequest }
     * 
     */
    public GetCustomerNotesRequest createGetCustomerNotesRequest() {
        return new GetCustomerNotesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerNotes }
     * 
     */
    public GetCustomerNotes createGetCustomerNotes() {
        return new GetCustomerNotes();
    }

    /**
     * Create an instance of {@link EditCustomerAccountException }
     * 
     */
    public EditCustomerAccountException createEditCustomerAccountException() {
        return new EditCustomerAccountException();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysResponse }
     * 
     */
    public GetCustomerHistoriesByDaysResponse createGetCustomerHistoriesByDaysResponse() {
        return new GetCustomerHistoriesByDaysResponse();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysResult }
     * 
     */
    public GetCustomerHistoriesByDaysResult createGetCustomerHistoriesByDaysResult() {
        return new GetCustomerHistoriesByDaysResult();
    }

    /**
     * Create an instance of {@link DeleteCustomerScheduleByIdException }
     * 
     */
    public DeleteCustomerScheduleByIdException createDeleteCustomerScheduleByIdException() {
        return new DeleteCustomerScheduleByIdException();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysAndEventTypeResponse }
     * 
     */
    public GetCustomerHistoriesByDaysAndEventTypeResponse createGetCustomerHistoriesByDaysAndEventTypeResponse() {
        return new GetCustomerHistoriesByDaysAndEventTypeResponse();
    }

    /**
     * Create an instance of {@link GetCustomerHistoriesByDaysAndEventTypeResult }
     * 
     */
    public GetCustomerHistoriesByDaysAndEventTypeResult createGetCustomerHistoriesByDaysAndEventTypeResult() {
        return new GetCustomerHistoriesByDaysAndEventTypeResult();
    }

    /**
     * Create an instance of {@link ResourceChangeMigrationRequest }
     * 
     */
    public ResourceChangeMigrationRequest createResourceChangeMigrationRequest() {
        return new ResourceChangeMigrationRequest();
    }

    /**
     * Create an instance of {@link ResourceChangeMigration }
     * 
     */
    public ResourceChangeMigration createResourceChangeMigration() {
        return new ResourceChangeMigration();
    }

    /**
     * Create an instance of {@link CancelCustomerProductByProductIdResponse }
     * 
     */
    public CancelCustomerProductByProductIdResponse createCancelCustomerProductByProductIdResponse() {
        return new CancelCustomerProductByProductIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesResponse }
     * 
     */
    public GetCustomerResourcesResponse createGetCustomerResourcesResponse() {
        return new GetCustomerResourcesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerResourcesResult }
     * 
     */
    public GetCustomerResourcesResult createGetCustomerResourcesResult() {
        return new GetCustomerResourcesResult();
    }

    /**
     * Create an instance of {@link GetCustomersByPhoneNumberRequest }
     * 
     */
    public GetCustomersByPhoneNumberRequest createGetCustomersByPhoneNumberRequest() {
        return new GetCustomersByPhoneNumberRequest();
    }

    /**
     * Create an instance of {@link GetCustomersByPhoneNumber }
     * 
     */
    public GetCustomersByPhoneNumber createGetCustomersByPhoneNumber() {
        return new GetCustomersByPhoneNumber();
    }

    /**
     * Create an instance of {@link GetCustomerCharacteristicsResponse }
     * 
     */
    public GetCustomerCharacteristicsResponse createGetCustomerCharacteristicsResponse() {
        return new GetCustomerCharacteristicsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerCharacteristicsResult }
     * 
     */
    public GetCustomerCharacteristicsResult createGetCustomerCharacteristicsResult() {
        return new GetCustomerCharacteristicsResult();
    }

    /**
     * Create an instance of {@link EditCustomerProductOfferException }
     * 
     */
    public EditCustomerProductOfferException createEditCustomerProductOfferException() {
        return new EditCustomerProductOfferException();
    }

    /**
     * Create an instance of {@link MoveResourceToCustomerException }
     * 
     */
    public MoveResourceToCustomerException createMoveResourceToCustomerException() {
        return new MoveResourceToCustomerException();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementWithResourceRequest }
     * 
     */
    public AddCustomerAccountProductInvolvementWithResourceRequest createAddCustomerAccountProductInvolvementWithResourceRequest() {
        return new AddCustomerAccountProductInvolvementWithResourceRequest();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementWithResource }
     * 
     */
    public AddCustomerAccountProductInvolvementWithResource createAddCustomerAccountProductInvolvementWithResource() {
        return new AddCustomerAccountProductInvolvementWithResource();
    }

    /**
     * Create an instance of {@link GetCustomerRelationsRequest }
     * 
     */
    public GetCustomerRelationsRequest createGetCustomerRelationsRequest() {
        return new GetCustomerRelationsRequest();
    }

    /**
     * Create an instance of {@link GetCustomerProductsOfferException }
     * 
     */
    public GetCustomerProductsOfferException createGetCustomerProductsOfferException() {
        return new GetCustomerProductsOfferException();
    }

    /**
     * Create an instance of {@link EditCustomerProductException }
     * 
     */
    public EditCustomerProductException createEditCustomerProductException() {
        return new EditCustomerProductException();
    }

    /**
     * Create an instance of {@link ResourceStartMovingResponse }
     * 
     */
    public ResourceStartMovingResponse createResourceStartMovingResponse() {
        return new ResourceStartMovingResponse();
    }

    /**
     * Create an instance of {@link ResourceStartMovingResult }
     * 
     */
    public ResourceStartMovingResult createResourceStartMovingResult() {
        return new ResourceStartMovingResult();
    }

    /**
     * Create an instance of {@link AddCustomerProductOfferException }
     * 
     */
    public AddCustomerProductOfferException createAddCustomerProductOfferException() {
        return new AddCustomerProductOfferException();
    }

    /**
     * Create an instance of {@link AddCustomerNoteRequest }
     * 
     */
    public AddCustomerNoteRequest createAddCustomerNoteRequest() {
        return new AddCustomerNoteRequest();
    }

    /**
     * Create an instance of {@link AddCustomerNote }
     * 
     */
    public AddCustomerNote createAddCustomerNote() {
        return new AddCustomerNote();
    }

    /**
     * Create an instance of {@link AddCustomerProductOfferRequest }
     * 
     */
    public AddCustomerProductOfferRequest createAddCustomerProductOfferRequest() {
        return new AddCustomerProductOfferRequest();
    }

    /**
     * Create an instance of {@link AddCustomerProductOffer }
     * 
     */
    public AddCustomerProductOffer createAddCustomerProductOffer() {
        return new AddCustomerProductOffer();
    }

    /**
     * Create an instance of {@link GetCustomerProductByStatusException }
     * 
     */
    public GetCustomerProductByStatusException createGetCustomerProductByStatusException() {
        return new GetCustomerProductByStatusException();
    }

    /**
     * Create an instance of {@link GetCharacteristicsResponse }
     * 
     */
    public GetCharacteristicsResponse createGetCharacteristicsResponse() {
        return new GetCharacteristicsResponse();
    }

    /**
     * Create an instance of {@link GetCharacteristicsResult }
     * 
     */
    public GetCharacteristicsResult createGetCharacteristicsResult() {
        return new GetCharacteristicsResult();
    }

    /**
     * Create an instance of {@link ResourceEndMovingRequest }
     * 
     */
    public ResourceEndMovingRequest createResourceEndMovingRequest() {
        return new ResourceEndMovingRequest();
    }

    /**
     * Create an instance of {@link ResourceEndMoving }
     * 
     */
    public ResourceEndMoving createResourceEndMoving() {
        return new ResourceEndMoving();
    }

    /**
     * Create an instance of {@link GetProductsOfferException }
     * 
     */
    public GetProductsOfferException createGetProductsOfferException() {
        return new GetProductsOfferException();
    }

    /**
     * Create an instance of {@link GetCustomerException }
     * 
     */
    public GetCustomerException createGetCustomerException() {
        return new GetCustomerException();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByCriteriaRequest }
     * 
     */
    public GetCustomerProductsByCriteriaRequest createGetCustomerProductsByCriteriaRequest() {
        return new GetCustomerProductsByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCustomerProductsByCriteria }
     * 
     */
    public GetCustomerProductsByCriteria createGetCustomerProductsByCriteria() {
        return new GetCustomerProductsByCriteria();
    }

    /**
     * Create an instance of {@link AddOrUpgradeCustomerProductInvolvementException }
     * 
     */
    public AddOrUpgradeCustomerProductInvolvementException createAddOrUpgradeCustomerProductInvolvementException() {
        return new AddOrUpgradeCustomerProductInvolvementException();
    }

    /**
     * Create an instance of {@link AddCustomerAccountProductInvolvementException }
     * 
     */
    public AddCustomerAccountProductInvolvementException createAddCustomerAccountProductInvolvementException() {
        return new AddCustomerAccountProductInvolvementException();
    }

    /**
     * Create an instance of {@link CAEntitlementCollection }
     * 
     */
    public CAEntitlementCollection createCAEntitlementCollection() {
        return new CAEntitlementCollection();
    }

    /**
     * Create an instance of {@link CustomerOrder }
     * 
     */
    public CustomerOrder createCustomerOrder() {
        return new CustomerOrder();
    }

    /**
     * Create an instance of {@link ArrayOfProductCombinationScope }
     * 
     */
    public ArrayOfProductCombinationScope createArrayOfProductCombinationScope() {
        return new ArrayOfProductCombinationScope();
    }

    /**
     * Create an instance of {@link ArrayOfAllowedModel }
     * 
     */
    public ArrayOfAllowedModel createArrayOfAllowedModel() {
        return new ArrayOfAllowedModel();
    }

    /**
     * Create an instance of {@link CommercialProductEPCMapping }
     * 
     */
    public CommercialProductEPCMapping createCommercialProductEPCMapping() {
        return new CommercialProductEPCMapping();
    }

    /**
     * Create an instance of {@link CommercialProductInvoiceLineTextCollection }
     * 
     */
    public CommercialProductInvoiceLineTextCollection createCommercialProductInvoiceLineTextCollection() {
        return new CommercialProductInvoiceLineTextCollection();
    }

    /**
     * Create an instance of {@link AllowedModel }
     * 
     */
    public AllowedModel createAllowedModel() {
        return new AllowedModel();
    }

    /**
     * Create an instance of {@link ArrayOfTechnicalProductCommercialProduct }
     * 
     */
    public ArrayOfTechnicalProductCommercialProduct createArrayOfTechnicalProductCommercialProduct() {
        return new ArrayOfTechnicalProductCommercialProduct();
    }

    /**
     * Create an instance of {@link ArrayOfCAEntitlement }
     * 
     */
    public ArrayOfCAEntitlement createArrayOfCAEntitlement() {
        return new ArrayOfCAEntitlement();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link CommercialProductEPCMappingCollection }
     * 
     */
    public CommercialProductEPCMappingCollection createCommercialProductEPCMappingCollection() {
        return new CommercialProductEPCMappingCollection();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link TechnicalProductCommercialProduct }
     * 
     */
    public TechnicalProductCommercialProduct createTechnicalProductCommercialProduct() {
        return new TechnicalProductCommercialProduct();
    }

    /**
     * Create an instance of {@link CommercialProduct }
     * 
     */
    public CommercialProduct createCommercialProduct() {
        return new CommercialProduct();
    }

    /**
     * Create an instance of {@link TechnicalProductCommercialProductCollection }
     * 
     */
    public TechnicalProductCommercialProductCollection createTechnicalProductCommercialProductCollection() {
        return new TechnicalProductCommercialProductCollection();
    }

    /**
     * Create an instance of {@link AllowedModelCollection }
     * 
     */
    public AllowedModelCollection createAllowedModelCollection() {
        return new AllowedModelCollection();
    }

    /**
     * Create an instance of {@link ArrayOfCommercialProductInvoiceLineText }
     * 
     */
    public ArrayOfCommercialProductInvoiceLineText createArrayOfCommercialProductInvoiceLineText() {
        return new ArrayOfCommercialProductInvoiceLineText();
    }

    /**
     * Create an instance of {@link CAEntitlement }
     * 
     */
    public CAEntitlement createCAEntitlement() {
        return new CAEntitlement();
    }

    /**
     * Create an instance of {@link ArrayOfCommercialProductEPCMapping }
     * 
     */
    public ArrayOfCommercialProductEPCMapping createArrayOfCommercialProductEPCMapping() {
        return new ArrayOfCommercialProductEPCMapping();
    }

    /**
     * Create an instance of {@link ProductCombinationScopeCollection }
     * 
     */
    public ProductCombinationScopeCollection createProductCombinationScopeCollection() {
        return new ProductCombinationScopeCollection();
    }

    /**
     * Create an instance of {@link CommercialProductCollection }
     * 
     */
    public CommercialProductCollection createCommercialProductCollection() {
        return new CommercialProductCollection();
    }

    /**
     * Create an instance of {@link ArrayOfCommercialProduct }
     * 
     */
    public ArrayOfCommercialProduct createArrayOfCommercialProduct() {
        return new ArrayOfCommercialProduct();
    }

    /**
     * Create an instance of {@link ProductCombinationScope }
     * 
     */
    public ProductCombinationScope createProductCombinationScope() {
        return new ProductCombinationScope();
    }

    /**
     * Create an instance of {@link CommercialProductInvoiceLineText }
     * 
     */
    public CommercialProductInvoiceLineText createCommercialProductInvoiceLineText() {
        return new CommercialProductInvoiceLineText();
    }

    /**
     * Create an instance of {@link CustomerSchedule }
     * 
     */
    public CustomerSchedule createCustomerSchedule() {
        return new CustomerSchedule();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CustomerAccountChargeSumBalanceCollection }
     * 
     */
    public CustomerAccountChargeSumBalanceCollection createCustomerAccountChargeSumBalanceCollection() {
        return new CustomerAccountChargeSumBalanceCollection();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link CustomerBillingCycleSpecification }
     * 
     */
    public CustomerBillingCycleSpecification createCustomerBillingCycleSpecification() {
        return new CustomerBillingCycleSpecification();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link CustomerNoteCollection }
     * 
     */
    public CustomerNoteCollection createCustomerNoteCollection() {
        return new CustomerNoteCollection();
    }

    /**
     * Create an instance of {@link CustomerAccountTaxExemptionCollection }
     * 
     */
    public CustomerAccountTaxExemptionCollection createCustomerAccountTaxExemptionCollection() {
        return new CustomerAccountTaxExemptionCollection();
    }

    /**
     * Create an instance of {@link CustomerInquiry }
     * 
     */
    public CustomerInquiry createCustomerInquiry() {
        return new CustomerInquiry();
    }

    /**
     * Create an instance of {@link CustomerScheduleCollection }
     * 
     */
    public CustomerScheduleCollection createCustomerScheduleCollection() {
        return new CustomerScheduleCollection();
    }

    /**
     * Create an instance of {@link CustomerCollection }
     * 
     */
    public CustomerCollection createCustomerCollection() {
        return new CustomerCollection();
    }

    /**
     * Create an instance of {@link LedgerAccount }
     * 
     */
    public LedgerAccount createLedgerAccount() {
        return new LedgerAccount();
    }

    /**
     * Create an instance of {@link LedgerAccountCollection }
     * 
     */
    public LedgerAccountCollection createLedgerAccountCollection() {
        return new LedgerAccountCollection();
    }

    /**
     * Create an instance of {@link CustomerInquiryCollection }
     * 
     */
    public CustomerInquiryCollection createCustomerInquiryCollection() {
        return new CustomerInquiryCollection();
    }

    /**
     * Create an instance of {@link InvoiceCollection }
     * 
     */
    public InvoiceCollection createInvoiceCollection() {
        return new InvoiceCollection();
    }

    /**
     * Create an instance of {@link FinancialTransactionCollection }
     * 
     */
    public FinancialTransactionCollection createFinancialTransactionCollection() {
        return new FinancialTransactionCollection();
    }

    /**
     * Create an instance of {@link ChargeTransaction }
     * 
     */
    public ChargeTransaction createChargeTransaction() {
        return new ChargeTransaction();
    }

    /**
     * Create an instance of {@link CustomerAccountCollection }
     * 
     */
    public CustomerAccountCollection createCustomerAccountCollection() {
        return new CustomerAccountCollection();
    }

    /**
     * Create an instance of {@link CustomerNote }
     * 
     */
    public CustomerNote createCustomerNote() {
        return new CustomerNote();
    }

    /**
     * Create an instance of {@link FinancialTransactionTaxesCollection }
     * 
     */
    public FinancialTransactionTaxesCollection createFinancialTransactionTaxesCollection() {
        return new FinancialTransactionTaxesCollection();
    }

    /**
     * Create an instance of {@link CustomerBillingCycleSpecificationCollection }
     * 
     */
    public CustomerBillingCycleSpecificationCollection createCustomerBillingCycleSpecificationCollection() {
        return new CustomerBillingCycleSpecificationCollection();
    }

    /**
     * Create an instance of {@link CustomerAccount }
     * 
     */
    public CustomerAccount createCustomerAccount() {
        return new CustomerAccount();
    }

    /**
     * Create an instance of {@link FinancialTransactionTax }
     * 
     */
    public FinancialTransactionTax createFinancialTransactionTax() {
        return new FinancialTransactionTax();
    }

    /**
     * Create an instance of {@link CustomerHistoryEvent }
     * 
     */
    public CustomerHistoryEvent createCustomerHistoryEvent() {
        return new CustomerHistoryEvent();
    }

    /**
     * Create an instance of {@link PaymentTransaction }
     * 
     */
    public PaymentTransaction createPaymentTransaction() {
        return new PaymentTransaction();
    }

    /**
     * Create an instance of {@link CustomerAccountChargeSumBalance }
     * 
     */
    public CustomerAccountChargeSumBalance createCustomerAccountChargeSumBalance() {
        return new CustomerAccountChargeSumBalance();
    }

    /**
     * Create an instance of {@link CustomerHistoryEventCollection }
     * 
     */
    public CustomerHistoryEventCollection createCustomerHistoryEventCollection() {
        return new CustomerHistoryEventCollection();
    }

    /**
     * Create an instance of {@link FinancialTransaction }
     * 
     */
    public FinancialTransaction createFinancialTransaction() {
        return new FinancialTransaction();
    }

    /**
     * Create an instance of {@link CustomerAccountTaxExemption }
     * 
     */
    public CustomerAccountTaxExemption createCustomerAccountTaxExemption() {
        return new CustomerAccountTaxExemption();
    }

    /**
     * Create an instance of {@link Equal }
     * 
     */
    public Equal createEqual() {
        return new Equal();
    }

    /**
     * Create an instance of {@link WorkOrder }
     * 
     */
    public WorkOrder createWorkOrder() {
        return new WorkOrder();
    }

    /**
     * Create an instance of {@link WorkOrderItem }
     * 
     */
    public WorkOrderItem createWorkOrderItem() {
        return new WorkOrderItem();
    }

    /**
     * Create an instance of {@link UrbanPropertyAddress }
     * 
     */
    public UrbanPropertyAddress createUrbanPropertyAddress() {
        return new UrbanPropertyAddress();
    }

    /**
     * Create an instance of {@link ShippingOrder }
     * 
     */
    public ShippingOrder createShippingOrder() {
        return new ShippingOrder();
    }

    /**
     * Create an instance of {@link GeographicPlace }
     * 
     */
    public GeographicPlace createGeographicPlace() {
        return new GeographicPlace();
    }

    /**
     * Create an instance of {@link OrderableEventImportFile }
     * 
     */
    public OrderableEventImportFile createOrderableEventImportFile() {
        return new OrderableEventImportFile();
    }

    /**
     * Create an instance of {@link EmailContact }
     * 
     */
    public EmailContact createEmailContact() {
        return new EmailContact();
    }

    /**
     * Create an instance of {@link GreaterThan }
     * 
     */
    public GreaterThan createGreaterThan() {
        return new GreaterThan();
    }

    /**
     * Create an instance of {@link FaxNumber }
     * 
     */
    public FaxNumber createFaxNumber() {
        return new FaxNumber();
    }

    /**
     * Create an instance of {@link FiscalIdentification }
     * 
     */
    public FiscalIdentification createFiscalIdentification() {
        return new FiscalIdentification();
    }

    /**
     * Create an instance of {@link PartyRoleCategory }
     * 
     */
    public PartyRoleCategory createPartyRoleCategory() {
        return new PartyRoleCategory();
    }

    /**
     * Create an instance of {@link PartyRoleCollection }
     * 
     */
    public PartyRoleCollection createPartyRoleCollection() {
        return new PartyRoleCollection();
    }

    /**
     * Create an instance of {@link CategoryCollection }
     * 
     */
    public CategoryCollection createCategoryCollection() {
        return new CategoryCollection();
    }

    /**
     * Create an instance of {@link NationalIdentityCardIdentification }
     * 
     */
    public NationalIdentityCardIdentification createNationalIdentityCardIdentification() {
        return new NationalIdentityCardIdentification();
    }

    /**
     * Create an instance of {@link NotEqual }
     * 
     */
    public NotEqual createNotEqual() {
        return new NotEqual();
    }

    /**
     * Create an instance of {@link TimePeriod }
     * 
     */
    public TimePeriod createTimePeriod() {
        return new TimePeriod();
    }

    /**
     * Create an instance of {@link InternetIdentification }
     * 
     */
    public InternetIdentification createInternetIdentification() {
        return new InternetIdentification();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link PhysicalDevice }
     * 
     */
    public PhysicalDevice createPhysicalDevice() {
        return new PhysicalDevice();
    }

    /**
     * Create an instance of {@link ShippingOrderCollection }
     * 
     */
    public ShippingOrderCollection createShippingOrderCollection() {
        return new ShippingOrderCollection();
    }

    /**
     * Create an instance of {@link In }
     * 
     */
    public In createIn() {
        return new In();
    }

    /**
     * Create an instance of {@link BusinessInteractionType }
     * 
     */
    public BusinessInteractionType createBusinessInteractionType() {
        return new BusinessInteractionType();
    }

    /**
     * Create an instance of {@link GreaterThanOrEqualTo }
     * 
     */
    public GreaterThanOrEqualTo createGreaterThanOrEqualTo() {
        return new GreaterThanOrEqualTo();
    }

    /**
     * Create an instance of {@link BusinessInteractionItem }
     * 
     */
    public BusinessInteractionItem createBusinessInteractionItem() {
        return new BusinessInteractionItem();
    }

    /**
     * Create an instance of {@link FunctionOrProcessProvider }
     * 
     */
    public FunctionOrProcessProvider createFunctionOrProcessProvider() {
        return new FunctionOrProcessProvider();
    }

    /**
     * Create an instance of {@link Intermediary }
     * 
     */
    public Intermediary createIntermediary() {
        return new Intermediary();
    }

    /**
     * Create an instance of {@link AgreementItem }
     * 
     */
    public AgreementItem createAgreementItem() {
        return new AgreementItem();
    }

    /**
     * Create an instance of {@link CriteriaSpecification }
     * 
     */
    public CriteriaSpecification createCriteriaSpecification() {
        return new CriteriaSpecification();
    }

    /**
     * Create an instance of {@link GeographicArea }
     * 
     */
    public GeographicArea createGeographicArea() {
        return new GeographicArea();
    }

    /**
     * Create an instance of {@link IndividualNameCollection }
     * 
     */
    public IndividualNameCollection createIndividualNameCollection() {
        return new IndividualNameCollection();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link ContactMediumCollection }
     * 
     */
    public ContactMediumCollection createContactMediumCollection() {
        return new ContactMediumCollection();
    }

    /**
     * Create an instance of {@link DealerCode }
     * 
     */
    public DealerCode createDealerCode() {
        return new DealerCode();
    }

    /**
     * Create an instance of {@link Characteristics }
     * 
     */
    public Characteristics createCharacteristics() {
        return new Characteristics();
    }

    /**
     * Create an instance of {@link UrbanPropertyAddressCollection }
     * 
     */
    public UrbanPropertyAddressCollection createUrbanPropertyAddressCollection() {
        return new UrbanPropertyAddressCollection();
    }

    /**
     * Create an instance of {@link CharacteristicSpecCollection }
     * 
     */
    public CharacteristicSpecCollection createCharacteristicSpecCollection() {
        return new CharacteristicSpecCollection();
    }

    /**
     * Create an instance of {@link PhysicalResourceCollection }
     * 
     */
    public PhysicalResourceCollection createPhysicalResourceCollection() {
        return new PhysicalResourceCollection();
    }

    /**
     * Create an instance of {@link AgreementItemCollection }
     * 
     */
    public AgreementItemCollection createAgreementItemCollection() {
        return new AgreementItemCollection();
    }

    /**
     * Create an instance of {@link WorkOrderCollection }
     * 
     */
    public WorkOrderCollection createWorkOrderCollection() {
        return new WorkOrderCollection();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link CharacteristicsCollection }
     * 
     */
    public CharacteristicsCollection createCharacteristicsCollection() {
        return new CharacteristicsCollection();
    }

    /**
     * Create an instance of {@link SortingCollection }
     * 
     */
    public SortingCollection createSortingCollection() {
        return new SortingCollection();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link IndividualName }
     * 
     */
    public IndividualName createIndividualName() {
        return new IndividualName();
    }

    /**
     * Create an instance of {@link FilterCollection }
     * 
     */
    public FilterCollection createFilterCollection() {
        return new FilterCollection();
    }

    /**
     * Create an instance of {@link LessThan }
     * 
     */
    public LessThan createLessThan() {
        return new LessThan();
    }

    /**
     * Create an instance of {@link IsNotNull }
     * 
     */
    public IsNotNull createIsNotNull() {
        return new IsNotNull();
    }

    /**
     * Create an instance of {@link Like }
     * 
     */
    public Like createLike() {
        return new Like();
    }

    /**
     * Create an instance of {@link MovementCategoryType }
     * 
     */
    public MovementCategoryType createMovementCategoryType() {
        return new MovementCategoryType();
    }

    /**
     * Create an instance of {@link Between }
     * 
     */
    public Between createBetween() {
        return new Between();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link PhysicalDeviceCollection }
     * 
     */
    public PhysicalDeviceCollection createPhysicalDeviceCollection() {
        return new PhysicalDeviceCollection();
    }

    /**
     * Create an instance of {@link Province }
     * 
     */
    public Province createProvince() {
        return new Province();
    }

    /**
     * Create an instance of {@link CharacteristicSpec }
     * 
     */
    public CharacteristicSpec createCharacteristicSpec() {
        return new CharacteristicSpec();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link Individual }
     * 
     */
    public Individual createIndividual() {
        return new Individual();
    }

    /**
     * Create an instance of {@link ServiceProvider }
     * 
     */
    public ServiceProvider createServiceProvider() {
        return new ServiceProvider();
    }

    /**
     * Create an instance of {@link ValueCollection }
     * 
     */
    public ValueCollection createValueCollection() {
        return new ValueCollection();
    }

    /**
     * Create an instance of {@link ContactMedium }
     * 
     */
    public ContactMedium createContactMedium() {
        return new ContactMedium();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link LanguageAbility }
     * 
     */
    public LanguageAbility createLanguageAbility() {
        return new LanguageAbility();
    }

    /**
     * Create an instance of {@link DealerCodesCollection }
     * 
     */
    public DealerCodesCollection createDealerCodesCollection() {
        return new DealerCodesCollection();
    }

    /**
     * Create an instance of {@link PhysicalResource }
     * 
     */
    public PhysicalResource createPhysicalResource() {
        return new PhysicalResource();
    }

    /**
     * Create an instance of {@link CreditCardCollection }
     * 
     */
    public CreditCardCollection createCreditCardCollection() {
        return new CreditCardCollection();
    }

    /**
     * Create an instance of {@link IndividualIdentificationCollection }
     * 
     */
    public IndividualIdentificationCollection createIndividualIdentificationCollection() {
        return new IndividualIdentificationCollection();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link WorkOrderItemCollection }
     * 
     */
    public WorkOrderItemCollection createWorkOrderItemCollection() {
        return new WorkOrderItemCollection();
    }

    /**
     * Create an instance of {@link GeographicAddress }
     * 
     */
    public GeographicAddress createGeographicAddress() {
        return new GeographicAddress();
    }

    /**
     * Create an instance of {@link LessThanOrEqualTo }
     * 
     */
    public LessThanOrEqualTo createLessThanOrEqualTo() {
        return new LessThanOrEqualTo();
    }

    /**
     * Create an instance of {@link GeographicPostcode }
     * 
     */
    public GeographicPostcode createGeographicPostcode() {
        return new GeographicPostcode();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link IndividualIdentification }
     * 
     */
    public IndividualIdentification createIndividualIdentification() {
        return new IndividualIdentification();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link CommandStatusResponse }
     * 
     */
    public CommandStatusResponse createCommandStatusResponse() {
        return new CommandStatusResponse();
    }

    /**
     * Create an instance of {@link IntegerCollection }
     * 
     */
    public IntegerCollection createIntegerCollection() {
        return new IntegerCollection();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link Sorting }
     * 
     */
    public Sorting createSorting() {
        return new Sorting();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link TelecomTechnician }
     * 
     */
    public TelecomTechnician createTelecomTechnician() {
        return new TelecomTechnician();
    }

    /**
     * Create an instance of {@link IsNull }
     * 
     */
    public IsNull createIsNull() {
        return new IsNull();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductCollection }
     * 
     */
    public ProductCollection createProductCollection() {
        return new ProductCollection();
    }

    /**
     * Create an instance of {@link CustomerProductOfferCollection }
     * 
     */
    public CustomerProductOfferCollection createCustomerProductOfferCollection() {
        return new CustomerProductOfferCollection();
    }

    /**
     * Create an instance of {@link ProductCharacteristicValue }
     * 
     */
    public ProductCharacteristicValue createProductCharacteristicValue() {
        return new ProductCharacteristicValue();
    }

    /**
     * Create an instance of {@link ProductPriceCollection }
     * 
     */
    public ProductPriceCollection createProductPriceCollection() {
        return new ProductPriceCollection();
    }

    /**
     * Create an instance of {@link ProductStatus }
     * 
     */
    public ProductStatus createProductStatus() {
        return new ProductStatus();
    }

    /**
     * Create an instance of {@link ProductPrice }
     * 
     */
    public ProductPrice createProductPrice() {
        return new ProductPrice();
    }

    /**
     * Create an instance of {@link ProductCharacteristicValueCollection }
     * 
     */
    public ProductCharacteristicValueCollection createProductCharacteristicValueCollection() {
        return new ProductCharacteristicValueCollection();
    }

    /**
     * Create an instance of {@link ProductOffer }
     * 
     */
    public ProductOffer createProductOffer() {
        return new ProductOffer();
    }

    /**
     * Create an instance of {@link CustomerProductOffer }
     * 
     */
    public CustomerProductOffer createCustomerProductOffer() {
        return new CustomerProductOffer();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link ProductOfferCollection }
     * 
     */
    public ProductOfferCollection createProductOfferCollection() {
        return new ProductOfferCollection();
    }

    /**
     * Create an instance of {@link ProductSpecCharacteristic }
     * 
     */
    public ProductSpecCharacteristic createProductSpecCharacteristic() {
        return new ProductSpecCharacteristic();
    }

    /**
     * Create an instance of {@link ConnectionContext }
     * 
     */
    public ConnectionContext createConnectionContext() {
        return new ConnectionContext();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/common/v1-0", name = "WorkOrderType")
    public JAXBElement<WorkOrder> createWorkOrderType(WorkOrder value) {
        return new JAXBElement<WorkOrder>(_WorkOrderType_QNAME, WorkOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/common/v1-0", name = "WorkOrderItemType")
    public JAXBElement<WorkOrderItem> createWorkOrderItemType(WorkOrderItem value) {
        return new JAXBElement<WorkOrderItem>(_WorkOrderItemType_QNAME, WorkOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UrbanPropertyAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/common/v1-0", name = "UrbanPropertyAddress")
    public JAXBElement<UrbanPropertyAddress> createUrbanPropertyAddress(UrbanPropertyAddress value) {
        return new JAXBElement<UrbanPropertyAddress>(_UrbanPropertyAddress_QNAME, UrbanPropertyAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/product/v1-0", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/product/v1-0", name = "ProductType")
    public JAXBElement<Product> createProductType(Product value) {
        return new JAXBElement<Product>(_ProductType_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Equal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/common/v1-0", name = "FilterItem")
    public JAXBElement<Equal> createFilterItem(Equal value) {
        return new JAXBElement<Equal>(_FilterItem_QNAME, Equal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "CustomerSchedules")
    public JAXBElement<CustomerSchedule> createCustomerSchedules(CustomerSchedule value) {
        return new JAXBElement<CustomerSchedule>(_CustomerSchedules_QNAME, CustomerSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "CustomerType")
    public JAXBElement<Customer> createCustomerType(Customer value) {
        return new JAXBElement<Customer>(_CustomerType_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkOrderItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/common/v1-0", name = "WorkOrderItem")
    public JAXBElement<WorkOrderItem> createWorkOrderItem(WorkOrderItem value) {
        return new JAXBElement<WorkOrderItem>(_WorkOrderItem_QNAME, WorkOrderItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAccountChargeSumBalanceCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "CustomerAccountChargeSumBalanceCollectionType")
    public JAXBElement<CustomerAccountChargeSumBalanceCollection> createCustomerAccountChargeSumBalanceCollectionType(CustomerAccountChargeSumBalanceCollection value) {
        return new JAXBElement<CustomerAccountChargeSumBalanceCollection>(_CustomerAccountChargeSumBalanceCollectionType_QNAME, CustomerAccountChargeSumBalanceCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "inputIds")
    public JAXBElement<ArrayOfIds> createInputIds(ArrayOfIds value) {
        return new JAXBElement<ArrayOfIds>(_InputIds_QNAME, ArrayOfIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommercialProductInvoiceLineText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = CommercialProductInvoiceLineTextCollection.class)
    public JAXBElement<ArrayOfCommercialProductInvoiceLineText> createCommercialProductInvoiceLineTextCollectionItems(ArrayOfCommercialProductInvoiceLineText value) {
        return new JAXBElement<ArrayOfCommercialProductInvoiceLineText>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfCommercialProductInvoiceLineText.class, CommercialProductInvoiceLineTextCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = TechnicalProductCommercialProduct.class)
    public JAXBElement<String> createTechnicalProductCommercialProductExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, TechnicalProductCommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ExternalProductId", scope = TechnicalProductCommercialProduct.class)
    public JAXBElement<Integer> createTechnicalProductCommercialProductExternalProductId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductExternalProductId_QNAME, Integer.class, TechnicalProductCommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = TechnicalProductCommercialProduct.class)
    public JAXBElement<Integer> createTechnicalProductCommercialProductId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, TechnicalProductCommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "BusinessUnitId", scope = TechnicalProductCommercialProduct.class)
    public JAXBElement<Integer> createTechnicalProductCommercialProductBusinessUnitId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductBusinessUnitId_QNAME, Integer.class, TechnicalProductCommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "TechnicalProductId", scope = TechnicalProductCommercialProduct.class)
    public JAXBElement<Integer> createTechnicalProductCommercialProductTechnicalProductId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductTechnicalProductId_QNAME, Integer.class, TechnicalProductCommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = CommercialProductInvoiceLineText.class)
    public JAXBElement<String> createCommercialProductInvoiceLineTextExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, CommercialProductInvoiceLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Text", scope = CommercialProductInvoiceLineText.class)
    public JAXBElement<String> createCommercialProductInvoiceLineTextText(String value) {
        return new JAXBElement<String>(_CommercialProductInvoiceLineTextText_QNAME, String.class, CommercialProductInvoiceLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = CommercialProductInvoiceLineText.class)
    public JAXBElement<Integer> createCommercialProductInvoiceLineTextId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, CommercialProductInvoiceLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "LanguageKey", scope = CommercialProductInvoiceLineText.class)
    public JAXBElement<String> createCommercialProductInvoiceLineTextLanguageKey(String value) {
        return new JAXBElement<String>(_CommercialProductInvoiceLineTextLanguageKey_QNAME, String.class, CommercialProductInvoiceLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ReversalText", scope = CommercialProductInvoiceLineText.class)
    public JAXBElement<String> createCommercialProductInvoiceLineTextReversalText(String value) {
        return new JAXBElement<String>(_CommercialProductInvoiceLineTextReversalText_QNAME, String.class, CommercialProductInvoiceLineText.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowedModelCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowedModels", scope = CommercialProduct.class)
    public JAXBElement<AllowedModelCollection> createCommercialProductAllowedModels(AllowedModelCollection value) {
        return new JAXBElement<AllowedModelCollection>(_CommercialProductAllowedModels_QNAME, AllowedModelCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "EditRulesId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductEditRulesId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductEditRulesId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Notes", scope = CommercialProduct.class)
    public JAXBElement<String> createCommercialProductNotes(String value) {
        return new JAXBElement<String>(_CommercialProductNotes_QNAME, String.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CaptureRuleId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductCaptureRuleId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductCaptureRuleId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ExternalProductCodeId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductExternalProductCodeId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductExternalProductCodeId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CommercialProductIds", scope = CommercialProduct.class)
    public JAXBElement<ArrayOfint> createCommercialProductCommercialProductIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CommercialProductCommercialProductIds_QNAME, ArrayOfint.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalProductCommercialProductCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "TechnicalProducts", scope = CommercialProduct.class)
    public JAXBElement<TechnicalProductCommercialProductCollection> createCommercialProductTechnicalProducts(TechnicalProductCommercialProductCollection value) {
        return new JAXBElement<TechnicalProductCommercialProductCollection>(_CommercialProductTechnicalProducts_QNAME, TechnicalProductCommercialProductCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AgreementDetailSpearId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductAgreementDetailSpearId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductAgreementDetailSpearId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialProductEPCMappingCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "EPCMappings", scope = CommercialProduct.class)
    public JAXBElement<CommercialProductEPCMappingCollection> createCommercialProductEPCMappings(CommercialProductEPCMappingCollection value) {
        return new JAXBElement<CommercialProductEPCMappingCollection>(_CommercialProductEPCMappings_QNAME, CommercialProductEPCMappingCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IsUnitOfMeasurementRequired", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductIsUnitOfMeasurementRequired(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductIsUnitOfMeasurementRequired_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "MinSleepDays", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductMinSleepDays(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductMinSleepDays_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Name", scope = CommercialProduct.class)
    public JAXBElement<String> createCommercialProductName(String value) {
        return new JAXBElement<String>(_CommercialProductName_QNAME, String.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = CommercialProduct.class)
    public JAXBElement<String> createCommercialProductExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "SellFrom", scope = CommercialProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCommercialProductSellFrom(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CommercialProductSellFrom_QNAME, XMLGregorianCalendar.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AvailableDate", scope = CommercialProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCommercialProductAvailableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CommercialProductAvailableDate_QNAME, XMLGregorianCalendar.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "TechnicalProductIds", scope = CommercialProduct.class)
    public JAXBElement<ArrayOfint> createCommercialProductTechnicalProductIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CommercialProductTechnicalProductIds_QNAME, ArrayOfint.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CategoryWeight", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductCategoryWeight(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductCategoryWeight_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "UsersRoles", scope = CommercialProduct.class)
    public JAXBElement<ArrayOfstring> createCommercialProductUsersRoles(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CommercialProductUsersRoles_QNAME, ArrayOfstring.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CategoryId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductCategoryId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductCategoryId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "MatchQuantity", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductMatchQuantity(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductMatchQuantity_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowSleep", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductAllowSleep(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductAllowSleep_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Description", scope = CommercialProduct.class)
    public JAXBElement<String> createCommercialProductDescription(String value) {
        return new JAXBElement<String>(_CommercialProductDescription_QNAME, String.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Hyperlink", scope = CommercialProduct.class)
    public JAXBElement<String> createCommercialProductHyperlink(String value) {
        return new JAXBElement<String>(_CommercialProductHyperlink_QNAME, String.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "OverrideCAEntitlements", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductOverrideCAEntitlements(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductOverrideCAEntitlements_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "UnitOfMeasurementId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductUnitOfMeasurementId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductUnitOfMeasurementId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "RequiredCommercialProducts", scope = CommercialProduct.class)
    public JAXBElement<ProductCombinationScopeCollection> createCommercialProductRequiredCommercialProducts(ProductCombinationScopeCollection value) {
        return new JAXBElement<ProductCombinationScopeCollection>(_CommercialProductRequiredCommercialProducts_QNAME, ProductCombinationScopeCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowedEventsId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductAllowedEventsId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductAllowedEventsId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowedForPurchasedOfferDefinition", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductAllowedForPurchasedOfferDefinition(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductAllowedForPurchasedOfferDefinition_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "DefaultChargePeriod", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductDefaultChargePeriod(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductDefaultChargePeriod_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommercialProductInvoiceLineTextCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "InvoiceLineTexts", scope = CommercialProduct.class)
    public JAXBElement<CommercialProductInvoiceLineTextCollection> createCommercialProductInvoiceLineTexts(CommercialProductInvoiceLineTextCollection value) {
        return new JAXBElement<CommercialProductInvoiceLineTextCollection>(_CommercialProductInvoiceLineTexts_QNAME, CommercialProductInvoiceLineTextCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "DefaultFinanceOptionId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductDefaultFinanceOptionId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductDefaultFinanceOptionId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "TaxExternalProductCodeId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductTaxExternalProductCodeId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductTaxExternalProductCodeId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCombinationScopeCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ExcludedCommercialProducts", scope = CommercialProduct.class)
    public JAXBElement<ProductCombinationScopeCollection> createCommercialProductExcludedCommercialProducts(ProductCombinationScopeCollection value) {
        return new JAXBElement<ProductCombinationScopeCollection>(_CommercialProductExcludedCommercialProducts_QNAME, ProductCombinationScopeCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IconId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductIconId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductIconId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowedBusinessUnits", scope = CommercialProduct.class)
    public JAXBElement<ArrayOfint> createCommercialProductAllowedBusinessUnits(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CommercialProductAllowedBusinessUnits_QNAME, ArrayOfint.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "MaxsdleepDays", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductMaxsdleepDays(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductMaxsdleepDays_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "PrepaidRequiredBalance", scope = CommercialProduct.class)
    public JAXBElement<BigDecimal> createCommercialProductPrepaidRequiredBalance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CommercialProductPrepaidRequiredBalance_QNAME, BigDecimal.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowedMarketSegmentIds", scope = CommercialProduct.class)
    public JAXBElement<ArrayOfint> createCommercialProductAllowedMarketSegmentIds(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CommercialProductAllowedMarketSegmentIds_QNAME, ArrayOfint.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "SellTo", scope = CommercialProduct.class)
    public JAXBElement<XMLGregorianCalendar> createCommercialProductSellTo(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CommercialProductSellTo_QNAME, XMLGregorianCalendar.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ContractPeriodIdToOverrideOnAD", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductContractPeriodIdToOverrideOnAD(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductContractPeriodIdToOverrideOnAD_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "AllowQtyToBeUpdated", scope = CommercialProduct.class)
    public JAXBElement<Boolean> createCommercialProductAllowQtyToBeUpdated(Boolean value) {
        return new JAXBElement<Boolean>(_CommercialProductAllowQtyToBeUpdated_QNAME, Boolean.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAEntitlementCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CAEntitlements", scope = CommercialProduct.class)
    public JAXBElement<CAEntitlementCollection> createCommercialProductCAEntitlements(CAEntitlementCollection value) {
        return new JAXBElement<CAEntitlementCollection>(_CommercialProductCAEntitlements_QNAME, CAEntitlementCollection.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "BusinessUnitId", scope = CommercialProduct.class)
    public JAXBElement<Integer> createCommercialProductBusinessUnitId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductBusinessUnitId_QNAME, Integer.class, CommercialProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ModelId", scope = AllowedModel.class)
    public JAXBElement<Integer> createAllowedModelModelId(Integer value) {
        return new JAXBElement<Integer>(_AllowedModelModelId_QNAME, Integer.class, AllowedModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = AllowedModel.class)
    public JAXBElement<String> createAllowedModelExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, AllowedModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = AllowedModel.class)
    public JAXBElement<Integer> createAllowedModelId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, AllowedModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "TechnicalProductId", scope = AllowedModel.class)
    public JAXBElement<Integer> createAllowedModelTechnicalProductId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductTechnicalProductId_QNAME, Integer.class, AllowedModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCAEntitlement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = CAEntitlementCollection.class)
    public JAXBElement<ArrayOfCAEntitlement> createCAEntitlementCollectionItems(ArrayOfCAEntitlement value) {
        return new JAXBElement<ArrayOfCAEntitlement>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfCAEntitlement.class, CAEntitlementCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTechnicalProductCommercialProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = TechnicalProductCommercialProductCollection.class)
    public JAXBElement<ArrayOfTechnicalProductCommercialProduct> createTechnicalProductCommercialProductCollectionItems(ArrayOfTechnicalProductCommercialProduct value) {
        return new JAXBElement<ArrayOfTechnicalProductCommercialProduct>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfTechnicalProductCommercialProduct.class, TechnicalProductCommercialProductCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductCombinationScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = ProductCombinationScopeCollection.class)
    public JAXBElement<ArrayOfProductCombinationScope> createProductCombinationScopeCollectionItems(ArrayOfProductCombinationScope value) {
        return new JAXBElement<ArrayOfProductCombinationScope>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfProductCombinationScope.class, ProductCombinationScopeCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Entitlements2", scope = CAEntitlement.class)
    public JAXBElement<String> createCAEntitlementEntitlements2(String value) {
        return new JAXBElement<String>(_CAEntitlementEntitlements2_QNAME, String.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Entitlements3", scope = CAEntitlement.class)
    public JAXBElement<String> createCAEntitlementEntitlements3(String value) {
        return new JAXBElement<String>(_CAEntitlementEntitlements3_QNAME, String.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = CAEntitlement.class)
    public JAXBElement<String> createCAEntitlementExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Entitlements1", scope = CAEntitlement.class)
    public JAXBElement<String> createCAEntitlementEntitlements1(String value) {
        return new JAXBElement<String>(_CAEntitlementEntitlements1_QNAME, String.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = CAEntitlement.class)
    public JAXBElement<Integer> createCAEntitlementId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "EntitlementGeoRegionFilterList", scope = CAEntitlement.class)
    public JAXBElement<ArrayOfint> createCAEntitlementEntitlementGeoRegionFilterList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CAEntitlementEntitlementGeoRegionFilterList_QNAME, ArrayOfint.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CASystemId", scope = CAEntitlement.class)
    public JAXBElement<Integer> createCAEntitlementCASystemId(Integer value) {
        return new JAXBElement<Integer>(_CAEntitlementCASystemId_QNAME, Integer.class, CAEntitlement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommercialProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = CommercialProductCollection.class)
    public JAXBElement<ArrayOfCommercialProduct> createCommercialProductCollectionItems(ArrayOfCommercialProduct value) {
        return new JAXBElement<ArrayOfCommercialProduct>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfCommercialProduct.class, CommercialProductCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IsAgreementLevel", scope = ProductCombinationScope.class)
    public JAXBElement<Boolean> createProductCombinationScopeIsAgreementLevel(Boolean value) {
        return new JAXBElement<Boolean>(_ProductCombinationScopeIsAgreementLevel_QNAME, Boolean.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = ProductCombinationScope.class)
    public JAXBElement<String> createProductCombinationScopeExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = ProductCombinationScope.class)
    public JAXBElement<Integer> createProductCombinationScopeId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IsFinancialAccountLevel", scope = ProductCombinationScope.class)
    public JAXBElement<Boolean> createProductCombinationScopeIsFinancialAccountLevel(Boolean value) {
        return new JAXBElement<Boolean>(_ProductCombinationScopeIsFinancialAccountLevel_QNAME, Boolean.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ProductCombinationId", scope = ProductCombinationScope.class)
    public JAXBElement<Integer> createProductCombinationScopeProductCombinationId(Integer value) {
        return new JAXBElement<Integer>(_ProductCombinationScopeProductCombinationId_QNAME, Integer.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IsCustomerLevel", scope = ProductCombinationScope.class)
    public JAXBElement<Boolean> createProductCombinationScopeIsCustomerLevel(Boolean value) {
        return new JAXBElement<Boolean>(_ProductCombinationScopeIsCustomerLevel_QNAME, Boolean.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "IsDevicesLevel", scope = ProductCombinationScope.class)
    public JAXBElement<Boolean> createProductCombinationScopeIsDevicesLevel(Boolean value) {
        return new JAXBElement<Boolean>(_ProductCombinationScopeIsDevicesLevel_QNAME, Boolean.class, ProductCombinationScope.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCommercialProductEPCMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = CommercialProductEPCMappingCollection.class)
    public JAXBElement<ArrayOfCommercialProductEPCMapping> createCommercialProductEPCMappingCollectionItems(ArrayOfCommercialProductEPCMapping value) {
        return new JAXBElement<ArrayOfCommercialProductEPCMapping>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfCommercialProductEPCMapping.class, CommercialProductEPCMappingCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllowedModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Items", scope = AllowedModelCollection.class)
    public JAXBElement<ArrayOfAllowedModel> createAllowedModelCollectionItems(ArrayOfAllowedModel value) {
        return new JAXBElement<ArrayOfAllowedModel>(_CommercialProductInvoiceLineTextCollectionItems_QNAME, ArrayOfAllowedModel.class, AllowedModelCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "CommercialProductId", scope = CommercialProductEPCMapping.class)
    public JAXBElement<Integer> createCommercialProductEPCMappingCommercialProductId(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductEPCMappingCommercialProductId_QNAME, Integer.class, CommercialProductEPCMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Extended", scope = CommercialProductEPCMapping.class)
    public JAXBElement<String> createCommercialProductEPCMappingExtended(String value) {
        return new JAXBElement<String>(_TechnicalProductCommercialProductExtended_QNAME, String.class, CommercialProductEPCMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "Id", scope = CommercialProductEPCMapping.class)
    public JAXBElement<Integer> createCommercialProductEPCMappingId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductId_QNAME, Integer.class, CommercialProductEPCMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "ExternalProductCodeIdIfCommissionable", scope = CommercialProductEPCMapping.class)
    public JAXBElement<Integer> createCommercialProductEPCMappingExternalProductCodeIdIfCommissionable(Integer value) {
        return new JAXBElement<Integer>(_CommercialProductEPCMappingExternalProductCodeIdIfCommissionable_QNAME, Integer.class, CommercialProductEPCMapping.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", name = "BusinessUnitId", scope = CommercialProductEPCMapping.class)
    public JAXBElement<Integer> createCommercialProductEPCMappingBusinessUnitId(Integer value) {
        return new JAXBElement<Integer>(_TechnicalProductCommercialProductBusinessUnitId_QNAME, Integer.class, CommercialProductEPCMapping.class, value);
    }

}
