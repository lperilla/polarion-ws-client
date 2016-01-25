/**
 * CreateModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class CreateModule  implements java.io.Serializable {
    private java.lang.String projectId;

    private java.lang.String location;

    private java.lang.String moduleName;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole;

    private boolean parentToChild;

    private java.lang.String homePageContent;

    public CreateModule() {
    }

    public CreateModule(
           java.lang.String projectId,
           java.lang.String location,
           java.lang.String moduleName,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole,
           boolean parentToChild,
           java.lang.String homePageContent) {
           this.projectId = projectId;
           this.location = location;
           this.moduleName = moduleName;
           this.allowedWITypes = allowedWITypes;
           this.structureLinkRole = structureLinkRole;
           this.parentToChild = parentToChild;
           this.homePageContent = homePageContent;
    }


    /**
     * Gets the projectId value for this CreateModule.
     * 
     * @return projectId
     */
    public java.lang.String getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this CreateModule.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.String projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the location value for this CreateModule.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CreateModule.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the moduleName value for this CreateModule.
     * 
     * @return moduleName
     */
    public java.lang.String getModuleName() {
        return moduleName;
    }


    /**
     * Sets the moduleName value for this CreateModule.
     * 
     * @param moduleName
     */
    public void setModuleName(java.lang.String moduleName) {
        this.moduleName = moduleName;
    }


    /**
     * Gets the allowedWITypes value for this CreateModule.
     * 
     * @return allowedWITypes
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllowedWITypes() {
        return allowedWITypes;
    }


    /**
     * Sets the allowedWITypes value for this CreateModule.
     * 
     * @param allowedWITypes
     */
    public void setAllowedWITypes(com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes) {
        this.allowedWITypes = allowedWITypes;
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getAllowedWITypes(int i) {
        return this.allowedWITypes[i];
    }

    public void setAllowedWITypes(int i, com.polarion.alm.ws.client.types.tracker.EnumOptionId _value) {
        this.allowedWITypes[i] = _value;
    }


    /**
     * Gets the structureLinkRole value for this CreateModule.
     * 
     * @return structureLinkRole
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStructureLinkRole() {
        return structureLinkRole;
    }


    /**
     * Sets the structureLinkRole value for this CreateModule.
     * 
     * @param structureLinkRole
     */
    public void setStructureLinkRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole) {
        this.structureLinkRole = structureLinkRole;
    }


    /**
     * Gets the parentToChild value for this CreateModule.
     * 
     * @return parentToChild
     */
    public boolean isParentToChild() {
        return parentToChild;
    }


    /**
     * Sets the parentToChild value for this CreateModule.
     * 
     * @param parentToChild
     */
    public void setParentToChild(boolean parentToChild) {
        this.parentToChild = parentToChild;
    }


    /**
     * Gets the homePageContent value for this CreateModule.
     * 
     * @return homePageContent
     */
    public java.lang.String getHomePageContent() {
        return homePageContent;
    }


    /**
     * Sets the homePageContent value for this CreateModule.
     * 
     * @param homePageContent
     */
    public void setHomePageContent(java.lang.String homePageContent) {
        this.homePageContent = homePageContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateModule)) return false;
        CreateModule other = (CreateModule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.moduleName==null && other.getModuleName()==null) || 
             (this.moduleName!=null &&
              this.moduleName.equals(other.getModuleName()))) &&
            ((this.allowedWITypes==null && other.getAllowedWITypes()==null) || 
             (this.allowedWITypes!=null &&
              java.util.Arrays.equals(this.allowedWITypes, other.getAllowedWITypes()))) &&
            ((this.structureLinkRole==null && other.getStructureLinkRole()==null) || 
             (this.structureLinkRole!=null &&
              this.structureLinkRole.equals(other.getStructureLinkRole()))) &&
            this.parentToChild == other.isParentToChild() &&
            ((this.homePageContent==null && other.getHomePageContent()==null) || 
             (this.homePageContent!=null &&
              this.homePageContent.equals(other.getHomePageContent())));
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
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getModuleName() != null) {
            _hashCode += getModuleName().hashCode();
        }
        if (getAllowedWITypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedWITypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedWITypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStructureLinkRole() != null) {
            _hashCode += getStructureLinkRole().hashCode();
        }
        _hashCode += (isParentToChild() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHomePageContent() != null) {
            _hashCode += getHomePageContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateModule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createModule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedWITypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "allowedWITypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("structureLinkRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "structureLinkRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentToChild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentToChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "homePageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
