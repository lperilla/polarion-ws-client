/**
 * UpdateSummaryDefect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class UpdateSummaryDefect  implements java.io.Serializable {
    private java.lang.String testRunUri;

    private java.lang.String source;

    private int totalFailures;

    private int totalErrors;

    private int totalTests;

    private java.lang.String defectTemplateUri;

    public UpdateSummaryDefect() {
    }

    public UpdateSummaryDefect(
           java.lang.String testRunUri,
           java.lang.String source,
           int totalFailures,
           int totalErrors,
           int totalTests,
           java.lang.String defectTemplateUri) {
           this.testRunUri = testRunUri;
           this.source = source;
           this.totalFailures = totalFailures;
           this.totalErrors = totalErrors;
           this.totalTests = totalTests;
           this.defectTemplateUri = defectTemplateUri;
    }


    /**
     * Gets the testRunUri value for this UpdateSummaryDefect.
     * 
     * @return testRunUri
     */
    public java.lang.String getTestRunUri() {
        return testRunUri;
    }


    /**
     * Sets the testRunUri value for this UpdateSummaryDefect.
     * 
     * @param testRunUri
     */
    public void setTestRunUri(java.lang.String testRunUri) {
        this.testRunUri = testRunUri;
    }


    /**
     * Gets the source value for this UpdateSummaryDefect.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this UpdateSummaryDefect.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the totalFailures value for this UpdateSummaryDefect.
     * 
     * @return totalFailures
     */
    public int getTotalFailures() {
        return totalFailures;
    }


    /**
     * Sets the totalFailures value for this UpdateSummaryDefect.
     * 
     * @param totalFailures
     */
    public void setTotalFailures(int totalFailures) {
        this.totalFailures = totalFailures;
    }


    /**
     * Gets the totalErrors value for this UpdateSummaryDefect.
     * 
     * @return totalErrors
     */
    public int getTotalErrors() {
        return totalErrors;
    }


    /**
     * Sets the totalErrors value for this UpdateSummaryDefect.
     * 
     * @param totalErrors
     */
    public void setTotalErrors(int totalErrors) {
        this.totalErrors = totalErrors;
    }


    /**
     * Gets the totalTests value for this UpdateSummaryDefect.
     * 
     * @return totalTests
     */
    public int getTotalTests() {
        return totalTests;
    }


    /**
     * Sets the totalTests value for this UpdateSummaryDefect.
     * 
     * @param totalTests
     */
    public void setTotalTests(int totalTests) {
        this.totalTests = totalTests;
    }


    /**
     * Gets the defectTemplateUri value for this UpdateSummaryDefect.
     * 
     * @return defectTemplateUri
     */
    public java.lang.String getDefectTemplateUri() {
        return defectTemplateUri;
    }


    /**
     * Sets the defectTemplateUri value for this UpdateSummaryDefect.
     * 
     * @param defectTemplateUri
     */
    public void setDefectTemplateUri(java.lang.String defectTemplateUri) {
        this.defectTemplateUri = defectTemplateUri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSummaryDefect)) return false;
        UpdateSummaryDefect other = (UpdateSummaryDefect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.testRunUri==null && other.getTestRunUri()==null) || 
             (this.testRunUri!=null &&
              this.testRunUri.equals(other.getTestRunUri()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            this.totalFailures == other.getTotalFailures() &&
            this.totalErrors == other.getTotalErrors() &&
            this.totalTests == other.getTotalTests() &&
            ((this.defectTemplateUri==null && other.getDefectTemplateUri()==null) || 
             (this.defectTemplateUri!=null &&
              this.defectTemplateUri.equals(other.getDefectTemplateUri())));
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
        if (getTestRunUri() != null) {
            _hashCode += getTestRunUri().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        _hashCode += getTotalFailures();
        _hashCode += getTotalErrors();
        _hashCode += getTotalTests();
        if (getDefectTemplateUri() != null) {
            _hashCode += getDefectTemplateUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSummaryDefect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateSummaryDefect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalTests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectTemplateUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectTemplateUri"));
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
