/**
 * GetWorkItemsLinkedToRevisionWithFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetWorkItemsLinkedToRevisionWithFields  implements java.io.Serializable {
    private java.lang.String revisionURI;

    private java.lang.String[] keys;

    public GetWorkItemsLinkedToRevisionWithFields() {
    }

    public GetWorkItemsLinkedToRevisionWithFields(
           java.lang.String revisionURI,
           java.lang.String[] keys) {
           this.revisionURI = revisionURI;
           this.keys = keys;
    }


    /**
     * Gets the revisionURI value for this GetWorkItemsLinkedToRevisionWithFields.
     * 
     * @return revisionURI
     */
    public java.lang.String getRevisionURI() {
        return revisionURI;
    }


    /**
     * Sets the revisionURI value for this GetWorkItemsLinkedToRevisionWithFields.
     * 
     * @param revisionURI
     */
    public void setRevisionURI(java.lang.String revisionURI) {
        this.revisionURI = revisionURI;
    }


    /**
     * Gets the keys value for this GetWorkItemsLinkedToRevisionWithFields.
     * 
     * @return keys
     */
    public java.lang.String[] getKeys() {
        return keys;
    }


    /**
     * Sets the keys value for this GetWorkItemsLinkedToRevisionWithFields.
     * 
     * @param keys
     */
    public void setKeys(java.lang.String[] keys) {
        this.keys = keys;
    }

    public java.lang.String getKeys(int i) {
        return this.keys[i];
    }

    public void setKeys(int i, java.lang.String _value) {
        this.keys[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWorkItemsLinkedToRevisionWithFields)) return false;
        GetWorkItemsLinkedToRevisionWithFields other = (GetWorkItemsLinkedToRevisionWithFields) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.revisionURI==null && other.getRevisionURI()==null) || 
             (this.revisionURI!=null &&
              this.revisionURI.equals(other.getRevisionURI()))) &&
            ((this.keys==null && other.getKeys()==null) || 
             (this.keys!=null &&
              java.util.Arrays.equals(this.keys, other.getKeys())));
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
        if (getRevisionURI() != null) {
            _hashCode += getRevisionURI().hashCode();
        }
        if (getKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeys(), i);
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
        new org.apache.axis.description.TypeDesc(GetWorkItemsLinkedToRevisionWithFields.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsLinkedToRevisionWithFields"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "keys"));
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
