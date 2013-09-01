/**
 * EstoqueBO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiap.inventario.bo;

public interface EstoqueBO extends java.rmi.Remote {
    public com.fiap.inventario.to.ProdutoTO consultarProduto(int codProduto) throws java.rmi.RemoteException;
}
