/**
 * CreateDocumentCommentReplyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class CreateDocumentCommentReplyResponse  implements java.io.Serializable {
    private java.lang.String createDocumentCommentReplyReturn;

    public CreateDocumentCommentReplyResponse() {
    }

    public CreateDocumentCommentReplyResponse(
           java.lang.String createDocumentCommentReplyReturn) {
           this.createDocumentCommentReplyReturn = createDocumentCommentReplyReturn;
    }


    /**
     * Gets the createDocumentCommentReplyReturn value for this CreateDocumentCommentReplyResponse.
     * 
     * @return createDocumentCommentReplyReturn
     */
    public java.lang.String getCreateDocumentCommentReplyReturn() {
        return createDocumentCommentReplyReturn;
    }


    /**
     * Sets the createDocumentCommentReplyReturn value for this CreateDocumentCommentReplyResponse.
     * 
     * @param createDocumentCommentReplyReturn
     */
    public void setCreateDocumentCommentReplyReturn(java.lang.String createDocumentCommentReplyReturn) {
        this.createDocumentCommentReplyReturn = createDocumentCommentReplyReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDocumentCommentReplyResponse)) return false;
        CreateDocumentCommentReplyResponse other = (CreateDocumentCommentReplyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDocumentCommentReplyReturn==null && other.getCreateDocumentCommentReplyReturn()==null) || 
             (this.createDocumentCommentReplyReturn!=null &&
              this.createDocumentCommentReplyReturn.equals(other.getCreateDocumentCommentReplyReturn())));
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
        if (getCreateDocumentCommentReplyReturn() != null) {
            _hashCode += getCreateDocumentCommentReplyReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDocumentCommentReplyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReplyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDocumentCommentReplyReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReplyReturn"));
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
