
package com.directv.email.exacttarget;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Soap", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Soap {


    /**
     * Create objects
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.CreateResponse>
     */
    @WebMethod(operationName = "Create", action = "Create")
    public Response<CreateResponse> createAsync(
        @WebParam(name = "CreateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        CreateRequest parameters);

    /**
     * Create objects
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Create", action = "Create")
    public Future<?> createAsync(
        @WebParam(name = "CreateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        CreateRequest parameters,
        @WebParam(name = "CreateResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<CreateResponse> asyncHandler);

    /**
     * Create objects
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.CreateResponse
     */
    @WebMethod(operationName = "Create", action = "Create")
    @WebResult(name = "CreateResponse", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public CreateResponse create(
        @WebParam(name = "CreateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        CreateRequest parameters);

    /**
     * Retrieve objects
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.RetrieveResponseMsg>
     */
    @WebMethod(operationName = "Retrieve", action = "Retrieve")
    public Response<RetrieveResponseMsg> retrieveAsync(
        @WebParam(name = "RetrieveRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        RetrieveRequestMsg parameters);

    /**
     * Retrieve objects
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Retrieve", action = "Retrieve")
    public Future<?> retrieveAsync(
        @WebParam(name = "RetrieveRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        RetrieveRequestMsg parameters,
        @WebParam(name = "RetrieveResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<RetrieveResponseMsg> asyncHandler);

    /**
     * Retrieve objects
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.RetrieveResponseMsg
     */
    @WebMethod(operationName = "Retrieve", action = "Retrieve")
    @WebResult(name = "RetrieveResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public RetrieveResponseMsg retrieve(
        @WebParam(name = "RetrieveRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        RetrieveRequestMsg parameters);

    /**
     * Update objects
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.UpdateResponse>
     */
    @WebMethod(operationName = "Update", action = "Update")
    public Response<UpdateResponse> updateAsync(
        @WebParam(name = "UpdateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        UpdateRequest parameters);

    /**
     * Update objects
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Update", action = "Update")
    public Future<?> updateAsync(
        @WebParam(name = "UpdateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        UpdateRequest parameters,
        @WebParam(name = "UpdateResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<UpdateResponse> asyncHandler);

    /**
     * Update objects
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.UpdateResponse
     */
    @WebMethod(operationName = "Update", action = "Update")
    @WebResult(name = "UpdateResponse", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public UpdateResponse update(
        @WebParam(name = "UpdateRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        UpdateRequest parameters);

    /**
     * Delete objects
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.DeleteResponse>
     */
    @WebMethod(operationName = "Delete", action = "Delete")
    public Response<DeleteResponse> deleteAsync(
        @WebParam(name = "DeleteRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DeleteRequest parameters);

    /**
     * Delete objects
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Delete", action = "Delete")
    public Future<?> deleteAsync(
        @WebParam(name = "DeleteRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DeleteRequest parameters,
        @WebParam(name = "DeleteResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DeleteResponse> asyncHandler);

    /**
     * Delete objects
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.DeleteResponse
     */
    @WebMethod(operationName = "Delete", action = "Delete")
    @WebResult(name = "DeleteResponse", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public DeleteResponse delete(
        @WebParam(name = "DeleteRequest", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DeleteRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.QueryResponseMsg>
     */
    @WebMethod(operationName = "Query", action = "Query")
    public Response<QueryResponseMsg> queryAsync(
        @WebParam(name = "QueryRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        QueryRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Query", action = "Query")
    public Future<?> queryAsync(
        @WebParam(name = "QueryRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        QueryRequestMsg parameters,
        @WebParam(name = "QueryResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<QueryResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.QueryResponseMsg
     */
    @WebMethod(operationName = "Query", action = "Query")
    @WebResult(name = "QueryResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public QueryResponseMsg query(
        @WebParam(name = "QueryRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        QueryRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.DefinitionResponseMsg>
     */
    @WebMethod(operationName = "Describe", action = "Describe")
    public Response<DefinitionResponseMsg> describeAsync(
        @WebParam(name = "DefinitionRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DefinitionRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Describe", action = "Describe")
    public Future<?> describeAsync(
        @WebParam(name = "DefinitionRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DefinitionRequestMsg parameters,
        @WebParam(name = "DescribeResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<DefinitionResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.DefinitionResponseMsg
     */
    @WebMethod(operationName = "Describe", action = "Describe")
    @WebResult(name = "DefinitionResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public DefinitionResponseMsg describe(
        @WebParam(name = "DefinitionRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        DefinitionRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.ExecuteResponseMsg>
     */
    @WebMethod(operationName = "Execute", action = "Execute")
    public Response<ExecuteResponseMsg> executeAsync(
        @WebParam(name = "ExecuteRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExecuteRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Execute", action = "Execute")
    public Future<?> executeAsync(
        @WebParam(name = "ExecuteRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExecuteRequestMsg parameters,
        @WebParam(name = "ExecuteResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ExecuteResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.ExecuteResponseMsg
     */
    @WebMethod(operationName = "Execute", action = "Execute")
    @WebResult(name = "ExecuteResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public ExecuteResponseMsg execute(
        @WebParam(name = "ExecuteRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExecuteRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.PerformResponseMsg>
     */
    @WebMethod(operationName = "Perform", action = "Perform")
    public Response<PerformResponseMsg> performAsync(
        @WebParam(name = "PerformRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        PerformRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Perform", action = "Perform")
    public Future<?> performAsync(
        @WebParam(name = "PerformRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        PerformRequestMsg parameters,
        @WebParam(name = "PerformResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<PerformResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.PerformResponseMsg
     */
    @WebMethod(operationName = "Perform", action = "Perform")
    @WebResult(name = "PerformResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public PerformResponseMsg perform(
        @WebParam(name = "PerformRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        PerformRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.ConfigureResponseMsg>
     */
    @WebMethod(operationName = "Configure", action = "Configure")
    public Response<ConfigureResponseMsg> configureAsync(
        @WebParam(name = "ConfigureRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ConfigureRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Configure", action = "Configure")
    public Future<?> configureAsync(
        @WebParam(name = "ConfigureRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ConfigureRequestMsg parameters,
        @WebParam(name = "ConfigureResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ConfigureResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.ConfigureResponseMsg
     */
    @WebMethod(operationName = "Configure", action = "Configure")
    @WebResult(name = "ConfigureResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public ConfigureResponseMsg configure(
        @WebParam(name = "ConfigureRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ConfigureRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.ScheduleResponseMsg>
     */
    @WebMethod(operationName = "Schedule", action = "Schedule")
    public Response<ScheduleResponseMsg> scheduleAsync(
        @WebParam(name = "ScheduleRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ScheduleRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Schedule", action = "Schedule")
    public Future<?> scheduleAsync(
        @WebParam(name = "ScheduleRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ScheduleRequestMsg parameters,
        @WebParam(name = "ScheduleResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ScheduleResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.ScheduleResponseMsg
     */
    @WebMethod(operationName = "Schedule", action = "Schedule")
    @WebResult(name = "ScheduleResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public ScheduleResponseMsg schedule(
        @WebParam(name = "ScheduleRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ScheduleRequestMsg parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.VersionInfoResponseMsg>
     */
    @WebMethod(operationName = "VersionInfo", action = "VersionInfo")
    public Response<VersionInfoResponseMsg> versionInfoAsync(
        @WebParam(name = "VersionInfoRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        VersionInfoRequestMsg parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "VersionInfo", action = "VersionInfo")
    public Future<?> versionInfoAsync(
        @WebParam(name = "VersionInfoRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        VersionInfoRequestMsg parameters,
        @WebParam(name = "VersionInfoResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<VersionInfoResponseMsg> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.VersionInfoResponseMsg
     */
    @WebMethod(operationName = "VersionInfo", action = "VersionInfo")
    @WebResult(name = "VersionInfoResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public VersionInfoResponseMsg versionInfo(
        @WebParam(name = "VersionInfoRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        VersionInfoRequestMsg parameters);

    /**
     * Perform ad hoc data extracts
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.ExtractResponseMsg>
     */
    @WebMethod(operationName = "Extract", action = "Extract")
    public Response<ExtractResponseMsg> extractAsync(
        @WebParam(name = "ExtractRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExtractRequestMsg parameters);

    /**
     * Perform ad hoc data extracts
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "Extract", action = "Extract")
    public Future<?> extractAsync(
        @WebParam(name = "ExtractRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExtractRequestMsg parameters,
        @WebParam(name = "ExtractResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ExtractResponseMsg> asyncHandler);

    /**
     * Perform ad hoc data extracts
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.ExtractResponseMsg
     */
    @WebMethod(operationName = "Extract", action = "Extract")
    @WebResult(name = "ExtractResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public ExtractResponseMsg extract(
        @WebParam(name = "ExtractRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        ExtractRequestMsg parameters);

    /**
     * Get Current System Status
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.exacttarget.SystemStatusResponseMsg>
     */
    @WebMethod(operationName = "GetSystemStatus", action = "GetSystemStatus")
    public Response<SystemStatusResponseMsg> getSystemStatusAsync(
        @WebParam(name = "SystemStatusRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        SystemStatusRequestMsg parameters);

    /**
     * Get Current System Status
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "GetSystemStatus", action = "GetSystemStatus")
    public Future<?> getSystemStatusAsync(
        @WebParam(name = "SystemStatusRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        SystemStatusRequestMsg parameters,
        @WebParam(name = "GetSystemStatusResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<SystemStatusResponseMsg> asyncHandler);

    /**
     * Get Current System Status
     * 
     * @param parameters
     * @return
     *     returns com.directv.email.exacttarget.SystemStatusResponseMsg
     */
    @WebMethod(operationName = "GetSystemStatus", action = "GetSystemStatus")
    @WebResult(name = "SystemStatusResponseMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
    public SystemStatusResponseMsg getSystemStatus(
        @WebParam(name = "SystemStatusRequestMsg", targetNamespace = "http://exacttarget.com/wsdl/partnerAPI", partName = "parameters")
        SystemStatusRequestMsg parameters);

}
