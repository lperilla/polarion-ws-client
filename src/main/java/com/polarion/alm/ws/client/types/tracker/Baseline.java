/**
 * Baseline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class Baseline  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.projects.User author;

    private java.lang.String baseRevision;

    private java.lang.String description;

    private java.lang.String id;

    private java.lang.String name;

    private com.polarion.alm.ws.client.types.projects.Project project;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Baseline() {
    }

    public Baseline(
           com.polarion.alm.ws.client.types.projects.User author,
           java.lang.String baseRevision,
           java.lang.String description,
           java.lang.String id,
           java.lang.String name,
           com.polarion.alm.ws.client.types.projects.Project project,
           java.lang.String uri,
           boolean unresolvable) {
           this.author = author;
           this.baseRevision = baseRevision;
           this.description = description;
           this.id = id;
           this.name = name;
           this.project = project;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the author value for this Baseline.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Baseline.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the baseRevision value for this Baseline.
     * 
     * @return baseRevision
     */
    public java.lang.String getBaseRevision() {
        return baseRevision;
    }


    /**
     * Sets the baseRevision value for this Baseline.
     * 
     * @param baseRevision
     */
    public void setBaseRevision(java.lang.String baseRevision) {
        this.baseRevision = baseRevision;
    }


    /**
     * Gets the description value for this Baseline.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Baseline.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this Baseline.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Baseline.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Baseline.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Baseline.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the project value for this Baseline.
     * 
     * @return project
     */
    public com.polarion.alm.ws.client.types.projects.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this Baseline.
     * 
     * @param project
     */
    public void setProject(com.polarion.alm.ws.client.types.projects.Project project) {
        this.project = project;
    }


    /**
     * Gets the uri value for this Baseline.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Baseline.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Baseline.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Baseline.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Baseline)) return false;
        Baseline other = (Baseline) obj;
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
            ((this.baseRevision==null && other.getBaseRevision()==null) || 
             (this.baseRevision!=null &&
              this.baseRevision.equals(other.getBaseRevision()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
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
        if (getBaseRevision() != null) {
            _hashCode += getBaseRevision().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
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
        new org.apache.axis.description.TypeDesc(Baseline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline"));
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
        elemField.setFieldName("baseRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "baseRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "name"));
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
