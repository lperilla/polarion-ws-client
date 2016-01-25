/**
 * GetLanguageDefinitionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetLanguageDefinitionResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.LanguageDefinition getLanguageDefinitionReturn;

    public GetLanguageDefinitionResponse() {
    }

    public GetLanguageDefinitionResponse(
           com.polarion.alm.ws.client.types.tracker.LanguageDefinition getLanguageDefinitionReturn) {
           this.getLanguageDefinitionReturn = getLanguageDefinitionReturn;
    }


    /**
     * Gets the getLanguageDefinitionReturn value for this GetLanguageDefinitionResponse.
     * 
     * @return getLanguageDefinitionReturn
     */
    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition getGetLanguageDefinitionReturn() {
        return getLanguageDefinitionReturn;
    }


    /**
     * Sets the getLanguageDefinitionReturn value for this GetLanguageDefinitionResponse.
     * 
     * @param getLanguageDefinitionReturn
     */
    public void setGetLanguageDefinitionReturn(com.polarion.alm.ws.client.types.tracker.LanguageDefinition getLanguageDefinitionReturn) {
        this.getLanguageDefinitionReturn = getLanguageDefinitionReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLanguageDefinitionResponse)) return false;
        GetLanguageDefinitionResponse other = (GetLanguageDefinitionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLanguageDefinitionReturn==null && other.getGetLanguageDefinitionReturn()==null) || 
             (this.getLanguageDefinitionReturn!=null &&
              this.getLanguageDefinitionReturn.equals(other.getGetLanguageDefinitionReturn())));
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
        if (getGetLanguageDefinitionReturn() != null) {
            _hashCode += getGetLanguageDefinitionReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLanguageDefinitionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLanguageDefinitionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLanguageDefinitionReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinitionReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition"));
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
