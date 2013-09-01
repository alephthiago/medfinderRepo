/**
 * ClienteBOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fiap.pessoal.bo;

public class ClienteBOServiceLocator extends org.apache.axis.client.Service implements com.fiap.pessoal.bo.ClienteBOService {

    public ClienteBOServiceLocator() {
    }


    public ClienteBOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClienteBOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClienteBO
    private java.lang.String ClienteBO_address = "http://localhost:8080/cliente-ws/services/ClienteBO";

    public java.lang.String getClienteBOAddress() {
        return ClienteBO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClienteBOWSDDServiceName = "ClienteBO";

    public java.lang.String getClienteBOWSDDServiceName() {
        return ClienteBOWSDDServiceName;
    }

    public void setClienteBOWSDDServiceName(java.lang.String name) {
        ClienteBOWSDDServiceName = name;
    }

    public com.fiap.pessoal.bo.ClienteBO getClienteBO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClienteBO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClienteBO(endpoint);
    }

    public com.fiap.pessoal.bo.ClienteBO getClienteBO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fiap.pessoal.bo.ClienteBOSoapBindingStub _stub = new com.fiap.pessoal.bo.ClienteBOSoapBindingStub(portAddress, this);
            _stub.setPortName(getClienteBOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClienteBOEndpointAddress(java.lang.String address) {
        ClienteBO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fiap.pessoal.bo.ClienteBO.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fiap.pessoal.bo.ClienteBOSoapBindingStub _stub = new com.fiap.pessoal.bo.ClienteBOSoapBindingStub(new java.net.URL(ClienteBO_address), this);
                _stub.setPortName(getClienteBOWSDDServiceName());
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
        if ("ClienteBO".equals(inputPortName)) {
            return getClienteBO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bo.pessoal.fiap.com", "ClienteBOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bo.pessoal.fiap.com", "ClienteBO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClienteBO".equals(portName)) {
            setClienteBOEndpointAddress(address);
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
