/**
 * AddExternallyLinkedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class AddExternallyLinkedItem  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String linkedExternalWorkitemURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId role;

    public AddExternallyLinkedItem() {
    }

    public AddExternallyLinkedItem(
           java.lang.String workitemURI,
           java.lang.String linkedExternalWorkitemURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
           this.workitemURI = workitemURI;
           this.linkedExternalWorkitemURI = linkedExternalWorkitemURI;
           this.role = role;
    }


    /**
     * Gets the workitemURI value for this AddExternallyLinkedItem.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this AddExternallyLinkedItem.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the linkedExternalWorkitemURI value for this AddExternallyLinkedItem.
     * 
     * @return linkedExternalWorkitemURI
     */
    public java.lang.String getLinkedExternalWorkitemURI() {
        return linkedExternalWorkitemURI;
    }


    /**
     * Sets the linkedExternalWorkitemURI value for this AddExternallyLinkedItem.
     * 
     * @param linkedExternalWorkitemURI
     */
    public void setLinkedExternalWorkitemURI(java.lang.String linkedExternalWorkitemURI) {
        this.linkedExternalWorkitemURI = linkedExternalWorkitemURI;
    }


    /**
     * Gets the role value for this AddExternallyLinkedItem.
     * 
     * @return role
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getRole() {
        return role;
    }


    /**
     * Sets the role value for this AddExternallyLinkedItem.
     * 
     * @param role
     */
    public void setRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
        this.role = role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddExternallyLinkedItem)) return false;
        AddExternallyLinkedItem other = (AddExternallyLinkedItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workitemURI==null && other.getWorkitemURI()==null) || 
             (this.workitemURI!=null &&
              this.workitemURI.equals(other.getWorkitemURI()))) &&
            ((this.linkedExternalWorkitemURI==null && other.getLinkedExternalWorkitemURI()==null) || 
             (this.linkedExternalWorkitemURI!=null &&
              this.linkedExternalWorkitemURI.equals(other.getLinkedExternalWorkitemURI()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole())));
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
        if (getWorkitemURI() != null) {
            _hashCode += getWorkitemURI().hashCode();
        }
        if (getLinkedExternalWorkitemURI() != null) {
            _hashCode += getLinkedExternalWorkitemURI().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddExternallyLinkedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addExternallyLinkedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedExternalWorkitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedExternalWorkitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
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
