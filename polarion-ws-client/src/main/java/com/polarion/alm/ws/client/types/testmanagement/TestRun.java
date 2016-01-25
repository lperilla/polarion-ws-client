/**
 * TestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement;

public class TestRun  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments;

    private java.lang.String authorURI;

    private java.util.Calendar created;

    private com.polarion.alm.ws.client.types.tracker.Module document;

    private java.util.Calendar finishedOn;

    private java.lang.String groupId;

    private java.lang.String id;

    private java.lang.String idPrefix;

    private java.lang.Boolean isTemplate;

    private java.lang.Boolean keepInHistory;

    private java.lang.String location;

    private java.lang.String projectURI;

    private java.lang.String query;

    private com.polarion.alm.ws.client.types.testmanagement.TestRecord[] records;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId selectTestCasesBy;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    private java.lang.String summaryDefectURI;

    private java.lang.String templateURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId type;

    private java.util.Calendar updated;

    private com.polarion.alm.ws.client.types.tracker.Custom[] customFields;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public TestRun() {
    }

    public TestRun(
           com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments,
           java.lang.String authorURI,
           java.util.Calendar created,
           com.polarion.alm.ws.client.types.tracker.Module document,
           java.util.Calendar finishedOn,
           java.lang.String groupId,
           java.lang.String id,
           java.lang.String idPrefix,
           java.lang.Boolean isTemplate,
           java.lang.Boolean keepInHistory,
           java.lang.String location,
           java.lang.String projectURI,
           java.lang.String query,
           com.polarion.alm.ws.client.types.testmanagement.TestRecord[] records,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId selectTestCasesBy,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status,
           java.lang.String summaryDefectURI,
           java.lang.String templateURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId type,
           java.util.Calendar updated,
           com.polarion.alm.ws.client.types.tracker.Custom[] customFields,
           java.lang.String uri,
           boolean unresolvable) {
           this.attachments = attachments;
           this.authorURI = authorURI;
           this.created = created;
           this.document = document;
           this.finishedOn = finishedOn;
           this.groupId = groupId;
           this.id = id;
           this.idPrefix = idPrefix;
           this.isTemplate = isTemplate;
           this.keepInHistory = keepInHistory;
           this.location = location;
           this.projectURI = projectURI;
           this.query = query;
           this.records = records;
           this.selectTestCasesBy = selectTestCasesBy;
           this.status = status;
           this.summaryDefectURI = summaryDefectURI;
           this.templateURI = templateURI;
           this.type = type;
           this.updated = updated;
           this.customFields = customFields;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the attachments value for this TestRun.
     * 
     * @return attachments
     */
    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TestRun.
     * 
     * @param attachments
     */
    public void setAttachments(com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the authorURI value for this TestRun.
     * 
     * @return authorURI
     */
    public java.lang.String getAuthorURI() {
        return authorURI;
    }


    /**
     * Sets the authorURI value for this TestRun.
     * 
     * @param authorURI
     */
    public void setAuthorURI(java.lang.String authorURI) {
        this.authorURI = authorURI;
    }


    /**
     * Gets the created value for this TestRun.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this TestRun.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the document value for this TestRun.
     * 
     * @return document
     */
    public com.polarion.alm.ws.client.types.tracker.Module getDocument() {
        return document;
    }


    /**
     * Sets the document value for this TestRun.
     * 
     * @param document
     */
    public void setDocument(com.polarion.alm.ws.client.types.tracker.Module document) {
        this.document = document;
    }


    /**
     * Gets the finishedOn value for this TestRun.
     * 
     * @return finishedOn
     */
    public java.util.Calendar getFinishedOn() {
        return finishedOn;
    }


    /**
     * Sets the finishedOn value for this TestRun.
     * 
     * @param finishedOn
     */
    public void setFinishedOn(java.util.Calendar finishedOn) {
        this.finishedOn = finishedOn;
    }


    /**
     * Gets the groupId value for this TestRun.
     * 
     * @return groupId
     */
    public java.lang.String getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this TestRun.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the id value for this TestRun.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this TestRun.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the idPrefix value for this TestRun.
     * 
     * @return idPrefix
     */
    public java.lang.String getIdPrefix() {
        return idPrefix;
    }


    /**
     * Sets the idPrefix value for this TestRun.
     * 
     * @param idPrefix
     */
    public void setIdPrefix(java.lang.String idPrefix) {
        this.idPrefix = idPrefix;
    }


    /**
     * Gets the isTemplate value for this TestRun.
     * 
     * @return isTemplate
     */
    public java.lang.Boolean getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this TestRun.
     * 
     * @param isTemplate
     */
    public void setIsTemplate(java.lang.Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }


    /**
     * Gets the keepInHistory value for this TestRun.
     * 
     * @return keepInHistory
     */
    public java.lang.Boolean getKeepInHistory() {
        return keepInHistory;
    }


    /**
     * Sets the keepInHistory value for this TestRun.
     * 
     * @param keepInHistory
     */
    public void setKeepInHistory(java.lang.Boolean keepInHistory) {
        this.keepInHistory = keepInHistory;
    }


    /**
     * Gets the location value for this TestRun.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TestRun.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the projectURI value for this TestRun.
     * 
     * @return projectURI
     */
    public java.lang.String getProjectURI() {
        return projectURI;
    }


    /**
     * Sets the projectURI value for this TestRun.
     * 
     * @param projectURI
     */
    public void setProjectURI(java.lang.String projectURI) {
        this.projectURI = projectURI;
    }


    /**
     * Gets the query value for this TestRun.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this TestRun.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the records value for this TestRun.
     * 
     * @return records
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRecord[] getRecords() {
        return records;
    }


    /**
     * Sets the records value for this TestRun.
     * 
     * @param records
     */
    public void setRecords(com.polarion.alm.ws.client.types.testmanagement.TestRecord[] records) {
        this.records = records;
    }


    /**
     * Gets the selectTestCasesBy value for this TestRun.
     * 
     * @return selectTestCasesBy
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getSelectTestCasesBy() {
        return selectTestCasesBy;
    }


    /**
     * Sets the selectTestCasesBy value for this TestRun.
     * 
     * @param selectTestCasesBy
     */
    public void setSelectTestCasesBy(com.polarion.alm.ws.client.types.tracker.EnumOptionId selectTestCasesBy) {
        this.selectTestCasesBy = selectTestCasesBy;
    }


    /**
     * Gets the status value for this TestRun.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TestRun.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }


    /**
     * Gets the summaryDefectURI value for this TestRun.
     * 
     * @return summaryDefectURI
     */
    public java.lang.String getSummaryDefectURI() {
        return summaryDefectURI;
    }


    /**
     * Sets the summaryDefectURI value for this TestRun.
     * 
     * @param summaryDefectURI
     */
    public void setSummaryDefectURI(java.lang.String summaryDefectURI) {
        this.summaryDefectURI = summaryDefectURI;
    }


    /**
     * Gets the templateURI value for this TestRun.
     * 
     * @return templateURI
     */
    public java.lang.String getTemplateURI() {
        return templateURI;
    }


    /**
     * Sets the templateURI value for this TestRun.
     * 
     * @param templateURI
     */
    public void setTemplateURI(java.lang.String templateURI) {
        this.templateURI = templateURI;
    }


    /**
     * Gets the type value for this TestRun.
     * 
     * @return type
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getType() {
        return type;
    }


    /**
     * Sets the type value for this TestRun.
     * 
     * @param type
     */
    public void setType(com.polarion.alm.ws.client.types.tracker.EnumOptionId type) {
        this.type = type;
    }


    /**
     * Gets the updated value for this TestRun.
     * 
     * @return updated
     */
    public java.util.Calendar getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this TestRun.
     * 
     * @param updated
     */
    public void setUpdated(java.util.Calendar updated) {
        this.updated = updated;
    }


    /**
     * Gets the customFields value for this TestRun.
     * 
     * @return customFields
     */
    public com.polarion.alm.ws.client.types.tracker.Custom[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this TestRun.
     * 
     * @param customFields
     */
    public void setCustomFields(com.polarion.alm.ws.client.types.tracker.Custom[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the uri value for this TestRun.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this TestRun.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this TestRun.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this TestRun.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestRun)) return false;
        TestRun other = (TestRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.authorURI==null && other.getAuthorURI()==null) || 
             (this.authorURI!=null &&
              this.authorURI.equals(other.getAuthorURI()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.finishedOn==null && other.getFinishedOn()==null) || 
             (this.finishedOn!=null &&
              this.finishedOn.equals(other.getFinishedOn()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idPrefix==null && other.getIdPrefix()==null) || 
             (this.idPrefix!=null &&
              this.idPrefix.equals(other.getIdPrefix()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              this.isTemplate.equals(other.getIsTemplate()))) &&
            ((this.keepInHistory==null && other.getKeepInHistory()==null) || 
             (this.keepInHistory!=null &&
              this.keepInHistory.equals(other.getKeepInHistory()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.projectURI==null && other.getProjectURI()==null) || 
             (this.projectURI!=null &&
              this.projectURI.equals(other.getProjectURI()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.records==null && other.getRecords()==null) || 
             (this.records!=null &&
              java.util.Arrays.equals(this.records, other.getRecords()))) &&
            ((this.selectTestCasesBy==null && other.getSelectTestCasesBy()==null) || 
             (this.selectTestCasesBy!=null &&
              this.selectTestCasesBy.equals(other.getSelectTestCasesBy()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.summaryDefectURI==null && other.getSummaryDefectURI()==null) || 
             (this.summaryDefectURI!=null &&
              this.summaryDefectURI.equals(other.getSummaryDefectURI()))) &&
            ((this.templateURI==null && other.getTemplateURI()==null) || 
             (this.templateURI!=null &&
              this.templateURI.equals(other.getTemplateURI()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
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
        if (getAuthorURI() != null) {
            _hashCode += getAuthorURI().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getFinishedOn() != null) {
            _hashCode += getFinishedOn().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdPrefix() != null) {
            _hashCode += getIdPrefix().hashCode();
        }
        if (getIsTemplate() != null) {
            _hashCode += getIsTemplate().hashCode();
        }
        if (getKeepInHistory() != null) {
            _hashCode += getKeepInHistory().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getProjectURI() != null) {
            _hashCode += getProjectURI().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
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
        if (getSelectTestCasesBy() != null) {
            _hashCode += getSelectTestCasesBy().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSummaryDefectURI() != null) {
            _hashCode += getSummaryDefectURI().hashCode();
        }
        if (getTemplateURI() != null) {
            _hashCode += getTemplateURI().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
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
        new org.apache.axis.description.TypeDesc(TestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
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
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "authorURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "finishedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "idPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keepInHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "keepInHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "projectURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("records");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "records"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectTestCasesBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "selectTestCasesBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryDefectURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "summaryDefectURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "templateURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "customFields"));
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
