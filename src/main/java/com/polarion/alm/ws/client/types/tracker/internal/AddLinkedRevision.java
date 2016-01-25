/**
 * AddLinkedRevision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class AddLinkedRevision  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String revisionId;

    public AddLinkedRevision() {
    }

    public AddLinkedRevision(
           java.lang.String workitemURI,
           java.lang.String revisionId) {
           this.workitemURI = workitemURI;
           this.revisionId = revisionId;
    }


    /**
     * Gets the workitemURI value for this AddLinkedRevision.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this AddLinkedRevision.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the revisionId value for this AddLinkedRevision.
     * 
     * @return revisionId
     */
    public java.lang.String getRevisionId() {
        return revisionId;
    }


    /**
     * Sets the revisionId value for this AddLinkedRevision.
     * 
     * @param revisionId
     */
    public void setRevisionId(java.lang.String revisionId) {
        this.revisionId = revisionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddLinkedRevision)) return false;
        AddLinkedRevision other = (AddLinkedRevision) obj;
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
            ((this.revisionId==null && other.getRevisionId()==null) || 
             (this.revisionId!=null &&
              this.revisionId.equals(other.getRevisionId())));
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
        if (getRevisionId() != null) {
            _hashCode += getRevisionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddLinkedRevision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedRevision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"));
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
