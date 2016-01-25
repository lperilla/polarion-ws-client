/**
 * GetModuleByLocationWithFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetModuleByLocationWithFieldsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.Module getModuleByLocationWithFieldsReturn;

    public GetModuleByLocationWithFieldsResponse() {
    }

    public GetModuleByLocationWithFieldsResponse(
           com.polarion.alm.ws.client.types.tracker.Module getModuleByLocationWithFieldsReturn) {
           this.getModuleByLocationWithFieldsReturn = getModuleByLocationWithFieldsReturn;
    }


    /**
     * Gets the getModuleByLocationWithFieldsReturn value for this GetModuleByLocationWithFieldsResponse.
     * 
     * @return getModuleByLocationWithFieldsReturn
     */
    public com.polarion.alm.ws.client.types.tracker.Module getGetModuleByLocationWithFieldsReturn() {
        return getModuleByLocationWithFieldsReturn;
    }


    /**
     * Sets the getModuleByLocationWithFieldsReturn value for this GetModuleByLocationWithFieldsResponse.
     * 
     * @param getModuleByLocationWithFieldsReturn
     */
    public void setGetModuleByLocationWithFieldsReturn(com.polarion.alm.ws.client.types.tracker.Module getModuleByLocationWithFieldsReturn) {
        this.getModuleByLocationWithFieldsReturn = getModuleByLocationWithFieldsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetModuleByLocationWithFieldsResponse)) return false;
        GetModuleByLocationWithFieldsResponse other = (GetModuleByLocationWithFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getModuleByLocationWithFieldsReturn==null && other.getGetModuleByLocationWithFieldsReturn()==null) || 
             (this.getModuleByLocationWithFieldsReturn!=null &&
              this.getModuleByLocationWithFieldsReturn.equals(other.getGetModuleByLocationWithFieldsReturn())));
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
        if (getGetModuleByLocationWithFieldsReturn() != null) {
            _hashCode += getGetModuleByLocationWithFieldsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetModuleByLocationWithFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByLocationWithFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getModuleByLocationWithFieldsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByLocationWithFieldsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
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
