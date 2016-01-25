/**
 * UpdateTestRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class UpdateTestRecord  implements java.io.Serializable {
    private java.lang.String testRunUri;

    private int index;

    private java.lang.String testResultId;

    private com.polarion.alm.ws.client.types.Text testComment;

    private java.lang.String executedByUri;

    private java.util.Calendar executed;

    private float duration;

    private java.lang.String defectUri;

    public UpdateTestRecord() {
    }

    public UpdateTestRecord(
           java.lang.String testRunUri,
           int index,
           java.lang.String testResultId,
           com.polarion.alm.ws.client.types.Text testComment,
           java.lang.String executedByUri,
           java.util.Calendar executed,
           float duration,
           java.lang.String defectUri) {
           this.testRunUri = testRunUri;
           this.index = index;
           this.testResultId = testResultId;
           this.testComment = testComment;
           this.executedByUri = executedByUri;
           this.executed = executed;
           this.duration = duration;
           this.defectUri = defectUri;
    }


    /**
     * Gets the testRunUri value for this UpdateTestRecord.
     * 
     * @return testRunUri
     */
    public java.lang.String getTestRunUri() {
        return testRunUri;
    }


    /**
     * Sets the testRunUri value for this UpdateTestRecord.
     * 
     * @param testRunUri
     */
    public void setTestRunUri(java.lang.String testRunUri) {
        this.testRunUri = testRunUri;
    }


    /**
     * Gets the index value for this UpdateTestRecord.
     * 
     * @return index
     */
    public int getIndex() {
        return index;
    }


    /**
     * Sets the index value for this UpdateTestRecord.
     * 
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }


    /**
     * Gets the testResultId value for this UpdateTestRecord.
     * 
     * @return testResultId
     */
    public java.lang.String getTestResultId() {
        return testResultId;
    }


    /**
     * Sets the testResultId value for this UpdateTestRecord.
     * 
     * @param testResultId
     */
    public void setTestResultId(java.lang.String testResultId) {
        this.testResultId = testResultId;
    }


    /**
     * Gets the testComment value for this UpdateTestRecord.
     * 
     * @return testComment
     */
    public com.polarion.alm.ws.client.types.Text getTestComment() {
        return testComment;
    }


    /**
     * Sets the testComment value for this UpdateTestRecord.
     * 
     * @param testComment
     */
    public void setTestComment(com.polarion.alm.ws.client.types.Text testComment) {
        this.testComment = testComment;
    }


    /**
     * Gets the executedByUri value for this UpdateTestRecord.
     * 
     * @return executedByUri
     */
    public java.lang.String getExecutedByUri() {
        return executedByUri;
    }


    /**
     * Sets the executedByUri value for this UpdateTestRecord.
     * 
     * @param executedByUri
     */
    public void setExecutedByUri(java.lang.String executedByUri) {
        this.executedByUri = executedByUri;
    }


    /**
     * Gets the executed value for this UpdateTestRecord.
     * 
     * @return executed
     */
    public java.util.Calendar getExecuted() {
        return executed;
    }


    /**
     * Sets the executed value for this UpdateTestRecord.
     * 
     * @param executed
     */
    public void setExecuted(java.util.Calendar executed) {
        this.executed = executed;
    }


    /**
     * Gets the duration value for this UpdateTestRecord.
     * 
     * @return duration
     */
    public float getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this UpdateTestRecord.
     * 
     * @param duration
     */
    public void setDuration(float duration) {
        this.duration = duration;
    }


    /**
     * Gets the defectUri value for this UpdateTestRecord.
     * 
     * @return defectUri
     */
    public java.lang.String getDefectUri() {
        return defectUri;
    }


    /**
     * Sets the defectUri value for this UpdateTestRecord.
     * 
     * @param defectUri
     */
    public void setDefectUri(java.lang.String defectUri) {
        this.defectUri = defectUri;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateTestRecord)) return false;
        UpdateTestRecord other = (UpdateTestRecord) obj;
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
            this.index == other.getIndex() &&
            ((this.testResultId==null && other.getTestResultId()==null) || 
             (this.testResultId!=null &&
              this.testResultId.equals(other.getTestResultId()))) &&
            ((this.testComment==null && other.getTestComment()==null) || 
             (this.testComment!=null &&
              this.testComment.equals(other.getTestComment()))) &&
            ((this.executedByUri==null && other.getExecutedByUri()==null) || 
             (this.executedByUri!=null &&
              this.executedByUri.equals(other.getExecutedByUri()))) &&
            ((this.executed==null && other.getExecuted()==null) || 
             (this.executed!=null &&
              this.executed.equals(other.getExecuted()))) &&
            this.duration == other.getDuration() &&
            ((this.defectUri==null && other.getDefectUri()==null) || 
             (this.defectUri!=null &&
              this.defectUri.equals(other.getDefectUri())));
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
        _hashCode += getIndex();
        if (getTestResultId() != null) {
            _hashCode += getTestResultId().hashCode();
        }
        if (getTestComment() != null) {
            _hashCode += getTestComment().hashCode();
        }
        if (getExecutedByUri() != null) {
            _hashCode += getExecutedByUri().hashCode();
        }
        if (getExecuted() != null) {
            _hashCode += getExecuted().hashCode();
        }
        _hashCode += new Float(getDuration()).hashCode();
        if (getDefectUri() != null) {
            _hashCode += getDefectUri().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateTestRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testResultId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testResultId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedByUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executedByUri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectUri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectUri"));
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
