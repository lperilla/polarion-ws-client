/**
 * ModuleComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class ModuleComment  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.projects.User author;

    private java.lang.String[] childCommentURIs;

    private java.util.Calendar created;

    private java.lang.String id;

    private com.polarion.alm.ws.client.types.tracker.ImportedComment importedComment;

    private java.lang.String parentCommentURI;

    private java.lang.String referredWorkItemURI;

    private java.lang.Boolean resolved;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags;

    private com.polarion.alm.ws.client.types.Text text;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public ModuleComment() {
    }

    public ModuleComment(
           com.polarion.alm.ws.client.types.projects.User author,
           java.lang.String[] childCommentURIs,
           java.util.Calendar created,
           java.lang.String id,
           com.polarion.alm.ws.client.types.tracker.ImportedComment importedComment,
           java.lang.String parentCommentURI,
           java.lang.String referredWorkItemURI,
           java.lang.Boolean resolved,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags,
           com.polarion.alm.ws.client.types.Text text,
           java.lang.String uri,
           boolean unresolvable) {
           this.author = author;
           this.childCommentURIs = childCommentURIs;
           this.created = created;
           this.id = id;
           this.importedComment = importedComment;
           this.parentCommentURI = parentCommentURI;
           this.referredWorkItemURI = referredWorkItemURI;
           this.resolved = resolved;
           this.tags = tags;
           this.text = text;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the author value for this ModuleComment.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ModuleComment.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the childCommentURIs value for this ModuleComment.
     * 
     * @return childCommentURIs
     */
    public java.lang.String[] getChildCommentURIs() {
        return childCommentURIs;
    }


    /**
     * Sets the childCommentURIs value for this ModuleComment.
     * 
     * @param childCommentURIs
     */
    public void setChildCommentURIs(java.lang.String[] childCommentURIs) {
        this.childCommentURIs = childCommentURIs;
    }


    /**
     * Gets the created value for this ModuleComment.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ModuleComment.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the id value for this ModuleComment.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ModuleComment.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the importedComment value for this ModuleComment.
     * 
     * @return importedComment
     */
    public com.polarion.alm.ws.client.types.tracker.ImportedComment getImportedComment() {
        return importedComment;
    }


    /**
     * Sets the importedComment value for this ModuleComment.
     * 
     * @param importedComment
     */
    public void setImportedComment(com.polarion.alm.ws.client.types.tracker.ImportedComment importedComment) {
        this.importedComment = importedComment;
    }


    /**
     * Gets the parentCommentURI value for this ModuleComment.
     * 
     * @return parentCommentURI
     */
    public java.lang.String getParentCommentURI() {
        return parentCommentURI;
    }


    /**
     * Sets the parentCommentURI value for this ModuleComment.
     * 
     * @param parentCommentURI
     */
    public void setParentCommentURI(java.lang.String parentCommentURI) {
        this.parentCommentURI = parentCommentURI;
    }


    /**
     * Gets the referredWorkItemURI value for this ModuleComment.
     * 
     * @return referredWorkItemURI
     */
    public java.lang.String getReferredWorkItemURI() {
        return referredWorkItemURI;
    }


    /**
     * Sets the referredWorkItemURI value for this ModuleComment.
     * 
     * @param referredWorkItemURI
     */
    public void setReferredWorkItemURI(java.lang.String referredWorkItemURI) {
        this.referredWorkItemURI = referredWorkItemURI;
    }


    /**
     * Gets the resolved value for this ModuleComment.
     * 
     * @return resolved
     */
    public java.lang.Boolean getResolved() {
        return resolved;
    }


    /**
     * Sets the resolved value for this ModuleComment.
     * 
     * @param resolved
     */
    public void setResolved(java.lang.Boolean resolved) {
        this.resolved = resolved;
    }


    /**
     * Gets the tags value for this ModuleComment.
     * 
     * @return tags
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this ModuleComment.
     * 
     * @param tags
     */
    public void setTags(com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags) {
        this.tags = tags;
    }


    /**
     * Gets the text value for this ModuleComment.
     * 
     * @return text
     */
    public com.polarion.alm.ws.client.types.Text getText() {
        return text;
    }


    /**
     * Sets the text value for this ModuleComment.
     * 
     * @param text
     */
    public void setText(com.polarion.alm.ws.client.types.Text text) {
        this.text = text;
    }


    /**
     * Gets the uri value for this ModuleComment.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this ModuleComment.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this ModuleComment.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this ModuleComment.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModuleComment)) return false;
        ModuleComment other = (ModuleComment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.childCommentURIs==null && other.getChildCommentURIs()==null) || 
             (this.childCommentURIs!=null &&
              java.util.Arrays.equals(this.childCommentURIs, other.getChildCommentURIs()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.importedComment==null && other.getImportedComment()==null) || 
             (this.importedComment!=null &&
              this.importedComment.equals(other.getImportedComment()))) &&
            ((this.parentCommentURI==null && other.getParentCommentURI()==null) || 
             (this.parentCommentURI!=null &&
              this.parentCommentURI.equals(other.getParentCommentURI()))) &&
            ((this.referredWorkItemURI==null && other.getReferredWorkItemURI()==null) || 
             (this.referredWorkItemURI!=null &&
              this.referredWorkItemURI.equals(other.getReferredWorkItemURI()))) &&
            ((this.resolved==null && other.getResolved()==null) || 
             (this.resolved!=null &&
              this.resolved.equals(other.getResolved()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getChildCommentURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildCommentURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildCommentURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getImportedComment() != null) {
            _hashCode += getImportedComment().hashCode();
        }
        if (getParentCommentURI() != null) {
            _hashCode += getParentCommentURI().hashCode();
        }
        if (getReferredWorkItemURI() != null) {
            _hashCode += getReferredWorkItemURI().hashCode();
        }
        if (getResolved() != null) {
            _hashCode += getResolved().hashCode();
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
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
        new org.apache.axis.description.TypeDesc(ModuleComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment"));
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
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childCommentURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "childCommentURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("importedComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "importedComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ImportedComment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCommentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "parentCommentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referredWorkItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "referredWorkItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
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
