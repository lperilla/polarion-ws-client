/**
 * WikiPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class WikiPage  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WikiPageAttachment[] attachments;

    private com.polarion.alm.ws.client.types.projects.User author;

    private java.util.Calendar created;

    private com.polarion.alm.ws.client.types.Text homePageContent;

    private java.lang.String id;

    private java.lang.String[] linkedPageURIs;

    private java.lang.String location;

    private java.lang.String pageLocation;

    private java.lang.String pageName;

    private com.polarion.alm.ws.client.types.projects.Project project;

    private java.lang.String spaceId;

    private java.lang.String title;

    private java.lang.String type;

    private java.util.Calendar updated;

    private com.polarion.alm.ws.client.types.projects.User updatedBy;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public WikiPage() {
    }

    public WikiPage(
           com.polarion.alm.ws.client.types.tracker.WikiPageAttachment[] attachments,
           com.polarion.alm.ws.client.types.projects.User author,
           java.util.Calendar created,
           com.polarion.alm.ws.client.types.Text homePageContent,
           java.lang.String id,
           java.lang.String[] linkedPageURIs,
           java.lang.String location,
           java.lang.String pageLocation,
           java.lang.String pageName,
           com.polarion.alm.ws.client.types.projects.Project project,
           java.lang.String spaceId,
           java.lang.String title,
           java.lang.String type,
           java.util.Calendar updated,
           com.polarion.alm.ws.client.types.projects.User updatedBy,
           java.lang.String uri,
           boolean unresolvable) {
           this.attachments = attachments;
           this.author = author;
           this.created = created;
           this.homePageContent = homePageContent;
           this.id = id;
           this.linkedPageURIs = linkedPageURIs;
           this.location = location;
           this.pageLocation = pageLocation;
           this.pageName = pageName;
           this.project = project;
           this.spaceId = spaceId;
           this.title = title;
           this.type = type;
           this.updated = updated;
           this.updatedBy = updatedBy;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the attachments value for this WikiPage.
     * 
     * @return attachments
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPageAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this WikiPage.
     * 
     * @param attachments
     */
    public void setAttachments(com.polarion.alm.ws.client.types.tracker.WikiPageAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the author value for this WikiPage.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this WikiPage.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the created value for this WikiPage.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this WikiPage.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the homePageContent value for this WikiPage.
     * 
     * @return homePageContent
     */
    public com.polarion.alm.ws.client.types.Text getHomePageContent() {
        return homePageContent;
    }


    /**
     * Sets the homePageContent value for this WikiPage.
     * 
     * @param homePageContent
     */
    public void setHomePageContent(com.polarion.alm.ws.client.types.Text homePageContent) {
        this.homePageContent = homePageContent;
    }


    /**
     * Gets the id value for this WikiPage.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WikiPage.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the linkedPageURIs value for this WikiPage.
     * 
     * @return linkedPageURIs
     */
    public java.lang.String[] getLinkedPageURIs() {
        return linkedPageURIs;
    }


    /**
     * Sets the linkedPageURIs value for this WikiPage.
     * 
     * @param linkedPageURIs
     */
    public void setLinkedPageURIs(java.lang.String[] linkedPageURIs) {
        this.linkedPageURIs = linkedPageURIs;
    }


    /**
     * Gets the location value for this WikiPage.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this WikiPage.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the pageLocation value for this WikiPage.
     * 
     * @return pageLocation
     */
    public java.lang.String getPageLocation() {
        return pageLocation;
    }


    /**
     * Sets the pageLocation value for this WikiPage.
     * 
     * @param pageLocation
     */
    public void setPageLocation(java.lang.String pageLocation) {
        this.pageLocation = pageLocation;
    }


    /**
     * Gets the pageName value for this WikiPage.
     * 
     * @return pageName
     */
    public java.lang.String getPageName() {
        return pageName;
    }


    /**
     * Sets the pageName value for this WikiPage.
     * 
     * @param pageName
     */
    public void setPageName(java.lang.String pageName) {
        this.pageName = pageName;
    }


    /**
     * Gets the project value for this WikiPage.
     * 
     * @return project
     */
    public com.polarion.alm.ws.client.types.projects.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this WikiPage.
     * 
     * @param project
     */
    public void setProject(com.polarion.alm.ws.client.types.projects.Project project) {
        this.project = project;
    }


    /**
     * Gets the spaceId value for this WikiPage.
     * 
     * @return spaceId
     */
    public java.lang.String getSpaceId() {
        return spaceId;
    }


    /**
     * Sets the spaceId value for this WikiPage.
     * 
     * @param spaceId
     */
    public void setSpaceId(java.lang.String spaceId) {
        this.spaceId = spaceId;
    }


    /**
     * Gets the title value for this WikiPage.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WikiPage.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this WikiPage.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WikiPage.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the updated value for this WikiPage.
     * 
     * @return updated
     */
    public java.util.Calendar getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this WikiPage.
     * 
     * @param updated
     */
    public void setUpdated(java.util.Calendar updated) {
        this.updated = updated;
    }


    /**
     * Gets the updatedBy value for this WikiPage.
     * 
     * @return updatedBy
     */
    public com.polarion.alm.ws.client.types.projects.User getUpdatedBy() {
        return updatedBy;
    }


    /**
     * Sets the updatedBy value for this WikiPage.
     * 
     * @param updatedBy
     */
    public void setUpdatedBy(com.polarion.alm.ws.client.types.projects.User updatedBy) {
        this.updatedBy = updatedBy;
    }


    /**
     * Gets the uri value for this WikiPage.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this WikiPage.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this WikiPage.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this WikiPage.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WikiPage)) return false;
        WikiPage other = (WikiPage) obj;
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
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.homePageContent==null && other.getHomePageContent()==null) || 
             (this.homePageContent!=null &&
              this.homePageContent.equals(other.getHomePageContent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.linkedPageURIs==null && other.getLinkedPageURIs()==null) || 
             (this.linkedPageURIs!=null &&
              java.util.Arrays.equals(this.linkedPageURIs, other.getLinkedPageURIs()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.pageLocation==null && other.getPageLocation()==null) || 
             (this.pageLocation!=null &&
              this.pageLocation.equals(other.getPageLocation()))) &&
            ((this.pageName==null && other.getPageName()==null) || 
             (this.pageName!=null &&
              this.pageName.equals(other.getPageName()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.spaceId==null && other.getSpaceId()==null) || 
             (this.spaceId!=null &&
              this.spaceId.equals(other.getSpaceId()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.updatedBy==null && other.getUpdatedBy()==null) || 
             (this.updatedBy!=null &&
              this.updatedBy.equals(other.getUpdatedBy()))) &&
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getHomePageContent() != null) {
            _hashCode += getHomePageContent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLinkedPageURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedPageURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedPageURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPageLocation() != null) {
            _hashCode += getPageLocation().hashCode();
        }
        if (getPageName() != null) {
            _hashCode += getPageName().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getSpaceId() != null) {
            _hashCode += getSpaceId().hashCode();
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
        if (getUpdatedBy() != null) {
            _hashCode += getUpdatedBy().hashCode();
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
        new org.apache.axis.description.TypeDesc(WikiPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPageAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPageAttachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "homePageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedPageURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "linkedPageURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "pageLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "pageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("spaceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "spaceId"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("updatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "updatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
