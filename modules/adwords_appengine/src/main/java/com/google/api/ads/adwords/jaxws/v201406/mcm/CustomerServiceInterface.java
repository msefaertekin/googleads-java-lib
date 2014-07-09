
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service to access basic details about any customer.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201406.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201406.mcm.ObjectFactory.class
})
public interface CustomerServiceInterface {


    /**
     * 
     *         Returns details of the authorized customer.
     *         
     *         @return customer associated with the caller
     *       
     * 
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.CustomerServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.CustomerServiceInterfacegetResponse")
    public Customer get()
        throws ApiException
    ;

    /**
     * 
     *         Update an authorized customer. The only update currently provided is to enable or disable <a
     *         href="https://support.google.com/analytics/answer/1033981?hl=en"> auto-tagging </a>; see that
     *         link for special cases affecting the use of auto-tagging.
     *         
     *         @param customer the requested updated value for the customer.
     *         @throws ApiException
     *       
     * 
     * @param customer
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.CustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.CustomerServiceInterfacemutateResponse")
    public Customer mutate(
        @WebParam(name = "customer", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        Customer customer)
        throws ApiException
    ;

}
