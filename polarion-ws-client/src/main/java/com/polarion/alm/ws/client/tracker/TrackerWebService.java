/**
 * TrackerWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.tracker;

public interface TrackerWebService extends java.rmi.Remote {

    /**
     * Adds an approvee.
     * @param workitemURI the URI of the work item to add the approvee to.
     * @param approveeId the id of the user to add as approvee.
     */
    public void addApprovee(java.lang.String workitemURI, java.lang.String approveeId) throws java.rmi.RemoteException;

    /**
     * Adds an assignee.
     * @param workitemURI the URI of the work item to add the assignee to.
     * @param assigneeId the id of the user to add as assignee.
     */
    public boolean addAssignee(java.lang.String workitemURI, java.lang.String assigneeId) throws java.rmi.RemoteException;

    /**
     * Adds a category to a work item.
     * @param workitemURI the URI of the work item to add the category to.
     * @param categoryId the ID of the category to add.
     */
    public boolean addCategory(java.lang.String workitemURI, java.lang.String categoryId) throws java.rmi.RemoteException;

    /**
     * Adds comment to Activity.
     * @param activityGlobalId global ID of Activity (not null)
     * @param commentText text of comment (not null)
     * @since 3.7.0
     */
    public void addCommentToActivity(java.lang.String activityGlobalId, com.polarion.alm.ws.client.types.Text commentText) throws java.rmi.RemoteException;

    /**
     * Links a revision from external repository.
     * @param workitemURI the URI of the work item to add the revision to.
     * @param repositoryName the ID of the external repository.
     * @param revisionId the ID of the revision to add.
     * @since 3.5.1
     */
    public boolean addExternalLinkedRevision(java.lang.String workitemURI, java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException;

    /**
     * Adds an external linked work item. 
     * @param workitemURI the URI of the work item to add the link to.
     * @param linkedExternalWorkitemURI the URI of the target external work
     * item the link points to.
     * @param role the role of the link to add.
     * @since 3.5.0
     */
    public boolean addExternallyLinkedItem(java.lang.String workitemURI, java.lang.String linkedExternalWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException;

    /**
     * Adds a hyperlink.
     * @param workitemURI the URI of the work item to add the hyperlink to.
     * @param url the url of the hyperlink to add.
     * @param role the role of the hyperlink to add.
     */
    public boolean addHyperlink(java.lang.String workitemURI, java.lang.String url, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException;

    /**
     * Adds a linked work item. 
     * @param workitemURI the URI of the work item to add the link to.
     * @param linkedWorkitemURI the URI of the target work item the link
     * points to.
     * @param role the role of the link to add.
     */
    public boolean addLinkedItem(java.lang.String workitemURI, java.lang.String linkedWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException;

    /**
     * Adds linked item to specific work item with revision.
     * @param workitemURI the URI of the work item to add link to.
     * @param linkedWorkitemURI the URI of the target work item the link
     * points to.
     * @param role the role of the linked item to add.
     * @param revision specific revision for linked item (null means HEAD
     * revision)
     * @param suspect true if the link should be marked with suspect flag
     * @since 3.4.3
     */
    public boolean addLinkedItemWithRev(java.lang.String in0, java.lang.String in1, com.polarion.alm.ws.client.types.tracker.EnumOptionId in2, java.lang.String in3, boolean in4) throws java.rmi.RemoteException;

    /**
     * Links a revision.
     * @param workitemURI the URI of the work item to add the revision to.
     * @param revisionId the ID of the revision to add.
     */
    public boolean addLinkedRevision(java.lang.String workitemURI, java.lang.String revisionId) throws java.rmi.RemoteException;

    /**
     * Adds a planing constraint.
     * @param workitemURI the URI of the work item to add the planning constraint
     * to.
     * @param date the date of the planning constraint to add.
     * @param constraint the type of constraint to add.
     */
    public boolean addPlaningContraint(java.lang.String workitemURI, java.util.Calendar date, com.polarion.alm.ws.client.types.tracker.EnumOptionId constraint) throws java.rmi.RemoteException;

    /**
     * Returns true if Activity allows commenting.
     * @param activityGlobalId global ID of Activity (not null)
     * @return true if activity allows commenting else false 
     * @since 3.7.0
     */
    public boolean canCommentActivity(java.lang.String activityGlobalId) throws java.rmi.RemoteException;

    /**
     * Returns true if current User can comment Activity.
     * @param activityGlobalId global ID of Activity (not null)
     * @return true if current user can comment activity else false 
     * @since 3.7.0
     */
    public boolean canCurrentUserAddCommentToActivity(java.lang.String activityGlobalId) throws java.rmi.RemoteException;

    /**
     * Creates a new attachment.
     * @param workitemURI the URI of the work item to add the attachment
     * to.
     * @param fileName the fileName of the attachment.
     * @param title the title of the attachment.
     * @param data the content of the attachment.
     * @since 3.3.1
     */
    public void createAttachment(java.lang.String workitemURI, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Creates Baseline from head or particular revision.
     * @param projectId project id (not null)
     * @param name baseline name (not null)
     * @param description baseline description (can be null)
     * @param revision revision or null value for head revision
     * @return created Baseline
     * @since 3.7.1
     */
    public com.polarion.alm.ws.client.types.tracker.Baseline createBaseline(java.lang.String projectId, java.lang.String name, java.lang.String description, java.lang.String revision) throws java.rmi.RemoteException;

    /**
     * Creates a comment.
     * @param workitemURI the URI of the work item to create a comment for.
     * @param content the content of the comment to create.
     */
    public void createComment(java.lang.String workitemURI, com.polarion.alm.ws.client.types.Text content) throws java.rmi.RemoteException;

    /**
     * Creates a comment.
     * @param parentURI the URI of the parent item (either a work item or
     * another comment) to create the comment for.
     * @param title the title of the comment.
     * @param content the content of the comment to create.
     * @param visibleTo hats this comment should be visible to.
     * @since 3.1.2
     */
    public java.lang.String createCommentNew(java.lang.String parentURI, java.lang.String title, com.polarion.alm.ws.client.types.Text content, java.lang.String[] visibleTo) throws java.rmi.RemoteException;

    /**
     * Creates a Document in given location with given parameters.
     * @param projectId project id (not null)
     * @param location document space location with one component or null
     * for default space (can be null)
     * @param documentName Document name (not null)
     * @param documentTitle Document title (can be null)
     * @param allowedWITypes one type can be specified  (can be null)
     * @param structureLinkRole role which defines the hierarchy of work
     * items inside the Document (not null)
     * @param homePageContent HTML markup for document home page (can be
     * null)
     * @return URI of created Document
     * @since 3.8.2
     */
    public java.lang.String createDocument(java.lang.String projectId, java.lang.String location, java.lang.String documentName, java.lang.String documentTitle, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes, com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole, java.lang.String homePageContent) throws java.rmi.RemoteException;

    /**
     * Creates unreferenced Comment in Document.
     * @param documentURI Document SubterraURI
     * @param text text of comment
     * @return SubterraURI of new created Comment
     * @since 3.7.0
     */
    public java.lang.String createDocumentComment(java.lang.String documentURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException;

    /**
     * Creates Comment referring WorkItem in Document.
     * @param documentURI document SubterraURI
     * @param workItemURI workItem SubterraURI
     * @param text text of comment
     * @return SubterraURI of new created Comment
     * @since 3.7.0
     */
    public java.lang.String createDocumentCommentReferringWI(java.lang.String documentURI, java.lang.String workItemURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException;

    /**
     * Creates Comment as reply to given parent Comment in Document.
     * @param parentURI parent Comment SubterraURI
     * @param text text of Comment
     * @return SubterraURI of new created Comment
     * @since 3.7.0
     */
    public java.lang.String createDocumentCommentReply(java.lang.String parentURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException;

    /**
     * Creates a document or an old-style Module/Document in given
     * location with given parameters.
     * @param projectId project id
     * @param location document space location with one component (e.g. "_default"
     * for default space) or null for old-style Modules
     * @param moduleName Document/Module name
     * @param allowedWITypes exactly one type must be specified
     * @param structureLinkRole required, role which defines the hierarchy
     * of work items inside the Module/Document
     * @param parentToChild always false
     * @param homePageContent HTML markup for document home page or Wiki
     * markup of old-style Module home page or null if default is OK
     * @return URI of created Module/Document
     * @since 3.4.1
     */
    public java.lang.String createModule(java.lang.String projectId, java.lang.String location, java.lang.String moduleName, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes, com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole, boolean parentToChild, java.lang.String homePageContent) throws java.rmi.RemoteException;

    /**
     * Creates a new work item with the given content.
     * The project and the type have to be set for the workitem for the creation
     * to succeed.
     * The uri MUST NOT be set otherwise the creation will fail. 
     * To create a work item in a specific location e.g. a LiveDoc set the
     * location of the work item to the desired target location.
     * To create a work item in a specific Module/Document set the Module/Document
     * of the work item to the desired target Module/Document.
     * @param content the content of the work item to be created.
     */
    public java.lang.String createWorkItem(com.polarion.alm.ws.client.types.tracker.WorkItem content) throws java.rmi.RemoteException;

    /**
     * Creates work item on a specified position inside Module/Document.
     * @param moduleURI Module/Document URI
     * @param parentWorkItemURI URI of parent work item or null
     * @param workItem content of to-be-created work item
     * @return URI of created work item
     * @since 3.4.1
     */
    public java.lang.String createWorkItemInModule(java.lang.String moduleURI, java.lang.String parentWorkItemURI, com.polarion.alm.ws.client.types.tracker.WorkItem workItem) throws java.rmi.RemoteException;

    /**
     * Creates a work record.
     * @param workitemURI the URI of the work item to create a work record
     * for.
     * @param user the user for the work record.
     * @param date the date of the work record.
     * @param timeSpent the time spent for the work record.
     */
    public void createWorkRecord(java.lang.String workitemURI, com.polarion.alm.ws.client.types.projects.User user, java.util.Date date, java.lang.String timeSpent) throws java.rmi.RemoteException;

    /**
     * Creates a work record.
     * @param workitemURI the URI of the work item to create a work record
     * for.
     * @param user the user for the work record.
     * @param date the date of the work record.
     * @param type the type of the work record.
     * @param timeSpent the time spent for the work record.
     * @param comment work record comment.
     * @since 3.4.2
     */
    public void createWorkRecordWithTypeAndComment(java.lang.String workitemURI, com.polarion.alm.ws.client.types.projects.User user, java.util.Date date, com.polarion.alm.ws.client.types.tracker.EnumOptionId type, java.lang.String timeSpent, java.lang.String comment) throws java.rmi.RemoteException;

    /**
     * Remove an attachment.
     * @param workitemURI the URI of the work item containing the attachment
     * to be removed.
     * @param id the ID of the attachment to be removed.
     * @since 3.3.1
     */
    public void deleteAttachment(java.lang.String workitemURI, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * Deletes given Baseline.
     * @param baselineURI Baseline SubterraURI (not null)
     * @since 3.7.1
     */
    public void deleteBaseline(java.lang.String baselineURI) throws java.rmi.RemoteException;

    /**
     * Deletes Module/Document.
     * @param moduleURI URI of Module/Document
     * @since 3.4.1
     */
    public void deleteModule(java.lang.String moduleURI) throws java.rmi.RemoteException;

    /**
     * Deletes a work record.
     * @param workitemURI the URI of the work item to remove the work record
     * from.
     * @param workRecordURI the URI of the work record to remove.
     */
    public void deleteWorkRecord(java.lang.String workitemURI, java.lang.String workRecordURI) throws java.rmi.RemoteException;

    /**
     * Triggers auto suspect.
     * @param workitemURI the URI of the work item to trigger auto suspect
     * for.
     */
    public void doAutoSuspect(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Triggers autoassignement.
     * @param workitemURI the URI of the work item to trigger autoassignement
     * for.
     */
    public void doAutoassign(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Changes the status of an approval.
     * @param workitemURI the URI of the work item to execute the action
     * for.
     * @param approveeId the id of the approvee.
     * @param status the new status to set.
     */
    public void editApproval(java.lang.String workitemURI, java.lang.String approveeId, com.polarion.alm.ws.client.types.tracker.EnumOptionId status) throws java.rmi.RemoteException;

    /**
     * Gets history for the workitem.
     * @param workitemURI the URI of the work item to get the history for.
     * @param ignoredFields the fields which will be ignored (can be null).
     * @param fieldOrder order of fields (can be null).
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.tracker.Change[] generateHistory(java.lang.String workitemURI, java.lang.String[] ignoredFields, java.lang.String[] fieldOrder) throws java.rmi.RemoteException;

    /**
     * Returns Activity with given global ID.
     * @param activityGlobalId global ID of activity
     * @return the activity
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.Activity getActivityByGlobalId(java.lang.String activityGlobalId) throws java.rmi.RemoteException;

    /**
     * Gets all enumeration option IDs.
     * @param projectID the ID of the project to get the options for.
     * @param enumId the id of the enumeration to get the options for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllEnumOptionIdsForId(java.lang.String projectID, java.lang.String enumId) throws java.rmi.RemoteException;

    /**
     * Gets all enumeration option IDs.
     * @param projectID the ID of the project to get the options for.
     * @param key the key of the field containing enumeration to get the
     * option ID for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllEnumOptionIdsForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets all enumeration options.
     * @param projectID the ID of the project to get the options for.
     * @param enumID the id of the enumeration to get the options for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getAllEnumOptionsForId(java.lang.String projectID, java.lang.String enumID) throws java.rmi.RemoteException;

    /**
     * Gets all enumeration options.
     * @param projectID the ID of the project to get the options for.
     * @param key the key of the field containing enumeration to get the
     * options for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getAllEnumOptionsForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets all allowed approvers.
     * @param workitemURI the URI of the work item to get the allowed approvers
     * for.
     * @since 3.5.3
     */
    public com.polarion.alm.ws.client.types.projects.User[] getAllowedApprovers(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Gets all allowed assignees.
     * @param workitemURI the URI of the work item to get the allowed assignees
     * for.
     */
    public com.polarion.alm.ws.client.types.projects.User[] getAllowedAssignees(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Gets the actions that can be used on the workflow object in
     * its current state.
     * Conditions of the action are checked and those with failed condition(s)
     * are not returned.
     * NOTE: the parameter name {@code workitemURI} is kept for backward
     * compatibility,
     * but the specified URI can refer to any WorkflowObject, e.g. WorkItem
     * or Module.
     * @param workitemURI the URI of the WorkflowObject to get the available
     * actions from. (should not be {@code null})
     * @return the available actions
     * @throws IllegalArgumentException if parameter is {@code null} 
     * @see #performWorkflowAction(java.lang.String, int)
     * @see #getUnavailableActions(java.lang.String)
     */
    public com.polarion.alm.ws.client.types.tracker.WorkflowAction[] getAvailableActions(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration option IDs.
     * @param workitemURI the URI of the work item to get the enumeration
     * option IDs for.
     * @param enumID the id of the enumeration to get the option IDs for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAvailableEnumOptionIdsForId(java.lang.String workitemURI, java.lang.String enumID) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration option IDs.
     * @param workitemURI the URI of the work item to get the enumeration
     * option IDs for.
     * @param key the id of the enumeration to get the available option IDs
     * for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAvailableEnumOptionIdsForKey(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets the back linked work items, work items linking to the
     * specified work item.
     * @param workitemURI the URI of the work item to get the back links
     * for.
     */
    public com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] getBackLinkedWorkitems(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Get the categories defined for the give project id.
     */
    public com.polarion.alm.ws.client.types.tracker.Category[] getCategories(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets a custom field of a work item.
     * @param workitemURI the URI of the work item to get the custom field
     * from.
     * @param key the key of the custom field.
     */
    public com.polarion.alm.ws.client.types.tracker.CustomField getCustomField(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets the names of defined custom fields.
     * @param workitemURI the URI of the work item to get the defined custom
     * fields for.
     */
    public java.lang.String[] getCustomFieldKeys(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Gets a custom field definitions for a specific workitem.
     * @param workitemURI the URI of the workitem.
     * @param key key of the custom field.
     */
    public com.polarion.alm.ws.client.types.tracker.CustomFieldType getCustomFieldType(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets all custom field definitions for a specific workitem.
     * @param workitemURI the URI of the workitem.
     */
    public com.polarion.alm.ws.client.types.tracker.CustomFieldType[] getCustomFieldTypes(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Returns language definition for default language (mainly for
     * providing its label).
     * @param projectId project id (not null)
     * @return language definition or null if not defined
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition getDefaultLanguageDefinition(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets all custom field keys defined for a workitem type in a
     * project.
     * @param projectID the ID of the project.
     * @param typeID the workitem type ID.
     */
    public java.lang.String[] getDefinedCustomFieldKeys(java.lang.String projectID, java.lang.String typeID) throws java.rmi.RemoteException;

    /**
     * Gets a custom field definition for a workitem type.
     * @param projectID the ID of the project.
     * @param typeID the workitem type ID.
     * @param key key of the custom field.
     */
    public com.polarion.alm.ws.client.types.tracker.CustomFieldType getDefinedCustomFieldType(java.lang.String projectID, java.lang.String typeID, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets all custom field definitions for a workitem type.
     * @param projectID the ID of the project.
     * @param typeID the workitem type ID.
     */
    public com.polarion.alm.ws.client.types.tracker.CustomFieldType[] getDefinedCustomFieldTypes(java.lang.String projectID, java.lang.String typeID) throws java.rmi.RemoteException;

    /**
     * Gets the document locations (e.g. LiveDocuments) for a project.
     * @param projectId the ID of the projects to get the document locations
     * for.
     */
    public java.lang.String[] getDocumentLocations(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Returns Module/Document spaces from given project.
     * @param projectId project id (not null)
     * @return array of space ids (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] getDocumentSpaces(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets duration time in hours 
     * @param duration the string representation of the duration time.
     * @since 3.3.0
     */
    public float getDurationHours(java.lang.String duration) throws java.rmi.RemoteException;

    /**
     * Gets the enumeration control key for the specified work item
     * key.
     * @param projectID the ID of the project.
     * @param enumID the id of the enumeration to get the control key for.
     */
    public java.lang.String getEnumControlKeyForId(java.lang.String projectID, java.lang.String enumID) throws java.rmi.RemoteException;

    /**
     * Gets the enumeration control key for the specified work item
     * key.
     * @param projectID the ID of the project.
     * @param key the key of the field containing the enumeration to get
     * the control key for.
     */
    public java.lang.String getEnumControlKeyForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Returns instance of IEnumOption of given object URI and ID
     * of  enumeration.
     * @param uri SubterraURI (not null).
     * @param enumId the ID of the enumeration.
     * @return instance of IEnumOption (not null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForId(java.lang.String uri, java.lang.String enumId) throws java.rmi.RemoteException;

    /**
     * Returns instance of IEnumOption of given object URI, Prototype
     * name and key of prototype object.
     * @param uri SubterraURI (not null)
     * @param prototypeName the Prototype name
     * @param key of the given prototype object
     * @return instance of IEnumOption (not null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForKey(java.lang.String uri, java.lang.String prototypeName, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets a enumeration option.
     * @param workitemURI the URI of the work item to get the enumeration
     * option for.
     * @param enumID the ID of the enumeration.
     * @param id the enumeration option ID.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithEnumId(java.lang.String workitemURI, java.lang.String enumID, com.polarion.alm.ws.client.types.tracker.EnumOptionId id) throws java.rmi.RemoteException;

    /**
     * Gets a enumeration option.
     * @param workitemURI the URI of the work item to get the enumeration
     * option for.
     * @param key the key of the field containing the enumeration option
     * value.
     * @param id the enumeration option ID.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithKey(java.lang.String workitemURI, java.lang.String key, com.polarion.alm.ws.client.types.tracker.EnumOptionId id) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration options.
     * @param workitemURI the URI of the work item to get the enumeration
     * options for.
     * @param enumID the id of the enumeration to get the options for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForId(java.lang.String workitemURI, java.lang.String enumID) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration options.
     * The control value is the string representation of the work item value
     * at the field specified by the enumerations control key.
     * @see #getEnumControlKeyForKey
     * @see #getEnumControlKeyForId
     * @param projectID the ID of the project to get the options for.
     * @param enumID the id of the enumeration to get the options for.
     * @param controlValue the string representation of the control value.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForIdWithControl(java.lang.String projectID, java.lang.String enumID, java.lang.String controlValue) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration options.
     * @param workitemURI the URI of the work item to get the enumeration
     * options for.
     * @param key the key of the field containing enumeration to get the
     * options for.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForKey(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException;

    /**
     * Gets the available enumeration options.
     * The control value is the string representation of the work item value
     * at the field specified by the enumerations control key.
     * @see #getEnumControlKeyForKey
     * @see #getEnumControlKeyForId
     * @param projectID the ID of the project to get the options for.
     * @param key the key of the field containing enumeration to get the
     * options for.
     * @param controlValue the string representation of the control value.
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForKeyWithControl(java.lang.String projectID, java.lang.String key, java.lang.String controlValue) throws java.rmi.RemoteException;

    /**
     * Gets the filtered available enumeration options.
     * @param uri the URI of the peristent object to get the enumeration
     * options for (not null)
     * @param key the key of the field containing enumeration to get the
     * options for (not null)
     * @param filter id of the enumeration option to use as the "from" value
     * for the dependency mapping (can be null)
     * @since 3.8.1
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getFilteredEnumOptionsForKey(java.lang.String uri, java.lang.String key, java.lang.String filter) throws java.rmi.RemoteException;

    /**
     * Returns Folder specified by project and folder name.
     * @param projectId project id or null for Global 
     * @param folderName name of the folder (not null)
     * @return Folder from given Project or Global (not null)
     * @since 3.8.3
     */
    public com.polarion.alm.ws.client.types.tracker.Folder getFolder(java.lang.String projectId, java.lang.String folderName) throws java.rmi.RemoteException;

    /**
     * Returns Folder in which the specified object is contained.
     * The object must implement interface IFolderItem (e.g. Module) otherwise
     * returns null.
     * @param objectURI URI of object (not null)
     * @return Folder for specified object (can be null)
     * @since 3.8.3
     */
    public com.polarion.alm.ws.client.types.tracker.Folder getFolderForURI(java.lang.String objectURI) throws java.rmi.RemoteException;

    /**
     * Returns Folders from given Project or Global.
     * @param projectId project id or null for Global 
     * @return array of Folder contained within given Project or Global
     * @since 3.8.3
     */
    public com.polarion.alm.ws.client.types.tracker.Folder[] getFolders(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets the initial workflow action for the specified object,
     * 
     * returns {@code null} if there is no initial action for the corresponding
     * workflow.
     * NOTE: the parameter name {@code workitemURI} is kept for backward
     * compatibility,
     * but the specified URI can refer to any WorkflowObject, e.g. WorkItem
     * or Module.
     * @param workitemURI the URI of the WorkflowObject to get the available
     * actions from. (should not be {@code null})
     * @return the initial workflow action, {@code null} if no action is
     * configured.
     * @throws IllegalArgumentException if parameter is {@code null} 
     * @see #resetWorkflow(java.lang.String)
     * @since 3.4.3
     */
    public com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowAction(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Gets the initial workflow action for a specific work item type
     * in specific project.
     * @param projectId the ID of project to get workitem from.
     * @param wiType the type of the work item to get the available actions
     * from. (should not be {@code null})
     * @return the initial workflow action, {@code null} if no initial action
     * is configured.
     * @throws IllegalArgumentException if wiType is {@code null} 
     * @see #getInitialWorkflowAction(java.lang.String)
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowActionForProjectAndType(java.lang.String projectId, com.polarion.alm.ws.client.types.tracker.EnumOptionId wiType) throws java.rmi.RemoteException;

    /**
     * Returns language definition for given language.
     * @param projectId project id (not null)
     * @param language language id (not null)
     * @return language definition or null if not defined
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition getLanguageDefinition(java.lang.String projectId, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Returns all language definitions (does not include default
     * language definition).
     * @param projectId project id (not null)
     * @return all language definitions
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition[] getLanguageDefinitions(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Returns localized description or normal description if localized
     * one is not defined or is empty.
     * @param uri Work Item URI (not null)
     * @param language language id or null for default language
     * @return localized description (can be null)
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.Text getLocalizedWorkItemDescription(java.lang.String uri, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Returns id of the field of Work Item of given type which stores
     * localized description.
     * @param projectId project id (not null)
     * @param language language id (not null)
     * @param type Work Item type (not null)
     * @return id of the field or null if not defined
     * @since 3.6.1
     */
    public java.lang.String getLocalizedWorkItemDescriptionField(java.lang.String projectId, java.lang.String language, com.polarion.alm.ws.client.types.tracker.EnumOptionId type) throws java.rmi.RemoteException;

    /**
     * Returns localized title or normal title if localized one is
     * not defined or is empty.
     * @param uri Work Item URI (not null)
     * @param language language id or null for default language
     * @return localized title (can be null)
     * @since 3.6.1
     */
    public java.lang.String getLocalizedWorkItemTitle(java.lang.String uri, java.lang.String language) throws java.rmi.RemoteException;

    /**
     * Returns id of the field of Work Item of given type which stores
     * localized title.
     * @param projectId project id (not null)
     * @param language language id (not null)
     * @param type Work Item type (not null)
     * @return id of the field or null if not defined
     * @since 3.6.1
     */
    public java.lang.String getLocalizedWorkItemTitleField(java.lang.String projectId, java.lang.String language, com.polarion.alm.ws.client.types.tracker.EnumOptionId type) throws java.rmi.RemoteException;

    /**
     * Retrieves the Module/Document on the given location.
     * @param projectId project id
     * @param location encoded location of retrieved Module/Document - relative
     * to Module/Document root in the given project.
     * 	Use location with revision set to retrieve a particular revision
     * of the Module/Document.
     * @since 3.4.1
     */
    public com.polarion.alm.ws.client.types.tracker.Module getModuleByLocation(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Retrieves the Module/Document on the given location with given
     * fields set.
     * @param projectId project id
     * @param location encoded location of retrieved Module/Document - relative
     * to Module/Document root in the given project.
     * 	Use location with revision set to retrieve a particular revision
     * of the Module/Document.
     * @param fields fields to fill. For nested structures in the lists you
     * can use following syntax to include only subset of fields: myList.LIST.key
     * (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.4.1
     */
    public com.polarion.alm.ws.client.types.tracker.Module getModuleByLocationWithFields(java.lang.String projectId, java.lang.String location, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Gets Module/Document with all fields filled.
     * @param uri Module/Document URI
     * @since 3.4.1
     */
    public com.polarion.alm.ws.client.types.tracker.Module getModuleByUri(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Gets Module/Document with given fields filled.
     * @param uri Module/Document URI
     * @param fields fields to fill. For nested structures in the lists you
     * can use following syntax to include only subset of fields: myList.LIST.key
     * (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.4.1
     */
    public com.polarion.alm.ws.client.types.tracker.Module getModuleByUriWithFields(java.lang.String uri, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Returns Modules/Documents residing on the given location relative
     * to "modules" folder of the given project.
     * @param projectId project id (not null)
     * @param location serialized location relative to "modules" folder
     * @return array of Modules/Documents SubterraURIs (one Module/Document
     * SubterraURI if the location is the location of the Module/Document;
     * can be null)
     * @since 3.6.3
     */
    public java.lang.String[] getModuleUris(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns URIs of work item contained in given Module/Document
     * under given parent
     * (if specified).
     * @param moduleURI Module/Document URI
     * @param parentWorkItemURI URI of parent work item or null
     * @param deep true to return work items from the whole subtree
     * @since 3.4.1
     */
    public java.lang.String[] getModuleWorkItemUris(java.lang.String moduleURI, java.lang.String parentWorkItemURI, boolean deep) throws java.rmi.RemoteException;

    /**
     * Returns work items (with given fields set) contained in given
     * Module/Document under given parent
     * (if specified).
     * @param moduleURI Module/Document URI
     * @param parentWorkItemURI URI of parent work item or null
     * @param deep true to return work items from the whole subtree
     * @param fields fields to fill. For nested structures in the lists you
     * can use following syntax to include only subset of fields: myList.LIST.key
     * (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.4.1
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getModuleWorkItems(java.lang.String moduleURI, java.lang.String parentWorkItemURI, boolean deep, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Returns Modules/Documents residing on the given location relative
     * to "modules" folder of the given project.
     * @param projectId project id (not null)
     * @param location serialized location relative to "modules" folder
     * @return array of Modules/Documents (one Module/Document if the location
     * is the location of the Module/Document; can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] getModules(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns sub-folders of given location relative to "modules"
     * folder of the given project.
     * @param projectId project id (not null)
     * @param location serialized location relative to "modules" folder
     * @return array of serialized locations (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] getModulesSubFolders(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Returns Modules/Documents residing on the given location relative
     * to "modules" folder of the given project.
     * @param projectId project id (not null)
     * @param location serialized location relative to "modules" folder
     * @param fields array of field names to fill in the returned Modules/Documents
     * (can be null). For nested structures in the lists you can use following
     * syntax to include only subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @return array of Modules/Documents (one Module/Document if the location
     * is the location of the Module/Document; can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] getModulesWithFields(java.lang.String projectId, java.lang.String location, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Gets the length of one day
     * @since 3.2.3
     */
    public long getOneDayLength() throws java.rmi.RemoteException;

    /**
     * Gets a revision.
     * @param repositoryName repository name (pass "default" for default
     * repository).
     * @param revisionId revision name.
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.Revision getRevision(java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException;

    /**
     * Gets a revision.
     * @param revisionURI the URI of the revision.
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.Revision getRevisionByUri(java.lang.String revisionURI) throws java.rmi.RemoteException;

    /**
     * Returns all revisions for a specific uri.
     * @param uri the URI of the persistence object (Work Item, Module/Document,
     * User, etc).
     * @return all revisions for specific uri.
     * @since 3.4.3
     */
    public java.lang.String[] getRevisions(java.lang.String in0) throws java.rmi.RemoteException;

    /**
     * Gets time points available for a project.
     * @param projectId the ID of the projects to get the available time
     * points for.
     */
    public com.polarion.alm.ws.client.types.tracker.TimePoint[] getTimepoints(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets the actions that can not be used on the work item in the
     * current state
     * because of unsatisfied condition(s).
     * Conditions of the action are checked and those with failed condition(s)
     * are returned.
     * The reason of unavailability is returned by {@link com.polarion.alm.ws.client.types.tracker.WorkflowAction#getUnavailabilityMessage()}.
     * NOTE: the parameter name {@code workitemURI} is kept for backward
     * compatibility,
     * but the specified URI can refer to any WorkflowObject, e.g. WorkItem
     * or Module.
     * @param workitemURI the URI of the WorkflowObject to get the available
     * actions from. (should not be {@code null})
     * @return the unavailable actions
     * @throws IllegalArgumentException if parameter is {@code null} 
     * @see #performWorkflowAction(java.lang.String, int)
     * @see #getAvailableActions(java.lang.String)
     * @since 3.6.1
     */
    public com.polarion.alm.ws.client.types.tracker.WorkflowAction[] getUnavailableActions(java.lang.String workitemURI) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Page with given SubterraURI.
     * @param uri SubterraURI (not null)
     * @return Wiki Page (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUri(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Page with given SubterraURI.
     * @param uri SubterraURI (not null)
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @return Wiki Page (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriWithFields(java.lang.String uri, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Pages from given project and space.
     * @param projectId project id (not null)
     * @param spaceId space id (not null)
     * @return array of Wiki Pages SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] getWikiPageUris(java.lang.String projectId, java.lang.String spaceId) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Pages from given project and space.
     * @param projectId project id (not null)
     * @param spaceId space id (not null)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] getWikiPages(java.lang.String projectId, java.lang.String spaceId) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Pages from given project and space.
     * @param projectId project id (not null)
     * @param spaceId space id (not null)
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] getWikiPagesWithFields(java.lang.String projectId, java.lang.String spaceId, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Returns Wiki spaces from given project.
     * @param projectId project id (not null)
     * @return array of space ids (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] getWikiSpaces(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Gets a work item with all fields set.
     * @param projectId the ID of the project that contains the workitem
     * to get.
     * @param workitemId the ID of the work item to get.
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemById(java.lang.String projectId, java.lang.String workitemId) throws java.rmi.RemoteException;

    /**
     * Gets a work item with only the fields specified filled with
     * values. All other fields are not transmitted.
     * @param projectId the id of the project that contains the workitem
     * to get.
     * @param workitemId the id of the work item to get.
     * @param keys the fields of the work item to fill. For nested structures
     * in the lists you can use following syntax to include only subset of
     * fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByIdsWithFields(java.lang.String projectId, java.lang.String workitemId, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets a work item with all fields set.
     * @param uri the URI of the work item to get.
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUri(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Gets a work item in given revision with all fields set. 
     * Returns null if the work item did not exist in the revision.
     * @param uri the URI of the work item to get.
     * @param revision the revision of the work item to get.
     * @since 3.4.2
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevision(java.lang.String uri, java.lang.String revision) throws java.rmi.RemoteException;

    /**
     * Gets a work item in given revision with only the fields specified
     * filled with values. All other fields are not transmitted.
     * Returns null if the work item did not exist in the revision.
     * @param uri the URI of the work item to get.
     * @param revision the revision of the work item to get.
     * @param keys the fields of the work item to fill. For nested structures
     * in the lists you can use following syntax to include only subset of
     * fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.4.2
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevisionWithFields(java.lang.String uri, java.lang.String revision, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets a work item with only the fields specified filled with
     * values. All other fields are not transmitted.
     * @param uri the URI of the work item to get.
     * @param keys the fields of the work item to fill. For nested structures
     * in the lists you can use following syntax to include only subset of
     * fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriWithFields(java.lang.String uri, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Counts number of workitems returned by given query.
     * @param query the lucene query to be used. 
     * @since 3.3.0
     */
    public int getWorkItemsCount(java.lang.String query) throws java.rmi.RemoteException;

    /**
     * Gets work items linked to a revision.
     * @param revisionURI the URI of the revision.
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getWorkItemsLinkedToRevision(java.lang.String revisionURI) throws java.rmi.RemoteException;

    /**
     * Gets work items linked to a revision.
     * @param revisionURI the URI of the revision.
     * @param keys the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getWorkItemsLinkedToRevisionWithFields(java.lang.String revisionURI, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Returns true if History is available.
     * @return true if History is available else false
     * @since 3.7.1
     */
    public boolean isHistoryAvailable() throws java.rmi.RemoteException;

    /**
     * Checks if the comment is in a resolved comments thread.
     * @param commentURI the URI of the comment
     * @since 3.7.1
     */
    public boolean isResolvedComment(java.lang.String commentURI) throws java.rmi.RemoteException;

    /**
     * Returns all Activity Sources.
     * @return array of activity sources
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.ActivitySource[] listActivitySources() throws java.rmi.RemoteException;

    /**
     * Returns activities within default repository.
     * @param query Lucene query. (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.Activity[] listAllActivities(java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Returns global IDs of activities within default repository.
     * @param query Lucene query (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities global IDs
     * @since 3.7.0
     */
    public java.lang.String[] listAllActivitiesGlobalIds(java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Returns activities within given project group.
     * @param uri SubterraURI (not null)
     * @param query Lucene query (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.Activity[] listGroupActivities(java.lang.String uri, java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Returns global IDs of activities within given project group.
     * @param uri SubterraURI (not null)
     * @param query Lucene query (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities global IDs
     * @since 3.7.0
     */
    public java.lang.String[] listGroupActivitiesGlobalIds(java.lang.String uri, java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Returns activities within given project.
     * @param projectId ID of project (not null)
     * @param query Lucene query (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.Activity[] listProjectActivities(java.lang.String projectId, java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Returns global IDs of activities within given project.
     * @param projectId ID of project (not null)
     * @param query Lucene query (can be null)
     * @param count number of results (-1 means all results)
     * @return array of activities global IDs
     * @since 3.7.0
     */
    public java.lang.String[] listProjectActivitiesGlobalIds(java.lang.String projectId, java.lang.String query, int count) throws java.rmi.RemoteException;

    /**
     * Moves a work item to a specific position in a Document.
     *  If the work item is not yet inside the Document it will be moved
     * into the Document.
     *  Modules are also supported.
     * 	
     * @param workItemURI URI of the work item to be moved
     * 	
     * @param documentURI URI of the Document
     * 	
     * @param parentWorkItemURI URI of the parent work item or {@code null}
     * to insert it as root
     * 	
     * @param position desired position in the list of children or a value
     * < 0 to insert at the end (if the old and new parent is the same then
     * moved work item
     * is not counted)
     * 	
     * @param retainDocumentFlow {@code true} to retain the position of moved
     * work item in the document flow (even if it means to change the parent),
     * {@code false} to keep desired parent (even if it means to move work
     * item to different position)
     * 	
     * @since 3.7.0
     */
    public void moveWorkItemToDocument(java.lang.String workItemURI, java.lang.String documentURI, java.lang.String parentWorkItemURI, int position, boolean retainDocumentFlow) throws java.rmi.RemoteException;

    /**
     * Moves a work item to a specific position in a Module/Document.
     * If the work item is not yet inside the Module/Document it will be
     * moved into the Module/Document.
     *  Since 3.7.0 this no longer retains document flow, but keeps desired
     * parent.
     * 	
     * @param workItemURI URI of the work item to be moved
     * 	
     * @param moduleURI URI of the Module/Document
     * 	
     * @param parentWorkItemURI URI of the parent work item or {@code null}
     * to insert it as root
     * 	
     * @param position desired position in the list of children or a value
     * < 0 to insert at the end (if the old and new parent is the same then
     * moved work item
     * is not counted)
     * 	
     * @deprecated Use {@link #moveWorkItemToDocument(String, String, String,
     * int, boolean)}.
     * 	
     * @since 3.4.3
     */
    public void moveWorkItemToModule(java.lang.String workItemURI, java.lang.String moduleURI, java.lang.String parentWorkItemURI, int position) throws java.rmi.RemoteException;

    /**
     * Executes a workflow action. 
     * The actions that can be performed can be received by {@link #getAvailableActions(java.lang.String)}.
     * The workflow action is specified by {@link com.polarion.alm.ws.client.types.tracker.WorkflowAction#getActionId()}.
     * NOTE: the parameter name {@code workitemURI} is kept for backward
     * compatibility,
     * but the specified URI can refer to any WorkflowObject, e.g. WorkItem
     * or Module.
     * @param workitemURI the URI of the WorkflowObject to execute the action
     * for (should not be {@code null}).
     * @param actionId the id of the action to execute.
     * @throws IllegalArgumentException if workitemURI parameter is {@code
     * null} 
     * @see #getAvailableActions(java.lang.String)
     */
    public void performWorkflowAction(java.lang.String workitemURI, int actionId) throws java.rmi.RemoteException;

    /**
     * Queries for baselines.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @since 3.4.2
     */
    public com.polarion.alm.ws.client.types.tracker.Baseline[] queryBaselines(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Modules/Documents SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryModuleUris(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents.
     * @param sqlQuery SQL statement
     * @return array of Modules/Documents SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryModuleUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents in given baseline.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param baselineRevision baseline revision
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Modules/Documents SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryModuleUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents in given baseline.
     * @param sqlQuery SQL statement
     * @param baselineRevision baseline revision
     * @return array of Modules/Documents SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryModuleUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param fields array of field names to fill in the returned Modules/Documents
     * (can be null). For nested structures in the lists you can use following
     * syntax to include only subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Modules/Documents (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] queryModules(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents.
     * @param sqlQuery SQL statement
     * @param fields array of field names to fill in the returned Modules/Documents
     * (can be null). For nested structures in the lists you can use following
     * syntax to include only subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @return array of Modules/Documents (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents in given baseline.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param baselineRevision baseline revision
     * @param fields array of field names to fill in the returned Modules/Documents
     * (can be null). For nested structures in the lists you can use following
     * syntax to include only subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Modules/Documents (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Modules/Documents in given baseline.
     * @param sqlQuery SQL statement
     * @param baselineRevision baseline revision
     * @param fields array of field names to fill in the returned Modules/Documents
     * (can be null). For nested structures in the lists you can use following
     * syntax to include only subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @return array of Modules/Documents (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Queries for revisions.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param includeInternal whether internal Polarion commits should be
     * included.
     * @since 3.3.0
     */
    public java.lang.String[] queryRevisionUris(java.lang.String query, java.lang.String sort, boolean includeInternal) throws java.rmi.RemoteException;

    /**
     * Queries for revisions.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param fields the keys of the fields that should be filled.
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.Revision[] queryRevisions(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Wiki Pages SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryWikiPageUris(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages.
     * @param sqlQuery SQL statement
     * @return array of Wiki Pages SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryWikiPageUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages in given baseline.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param baselineRevision baseline revision
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Wiki Pages SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryWikiPageUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages in given baseline.
     * @param sqlQuery SQL statement
     * @param baselineRevision baseline revision
     * @return array of Wiki Pages SubterraURIs (can be null)
     * @since 3.6.3
     */
    public java.lang.String[] queryWikiPageUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPages(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages.
     * @param sqlQuery SQL statement
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages in given baseline.
     * @param query Lucene query (can be null)
     * @param sort Lucene sort string (can be null)
     * @param baselineRevision baseline revision
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @param resultsLimit how many results to return (-1 means everything)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Searches for Wiki Pages in given baseline.
     * @param sqlQuery SQL statement
     * @param baselineRevision baseline revision
     * @param fields array of field names to fill in the returned Wiki Pages
     * (can be null)
     * @return array of Wiki Pages (can be null)
     * @since 3.6.3
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Query the uris of a work items.
     * @param query the lucene query.
     * @param sort the key used to sort the result.
     */
    public java.lang.String[] queryWorkItemUris(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException;

    /**
     * Query the uris of a work items.
     * @param sqlQuery the SQL query.
     * @since 3.6.0
     */
    public java.lang.String[] queryWorkItemUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException;

    /**
     * Queries for work items URIs in baseline.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param baselineRevision the revision in which the work items should
     * be returned.
     * @since 3.6.0
     */
    public java.lang.String[] queryWorkItemUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision) throws java.rmi.RemoteException;

    /**
     * Searches for uris of work items in given baseline revision.
     * @param sqlQuery the SQL query.
     * @param baselineRevision the baseline revision in which the work items
     * should be returned.
     * @since 3.6.0
     */
    public java.lang.String[] queryWorkItemUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException;

    /**
     * Queries for work items URIs in baseline with given limit.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param baselineRevision the revision in which the work items should
     * be returned.
     * @param resultsLimit maximal returned number of workitems (-1 means
     * no limit)
     * @since 3.6.0
     */
    public java.lang.String[] queryWorkItemUrisInBaselineLimited(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Query the uris of a work items.
     * @param query the lucene query.
     * @param sort the key used to sort the result.
     * @param resultsLimit maximal returned number of workitems (-1 means
     * no limit)
     * @since 3.3.0
     */
    public java.lang.String[] queryWorkItemUrisLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Queries for work items.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItems(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Queries for work items.
     * @param sqlQuery the SQL query.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Queries for work items in baseline.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param baselineRevision the revision in which the work items should
     * be returned.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Searches for work items in given baseline revision.
     * @param sqlQuery the SQL query.
     * @param baselineRevision the baseline revision in which the work items
     * should be returned.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Queries for work items in baseline with given limit.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param baselineRevision the revision in which the work items should
     * be returned.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @param resultsLimit maximal returned number of workitems (-1 means
     * no limit)
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaselineLimited(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Queries for work items. The search is done in current state
     * of the work items, but the work items
     * are returned in the state of given revision. Work items that were
     * deleted since the revision are not returned.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param revision the revision in which the work items should be returned.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @since 3.4.2
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInRevision(java.lang.String query, java.lang.String sort, java.lang.String revision, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Queries for work items. The search is done in current state
     * of the work items, but the work items
     * are returned in the state of given revision. Work items that were
     * deleted since the revision are not returned.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param revision the revision in which the work items should be returned.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @param resultsLimit maximal returned number of workitems (-1 means
     * no limit)
     * @since 3.4.2
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInRevisionLimited(java.lang.String query, java.lang.String sort, java.lang.String revision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Queries for work items.
     * @param query the lucene query to be used. 
     * @param sort the field to be used for sorting.
     * @param fields the keys of the fields that should be filled. For nested
     * structures in the lists you can use following syntax to include only
     * subset of fields: myList.LIST.key (e.g. linkedWorkItems.LIST.role).
     * For custom fields you can specify which fields you want to be filled
     * using following syntax: customFields.CUSTOM_FIELD_ID (e.g. customFields.risk).
     * @param resultsLimit maximal returned number of workitems (-1 means
     * no limit)
     * @since 3.3.0
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Removes a approving user.
     * @param workitemURI the URI of the work item to remove the approvee
     * from.
     * @param approveeId the ID of the approving user to remove.
     */
    public void removeApprovee(java.lang.String workitemURI, java.lang.String approveeId) throws java.rmi.RemoteException;

    /**
     * Removes an assignee.
     * @param workitemURI the URI of the work item to remove the assignee
     * from.
     * @param assigneeId the id of the user to add as assignee.
     */
    public boolean removeAssignee(java.lang.String workitemURI, java.lang.String assigneeId) throws java.rmi.RemoteException;

    /**
     * Removes a category.
     * @param workitemURI the URI of the work item to remove the category
     * from.
     * @param categoryId the ID of the category to remove.
     */
    public boolean removeCategory(java.lang.String workitemURI, java.lang.String categoryId) throws java.rmi.RemoteException;

    /**
     * Removes a revision from external repository.
     * @param workitemURI the URI of the work item to remove the linked revision
     * from.
     * @param repositoryName the ID of the external repository.
     * @param revisionId the ID of the revision to remove.
     * @since 3.5.1
     */
    public boolean removeExternalLinkedRevision(java.lang.String workitemURI, java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException;

    /**
     * Removes an external linked item.
     * @param workitemURI the URI of the work item to remove the linked item
     * from.
     * @param linkedExternalWorkitemURI the uri of the linked item to remove.
     * @param role the role of the linked item to remove.
     * @since 3.5.0
     */
    public boolean removeExternallyLinkedItem(java.lang.String workitemURI, java.lang.String linkedExternalWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException;

    /**
     * Removes a hyperlink.
     * @param workitemURI the URI of the work item to remove the hyperlink
     * from.
     * @param url the url of the hyperlink to remove.
     */
    public boolean removeHyperlink(java.lang.String workitemURI, java.lang.String url) throws java.rmi.RemoteException;

    /**
     * Removes a linked item.
     * @param workitemURI the URI of the work item to remove the linked item
     * from.
     * @param linkedItemURI the uri of the linked item to remove.
     * @param role the role of the linked item to remove.
     */
    public boolean removeLinkedItem(java.lang.String workitemURI, java.lang.String linkedItemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException;

    /**
     * Removes a revision.
     * @param workitemURI the URI of the work item to remove the linked revision
     * from.
     * @param revisionId the ID of the revision to remove.
     */
    public boolean removeLinkedRevision(java.lang.String workitemURI, java.lang.String revisionId) throws java.rmi.RemoteException;

    /**
     * Removes a planing constraint.
     * @param workitemURI the URI of the work item to remove the planning
     * constraint from.
     * @param date the date of the planning constraint to remove.
     * @param constraint the type of constraint to remove.
     */
    public boolean removePlaningConstraint(java.lang.String workitemURI, java.util.Calendar date, com.polarion.alm.ws.client.types.tracker.EnumOptionId constraint) throws java.rmi.RemoteException;

    /**
     * Resets the workflow for the specified object.
     * Performs initial action if exists and sets the initial status.
     * @param workflowObjectURI the URI of the WorkflowObject (should not
     * be {@code null})
     * @throws IllegalArgumentException if parameter is {@code null} 
     * @since 3.8.1
     */
    public void resetWorkflow(java.lang.String workflowObjectURI) throws java.rmi.RemoteException;

    /**
     * Creates new Document based on existing Document.
     * @param sourceURI URI of source Document (not null)
     * @param targetProjectId target project id (not null)
     * @param targetLocation document space location with one component or
     * null for default space (can be null)
     * @param targetName target Document name (not null)
     * @param targetTitle target Document title (can be null)
     * @param updateTitleInDocument if true then the first founded title
     * in document will be change to value of targetTitle (if permissions
     * allow it).
     * @param linkRole role of links going from reused work item to source
     * work item or null to not create links unless
     * 	derivedFields are specified in which case links will be created with
     * default role  (can be null)
     * @param derivedFields fields which are derived from source Document
     * (see updateDerivedModule) (can be null)
     * @return URI of created Document
     * @since 3.8.2
     */
    public java.lang.String reuseDocument(java.lang.String sourceURI, java.lang.String targetProjectId, java.lang.String targetLocation, java.lang.String targetName, java.lang.String targetTitle, boolean updateTitleInDocument, com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole, java.lang.String[] derivedFields) throws java.rmi.RemoteException;

    /**
     * Creates new Module/Document based on existing Module/Document.
     * @param sourceURI URI of source Module/Document
     * @param targetProjectId target project id
     * @param targetLocation ignored
     * @param targetName target Module/Document name
     * @param linkRole role of links going from reused work item to source
     * work item or null to not create links unless
     * 	derivedFields are specified in which case links will be created with
     * default role
     * @param fields ignored
     * @param exceptFields ignored
     * @param derivedFields fields which are derived from source Module/Document
     * (see updateDerivedModule)
     * @return URI of created Module/Document
     * @since 3.4.1
     */
    public java.lang.String reuseModule(java.lang.String sourceURI, java.lang.String targetProjectId, java.lang.String targetLocation, java.lang.String targetName, com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole, java.lang.String[] fields, java.lang.String[] exceptFields, java.lang.String[] derivedFields) throws java.rmi.RemoteException;

    /**
     * Sets tags of a comment.
     * @param commentURI the URI of the comment
     * @param tags the tags to set
     * @since 3.7.1
     */
    public void setCommentTags(java.lang.String commentURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags) throws java.rmi.RemoteException;

    /**
     * Sets a custom field of a work item.
     * @param customField the custom field to set.
     */
    public void setCustomField(com.polarion.alm.ws.client.types.tracker.CustomField customField) throws java.rmi.RemoteException;

    /**
     * Sets a field to null.
     * @param workitemURI the URI of the work item to set a fields null for.
     * @param fields the keys of the fields to set null.
     */
    public void setFieldsNull(java.lang.String workitemURI, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Sets localized description.
     * @param uri Work Item URI (not null)
     * @param language language id (must be defined) or null for default
     * language
     * @param description description (can be null)
     * @since 3.6.1
     */
    public void setLocalizedWorkItemDescription(java.lang.String uri, java.lang.String language, com.polarion.alm.ws.client.types.Text description) throws java.rmi.RemoteException;

    /**
     * Sets localized title.
     * @param uri Work Item URI (not null)
     * @param language language id (must be defined) or null for default
     * language
     * @param title title (can be null)
     * @since 3.6.1
     */
    public void setLocalizedWorkItemTitle(java.lang.String uri, java.lang.String language, java.lang.String title) throws java.rmi.RemoteException;

    /**
     * Sets resolved state of a comment. Can be used only for the
     * root comments.
     * @param commentURI the URI of the comment
     * @param resolved new resolved state
     * @since 3.7.1
     */
    public void setResolvedComment(java.lang.String commentURI, boolean resolved) throws java.rmi.RemoteException;

    /**
     * Update an existing attachment.
     * @param workitemURI the URI of the work item containing the attachment
     * to be updated.
     * @param id the ID of the attachment to be updated.
     * @param fileName the new filename, will be ignored if null is used.
     * @param title the new title, will be ignored if null is used.
     * @param data the new content, will be ignored if null is used.
     * @since 3.3.1
     */
    public void updateAttachment(java.lang.String workitemURI, java.lang.String id, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Updates given Baseline.
     * @param baseline updated Baseline (not null)
     * @since 3.7.1
     */
    public void updateBaseline(com.polarion.alm.ws.client.types.tracker.Baseline baseline) throws java.rmi.RemoteException;

    /**
     * Updates derived Document to the new revision (baseline).
     * @param documentURI derived document
     * @param revision null means HEAD revision
     * @param autoSuspect
     * @since 3.5.3
     */
    public void updateDerivedDocument(java.lang.String documentURI, java.lang.String revision, boolean autoSuspect) throws java.rmi.RemoteException;

    /**
     * Updates derived Module/Document to the new revision (baseline).
     * @param moduleURI derived Module/Document
     * @param revision null means HEAD revision
     * @since 3.4.1
     */
    public void updateDerivedModule(java.lang.String moduleURI, java.lang.String revision) throws java.rmi.RemoteException;

    /**
     * Updates Module/Document.
     * @param module updated Module/Document
     * @since 3.4.1
     */
    public void updateModule(com.polarion.alm.ws.client.types.tracker.Module module) throws java.rmi.RemoteException;

    /**
     * Updates the first Title Heading in Document content.
     * @param documentURI URI of Document (not null)
     * @param title Document title (can be null)
     * @return URI of updated Title Heading or null if no Title Heading in
     * document content was updated
     * @since 3.8.2
     */
    public java.lang.String updateTitleHeadingInDocument(java.lang.String documentURI, java.lang.String title) throws java.rmi.RemoteException;

    /**
     * Updates a work item. The work item passed has to caontain a
     * valid uri, the uri of the workitem to update.
     * Fields that are not transmitted wont be set on the target work item.
     * Therefore only the changed fields and the uri should be sent to save
     * resources.
     * @param content the altered content.
     */
    public void updateWorkItem(com.polarion.alm.ws.client.types.tracker.WorkItem content) throws java.rmi.RemoteException;
}
