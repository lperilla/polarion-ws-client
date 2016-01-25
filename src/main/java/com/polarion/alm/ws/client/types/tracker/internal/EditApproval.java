/**
 * EditApproval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class EditApproval  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private java.lang.String approveeId;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId status;

    public EditApproval() {
    }

    public EditApproval(
           java.lang.String workitemURI,
           java.lang.String approveeId,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
           this.workitemURI = workitemURI;
           this.approveeId = approveeId;
           this.status = status;
    }


    /**
     * Gets the workitemURI value for this EditApproval.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this EditApproval.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the approveeId value for this EditApproval.
     * 
     * @return approveeId
     */
    public java.lang.String getApproveeId() {
        return approveeId;
    }


    /**
     * Sets the approveeId value for this EditApproval.
     * 
     * @param approveeId
     */
    public void setApproveeId(java.lang.String approveeId) {
        this.approveeId = approveeId;
    }


    /**
     * Gets the status value for this EditApproval.
     * 
     * @return status
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EditApproval.
     * 
     * @param status
     */
    public void setStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditApproval)) return false;
        EditApproval other = (EditApproval) obj;
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
            ((this.approveeId==null && other.getApproveeId()==null) || 
             (this.approveeId!=null &&
              this.approveeId.equals(other.getApproveeId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getApproveeId() != null) {
            _hashCode += getApproveeId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EditApproval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">editApproval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "approveeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
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
