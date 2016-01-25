/**
 * PlanningWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.planning;

public interface PlanningWebService extends java.rmi.Remote {

    /**
     * Adds specified work item type to allowed types in Plan.
     * @param uri URI of the Plan (not null)
     * @param workItemType work item type to add (not null)
     * @since 3.9.0
     */
    public void addPlanAllowedType(java.lang.String uri, com.polarion.alm.ws.client.types.tracker.EnumOptionId workItemType) throws java.rmi.RemoteException;

    /**
     * Adds plan records to the plan
     * @param uri the SubterraURI of the plan to add the items to
     * @param items an array containing the uris of all the work items to
     * be added	
     * @since 3.8.0
     */
    public void addPlanItems(java.lang.String uri, java.lang.String[] items) throws java.rmi.RemoteException;

    /**
     * Adds specified Project to project span of the Plan.
     * @param uri URI of the Plan (not null)
     * @param projectId project ID (not null)
     * @since 3.9.0
     */
    public void addProjectToPlanProjectSpan(java.lang.String uri, java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Creates a new plan
     * @param projectId The project the plan will be created in 
     * @param name The name of the plan
     * @param id The id of the plan
     * @param parentId The id of the parent plan (can be null)
     * @param templateId The id of the template used for this plan
     * @return URI of the created plan.
     * @since 3.8.0
     */
    public java.lang.String createPlan(java.lang.String projectId, java.lang.String name, java.lang.String id, java.lang.String parentId, java.lang.String templateId) throws java.rmi.RemoteException;

    /**
     * Creates a new plan template
     * @param projectId The project the plan template will be created in
     * 
     * @param name The name of the plan
     * @param id The id of the plan
     * @param templateId The id of the template used for this template (can
     * be null)
     * @return URI of the created plan.
     * @since 3.8.0
     */
    public java.lang.String createPlanTemplate(java.lang.String projectId, java.lang.String name, java.lang.String id, java.lang.String templateId) throws java.rmi.RemoteException;

    /**
     * Delete plans
     * @param projectId the project the plans will be deleted in
     * @param ids the array of ids to be deleted
     * @since 3.8.0
     */
    public void deletePlans(java.lang.String projectId, java.lang.String[] ids) throws java.rmi.RemoteException;

    /**
     * Returns a specific plan
     * @param projectId ID of the project that contains the specific plan
     * @param id ID of the plan
     * @return the plan
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan getPlanById(java.lang.String projectId, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * Returns a specific plan
     * @param uri the SubterraURI of the plan to load
     * @return the plan
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan getPlanByUri(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Get statistics of the plan
     * @param uri the SubterraURI of the plan to get the statistics from
     * @return the statistics of plan with given SubterraURI 	
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.PlanStatistics getPlanStatistics(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Returns the wiki content of plan with given uri
     * @param uri the SubterraURI of the plan
     * @return the wikipage content of the plan with given id
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.Text getPlanWikiContent(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Removes all occurrences of specified work item type from allowed
     * types in Plan.
     * @param uri URI of the Plan (not null)
     * @param workItemType work item type to remove (not null)
     * @since 3.9.0
     */
    public void removePlanAllowedType(java.lang.String uri, com.polarion.alm.ws.client.types.tracker.EnumOptionId workItemType) throws java.rmi.RemoteException;

    /**
     * Remove plan records to the plan
     * @param uri the SubterraURI of the plan to delete the items from
     * @param items an array containing the uris of all the work items to
     * be removed
     * @since 3.8.0
     */
    public void removePlanItems(java.lang.String uri, java.lang.String[] items) throws java.rmi.RemoteException;

    /**
     * Removes all occurrences of specified Project from project span
     * of the Plan.
     * @param uri URI of the Plan (not null)
     * @param projectId project ID (not null)
     * @since 3.9.0
     */
    public void removeProjectFromPlanProjectSpan(java.lang.String uri, java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Search plan templates.
     * @param query the query used to find plan templates (can be null)
     * @param sort the field used to sort the result (can be null)
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found plan templates.
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlanTemplates(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Search plan templates with only fields specified filled with
     * values. All other fields are not transmitted.
     * @param query the query used to find plan templates (can be null)
     * @param sort the field used to sort the result (can be null)
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @param fields plan template fields that should be initialized, all
     * other fields will be {@code null}.
     * @return the found plan templates with filled specified fields.
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlanTemplatesWithFields(java.lang.String query, java.lang.String sort, int resultsLimit, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Search plans.
     * @param query the query used to find plans (can be null)
     * @param sort the field used to sort the result (can be null)
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found plans.
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlans(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Search plans with only fields specified filled with values.
     * All other fields are not transmitted.
     * @param query the query used to find plans (can be null)
     * @param sort the field used to sort the result (can be null)
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @param fields plan fields that should be initialized, all other fields
     * will be {@code null}.
     * @return the found plans with filled specified fields.
     * @since 3.8.0
     */
    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlansWithFields(java.lang.String query, java.lang.String sort, int resultsLimit, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Sets the wiki content of plan with given uri
     * @param uri the SubterraURI of the plan
     * @param text the new content for plans wikipage
     * @since 3.8.0
     */
    public void setPlanWikiContent(java.lang.String uri, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException;

    /**
     * Updates a plan.
     * @param content a plan object containing the updates, the content must
     * contain the uri of the plan to be update
     * or else the update will fail
     * @since 3.8.0
     */
    public void updatePlan(com.polarion.alm.ws.client.types.planning.Plan content) throws java.rmi.RemoteException;

    /**
     * Checks if the plan was started
     * @param uri the SubterraURI of the plan
     * @return true if plan exists and is started, false otherwise 	
     * @since 3.8.0
     */
    public boolean wasPlanStarted(java.lang.String uri) throws java.rmi.RemoteException;
}
