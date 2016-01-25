/**
 * TrackerWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.tracker;

public interface TrackerWebServiceService extends javax.xml.rpc.Service {

/**
 * This service provides tracker related functionallity.
 */
    public java.lang.String getTrackerWebServiceAddress();

    public com.polarion.alm.ws.client.tracker.TrackerWebService getTrackerWebService() throws javax.xml.rpc.ServiceException;

    public com.polarion.alm.ws.client.tracker.TrackerWebService getTrackerWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
