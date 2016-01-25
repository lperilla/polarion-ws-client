/**
 * GetWikiPageByUriWithFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWikiPageByUriWithFieldsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriWithFieldsReturn;

    public GetWikiPageByUriWithFieldsResponse() {
    }

    public GetWikiPageByUriWithFieldsResponse(
           com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriWithFieldsReturn) {
           this.getWikiPageByUriWithFieldsReturn = getWikiPageByUriWithFieldsReturn;
    }


    /**
     * Gets the getWikiPageByUriWithFieldsReturn value for this GetWikiPageByUriWithFieldsResponse.
     * 
     * @return getWikiPageByUriWithFieldsReturn
     */
    public com.polarion.alm.ws.client.types.tracker.WikiPage getGetWikiPageByUriWithFieldsReturn() {
        return getWikiPageByUriWithFieldsReturn;
    }


    /**
     * Sets the getWikiPageByUriWithFieldsReturn value for this GetWikiPageByUriWithFieldsResponse.
     * 
     * @param getWikiPageByUriWithFieldsReturn
     */
    public void setGetWikiPageByUriWithFieldsReturn(com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriWithFieldsReturn) {
        this.getWikiPageByUriWithFieldsReturn = getWikiPageByUriWithFieldsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWikiPageByUriWithFieldsResponse)) return false;
        GetWikiPageByUriWithFieldsResponse other = (GetWikiPageByUriWithFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWikiPageByUriWithFieldsReturn==null && other.getGetWikiPageByUriWithFieldsReturn()==null) || 
             (this.getWikiPageByUriWithFieldsReturn!=null &&
              this.getWikiPageByUriWithFieldsReturn.equals(other.getGetWikiPageByUriWithFieldsReturn())));
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
        if (getGetWikiPageByUriWithFieldsReturn() != null) {
            _hashCode += getGetWikiPageByUriWithFieldsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWikiPageByUriWithFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUriWithFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWikiPageByUriWithFieldsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUriWithFieldsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
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
