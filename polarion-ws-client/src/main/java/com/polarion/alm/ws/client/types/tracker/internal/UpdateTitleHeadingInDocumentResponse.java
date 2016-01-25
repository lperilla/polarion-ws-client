/**
 * UpdateTitleHeadingInDocumentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class UpdateTitleHeadingInDocumentResponse  implements java.io.Serializable {
    private java.lang.String updateTitleHeadingInDocumentReturn;

    public UpdateTitleHeadingInDocumentResponse() {
    }

    public UpdateTitleHeadingInDocumentResponse(
           java.lang.String updateTitleHeadingInDocumentReturn) {
           this.updateTitleHeadingInDocumentReturn = updateTitleHeadingInDocumentReturn;
    }


    /**
     * Gets the updateTitleHeadingInDocumentReturn value for this UpdateTitleHeadingInDocumentResponse.
     * 
     * @return updateTitleHeadingInDocumentReturn
     */
    public java.lang.String getUpdateTitleHeadingInDocumentReturn() {
        return updateTitleHeadingInDocumentReturn;
    }


    /**
     * Sets the updateTitleHeadingInDocumentReturn value for this UpdateTitleHeadingInDocumentResponse.
     * 
     * @param updateTitleHeadingInDocumentReturn
     */
    public void setUpdateTitleHeadingInDocumentReturn(java.lang.String updateTitleHeadingInDocumentReturn) {
        this.updateTitleHeadingInDocumentReturn = updateTitleHeadingInDocumentReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateTitleHeadingInDocumentResponse)) return false;
        UpdateTitleHeadingInDocumentResponse other = (UpdateTitleHeadingInDocumentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateTitleHeadingInDocumentReturn==null && other.getUpdateTitleHeadingInDocumentReturn()==null) || 
             (this.updateTitleHeadingInDocumentReturn!=null &&
              this.updateTitleHeadingInDocumentReturn.equals(other.getUpdateTitleHeadingInDocumentReturn())));
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
        if (getUpdateTitleHeadingInDocumentReturn() != null) {
            _hashCode += getUpdateTitleHeadingInDocumentReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateTitleHeadingInDocumentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateTitleHeadingInDocumentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTitleHeadingInDocumentReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateTitleHeadingInDocumentReturn"));
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
