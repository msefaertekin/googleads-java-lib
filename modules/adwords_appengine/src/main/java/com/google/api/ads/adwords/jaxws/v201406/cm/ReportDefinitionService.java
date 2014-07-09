
package com.google.api.ads.adwords.jaxws.v201406.cm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ReportDefinitionService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201406/ReportDefinitionService?wsdl")
public class ReportDefinitionService
    extends Service
{

    private final static URL REPORTDEFINITIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTDEFINITIONSERVICE_EXCEPTION;
    private final static QName REPORTDEFINITIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201406", "ReportDefinitionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201406/ReportDefinitionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTDEFINITIONSERVICE_WSDL_LOCATION = url;
        REPORTDEFINITIONSERVICE_EXCEPTION = e;
    }

    public ReportDefinitionService() {
        super(__getWsdlLocation(), REPORTDEFINITIONSERVICE_QNAME);
    }

    public ReportDefinitionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ReportDefinitionServiceInterface
     */
    @WebEndpoint(name = "ReportDefinitionServiceInterfacePort")
    public ReportDefinitionServiceInterface getReportDefinitionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "ReportDefinitionServiceInterfacePort"), ReportDefinitionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportDefinitionServiceInterface
     */
    @WebEndpoint(name = "ReportDefinitionServiceInterfacePort")
    public ReportDefinitionServiceInterface getReportDefinitionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "ReportDefinitionServiceInterfacePort"), ReportDefinitionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTDEFINITIONSERVICE_EXCEPTION!= null) {
            throw REPORTDEFINITIONSERVICE_EXCEPTION;
        }
        return REPORTDEFINITIONSERVICE_WSDL_LOCATION;
    }

}
