/**
 * TestRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement;

public class TestRecord  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments;

    private com.polarion.alm.ws.client.types.Text comment;

    private java.lang.String defectURI;

    private java.lang.Float duration;

    private java.util.Calendar executed;

    private java.lang.String executedByURI;

    private java.lang.Integer iteration;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId result;

    private java.lang.String testCaseURI;

    private java.lang.String testCaseRevision;

    private com.polarion.alm.ws.client.types.testmanagement.TestStepResult[] testStepResults;

    public TestRecord() {
    }

    public TestRecord(
           com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments,
           com.polarion.alm.ws.client.types.Text comment,
           java.lang.String defectURI,
           java.lang.Float duration,
           java.util.Calendar executed,
           java.lang.String executedByURI,
           java.lang.Integer iteration,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId result,
           java.lang.String testCaseURI,
           java.lang.String testCaseRevision,
           com.polarion.alm.ws.client.types.testmanagement.TestStepResult[] testStepResults) {
           this.attachments = attachments;
           this.comment = comment;
           this.defectURI = defectURI;
           this.duration = duration;
           this.executed = executed;
           this.executedByURI = executedByURI;
           this.iteration = iteration;
           this.result = result;
           this.testCaseURI = testCaseURI;
           this.testCaseRevision = testCaseRevision;
           this.testStepResults = testStepResults;
    }


    /**
     * Gets the attachments value for this TestRecord.
     * 
     * @return attachments
     */
    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TestRecord.
     * 
     * @param attachments
     */
    public void setAttachments(com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the comment value for this TestRecord.
     * 
     * @return comment
     */
    public com.polarion.alm.ws.client.types.Text getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TestRecord.
     * 
     * @param comment
     */
    public void setComment(com.polarion.alm.ws.client.types.Text comment) {
        this.comment = comment;
    }


    /**
     * Gets the defectURI value for this TestRecord.
     * 
     * @return defectURI
     */
    public java.lang.String getDefectURI() {
        return defectURI;
    }


    /**
     * Sets the defectURI value for this TestRecord.
     * 
     * @param defectURI
     */
    public void setDefectURI(java.lang.String defectURI) {
        this.defectURI = defectURI;
    }


    /**
     * Gets the duration value for this TestRecord.
     * 
     * @return duration
     */
    public java.lang.Float getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TestRecord.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Float duration) {
        this.duration = duration;
    }


    /**
     * Gets the executed value for this TestRecord.
     * 
     * @return executed
     */
    public java.util.Calendar getExecuted() {
        return executed;
    }


    /**
     * Sets the executed value for this TestRecord.
     * 
     * @param executed
     */
    public void setExecuted(java.util.Calendar executed) {
        this.executed = executed;
    }


    /**
     * Gets the executedByURI value for this TestRecord.
     * 
     * @return executedByURI
     */
    public java.lang.String getExecutedByURI() {
        return executedByURI;
    }


    /**
     * Sets the executedByURI value for this TestRecord.
     * 
     * @param executedByURI
     */
    public void setExecutedByURI(java.lang.String executedByURI) {
        this.executedByURI = executedByURI;
    }


    /**
     * Gets the iteration value for this TestRecord.
     * 
     * @return iteration
     */
    public java.lang.Integer getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this TestRecord.
     * 
     * @param iteration
     */
    public void setIteration(java.lang.Integer iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the result value for this TestRecord.
     * 
     * @return result
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getResult() {
        return result;
    }


    /**
     * Sets the result value for this TestRecord.
     * 
     * @param result
     */
    public void setResult(com.polarion.alm.ws.client.types.tracker.EnumOptionId result) {
        this.result = result;
    }


    /**
     * Gets the testCaseURI value for this TestRecord.
     * 
     * @return testCaseURI
     */
    public java.lang.String getTestCaseURI() {
        return testCaseURI;
    }


    /**
     * Sets the testCaseURI value for this TestRecord.
     * 
     * @param testCaseURI
     */
    public void setTestCaseURI(java.lang.String testCaseURI) {
        this.testCaseURI = testCaseURI;
    }


    /**
     * Gets the testCaseRevision value for this TestRecord.
     * 
     * @return testCaseRevision
     */
    public java.lang.String getTestCaseRevision() {
        return testCaseRevision;
    }


    /**
     * Sets the testCaseRevision value for this TestRecord.
     * 
     * @param testCaseRevision
     */
    public void setTestCaseRevision(java.lang.String testCaseRevision) {
        this.testCaseRevision = testCaseRevision;
    }


    /**
     * Gets the testStepResults value for this TestRecord.
     * 
     * @return testStepResults
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestStepResult[] getTestStepResults() {
        return testStepResults;
    }


    /**
     * Sets the testStepResults value for this TestRecord.
     * 
     * @param testStepResults
     */
    public void setTestStepResults(com.polarion.alm.ws.client.types.testmanagement.TestStepResult[] testStepResults) {
        this.testStepResults = testStepResults;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestRecord)) return false;
        TestRecord other = (TestRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.defectURI==null && other.getDefectURI()==null) || 
             (this.defectURI!=null &&
              this.defectURI.equals(other.getDefectURI()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.executed==null && other.getExecuted()==null) || 
             (this.executed!=null &&
              this.executed.equals(other.getExecuted()))) &&
            ((this.executedByURI==null && other.getExecutedByURI()==null) || 
             (this.executedByURI!=null &&
              this.executedByURI.equals(other.getExecutedByURI()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.testCaseURI==null && other.getTestCaseURI()==null) || 
             (this.testCaseURI!=null &&
              this.testCaseURI.equals(other.getTestCaseURI()))) &&
            ((this.testCaseRevision==null && other.getTestCaseRevision()==null) || 
             (this.testCaseRevision!=null &&
              this.testCaseRevision.equals(other.getTestCaseRevision()))) &&
            ((this.testStepResults==null && other.getTestStepResults()==null) || 
             (this.testStepResults!=null &&
              java.util.Arrays.equals(this.testStepResults, other.getTestStepResults())));
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
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDefectURI() != null) {
            _hashCode += getDefectURI().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getExecuted() != null) {
            _hashCode += getExecuted().hashCode();
        }
        if (getExecutedByURI() != null) {
            _hashCode += getExecutedByURI().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getTestCaseURI() != null) {
            _hashCode += getTestCaseURI().hashCode();
        }
        if (getTestCaseRevision() != null) {
            _hashCode += getTestCaseRevision().hashCode();
        }
        if (getTestStepResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestStepResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestStepResults(), i);
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
        new org.apache.axis.description.TypeDesc(TestRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "executed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executedByURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "executedByURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testStepResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testStepResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult"));
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
