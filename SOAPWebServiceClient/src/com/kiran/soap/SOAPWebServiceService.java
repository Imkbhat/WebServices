/**
 * SOAPWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.kiran.soap;

public interface SOAPWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getSOAPWebServiceAddress();

    public com.kiran.soap.SOAPWebService getSOAPWebService() throws javax.xml.rpc.ServiceException;

    public com.kiran.soap.SOAPWebService getSOAPWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
