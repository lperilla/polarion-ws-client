/**
 * BuilderWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.builder;

public interface BuilderWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides build related functionality.
 */
    public java.lang.String getBuilderWebServiceAddress();

    public com.polarion.alm.ws.client.builder.BuilderWebService getBuilderWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.builder.BuilderWebService getBuilderWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
