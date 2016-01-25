/**
 * BuildTestResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.builder;

public class BuildTestResults  implements java.io.Serializable {
    private java.lang.Integer errorCount;

    private java.lang.Integer failureCount;

    private java.lang.Integer skippedCount;

    private java.lang.Integer testCount;

    public BuildTestResults() {
    }

    public BuildTestResults(
           java.lang.Integer errorCount,
           java.lang.Integer failureCount,
           java.lang.Integer skippedCount,
           java.lang.Integer testCount) {
           this.errorCount = errorCount;
           this.failureCount = failureCount;
           this.skippedCount = skippedCount;
           this.testCount = testCount;
    }


    /**
     * Gets the errorCount value for this BuildTestResults.
     * 
     * @return errorCount
     */
    public java.lang.Integer getErrorCount() {
        return errorCount;
    }


    /**
     * Sets the errorCount value for this BuildTestResults.
     * 
     * @param errorCount
     */
    public void setErrorCount(java.lang.Integer errorCount) {
        this.errorCount = errorCount;
    }


    /**
     * Gets the failureCount value for this BuildTestResults.
     * 
     * @return failureCount
     */
    public java.lang.Integer getFailureCount() {
        return failureCount;
    }


    /**
     * Sets the failureCount value for this BuildTestResults.
     * 
     * @param failureCount
     */
    public void setFailureCount(java.lang.Integer failureCount) {
        this.failureCount = failureCount;
    }


    /**
     * Gets the skippedCount value for this BuildTestResults.
     * 
     * @return skippedCount
     */
    public java.lang.Integer getSkippedCount() {
        return skippedCount;
    }


    /**
     * Sets the skippedCount value for this BuildTestResults.
     * 
     * @param skippedCount
     */
    public void setSkippedCount(java.lang.Integer skippedCount) {
        this.skippedCount = skippedCount;
    }


    /**
     * Gets the testCount value for this BuildTestResults.
     * 
     * @return testCount
     */
    public java.lang.Integer getTestCount() {
        return testCount;
    }


    /**
     * Sets the testCount value for this BuildTestResults.
     * 
     * @param testCount
     */
    public void setTestCount(java.lang.Integer testCount) {
        this.testCount = testCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuildTestResults)) return false;
        BuildTestResults other = (BuildTestResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorCount==null && other.getErrorCount()==null) || 
             (this.errorCount!=null &&
              this.errorCount.equals(other.getErrorCount()))) &&
            ((this.failureCount==null && other.getFailureCount()==null) || 
             (this.failureCount!=null &&
              this.failureCount.equals(other.getFailureCount()))) &&
            ((this.skippedCount==null && other.getSkippedCount()==null) || 
             (this.skippedCount!=null &&
              this.skippedCount.equals(other.getSkippedCount()))) &&
            ((this.testCount==null && other.getTestCount()==null) || 
             (this.testCount!=null &&
              this.testCount.equals(other.getTestCount())));
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
        if (getErrorCount() != null) {
            _hashCode += getErrorCount().hashCode();
        }
        if (getFailureCount() != null) {
            _hashCode += getFailureCount().hashCode();
        }
        if (getSkippedCount() != null) {
            _hashCode += getSkippedCount().hashCode();
        }
        if (getTestCount() != null) {
            _hashCode += getTestCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuildTestResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildTestResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "errorCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "failureCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skippedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "skippedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "testCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
