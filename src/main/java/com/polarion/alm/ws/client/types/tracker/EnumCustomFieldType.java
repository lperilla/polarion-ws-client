/**
 * EnumCustomFieldType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class EnumCustomFieldType  extends com.polarion.alm.ws.client.types.tracker.CustomFieldType  implements java.io.Serializable {
    private java.lang.String enumId;

    public EnumCustomFieldType() {
    }

    public EnumCustomFieldType(
           java.lang.Object defaultValue,
           java.lang.String dependsOn,
           java.lang.String description,
           java.lang.String id,
           java.lang.String name,
           boolean required,
           javax.xml.namespace.QName type,
           java.lang.String enumId) {
        super(
            defaultValue,
            dependsOn,
            description,
            id,
            name,
            required,
            type);
        this.enumId = enumId;
    }


    /**
     * Gets the enumId value for this EnumCustomFieldType.
     * 
     * @return enumId
     */
    public java.lang.String getEnumId() {
        return enumId;
    }


    /**
     * Sets the enumId value for this EnumCustomFieldType.
     * 
     * @param enumId
     */
    public void setEnumId(java.lang.String enumId) {
        this.enumId = enumId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnumCustomFieldType)) return false;
        EnumCustomFieldType other = (EnumCustomFieldType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enumId==null && other.getEnumId()==null) || 
             (this.enumId!=null &&
              this.enumId.equals(other.getEnumId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEnumId() != null) {
            _hashCode += getEnumId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumCustomFieldType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumCustomFieldType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "enumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
