/**
 * GetWikiContentForTestRunResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class GetWikiContentForTestRunResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.Text getWikiContentForTestRunReturn;

    public GetWikiContentForTestRunResponse() {
    }

    public GetWikiContentForTestRunResponse(
           com.polarion.alm.ws.client.types.Text getWikiContentForTestRunReturn) {
           this.getWikiContentForTestRunReturn = getWikiContentForTestRunReturn;
    }


    /**
     * Gets the getWikiContentForTestRunReturn value for this GetWikiContentForTestRunResponse.
     * 
     * @return getWikiContentForTestRunReturn
     */
    public com.polarion.alm.ws.client.types.Text getGetWikiContentForTestRunReturn() {
        return getWikiContentForTestRunReturn;
    }


    /**
     * Sets the getWikiContentForTestRunReturn value for this GetWikiContentForTestRunResponse.
     * 
     * @param getWikiContentForTestRunReturn
     */
    public void setGetWikiContentForTestRunReturn(com.polarion.alm.ws.client.types.Text getWikiContentForTestRunReturn) {
        this.getWikiContentForTestRunReturn = getWikiContentForTestRunReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWikiContentForTestRunResponse)) return false;
        GetWikiContentForTestRunResponse other = (GetWikiContentForTestRunResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWikiContentForTestRunReturn==null && other.getGetWikiContentForTestRunReturn()==null) || 
             (this.getWikiContentForTestRunReturn!=null &&
              this.getWikiContentForTestRunReturn.equals(other.getGetWikiContentForTestRunReturn())));
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
        if (getGetWikiContentForTestRunReturn() != null) {
            _hashCode += getGetWikiContentForTestRunReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWikiContentForTestRunResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getWikiContentForTestRunResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWikiContentForTestRunReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getWikiContentForTestRunReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
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
