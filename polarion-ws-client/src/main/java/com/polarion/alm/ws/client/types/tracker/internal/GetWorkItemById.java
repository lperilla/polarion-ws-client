/**
 * GetWorkItemById.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWorkItemById  implements java.io.Serializable {
    private java.lang.String projectId;

    private java.lang.String workitemId;

    public GetWorkItemById() {
    }

    public GetWorkItemById(
           java.lang.String projectId,
           java.lang.String workitemId) {
           this.projectId = projectId;
           this.workitemId = workitemId;
    }


    /**
     * Gets the projectId value for this GetWorkItemById.
     * 
     * @return projectId
     */
    public java.lang.String getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this GetWorkItemById.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.String projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the workitemId value for this GetWorkItemById.
     * 
     * @return workitemId
     */
    public java.lang.String getWorkitemId() {
        return workitemId;
    }


    /**
     * Sets the workitemId value for this GetWorkItemById.
     * 
     * @param workitemId
     */
    public void setWorkitemId(java.lang.String workitemId) {
        this.workitemId = workitemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkItemById)) return false;
        GetWorkItemById other = (GetWorkItemById) obj;
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
            ((this.workitemId==null && other.getWorkitemId()==null) || 
             (this.workitemId!=null &&
              this.workitemId.equals(other.getWorkitemId())));
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
        if (getWorkitemId() != null) {
            _hashCode += getWorkitemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkItemById.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemById"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemId"));
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
