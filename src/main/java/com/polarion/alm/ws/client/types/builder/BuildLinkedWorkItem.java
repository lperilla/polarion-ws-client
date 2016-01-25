/**
 * BuildLinkedWorkItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.builder;

public class BuildLinkedWorkItem  implements java.io.Serializable {
    private java.lang.String revision;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId role;

    private com.polarion.alm.ws.client.types.tracker.WorkItem workItem;

    public BuildLinkedWorkItem() {
    }

    public BuildLinkedWorkItem(
           java.lang.String revision,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId role,
           com.polarion.alm.ws.client.types.tracker.WorkItem workItem) {
           this.revision = revision;
           this.role = role;
           this.workItem = workItem;
    }


    /**
     * Gets the revision value for this BuildLinkedWorkItem.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this BuildLinkedWorkItem.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the role value for this BuildLinkedWorkItem.
     * 
     * @return role
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getRole() {
        return role;
    }


    /**
     * Sets the role value for this BuildLinkedWorkItem.
     * 
     * @param role
     */
    public void setRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
        this.role = role;
    }


    /**
     * Gets the workItem value for this BuildLinkedWorkItem.
     * 
     * @return workItem
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItem() {
        return workItem;
    }


    /**
     * Sets the workItem value for this BuildLinkedWorkItem.
     * 
     * @param workItem
     */
    public void setWorkItem(com.polarion.alm.ws.client.types.tracker.WorkItem workItem) {
        this.workItem = workItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuildLinkedWorkItem)) return false;
        BuildLinkedWorkItem other = (BuildLinkedWorkItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.workItem==null && other.getWorkItem()==null) || 
             (this.workItem!=null &&
              this.workItem.equals(other.getWorkItem())));
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
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getWorkItem() != null) {
            _hashCode += getWorkItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuildLinkedWorkItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "workItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
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
