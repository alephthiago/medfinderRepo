package com.fiap.pessoal.bo;

public class ClienteBOProxy implements com.fiap.pessoal.bo.ClienteBO {
  private String _endpoint = null;
  private com.fiap.pessoal.bo.ClienteBO clienteBO = null;
  
  public ClienteBOProxy() {
    _initClienteBOProxy();
  }
  
  public ClienteBOProxy(String endpoint) {
    _endpoint = endpoint;
    _initClienteBOProxy();
  }
  
  private void _initClienteBOProxy() {
    try {
      clienteBO = (new com.fiap.pessoal.bo.ClienteBOServiceLocator()).getClienteBO();
      if (clienteBO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clienteBO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clienteBO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clienteBO != null)
      ((javax.xml.rpc.Stub)clienteBO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fiap.pessoal.bo.ClienteBO getClienteBO() {
    if (clienteBO == null)
      _initClienteBOProxy();
    return clienteBO;
  }
  
  public com.fiap.pessoal.to.ClienteTO consultarCliente(int codCliente) throws java.rmi.RemoteException{
    if (clienteBO == null)
      _initClienteBOProxy();
    return clienteBO.consultarCliente(codCliente);
  }
  
  
}