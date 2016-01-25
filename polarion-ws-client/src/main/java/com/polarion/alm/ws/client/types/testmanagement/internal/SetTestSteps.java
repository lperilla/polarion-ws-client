/**
 * SetTestSteps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class SetTestSteps  implements java.io.Serializable {
    private java.lang.String workItemURI;

    private com.polarion.alm.ws.client.types.testmanagement.TestStep[] testSteps;

    public SetTestSteps() {
    }

    public SetTestSteps(
           java.lang.String workItemURI,
           com.polarion.alm.ws.client.types.testmanagement.TestStep[] testSteps) {
           this.workItemURI = workItemURI;
           this.testSteps = testSteps;
    }


    /**
     * Gets the workItemURI value for this SetTestSteps.
     * 
     * @return workItemURI
     */
    public java.lang.String getWorkItemURI() {
        return workItemURI;
    }


    /**
     * Sets the workItemURI value for this SetTestSteps.
     * 
     * @param workItemURI
     */
    public void setWorkItemURI(java.lang.String workItemURI) {
        this.workItemURI = workItemURI;
    }


    /**
     * Gets the testSteps value for this SetTestSteps.
     * 
     * @return testSteps
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestStep[] getTestSteps() {
        return testSteps;
    }


    /**
     * Sets the testSteps value for this SetTestSteps.
     * 
     * @param testSteps
     */
    public void setTestSteps(com.polarion.alm.ws.client.types.testmanagement.TestStep[] testSteps) {
        this.testSteps = testSteps;
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestStep getTestSteps(int i) {
        return this.testSteps[i];
    }

    public void setTestSteps(int i, com.polarion.alm.ws.client.types.testmanagement.TestStep _value) {
        this.testSteps[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetTestSteps)) return false;
        SetTestSteps other = (SetTestSteps) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workItemURI==null && other.getWorkItemURI()==null) || 
             (this.workItemURI!=null &&
              this.workItemURI.equals(other.getWorkItemURI()))) &&
            ((this.testSteps==null && other.getTestSteps()==null) || 
             (this.testSteps!=null &&
              java.util.Arrays.equals(this.testSteps, other.getTestSteps())));
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
        if (getWorkItemURI() != null) {
            _hashCode += getWorkItemURI().hashCode();
        }
        if (getTestSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetTestSteps.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">setTestSteps"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "workItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStep"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
