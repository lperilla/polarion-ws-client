/**
 * SetCommentTags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class SetCommentTags  implements java.io.Serializable {
    private java.lang.String commentURI;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags;

    public SetCommentTags() {
    }

    public SetCommentTags(
           java.lang.String commentURI,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags) {
           this.commentURI = commentURI;
           this.tags = tags;
    }


    /**
     * Gets the commentURI value for this SetCommentTags.
     * 
     * @return commentURI
     */
    public java.lang.String getCommentURI() {
        return commentURI;
    }


    /**
     * Sets the commentURI value for this SetCommentTags.
     * 
     * @param commentURI
     */
    public void setCommentURI(java.lang.String commentURI) {
        this.commentURI = commentURI;
    }


    /**
     * Gets the tags value for this SetCommentTags.
     * 
     * @return tags
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getTags() {
        return tags;
    }


    /**
     * Sets the tags value for this SetCommentTags.
     * 
     * @param tags
     */
    public void setTags(com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags) {
        this.tags = tags;
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getTags(int i) {
        return this.tags[i];
    }

    public void setTags(int i, com.polarion.alm.ws.client.types.tracker.EnumOptionId _value) {
        this.tags[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetCommentTags)) return false;
        SetCommentTags other = (SetCommentTags) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentURI==null && other.getCommentURI()==null) || 
             (this.commentURI!=null &&
              this.commentURI.equals(other.getCommentURI()))) &&
            ((this.tags==null && other.getTags()==null) || 
             (this.tags!=null &&
              java.util.Arrays.equals(this.tags, other.getTags())));
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
        if (getCommentURI() != null) {
            _hashCode += getCommentURI().hashCode();
        }
        if (getTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTags(), i);
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
        new org.apache.axis.description.TypeDesc(SetCommentTags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setCommentTags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "tags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
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
