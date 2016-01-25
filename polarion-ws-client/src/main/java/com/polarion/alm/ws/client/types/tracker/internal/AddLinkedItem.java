/**
 * AddLinkedItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class AddLinkedItem  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String linkedWorkitemURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId role;

    public AddLinkedItem() {
    }

    public AddLinkedItem(
           java.lang.String workitemURI,
           java.lang.String linkedWorkitemURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
           this.workitemURI = workitemURI;
           this.linkedWorkitemURI = linkedWorkitemURI;
           this.role = role;
    }


    /**
     * Gets the workitemURI value for this AddLinkedItem.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this AddLinkedItem.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the linkedWorkitemURI value for this AddLinkedItem.
     * 
     * @return linkedWorkitemURI
     */
    public java.lang.String getLinkedWorkitemURI() {
        return linkedWorkitemURI;
    }


    /**
     * Sets the linkedWorkitemURI value for this AddLinkedItem.
     * 
     * @param linkedWorkitemURI
     */
    public void setLinkedWorkitemURI(java.lang.String linkedWorkitemURI) {
        this.linkedWorkitemURI = linkedWorkitemURI;
    }


    /**
     * Gets the role value for this AddLinkedItem.
     * 
     * @return role
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getRole() {
        return role;
    }


    /**
     * Sets the role value for this AddLinkedItem.
     * 
     * @param role
     */
    public void setRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId role) {
        this.role = role;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddLinkedItem)) return false;
        AddLinkedItem other = (AddLinkedItem) obj;
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
            ((this.linkedWorkitemURI==null && other.getLinkedWorkitemURI()==null) || 
             (this.linkedWorkitemURI!=null &&
              this.linkedWorkitemURI.equals(other.getLinkedWorkitemURI()))) &&
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
        if (getLinkedWorkitemURI() != null) {
            _hashCode += getLinkedWorkitemURI().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddLinkedItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedWorkitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedWorkitemURI"));
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
