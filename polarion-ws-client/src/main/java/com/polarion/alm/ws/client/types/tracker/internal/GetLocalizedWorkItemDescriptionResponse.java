/**
 * GetLocalizedWorkItemDescriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetLocalizedWorkItemDescriptionResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.Text getLocalizedWorkItemDescriptionReturn;

    public GetLocalizedWorkItemDescriptionResponse() {
    }

    public GetLocalizedWorkItemDescriptionResponse(
           com.polarion.alm.ws.client.types.Text getLocalizedWorkItemDescriptionReturn) {
           this.getLocalizedWorkItemDescriptionReturn = getLocalizedWorkItemDescriptionReturn;
    }


    /**
     * Gets the getLocalizedWorkItemDescriptionReturn value for this GetLocalizedWorkItemDescriptionResponse.
     * 
     * @return getLocalizedWorkItemDescriptionReturn
     */
    public com.polarion.alm.ws.client.types.Text getGetLocalizedWorkItemDescriptionReturn() {
        return getLocalizedWorkItemDescriptionReturn;
    }


    /**
     * Sets the getLocalizedWorkItemDescriptionReturn value for this GetLocalizedWorkItemDescriptionResponse.
     * 
     * @param getLocalizedWorkItemDescriptionReturn
     */
    public void setGetLocalizedWorkItemDescriptionReturn(com.polarion.alm.ws.client.types.Text getLocalizedWorkItemDescriptionReturn) {
        this.getLocalizedWorkItemDescriptionReturn = getLocalizedWorkItemDescriptionReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLocalizedWorkItemDescriptionResponse)) return false;
        GetLocalizedWorkItemDescriptionResponse other = (GetLocalizedWorkItemDescriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLocalizedWorkItemDescriptionReturn==null && other.getGetLocalizedWorkItemDescriptionReturn()==null) || 
             (this.getLocalizedWorkItemDescriptionReturn!=null &&
              this.getLocalizedWorkItemDescriptionReturn.equals(other.getGetLocalizedWorkItemDescriptionReturn())));
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
        if (getGetLocalizedWorkItemDescriptionReturn() != null) {
            _hashCode += getGetLocalizedWorkItemDescriptionReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLocalizedWorkItemDescriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemDescriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLocalizedWorkItemDescriptionReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemDescriptionReturn"));
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
