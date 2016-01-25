/**
 * GetTestRunByUriResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class GetTestRunByUriResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunByUriReturn;

    public GetTestRunByUriResponse() {
    }

    public GetTestRunByUriResponse(
           com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunByUriReturn) {
           this.getTestRunByUriReturn = getTestRunByUriReturn;
    }


    /**
     * Gets the getTestRunByUriReturn value for this GetTestRunByUriResponse.
     * 
     * @return getTestRunByUriReturn
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun getGetTestRunByUriReturn() {
        return getTestRunByUriReturn;
    }


    /**
     * Sets the getTestRunByUriReturn value for this GetTestRunByUriResponse.
     * 
     * @param getTestRunByUriReturn
     */
    public void setGetTestRunByUriReturn(com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunByUriReturn) {
        this.getTestRunByUriReturn = getTestRunByUriReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTestRunByUriResponse)) return false;
        GetTestRunByUriResponse other = (GetTestRunByUriResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTestRunByUriReturn==null && other.getGetTestRunByUriReturn()==null) || 
             (this.getTestRunByUriReturn!=null &&
              this.getTestRunByUriReturn.equals(other.getGetTestRunByUriReturn())));
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
        if (getGetTestRunByUriReturn() != null) {
            _hashCode += getGetTestRunByUriReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTestRunByUriResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunByUriResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTestRunByUriReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunByUriReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
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
