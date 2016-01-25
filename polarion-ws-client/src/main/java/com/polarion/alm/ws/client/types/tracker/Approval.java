/**
 * Approval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class Approval  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    private com.polarion.alm.ws.client.types.projects.User user;

    public Approval() {
    }

    public Approval(
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status,
           com.polarion.alm.ws.client.types.projects.User user) {
           this.status = status;
           this.user = user;
    }


    /**
     * Gets the status value for this Approval.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Approval.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }


    /**
     * Gets the user value for this Approval.
     * 
     * @return user
     */
    public com.polarion.alm.ws.client.types.projects.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Approval.
     * 
     * @param user
     */
    public void setUser(com.polarion.alm.ws.client.types.projects.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Approval)) return false;
        Approval other = (Approval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Approval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "user"));
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
