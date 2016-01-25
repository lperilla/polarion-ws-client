/**
 * SetResolvedComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class SetResolvedComment  implements java.io.Serializable {
    private java.lang.String commentURI;

    private boolean resolved;

    public SetResolvedComment() {
    }

    public SetResolvedComment(
           java.lang.String commentURI,
           boolean resolved) {
           this.commentURI = commentURI;
           this.resolved = resolved;
    }


    /**
     * Gets the commentURI value for this SetResolvedComment.
     * 
     * @return commentURI
     */
    public java.lang.String getCommentURI() {
        return commentURI;
    }


    /**
     * Sets the commentURI value for this SetResolvedComment.
     * 
     * @param commentURI
     */
    public void setCommentURI(java.lang.String commentURI) {
        this.commentURI = commentURI;
    }


    /**
     * Gets the resolved value for this SetResolvedComment.
     * 
     * @return resolved
     */
    public boolean isResolved() {
        return resolved;
    }


    /**
     * Sets the resolved value for this SetResolvedComment.
     * 
     * @param resolved
     */
    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetResolvedComment)) return false;
        SetResolvedComment other = (SetResolvedComment) obj;
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
            this.resolved == other.isResolved();
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
        _hashCode += (isResolved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetResolvedComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setResolvedComment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
