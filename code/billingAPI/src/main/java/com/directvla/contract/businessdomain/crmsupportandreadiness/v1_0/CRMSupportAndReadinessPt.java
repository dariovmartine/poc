
package com.directvla.contract.businessdomain.crmsupportandreadiness.v1_0;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementWithResourceRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementWithResourceResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAddressRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAddressResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerCharacteristicRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerCharacteristicResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerNoteRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerNoteResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerProductOfferRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerProductOfferResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerRelationRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerRelationResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddOrUpgradeCustomerProductInvolvementRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddOrUpgradeCustomerProductInvolvementResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductByProductIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductByProductIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteAllActiveCustomerSchedulesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteAllActiveCustomerSchedulesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerCharacteristicRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerCharacteristicResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferByProductOfferIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferByProductOfferIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleByIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleByIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DisconnectCustomerProductsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DisconnectCustomerProductsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAccountRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAccountResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAddressRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAddressResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAgreementRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAgreementResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerCharacteristicRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerCharacteristicResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductOfferRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductOfferResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditInvoiceRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditInvoiceResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicByTypeAndNameRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicByTypeAndNameResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommandStatusRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommandStatusResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommercialProductsByVersionRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommercialProductsByVersionResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAddressesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAddressesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAgreementsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAgreementsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAvailableUpgradesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAvailableUpgradesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerCharacteristicsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerCharacteristicsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByCriteriaRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByCriteriaResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysAndEventTypeRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysAndEventTypeResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerNotesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerNotesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsByCriteriaRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsByCriteriaResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductByStatusRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductByStatusResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByCriteriaRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByCriteriaResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByProductIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByProductIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsOfferRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsOfferResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRelationsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRelationsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesByCriteriaRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesByCriteriaResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerSchedulesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerSchedulesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByCreditCardRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByCreditCardResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByIdentificationRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByIdentificationResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByInternetUserIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByInternetUserIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByNamesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByNamesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByPhoneNumberRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByPhoneNumberResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersBySerialNumberRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersBySerialNumberResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetProductsOfferRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetProductsOfferResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.MoveResourceToCustomerRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.MoveResourceToCustomerResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReauthorizeCustomerResourcesRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReauthorizeCustomerResourcesResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductByProductIdRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductByProductIdResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceChangeMigrationRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceChangeMigrationResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceEndMovingRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceEndMovingResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceStartMovingRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceStartMovingResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleCancelCustomerProductBySerialNumberRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleCancelCustomerProductBySerialNumberResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleReconnectCustomerProductsRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleReconnectCustomerProductsResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.SendCommandRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.SendCommandResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerProductRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerProductResponse;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerResourceRequest;
import com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerResourceResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CRMSupportAndReadiness_pt", targetNamespace = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.directvla.schema.businessdomain.common.v1_0.ObjectFactory.class,
    com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ObjectFactory.class,
    com.directvla.schema.businessdomain.customer.v1_0.ObjectFactory.class,
    com.directvla.schema.businessdomain.product.v1_0.ObjectFactory.class,
    com.directvla.schema.context.common.v1_0.ObjectFactory.class,
    com.directvla.schema.util.commondatatypes.v1_0.ObjectFactory.class,
    com.directvla.schema.util.commonexceptions.v1_0.ObjectFactory.class
})
public interface CRMSupportAndReadinessPt {


    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerRelationResponse>
     */
    @WebMethod(operationName = "AddCustomerRelation", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerRelation")
    public Response<AddCustomerRelationResponse> addCustomerRelationAsync(
        @WebParam(name = "AddCustomerRelationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerRelationRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerRelation", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerRelation")
    public Future<?> addCustomerRelationAsync(
        @WebParam(name = "AddCustomerRelationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerRelationRequest parameter,
        @WebParam(name = "AddCustomerRelationResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerRelationResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerRelationResponse
     * @throws AddCustomerRelationException
     */
    @WebMethod(operationName = "AddCustomerRelation", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerRelation")
    @WebResult(name = "AddCustomerRelationResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerRelationResponse addCustomerRelation(
        @WebParam(name = "AddCustomerRelationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerRelationRequest parameter)
        throws AddCustomerRelationException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAgreementsResponse>
     */
    @WebMethod(operationName = "GetCustomerAgreements", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAgreements")
    public Response<GetCustomerAgreementsResponse> getCustomerAgreementsAsync(
        @WebParam(name = "GetCustomerAgreementsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAgreementsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerAgreements", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAgreements")
    public Future<?> getCustomerAgreementsAsync(
        @WebParam(name = "GetCustomerAgreementsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAgreementsRequest parameter,
        @WebParam(name = "GetCustomerAgreementsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerAgreementsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAgreementsResponse
     * @throws GetCustomerAgreementsException
     */
    @WebMethod(operationName = "GetCustomerAgreements", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAgreements")
    @WebResult(name = "GetCustomerAgreementsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerAgreementsResponse getCustomerAgreements(
        @WebParam(name = "GetCustomerAgreementsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAgreementsRequest parameter)
        throws GetCustomerAgreementsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByPhoneNumberResponse>
     */
    @WebMethod(operationName = "GetCustomersByPhoneNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByPhoneNumber")
    public Response<GetCustomersByPhoneNumberResponse> getCustomersByPhoneNumberAsync(
        @WebParam(name = "GetCustomersByPhoneNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByPhoneNumberRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersByPhoneNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByPhoneNumber")
    public Future<?> getCustomersByPhoneNumberAsync(
        @WebParam(name = "GetCustomersByPhoneNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByPhoneNumberRequest parameter,
        @WebParam(name = "GetCustomersByPhoneNumberResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersByPhoneNumberResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByPhoneNumberResponse
     * @throws GetCustomersByPhoneNumberException
     */
    @WebMethod(operationName = "GetCustomersByPhoneNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByPhoneNumber")
    @WebResult(name = "GetCustomersByPhoneNumberResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersByPhoneNumberResponse getCustomersByPhoneNumber(
        @WebParam(name = "GetCustomersByPhoneNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByPhoneNumberRequest parameter)
        throws GetCustomersByPhoneNumberException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountResponse>
     */
    @WebMethod(operationName = "AddCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccount")
    public Response<AddCustomerAccountResponse> addCustomerAccountAsync(
        @WebParam(name = "AddCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccount")
    public Future<?> addCustomerAccountAsync(
        @WebParam(name = "AddCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountRequest parameter,
        @WebParam(name = "AddCustomerAccountResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerAccountResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountResponse
     * @throws AddCustomerAccountException
     */
    @WebMethod(operationName = "AddCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccount")
    @WebResult(name = "AddCustomerAccountResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerAccountResponse addCustomerAccount(
        @WebParam(name = "AddCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountRequest parameter)
        throws AddCustomerAccountException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementResponse>
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvement")
    public Response<AddCustomerAccountProductInvolvementResponse> addCustomerAccountProductInvolvementAsync(
        @WebParam(name = "AddCustomerAccountProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvement")
    public Future<?> addCustomerAccountProductInvolvementAsync(
        @WebParam(name = "AddCustomerAccountProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementRequest parameter,
        @WebParam(name = "AddCustomerAccountProductInvolvementResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerAccountProductInvolvementResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementResponse
     * @throws AddCustomerAccountProductInvolvementException
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvement")
    @WebResult(name = "AddCustomerAccountProductInvolvementResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerAccountProductInvolvementResponse addCustomerAccountProductInvolvement(
        @WebParam(name = "AddCustomerAccountProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementRequest parameter)
        throws AddCustomerAccountProductInvolvementException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementWithResourceResponse>
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvementWithResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvementWithResource")
    public Response<AddCustomerAccountProductInvolvementWithResourceResponse> addCustomerAccountProductInvolvementWithResourceAsync(
        @WebParam(name = "AddCustomerAccountProductInvolvementWithResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementWithResourceRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvementWithResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvementWithResource")
    public Future<?> addCustomerAccountProductInvolvementWithResourceAsync(
        @WebParam(name = "AddCustomerAccountProductInvolvementWithResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementWithResourceRequest parameter,
        @WebParam(name = "AddCustomerAccountProductInvolvementWithResourceResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerAccountProductInvolvementWithResourceResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAccountProductInvolvementWithResourceResponse
     * @throws AddCustomerAccountProductInvolvementWithResourceException
     */
    @WebMethod(operationName = "AddCustomerAccountProductInvolvementWithResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAccountProductInvolvementWithResource")
    @WebResult(name = "AddCustomerAccountProductInvolvementWithResourceResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerAccountProductInvolvementWithResourceResponse addCustomerAccountProductInvolvementWithResource(
        @WebParam(name = "AddCustomerAccountProductInvolvementWithResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAccountProductInvolvementWithResourceRequest parameter)
        throws AddCustomerAccountProductInvolvementWithResourceException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAddressResponse>
     */
    @WebMethod(operationName = "AddCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAddress")
    public Response<AddCustomerAddressResponse> addCustomerAddressAsync(
        @WebParam(name = "AddCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAddressRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAddress")
    public Future<?> addCustomerAddressAsync(
        @WebParam(name = "AddCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAddressRequest parameter,
        @WebParam(name = "AddCustomerAddressResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerAddressResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAddressResponse
     * @throws AddCustomerAddressException
     */
    @WebMethod(operationName = "AddCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAddress")
    @WebResult(name = "AddCustomerAddressResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerAddressResponse addCustomerAddress(
        @WebParam(name = "AddCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAddressRequest parameter)
        throws AddCustomerAddressException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementResponse>
     */
    @WebMethod(operationName = "AddCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAgreement")
    public Response<AddCustomerAgreementResponse> addCustomerAgreementAsync(
        @WebParam(name = "AddCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAgreementRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAgreement")
    public Future<?> addCustomerAgreementAsync(
        @WebParam(name = "AddCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAgreementRequest parameter,
        @WebParam(name = "AddCustomerAgreementResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerAgreementResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerAgreementResponse
     * @throws AddCustomerAgreementException
     */
    @WebMethod(operationName = "AddCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerAgreement")
    @WebResult(name = "AddCustomerAgreementResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerAgreementResponse addCustomerAgreement(
        @WebParam(name = "AddCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerAgreementRequest parameter)
        throws AddCustomerAgreementException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerCharacteristicResponse>
     */
    @WebMethod(operationName = "AddCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerCharacteristic")
    public Response<AddCustomerCharacteristicResponse> addCustomerCharacteristicAsync(
        @WebParam(name = "AddCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerCharacteristicRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerCharacteristic")
    public Future<?> addCustomerCharacteristicAsync(
        @WebParam(name = "AddCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerCharacteristicRequest parameter,
        @WebParam(name = "AddCustomerCharacteristicResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerCharacteristicResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerCharacteristicResponse
     * @throws AddCustomerCharacteristicException
     */
    @WebMethod(operationName = "AddCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerCharacteristic")
    @WebResult(name = "AddCustomerCharacteristicResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerCharacteristicResponse addCustomerCharacteristic(
        @WebParam(name = "AddCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerCharacteristicRequest parameter)
        throws AddCustomerCharacteristicException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerProductOfferResponse>
     */
    @WebMethod(operationName = "AddCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerProductOffer")
    public Response<AddCustomerProductOfferResponse> addCustomerProductOfferAsync(
        @WebParam(name = "AddCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerProductOfferRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerProductOffer")
    public Future<?> addCustomerProductOfferAsync(
        @WebParam(name = "AddCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerProductOfferRequest parameter,
        @WebParam(name = "AddCustomerProductOfferResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerProductOfferResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerProductOfferResponse
     * @throws AddCustomerProductOfferException
     */
    @WebMethod(operationName = "AddCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerProductOffer")
    @WebResult(name = "AddCustomerProductOfferResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerProductOfferResponse addCustomerProductOffer(
        @WebParam(name = "AddCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerProductOfferRequest parameter)
        throws AddCustomerProductOfferException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerNoteResponse>
     */
    @WebMethod(operationName = "AddCustomerNote", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerNote")
    public Response<AddCustomerNoteResponse> addCustomerNoteAsync(
        @WebParam(name = "AddCustomerNoteRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerNoteRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddCustomerNote", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerNote")
    public Future<?> addCustomerNoteAsync(
        @WebParam(name = "AddCustomerNoteRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerNoteRequest parameter,
        @WebParam(name = "AddCustomerNoteResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddCustomerNoteResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddCustomerNoteResponse
     * @throws AddCustomerNoteException
     */
    @WebMethod(operationName = "AddCustomerNote", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddCustomerNote")
    @WebResult(name = "AddCustomerNoteResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddCustomerNoteResponse addCustomerNote(
        @WebParam(name = "AddCustomerNoteRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddCustomerNoteRequest parameter)
        throws AddCustomerNoteException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductByProductIdResponse>
     */
    @WebMethod(operationName = "CancelCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProductByProductId")
    public Response<CancelCustomerProductByProductIdResponse> cancelCustomerProductByProductIdAsync(
        @WebParam(name = "CancelCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductByProductIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "CancelCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProductByProductId")
    public Future<?> cancelCustomerProductByProductIdAsync(
        @WebParam(name = "CancelCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductByProductIdRequest parameter,
        @WebParam(name = "CancelCustomerProductByProductIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<CancelCustomerProductByProductIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductByProductIdResponse
     * @throws CancelCustomerProductByProductIdException
     */
    @WebMethod(operationName = "CancelCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProductByProductId")
    @WebResult(name = "CancelCustomerProductByProductIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public CancelCustomerProductByProductIdResponse cancelCustomerProductByProductId(
        @WebParam(name = "CancelCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductByProductIdRequest parameter)
        throws CancelCustomerProductByProductIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductsResponse>
     */
    @WebMethod(operationName = "CancelCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProducts")
    public Response<CancelCustomerProductsResponse> cancelCustomerProductsAsync(
        @WebParam(name = "CancelCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "CancelCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProducts")
    public Future<?> cancelCustomerProductsAsync(
        @WebParam(name = "CancelCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductsRequest parameter,
        @WebParam(name = "CancelCustomerProductsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<CancelCustomerProductsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.CancelCustomerProductsResponse
     * @throws CancelCustomerProductsException
     */
    @WebMethod(operationName = "CancelCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/CancelCustomerProducts")
    @WebResult(name = "CancelCustomerProductsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public CancelCustomerProductsResponse cancelCustomerProducts(
        @WebParam(name = "CancelCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        CancelCustomerProductsRequest parameter)
        throws CancelCustomerProductsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerCharacteristicResponse>
     */
    @WebMethod(operationName = "DeleteCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerCharacteristic")
    public Response<DeleteCustomerCharacteristicResponse> deleteCustomerCharacteristicAsync(
        @WebParam(name = "DeleteCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerCharacteristicRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerCharacteristic")
    public Future<?> deleteCustomerCharacteristicAsync(
        @WebParam(name = "DeleteCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerCharacteristicRequest parameter,
        @WebParam(name = "DeleteCustomerCharacteristicResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteCustomerCharacteristicResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerCharacteristicResponse
     * @throws DeleteCustomerCharacteristicException
     */
    @WebMethod(operationName = "DeleteCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerCharacteristic")
    @WebResult(name = "DeleteCustomerCharacteristicResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteCustomerCharacteristicResponse deleteCustomerCharacteristic(
        @WebParam(name = "DeleteCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerCharacteristicRequest parameter)
        throws DeleteCustomerCharacteristicException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferResponse>
     */
    @WebMethod(operationName = "DeleteCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOffer")
    public Response<DeleteCustomerProductOfferResponse> deleteCustomerProductOfferAsync(
        @WebParam(name = "DeleteCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOffer")
    public Future<?> deleteCustomerProductOfferAsync(
        @WebParam(name = "DeleteCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferRequest parameter,
        @WebParam(name = "DeleteCustomerProductOfferResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteCustomerProductOfferResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferResponse
     * @throws DeleteCustomerProductOfferException
     */
    @WebMethod(operationName = "DeleteCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOffer")
    @WebResult(name = "DeleteCustomerProductOfferResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteCustomerProductOfferResponse deleteCustomerProductOffer(
        @WebParam(name = "DeleteCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferRequest parameter)
        throws DeleteCustomerProductOfferException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferByProductOfferIdResponse>
     */
    @WebMethod(operationName = "DeleteCustomerProductOfferByProductOfferId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOfferByProductOfferId")
    public Response<DeleteCustomerProductOfferByProductOfferIdResponse> deleteCustomerProductOfferByProductOfferIdAsync(
        @WebParam(name = "DeleteCustomerProductOfferByProductOfferIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferByProductOfferIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteCustomerProductOfferByProductOfferId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOfferByProductOfferId")
    public Future<?> deleteCustomerProductOfferByProductOfferIdAsync(
        @WebParam(name = "DeleteCustomerProductOfferByProductOfferIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferByProductOfferIdRequest parameter,
        @WebParam(name = "DeleteCustomerProductOfferByProductOfferIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteCustomerProductOfferByProductOfferIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerProductOfferByProductOfferIdResponse
     * @throws DeleteCustomerProductOfferByProductOfferIdException
     */
    @WebMethod(operationName = "DeleteCustomerProductOfferByProductOfferId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerProductOfferByProductOfferId")
    @WebResult(name = "DeleteCustomerProductOfferByProductOfferIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteCustomerProductOfferByProductOfferIdResponse deleteCustomerProductOfferByProductOfferId(
        @WebParam(name = "DeleteCustomerProductOfferByProductOfferIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerProductOfferByProductOfferIdRequest parameter)
        throws DeleteCustomerProductOfferByProductOfferIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleResponse>
     */
    @WebMethod(operationName = "DeleteCustomerSchedule", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerSchedule")
    public Response<DeleteCustomerScheduleResponse> deleteCustomerScheduleAsync(
        @WebParam(name = "DeleteCustomerScheduleRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteCustomerSchedule", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerSchedule")
    public Future<?> deleteCustomerScheduleAsync(
        @WebParam(name = "DeleteCustomerScheduleRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleRequest parameter,
        @WebParam(name = "DeleteCustomerScheduleResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteCustomerScheduleResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleResponse
     * @throws DeleteCustomerScheduleException
     */
    @WebMethod(operationName = "DeleteCustomerSchedule", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerSchedule")
    @WebResult(name = "DeleteCustomerScheduleResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteCustomerScheduleResponse deleteCustomerSchedule(
        @WebParam(name = "DeleteCustomerScheduleRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleRequest parameter)
        throws DeleteCustomerScheduleException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleByIdResponse>
     */
    @WebMethod(operationName = "DeleteCustomerScheduleById", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerScheduleById")
    public Response<DeleteCustomerScheduleByIdResponse> deleteCustomerScheduleByIdAsync(
        @WebParam(name = "DeleteCustomerScheduleByIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleByIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteCustomerScheduleById", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerScheduleById")
    public Future<?> deleteCustomerScheduleByIdAsync(
        @WebParam(name = "DeleteCustomerScheduleByIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleByIdRequest parameter,
        @WebParam(name = "DeleteCustomerScheduleByIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteCustomerScheduleByIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteCustomerScheduleByIdResponse
     * @throws DeleteCustomerScheduleByIdException
     */
    @WebMethod(operationName = "DeleteCustomerScheduleById", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteCustomerScheduleById")
    @WebResult(name = "DeleteCustomerScheduleByIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteCustomerScheduleByIdResponse deleteCustomerScheduleById(
        @WebParam(name = "DeleteCustomerScheduleByIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteCustomerScheduleByIdRequest parameter)
        throws DeleteCustomerScheduleByIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DisconnectCustomerProductsResponse>
     */
    @WebMethod(operationName = "DisconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DisconnectCustomerProducts")
    public Response<DisconnectCustomerProductsResponse> disconnectCustomerProductsAsync(
        @WebParam(name = "DisconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DisconnectCustomerProductsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DisconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DisconnectCustomerProducts")
    public Future<?> disconnectCustomerProductsAsync(
        @WebParam(name = "DisconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DisconnectCustomerProductsRequest parameter,
        @WebParam(name = "DisconnectCustomerProductsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DisconnectCustomerProductsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DisconnectCustomerProductsResponse
     * @throws DisconnectCustomerProductsException
     */
    @WebMethod(operationName = "DisconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DisconnectCustomerProducts")
    @WebResult(name = "DisconnectCustomerProductsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DisconnectCustomerProductsResponse disconnectCustomerProducts(
        @WebParam(name = "DisconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DisconnectCustomerProductsRequest parameter)
        throws DisconnectCustomerProductsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerResponse>
     */
    @WebMethod(operationName = "EditCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomer")
    public Response<EditCustomerResponse> editCustomerAsync(
        @WebParam(name = "EditCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomer")
    public Future<?> editCustomerAsync(
        @WebParam(name = "EditCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerRequest parameter,
        @WebParam(name = "EditCustomerResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerResponse
     * @throws EditCustomerException
     */
    @WebMethod(operationName = "EditCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomer")
    @WebResult(name = "EditCustomerResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerResponse editCustomer(
        @WebParam(name = "EditCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerRequest parameter)
        throws EditCustomerException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAccountResponse>
     */
    @WebMethod(operationName = "EditCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAccount")
    public Response<EditCustomerAccountResponse> editCustomerAccountAsync(
        @WebParam(name = "EditCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAccountRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAccount")
    public Future<?> editCustomerAccountAsync(
        @WebParam(name = "EditCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAccountRequest parameter,
        @WebParam(name = "EditCustomerAccountResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerAccountResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAccountResponse
     * @throws EditCustomerAccountException
     */
    @WebMethod(operationName = "EditCustomerAccount", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAccount")
    @WebResult(name = "EditCustomerAccountResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerAccountResponse editCustomerAccount(
        @WebParam(name = "EditCustomerAccountRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAccountRequest parameter)
        throws EditCustomerAccountException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAddressResponse>
     */
    @WebMethod(operationName = "EditCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAddress")
    public Response<EditCustomerAddressResponse> editCustomerAddressAsync(
        @WebParam(name = "EditCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAddressRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAddress")
    public Future<?> editCustomerAddressAsync(
        @WebParam(name = "EditCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAddressRequest parameter,
        @WebParam(name = "EditCustomerAddressResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerAddressResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAddressResponse
     * @throws EditCustomerAddressException
     */
    @WebMethod(operationName = "EditCustomerAddress", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAddress")
    @WebResult(name = "EditCustomerAddressResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerAddressResponse editCustomerAddress(
        @WebParam(name = "EditCustomerAddressRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAddressRequest parameter)
        throws EditCustomerAddressException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductResponse>
     */
    @WebMethod(operationName = "EditCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProduct")
    public Response<EditCustomerProductResponse> editCustomerProductAsync(
        @WebParam(name = "EditCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProduct")
    public Future<?> editCustomerProductAsync(
        @WebParam(name = "EditCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductRequest parameter,
        @WebParam(name = "EditCustomerProductResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerProductResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductResponse
     * @throws EditCustomerProductException
     */
    @WebMethod(operationName = "EditCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProduct")
    @WebResult(name = "EditCustomerProductResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerProductResponse editCustomerProduct(
        @WebParam(name = "EditCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductRequest parameter)
        throws EditCustomerProductException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductOfferResponse>
     */
    @WebMethod(operationName = "EditCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProductOffer")
    public Response<EditCustomerProductOfferResponse> editCustomerProductOfferAsync(
        @WebParam(name = "EditCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductOfferRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProductOffer")
    public Future<?> editCustomerProductOfferAsync(
        @WebParam(name = "EditCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductOfferRequest parameter,
        @WebParam(name = "EditCustomerProductOfferResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerProductOfferResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerProductOfferResponse
     * @throws EditCustomerProductOfferException
     */
    @WebMethod(operationName = "EditCustomerProductOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerProductOffer")
    @WebResult(name = "EditCustomerProductOfferResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerProductOfferResponse editCustomerProductOffer(
        @WebParam(name = "EditCustomerProductOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerProductOfferRequest parameter)
        throws EditCustomerProductOfferException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicByTypeAndNameResponse>
     */
    @WebMethod(operationName = "GetCharacteristicByTypeAndName", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristicByTypeAndName")
    public Response<GetCharacteristicByTypeAndNameResponse> getCharacteristicByTypeAndNameAsync(
        @WebParam(name = "GetCharacteristicByTypeAndNameRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicByTypeAndNameRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCharacteristicByTypeAndName", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristicByTypeAndName")
    public Future<?> getCharacteristicByTypeAndNameAsync(
        @WebParam(name = "GetCharacteristicByTypeAndNameRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicByTypeAndNameRequest parameter,
        @WebParam(name = "GetCharacteristicByTypeAndNameResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCharacteristicByTypeAndNameResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicByTypeAndNameResponse
     * @throws GetCharacteristicByTypeAndNameException
     */
    @WebMethod(operationName = "GetCharacteristicByTypeAndName", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristicByTypeAndName")
    @WebResult(name = "GetCharacteristicByTypeAndNameResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCharacteristicByTypeAndNameResponse getCharacteristicByTypeAndName(
        @WebParam(name = "GetCharacteristicByTypeAndNameRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicByTypeAndNameRequest parameter)
        throws GetCharacteristicByTypeAndNameException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicsResponse>
     */
    @WebMethod(operationName = "GetCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristics")
    public Response<GetCharacteristicsResponse> getCharacteristicsAsync(
        @WebParam(name = "GetCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristics")
    public Future<?> getCharacteristicsAsync(
        @WebParam(name = "GetCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicsRequest parameter,
        @WebParam(name = "GetCharacteristicsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCharacteristicsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCharacteristicsResponse
     * @throws GetCharacteristicsException
     */
    @WebMethod(operationName = "GetCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCharacteristics")
    @WebResult(name = "GetCharacteristicsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCharacteristicsResponse getCharacteristics(
        @WebParam(name = "GetCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCharacteristicsRequest parameter)
        throws GetCharacteristicsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommandStatusResponse>
     */
    @WebMethod(operationName = "GetCommandStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommandStatus")
    public Response<GetCommandStatusResponse> getCommandStatusAsync(
        @WebParam(name = "GetCommandStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommandStatusRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCommandStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommandStatus")
    public Future<?> getCommandStatusAsync(
        @WebParam(name = "GetCommandStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommandStatusRequest parameter,
        @WebParam(name = "GetCommandStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCommandStatusResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommandStatusResponse
     * @throws GetCommandStatusException
     */
    @WebMethod(operationName = "GetCommandStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommandStatus")
    @WebResult(name = "GetCommandStatusResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCommandStatusResponse getCommandStatus(
        @WebParam(name = "GetCommandStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommandStatusRequest parameter)
        throws GetCommandStatusException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResponse>
     */
    @WebMethod(operationName = "GetCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomer")
    public Response<GetCustomerResponse> getCustomerAsync(
        @WebParam(name = "GetCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomer")
    public Future<?> getCustomerAsync(
        @WebParam(name = "GetCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRequest parameter,
        @WebParam(name = "GetCustomerResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResponse
     * @throws GetCustomerException
     */
    @WebMethod(operationName = "GetCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomer")
    @WebResult(name = "GetCustomerResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerResponse getCustomer(
        @WebParam(name = "GetCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRequest parameter)
        throws GetCustomerException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAddressesResponse>
     */
    @WebMethod(operationName = "GetCustomerAddresses", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAddresses")
    public Response<GetCustomerAddressesResponse> getCustomerAddressesAsync(
        @WebParam(name = "GetCustomerAddressesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAddressesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerAddresses", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAddresses")
    public Future<?> getCustomerAddressesAsync(
        @WebParam(name = "GetCustomerAddressesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAddressesRequest parameter,
        @WebParam(name = "GetCustomerAddressesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerAddressesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAddressesResponse
     * @throws GetCustomerAddressesException
     */
    @WebMethod(operationName = "GetCustomerAddresses", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAddresses")
    @WebResult(name = "GetCustomerAddressesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerAddressesResponse getCustomerAddresses(
        @WebParam(name = "GetCustomerAddressesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAddressesRequest parameter)
        throws GetCustomerAddressesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByCreditCardResponse>
     */
    @WebMethod(operationName = "GetCustomersByCreditCard", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByCreditCard")
    public Response<GetCustomersByCreditCardResponse> getCustomersByCreditCardAsync(
        @WebParam(name = "GetCustomersByCreditCardRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByCreditCardRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersByCreditCard", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByCreditCard")
    public Future<?> getCustomersByCreditCardAsync(
        @WebParam(name = "GetCustomersByCreditCardRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByCreditCardRequest parameter,
        @WebParam(name = "GetCustomersByCreditCardResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersByCreditCardResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByCreditCardResponse
     * @throws GetCustomersByCreditCardException
     */
    @WebMethod(operationName = "GetCustomersByCreditCard", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByCreditCard")
    @WebResult(name = "GetCustomersByCreditCardResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersByCreditCardResponse getCustomersByCreditCard(
        @WebParam(name = "GetCustomersByCreditCardRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByCreditCardRequest parameter)
        throws GetCustomersByCreditCardException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByIdentificationResponse>
     */
    @WebMethod(operationName = "GetCustomersByIdentification", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByIdentification")
    public Response<GetCustomersByIdentificationResponse> getCustomersByIdentificationAsync(
        @WebParam(name = "GetCustomersByIdentificationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByIdentificationRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersByIdentification", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByIdentification")
    public Future<?> getCustomersByIdentificationAsync(
        @WebParam(name = "GetCustomersByIdentificationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByIdentificationRequest parameter,
        @WebParam(name = "GetCustomersByIdentificationResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersByIdentificationResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByIdentificationResponse
     * @throws GetCustomersByIdentificationException
     */
    @WebMethod(operationName = "GetCustomersByIdentification", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByIdentification")
    @WebResult(name = "GetCustomersByIdentificationResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersByIdentificationResponse getCustomersByIdentification(
        @WebParam(name = "GetCustomersByIdentificationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByIdentificationRequest parameter)
        throws GetCustomersByIdentificationException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByNamesResponse>
     */
    @WebMethod(operationName = "GetCustomersByNames", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByNames")
    public Response<GetCustomersByNamesResponse> getCustomersByNamesAsync(
        @WebParam(name = "GetCustomersByNamesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByNamesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersByNames", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByNames")
    public Future<?> getCustomersByNamesAsync(
        @WebParam(name = "GetCustomersByNamesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByNamesRequest parameter,
        @WebParam(name = "GetCustomersByNamesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersByNamesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByNamesResponse
     * @throws GetCustomersByNamesException
     */
    @WebMethod(operationName = "GetCustomersByNames", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByNames")
    @WebResult(name = "GetCustomersByNamesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersByNamesResponse getCustomersByNames(
        @WebParam(name = "GetCustomersByNamesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByNamesRequest parameter)
        throws GetCustomersByNamesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerCharacteristicsResponse>
     */
    @WebMethod(operationName = "GetCustomerCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerCharacteristics")
    public Response<GetCustomerCharacteristicsResponse> getCustomerCharacteristicsAsync(
        @WebParam(name = "GetCustomerCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerCharacteristicsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerCharacteristics")
    public Future<?> getCustomerCharacteristicsAsync(
        @WebParam(name = "GetCustomerCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerCharacteristicsRequest parameter,
        @WebParam(name = "GetCustomerCharacteristicsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerCharacteristicsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerCharacteristicsResponse
     * @throws GetCustomerCharacteristicsException
     */
    @WebMethod(operationName = "GetCustomerCharacteristics", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerCharacteristics")
    @WebResult(name = "GetCustomerCharacteristicsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerCharacteristicsResponse getCustomerCharacteristics(
        @WebParam(name = "GetCustomerCharacteristicsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerCharacteristicsRequest parameter)
        throws GetCustomerCharacteristicsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysResponse>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDays", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDays")
    public Response<GetCustomerHistoriesByDaysResponse> getCustomerHistoriesByDaysAsync(
        @WebParam(name = "GetCustomerHistoriesByDaysRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDays", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDays")
    public Future<?> getCustomerHistoriesByDaysAsync(
        @WebParam(name = "GetCustomerHistoriesByDaysRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysRequest parameter,
        @WebParam(name = "GetCustomerHistoriesByDaysResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerHistoriesByDaysResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysResponse
     * @throws GetCustomerHistoriesByDaysException
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDays", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDays")
    @WebResult(name = "GetCustomerHistoriesByDaysResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerHistoriesByDaysResponse getCustomerHistoriesByDays(
        @WebParam(name = "GetCustomerHistoriesByDaysRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysRequest parameter)
        throws GetCustomerHistoriesByDaysException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysAndEventTypeResponse>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDaysAndEventType", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDaysAndEventType")
    public Response<GetCustomerHistoriesByDaysAndEventTypeResponse> getCustomerHistoriesByDaysAndEventTypeAsync(
        @WebParam(name = "GetCustomerHistoriesByDaysAndEventTypeRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysAndEventTypeRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDaysAndEventType", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDaysAndEventType")
    public Future<?> getCustomerHistoriesByDaysAndEventTypeAsync(
        @WebParam(name = "GetCustomerHistoriesByDaysAndEventTypeRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysAndEventTypeRequest parameter,
        @WebParam(name = "GetCustomerHistoriesByDaysAndEventTypeResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerHistoriesByDaysAndEventTypeResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByDaysAndEventTypeResponse
     * @throws GetCustomerHistoriesByDaysAndEventTypeException
     */
    @WebMethod(operationName = "GetCustomerHistoriesByDaysAndEventType", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByDaysAndEventType")
    @WebResult(name = "GetCustomerHistoriesByDaysAndEventTypeResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerHistoriesByDaysAndEventTypeResponse getCustomerHistoriesByDaysAndEventType(
        @WebParam(name = "GetCustomerHistoriesByDaysAndEventTypeRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByDaysAndEventTypeRequest parameter)
        throws GetCustomerHistoriesByDaysAndEventTypeException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerNotesResponse>
     */
    @WebMethod(operationName = "GetCustomerNotes", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerNotes")
    public Response<GetCustomerNotesResponse> getCustomerNotesAsync(
        @WebParam(name = "GetCustomerNotesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerNotesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerNotes", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerNotes")
    public Future<?> getCustomerNotesAsync(
        @WebParam(name = "GetCustomerNotesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerNotesRequest parameter,
        @WebParam(name = "GetCustomerNotesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerNotesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerNotesResponse
     * @throws GetCustomerNotesException
     */
    @WebMethod(operationName = "GetCustomerNotes", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerNotes")
    @WebResult(name = "GetCustomerNotesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerNotesResponse getCustomerNotes(
        @WebParam(name = "GetCustomerNotesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerNotesRequest parameter)
        throws GetCustomerNotesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsResponse>
     */
    @WebMethod(operationName = "GetCustomerOrderedEvents", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEvents")
    public Response<GetCustomerOrderedEventsResponse> getCustomerOrderedEventsAsync(
        @WebParam(name = "GetCustomerOrderedEventsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerOrderedEvents", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEvents")
    public Future<?> getCustomerOrderedEventsAsync(
        @WebParam(name = "GetCustomerOrderedEventsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsRequest parameter,
        @WebParam(name = "GetCustomerOrderedEventsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerOrderedEventsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsResponse
     * @throws GetCustomerOrderedEventsException
     */
    @WebMethod(operationName = "GetCustomerOrderedEvents", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEvents")
    @WebResult(name = "GetCustomerOrderedEventsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerOrderedEventsResponse getCustomerOrderedEvents(
        @WebParam(name = "GetCustomerOrderedEventsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsRequest parameter)
        throws GetCustomerOrderedEventsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductByStatusResponse>
     */
    @WebMethod(operationName = "GetCustomerProductByStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductByStatus")
    public Response<GetCustomerProductByStatusResponse> getCustomerProductByStatusAsync(
        @WebParam(name = "GetCustomerProductByStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductByStatusRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerProductByStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductByStatus")
    public Future<?> getCustomerProductByStatusAsync(
        @WebParam(name = "GetCustomerProductByStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductByStatusRequest parameter,
        @WebParam(name = "GetCustomerProductByStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerProductByStatusResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductByStatusResponse
     * @throws GetCustomerProductByStatusException
     */
    @WebMethod(operationName = "GetCustomerProductByStatus", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductByStatus")
    @WebResult(name = "GetCustomerProductByStatusResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerProductByStatusResponse getCustomerProductByStatus(
        @WebParam(name = "GetCustomerProductByStatusRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductByStatusRequest parameter)
        throws GetCustomerProductByStatusException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByCriteriaResponse>
     */
    @WebMethod(operationName = "GetCustomerProductsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByCriteria")
    public Response<GetCustomerProductsByCriteriaResponse> getCustomerProductsByCriteriaAsync(
        @WebParam(name = "GetCustomerProductsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByCriteriaRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerProductsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByCriteria")
    public Future<?> getCustomerProductsByCriteriaAsync(
        @WebParam(name = "GetCustomerProductsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByCriteriaRequest parameter,
        @WebParam(name = "GetCustomerProductsByCriteriaResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerProductsByCriteriaResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByCriteriaResponse
     * @throws GetCustomerProductsByCriteriaException
     */
    @WebMethod(operationName = "GetCustomerProductsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByCriteria")
    @WebResult(name = "GetCustomerProductsByCriteriaResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerProductsByCriteriaResponse getCustomerProductsByCriteria(
        @WebParam(name = "GetCustomerProductsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByCriteriaRequest parameter)
        throws GetCustomerProductsByCriteriaException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByProductIdResponse>
     */
    @WebMethod(operationName = "GetCustomerProductsByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByProductId")
    public Response<GetCustomerProductsByProductIdResponse> getCustomerProductsByProductIdAsync(
        @WebParam(name = "GetCustomerProductsByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByProductIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerProductsByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByProductId")
    public Future<?> getCustomerProductsByProductIdAsync(
        @WebParam(name = "GetCustomerProductsByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByProductIdRequest parameter,
        @WebParam(name = "GetCustomerProductsByProductIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerProductsByProductIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsByProductIdResponse
     * @throws GetCustomerProductsByProductIdException
     */
    @WebMethod(operationName = "GetCustomerProductsByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsByProductId")
    @WebResult(name = "GetCustomerProductsByProductIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerProductsByProductIdResponse getCustomerProductsByProductId(
        @WebParam(name = "GetCustomerProductsByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsByProductIdRequest parameter)
        throws GetCustomerProductsByProductIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsOfferResponse>
     */
    @WebMethod(operationName = "GetCustomerProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsOffer")
    public Response<GetCustomerProductsOfferResponse> getCustomerProductsOfferAsync(
        @WebParam(name = "GetCustomerProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsOfferRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsOffer")
    public Future<?> getCustomerProductsOfferAsync(
        @WebParam(name = "GetCustomerProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsOfferRequest parameter,
        @WebParam(name = "GetCustomerProductsOfferResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerProductsOfferResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerProductsOfferResponse
     * @throws GetCustomerProductsOfferException
     */
    @WebMethod(operationName = "GetCustomerProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerProductsOffer")
    @WebResult(name = "GetCustomerProductsOfferResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerProductsOfferResponse getCustomerProductsOffer(
        @WebParam(name = "GetCustomerProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerProductsOfferRequest parameter)
        throws GetCustomerProductsOfferException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerSchedulesResponse>
     */
    @WebMethod(operationName = "GetCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerSchedules")
    public Response<GetCustomerSchedulesResponse> getCustomerSchedulesAsync(
        @WebParam(name = "GetCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerSchedulesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerSchedules")
    public Future<?> getCustomerSchedulesAsync(
        @WebParam(name = "GetCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerSchedulesRequest parameter,
        @WebParam(name = "GetCustomerSchedulesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerSchedulesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerSchedulesResponse
     * @throws GetCustomerSchedulesException
     */
    @WebMethod(operationName = "GetCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerSchedules")
    @WebResult(name = "GetCustomerSchedulesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerSchedulesResponse getCustomerSchedules(
        @WebParam(name = "GetCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerSchedulesRequest parameter)
        throws GetCustomerSchedulesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesResponse>
     */
    @WebMethod(operationName = "GetCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResources")
    public Response<GetCustomerResourcesResponse> getCustomerResourcesAsync(
        @WebParam(name = "GetCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResources")
    public Future<?> getCustomerResourcesAsync(
        @WebParam(name = "GetCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesRequest parameter,
        @WebParam(name = "GetCustomerResourcesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerResourcesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesResponse
     * @throws GetCustomerResourcesException
     */
    @WebMethod(operationName = "GetCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResources")
    @WebResult(name = "GetCustomerResourcesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerResourcesResponse getCustomerResources(
        @WebParam(name = "GetCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesRequest parameter)
        throws GetCustomerResourcesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetProductsOfferResponse>
     */
    @WebMethod(operationName = "GetProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetProductsOffer")
    public Response<GetProductsOfferResponse> getProductsOfferAsync(
        @WebParam(name = "GetProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetProductsOfferRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetProductsOffer")
    public Future<?> getProductsOfferAsync(
        @WebParam(name = "GetProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetProductsOfferRequest parameter,
        @WebParam(name = "GetProductsOfferResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetProductsOfferResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetProductsOfferResponse
     * @throws GetProductsOfferException
     */
    @WebMethod(operationName = "GetProductsOffer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetProductsOffer")
    @WebResult(name = "GetProductsOfferResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetProductsOfferResponse getProductsOffer(
        @WebParam(name = "GetProductsOfferRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetProductsOfferRequest parameter)
        throws GetProductsOfferException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.MoveResourceToCustomerResponse>
     */
    @WebMethod(operationName = "MoveResourceToCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/MoveResourceToCustomer")
    public Response<MoveResourceToCustomerResponse> moveResourceToCustomerAsync(
        @WebParam(name = "MoveResourceToCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        MoveResourceToCustomerRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "MoveResourceToCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/MoveResourceToCustomer")
    public Future<?> moveResourceToCustomerAsync(
        @WebParam(name = "MoveResourceToCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        MoveResourceToCustomerRequest parameter,
        @WebParam(name = "MoveResourceToCustomerResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<MoveResourceToCustomerResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.MoveResourceToCustomerResponse
     * @throws MoveResourceToCustomerException
     */
    @WebMethod(operationName = "MoveResourceToCustomer", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/MoveResourceToCustomer")
    @WebResult(name = "MoveResourceToCustomerResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public MoveResourceToCustomerResponse moveResourceToCustomer(
        @WebParam(name = "MoveResourceToCustomerRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        MoveResourceToCustomerRequest parameter)
        throws MoveResourceToCustomerException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReauthorizeCustomerResourcesResponse>
     */
    @WebMethod(operationName = "ReauthorizeCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReauthorizeCustomerResources")
    public Response<ReauthorizeCustomerResourcesResponse> reauthorizeCustomerResourcesAsync(
        @WebParam(name = "ReauthorizeCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReauthorizeCustomerResourcesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ReauthorizeCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReauthorizeCustomerResources")
    public Future<?> reauthorizeCustomerResourcesAsync(
        @WebParam(name = "ReauthorizeCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReauthorizeCustomerResourcesRequest parameter,
        @WebParam(name = "ReauthorizeCustomerResourcesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ReauthorizeCustomerResourcesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReauthorizeCustomerResourcesResponse
     * @throws ReauthorizeCustomerResourcesException
     */
    @WebMethod(operationName = "ReauthorizeCustomerResources", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReauthorizeCustomerResources")
    @WebResult(name = "ReauthorizeCustomerResourcesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ReauthorizeCustomerResourcesResponse reauthorizeCustomerResources(
        @WebParam(name = "ReauthorizeCustomerResourcesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReauthorizeCustomerResourcesRequest parameter)
        throws ReauthorizeCustomerResourcesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductsResponse>
     */
    @WebMethod(operationName = "ReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProducts")
    public Response<ReconnectCustomerProductsResponse> reconnectCustomerProductsAsync(
        @WebParam(name = "ReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProducts")
    public Future<?> reconnectCustomerProductsAsync(
        @WebParam(name = "ReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductsRequest parameter,
        @WebParam(name = "ReconnectCustomerProductsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ReconnectCustomerProductsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductsResponse
     * @throws ReconnectCustomerProductsException
     */
    @WebMethod(operationName = "ReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProducts")
    @WebResult(name = "ReconnectCustomerProductsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ReconnectCustomerProductsResponse reconnectCustomerProducts(
        @WebParam(name = "ReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductsRequest parameter)
        throws ReconnectCustomerProductsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceChangeMigrationResponse>
     */
    @WebMethod(operationName = "ResourceChangeMigration", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceChangeMigration")
    public Response<ResourceChangeMigrationResponse> resourceChangeMigrationAsync(
        @WebParam(name = "ResourceChangeMigrationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceChangeMigrationRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ResourceChangeMigration", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceChangeMigration")
    public Future<?> resourceChangeMigrationAsync(
        @WebParam(name = "ResourceChangeMigrationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceChangeMigrationRequest parameter,
        @WebParam(name = "ResourceChangeMigrationResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ResourceChangeMigrationResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceChangeMigrationResponse
     * @throws ResourceChangeMigrationException
     */
    @WebMethod(operationName = "ResourceChangeMigration", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceChangeMigration")
    @WebResult(name = "ResourceChangeMigrationResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ResourceChangeMigrationResponse resourceChangeMigration(
        @WebParam(name = "ResourceChangeMigrationRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceChangeMigrationRequest parameter)
        throws ResourceChangeMigrationException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceEndMovingResponse>
     */
    @WebMethod(operationName = "ResourceEndMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceEndMoving")
    public Response<ResourceEndMovingResponse> resourceEndMovingAsync(
        @WebParam(name = "ResourceEndMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceEndMovingRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ResourceEndMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceEndMoving")
    public Future<?> resourceEndMovingAsync(
        @WebParam(name = "ResourceEndMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceEndMovingRequest parameter,
        @WebParam(name = "ResourceEndMovingResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ResourceEndMovingResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceEndMovingResponse
     * @throws ResourceEndMovingException
     */
    @WebMethod(operationName = "ResourceEndMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceEndMoving")
    @WebResult(name = "ResourceEndMovingResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ResourceEndMovingResponse resourceEndMoving(
        @WebParam(name = "ResourceEndMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceEndMovingRequest parameter)
        throws ResourceEndMovingException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceStartMovingResponse>
     */
    @WebMethod(operationName = "ResourceStartMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceStartMoving")
    public Response<ResourceStartMovingResponse> resourceStartMovingAsync(
        @WebParam(name = "ResourceStartMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceStartMovingRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ResourceStartMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceStartMoving")
    public Future<?> resourceStartMovingAsync(
        @WebParam(name = "ResourceStartMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceStartMovingRequest parameter,
        @WebParam(name = "ResourceStartMovingResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ResourceStartMovingResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ResourceStartMovingResponse
     * @throws ResourceStartMovingException
     */
    @WebMethod(operationName = "ResourceStartMoving", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ResourceStartMoving")
    @WebResult(name = "ResourceStartMovingResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ResourceStartMovingResponse resourceStartMoving(
        @WebParam(name = "ResourceStartMovingRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ResourceStartMovingRequest parameter)
        throws ResourceStartMovingException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleCancelCustomerProductBySerialNumberResponse>
     */
    @WebMethod(operationName = "ScheduleCancelCustomerProductBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleCancelCustomerProductBySerialNumber")
    public Response<ScheduleCancelCustomerProductBySerialNumberResponse> scheduleCancelCustomerProductBySerialNumberAsync(
        @WebParam(name = "ScheduleCancelCustomerProductBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleCancelCustomerProductBySerialNumberRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ScheduleCancelCustomerProductBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleCancelCustomerProductBySerialNumber")
    public Future<?> scheduleCancelCustomerProductBySerialNumberAsync(
        @WebParam(name = "ScheduleCancelCustomerProductBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleCancelCustomerProductBySerialNumberRequest parameter,
        @WebParam(name = "ScheduleCancelCustomerProductBySerialNumberResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ScheduleCancelCustomerProductBySerialNumberResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleCancelCustomerProductBySerialNumberResponse
     * @throws ScheduleCancelCustomerProductBySerialNumberException
     */
    @WebMethod(operationName = "ScheduleCancelCustomerProductBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleCancelCustomerProductBySerialNumber")
    @WebResult(name = "ScheduleCancelCustomerProductBySerialNumberResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ScheduleCancelCustomerProductBySerialNumberResponse scheduleCancelCustomerProductBySerialNumber(
        @WebParam(name = "ScheduleCancelCustomerProductBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleCancelCustomerProductBySerialNumberRequest parameter)
        throws ScheduleCancelCustomerProductBySerialNumberException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleReconnectCustomerProductsResponse>
     */
    @WebMethod(operationName = "ScheduleReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleReconnectCustomerProducts")
    public Response<ScheduleReconnectCustomerProductsResponse> scheduleReconnectCustomerProductsAsync(
        @WebParam(name = "ScheduleReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleReconnectCustomerProductsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ScheduleReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleReconnectCustomerProducts")
    public Future<?> scheduleReconnectCustomerProductsAsync(
        @WebParam(name = "ScheduleReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleReconnectCustomerProductsRequest parameter,
        @WebParam(name = "ScheduleReconnectCustomerProductsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ScheduleReconnectCustomerProductsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ScheduleReconnectCustomerProductsResponse
     * @throws ScheduleReconnectCustomerProductsException
     */
    @WebMethod(operationName = "ScheduleReconnectCustomerProducts", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ScheduleReconnectCustomerProducts")
    @WebResult(name = "ScheduleReconnectCustomerProductsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ScheduleReconnectCustomerProductsResponse scheduleReconnectCustomerProducts(
        @WebParam(name = "ScheduleReconnectCustomerProductsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ScheduleReconnectCustomerProductsRequest parameter)
        throws ScheduleReconnectCustomerProductsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.SendCommandResponse>
     */
    @WebMethod(operationName = "SendCommand", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/SendCommand")
    public Response<SendCommandResponse> sendCommandAsync(
        @WebParam(name = "SendCommandRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        SendCommandRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "SendCommand", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/SendCommand")
    public Future<?> sendCommandAsync(
        @WebParam(name = "SendCommandRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        SendCommandRequest parameter,
        @WebParam(name = "SendCommandResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SendCommandResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.SendCommandResponse
     * @throws SendCommandException
     */
    @WebMethod(operationName = "SendCommand", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/SendCommand")
    @WebResult(name = "SendCommandResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public SendCommandResponse sendCommand(
        @WebParam(name = "SendCommandRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        SendCommandRequest parameter)
        throws SendCommandException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerProductResponse>
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerProduct")
    public Response<UpgradeDowngradeCustomerProductResponse> upgradeDowngradeCustomerProductAsync(
        @WebParam(name = "UpgradeDowngradeCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerProductRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerProduct")
    public Future<?> upgradeDowngradeCustomerProductAsync(
        @WebParam(name = "UpgradeDowngradeCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerProductRequest parameter,
        @WebParam(name = "UpgradeDowngradeCustomerProductResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UpgradeDowngradeCustomerProductResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerProductResponse
     * @throws UpgradeDowngradeCustomerProductException
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerProduct", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerProduct")
    @WebResult(name = "UpgradeDowngradeCustomerProductResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public UpgradeDowngradeCustomerProductResponse upgradeDowngradeCustomerProduct(
        @WebParam(name = "UpgradeDowngradeCustomerProductRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerProductRequest parameter)
        throws UpgradeDowngradeCustomerProductException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerResourceResponse>
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerResource")
    public Response<UpgradeDowngradeCustomerResourceResponse> upgradeDowngradeCustomerResourceAsync(
        @WebParam(name = "UpgradeDowngradeCustomerResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerResourceRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerResource")
    public Future<?> upgradeDowngradeCustomerResourceAsync(
        @WebParam(name = "UpgradeDowngradeCustomerResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerResourceRequest parameter,
        @WebParam(name = "UpgradeDowngradeCustomerResourceResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UpgradeDowngradeCustomerResourceResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.UpgradeDowngradeCustomerResourceResponse
     * @throws UpgradeDowngradeCustomerResourceException
     */
    @WebMethod(operationName = "UpgradeDowngradeCustomerResource", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/UpgradeDowngradeCustomerResource")
    @WebResult(name = "UpgradeDowngradeCustomerResourceResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public UpgradeDowngradeCustomerResourceResponse upgradeDowngradeCustomerResource(
        @WebParam(name = "UpgradeDowngradeCustomerResourceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        UpgradeDowngradeCustomerResourceRequest parameter)
        throws UpgradeDowngradeCustomerResourceException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAvailableUpgradesResponse>
     */
    @WebMethod(operationName = "GetCustomerAvailableUpgrades", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAvailableUpgrades")
    public Response<GetCustomerAvailableUpgradesResponse> getCustomerAvailableUpgradesAsync(
        @WebParam(name = "GetCustomerAvailableUpgradesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAvailableUpgradesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerAvailableUpgrades", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAvailableUpgrades")
    public Future<?> getCustomerAvailableUpgradesAsync(
        @WebParam(name = "GetCustomerAvailableUpgradesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAvailableUpgradesRequest parameter,
        @WebParam(name = "GetCustomerAvailableUpgradesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerAvailableUpgradesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerAvailableUpgradesResponse
     * @throws GetCustomerAvailableUpgradesException
     */
    @WebMethod(operationName = "GetCustomerAvailableUpgrades", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerAvailableUpgrades")
    @WebResult(name = "GetCustomerAvailableUpgradesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerAvailableUpgradesResponse getCustomerAvailableUpgrades(
        @WebParam(name = "GetCustomerAvailableUpgradesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerAvailableUpgradesRequest parameter)
        throws GetCustomerAvailableUpgradesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByCriteriaResponse>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByCriteria")
    public Response<GetCustomerHistoriesByCriteriaResponse> getCustomerHistoriesByCriteriaAsync(
        @WebParam(name = "GetCustomerHistoriesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByCriteriaRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerHistoriesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByCriteria")
    public Future<?> getCustomerHistoriesByCriteriaAsync(
        @WebParam(name = "GetCustomerHistoriesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByCriteriaRequest parameter,
        @WebParam(name = "GetCustomerHistoriesByCriteriaResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerHistoriesByCriteriaResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerHistoriesByCriteriaResponse
     * @throws GetCustomerHistoriesByCriteriaException
     */
    @WebMethod(operationName = "GetCustomerHistoriesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerHistoriesByCriteria")
    @WebResult(name = "GetCustomerHistoriesByCriteriaResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerHistoriesByCriteriaResponse getCustomerHistoriesByCriteria(
        @WebParam(name = "GetCustomerHistoriesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerHistoriesByCriteriaRequest parameter)
        throws GetCustomerHistoriesByCriteriaException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesByCriteriaResponse>
     */
    @WebMethod(operationName = "GetCustomerResourcesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResourcesByCriteria")
    public Response<GetCustomerResourcesByCriteriaResponse> getCustomerResourcesByCriteriaAsync(
        @WebParam(name = "GetCustomerResourcesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesByCriteriaRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerResourcesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResourcesByCriteria")
    public Future<?> getCustomerResourcesByCriteriaAsync(
        @WebParam(name = "GetCustomerResourcesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesByCriteriaRequest parameter,
        @WebParam(name = "GetCustomerResourcesByCriteriaResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerResourcesByCriteriaResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerResourcesByCriteriaResponse
     * @throws GetCustomerResourcesByCriteriaException
     */
    @WebMethod(operationName = "GetCustomerResourcesByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerResourcesByCriteria")
    @WebResult(name = "GetCustomerResourcesByCriteriaResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerResourcesByCriteriaResponse getCustomerResourcesByCriteria(
        @WebParam(name = "GetCustomerResourcesByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerResourcesByCriteriaRequest parameter)
        throws GetCustomerResourcesByCriteriaException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommercialProductsByVersionResponse>
     */
    @WebMethod(operationName = "GetCommercialProductsByVersion", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommercialProductsByVersion")
    public Response<GetCommercialProductsByVersionResponse> getCommercialProductsByVersionAsync(
        @WebParam(name = "GetCommercialProductsByVersionRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommercialProductsByVersionRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCommercialProductsByVersion", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommercialProductsByVersion")
    public Future<?> getCommercialProductsByVersionAsync(
        @WebParam(name = "GetCommercialProductsByVersionRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommercialProductsByVersionRequest parameter,
        @WebParam(name = "GetCommercialProductsByVersionResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCommercialProductsByVersionResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCommercialProductsByVersionResponse
     * @throws GetCommercialProductsByVersionException
     */
    @WebMethod(operationName = "GetCommercialProductsByVersion", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCommercialProductsByVersion")
    @WebResult(name = "GetCommercialProductsByVersionResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCommercialProductsByVersionResponse getCommercialProductsByVersion(
        @WebParam(name = "GetCommercialProductsByVersionRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCommercialProductsByVersionRequest parameter)
        throws GetCommercialProductsByVersionException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddOrUpgradeCustomerProductInvolvementResponse>
     */
    @WebMethod(operationName = "AddOrUpgradeCustomerProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddOrUpgradeCustomerProductInvolvement")
    public Response<AddOrUpgradeCustomerProductInvolvementResponse> addOrUpgradeCustomerProductInvolvementAsync(
        @WebParam(name = "AddOrUpgradeCustomerProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddOrUpgradeCustomerProductInvolvementRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "AddOrUpgradeCustomerProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddOrUpgradeCustomerProductInvolvement")
    public Future<?> addOrUpgradeCustomerProductInvolvementAsync(
        @WebParam(name = "AddOrUpgradeCustomerProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddOrUpgradeCustomerProductInvolvementRequest parameter,
        @WebParam(name = "AddOrUpgradeCustomerProductInvolvementResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AddOrUpgradeCustomerProductInvolvementResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.AddOrUpgradeCustomerProductInvolvementResponse
     * @throws AddOrUpgradeCustomerProductInvolvementException
     */
    @WebMethod(operationName = "AddOrUpgradeCustomerProductInvolvement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/AddOrUpgradeCustomerProductInvolvement")
    @WebResult(name = "AddOrUpgradeCustomerProductInvolvementResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public AddOrUpgradeCustomerProductInvolvementResponse addOrUpgradeCustomerProductInvolvement(
        @WebParam(name = "AddOrUpgradeCustomerProductInvolvementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        AddOrUpgradeCustomerProductInvolvementRequest parameter)
        throws AddOrUpgradeCustomerProductInvolvementException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditInvoiceResponse>
     */
    @WebMethod(operationName = "EditInvoice", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditInvoice")
    public Response<EditInvoiceResponse> editInvoiceAsync(
        @WebParam(name = "EditInvoiceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditInvoiceRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditInvoice", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditInvoice")
    public Future<?> editInvoiceAsync(
        @WebParam(name = "EditInvoiceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditInvoiceRequest parameter,
        @WebParam(name = "EditInvoiceResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditInvoiceResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditInvoiceResponse
     * @throws EditInvoiceException
     */
    @WebMethod(operationName = "EditInvoice", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditInvoice")
    @WebResult(name = "EditInvoiceResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditInvoiceResponse editInvoice(
        @WebParam(name = "EditInvoiceRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditInvoiceRequest parameter)
        throws EditInvoiceException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersBySerialNumberResponse>
     */
    @WebMethod(operationName = "GetCustomersBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersBySerialNumber")
    public Response<GetCustomersBySerialNumberResponse> getCustomersBySerialNumberAsync(
        @WebParam(name = "GetCustomersBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersBySerialNumberRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersBySerialNumber")
    public Future<?> getCustomersBySerialNumberAsync(
        @WebParam(name = "GetCustomersBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersBySerialNumberRequest parameter,
        @WebParam(name = "GetCustomersBySerialNumberResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersBySerialNumberResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersBySerialNumberResponse
     * @throws GetCustomersBySerialNumberException
     */
    @WebMethod(operationName = "GetCustomersBySerialNumber", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersBySerialNumber")
    @WebResult(name = "GetCustomersBySerialNumberResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersBySerialNumberResponse getCustomersBySerialNumber(
        @WebParam(name = "GetCustomersBySerialNumberRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersBySerialNumberRequest parameter)
        throws GetCustomersBySerialNumberException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductByProductIdResponse>
     */
    @WebMethod(operationName = "ReconnectCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProductByProductId")
    public Response<ReconnectCustomerProductByProductIdResponse> reconnectCustomerProductByProductIdAsync(
        @WebParam(name = "ReconnectCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductByProductIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "ReconnectCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProductByProductId")
    public Future<?> reconnectCustomerProductByProductIdAsync(
        @WebParam(name = "ReconnectCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductByProductIdRequest parameter,
        @WebParam(name = "ReconnectCustomerProductByProductIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ReconnectCustomerProductByProductIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.ReconnectCustomerProductByProductIdResponse
     * @throws ReconnectCustomerProductByProductIdException
     */
    @WebMethod(operationName = "ReconnectCustomerProductByProductId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/ReconnectCustomerProductByProductId")
    @WebResult(name = "ReconnectCustomerProductByProductIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public ReconnectCustomerProductByProductIdResponse reconnectCustomerProductByProductId(
        @WebParam(name = "ReconnectCustomerProductByProductIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        ReconnectCustomerProductByProductIdRequest parameter)
        throws ReconnectCustomerProductByProductIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsByCriteriaResponse>
     */
    @WebMethod(operationName = "GetCustomerOrderedEventsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEventsByCriteria")
    public Response<GetCustomerOrderedEventsByCriteriaResponse> getCustomerOrderedEventsByCriteriaAsync(
        @WebParam(name = "GetCustomerOrderedEventsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsByCriteriaRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerOrderedEventsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEventsByCriteria")
    public Future<?> getCustomerOrderedEventsByCriteriaAsync(
        @WebParam(name = "GetCustomerOrderedEventsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsByCriteriaRequest parameter,
        @WebParam(name = "GetCustomerOrderedEventsByCriteriaResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerOrderedEventsByCriteriaResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerOrderedEventsByCriteriaResponse
     * @throws GetCustomerOrderedEventsByCriteriaException
     */
    @WebMethod(operationName = "GetCustomerOrderedEventsByCriteria", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerOrderedEventsByCriteria")
    @WebResult(name = "GetCustomerOrderedEventsByCriteriaResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerOrderedEventsByCriteriaResponse getCustomerOrderedEventsByCriteria(
        @WebParam(name = "GetCustomerOrderedEventsByCriteriaRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerOrderedEventsByCriteriaRequest parameter)
        throws GetCustomerOrderedEventsByCriteriaException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByInternetUserIdResponse>
     */
    @WebMethod(operationName = "GetCustomersByInternetUserId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByInternetUserId")
    public Response<GetCustomersByInternetUserIdResponse> getCustomersByInternetUserIdAsync(
        @WebParam(name = "GetCustomersByInternetUserIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByInternetUserIdRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomersByInternetUserId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByInternetUserId")
    public Future<?> getCustomersByInternetUserIdAsync(
        @WebParam(name = "GetCustomersByInternetUserIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByInternetUserIdRequest parameter,
        @WebParam(name = "GetCustomersByInternetUserIdResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomersByInternetUserIdResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomersByInternetUserIdResponse
     * @throws GetCustomersByInternetUserIdException
     */
    @WebMethod(operationName = "GetCustomersByInternetUserId", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomersByInternetUserId")
    @WebResult(name = "GetCustomersByInternetUserIdResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomersByInternetUserIdResponse getCustomersByInternetUserId(
        @WebParam(name = "GetCustomersByInternetUserIdRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomersByInternetUserIdRequest parameter)
        throws GetCustomersByInternetUserIdException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRelationsResponse>
     */
    @WebMethod(operationName = "GetCustomerRelations", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerRelations")
    public Response<GetCustomerRelationsResponse> getCustomerRelationsAsync(
        @WebParam(name = "GetCustomerRelationsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRelationsRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetCustomerRelations", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerRelations")
    public Future<?> getCustomerRelationsAsync(
        @WebParam(name = "GetCustomerRelationsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRelationsRequest parameter,
        @WebParam(name = "GetCustomerRelationsResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetCustomerRelationsResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.GetCustomerRelationsResponse
     * @throws GetCustomerRelationsException
     */
    @WebMethod(operationName = "GetCustomerRelations", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/GetCustomerRelations")
    @WebResult(name = "GetCustomerRelationsResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public GetCustomerRelationsResponse getCustomerRelations(
        @WebParam(name = "GetCustomerRelationsRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        GetCustomerRelationsRequest parameter)
        throws GetCustomerRelationsException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerCharacteristicResponse>
     */
    @WebMethod(operationName = "EditCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerCharacteristic")
    public Response<EditCustomerCharacteristicResponse> editCustomerCharacteristicAsync(
        @WebParam(name = "EditCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerCharacteristicRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerCharacteristic")
    public Future<?> editCustomerCharacteristicAsync(
        @WebParam(name = "EditCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerCharacteristicRequest parameter,
        @WebParam(name = "EditCustomerCharacteristicResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerCharacteristicResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerCharacteristicResponse
     * @throws EditCustomerCharacteristicException
     */
    @WebMethod(operationName = "EditCustomerCharacteristic", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerCharacteristic")
    @WebResult(name = "EditCustomerCharacteristicResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerCharacteristicResponse editCustomerCharacteristic(
        @WebParam(name = "EditCustomerCharacteristicRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerCharacteristicRequest parameter)
        throws EditCustomerCharacteristicException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteAllActiveCustomerSchedulesResponse>
     */
    @WebMethod(operationName = "DeleteAllActiveCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteAllActiveCustomerSchedules")
    public Response<DeleteAllActiveCustomerSchedulesResponse> deleteAllActiveCustomerSchedulesAsync(
        @WebParam(name = "DeleteAllActiveCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteAllActiveCustomerSchedulesRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "DeleteAllActiveCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteAllActiveCustomerSchedules")
    public Future<?> deleteAllActiveCustomerSchedulesAsync(
        @WebParam(name = "DeleteAllActiveCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteAllActiveCustomerSchedulesRequest parameter,
        @WebParam(name = "DeleteAllActiveCustomerSchedulesResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteAllActiveCustomerSchedulesResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.DeleteAllActiveCustomerSchedulesResponse
     * @throws DeleteAllActiveCustomerSchedulesException
     */
    @WebMethod(operationName = "DeleteAllActiveCustomerSchedules", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/DeleteAllActiveCustomerSchedules")
    @WebResult(name = "DeleteAllActiveCustomerSchedulesResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public DeleteAllActiveCustomerSchedulesResponse deleteAllActiveCustomerSchedules(
        @WebParam(name = "DeleteAllActiveCustomerSchedulesRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        DeleteAllActiveCustomerSchedulesRequest parameter)
        throws DeleteAllActiveCustomerSchedulesException
    ;

    /**
     * 
     * @param parameter
     * @return
     *     returns javax.xml.ws.Response<com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAgreementResponse>
     */
    @WebMethod(operationName = "EditCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAgreement")
    public Response<EditCustomerAgreementResponse> editCustomerAgreementAsync(
        @WebParam(name = "EditCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAgreementRequest parameter);

    /**
     * 
     * @param parameter
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "EditCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAgreement")
    public Future<?> editCustomerAgreementAsync(
        @WebParam(name = "EditCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAgreementRequest parameter,
        @WebParam(name = "EditCustomerAgreementResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<EditCustomerAgreementResponse> asyncHandler);

    /**
     * 
     * @param parameter
     * @return
     *     returns com.directvla.schema.businessdomain.crmsupportandreadiness.v1_0.EditCustomerAgreementResponse
     * @throws EditCustomerAgreementException
     */
    @WebMethod(operationName = "EditCustomerAgreement", action = "http://directvla.com/contract/businessdomain/CRMSupportAndReadiness/v1-0/EditCustomerAgreement")
    @WebResult(name = "EditCustomerAgreementResponse", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
    public EditCustomerAgreementResponse editCustomerAgreement(
        @WebParam(name = "EditCustomerAgreementRequest", targetNamespace = "http://directvla.com/schema/businessdomain/CRMSupportAndReadiness/v1-0", partName = "parameter")
        EditCustomerAgreementRequest parameter)
        throws EditCustomerAgreementException
    ;

}
