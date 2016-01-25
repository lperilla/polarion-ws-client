/**
 * WorkItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class WorkItem  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.Approval[] approvals;

    private com.polarion.alm.ws.client.types.projects.User[] assignee;

    private com.polarion.alm.ws.client.types.tracker.Attachment[] attachments;

    private com.polarion.alm.ws.client.types.projects.User author;

    private java.lang.Boolean autoSuspect;

    private com.polarion.alm.ws.client.types.tracker.Category[] categories;

    private com.polarion.alm.ws.client.types.tracker.Comment[] comments;

    private java.util.Calendar created;

    private com.polarion.alm.ws.client.types.Text description;

    private java.util.Date dueDate;

    private com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem[] externallyLinkedWorkItems;

    private com.polarion.alm.ws.client.types.tracker.Hyperlink[] hyperlinks;

    private java.lang.String id;

    private java.lang.String initialEstimate;

    private com.polarion.alm.ws.client.types.Revision[] linkedRevisions;

    private com.polarion.alm.ws.client.types.Revision[] linkedRevisionsDerived;

    private com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItems;

    private com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItemsDerived;

    private java.lang.String location;

    private java.lang.String moduleURI;

    private java.lang.String outlineNumber;

    private java.util.Calendar plannedEnd;

    private com.polarion.alm.ws.client.types.planning.Plan[] plannedIn;

    private java.util.Calendar plannedStart;

    private com.polarion.alm.ws.client.types.tracker.PlanningConstraint[] planningConstraints;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId previousStatus;

    private com.polarion.alm.ws.client.types.tracker.PriorityOptionId priority;

    private com.polarion.alm.ws.client.types.projects.Project project;

    private java.lang.String remainingEstimate;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId resolution;

    private java.util.Calendar resolvedOn;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId severity;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    private com.polarion.alm.ws.client.types.tracker.TimePoint timePoint;

    private java.lang.String timeSpent;

    private java.lang.String title;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId type;

    private java.util.Calendar updated;

    private com.polarion.alm.ws.client.types.tracker.WorkRecord[] workRecords;

    private com.polarion.alm.ws.client.types.tracker.Custom[] customFields;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public WorkItem() {
    }

    public WorkItem(
           com.polarion.alm.ws.client.types.tracker.Approval[] approvals,
           com.polarion.alm.ws.client.types.projects.User[] assignee,
           com.polarion.alm.ws.client.types.tracker.Attachment[] attachments,
           com.polarion.alm.ws.client.types.projects.User author,
           java.lang.Boolean autoSuspect,
           com.polarion.alm.ws.client.types.tracker.Category[] categories,
           com.polarion.alm.ws.client.types.tracker.Comment[] comments,
           java.util.Calendar created,
           com.polarion.alm.ws.client.types.Text description,
           java.util.Date dueDate,
           com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem[] externallyLinkedWorkItems,
           com.polarion.alm.ws.client.types.tracker.Hyperlink[] hyperlinks,
           java.lang.String id,
           java.lang.String initialEstimate,
           com.polarion.alm.ws.client.types.Revision[] linkedRevisions,
           com.polarion.alm.ws.client.types.Revision[] linkedRevisionsDerived,
           com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItems,
           com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItemsDerived,
           java.lang.String location,
           java.lang.String moduleURI,
           java.lang.String outlineNumber,
           java.util.Calendar plannedEnd,
           com.polarion.alm.ws.client.types.planning.Plan[] plannedIn,
           java.util.Calendar plannedStart,
           com.polarion.alm.ws.client.types.tracker.PlanningConstraint[] planningConstraints,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId previousStatus,
           com.polarion.alm.ws.client.types.tracker.PriorityOptionId priority,
           com.polarion.alm.ws.client.types.projects.Project project,
           java.lang.String remainingEstimate,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId resolution,
           java.util.Calendar resolvedOn,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId severity,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status,
           com.polarion.alm.ws.client.types.tracker.TimePoint timePoint,
           java.lang.String timeSpent,
           java.lang.String title,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId type,
           java.util.Calendar updated,
           com.polarion.alm.ws.client.types.tracker.WorkRecord[] workRecords,
           com.polarion.alm.ws.client.types.tracker.Custom[] customFields,
           java.lang.String uri,
           boolean unresolvable) {
           this.approvals = approvals;
           this.assignee = assignee;
           this.attachments = attachments;
           this.author = author;
           this.autoSuspect = autoSuspect;
           this.categories = categories;
           this.comments = comments;
           this.created = created;
           this.description = description;
           this.dueDate = dueDate;
           this.externallyLinkedWorkItems = externallyLinkedWorkItems;
           this.hyperlinks = hyperlinks;
           this.id = id;
           this.initialEstimate = initialEstimate;
           this.linkedRevisions = linkedRevisions;
           this.linkedRevisionsDerived = linkedRevisionsDerived;
           this.linkedWorkItems = linkedWorkItems;
           this.linkedWorkItemsDerived = linkedWorkItemsDerived;
           this.location = location;
           this.moduleURI = moduleURI;
           this.outlineNumber = outlineNumber;
           this.plannedEnd = plannedEnd;
           this.plannedIn = plannedIn;
           this.plannedStart = plannedStart;
           this.planningConstraints = planningConstraints;
           this.previousStatus = previousStatus;
           this.priority = priority;
           this.project = project;
           this.remainingEstimate = remainingEstimate;
           this.resolution = resolution;
           this.resolvedOn = resolvedOn;
           this.severity = severity;
           this.status = status;
           this.timePoint = timePoint;
           this.timeSpent = timeSpent;
           this.title = title;
           this.type = type;
           this.updated = updated;
           this.workRecords = workRecords;
           this.customFields = customFields;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the approvals value for this WorkItem.
     * 
     * @return approvals
     */
    public com.polarion.alm.ws.client.types.tracker.Approval[] getApprovals() {
        return approvals;
    }


    /**
     * Sets the approvals value for this WorkItem.
     * 
     * @param approvals
     */
    public void setApprovals(com.polarion.alm.ws.client.types.tracker.Approval[] approvals) {
        this.approvals = approvals;
    }


    /**
     * Gets the assignee value for this WorkItem.
     * 
     * @return assignee
     */
    public com.polarion.alm.ws.client.types.projects.User[] getAssignee() {
        return assignee;
    }


    /**
     * Sets the assignee value for this WorkItem.
     * 
     * @param assignee
     */
    public void setAssignee(com.polarion.alm.ws.client.types.projects.User[] assignee) {
        this.assignee = assignee;
    }


    /**
     * Gets the attachments value for this WorkItem.
     * 
     * @return attachments
     */
    public com.polarion.alm.ws.client.types.tracker.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this WorkItem.
     * 
     * @param attachments
     */
    public void setAttachments(com.polarion.alm.ws.client.types.tracker.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the author value for this WorkItem.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this WorkItem.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the autoSuspect value for this WorkItem.
     * 
     * @return autoSuspect
     */
    public java.lang.Boolean getAutoSuspect() {
        return autoSuspect;
    }


    /**
     * Sets the autoSuspect value for this WorkItem.
     * 
     * @param autoSuspect
     */
    public void setAutoSuspect(java.lang.Boolean autoSuspect) {
        this.autoSuspect = autoSuspect;
    }


    /**
     * Gets the categories value for this WorkItem.
     * 
     * @return categories
     */
    public com.polarion.alm.ws.client.types.tracker.Category[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this WorkItem.
     * 
     * @param categories
     */
    public void setCategories(com.polarion.alm.ws.client.types.tracker.Category[] categories) {
        this.categories = categories;
    }


    /**
     * Gets the comments value for this WorkItem.
     * 
     * @return comments
     */
    public com.polarion.alm.ws.client.types.tracker.Comment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this WorkItem.
     * 
     * @param comments
     */
    public void setComments(com.polarion.alm.ws.client.types.tracker.Comment[] comments) {
        this.comments = comments;
    }


    /**
     * Gets the created value for this WorkItem.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this WorkItem.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the description value for this WorkItem.
     * 
     * @return description
     */
    public com.polarion.alm.ws.client.types.Text getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WorkItem.
     * 
     * @param description
     */
    public void setDescription(com.polarion.alm.ws.client.types.Text description) {
        this.description = description;
    }


    /**
     * Gets the dueDate value for this WorkItem.
     * 
     * @return dueDate
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this WorkItem.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the externallyLinkedWorkItems value for this WorkItem.
     * 
     * @return externallyLinkedWorkItems
     */
    public com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem[] getExternallyLinkedWorkItems() {
        return externallyLinkedWorkItems;
    }


    /**
     * Sets the externallyLinkedWorkItems value for this WorkItem.
     * 
     * @param externallyLinkedWorkItems
     */
    public void setExternallyLinkedWorkItems(com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem[] externallyLinkedWorkItems) {
        this.externallyLinkedWorkItems = externallyLinkedWorkItems;
    }


    /**
     * Gets the hyperlinks value for this WorkItem.
     * 
     * @return hyperlinks
     */
    public com.polarion.alm.ws.client.types.tracker.Hyperlink[] getHyperlinks() {
        return hyperlinks;
    }


    /**
     * Sets the hyperlinks value for this WorkItem.
     * 
     * @param hyperlinks
     */
    public void setHyperlinks(com.polarion.alm.ws.client.types.tracker.Hyperlink[] hyperlinks) {
        this.hyperlinks = hyperlinks;
    }


    /**
     * Gets the id value for this WorkItem.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkItem.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the initialEstimate value for this WorkItem.
     * 
     * @return initialEstimate
     */
    public java.lang.String getInitialEstimate() {
        return initialEstimate;
    }


    /**
     * Sets the initialEstimate value for this WorkItem.
     * 
     * @param initialEstimate
     */
    public void setInitialEstimate(java.lang.String initialEstimate) {
        this.initialEstimate = initialEstimate;
    }


    /**
     * Gets the linkedRevisions value for this WorkItem.
     * 
     * @return linkedRevisions
     */
    public com.polarion.alm.ws.client.types.Revision[] getLinkedRevisions() {
        return linkedRevisions;
    }


    /**
     * Sets the linkedRevisions value for this WorkItem.
     * 
     * @param linkedRevisions
     */
    public void setLinkedRevisions(com.polarion.alm.ws.client.types.Revision[] linkedRevisions) {
        this.linkedRevisions = linkedRevisions;
    }


    /**
     * Gets the linkedRevisionsDerived value for this WorkItem.
     * 
     * @return linkedRevisionsDerived
     */
    public com.polarion.alm.ws.client.types.Revision[] getLinkedRevisionsDerived() {
        return linkedRevisionsDerived;
    }


    /**
     * Sets the linkedRevisionsDerived value for this WorkItem.
     * 
     * @param linkedRevisionsDerived
     */
    public void setLinkedRevisionsDerived(com.polarion.alm.ws.client.types.Revision[] linkedRevisionsDerived) {
        this.linkedRevisionsDerived = linkedRevisionsDerived;
    }


    /**
     * Gets the linkedWorkItems value for this WorkItem.
     * 
     * @return linkedWorkItems
     */
    public com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] getLinkedWorkItems() {
        return linkedWorkItems;
    }


    /**
     * Sets the linkedWorkItems value for this WorkItem.
     * 
     * @param linkedWorkItems
     */
    public void setLinkedWorkItems(com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItems) {
        this.linkedWorkItems = linkedWorkItems;
    }


    /**
     * Gets the linkedWorkItemsDerived value for this WorkItem.
     * 
     * @return linkedWorkItemsDerived
     */
    public com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] getLinkedWorkItemsDerived() {
        return linkedWorkItemsDerived;
    }


    /**
     * Sets the linkedWorkItemsDerived value for this WorkItem.
     * 
     * @param linkedWorkItemsDerived
     */
    public void setLinkedWorkItemsDerived(com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] linkedWorkItemsDerived) {
        this.linkedWorkItemsDerived = linkedWorkItemsDerived;
    }


    /**
     * Gets the location value for this WorkItem.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this WorkItem.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the moduleURI value for this WorkItem.
     * 
     * @return moduleURI
     */
    public java.lang.String getModuleURI() {
        return moduleURI;
    }


    /**
     * Sets the moduleURI value for this WorkItem.
     * 
     * @param moduleURI
     */
    public void setModuleURI(java.lang.String moduleURI) {
        this.moduleURI = moduleURI;
    }


    /**
     * Gets the outlineNumber value for this WorkItem.
     * 
     * @return outlineNumber
     */
    public java.lang.String getOutlineNumber() {
        return outlineNumber;
    }


    /**
     * Sets the outlineNumber value for this WorkItem.
     * 
     * @param outlineNumber
     */
    public void setOutlineNumber(java.lang.String outlineNumber) {
        this.outlineNumber = outlineNumber;
    }


    /**
     * Gets the plannedEnd value for this WorkItem.
     * 
     * @return plannedEnd
     */
    public java.util.Calendar getPlannedEnd() {
        return plannedEnd;
    }


    /**
     * Sets the plannedEnd value for this WorkItem.
     * 
     * @param plannedEnd
     */
    public void setPlannedEnd(java.util.Calendar plannedEnd) {
        this.plannedEnd = plannedEnd;
    }


    /**
     * Gets the plannedIn value for this WorkItem.
     * 
     * @return plannedIn
     */
    public com.polarion.alm.ws.client.types.planning.Plan[] getPlannedIn() {
        return plannedIn;
    }


    /**
     * Sets the plannedIn value for this WorkItem.
     * 
     * @param plannedIn
     */
    public void setPlannedIn(com.polarion.alm.ws.client.types.planning.Plan[] plannedIn) {
        this.plannedIn = plannedIn;
    }


    /**
     * Gets the plannedStart value for this WorkItem.
     * 
     * @return plannedStart
     */
    public java.util.Calendar getPlannedStart() {
        return plannedStart;
    }


    /**
     * Sets the plannedStart value for this WorkItem.
     * 
     * @param plannedStart
     */
    public void setPlannedStart(java.util.Calendar plannedStart) {
        this.plannedStart = plannedStart;
    }


    /**
     * Gets the planningConstraints value for this WorkItem.
     * 
     * @return planningConstraints
     */
    public com.polarion.alm.ws.client.types.tracker.PlanningConstraint[] getPlanningConstraints() {
        return planningConstraints;
    }


    /**
     * Sets the planningConstraints value for this WorkItem.
     * 
     * @param planningConstraints
     */
    public void setPlanningConstraints(com.polarion.alm.ws.client.types.tracker.PlanningConstraint[] planningConstraints) {
        this.planningConstraints = planningConstraints;
    }


    /**
     * Gets the previousStatus value for this WorkItem.
     * 
     * @return previousStatus
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getPreviousStatus() {
        return previousStatus;
    }


    /**
     * Sets the previousStatus value for this WorkItem.
     * 
     * @param previousStatus
     */
    public void setPreviousStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId previousStatus) {
        this.previousStatus = previousStatus;
    }


    /**
     * Gets the priority value for this WorkItem.
     * 
     * @return priority
     */
    public com.polarion.alm.ws.client.types.tracker.PriorityOptionId getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this WorkItem.
     * 
     * @param priority
     */
    public void setPriority(com.polarion.alm.ws.client.types.tracker.PriorityOptionId priority) {
        this.priority = priority;
    }


    /**
     * Gets the project value for this WorkItem.
     * 
     * @return project
     */
    public com.polarion.alm.ws.client.types.projects.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this WorkItem.
     * 
     * @param project
     */
    public void setProject(com.polarion.alm.ws.client.types.projects.Project project) {
        this.project = project;
    }


    /**
     * Gets the remainingEstimate value for this WorkItem.
     * 
     * @return remainingEstimate
     */
    public java.lang.String getRemainingEstimate() {
        return remainingEstimate;
    }


    /**
     * Sets the remainingEstimate value for this WorkItem.
     * 
     * @param remainingEstimate
     */
    public void setRemainingEstimate(java.lang.String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }


    /**
     * Gets the resolution value for this WorkItem.
     * 
     * @return resolution
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this WorkItem.
     * 
     * @param resolution
     */
    public void setResolution(com.polarion.alm.ws.client.types.tracker.EnumOptionId resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the resolvedOn value for this WorkItem.
     * 
     * @return resolvedOn
     */
    public java.util.Calendar getResolvedOn() {
        return resolvedOn;
    }


    /**
     * Sets the resolvedOn value for this WorkItem.
     * 
     * @param resolvedOn
     */
    public void setResolvedOn(java.util.Calendar resolvedOn) {
        this.resolvedOn = resolvedOn;
    }


    /**
     * Gets the severity value for this WorkItem.
     * 
     * @return severity
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this WorkItem.
     * 
     * @param severity
     */
    public void setSeverity(com.polarion.alm.ws.client.types.tracker.EnumOptionId severity) {
        this.severity = severity;
    }


    /**
     * Gets the status value for this WorkItem.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkItem.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }


    /**
     * Gets the timePoint value for this WorkItem.
     * 
     * @return timePoint
     */
    public com.polarion.alm.ws.client.types.tracker.TimePoint getTimePoint() {
        return timePoint;
    }


    /**
     * Sets the timePoint value for this WorkItem.
     * 
     * @param timePoint
     */
    public void setTimePoint(com.polarion.alm.ws.client.types.tracker.TimePoint timePoint) {
        this.timePoint = timePoint;
    }


    /**
     * Gets the timeSpent value for this WorkItem.
     * 
     * @return timeSpent
     */
    public java.lang.String getTimeSpent() {
        return timeSpent;
    }


    /**
     * Sets the timeSpent value for this WorkItem.
     * 
     * @param timeSpent
     */
    public void setTimeSpent(java.lang.String timeSpent) {
        this.timeSpent = timeSpent;
    }


    /**
     * Gets the title value for this WorkItem.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WorkItem.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this WorkItem.
     * 
     * @return type
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getType() {
        return type;
    }


    /**
     * Sets the type value for this WorkItem.
     * 
     * @param type
     */
    public void setType(com.polarion.alm.ws.client.types.tracker.EnumOptionId type) {
        this.type = type;
    }


    /**
     * Gets the updated value for this WorkItem.
     * 
     * @return updated
     */
    public java.util.Calendar getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this WorkItem.
     * 
     * @param updated
     */
    public void setUpdated(java.util.Calendar updated) {
        this.updated = updated;
    }


    /**
     * Gets the workRecords value for this WorkItem.
     * 
     * @return workRecords
     */
    public com.polarion.alm.ws.client.types.tracker.WorkRecord[] getWorkRecords() {
        return workRecords;
    }


    /**
     * Sets the workRecords value for this WorkItem.
     * 
     * @param workRecords
     */
    public void setWorkRecords(com.polarion.alm.ws.client.types.tracker.WorkRecord[] workRecords) {
        this.workRecords = workRecords;
    }


    /**
     * Gets the customFields value for this WorkItem.
     * 
     * @return customFields
     */
    public com.polarion.alm.ws.client.types.tracker.Custom[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this WorkItem.
     * 
     * @param customFields
     */
    public void setCustomFields(com.polarion.alm.ws.client.types.tracker.Custom[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the uri value for this WorkItem.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this WorkItem.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this WorkItem.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this WorkItem.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkItem)) return false;
        WorkItem other = (WorkItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approvals==null && other.getApprovals()==null) || 
             (this.approvals!=null &&
              java.util.Arrays.equals(this.approvals, other.getApprovals()))) &&
            ((this.assignee==null && other.getAssignee()==null) || 
             (this.assignee!=null &&
              java.util.Arrays.equals(this.assignee, other.getAssignee()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.autoSuspect==null && other.getAutoSuspect()==null) || 
             (this.autoSuspect!=null &&
              this.autoSuspect.equals(other.getAutoSuspect()))) &&
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              java.util.Arrays.equals(this.categories, other.getCategories()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.externallyLinkedWorkItems==null && other.getExternallyLinkedWorkItems()==null) || 
             (this.externallyLinkedWorkItems!=null &&
              java.util.Arrays.equals(this.externallyLinkedWorkItems, other.getExternallyLinkedWorkItems()))) &&
            ((this.hyperlinks==null && other.getHyperlinks()==null) || 
             (this.hyperlinks!=null &&
              java.util.Arrays.equals(this.hyperlinks, other.getHyperlinks()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.initialEstimate==null && other.getInitialEstimate()==null) || 
             (this.initialEstimate!=null &&
              this.initialEstimate.equals(other.getInitialEstimate()))) &&
            ((this.linkedRevisions==null && other.getLinkedRevisions()==null) || 
             (this.linkedRevisions!=null &&
              java.util.Arrays.equals(this.linkedRevisions, other.getLinkedRevisions()))) &&
            ((this.linkedRevisionsDerived==null && other.getLinkedRevisionsDerived()==null) || 
             (this.linkedRevisionsDerived!=null &&
              java.util.Arrays.equals(this.linkedRevisionsDerived, other.getLinkedRevisionsDerived()))) &&
            ((this.linkedWorkItems==null && other.getLinkedWorkItems()==null) || 
             (this.linkedWorkItems!=null &&
              java.util.Arrays.equals(this.linkedWorkItems, other.getLinkedWorkItems()))) &&
            ((this.linkedWorkItemsDerived==null && other.getLinkedWorkItemsDerived()==null) || 
             (this.linkedWorkItemsDerived!=null &&
              java.util.Arrays.equals(this.linkedWorkItemsDerived, other.getLinkedWorkItemsDerived()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.moduleURI==null && other.getModuleURI()==null) || 
             (this.moduleURI!=null &&
              this.moduleURI.equals(other.getModuleURI()))) &&
            ((this.outlineNumber==null && other.getOutlineNumber()==null) || 
             (this.outlineNumber!=null &&
              this.outlineNumber.equals(other.getOutlineNumber()))) &&
            ((this.plannedEnd==null && other.getPlannedEnd()==null) || 
             (this.plannedEnd!=null &&
              this.plannedEnd.equals(other.getPlannedEnd()))) &&
            ((this.plannedIn==null && other.getPlannedIn()==null) || 
             (this.plannedIn!=null &&
              java.util.Arrays.equals(this.plannedIn, other.getPlannedIn()))) &&
            ((this.plannedStart==null && other.getPlannedStart()==null) || 
             (this.plannedStart!=null &&
              this.plannedStart.equals(other.getPlannedStart()))) &&
            ((this.planningConstraints==null && other.getPlanningConstraints()==null) || 
             (this.planningConstraints!=null &&
              java.util.Arrays.equals(this.planningConstraints, other.getPlanningConstraints()))) &&
            ((this.previousStatus==null && other.getPreviousStatus()==null) || 
             (this.previousStatus!=null &&
              this.previousStatus.equals(other.getPreviousStatus()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.remainingEstimate==null && other.getRemainingEstimate()==null) || 
             (this.remainingEstimate!=null &&
              this.remainingEstimate.equals(other.getRemainingEstimate()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.resolvedOn==null && other.getResolvedOn()==null) || 
             (this.resolvedOn!=null &&
              this.resolvedOn.equals(other.getResolvedOn()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timePoint==null && other.getTimePoint()==null) || 
             (this.timePoint!=null &&
              this.timePoint.equals(other.getTimePoint()))) &&
            ((this.timeSpent==null && other.getTimeSpent()==null) || 
             (this.timeSpent!=null &&
              this.timeSpent.equals(other.getTimeSpent()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.workRecords==null && other.getWorkRecords()==null) || 
             (this.workRecords!=null &&
              java.util.Arrays.equals(this.workRecords, other.getWorkRecords()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            this.unresolvable == other.isUnresolvable();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApprovals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getAutoSuspect() != null) {
            _hashCode += getAutoSuspect().hashCode();
        }
        if (getCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getExternallyLinkedWorkItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternallyLinkedWorkItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternallyLinkedWorkItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHyperlinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHyperlinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHyperlinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInitialEstimate() != null) {
            _hashCode += getInitialEstimate().hashCode();
        }
        if (getLinkedRevisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedRevisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedRevisions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkedRevisionsDerived() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedRevisionsDerived());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedRevisionsDerived(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkedWorkItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedWorkItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedWorkItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkedWorkItemsDerived() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedWorkItemsDerived());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedWorkItemsDerived(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getModuleURI() != null) {
            _hashCode += getModuleURI().hashCode();
        }
        if (getOutlineNumber() != null) {
            _hashCode += getOutlineNumber().hashCode();
        }
        if (getPlannedEnd() != null) {
            _hashCode += getPlannedEnd().hashCode();
        }
        if (getPlannedIn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlannedIn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlannedIn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlannedStart() != null) {
            _hashCode += getPlannedStart().hashCode();
        }
        if (getPlanningConstraints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlanningConstraints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlanningConstraints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreviousStatus() != null) {
            _hashCode += getPreviousStatus().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getRemainingEstimate() != null) {
            _hashCode += getRemainingEstimate().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getResolvedOn() != null) {
            _hashCode += getResolvedOn().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimePoint() != null) {
            _hashCode += getTimePoint().hashCode();
        }
        if (getTimeSpent() != null) {
            _hashCode += getTimeSpent().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getWorkRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        _hashCode += (isUnresolvable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uri");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uri"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unresolvable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "unresolvable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "approvals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "assignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSuspect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "autoSuspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externallyLinkedWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "externallyLinkedWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hyperlinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "hyperlinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "initialEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedRevisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "linkedRevisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedRevisionsDerived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "linkedRevisionsDerived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "linkedWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedWorkItemsDerived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "linkedWorkItemsDerived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "moduleURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outlineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "outlineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "plannedEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "plannedIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "plannedStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planningConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "planningConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PlanningConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PlanningConstraint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "previousStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PriorityOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "remainingEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "resolvedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "timePoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TimePoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSpent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "timeSpent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "workRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "customFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.polarion.alm.ws.client.internal.encoding.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
