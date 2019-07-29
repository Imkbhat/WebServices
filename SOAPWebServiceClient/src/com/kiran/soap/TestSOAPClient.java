package com.kiran.soap;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

public class TestSOAPClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		
		java.net.URL url = new java.net.URL("http://localhost:8080/SOAPWebService/services/SOAPWebService");
		
		org.apache.axis.client.Service service = new org.apache.axis.client.Service();
		
		SOAPWebServiceSoapBindingStub stub = new SOAPWebServiceSoapBindingStub(url, service);		
		
		int res = stub.subtract(5, 3);
		
		int add = stub.add(5, 3);
		
		System.out.println(res +"================="+add);
	}

}
