/**
 * MoveWorkItemToModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class MoveWorkItemToModule  implements java.io.Serializable {
    private java.lang.String workItemURI;

    private java.lang.String moduleURI;

    private java.lang.String parentWorkItemURI;

    private int position;

    public MoveWorkItemToModule() {
    }

    public MoveWorkItemToModule(
           java.lang.String workItemURI,
           java.lang.String moduleURI,
           java.lang.String parentWorkItemURI,
           int position) {
           this.workItemURI = workItemURI;
           this.moduleURI = moduleURI;
           this.parentWorkItemURI = parentWorkItemURI;
           this.position = position;
    }


    /**
     * Gets the workItemURI value for this MoveWorkItemToModule.
     * 
     * @return workItemURI
     */
    public java.lang.String getWorkItemURI() {
        return workItemURI;
    }


    /**
     * Sets the workItemURI value for this MoveWorkItemToModule.
     * 
     * @param workItemURI
     */
    public void setWorkItemURI(java.lang.String workItemURI) {
        this.workItemURI = workItemURI;
    }


    /**
     * Gets the moduleURI value for this MoveWorkItemToModule.
     * 
     * @return moduleURI
     */
    public java.lang.String getModuleURI() {
        return moduleURI;
    }


    /**
     * Sets the moduleURI value for this MoveWorkItemToModule.
     * 
     * @param moduleURI
     */
    public void setModuleURI(java.lang.String moduleURI) {
        this.moduleURI = moduleURI;
    }


    /**
     * Gets the parentWorkItemURI value for this MoveWorkItemToModule.
     * 
     * @return parentWorkItemURI
     */
    public java.lang.String getParentWorkItemURI() {
        return parentWorkItemURI;
    }


    /**
     * Sets the parentWorkItemURI value for this MoveWorkItemToModule.
     * 
     * @param parentWorkItemURI
     */
    public void setParentWorkItemURI(java.lang.String parentWorkItemURI) {
        this.parentWorkItemURI = parentWorkItemURI;
    }


    /**
     * Gets the position value for this MoveWorkItemToModule.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this MoveWorkItemToModule.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveWorkItemToModule)) return false;
        MoveWorkItemToModule other = (MoveWorkItemToModule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workItemURI==null && other.getWorkItemURI()==null) || 
             (this.workItemURI!=null &&
              this.workItemURI.equals(other.getWorkItemURI()))) &&
            ((this.moduleURI==null && other.getModuleURI()==null) || 
             (this.moduleURI!=null &&
              this.moduleURI.equals(other.getModuleURI()))) &&
            ((this.parentWorkItemURI==null && other.getParentWorkItemURI()==null) || 
             (this.parentWorkItemURI!=null &&
              this.parentWorkItemURI.equals(other.getParentWorkItemURI()))) &&
            this.position == other.getPosition();
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
        if (getWorkItemURI() != null) {
            _hashCode += getWorkItemURI().hashCode();
        }
        if (getModuleURI() != null) {
            _hashCode += getModuleURI().hashCode();
        }
        if (getParentWorkItemURI() != null) {
            _hashCode += getParentWorkItemURI().hashCode();
        }
        _hashCode += getPosition();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveWorkItemToModule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToModule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
