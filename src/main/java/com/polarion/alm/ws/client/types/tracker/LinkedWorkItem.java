/**
 * LinkedWorkItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class LinkedWorkItem  implements java.io.Serializable {
    private java.lang.String revision;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId role;

    private java.lang.Boolean suspect;

    private java.lang.String workItemURI;

    public LinkedWorkItem() {
    }

    public LinkedWorkItem(
           java.lang.String revision,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId role,
           java.lang.Boolean suspect,
           java.lang.String workItemURI) {
           this.revision = revision;
           this.role = role;
           this.suspect = suspect;
           this.workItemURI = workItemURI;
    }


    /**
     * Gets the revision value for this LinkedWorkItem.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this LinkedWorkItem.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the role value for this LinkedWorkItem.
     * 
     * @return role
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getRole() {
        return role;
    }


    /**
     * Sets the role value for this LinkedWorkItem.
     * 
     * @param role
     */
    public void setRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
        this.role = role;
    }


    /**
     * Gets the suspect value for this LinkedWorkItem.
     * 
     * @return suspect
     */
    public java.lang.Boolean getSuspect() {
        return suspect;
    }


    /**
     * Sets the suspect value for this LinkedWorkItem.
     * 
     * @param suspect
     */
    public void setSuspect(java.lang.Boolean suspect) {
        this.suspect = suspect;
    }


    /**
     * Gets the workItemURI value for this LinkedWorkItem.
     * 
     * @return workItemURI
     */
    public java.lang.String getWorkItemURI() {
        return workItemURI;
    }


    /**
     * Sets the workItemURI value for this LinkedWorkItem.
     * 
     * @param workItemURI
     */
    public void setWorkItemURI(java.lang.String workItemURI) {
        this.workItemURI = workItemURI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinkedWorkItem)) return false;
        LinkedWorkItem other = (LinkedWorkItem) obj;
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
            ((this.suspect==null && other.getSuspect()==null) || 
             (this.suspect!=null &&
              this.suspect.equals(other.getSuspect()))) &&
            ((this.workItemURI==null && other.getWorkItemURI()==null) || 
             (this.workItemURI!=null &&
              this.workItemURI.equals(other.getWorkItemURI())));
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
        if (getSuspect() != null) {
            _hashCode += getSuspect().hashCode();
        }
        if (getWorkItemURI() != null) {
            _hashCode += getWorkItemURI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinkedWorkItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "suspect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "workItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
