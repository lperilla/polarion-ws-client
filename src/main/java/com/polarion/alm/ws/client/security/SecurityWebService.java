/**
 * SecurityWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.security;

public interface SecurityWebService extends java.rmi.Remote {

    /**
     * Checks if the current user can add elements to the collection
     * at given key of the object.
     * @param uri the uri of the object.
     * @param key the key of the field that contains the collection.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canAddElementToKey(java.lang.String uri, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can create instances of the given
     * prototype.
     * @param prototype the prototype of the objects.
     * @param projectId the id of the project to check the permission in,
     * {@code null} to check global permissions.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canCreateInstances(java.lang.String prototype, java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can delete the given object.
     * @param uri the uri of the object.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canDeleteInstance(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can modify the given object.
     * @param uri the uri of the object.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canModifyInstance(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can modify the field with given
     * key of the object.
     * @param uri the uri of the object.
     * @param key the key of the field.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canModifyKey(java.lang.String uri, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can read the given object.
     * @param uri the uri of the object.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canReadInstance(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can read the field with given key
     * of the object.
     * @param uri the uri of the object.
     * @param key the key of the field.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canReadKey(java.lang.String uri, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Checks if the current user can remove elements from the collection
     * at given key of the object.
     * @param uri the uri of the object.
     * @param key the key of the field that contains the collection.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean canRemoveElementFromKey(java.lang.String uri, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Returns the context (project) roles for the given location.
     * @param location the location of the context (project/project group)
     * @return an array containing the roles
     */
    public java.lang.String[] getContextRoles(java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns the context roles for the given usser at the spcified
     * location.
     * @param userId the id of the user to get the roles for
     * @param location the location of the context (project/project group)
     * @return an array containing the roles
     */
    public java.lang.String[] getContextRolesForUser(java.lang.String userId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns all global roles.
     * @return an array containing the roles
     */
    public java.lang.String[] getGlobalRoles() throws java.rmi.RemoteException;

    /**
     * Returns the location of the object with the specified uri.
     * In the context of this service the method should be used to get the
     * location of a project(-group).
     * @param uri the uri of the object to get the location from
     * @return a String representing the location (currently this is default:[path],
     * e.g. default:/my-project)
     */
    public java.lang.String getLocationForURI(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Returns the the product license.
     * @return the product license.
     * @since 3.5.0
     */
    public com.polarion.alm.ws.client.types.security.ProductLicense getProductLicense() throws java.rmi.RemoteException;

    /**
     * Returns all global and context roles for the context at given
     * location assigned to the user.
     * @param userId the id of the user to get the roles for
     * @param location the location of the context (project/project group),
     * pass null to get global roles
     * @return an array containing the roles
     */
    public java.lang.String[] getRolesForUser(java.lang.String userId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns the username of the user that has the assigned token.
     * @param token
     * @return username or null, if no user has this token
     * @since 3.8.0
     */
    public java.lang.String getUserFromToken(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Checks if given permission is granted to the current user.
     * @param permission the permission to check.
     * @param projectId the id of the project to check the permission in,
     * {@code null} to check global permissions.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean hasCurrentUserPermission(java.lang.String permission, java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Checks if given permission is granted to the specified user.
     * @param userId the id of the user to check the permission for.
     * @param permission the permission to check.
     * @param projectId the id of the project to check the permission in,
     * {@code null} to check global permissions.
     * @return {@code true} if the permission is granted.
     * @since 3.4.3
     */
    public boolean hasPermission(java.lang.String userId, java.lang.String permission, java.lang.String projectId) throws java.rmi.RemoteException;
}
