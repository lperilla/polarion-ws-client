/**
 * GetPlanByIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.planning.internal;

public class GetPlanByIdResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.planning.Plan getPlanByIdReturn;

    public GetPlanByIdResponse() {
    }

    public GetPlanByIdResponse(
           com.polarion.alm.ws.client.types.planning.Plan getPlanByIdReturn) {
           this.getPlanByIdReturn = getPlanByIdReturn;
    }


    /**
     * Gets the getPlanByIdReturn value for this GetPlanByIdResponse.
     * 
     * @return getPlanByIdReturn
     */
    public com.polarion.alm.ws.client.types.planning.Plan getGetPlanByIdReturn() {
        return getPlanByIdReturn;
    }


    /**
     * Sets the getPlanByIdReturn value for this GetPlanByIdResponse.
     * 
     * @param getPlanByIdReturn
     */
    public void setGetPlanByIdReturn(com.polarion.alm.ws.client.types.planning.Plan getPlanByIdReturn) {
        this.getPlanByIdReturn = getPlanByIdReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPlanByIdResponse)) return false;
        GetPlanByIdResponse other = (GetPlanByIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPlanByIdReturn==null && other.getGetPlanByIdReturn()==null) || 
             (this.getPlanByIdReturn!=null &&
              this.getPlanByIdReturn.equals(other.getGetPlanByIdReturn())));
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
        if (getGetPlanByIdReturn() != null) {
            _hashCode += getGetPlanByIdReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPlanByIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanByIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPlanByIdReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanByIdReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
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
