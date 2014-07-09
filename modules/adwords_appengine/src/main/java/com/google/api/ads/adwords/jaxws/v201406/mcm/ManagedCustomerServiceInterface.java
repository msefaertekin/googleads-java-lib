
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import java.util.List;
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
 *       Customer Manager Service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ManagedCustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201406.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201406.mcm.ObjectFactory.class
})
public interface ManagedCustomerServiceInterface {


    /**
     * 
     *         Returns the list of customers that meet the selector criteria.
     *         
     *         @param selector The selector specifying the {@link ManagedCustomer}s to return.
     *         @return List of customers identified by the selector.
     *         @throws ApiException When there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacegetResponse")
    public ManagedCustomerPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        Selector serviceSelector)
        throws ApiException
    ;

    /**
     * 
     *         Returns the pending invitations for the customer IDs in the selector.
     *         @param selector the manager customer ids (inviters) or the client customer ids (invitees)
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201406.mcm.PendingInvitation>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "getPendingInvitations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacegetPendingInvitations")
    @ResponseWrapper(localName = "getPendingInvitationsResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacegetPendingInvitationsResponse")
    public List<PendingInvitation> getPendingInvitations(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        PendingInvitationSelector selector)
        throws ApiException
    ;

    /**
     * 
     *         Adds managed customers.
     *         
     *         <p class="note"><b>Note:</b> {@link ManagedCustomerOperation} only supports
     *         {@code ADD} operator. </p>
     *         
     *         @param operations List of unique operations.
     *         @return The list of updated managed customers, returned in the same order as the
     *         <code>operations</code> array.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutateResponse")
    public ManagedCustomerReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        List<ManagedCustomerOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Modifies the ManagedCustomer forest. These actions are possible (categorized by
     *         Operator + Link Status):
     *         
     *         <ul>
     *         <li>ADD + PENDING:   manager extends invitations
     *         <li>SET + CANCELLED: manager rescinds invitations
     *         <li>SET + INACTIVE:  manager/client terminates links
     *         <li>SET + ACTIVE:    client accepts invitations
     *         <li>SET + REFUSED:   client declines invitations
     *         </ul>
     *         
     *         @param operations the list of operations
     *         @return results for the given operations
     *         @throws ApiException with a {@link ManagedCustomerServiceError}
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.MutateLinkResults
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "mutateLink", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutateLink")
    @ResponseWrapper(localName = "mutateLinkResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutateLinkResponse")
    public MutateLinkResults mutateLink(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        List<LinkOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Moves client customers to new managers (moving links). Only the following action is possible:
     *         
     *         <ul>
     *         <li>SET + ACTIVE: manager moves client customers to new managers within the same MCC
     *         hierarchy
     *         </ul>
     *         
     *         @param operations List of unique operations.
     *         @return results for the given operations
     *         @throws ApiException with a {@link ManagedCustomerServiceError}
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201406.mcm.MutateManagerResults
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
    @RequestWrapper(localName = "mutateManager", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutateManager")
    @ResponseWrapper(localName = "mutateManagerResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406", className = "com.google.api.ads.adwords.jaxws.v201406.mcm.ManagedCustomerServiceInterfacemutateManagerResponse")
    public MutateManagerResults mutateManager(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201406")
        List<MoveOperation> operations)
        throws ApiException
    ;

}
