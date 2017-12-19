
package com.directv.email.computec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.directv.email.computec package. 
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

    private final static QName _WSBusinessRuleException_QNAME = new QName("http://co.com.computec.directvivr.ws/", "WSBusinessRuleException");
    private final static QName _WSSystemException_QNAME = new QName("http://co.com.computec.directvivr.ws/", "WSSystemException");
    private final static QName _EnviarDocumento_QNAME = new QName("http://co.com.computec.directvivr.ws/", "enviarDocumento");
    private final static QName _EnviarDocumentoResponse_QNAME = new QName("http://co.com.computec.directvivr.ws/", "enviarDocumentoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.directv.email.computec
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarDocumentoResponse }
     * 
     */
    public EnviarDocumentoResponse createEnviarDocumentoResponse() {
        return new EnviarDocumentoResponse();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link EnviarDocumento }
     * 
     */
    public EnviarDocumento createEnviarDocumento() {
        return new EnviarDocumento();
    }

    /**
     * Create an instance of {@link DatoConsultaDTO }
     * 
     */
    public DatoConsultaDTO createDatoConsultaDTO() {
        return new DatoConsultaDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://co.com.computec.directvivr.ws/", name = "WSBusinessRuleException")
    public JAXBElement<FaultBean> createWSBusinessRuleException(FaultBean value) {
        return new JAXBElement<FaultBean>(_WSBusinessRuleException_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://co.com.computec.directvivr.ws/", name = "WSSystemException")
    public JAXBElement<FaultBean> createWSSystemException(FaultBean value) {
        return new JAXBElement<FaultBean>(_WSSystemException_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://co.com.computec.directvivr.ws/", name = "enviarDocumento")
    public JAXBElement<EnviarDocumento> createEnviarDocumento(EnviarDocumento value) {
        return new JAXBElement<EnviarDocumento>(_EnviarDocumento_QNAME, EnviarDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDocumentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://co.com.computec.directvivr.ws/", name = "enviarDocumentoResponse")
    public JAXBElement<EnviarDocumentoResponse> createEnviarDocumentoResponse(EnviarDocumentoResponse value) {
        return new JAXBElement<EnviarDocumentoResponse>(_EnviarDocumentoResponse_QNAME, EnviarDocumentoResponse.class, null, value);
    }

}
