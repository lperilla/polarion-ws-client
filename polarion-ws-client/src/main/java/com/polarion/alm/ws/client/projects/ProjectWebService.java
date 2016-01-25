/**
 * ProjectWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.projects;

public interface ProjectWebService extends java.rmi.Remote {

    /**
     * Create a user.
     * @param loginName the login of the user for creation.
     * @since 3.2.3
     */
    public com.polarion.alm.ws.client.types.projects.User createUser(java.lang.String in0) throws java.rmi.RemoteException;

    /**
     * Gets all project groups located directly below a project group.
     * @param projectGroupURI the URI of the project to get all project groups
     * for.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.ProjectGroup[] getContainedGroups(java.lang.String projectGroupURI) throws java.rmi.RemoteException;

    /**
     * Gets all projects located directly below a project group.
     * @param projectGroupURI the URI of the project to get all projects
     * for.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.Project[] getContainedProjects(java.lang.String projectGroupURI) throws java.rmi.RemoteException;

    /**
     * Gets all projects located below a project group.
     * @param projectGroupURI the URI of the project to get all projects
     * for.
     */
    public com.polarion.alm.ws.client.types.projects.Project[] getDeepContainedProjects(java.lang.String projectGroupURI) throws java.rmi.RemoteException;

    /**
     * Gets a project.
     * @param projectID the ID of the project to get.
     */
    public com.polarion.alm.ws.client.types.projects.Project getProject(java.lang.String projectID) throws java.rmi.RemoteException;

    /**
     * Gets a project at given location.
     * @param location repository location
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.Project getProjectAtLocation(java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Gets a project.
     * @param projectURI the URI of the project to get.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.Project getProjectByURI(java.lang.String projectURI) throws java.rmi.RemoteException;

    /**
     * Gets a project group.
     * @param projectGroupURI the URI of the project group to get.
     */
    public com.polarion.alm.ws.client.types.projects.ProjectGroup getProjectGroup(java.lang.String projectGroupURI) throws java.rmi.RemoteException;

    /**
     * Gets a project group at given location.
     * @param location repository location
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.ProjectGroup getProjectGroupAtLocation(java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Gets users of a project.
     * @param projectID the ID of the projects to get the users for.
     */
    public com.polarion.alm.ws.client.types.projects.User[] getProjectUsers(java.lang.String projectID) throws java.rmi.RemoteException;

    /**
     * Gets the root project group.
     */
    public com.polarion.alm.ws.client.types.projects.ProjectGroup getRootProjectGroup() throws java.rmi.RemoteException;

    /**
     * Gets a user.
     * @param userID the ID of the user to get.
     */
    public com.polarion.alm.ws.client.types.projects.User getUser(java.lang.String userID) throws java.rmi.RemoteException;

    /**
     * Gets a user Avatar URL. It can be absolute, or relative to
     * portal base URL.
     * @param userURI the ID of the user (name of the argument is wrong)
     * @since 3.6.0
     */
    public java.lang.String getUserAvatarURL(java.lang.String userURI) throws java.rmi.RemoteException;

    /**
     * Gets an user.
     * @param userURI user's URI.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.User getUserByUri(java.lang.String userURI) throws java.rmi.RemoteException;

    /**
     * Gets all users.
     * @since 3.3
     */
    public com.polarion.alm.ws.client.types.projects.User[] getUsers() throws java.rmi.RemoteException;

    /**
     * Update a user.
     * @param user the user for update.
     * @since 3.2.3
     */
    public void updateUser(com.polarion.alm.ws.client.types.projects.User in0) throws java.rmi.RemoteException;
}
