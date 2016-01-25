/**
 * CreateSummaryDefectResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement.internal;

public class CreateSummaryDefectResponse  implements java.io.Serializable {
    private java.lang.String createSummaryDefectReturn;

    public CreateSummaryDefectResponse() {
    }

    public CreateSummaryDefectResponse(
           java.lang.String createSummaryDefectReturn) {
           this.createSummaryDefectReturn = createSummaryDefectReturn;
    }


    /**
     * Gets the createSummaryDefectReturn value for this CreateSummaryDefectResponse.
     * 
     * @return createSummaryDefectReturn
     */
    public java.lang.String getCreateSummaryDefectReturn() {
        return createSummaryDefectReturn;
    }


    /**
     * Sets the createSummaryDefectReturn value for this CreateSummaryDefectResponse.
     * 
     * @param createSummaryDefectReturn
     */
    public void setCreateSummaryDefectReturn(java.lang.String createSummaryDefectReturn) {
        this.createSummaryDefectReturn = createSummaryDefectReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSummaryDefectResponse)) return false;
        CreateSummaryDefectResponse other = (CreateSummaryDefectResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createSummaryDefectReturn==null && other.getCreateSummaryDefectReturn()==null) || 
             (this.createSummaryDefectReturn!=null &&
              this.createSummaryDefectReturn.equals(other.getCreateSummaryDefectReturn())));
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
        if (getCreateSummaryDefectReturn() != null) {
            _hashCode += getCreateSummaryDefectReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSummaryDefectResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createSummaryDefectResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSummaryDefectReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createSummaryDefectReturn"));
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
