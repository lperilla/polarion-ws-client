/**
 * GetEnumControlKeyForKeyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetEnumControlKeyForKeyResponse  implements java.io.Serializable {
    private java.lang.String getEnumControlKeyForKeyReturn;

    public GetEnumControlKeyForKeyResponse() {
    }

    public GetEnumControlKeyForKeyResponse(
           java.lang.String getEnumControlKeyForKeyReturn) {
           this.getEnumControlKeyForKeyReturn = getEnumControlKeyForKeyReturn;
    }


    /**
     * Gets the getEnumControlKeyForKeyReturn value for this GetEnumControlKeyForKeyResponse.
     * 
     * @return getEnumControlKeyForKeyReturn
     */
    public java.lang.String getGetEnumControlKeyForKeyReturn() {
        return getEnumControlKeyForKeyReturn;
    }


    /**
     * Sets the getEnumControlKeyForKeyReturn value for this GetEnumControlKeyForKeyResponse.
     * 
     * @param getEnumControlKeyForKeyReturn
     */
    public void setGetEnumControlKeyForKeyReturn(java.lang.String getEnumControlKeyForKeyReturn) {
        this.getEnumControlKeyForKeyReturn = getEnumControlKeyForKeyReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnumControlKeyForKeyResponse)) return false;
        GetEnumControlKeyForKeyResponse other = (GetEnumControlKeyForKeyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEnumControlKeyForKeyReturn==null && other.getGetEnumControlKeyForKeyReturn()==null) || 
             (this.getEnumControlKeyForKeyReturn!=null &&
              this.getEnumControlKeyForKeyReturn.equals(other.getGetEnumControlKeyForKeyReturn())));
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
        if (getGetEnumControlKeyForKeyReturn() != null) {
            _hashCode += getGetEnumControlKeyForKeyReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnumControlKeyForKeyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumControlKeyForKeyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEnumControlKeyForKeyReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumControlKeyForKeyReturn"));
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
