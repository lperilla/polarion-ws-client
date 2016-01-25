/**
 * SecurityWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.security;

public interface SecurityWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides scurity related information.
 */
    public java.lang.String getSecurityWebServiceAddress();

    public com.polarion.alm.ws.client.security.SecurityWebService getSecurityWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.security.SecurityWebService getSecurityWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
