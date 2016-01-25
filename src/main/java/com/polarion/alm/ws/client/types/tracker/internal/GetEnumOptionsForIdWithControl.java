/**
 * GetEnumOptionsForIdWithControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetEnumOptionsForIdWithControl  implements java.io.Serializable {
    private java.lang.String projectID;

    private java.lang.String enumID;

    private java.lang.String controlValue;

    public GetEnumOptionsForIdWithControl() {
    }

    public GetEnumOptionsForIdWithControl(
           java.lang.String projectID,
           java.lang.String enumID,
           java.lang.String controlValue) {
           this.projectID = projectID;
           this.enumID = enumID;
           this.controlValue = controlValue;
    }


    /**
     * Gets the projectID value for this GetEnumOptionsForIdWithControl.
     * 
     * @return projectID
     */
    public java.lang.String getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this GetEnumOptionsForIdWithControl.
     * 
     * @param projectID
     */
    public void setProjectID(java.lang.String projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the enumID value for this GetEnumOptionsForIdWithControl.
     * 
     * @return enumID
     */
    public java.lang.String getEnumID() {
        return enumID;
    }


    /**
     * Sets the enumID value for this GetEnumOptionsForIdWithControl.
     * 
     * @param enumID
     */
    public void setEnumID(java.lang.String enumID) {
        this.enumID = enumID;
    }


    /**
     * Gets the controlValue value for this GetEnumOptionsForIdWithControl.
     * 
     * @return controlValue
     */
    public java.lang.String getControlValue() {
        return controlValue;
    }


    /**
     * Sets the controlValue value for this GetEnumOptionsForIdWithControl.
     * 
     * @param controlValue
     */
    public void setControlValue(java.lang.String controlValue) {
        this.controlValue = controlValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEnumOptionsForIdWithControl)) return false;
        GetEnumOptionsForIdWithControl other = (GetEnumOptionsForIdWithControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.projectID==null && other.getProjectID()==null) || 
             (this.projectID!=null &&
              this.projectID.equals(other.getProjectID()))) &&
            ((this.enumID==null && other.getEnumID()==null) || 
             (this.enumID!=null &&
              this.enumID.equals(other.getEnumID()))) &&
            ((this.controlValue==null && other.getControlValue()==null) || 
             (this.controlValue!=null &&
              this.controlValue.equals(other.getControlValue())));
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
        if (getProjectID() != null) {
            _hashCode += getProjectID().hashCode();
        }
        if (getEnumID() != null) {
            _hashCode += getEnumID().hashCode();
        }
        if (getControlValue() != null) {
            _hashCode += getControlValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEnumOptionsForIdWithControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForIdWithControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "controlValue"));
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
