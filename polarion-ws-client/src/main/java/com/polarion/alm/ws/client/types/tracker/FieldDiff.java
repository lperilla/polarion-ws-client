/**
 * FieldDiff.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class FieldDiff  implements java.io.Serializable {
    private java.lang.Object[] added;

    private java.lang.Object after;

    private java.lang.Object before;

    private boolean collection;

    private java.lang.String fieldName;

    private java.lang.Object[] removed;

    public FieldDiff() {
    }

    public FieldDiff(
           java.lang.Object[] added,
           java.lang.Object after,
           java.lang.Object before,
           boolean collection,
           java.lang.String fieldName,
           java.lang.Object[] removed) {
           this.added = added;
           this.after = after;
           this.before = before;
           this.collection = collection;
           this.fieldName = fieldName;
           this.removed = removed;
    }


    /**
     * Gets the added value for this FieldDiff.
     * 
     * @return added
     */
    public java.lang.Object[] getAdded() {
        return added;
    }


    /**
     * Sets the added value for this FieldDiff.
     * 
     * @param added
     */
    public void setAdded(java.lang.Object[] added) {
        this.added = added;
    }


    /**
     * Gets the after value for this FieldDiff.
     * 
     * @return after
     */
    public java.lang.Object getAfter() {
        return after;
    }


    /**
     * Sets the after value for this FieldDiff.
     * 
     * @param after
     */
    public void setAfter(java.lang.Object after) {
        this.after = after;
    }


    /**
     * Gets the before value for this FieldDiff.
     * 
     * @return before
     */
    public java.lang.Object getBefore() {
        return before;
    }


    /**
     * Sets the before value for this FieldDiff.
     * 
     * @param before
     */
    public void setBefore(java.lang.Object before) {
        this.before = before;
    }


    /**
     * Gets the collection value for this FieldDiff.
     * 
     * @return collection
     */
    public boolean isCollection() {
        return collection;
    }


    /**
     * Sets the collection value for this FieldDiff.
     * 
     * @param collection
     */
    public void setCollection(boolean collection) {
        this.collection = collection;
    }


    /**
     * Gets the fieldName value for this FieldDiff.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this FieldDiff.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the removed value for this FieldDiff.
     * 
     * @return removed
     */
    public java.lang.Object[] getRemoved() {
        return removed;
    }


    /**
     * Sets the removed value for this FieldDiff.
     * 
     * @param removed
     */
    public void setRemoved(java.lang.Object[] removed) {
        this.removed = removed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldDiff)) return false;
        FieldDiff other = (FieldDiff) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.added==null && other.getAdded()==null) || 
             (this.added!=null &&
              java.util.Arrays.equals(this.added, other.getAdded()))) &&
            ((this.after==null && other.getAfter()==null) || 
             (this.after!=null &&
              this.after.equals(other.getAfter()))) &&
            ((this.before==null && other.getBefore()==null) || 
             (this.before!=null &&
              this.before.equals(other.getBefore()))) &&
            this.collection == other.isCollection() &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.removed==null && other.getRemoved()==null) || 
             (this.removed!=null &&
              java.util.Arrays.equals(this.removed, other.getRemoved())));
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
        if (getAdded() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdded(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAfter() != null) {
            _hashCode += getAfter().hashCode();
        }
        if (getBefore() != null) {
            _hashCode += getBefore().hashCode();
        }
        _hashCode += (isCollection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getRemoved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemoved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemoved(), i);
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
        new org.apache.axis.description.TypeDesc(FieldDiff.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "FieldDiff"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("added");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "added"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("after");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "after"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("before");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "before"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "collection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "removed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
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
