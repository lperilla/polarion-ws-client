/**
 * Change.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class Change  implements java.io.Serializable {
    private boolean creation;

    private java.util.Calendar date;

    private com.polarion.alm.ws.client.types.tracker.FieldDiff[] diffs;

    private boolean empty;

    private boolean invalid;

    private java.lang.String revision;

    private java.lang.String user;

    public Change() {
    }

    public Change(
           boolean creation,
           java.util.Calendar date,
           com.polarion.alm.ws.client.types.tracker.FieldDiff[] diffs,
           boolean empty,
           boolean invalid,
           java.lang.String revision,
           java.lang.String user) {
           this.creation = creation;
           this.date = date;
           this.diffs = diffs;
           this.empty = empty;
           this.invalid = invalid;
           this.revision = revision;
           this.user = user;
    }


    /**
     * Gets the creation value for this Change.
     * 
     * @return creation
     */
    public boolean isCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this Change.
     * 
     * @param creation
     */
    public void setCreation(boolean creation) {
        this.creation = creation;
    }


    /**
     * Gets the date value for this Change.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this Change.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the diffs value for this Change.
     * 
     * @return diffs
     */
    public com.polarion.alm.ws.client.types.tracker.FieldDiff[] getDiffs() {
        return diffs;
    }


    /**
     * Sets the diffs value for this Change.
     * 
     * @param diffs
     */
    public void setDiffs(com.polarion.alm.ws.client.types.tracker.FieldDiff[] diffs) {
        this.diffs = diffs;
    }


    /**
     * Gets the empty value for this Change.
     * 
     * @return empty
     */
    public boolean isEmpty() {
        return empty;
    }


    /**
     * Sets the empty value for this Change.
     * 
     * @param empty
     */
    public void setEmpty(boolean empty) {
        this.empty = empty;
    }


    /**
     * Gets the invalid value for this Change.
     * 
     * @return invalid
     */
    public boolean isInvalid() {
        return invalid;
    }


    /**
     * Sets the invalid value for this Change.
     * 
     * @param invalid
     */
    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }


    /**
     * Gets the revision value for this Change.
     * 
     * @return revision
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this Change.
     * 
     * @param revision
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the user value for this Change.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Change.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Change)) return false;
        Change other = (Change) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creation == other.isCreation() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.diffs==null && other.getDiffs()==null) || 
             (this.diffs!=null &&
              java.util.Arrays.equals(this.diffs, other.getDiffs()))) &&
            this.empty == other.isEmpty() &&
            this.invalid == other.isInvalid() &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        _hashCode += (isCreation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDiffs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiffs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiffs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isEmpty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInvalid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Change.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Change"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "creation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diffs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "diffs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "FieldDiff"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "empty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "invalid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "user"));
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
