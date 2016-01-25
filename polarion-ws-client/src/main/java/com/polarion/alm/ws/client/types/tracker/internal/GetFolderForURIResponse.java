/**
 * GetFolderForURIResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetFolderForURIResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.Folder getFolderForURIReturn;

    public GetFolderForURIResponse() {
    }

    public GetFolderForURIResponse(
           com.polarion.alm.ws.client.types.tracker.Folder getFolderForURIReturn) {
           this.getFolderForURIReturn = getFolderForURIReturn;
    }


    /**
     * Gets the getFolderForURIReturn value for this GetFolderForURIResponse.
     * 
     * @return getFolderForURIReturn
     */
    public com.polarion.alm.ws.client.types.tracker.Folder getGetFolderForURIReturn() {
        return getFolderForURIReturn;
    }


    /**
     * Sets the getFolderForURIReturn value for this GetFolderForURIResponse.
     * 
     * @param getFolderForURIReturn
     */
    public void setGetFolderForURIReturn(com.polarion.alm.ws.client.types.tracker.Folder getFolderForURIReturn) {
        this.getFolderForURIReturn = getFolderForURIReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFolderForURIResponse)) return false;
        GetFolderForURIResponse other = (GetFolderForURIResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFolderForURIReturn==null && other.getGetFolderForURIReturn()==null) || 
             (this.getFolderForURIReturn!=null &&
              this.getFolderForURIReturn.equals(other.getGetFolderForURIReturn())));
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
        if (getGetFolderForURIReturn() != null) {
            _hashCode += getGetFolderForURIReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFolderForURIResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolderForURIResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFolderForURIReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolderForURIReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder"));
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
