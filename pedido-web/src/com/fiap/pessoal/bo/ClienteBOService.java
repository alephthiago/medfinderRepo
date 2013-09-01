/**
 * ClienteBOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiap.pessoal.bo;

public interface ClienteBOService extends javax.xml.rpc.Service {
    public java.lang.String getClienteBOAddress();

    public com.fiap.pessoal.bo.ClienteBO getClienteBO() throws javax.xml.rpc.ServiceException;

    public com.fiap.pessoal.bo.ClienteBO getClienteBO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
