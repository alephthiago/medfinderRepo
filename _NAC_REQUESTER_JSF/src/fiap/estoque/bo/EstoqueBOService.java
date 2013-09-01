/**
 * EstoqueBOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fiap.estoque.bo;

public interface EstoqueBOService extends javax.xml.rpc.Service {
    public java.lang.String getEstoqueBOAddress();

    public fiap.estoque.bo.EstoqueBO getEstoqueBO() throws javax.xml.rpc.ServiceException;

    public fiap.estoque.bo.EstoqueBO getEstoqueBO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
