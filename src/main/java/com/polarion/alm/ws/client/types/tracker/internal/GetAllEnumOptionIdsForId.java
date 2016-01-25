/**
 * GetAllEnumOptionIdsForId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetAllEnumOptionIdsForId  implements java.io.Serializable {
    private java.lang.String projectID;

    private java.lang.String enumId;

    public GetAllEnumOptionIdsForId() {
    }

    public GetAllEnumOptionIdsForId(
           java.lang.String projectID,
           java.lang.String enumId) {
           this.projectID = projectID;
           this.enumId = enumId;
    }


    /**
     * Gets the projectID value for this GetAllEnumOptionIdsForId.
     * 
     * @return projectID
     */
    public java.lang.String getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this GetAllEnumOptionIdsForId.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.String projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the enumId value for this GetAllEnumOptionIdsForId.
     * 
     * @return enumId
     */
    public java.lang.String getEnumId() {
        return enumId;
    }


    /**
     * Sets the enumId value for this GetAllEnumOptionIdsForId.
     * 
     * @param enumId
     */
    public void setEnumId(java.lang.String enumId) {
        this.enumId = enumId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllEnumOptionIdsForId)) return false;
        GetAllEnumOptionIdsForId other = (GetAllEnumOptionIdsForId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.enumId==null && other.getEnumId()==null) || 
             (this.enumId!=null &&
              this.enumId.equals(other.getEnumId())));
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
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getEnumId() != null) {
            _hashCode += getEnumId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllEnumOptionIdsForId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionIdsForId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumId"));
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
