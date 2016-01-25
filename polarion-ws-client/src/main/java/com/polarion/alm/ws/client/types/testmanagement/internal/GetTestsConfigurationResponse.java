/**
 * GetTestsConfigurationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class GetTestsConfigurationResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getTestsConfigurationReturn;

    public GetTestsConfigurationResponse() {
    }

    public GetTestsConfigurationResponse(
           com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getTestsConfigurationReturn) {
           this.getTestsConfigurationReturn = getTestsConfigurationReturn;
    }


    /**
     * Gets the getTestsConfigurationReturn value for this GetTestsConfigurationResponse.
     * 
     * @return getTestsConfigurationReturn
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getGetTestsConfigurationReturn() {
        return getTestsConfigurationReturn;
    }


    /**
     * Sets the getTestsConfigurationReturn value for this GetTestsConfigurationResponse.
     * 
     * @param getTestsConfigurationReturn
     */
    public void setGetTestsConfigurationReturn(com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getTestsConfigurationReturn) {
        this.getTestsConfigurationReturn = getTestsConfigurationReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTestsConfigurationResponse)) return false;
        GetTestsConfigurationResponse other = (GetTestsConfigurationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTestsConfigurationReturn==null && other.getGetTestsConfigurationReturn()==null) || 
             (this.getTestsConfigurationReturn!=null &&
              this.getTestsConfigurationReturn.equals(other.getGetTestsConfigurationReturn())));
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
        if (getGetTestsConfigurationReturn() != null) {
            _hashCode += getGetTestsConfigurationReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTestsConfigurationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestsConfigurationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTestsConfigurationReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestsConfigurationReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestsConfiguration"));
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
