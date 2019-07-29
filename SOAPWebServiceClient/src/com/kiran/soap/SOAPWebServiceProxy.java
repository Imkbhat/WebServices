package com.kiran.soap;

public class SOAPWebServiceProxy implements com.kiran.soap.SOAPWebService {
  private String _endpoint = null;
  private com.kiran.soap.SOAPWebService sOAPWebService = null;
  
  public SOAPWebServiceProxy() {
    _initSOAPWebServiceProxy();
  }
  
  public SOAPWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSOAPWebServiceProxy();
  }
  
  private void _initSOAPWebServiceProxy() {
    try {
      sOAPWebService = (new com.kiran.soap.SOAPWebServiceServiceLocator()).getSOAPWebService();
      if (sOAPWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOAPWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOAPWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOAPWebService != null)
      ((javax.xml.rpc.Stub)sOAPWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.kiran.soap.SOAPWebService getSOAPWebService() {
    if (sOAPWebService == null)
      _initSOAPWebServiceProxy();
    return sOAPWebService;
  }
  
  public int subtract(int a, int b) throws java.rmi.RemoteException{
    if (sOAPWebService == null)
      _initSOAPWebServiceProxy();
    return sOAPWebService.subtract(a, b);
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (sOAPWebService == null)
      _initSOAPWebServiceProxy();
    return sOAPWebService.add(a, b);
  }
  
  
}