/**
 * AddCommentToActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class AddCommentToActivity  implements java.io.Serializable {
    private java.lang.String activityGlobalId;

    private com.polarion.alm.ws.client.types.Text commentText;

    public AddCommentToActivity() {
    }

    public AddCommentToActivity(
           java.lang.String activityGlobalId,
           com.polarion.alm.ws.client.types.Text commentText) {
           this.activityGlobalId = activityGlobalId;
           this.commentText = commentText;
    }


    /**
     * Gets the activityGlobalId value for this AddCommentToActivity.
     * 
     * @return activityGlobalId
     */
    public java.lang.String getActivityGlobalId() {
        return activityGlobalId;
    }


    /**
     * Sets the activityGlobalId value for this AddCommentToActivity.
     * 
     * @param activityGlobalId
     */
    public void setActivityGlobalId(java.lang.String activityGlobalId) {
        this.activityGlobalId = activityGlobalId;
    }


    /**
     * Gets the commentText value for this AddCommentToActivity.
     * 
     * @return commentText
     */
    public com.polarion.alm.ws.client.types.Text getCommentText() {
        return commentText;
    }


    /**
     * Sets the commentText value for this AddCommentToActivity.
     * 
     * @param commentText
     */
    public void setCommentText(com.polarion.alm.ws.client.types.Text commentText) {
        this.commentText = commentText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddCommentToActivity)) return false;
        AddCommentToActivity other = (AddCommentToActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityGlobalId==null && other.getActivityGlobalId()==null) || 
             (this.activityGlobalId!=null &&
              this.activityGlobalId.equals(other.getActivityGlobalId()))) &&
            ((this.commentText==null && other.getCommentText()==null) || 
             (this.commentText!=null &&
              this.commentText.equals(other.getCommentText())));
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
        if (getActivityGlobalId() != null) {
            _hashCode += getActivityGlobalId().hashCode();
        }
        if (getCommentText() != null) {
            _hashCode += getCommentText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddCommentToActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addCommentToActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityGlobalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "activityGlobalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentText"));
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
