/**
 * GetRevisionByUriResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetRevisionByUriResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.Revision getRevisionByUriReturn;

    public GetRevisionByUriResponse() {
    }

    public GetRevisionByUriResponse(
           com.polarion.alm.ws.client.types.Revision getRevisionByUriReturn) {
           this.getRevisionByUriReturn = getRevisionByUriReturn;
    }


    /**
     * Gets the getRevisionByUriReturn value for this GetRevisionByUriResponse.
     * 
     * @return getRevisionByUriReturn
     */
    public com.polarion.alm.ws.client.types.Revision getGetRevisionByUriReturn() {
        return getRevisionByUriReturn;
    }


    /**
     * Sets the getRevisionByUriReturn value for this GetRevisionByUriResponse.
     * 
     * @param getRevisionByUriReturn
     */
    public void setGetRevisionByUriReturn(com.polarion.alm.ws.client.types.Revision getRevisionByUriReturn) {
        this.getRevisionByUriReturn = getRevisionByUriReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRevisionByUriResponse)) return false;
        GetRevisionByUriResponse other = (GetRevisionByUriResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRevisionByUriReturn==null && other.getGetRevisionByUriReturn()==null) || 
             (this.getRevisionByUriReturn!=null &&
              this.getRevisionByUriReturn.equals(other.getGetRevisionByUriReturn())));
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
        if (getGetRevisionByUriReturn() != null) {
            _hashCode += getGetRevisionByUriReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRevisionByUriResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisionByUriResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRevisionByUriReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionByUriReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
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
