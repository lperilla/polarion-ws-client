/**
 * Plan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.planning;

public class Plan  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedTypes;

    private java.lang.String authorURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId calculationType;

    private java.lang.Float capacity;

    private java.lang.String color;

    private java.util.Calendar created;

    private java.lang.Float defaultEstimate;

    private com.polarion.alm.ws.client.types.Text description;

    private java.util.Date dueDate;

    private java.lang.String estimationField;

    private java.util.Calendar finishedOn;

    private com.polarion.alm.ws.client.types.Text homePageContent;

    private java.lang.String id;

    private java.lang.Boolean isTemplate;

    private java.lang.String location;

    private java.lang.String name;

    private com.polarion.alm.ws.client.types.planning.Plan parent;

    private java.lang.String previousTimeSpent;

    private java.lang.String prioritizationField;

    private java.lang.String projectURI;

    private java.lang.String[] projectSpanURIs;

    private com.polarion.alm.ws.client.types.planning.PlanRecord[] records;

    private java.lang.Integer sortOrder;

    private java.util.Date startDate;

    private java.util.Calendar startedOn;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    private java.lang.String templateURI;

    private java.util.Calendar updated;

    private java.lang.Boolean useReportFromTemplate;

    private com.polarion.alm.ws.client.types.tracker.Custom[] customFields;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Plan() {
    }

    public Plan(
           com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedTypes,
           java.lang.String authorURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId calculationType,
           java.lang.Float capacity,
           java.lang.String color,
           java.util.Calendar created,
           java.lang.Float defaultEstimate,
           com.polarion.alm.ws.client.types.Text description,
           java.util.Date dueDate,
           java.lang.String estimationField,
           java.util.Calendar finishedOn,
           com.polarion.alm.ws.client.types.Text homePageContent,
           java.lang.String id,
           java.lang.Boolean isTemplate,
           java.lang.String location,
           java.lang.String name,
           com.polarion.alm.ws.client.types.planning.Plan parent,
           java.lang.String previousTimeSpent,
           java.lang.String prioritizationField,
           java.lang.String projectURI,
           java.lang.String[] projectSpanURIs,
           com.polarion.alm.ws.client.types.planning.PlanRecord[] records,
           java.lang.Integer sortOrder,
           java.util.Date startDate,
           java.util.Calendar startedOn,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status,
           java.lang.String templateURI,
           java.util.Calendar updated,
           java.lang.Boolean useReportFromTemplate,
           com.polarion.alm.ws.client.types.tracker.Custom[] customFields,
           java.lang.String uri,
           boolean unresolvable) {
           this.allowedTypes = allowedTypes;
           this.authorURI = authorURI;
           this.calculationType = calculationType;
           this.capacity = capacity;
           this.color = color;
           this.created = created;
           this.defaultEstimate = defaultEstimate;
           this.description = description;
           this.dueDate = dueDate;
           this.estimationField = estimationField;
           this.finishedOn = finishedOn;
           this.homePageContent = homePageContent;
           this.id = id;
           this.isTemplate = isTemplate;
           this.location = location;
           this.name = name;
           this.parent = parent;
           this.previousTimeSpent = previousTimeSpent;
           this.prioritizationField = prioritizationField;
           this.projectURI = projectURI;
           this.projectSpanURIs = projectSpanURIs;
           this.records = records;
           this.sortOrder = sortOrder;
           this.startDate = startDate;
           this.startedOn = startedOn;
           this.status = status;
           this.templateURI = templateURI;
           this.updated = updated;
           this.useReportFromTemplate = useReportFromTemplate;
           this.customFields = customFields;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the allowedTypes value for this Plan.
     * 
     * @return allowedTypes
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllowedTypes() {
        return allowedTypes;
    }


    /**
     * Sets the allowedTypes value for this Plan.
     * 
     * @param allowedTypes
     */
    public void setAllowedTypes(com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedTypes) {
        this.allowedTypes = allowedTypes;
    }


    /**
     * Gets the authorURI value for this Plan.
     * 
     * @return authorURI
     */
    public java.lang.String getAuthorURI() {
        return authorURI;
    }


    /**
     * Sets the authorURI value for this Plan.
     * 
     * @param authorURI
     */
    public void setAuthorURI(java.lang.String authorURI) {
        this.authorURI = authorURI;
    }


    /**
     * Gets the calculationType value for this Plan.
     * 
     * @return calculationType
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getCalculationType() {
        return calculationType;
    }


    /**
     * Sets the calculationType value for this Plan.
     * 
     * @param calculationType
     */
    public void setCalculationType(com.polarion.alm.ws.client.types.tracker.EnumOptionId calculationType) {
        this.calculationType = calculationType;
    }


    /**
     * Gets the capacity value for this Plan.
     * 
     * @return capacity
     */
    public java.lang.Float getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Plan.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.Float capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the color value for this Plan.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this Plan.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the created value for this Plan.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Plan.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the defaultEstimate value for this Plan.
     * 
     * @return defaultEstimate
     */
    public java.lang.Float getDefaultEstimate() {
        return defaultEstimate;
    }


    /**
     * Sets the defaultEstimate value for this Plan.
     * 
     * @param defaultEstimate
     */
    public void setDefaultEstimate(java.lang.Float defaultEstimate) {
        this.defaultEstimate = defaultEstimate;
    }


    /**
     * Gets the description value for this Plan.
     * 
     * @return description
     */
    public com.polarion.alm.ws.client.types.Text getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Plan.
     * 
     * @param description
     */
    public void setDescription(com.polarion.alm.ws.client.types.Text description) {
        this.description = description;
    }


    /**
     * Gets the dueDate value for this Plan.
     * 
     * @return dueDate
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Plan.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the estimationField value for this Plan.
     * 
     * @return estimationField
     */
    public java.lang.String getEstimationField() {
        return estimationField;
    }


    /**
     * Sets the estimationField value for this Plan.
     * 
     * @param estimationField
     */
    public void setEstimationField(java.lang.String estimationField) {
        this.estimationField = estimationField;
    }


    /**
     * Gets the finishedOn value for this Plan.
     * 
     * @return finishedOn
     */
    public java.util.Calendar getFinishedOn() {
        return finishedOn;
    }


    /**
     * Sets the finishedOn value for this Plan.
     * 
     * @param finishedOn
     */
    public void setFinishedOn(java.util.Calendar finishedOn) {
        this.finishedOn = finishedOn;
    }


    /**
     * Gets the homePageContent value for this Plan.
     * 
     * @return homePageContent
     */
    public com.polarion.alm.ws.client.types.Text getHomePageContent() {
        return homePageContent;
    }


    /**
     * Sets the homePageContent value for this Plan.
     * 
     * @param homePageContent
     */
    public void setHomePageContent(com.polarion.alm.ws.client.types.Text homePageContent) {
        this.homePageContent = homePageContent;
    }


    /**
     * Gets the id value for this Plan.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Plan.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the isTemplate value for this Plan.
     * 
     * @return isTemplate
     */
    public java.lang.Boolean getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this Plan.
     * 
     * @param isTemplate
     */
    public void setIsTemplate(java.lang.Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }


    /**
     * Gets the location value for this Plan.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Plan.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the name value for this Plan.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Plan.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Plan.
     * 
     * @return parent
     */
    public com.polarion.alm.ws.client.types.planning.Plan getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Plan.
     * 
     * @param parent
     */
    public void setParent(com.polarion.alm.ws.client.types.planning.Plan parent) {
        this.parent = parent;
    }


    /**
     * Gets the previousTimeSpent value for this Plan.
     * 
     * @return previousTimeSpent
     */
    public java.lang.String getPreviousTimeSpent() {
        return previousTimeSpent;
    }


    /**
     * Sets the previousTimeSpent value for this Plan.
     * 
     * @param previousTimeSpent
     */
    public void setPreviousTimeSpent(java.lang.String previousTimeSpent) {
        this.previousTimeSpent = previousTimeSpent;
    }


    /**
     * Gets the prioritizationField value for this Plan.
     * 
     * @return prioritizationField
     */
    public java.lang.String getPrioritizationField() {
        return prioritizationField;
    }


    /**
     * Sets the prioritizationField value for this Plan.
     * 
     * @param prioritizationField
     */
    public void setPrioritizationField(java.lang.String prioritizationField) {
        this.prioritizationField = prioritizationField;
    }


    /**
     * Gets the projectURI value for this Plan.
     * 
     * @return projectURI
     */
    public java.lang.String getProjectURI() {
        return projectURI;
    }


    /**
     * Sets the projectURI value for this Plan.
     * 
     * @param projectURI
     */
    public void setProjectURI(java.lang.String projectURI) {
        this.projectURI = projectURI;
    }


    /**
     * Gets the projectSpanURIs value for this Plan.
     * 
     * @return projectSpanURIs
     */
    public java.lang.String[] getProjectSpanURIs() {
        return projectSpanURIs;
    }


    /**
     * Sets the projectSpanURIs value for this Plan.
     * 
     * @param projectSpanURIs
     */
    public void setProjectSpanURIs(java.lang.String[] projectSpanURIs) {
        this.projectSpanURIs = projectSpanURIs;
    }


    /**
     * Gets the records value for this Plan.
     * 
     * @return records
     */
    public com.polarion.alm.ws.client.types.planning.PlanRecord[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this Plan.
     * 
     * @param records
     */
    public void setRecords(com.polarion.alm.ws.client.types.planning.PlanRecord[] records) {
        this.records = records;
    }


    /**
     * Gets the sortOrder value for this Plan.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Plan.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startDate value for this Plan.
     * 
     * @return startDate
     */
    public java.util.Date getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Plan.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startedOn value for this Plan.
     * 
     * @return startedOn
     */
    public java.util.Calendar getStartedOn() {
        return startedOn;
    }


    /**
     * Sets the startedOn value for this Plan.
     * 
     * @param startedOn
     */
    public void setStartedOn(java.util.Calendar startedOn) {
        this.startedOn = startedOn;
    }


    /**
     * Gets the status value for this Plan.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Plan.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }


    /**
     * Gets the templateURI value for this Plan.
     * 
     * @return templateURI
     */
    public java.lang.String getTemplateURI() {
        return templateURI;
    }


    /**
     * Sets the templateURI value for this Plan.
     * 
     * @param templateURI
     */
    public void setTemplateURI(java.lang.String templateURI) {
        this.templateURI = templateURI;
    }


    /**
     * Gets the updated value for this Plan.
     * 
     * @return updated
     */
    public java.util.Calendar getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this Plan.
     * 
     * @param updated
     */
    public void setUpdated(java.util.Calendar updated) {
        this.updated = updated;
    }


    /**
     * Gets the useReportFromTemplate value for this Plan.
     * 
     * @return useReportFromTemplate
     */
    public java.lang.Boolean getUseReportFromTemplate() {
        return useReportFromTemplate;
    }


    /**
     * Sets the useReportFromTemplate value for this Plan.
     * 
     * @param useReportFromTemplate
     */
    public void setUseReportFromTemplate(java.lang.Boolean useReportFromTemplate) {
        this.useReportFromTemplate = useReportFromTemplate;
    }


    /**
     * Gets the customFields value for this Plan.
     * 
     * @return customFields
     */
    public com.polarion.alm.ws.client.types.tracker.Custom[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Plan.
     * 
     * @param customFields
     */
    public void setCustomFields(com.polarion.alm.ws.client.types.tracker.Custom[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the uri value for this Plan.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Plan.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Plan.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Plan.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Plan)) return false;
        Plan other = (Plan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedTypes==null && other.getAllowedTypes()==null) || 
             (this.allowedTypes!=null &&
              java.util.Arrays.equals(this.allowedTypes, other.getAllowedTypes()))) &&
            ((this.authorURI==null && other.getAuthorURI()==null) || 
             (this.authorURI!=null &&
              this.authorURI.equals(other.getAuthorURI()))) &&
            ((this.calculationType==null && other.getCalculationType()==null) || 
             (this.calculationType!=null &&
              this.calculationType.equals(other.getCalculationType()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.defaultEstimate==null && other.getDefaultEstimate()==null) || 
             (this.defaultEstimate!=null &&
              this.defaultEstimate.equals(other.getDefaultEstimate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.estimationField==null && other.getEstimationField()==null) || 
             (this.estimationField!=null &&
              this.estimationField.equals(other.getEstimationField()))) &&
            ((this.finishedOn==null && other.getFinishedOn()==null) || 
             (this.finishedOn!=null &&
              this.finishedOn.equals(other.getFinishedOn()))) &&
            ((this.homePageContent==null && other.getHomePageContent()==null) || 
             (this.homePageContent!=null &&
              this.homePageContent.equals(other.getHomePageContent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              this.isTemplate.equals(other.getIsTemplate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.previousTimeSpent==null && other.getPreviousTimeSpent()==null) || 
             (this.previousTimeSpent!=null &&
              this.previousTimeSpent.equals(other.getPreviousTimeSpent()))) &&
            ((this.prioritizationField==null && other.getPrioritizationField()==null) || 
             (this.prioritizationField!=null &&
              this.prioritizationField.equals(other.getPrioritizationField()))) &&
            ((this.projectURI==null && other.getProjectURI()==null) || 
             (this.projectURI!=null &&
              this.projectURI.equals(other.getProjectURI()))) &&
            ((this.projectSpanURIs==null && other.getProjectSpanURIs()==null) || 
             (this.projectSpanURIs!=null &&
              java.util.Arrays.equals(this.projectSpanURIs, other.getProjectSpanURIs()))) &&
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startedOn==null && other.getStartedOn()==null) || 
             (this.startedOn!=null &&
              this.startedOn.equals(other.getStartedOn()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.templateURI==null && other.getTemplateURI()==null) || 
             (this.templateURI!=null &&
              this.templateURI.equals(other.getTemplateURI()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.useReportFromTemplate==null && other.getUseReportFromTemplate()==null) || 
             (this.useReportFromTemplate!=null &&
              this.useReportFromTemplate.equals(other.getUseReportFromTemplate()))) &&
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
        if (getAllowedTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorURI() != null) {
            _hashCode += getAuthorURI().hashCode();
        }
        if (getCalculationType() != null) {
            _hashCode += getCalculationType().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDefaultEstimate() != null) {
            _hashCode += getDefaultEstimate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getEstimationField() != null) {
            _hashCode += getEstimationField().hashCode();
        }
        if (getFinishedOn() != null) {
            _hashCode += getFinishedOn().hashCode();
        }
        if (getHomePageContent() != null) {
            _hashCode += getHomePageContent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsTemplate() != null) {
            _hashCode += getIsTemplate().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPreviousTimeSpent() != null) {
            _hashCode += getPreviousTimeSpent().hashCode();
        }
        if (getPrioritizationField() != null) {
            _hashCode += getPrioritizationField().hashCode();
        }
        if (getProjectURI() != null) {
            _hashCode += getProjectURI().hashCode();
        }
        if (getProjectSpanURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectSpanURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectSpanURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartedOn() != null) {
            _hashCode += getStartedOn().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTemplateURI() != null) {
            _hashCode += getTemplateURI().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getUseReportFromTemplate() != null) {
            _hashCode += getUseReportFromTemplate().hashCode();
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
        new org.apache.axis.description.TypeDesc(Plan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
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
        elemField.setFieldName("allowedTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "allowedTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "authorURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "calculationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "defaultEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimationField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "estimationField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "finishedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "homePageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousTimeSpent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "previousTimeSpent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prioritizationField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "prioritizationField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "projectURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectSpanURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "projectSpanURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "startedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "templateURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useReportFromTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "useReportFromTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "customFields"));
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
