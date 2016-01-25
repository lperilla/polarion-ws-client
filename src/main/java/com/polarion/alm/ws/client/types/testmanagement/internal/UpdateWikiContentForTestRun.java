/**
 * UpdateWikiContentForTestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class UpdateWikiContentForTestRun  implements java.io.Serializable {
    private java.lang.String testRunUri;

    private com.polarion.alm.ws.client.types.Text content;

    public UpdateWikiContentForTestRun() {
    }

    public UpdateWikiContentForTestRun(
           java.lang.String testRunUri,
           com.polarion.alm.ws.client.types.Text content) {
           this.testRunUri = testRunUri;
           this.content = content;
    }


    /**
     * Gets the testRunUri value for this UpdateWikiContentForTestRun.
     * 
     * @return testRunUri
     */
    public java.lang.String getTestRunUri() {
        return testRunUri;
    }


    /**
     * Sets the testRunUri value for this UpdateWikiContentForTestRun.
     * 
     * @param testRunUri
     */
    public void setTestRunUri(java.lang.String testRunUri) {
        this.testRunUri = testRunUri;
    }


    /**
     * Gets the content value for this UpdateWikiContentForTestRun.
     * 
     * @return content
     */
    public com.polarion.alm.ws.client.types.Text getContent() {
        return content;
    }


    /**
     * Sets the content value for this UpdateWikiContentForTestRun.
     * 
     * @param content
     */
    public void setContent(com.polarion.alm.ws.client.types.Text content) {
        this.content = content;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateWikiContentForTestRun)) return false;
        UpdateWikiContentForTestRun other = (UpdateWikiContentForTestRun) obj;
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
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent())));
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
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateWikiContentForTestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateWikiContentForTestRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "content"));
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
