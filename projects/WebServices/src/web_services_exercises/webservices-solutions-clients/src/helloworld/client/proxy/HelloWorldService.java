
package helloworld.client.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAXWS SI. JAX-WS RI 2.0_01-b59-fcs Generated
 * source version: 2.0
 */
@WebServiceClient(name = "HelloWorldService", targetNamespace = "http://service.helloworld/", wsdlLocation = "http://localhost:8080/services/helloworld?wsdl")
public class HelloWorldService extends Service {

	private static final URL HELLOWORLDSERVICE_WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL("http://localhost:8080/services/helloworld?wsdl");
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		HELLOWORLDSERVICE_WSDL_LOCATION = url;
	}

	public HelloWorldService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public HelloWorldService() {
		super(HELLOWORLDSERVICE_WSDL_LOCATION,
				new QName("http://service.helloworld/", "HelloWorldService"));
	}

	/**
	 * @return returns HelloWorld
	 */
	@WebEndpoint(name = "HelloWorldPort")
	public HelloWorld getHelloWorldPort() {
		return (HelloWorld) super.getPort(
				new QName("http://service.helloworld/", "HelloWorldPort"),
				HelloWorld.class);
	}

}
