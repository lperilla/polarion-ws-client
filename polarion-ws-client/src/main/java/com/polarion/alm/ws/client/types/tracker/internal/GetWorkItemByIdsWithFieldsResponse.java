/**
 * GetWorkItemByIdsWithFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWorkItemByIdsWithFieldsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByIdsWithFieldsReturn;

    public GetWorkItemByIdsWithFieldsResponse() {
    }

    public GetWorkItemByIdsWithFieldsResponse(
           com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByIdsWithFieldsReturn) {
           this.getWorkItemByIdsWithFieldsReturn = getWorkItemByIdsWithFieldsReturn;
    }


    /**
     * Gets the getWorkItemByIdsWithFieldsReturn value for this GetWorkItemByIdsWithFieldsResponse.
     * 
     * @return getWorkItemByIdsWithFieldsReturn
     */
    public com.polarion.alm.ws.client.types.tracker.WorkItem getGetWorkItemByIdsWithFieldsReturn() {
        return getWorkItemByIdsWithFieldsReturn;
    }


    /**
     * Sets the getWorkItemByIdsWithFieldsReturn value for this GetWorkItemByIdsWithFieldsResponse.
     * 
     * @param getWorkItemByIdsWithFieldsReturn
     */
    public void setGetWorkItemByIdsWithFieldsReturn(com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByIdsWithFieldsReturn) {
        this.getWorkItemByIdsWithFieldsReturn = getWorkItemByIdsWithFieldsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkItemByIdsWithFieldsResponse)) return false;
        GetWorkItemByIdsWithFieldsResponse other = (GetWorkItemByIdsWithFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWorkItemByIdsWithFieldsReturn==null && other.getGetWorkItemByIdsWithFieldsReturn()==null) || 
             (this.getWorkItemByIdsWithFieldsReturn!=null &&
              this.getWorkItemByIdsWithFieldsReturn.equals(other.getGetWorkItemByIdsWithFieldsReturn())));
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
        if (getGetWorkItemByIdsWithFieldsReturn() != null) {
            _hashCode += getGetWorkItemByIdsWithFieldsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWorkItemByIdsWithFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByIdsWithFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWorkItemByIdsWithFieldsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByIdsWithFieldsReturn"));
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
