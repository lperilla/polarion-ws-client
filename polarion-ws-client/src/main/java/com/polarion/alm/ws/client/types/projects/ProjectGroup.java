/**
 * ProjectGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.projects;

public class ProjectGroup  implements java.io.Serializable {
    private java.lang.String[] groupURIs;

    private java.lang.String location;

    private java.lang.String name;

    private java.lang.String parentURI;

    private java.lang.String[] projectIDs;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public ProjectGroup() {
    }

    public ProjectGroup(
           java.lang.String[] groupURIs,
           java.lang.String location,
           java.lang.String name,
           java.lang.String parentURI,
           java.lang.String[] projectIDs,
           java.lang.String uri,
           boolean unresolvable) {
           this.groupURIs = groupURIs;
           this.location = location;
           this.name = name;
           this.parentURI = parentURI;
           this.projectIDs = projectIDs;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the groupURIs value for this ProjectGroup.
     * 
     * @return groupURIs
     */
    public java.lang.String[] getGroupURIs() {
        return groupURIs;
    }


    /**
     * Sets the groupURIs value for this ProjectGroup.
     * 
     * @param groupURIs
     */
    public void setGroupURIs(java.lang.String[] groupURIs) {
        this.groupURIs = groupURIs;
    }


    /**
     * Gets the location value for this ProjectGroup.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ProjectGroup.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the name value for this ProjectGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProjectGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentURI value for this ProjectGroup.
     * 
     * @return parentURI
     */
    public java.lang.String getParentURI() {
        return parentURI;
    }


    /**
     * Sets the parentURI value for this ProjectGroup.
     * 
     * @param parentURI
     */
    public void setParentURI(java.lang.String parentURI) {
        this.parentURI = parentURI;
    }


    /**
     * Gets the projectIDs value for this ProjectGroup.
     * 
     * @return projectIDs
     */
    public java.lang.String[] getProjectIDs() {
        return projectIDs;
    }


    /**
     * Sets the projectIDs value for this ProjectGroup.
     * 
     * @param projectIDs
     */
    public void setProjectIDs(java.lang.String[] projectIDs) {
        this.projectIDs = projectIDs;
    }


    /**
     * Gets the uri value for this ProjectGroup.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this ProjectGroup.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this ProjectGroup.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this ProjectGroup.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectGroup)) return false;
        ProjectGroup other = (ProjectGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupURIs==null && other.getGroupURIs()==null) || 
             (this.groupURIs!=null &&
              java.util.Arrays.equals(this.groupURIs, other.getGroupURIs()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentURI==null && other.getParentURI()==null) || 
             (this.parentURI!=null &&
              this.parentURI.equals(other.getParentURI()))) &&
            ((this.projectIDs==null && other.getProjectIDs()==null) || 
             (this.projectIDs!=null &&
              java.util.Arrays.equals(this.projectIDs, other.getProjectIDs()))) &&
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
        if (getGroupURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentURI() != null) {
            _hashCode += getParentURI().hashCode();
        }
        if (getProjectIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectIDs(), i);
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
        new org.apache.axis.description.TypeDesc(ProjectGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "ProjectGroup"));
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
        elemField.setFieldName("groupURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "groupURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "parentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "projectIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "string"));
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
