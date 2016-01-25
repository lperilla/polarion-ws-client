/**
 * GetPlanStatisticsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.planning.internal;

public class GetPlanStatisticsResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.planning.PlanStatistics getPlanStatisticsReturn;

    public GetPlanStatisticsResponse() {
    }

    public GetPlanStatisticsResponse(
           com.polarion.alm.ws.client.types.planning.PlanStatistics getPlanStatisticsReturn) {
           this.getPlanStatisticsReturn = getPlanStatisticsReturn;
    }


    /**
     * Gets the getPlanStatisticsReturn value for this GetPlanStatisticsResponse.
     * 
     * @return getPlanStatisticsReturn
     */
    public com.polarion.alm.ws.client.types.planning.PlanStatistics getGetPlanStatisticsReturn() {
        return getPlanStatisticsReturn;
    }


    /**
     * Sets the getPlanStatisticsReturn value for this GetPlanStatisticsResponse.
     * 
     * @param getPlanStatisticsReturn
     */
    public void setGetPlanStatisticsReturn(com.polarion.alm.ws.client.types.planning.PlanStatistics getPlanStatisticsReturn) {
        this.getPlanStatisticsReturn = getPlanStatisticsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPlanStatisticsResponse)) return false;
        GetPlanStatisticsResponse other = (GetPlanStatisticsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPlanStatisticsReturn==null && other.getGetPlanStatisticsReturn()==null) || 
             (this.getPlanStatisticsReturn!=null &&
              this.getPlanStatisticsReturn.equals(other.getGetPlanStatisticsReturn())));
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
        if (getGetPlanStatisticsReturn() != null) {
            _hashCode += getGetPlanStatisticsReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPlanStatisticsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanStatisticsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPlanStatisticsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanStatisticsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanStatistics"));
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
