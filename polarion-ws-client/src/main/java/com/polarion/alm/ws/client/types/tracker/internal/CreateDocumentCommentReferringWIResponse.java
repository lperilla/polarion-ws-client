/**
 * CreateDocumentCommentReferringWIResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class CreateDocumentCommentReferringWIResponse  implements java.io.Serializable {
    private java.lang.String createDocumentCommentReferringWIReturn;

    public CreateDocumentCommentReferringWIResponse() {
    }

    public CreateDocumentCommentReferringWIResponse(
           java.lang.String createDocumentCommentReferringWIReturn) {
           this.createDocumentCommentReferringWIReturn = createDocumentCommentReferringWIReturn;
    }


    /**
     * Gets the createDocumentCommentReferringWIReturn value for this CreateDocumentCommentReferringWIResponse.
     * 
     * @return createDocumentCommentReferringWIReturn
     */
    public java.lang.String getCreateDocumentCommentReferringWIReturn() {
        return createDocumentCommentReferringWIReturn;
    }


    /**
     * Sets the createDocumentCommentReferringWIReturn value for this CreateDocumentCommentReferringWIResponse.
     * 
     * @param createDocumentCommentReferringWIReturn
     */
    public void setCreateDocumentCommentReferringWIReturn(java.lang.String createDocumentCommentReferringWIReturn) {
        this.createDocumentCommentReferringWIReturn = createDocumentCommentReferringWIReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDocumentCommentReferringWIResponse)) return false;
        CreateDocumentCommentReferringWIResponse other = (CreateDocumentCommentReferringWIResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDocumentCommentReferringWIReturn==null && other.getCreateDocumentCommentReferringWIReturn()==null) || 
             (this.createDocumentCommentReferringWIReturn!=null &&
              this.createDocumentCommentReferringWIReturn.equals(other.getCreateDocumentCommentReferringWIReturn())));
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
        if (getCreateDocumentCommentReferringWIReturn() != null) {
            _hashCode += getCreateDocumentCommentReferringWIReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDocumentCommentReferringWIResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReferringWIResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDocumentCommentReferringWIReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReferringWIReturn"));
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
