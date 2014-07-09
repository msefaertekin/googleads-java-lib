
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
@WebServiceClient(name = "CustomerFeedService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201406", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201406/CustomerFeedService?wsdl")
public class CustomerFeedService
    extends Service
{

    private final static URL CUSTOMERFEEDSERVICE_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERFEEDSERVICE_EXCEPTION;
    private final static QName CUSTOMERFEEDSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201406", "CustomerFeedService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201406/CustomerFeedService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERFEEDSERVICE_WSDL_LOCATION = url;
        CUSTOMERFEEDSERVICE_EXCEPTION = e;
    }

    public CustomerFeedService() {
        super(__getWsdlLocation(), CUSTOMERFEEDSERVICE_QNAME);
    }

    public CustomerFeedService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CustomerFeedServiceInterface
     */
    @WebEndpoint(name = "CustomerFeedServiceInterfacePort")
    public CustomerFeedServiceInterface getCustomerFeedServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "CustomerFeedServiceInterfacePort"), CustomerFeedServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerFeedServiceInterface
     */
    @WebEndpoint(name = "CustomerFeedServiceInterfacePort")
    public CustomerFeedServiceInterface getCustomerFeedServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201406", "CustomerFeedServiceInterfacePort"), CustomerFeedServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERFEEDSERVICE_EXCEPTION!= null) {
            throw CUSTOMERFEEDSERVICE_EXCEPTION;
        }
        return CUSTOMERFEEDSERVICE_WSDL_LOCATION;
    }

}
