package com.fiap.inventario.bo;

public class EstoqueBOProxy implements com.fiap.inventario.bo.EstoqueBO {
  private String _endpoint = null;
  private com.fiap.inventario.bo.EstoqueBO estoqueBO = null;
  
  public EstoqueBOProxy() {
    _initEstoqueBOProxy();
  }
  
  public EstoqueBOProxy(String endpoint) {
    _endpoint = endpoint;
    _initEstoqueBOProxy();
  }
  
  private void _initEstoqueBOProxy() {
    try {
      estoqueBO = (new com.fiap.inventario.bo.EstoqueBOServiceLocator()).getEstoqueBO();
      if (estoqueBO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)estoqueBO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)estoqueBO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (estoqueBO != null)
      ((javax.xml.rpc.Stub)estoqueBO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.fiap.inventario.bo.EstoqueBO getEstoqueBO() {
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO;
  }
  
  public com.fiap.inventario.to.ProdutoTO consultarProduto(int codProduto) throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO.consultarProduto(codProduto);
  }
  
  
}