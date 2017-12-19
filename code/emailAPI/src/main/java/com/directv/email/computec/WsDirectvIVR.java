
package com.directv.email.computec;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsDirectvIVR", targetNamespace = "http://co.com.computec.directvivr.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsDirectvIVR {


    /**
     * 
     * @param datosConsulta
     * @return
     *     returns javax.xml.ws.Response<com.directv.email.computec.EnviarDocumentoResponse>
     */
    @WebMethod(operationName = "enviarDocumento")
    @RequestWrapper(localName = "enviarDocumento", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumento")
    @ResponseWrapper(localName = "enviarDocumentoResponse", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumentoResponse")
    public Response<EnviarDocumentoResponse> enviarDocumentoAsync(
        @WebParam(name = "datosConsulta", targetNamespace = "")
        DatoConsultaDTO datosConsulta);

    /**
     * 
     * @param datosConsulta
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "enviarDocumento")
    @RequestWrapper(localName = "enviarDocumento", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumento")
    @ResponseWrapper(localName = "enviarDocumentoResponse", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumentoResponse")
    public Future<?> enviarDocumentoAsync(
        @WebParam(name = "datosConsulta", targetNamespace = "")
        DatoConsultaDTO datosConsulta,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<EnviarDocumentoResponse> asyncHandler);

    /**
     * 
     * @param datosConsulta
     * @return
     *     returns boolean
     * @throws WSBusinessRuleException
     * @throws WSSystemException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enviarDocumento", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumento")
    @ResponseWrapper(localName = "enviarDocumentoResponse", targetNamespace = "http://co.com.computec.directvivr.ws/", className = "com.directv.email.computec.EnviarDocumentoResponse")
    @Action(input = "http://co.com.computec.directvivr.ws/WsDirectvIVR/enviarDocumentoRequest", output = "http://co.com.computec.directvivr.ws/WsDirectvIVR/enviarDocumentoResponse", fault = {
        @FaultAction(className = WSSystemException.class, value = "http://co.com.computec.directvivr.ws/WsDirectvIVR/enviarDocumento/Fault/WSSystemException"),
        @FaultAction(className = WSBusinessRuleException.class, value = "http://co.com.computec.directvivr.ws/WsDirectvIVR/enviarDocumento/Fault/WSBusinessRuleException")
    })
    public boolean enviarDocumento(
        @WebParam(name = "datosConsulta", targetNamespace = "")
        DatoConsultaDTO datosConsulta)
        throws WSBusinessRuleException, WSSystemException
    ;

}