/**
 * CreateSummaryDefect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class CreateSummaryDefect  implements java.io.Serializable {
    private java.lang.String testRunUri;

    private java.lang.String defectTemplateUri;

    public CreateSummaryDefect() {
    }

    public CreateSummaryDefect(
           java.lang.String testRunUri,
           java.lang.String defectTemplateUri) {
           this.testRunUri = testRunUri;
           this.defectTemplateUri = defectTemplateUri;
    }


    /**
     * Gets the testRunUri value for this CreateSummaryDefect.
     * 
     * @return testRunUri
     */
    public java.lang.String getTestRunUri() {
        return testRunUri;
    }


    /**
     * Sets the testRunUri value for this CreateSummaryDefect.
     * 
     * @param testRunUri
     */
    public void setTestRunUri(java.lang.String testRunUri) {
        this.testRunUri = testRunUri;
    }


    /**
     * Gets the defectTemplateUri value for this CreateSummaryDefect.
     * 
     * @return defectTemplateUri
     */
    public java.lang.String getDefectTemplateUri() {
        return defectTemplateUri;
    }


    /**
     * Sets the defectTemplateUri value for this CreateSummaryDefect.
     * 
     * @param defectTemplateUri
     */
    public void setDefectTemplateUri(java.lang.String defectTemplateUri) {
        this.defectTemplateUri = defectTemplateUri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSummaryDefect)) return false;
        CreateSummaryDefect other = (CreateSummaryDefect) obj;
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
        if (getDefectTemplateUri() != null) {
            _hashCode += getDefectTemplateUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSummaryDefect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createSummaryDefect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
