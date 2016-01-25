/**
 * GetModuleWorkItemUris.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetModuleWorkItemUris  implements java.io.Serializable {
    private java.lang.String moduleURI;

    private java.lang.String parentWorkItemURI;

    private boolean deep;

    public GetModuleWorkItemUris() {
    }

    public GetModuleWorkItemUris(
           java.lang.String moduleURI,
           java.lang.String parentWorkItemURI,
           boolean deep) {
           this.moduleURI = moduleURI;
           this.parentWorkItemURI = parentWorkItemURI;
           this.deep = deep;
    }


    /**
     * Gets the moduleURI value for this GetModuleWorkItemUris.
     * 
     * @return moduleURI
     */
    public java.lang.String getModuleURI() {
        return moduleURI;
    }


    /**
     * Sets the moduleURI value for this GetModuleWorkItemUris.
     * 
     * @param moduleURI
     */
    public void setModuleURI(java.lang.String moduleURI) {
        this.moduleURI = moduleURI;
    }


    /**
     * Gets the parentWorkItemURI value for this GetModuleWorkItemUris.
     * 
     * @return parentWorkItemURI
     */
    public java.lang.String getParentWorkItemURI() {
        return parentWorkItemURI;
    }


    /**
     * Sets the parentWorkItemURI value for this GetModuleWorkItemUris.
     * 
     * @param parentWorkItemURI
     */
    public void setParentWorkItemURI(java.lang.String parentWorkItemURI) {
        this.parentWorkItemURI = parentWorkItemURI;
    }


    /**
     * Gets the deep value for this GetModuleWorkItemUris.
     * 
     * @return deep
     */
    public boolean isDeep() {
        return deep;
    }


    /**
     * Sets the deep value for this GetModuleWorkItemUris.
     * 
     * @param deep
     */
    public void setDeep(boolean deep) {
        this.deep = deep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetModuleWorkItemUris)) return false;
        GetModuleWorkItemUris other = (GetModuleWorkItemUris) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.moduleURI==null && other.getModuleURI()==null) || 
             (this.moduleURI!=null &&
              this.moduleURI.equals(other.getModuleURI()))) &&
            ((this.parentWorkItemURI==null && other.getParentWorkItemURI()==null) || 
             (this.parentWorkItemURI!=null &&
              this.parentWorkItemURI.equals(other.getParentWorkItemURI()))) &&
            this.deep == other.isDeep();
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
        if (getModuleURI() != null) {
            _hashCode += getModuleURI().hashCode();
        }
        if (getParentWorkItemURI() != null) {
            _hashCode += getParentWorkItemURI().hashCode();
        }
        _hashCode += (isDeep() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetModuleWorkItemUris.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItemUris"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentWorkItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
