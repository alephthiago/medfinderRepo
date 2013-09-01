/**
 * EstoqueBO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fiap.estoque.bo;

public interface EstoqueBO extends java.rmi.Remote {
    public fiap.estoque.to.ProdutoTO consultarProduto(int codProduto) throws java.rmi.RemoteException;
    public void atualizarProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException;
    public fiap.estoque.to.ProdutoTO[] listarProdutos() throws java.rmi.RemoteException;
    public void removerProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException;
    public void adicionarProduto(fiap.estoque.to.ProdutoTO produto) throws java.rmi.RemoteException;
    public java.lang.String[] buscarTodasAsDescricoesProdutos() throws java.rmi.RemoteException;
}
