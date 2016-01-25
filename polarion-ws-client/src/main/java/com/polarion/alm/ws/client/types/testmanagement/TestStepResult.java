/**
 * TestStepResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement;

public class TestStepResult  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments;

    private com.polarion.alm.ws.client.types.Text comment;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId result;

    public TestStepResult() {
    }

    public TestStepResult(
           com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments,
           com.polarion.alm.ws.client.types.Text comment,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId result) {
           this.attachments = attachments;
           this.comment = comment;
           this.result = result;
    }


    /**
     * Gets the attachments value for this TestStepResult.
     * 
     * @return attachments
     */
    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TestStepResult.
     * 
     * @param attachments
     */
    public void setAttachments(com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the comment value for this TestStepResult.
     * 
     * @return comment
     */
    public com.polarion.alm.ws.client.types.Text getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TestStepResult.
     * 
     * @param comment
     */
    public void setComment(com.polarion.alm.ws.client.types.Text comment) {
        this.comment = comment;
    }


    /**
     * Gets the result value for this TestStepResult.
     * 
     * @return result
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getResult() {
        return result;
    }


    /**
     * Sets the result value for this TestStepResult.
     * 
     * @param result
     */
    public void setResult(com.polarion.alm.ws.client.types.tracker.EnumOptionId result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestStepResult)) return false;
        TestStepResult other = (TestStepResult) obj;
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
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestStepResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult"));
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
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
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
