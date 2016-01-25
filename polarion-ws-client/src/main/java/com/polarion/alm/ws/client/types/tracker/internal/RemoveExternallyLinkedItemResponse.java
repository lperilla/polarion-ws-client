/**
 * RemoveExternallyLinkedItemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class RemoveExternallyLinkedItemResponse  implements java.io.Serializable {
    private boolean removeExternallyLinkedItemReturn;

    public RemoveExternallyLinkedItemResponse() {
    }

    public RemoveExternallyLinkedItemResponse(
           boolean removeExternallyLinkedItemReturn) {
           this.removeExternallyLinkedItemReturn = removeExternallyLinkedItemReturn;
    }


    /**
     * Gets the removeExternallyLinkedItemReturn value for this RemoveExternallyLinkedItemResponse.
     * 
     * @return removeExternallyLinkedItemReturn
     */
    public boolean isRemoveExternallyLinkedItemReturn() {
        return removeExternallyLinkedItemReturn;
    }


    /**
     * Sets the removeExternallyLinkedItemReturn value for this RemoveExternallyLinkedItemResponse.
     * 
     * @param removeExternallyLinkedItemReturn
     */
    public void setRemoveExternallyLinkedItemReturn(boolean removeExternallyLinkedItemReturn) {
        this.removeExternallyLinkedItemReturn = removeExternallyLinkedItemReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveExternallyLinkedItemResponse)) return false;
        RemoveExternallyLinkedItemResponse other = (RemoveExternallyLinkedItemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.removeExternallyLinkedItemReturn == other.isRemoveExternallyLinkedItemReturn();
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
        _hashCode += (isRemoveExternallyLinkedItemReturn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveExternallyLinkedItemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternallyLinkedItemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeExternallyLinkedItemReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeExternallyLinkedItemReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
