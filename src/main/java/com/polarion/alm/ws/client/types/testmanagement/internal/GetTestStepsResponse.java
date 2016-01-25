/**
 * GetTestStepsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class GetTestStepsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.testmanagement.TestSteps getTestStepsReturn;

    public GetTestStepsResponse() {
    }

    public GetTestStepsResponse(
           com.polarion.alm.ws.client.types.testmanagement.TestSteps getTestStepsReturn) {
           this.getTestStepsReturn = getTestStepsReturn;
    }


    /**
     * Gets the getTestStepsReturn value for this GetTestStepsResponse.
     * 
     * @return getTestStepsReturn
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestSteps getGetTestStepsReturn() {
        return getTestStepsReturn;
    }


    /**
     * Sets the getTestStepsReturn value for this GetTestStepsResponse.
     * 
     * @param getTestStepsReturn
     */
    public void setGetTestStepsReturn(com.polarion.alm.ws.client.types.testmanagement.TestSteps getTestStepsReturn) {
        this.getTestStepsReturn = getTestStepsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTestStepsResponse)) return false;
        GetTestStepsResponse other = (GetTestStepsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTestStepsReturn==null && other.getGetTestStepsReturn()==null) || 
             (this.getTestStepsReturn!=null &&
              this.getTestStepsReturn.equals(other.getGetTestStepsReturn())));
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
        if (getGetTestStepsReturn() != null) {
            _hashCode += getGetTestStepsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTestStepsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestStepsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTestStepsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestStepsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestSteps"));
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
