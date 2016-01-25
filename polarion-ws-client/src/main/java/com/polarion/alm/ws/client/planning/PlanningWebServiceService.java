/**
 * PlanningWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.planning;

public interface PlanningWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides access to Polarion's Plan feature
 */
    public java.lang.String getPlanningWebServiceAddress();

    public com.polarion.alm.ws.client.planning.PlanningWebService getPlanningWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.planning.PlanningWebService getPlanningWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
