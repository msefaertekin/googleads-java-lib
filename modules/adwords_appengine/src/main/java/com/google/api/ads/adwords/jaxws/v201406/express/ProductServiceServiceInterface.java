
package com.google.api.ads.adwords.jaxws.v201406.express;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201406.cm.Selector;


/**
 * 
 *       A service which returns product and service supported by AdWords Express.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProductServiceServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/express/v201406")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201406.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201406.express.ObjectFactory.class
})
public interface ProductServiceServiceInterface {


    /**
     * 
     *         Retrieves the {@link ProductService}s that meet the criteria set in the given selector. Only a
     *         limited number of {@link ProductService}s are returned.
     *         
     *         @param selector the selector specifying the product services to return
     *         @return list of product services identified by the selector
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.express.ProductServicePage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201406")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/express/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.express.ProductServiceServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.express.ProductServiceServiceInterfacegetResponse")
    public ProductServicePage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/express/v201406")
        Selector selector)
        throws ApiException
    ;

}
