/**
 * GetEnumOptionFromObjectUriForKeyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetEnumOptionFromObjectUriForKeyResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForKeyReturn;

    public GetEnumOptionFromObjectUriForKeyResponse() {
    }

    public GetEnumOptionFromObjectUriForKeyResponse(
           com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForKeyReturn) {
           this.getEnumOptionFromObjectUriForKeyReturn = getEnumOptionFromObjectUriForKeyReturn;
    }


    /**
     * Gets the getEnumOptionFromObjectUriForKeyReturn value for this GetEnumOptionFromObjectUriForKeyResponse.
     * 
     * @return getEnumOptionFromObjectUriForKeyReturn
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption getGetEnumOptionFromObjectUriForKeyReturn() {
        return getEnumOptionFromObjectUriForKeyReturn;
    }


    /**
     * Sets the getEnumOptionFromObjectUriForKeyReturn value for this GetEnumOptionFromObjectUriForKeyResponse.
     * 
     * @param getEnumOptionFromObjectUriForKeyReturn
     */
    public void setGetEnumOptionFromObjectUriForKeyReturn(com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForKeyReturn) {
        this.getEnumOptionFromObjectUriForKeyReturn = getEnumOptionFromObjectUriForKeyReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnumOptionFromObjectUriForKeyResponse)) return false;
        GetEnumOptionFromObjectUriForKeyResponse other = (GetEnumOptionFromObjectUriForKeyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEnumOptionFromObjectUriForKeyReturn==null && other.getGetEnumOptionFromObjectUriForKeyReturn()==null) || 
             (this.getEnumOptionFromObjectUriForKeyReturn!=null &&
              this.getEnumOptionFromObjectUriForKeyReturn.equals(other.getGetEnumOptionFromObjectUriForKeyReturn())));
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
        if (getGetEnumOptionFromObjectUriForKeyReturn() != null) {
            _hashCode += getGetEnumOptionFromObjectUriForKeyReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnumOptionFromObjectUriForKeyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionFromObjectUriForKeyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEnumOptionFromObjectUriForKeyReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionFromObjectUriForKeyReturn"));
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
