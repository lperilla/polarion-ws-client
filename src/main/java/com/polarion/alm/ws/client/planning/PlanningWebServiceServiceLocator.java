/**
 * PlanningWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.planning;

public class PlanningWebServiceServiceLocator extends org.apache.axis.client.Service implements com.polarion.alm.ws.client.planning.PlanningWebServiceService {

/**
 * This service provides access to Polarion's Plan feature
 */

    public PlanningWebServiceServiceLocator() {
    }


    public PlanningWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PlanningWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PlanningWebService
    private java.lang.String PlanningWebService_address = "http://localhost:8888/polarion/ws/services/PlanningWebService";

    public java.lang.String getPlanningWebServiceAddress() {
        return PlanningWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PlanningWebServiceWSDDServiceName = "PlanningWebService";

    public java.lang.String getPlanningWebServiceWSDDServiceName() {
        return PlanningWebServiceWSDDServiceName;
    }

    public void setPlanningWebServiceWSDDServiceName(java.lang.String name) {
        PlanningWebServiceWSDDServiceName = name;
    }

    public com.polarion.alm.ws.client.planning.PlanningWebService getPlanningWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PlanningWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPlanningWebService(endpoint);
    }

    public com.polarion.alm.ws.client.planning.PlanningWebService getPlanningWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.polarion.alm.ws.client.planning.PlanningWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.planning.PlanningWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPlanningWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPlanningWebServiceEndpointAddress(java.lang.String address) {
        PlanningWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.polarion.alm.ws.client.planning.PlanningWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.polarion.alm.ws.client.planning.PlanningWebServiceSoapBindingStub _stub = new com.polarion.alm.ws.client.planning.PlanningWebServiceSoapBindingStub(new java.net.URL(PlanningWebService_address), this);
                _stub.setPortName(getPlanningWebServiceWSDDServiceName());
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
        if ("PlanningWebService".equals(inputPortName)) {
            return getPlanningWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService", "PlanningWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService", "PlanningWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PlanningWebService".equals(portName)) {
            setPlanningWebServiceEndpointAddress(address);
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
