/**
 * GetEnumOptionWithEnumIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetEnumOptionWithEnumIdResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithEnumIdReturn;

    public GetEnumOptionWithEnumIdResponse() {
    }

    public GetEnumOptionWithEnumIdResponse(
           com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithEnumIdReturn) {
           this.getEnumOptionWithEnumIdReturn = getEnumOptionWithEnumIdReturn;
    }


    /**
     * Gets the getEnumOptionWithEnumIdReturn value for this GetEnumOptionWithEnumIdResponse.
     * 
     * @return getEnumOptionWithEnumIdReturn
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getGetEnumOptionWithEnumIdReturn() {
        return getEnumOptionWithEnumIdReturn;
    }


    /**
     * Sets the getEnumOptionWithEnumIdReturn value for this GetEnumOptionWithEnumIdResponse.
     * 
     * @param getEnumOptionWithEnumIdReturn
     */
    public void setGetEnumOptionWithEnumIdReturn(com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithEnumIdReturn) {
        this.getEnumOptionWithEnumIdReturn = getEnumOptionWithEnumIdReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnumOptionWithEnumIdResponse)) return false;
        GetEnumOptionWithEnumIdResponse other = (GetEnumOptionWithEnumIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEnumOptionWithEnumIdReturn==null && other.getGetEnumOptionWithEnumIdReturn()==null) || 
             (this.getEnumOptionWithEnumIdReturn!=null &&
              this.getEnumOptionWithEnumIdReturn.equals(other.getGetEnumOptionWithEnumIdReturn())));
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
        if (getGetEnumOptionWithEnumIdReturn() != null) {
            _hashCode += getGetEnumOptionWithEnumIdReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnumOptionWithEnumIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionWithEnumIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEnumOptionWithEnumIdReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionWithEnumIdReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
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
