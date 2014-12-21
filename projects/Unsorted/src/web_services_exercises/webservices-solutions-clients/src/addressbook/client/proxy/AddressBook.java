
package addressbook.client.proxy;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 *
 */
@WebService(name = "AddressBook", targetNamespace = "http://service.addressbook/")
public interface AddressBook {


	/**
	 *
	 * @param arg0
	 * @return
	 *	 returns addressbook.client.proxy.Address
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAddress", targetNamespace = "http://service.addressbook/", className = "addressbook.client.proxy.GetAddress")
	@ResponseWrapper(localName = "getAddressResponse", targetNamespace = "http://service.addressbook/", className = "addressbook.client.proxy.GetAddressResponse")
	Address getAddress(
		@WebParam(name = "arg0", targetNamespace = "")
		String arg0);

	/**
	 *
	 * @param arg1
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "addAddress", targetNamespace = "http://service.addressbook/", className = "addressbook.client.proxy.AddAddress")
	@ResponseWrapper(localName = "addAddressResponse", targetNamespace = "http://service.addressbook/", className = "addressbook.client.proxy.AddAddressResponse")
	void addAddress(
		@WebParam(name = "arg0", targetNamespace = "")
		String arg0,
		@WebParam(name = "arg1", targetNamespace = "")
		Address arg1);

}
