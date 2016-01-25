/**
 * SessionWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.session;

public interface SessionWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides functionallity that is related to the
 *       current session of the webservice.
 */
    public java.lang.String getSessionWebServiceAddress();

    public com.polarion.alm.ws.client.session.SessionWebService getSessionWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.session.SessionWebService getSessionWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
