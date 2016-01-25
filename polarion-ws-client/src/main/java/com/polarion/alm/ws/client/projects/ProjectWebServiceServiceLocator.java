/**
 * ProjectWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.projects;

public class ProjectWebServiceServiceLocator extends org.apache.axis.client.Service implements com.polarion.alm.ws.client.projects.ProjectWebServiceService {

/**
 * This service provides functionallity to get information
 *       related to projects.
 */

    public ProjectWebServiceServiceLocator() {
    }


    public ProjectWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProjectWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProjectWebService
    private java.lang.String ProjectWebService_address = "http://localhost:8888/polarion/ws/services/ProjectWebService";

    public java.lang.String getProjectWebServiceAddress() {
        return ProjectWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProjectWebServiceWSDDServiceName = "ProjectWebService";

    public java.lang.String getProjectWebServiceWSDDServiceName() {
        return ProjectWebServiceWSDDServiceName;
    }

    public void setProjectWebServiceWSDDServiceName(java.lang.String name) {
        ProjectWebServiceWSDDServiceName = name;
    }

    public com.polarion.alm.ws.client.projects.ProjectWebService getProjectWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProjectWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProjectWebService(endpoint);
    }

    public com.polarion.alm.ws.client.projects.ProjectWebService getProjectWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.polarion.alm.ws.client.projects.ProjectWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.projects.ProjectWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getProjectWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProjectWebServiceEndpointAddress(java.lang.String address) {
        ProjectWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.polarion.alm.ws.client.projects.ProjectWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.polarion.alm.ws.client.projects.ProjectWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.projects.ProjectWebServiceSoapBindingStub(new java.net.URL(ProjectWebService_address), this);
                _stub.setPortName(getProjectWebServiceWSDDServiceName());
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
        if ("ProjectWebService".equals(inputPortName)) {
            return getProjectWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService", "ProjectWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService", "ProjectWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProjectWebService".equals(portName)) {
            setProjectWebServiceEndpointAddress(address);
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
