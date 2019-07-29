/**
 * SOAPWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kiran.soap;

public class SOAPWebServiceServiceLocator extends org.apache.axis.client.Service implements com.kiran.soap.SOAPWebServiceService {

    public SOAPWebServiceServiceLocator() {
    }


    public SOAPWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPWebService
    private java.lang.String SOAPWebService_address = "http://localhost:8080/SOAPWebService/services/SOAPWebService";

    public java.lang.String getSOAPWebServiceAddress() {
        return SOAPWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPWebServiceWSDDServiceName = "SOAPWebService";

    public java.lang.String getSOAPWebServiceWSDDServiceName() {
        return SOAPWebServiceWSDDServiceName;
    }

    public void setSOAPWebServiceWSDDServiceName(java.lang.String name) {
        SOAPWebServiceWSDDServiceName = name;
    }

    public com.kiran.soap.SOAPWebService getSOAPWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPWebService(endpoint);
    }

    public com.kiran.soap.SOAPWebService getSOAPWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.kiran.soap.SOAPWebServiceSoapBindingStub _stub = new com.kiran.soap.SOAPWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSOAPWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPWebServiceEndpointAddress(java.lang.String address) {
        SOAPWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.kiran.soap.SOAPWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.kiran.soap.SOAPWebServiceSoapBindingStub _stub = new com.kiran.soap.SOAPWebServiceSoapBindingStub(new java.net.URL(SOAPWebService_address), this);
                _stub.setPortName(getSOAPWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAPWebService".equals(inputPortName)) {
            return getSOAPWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.kiran.com", "SOAPWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.kiran.com", "SOAPWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPWebService".equals(portName)) {
            setSOAPWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
