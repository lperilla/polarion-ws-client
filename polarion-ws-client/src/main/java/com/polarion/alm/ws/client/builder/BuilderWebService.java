/**
 * BuilderWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.builder;

public interface BuilderWebService extends java.rmi.Remote {

    /**
     * Gets all builds from Polarion
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.builder.Build[] getAllBuilds() throws java.rmi.RemoteException;

    /**
     * Gets a build.
     * @param project the project of the builds to get.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.builder.Build[] getBuilds(com.polarion.alm.ws.client.types.projects.Project project) throws java.rmi.RemoteException;

    /**
     * Query for build.
     * @param project where query to be used.
     * @param query the lucene query to be used.
     * @param sort the field to be used for sorting.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.builder.Build[] queryBuilds(com.polarion.alm.ws.client.types.projects.Project project, java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException;
}
