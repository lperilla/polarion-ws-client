/**
 * ProjectWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.projects;

public interface ProjectWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides functionallity to get information
 *       related to projects.
 */
    public java.lang.String getProjectWebServiceAddress();

    public com.polarion.alm.ws.client.projects.ProjectWebService getProjectWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.projects.ProjectWebService getProjectWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
