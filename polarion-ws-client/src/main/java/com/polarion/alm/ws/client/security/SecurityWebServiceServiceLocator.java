/**
 * SecurityWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.security;

public class SecurityWebServiceServiceLocator extends org.apache.axis.client.Service implements com.polarion.alm.ws.client.security.SecurityWebServiceService {

/**
 * This service provides scurity related information.
 */

    public SecurityWebServiceServiceLocator() {
    }


    public SecurityWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SecurityWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SecurityWebService
    private java.lang.String SecurityWebService_address = "http://localhost:8888/polarion/ws/services/SecurityWebService";

    public java.lang.String getSecurityWebServiceAddress() {
        return SecurityWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SecurityWebServiceWSDDServiceName = "SecurityWebService";

    public java.lang.String getSecurityWebServiceWSDDServiceName() {
        return SecurityWebServiceWSDDServiceName;
    }

    public void setSecurityWebServiceWSDDServiceName(java.lang.String name) {
        SecurityWebServiceWSDDServiceName = name;
    }

    public com.polarion.alm.ws.client.security.SecurityWebService getSecurityWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SecurityWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSecurityWebService(endpoint);
    }

    public com.polarion.alm.ws.client.security.SecurityWebService getSecurityWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.polarion.alm.ws.client.security.SecurityWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.security.SecurityWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSecurityWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSecurityWebServiceEndpointAddress(java.lang.String address) {
        SecurityWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.polarion.alm.ws.client.security.SecurityWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.polarion.alm.ws.client.security.SecurityWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.security.SecurityWebServiceSoapBindingStub(new java.net.URL(SecurityWebService_address), this);
                _stub.setPortName(getSecurityWebServiceWSDDServiceName());
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
        if ("SecurityWebService".equals(inputPortName)) {
            return getSecurityWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService", "SecurityWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService", "SecurityWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SecurityWebService".equals(portName)) {
            setSecurityWebServiceEndpointAddress(address);
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
