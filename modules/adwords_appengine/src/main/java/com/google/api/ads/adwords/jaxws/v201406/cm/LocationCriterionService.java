
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
@WebServiceClient(name = "LocationCriterionService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201406/LocationCriterionService?wsdl")
public class LocationCriterionService
    extends Service
{

    private final static URL LOCATIONCRITERIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCATIONCRITERIONSERVICE_EXCEPTION;
    private final static QName LOCATIONCRITERIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201406", "LocationCriterionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201406/LocationCriterionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCATIONCRITERIONSERVICE_WSDL_LOCATION = url;
        LOCATIONCRITERIONSERVICE_EXCEPTION = e;
    }

    public LocationCriterionService() {
        super(__getWsdlLocation(), LOCATIONCRITERIONSERVICE_QNAME);
    }

    public LocationCriterionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns LocationCriterionServiceInterface
     */
    @WebEndpoint(name = "LocationCriterionServiceInterfacePort")
    public LocationCriterionServiceInterface getLocationCriterionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "LocationCriterionServiceInterfacePort"), LocationCriterionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocationCriterionServiceInterface
     */
    @WebEndpoint(name = "LocationCriterionServiceInterfacePort")
    public LocationCriterionServiceInterface getLocationCriterionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "LocationCriterionServiceInterfacePort"), LocationCriterionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCATIONCRITERIONSERVICE_EXCEPTION!= null) {
            throw LOCATIONCRITERIONSERVICE_EXCEPTION;
        }
        return LOCATIONCRITERIONSERVICE_WSDL_LOCATION;
    }

}
