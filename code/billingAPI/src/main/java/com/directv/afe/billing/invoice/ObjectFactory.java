
package com.directv.afe.billing.invoice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.directv.afe.billing.invoice package. 
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
    private final static QName _Product_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "Product");
    private final static QName _ProductType_QNAME = new QName("http://directvla.com/schema/businessdomain/product/v1-0", "ProductType");
    private final static QName _CustomerType_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "CustomerType");
    private final static QName _CustomerAccountChargeSumBalanceCollectionType_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "CustomerAccountChargeSumBalanceCollectionType");
    private final static QName _LedgerAccountReverseLedgerAccountId_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "ReverseLedgerAccountId");
    private final static QName _LedgerAccountType_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "Type");
    private final static QName _LedgerAccountCode_QNAME = new QName("http://directvla.com/schema/businessdomain/customer/v1-0", "Code");
    private final static QName _GetCustomerFinancialAnalysisCreditCardNumber_QNAME = new QName("http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", "creditCardNumber");
    private final static QName _GetCustomerFinancialAnalysisIdentification_QNAME = new QName("http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", "Identification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.directv.afe.billing.invoice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerFinancialInfoRequest }
     * 
     */
    public GetCustomerFinancialInfoRequest createGetCustomerFinancialInfoRequest() {
        return new GetCustomerFinancialInfoRequest();
    }

    /**
     * Create an instance of {@link RequestMetadataType }
     * 
     */
    public RequestMetadataType createRequestMetadataType() {
        return new RequestMetadataType();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialInfo }
     * 
     */
    public GetCustomerFinancialInfo createGetCustomerFinancialInfo() {
        return new GetCustomerFinancialInfo();
    }

    /**
     * Create an instance of {@link GetLedgerAccountByIdException }
     * 
     */
    public GetLedgerAccountByIdException createGetLedgerAccountByIdException() {
        return new GetLedgerAccountByIdException();
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
     * Create an instance of {@link GetLedgerAccountByIdRequest }
     * 
     */
    public GetLedgerAccountByIdRequest createGetLedgerAccountByIdRequest() {
        return new GetLedgerAccountByIdRequest();
    }

    /**
     * Create an instance of {@link GetLedgerAccountById }
     * 
     */
    public GetLedgerAccountById createGetLedgerAccountById() {
        return new GetLedgerAccountById();
    }

    /**
     * Create an instance of {@link GetCustomerLastInvoiceException }
     * 
     */
    public GetCustomerLastInvoiceException createGetCustomerLastInvoiceException() {
        return new GetCustomerLastInvoiceException();
    }

    /**
     * Create an instance of {@link InvoiceNumberHistoryCollection }
     * 
     */
    public InvoiceNumberHistoryCollection createInvoiceNumberHistoryCollection() {
        return new InvoiceNumberHistoryCollection();
    }

    /**
     * Create an instance of {@link InvoiceIDNumberType }
     * 
     */
    public InvoiceIDNumberType createInvoiceIDNumberType() {
        return new InvoiceIDNumberType();
    }

    /**
     * Create an instance of {@link GetCustomerLastInvoiceRequest }
     * 
     */
    public GetCustomerLastInvoiceRequest createGetCustomerLastInvoiceRequest() {
        return new GetCustomerLastInvoiceRequest();
    }

    /**
     * Create an instance of {@link GetCustomerLastInvoice }
     * 
     */
    public GetCustomerLastInvoice createGetCustomerLastInvoice() {
        return new GetCustomerLastInvoice();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialAnalysisException }
     * 
     */
    public GetCustomerFinancialAnalysisException createGetCustomerFinancialAnalysisException() {
        return new GetCustomerFinancialAnalysisException();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionResponse }
     * 
     */
    public GetCustomerFinancialTransactionResponse createGetCustomerFinancialTransactionResponse() {
        return new GetCustomerFinancialTransactionResponse();
    }

    /**
     * Create an instance of {@link ResponseMetadataType }
     * 
     */
    public ResponseMetadataType createResponseMetadataType() {
        return new ResponseMetadataType();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionResult }
     * 
     */
    public GetCustomerFinancialTransactionResult createGetCustomerFinancialTransactionResult() {
        return new GetCustomerFinancialTransactionResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionRequest }
     * 
     */
    public GetCustomerFinancialTransactionRequest createGetCustomerFinancialTransactionRequest() {
        return new GetCustomerFinancialTransactionRequest();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransaction }
     * 
     */
    public GetCustomerFinancialTransaction createGetCustomerFinancialTransaction() {
        return new GetCustomerFinancialTransaction();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsResponse }
     * 
     */
    public GetCustomerFinancialTransactionsResponse createGetCustomerFinancialTransactionsResponse() {
        return new GetCustomerFinancialTransactionsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsResult }
     * 
     */
    public GetCustomerFinancialTransactionsResult createGetCustomerFinancialTransactionsResult() {
        return new GetCustomerFinancialTransactionsResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsException }
     * 
     */
    public GetCustomerFinancialTransactionsException createGetCustomerFinancialTransactionsException() {
        return new GetCustomerFinancialTransactionsException();
    }

    /**
     * Create an instance of {@link GetCustomerInvoicesException }
     * 
     */
    public GetCustomerInvoicesException createGetCustomerInvoicesException() {
        return new GetCustomerInvoicesException();
    }

    /**
     * Create an instance of {@link GetCustomerInvoicesRequest }
     * 
     */
    public GetCustomerInvoicesRequest createGetCustomerInvoicesRequest() {
        return new GetCustomerInvoicesRequest();
    }

    /**
     * Create an instance of {@link GetCustomerInvoices }
     * 
     */
    public GetCustomerInvoices createGetCustomerInvoices() {
        return new GetCustomerInvoices();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsByCriteriaResponse }
     * 
     */
    public GetCustomerFinancialTransactionsByCriteriaResponse createGetCustomerFinancialTransactionsByCriteriaResponse() {
        return new GetCustomerFinancialTransactionsByCriteriaResponse();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsByCriteriaResult }
     * 
     */
    public GetCustomerFinancialTransactionsByCriteriaResult createGetCustomerFinancialTransactionsByCriteriaResult() {
        return new GetCustomerFinancialTransactionsByCriteriaResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialInfoException }
     * 
     */
    public GetCustomerFinancialInfoException createGetCustomerFinancialInfoException() {
        return new GetCustomerFinancialInfoException();
    }

    /**
     * Create an instance of {@link GetCustomerInvoicesResponse }
     * 
     */
    public GetCustomerInvoicesResponse createGetCustomerInvoicesResponse() {
        return new GetCustomerInvoicesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerInvoicesResult }
     * 
     */
    public GetCustomerInvoicesResult createGetCustomerInvoicesResult() {
        return new GetCustomerInvoicesResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsByCriteriaException }
     * 
     */
    public GetCustomerFinancialTransactionsByCriteriaException createGetCustomerFinancialTransactionsByCriteriaException() {
        return new GetCustomerFinancialTransactionsByCriteriaException();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionException }
     * 
     */
    public GetCustomerFinancialTransactionException createGetCustomerFinancialTransactionException() {
        return new GetCustomerFinancialTransactionException();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsByCriteriaRequest }
     * 
     */
    public GetCustomerFinancialTransactionsByCriteriaRequest createGetCustomerFinancialTransactionsByCriteriaRequest() {
        return new GetCustomerFinancialTransactionsByCriteriaRequest();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsByCriteria }
     * 
     */
    public GetCustomerFinancialTransactionsByCriteria createGetCustomerFinancialTransactionsByCriteria() {
        return new GetCustomerFinancialTransactionsByCriteria();
    }

    /**
     * Create an instance of {@link GetCustomerInvoiceByIdRequest }
     * 
     */
    public GetCustomerInvoiceByIdRequest createGetCustomerInvoiceByIdRequest() {
        return new GetCustomerInvoiceByIdRequest();
    }

    /**
     * Create an instance of {@link GetCustomerInvoiceById }
     * 
     */
    public GetCustomerInvoiceById createGetCustomerInvoiceById() {
        return new GetCustomerInvoiceById();
    }

    /**
     * Create an instance of {@link GetCustomerInvoiceByIdException }
     * 
     */
    public GetCustomerInvoiceByIdException createGetCustomerInvoiceByIdException() {
        return new GetCustomerInvoiceByIdException();
    }

    /**
     * Create an instance of {@link GetLedgerAccountByIdResponse }
     * 
     */
    public GetLedgerAccountByIdResponse createGetLedgerAccountByIdResponse() {
        return new GetLedgerAccountByIdResponse();
    }

    /**
     * Create an instance of {@link GetLedgerAccountByIdResult }
     * 
     */
    public GetLedgerAccountByIdResult createGetLedgerAccountByIdResult() {
        return new GetLedgerAccountByIdResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactionsRequest }
     * 
     */
    public GetCustomerFinancialTransactionsRequest createGetCustomerFinancialTransactionsRequest() {
        return new GetCustomerFinancialTransactionsRequest();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialTransactions }
     * 
     */
    public GetCustomerFinancialTransactions createGetCustomerFinancialTransactions() {
        return new GetCustomerFinancialTransactions();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialAnalysisResponse }
     * 
     */
    public GetCustomerFinancialAnalysisResponse createGetCustomerFinancialAnalysisResponse() {
        return new GetCustomerFinancialAnalysisResponse();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialAnalysisResult }
     * 
     */
    public GetCustomerFinancialAnalysisResult createGetCustomerFinancialAnalysisResult() {
        return new GetCustomerFinancialAnalysisResult();
    }

    /**
     * Create an instance of {@link GetCustomerInvoiceByIdResponse }
     * 
     */
    public GetCustomerInvoiceByIdResponse createGetCustomerInvoiceByIdResponse() {
        return new GetCustomerInvoiceByIdResponse();
    }

    /**
     * Create an instance of {@link GetCustomerInvoiceByIdResult }
     * 
     */
    public GetCustomerInvoiceByIdResult createGetCustomerInvoiceByIdResult() {
        return new GetCustomerInvoiceByIdResult();
    }

    /**
     * Create an instance of {@link GetCustomerLastInvoiceResponse }
     * 
     */
    public GetCustomerLastInvoiceResponse createGetCustomerLastInvoiceResponse() {
        return new GetCustomerLastInvoiceResponse();
    }

    /**
     * Create an instance of {@link GetCustomerLastInvoiceResult }
     * 
     */
    public GetCustomerLastInvoiceResult createGetCustomerLastInvoiceResult() {
        return new GetCustomerLastInvoiceResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialInfoResponse }
     * 
     */
    public GetCustomerFinancialInfoResponse createGetCustomerFinancialInfoResponse() {
        return new GetCustomerFinancialInfoResponse();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialInfoResult }
     * 
     */
    public GetCustomerFinancialInfoResult createGetCustomerFinancialInfoResult() {
        return new GetCustomerFinancialInfoResult();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialAnalysisRequest }
     * 
     */
    public GetCustomerFinancialAnalysisRequest createGetCustomerFinancialAnalysisRequest() {
        return new GetCustomerFinancialAnalysisRequest();
    }

    /**
     * Create an instance of {@link GetCustomerFinancialAnalysis }
     * 
     */
    public GetCustomerFinancialAnalysis createGetCustomerFinancialAnalysis() {
        return new GetCustomerFinancialAnalysis();
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
     * Create an instance of {@link CustomerSchedule }
     * 
     */
    public CustomerSchedule createCustomerSchedule() {
        return new CustomerSchedule();
    }

    /**
     * Create an instance of {@link CustomerAccountTaxExemption }
     * 
     */
    public CustomerAccountTaxExemption createCustomerAccountTaxExemption() {
        return new CustomerAccountTaxExemption();
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
     * Create an instance of {@link EmailContact }
     * 
     */
    public EmailContact createEmailContact() {
        return new EmailContact();
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
     * Create an instance of {@link Equal }
     * 
     */
    public Equal createEqual() {
        return new Equal();
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
     * Create an instance of {@link MovementCategoryType }
     * 
     */
    public MovementCategoryType createMovementCategoryType() {
        return new MovementCategoryType();
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
     * Create an instance of {@link Province }
     * 
     */
    public Province createProvince() {
        return new Province();
    }

    /**
     * Create an instance of {@link InternetIdentification }
     * 
     */
    public InternetIdentification createInternetIdentification() {
        return new InternetIdentification();
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
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link ShippingOrderCollection }
     * 
     */
    public ShippingOrderCollection createShippingOrderCollection() {
        return new ShippingOrderCollection();
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
     * Create an instance of {@link DealerCodesCollection }
     * 
     */
    public DealerCodesCollection createDealerCodesCollection() {
        return new DealerCodesCollection();
    }

    /**
     * Create an instance of {@link In }
     * 
     */
    public In createIn() {
        return new In();
    }

    /**
     * Create an instance of {@link UrbanPropertyAddress }
     * 
     */
    public UrbanPropertyAddress createUrbanPropertyAddress() {
        return new UrbanPropertyAddress();
    }

    /**
     * Create an instance of {@link BusinessInteractionType }
     * 
     */
    public BusinessInteractionType createBusinessInteractionType() {
        return new BusinessInteractionType();
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
     * Create an instance of {@link GreaterThanOrEqualTo }
     * 
     */
    public GreaterThanOrEqualTo createGreaterThanOrEqualTo() {
        return new GreaterThanOrEqualTo();
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
     * Create an instance of {@link LessThanOrEqualTo }
     * 
     */
    public LessThanOrEqualTo createLessThanOrEqualTo() {
        return new LessThanOrEqualTo();
    }

    /**
     * Create an instance of {@link CriteriaSpecification }
     * 
     */
    public CriteriaSpecification createCriteriaSpecification() {
        return new CriteriaSpecification();
    }

    /**
     * Create an instance of {@link GeographicPostcode }
     * 
     */
    public GeographicPostcode createGeographicPostcode() {
        return new GeographicPostcode();
    }

    /**
     * Create an instance of {@link GeographicArea }
     * 
     */
    public GeographicArea createGeographicArea() {
        return new GeographicArea();
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
     * Create an instance of {@link IndividualNameCollection }
     * 
     */
    public IndividualNameCollection createIndividualNameCollection() {
        return new IndividualNameCollection();
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
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
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
     * Create an instance of {@link WorkOrderCollection }
     * 
     */
    public WorkOrderCollection createWorkOrderCollection() {
        return new WorkOrderCollection();
    }

    /**
     * Create an instance of {@link IsNull }
     * 
     */
    public IsNull createIsNull() {
        return new IsNull();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "CustomerType")
    public JAXBElement<Customer> createCustomerType(Customer value) {
        return new JAXBElement<Customer>(_CustomerType_QNAME, Customer.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "ReverseLedgerAccountId", scope = LedgerAccount.class)
    public JAXBElement<Integer> createLedgerAccountReverseLedgerAccountId(Integer value) {
        return new JAXBElement<Integer>(_LedgerAccountReverseLedgerAccountId_QNAME, Integer.class, LedgerAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "Type", scope = LedgerAccount.class)
    public JAXBElement<String> createLedgerAccountType(String value) {
        return new JAXBElement<String>(_LedgerAccountType_QNAME, String.class, LedgerAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/customer/v1-0", name = "Code", scope = LedgerAccount.class)
    public JAXBElement<Integer> createLedgerAccountCode(Integer value) {
        return new JAXBElement<Integer>(_LedgerAccountCode_QNAME, Integer.class, LedgerAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", name = "creditCardNumber", scope = GetCustomerFinancialAnalysis.class)
    public JAXBElement<String> createGetCustomerFinancialAnalysisCreditCardNumber(String value) {
        return new JAXBElement<String>(_GetCustomerFinancialAnalysisCreditCardNumber_QNAME, String.class, GetCustomerFinancialAnalysis.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalIdentityCardIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://directvla.com/schema/businessdomain/ManageBillingEvents/v1-0", name = "Identification", scope = GetCustomerFinancialAnalysis.class)
    public JAXBElement<NationalIdentityCardIdentification> createGetCustomerFinancialAnalysisIdentification(NationalIdentityCardIdentification value) {
        return new JAXBElement<NationalIdentityCardIdentification>(_GetCustomerFinancialAnalysisIdentification_QNAME, NationalIdentityCardIdentification.class, GetCustomerFinancialAnalysis.class, value);
    }

}
