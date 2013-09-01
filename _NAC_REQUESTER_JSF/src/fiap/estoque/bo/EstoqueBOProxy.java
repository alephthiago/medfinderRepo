package fiap.estoque.bo;

public class EstoqueBOProxy implements fiap.estoque.bo.EstoqueBO {
  private String _endpoint = null;
  private fiap.estoque.bo.EstoqueBO estoqueBO = null;
  
  public EstoqueBOProxy() {
    _initEstoqueBOProxy();
  }
  
  public EstoqueBOProxy(String endpoint) {
    _endpoint = endpoint;
    _initEstoqueBOProxy();
  }
  
  private void _initEstoqueBOProxy() {
    try {
      estoqueBO = (new fiap.estoque.bo.EstoqueBOServiceLocator()).getEstoqueBO();
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
  
  public fiap.estoque.bo.EstoqueBO getEstoqueBO() {
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO;
  }
  
  public fiap.estoque.to.ProdutoTO consultarProduto(int codProduto) throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO.consultarProduto(codProduto);
  }
  
  public void atualizarProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    estoqueBO.atualizarProduto(produto);
  }
  
  public fiap.estoque.to.ProdutoTO[] listarProdutos() throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO.listarProdutos();
  }
  
  public void removerProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    estoqueBO.removerProduto(produto);
  }
  
  public void adicionarProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    estoqueBO.adicionarProduto(produto);
  }
  
  public java.lang.String[] buscarTodasAsDescricoesProdutos() throws java.rmi.RemoteException{
    if (estoqueBO == null)
      _initEstoqueBOProxy();
    return estoqueBO.buscarTodasAsDescricoesProdutos();
  }
  
  
}