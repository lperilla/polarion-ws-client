/**
 * GetModuleWorkItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetModuleWorkItems  implements java.io.Serializable {
    private java.lang.String moduleURI;

    private java.lang.String parentWorkItemURI;

    private boolean deep;

    private java.lang.String[] fields;

    public GetModuleWorkItems() {
    }

    public GetModuleWorkItems(
           java.lang.String moduleURI,
           java.lang.String parentWorkItemURI,
           boolean deep,
           java.lang.String[] fields) {
           this.moduleURI = moduleURI;
           this.parentWorkItemURI = parentWorkItemURI;
           this.deep = deep;
           this.fields = fields;
    }


    /**
     * Gets the moduleURI value for this GetModuleWorkItems.
     * 
     * @return moduleURI
     */
    public java.lang.String getModuleURI() {
        return moduleURI;
    }


    /**
     * Sets the moduleURI value for this GetModuleWorkItems.
     * 
     * @param moduleURI
     */
    public void setModuleURI(java.lang.String moduleURI) {
        this.moduleURI = moduleURI;
    }


    /**
     * Gets the parentWorkItemURI value for this GetModuleWorkItems.
     * 
     * @return parentWorkItemURI
     */
    public java.lang.String getParentWorkItemURI() {
        return parentWorkItemURI;
    }


    /**
     * Sets the parentWorkItemURI value for this GetModuleWorkItems.
     * 
     * @param parentWorkItemURI
     */
    public void setParentWorkItemURI(java.lang.String parentWorkItemURI) {
        this.parentWorkItemURI = parentWorkItemURI;
    }


    /**
     * Gets the deep value for this GetModuleWorkItems.
     * 
     * @return deep
     */
    public boolean isDeep() {
        return deep;
    }


    /**
     * Sets the deep value for this GetModuleWorkItems.
     * 
     * @param deep
     */
    public void setDeep(boolean deep) {
        this.deep = deep;
    }


    /**
     * Gets the fields value for this GetModuleWorkItems.
     * 
     * @return fields
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this GetModuleWorkItems.
     * 
     * @param fields
     */
    public void setFields(java.lang.String[] fields) {
        this.fields = fields;
    }

    public java.lang.String getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, java.lang.String _value) {
        this.fields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetModuleWorkItems)) return false;
        GetModuleWorkItems other = (GetModuleWorkItems) obj;
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
            this.deep == other.isDeep() &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields())));
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
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
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
        new org.apache.axis.description.TypeDesc(GetModuleWorkItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItems"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"));
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
