/**
 * GetAvailableEnumOptionIdsForId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetAvailableEnumOptionIdsForId  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String enumID;

    public GetAvailableEnumOptionIdsForId() {
    }

    public GetAvailableEnumOptionIdsForId(
           java.lang.String workitemURI,
           java.lang.String enumID) {
           this.workitemURI = workitemURI;
           this.enumID = enumID;
    }


    /**
     * Gets the workitemURI value for this GetAvailableEnumOptionIdsForId.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this GetAvailableEnumOptionIdsForId.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the enumID value for this GetAvailableEnumOptionIdsForId.
     * 
     * @return enumID
     */
    public java.lang.String getEnumID() {
        return enumID;
    }


    /**
     * Sets the enumID value for this GetAvailableEnumOptionIdsForId.
     * 
     * @param enumID
     */
    public void setEnumID(java.lang.String enumID) {
        this.enumID = enumID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAvailableEnumOptionIdsForId)) return false;
        GetAvailableEnumOptionIdsForId other = (GetAvailableEnumOptionIdsForId) obj;
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
            ((this.enumID==null && other.getEnumID()==null) || 
             (this.enumID!=null &&
              this.enumID.equals(other.getEnumID())));
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
        if (getEnumID() != null) {
            _hashCode += getEnumID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAvailableEnumOptionIdsForId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableEnumOptionIdsForId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"));
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
