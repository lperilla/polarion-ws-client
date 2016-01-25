/**
 * RemoveExternalLinkedRevision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class RemoveExternalLinkedRevision  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String repositoryName;

    private java.lang.String revisionId;

    public RemoveExternalLinkedRevision() {
    }

    public RemoveExternalLinkedRevision(
           java.lang.String workitemURI,
           java.lang.String repositoryName,
           java.lang.String revisionId) {
           this.workitemURI = workitemURI;
           this.repositoryName = repositoryName;
           this.revisionId = revisionId;
    }


    /**
     * Gets the workitemURI value for this RemoveExternalLinkedRevision.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this RemoveExternalLinkedRevision.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the repositoryName value for this RemoveExternalLinkedRevision.
     * 
     * @return repositoryName
     */
    public java.lang.String getRepositoryName() {
        return repositoryName;
    }


    /**
     * Sets the repositoryName value for this RemoveExternalLinkedRevision.
     * 
     * @param repositoryName
     */
    public void setRepositoryName(java.lang.String repositoryName) {
        this.repositoryName = repositoryName;
    }


    /**
     * Gets the revisionId value for this RemoveExternalLinkedRevision.
     * 
     * @return revisionId
     */
    public java.lang.String getRevisionId() {
        return revisionId;
    }


    /**
     * Sets the revisionId value for this RemoveExternalLinkedRevision.
     * 
     * @param revisionId
     */
    public void setRevisionId(java.lang.String revisionId) {
        this.revisionId = revisionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveExternalLinkedRevision)) return false;
        RemoveExternalLinkedRevision other = (RemoveExternalLinkedRevision) obj;
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
            ((this.repositoryName==null && other.getRepositoryName()==null) || 
             (this.repositoryName!=null &&
              this.repositoryName.equals(other.getRepositoryName()))) &&
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
        if (getRepositoryName() != null) {
            _hashCode += getRepositoryName().hashCode();
        }
        if (getRevisionId() != null) {
            _hashCode += getRevisionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveExternalLinkedRevision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternalLinkedRevision"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "repositoryName"));
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
