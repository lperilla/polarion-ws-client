/**
 * GenerateHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GenerateHistory  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String[] ignoredFields;

    private java.lang.String[] fieldOrder;

    public GenerateHistory() {
    }

    public GenerateHistory(
           java.lang.String workitemURI,
           java.lang.String[] ignoredFields,
           java.lang.String[] fieldOrder) {
           this.workitemURI = workitemURI;
           this.ignoredFields = ignoredFields;
           this.fieldOrder = fieldOrder;
    }


    /**
     * Gets the workitemURI value for this GenerateHistory.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this GenerateHistory.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the ignoredFields value for this GenerateHistory.
     * 
     * @return ignoredFields
     */
    public java.lang.String[] getIgnoredFields() {
        return ignoredFields;
    }


    /**
     * Sets the ignoredFields value for this GenerateHistory.
     * 
     * @param ignoredFields
     */
    public void setIgnoredFields(java.lang.String[] ignoredFields) {
        this.ignoredFields = ignoredFields;
    }

    public java.lang.String getIgnoredFields(int i) {
        return this.ignoredFields[i];
    }

    public void setIgnoredFields(int i, java.lang.String _value) {
        this.ignoredFields[i] = _value;
    }


    /**
     * Gets the fieldOrder value for this GenerateHistory.
     * 
     * @return fieldOrder
     */
    public java.lang.String[] getFieldOrder() {
        return fieldOrder;
    }


    /**
     * Sets the fieldOrder value for this GenerateHistory.
     * 
     * @param fieldOrder
     */
    public void setFieldOrder(java.lang.String[] fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    public java.lang.String getFieldOrder(int i) {
        return this.fieldOrder[i];
    }

    public void setFieldOrder(int i, java.lang.String _value) {
        this.fieldOrder[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateHistory)) return false;
        GenerateHistory other = (GenerateHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workitemURI==null && other.getWorkitemURI()==null) || 
             (this.workitemURI!=null &&
              this.workitemURI.equals(other.getWorkitemURI()))) &&
            ((this.ignoredFields==null && other.getIgnoredFields()==null) || 
             (this.ignoredFields!=null &&
              java.util.Arrays.equals(this.ignoredFields, other.getIgnoredFields()))) &&
            ((this.fieldOrder==null && other.getFieldOrder()==null) || 
             (this.fieldOrder!=null &&
              java.util.Arrays.equals(this.fieldOrder, other.getFieldOrder())));
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
        if (getWorkitemURI() != null) {
            _hashCode += getWorkitemURI().hashCode();
        }
        if (getIgnoredFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIgnoredFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIgnoredFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">generateHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoredFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "ignoredFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fieldOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
