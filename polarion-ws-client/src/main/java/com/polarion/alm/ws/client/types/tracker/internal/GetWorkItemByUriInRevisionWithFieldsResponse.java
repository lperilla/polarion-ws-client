/**
 * GetWorkItemByUriInRevisionWithFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWorkItemByUriInRevisionWithFieldsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevisionWithFieldsReturn;

    public GetWorkItemByUriInRevisionWithFieldsResponse() {
    }

    public GetWorkItemByUriInRevisionWithFieldsResponse(
           com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevisionWithFieldsReturn) {
           this.getWorkItemByUriInRevisionWithFieldsReturn = getWorkItemByUriInRevisionWithFieldsReturn;
    }


    /**
     * Gets the getWorkItemByUriInRevisionWithFieldsReturn value for this GetWorkItemByUriInRevisionWithFieldsResponse.
     * 
     * @return getWorkItemByUriInRevisionWithFieldsReturn
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getGetWorkItemByUriInRevisionWithFieldsReturn() {
        return getWorkItemByUriInRevisionWithFieldsReturn;
    }


    /**
     * Sets the getWorkItemByUriInRevisionWithFieldsReturn value for this GetWorkItemByUriInRevisionWithFieldsResponse.
     * 
     * @param getWorkItemByUriInRevisionWithFieldsReturn
     */
    public void setGetWorkItemByUriInRevisionWithFieldsReturn(com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevisionWithFieldsReturn) {
        this.getWorkItemByUriInRevisionWithFieldsReturn = getWorkItemByUriInRevisionWithFieldsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkItemByUriInRevisionWithFieldsResponse)) return false;
        GetWorkItemByUriInRevisionWithFieldsResponse other = (GetWorkItemByUriInRevisionWithFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWorkItemByUriInRevisionWithFieldsReturn==null && other.getGetWorkItemByUriInRevisionWithFieldsReturn()==null) || 
             (this.getWorkItemByUriInRevisionWithFieldsReturn!=null &&
              this.getWorkItemByUriInRevisionWithFieldsReturn.equals(other.getGetWorkItemByUriInRevisionWithFieldsReturn())));
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
        if (getGetWorkItemByUriInRevisionWithFieldsReturn() != null) {
            _hashCode += getGetWorkItemByUriInRevisionWithFieldsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkItemByUriInRevisionWithFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriInRevisionWithFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWorkItemByUriInRevisionWithFieldsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriInRevisionWithFieldsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
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
