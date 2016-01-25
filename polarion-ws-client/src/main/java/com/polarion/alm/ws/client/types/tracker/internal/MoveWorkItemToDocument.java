/**
 * MoveWorkItemToDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class MoveWorkItemToDocument  implements java.io.Serializable {
    private java.lang.String workItemURI;

    private java.lang.String documentURI;

    private java.lang.String parentWorkItemURI;

    private int position;

    private boolean retainDocumentFlow;

    public MoveWorkItemToDocument() {
    }

    public MoveWorkItemToDocument(
           java.lang.String workItemURI,
           java.lang.String documentURI,
           java.lang.String parentWorkItemURI,
           int position,
           boolean retainDocumentFlow) {
           this.workItemURI = workItemURI;
           this.documentURI = documentURI;
           this.parentWorkItemURI = parentWorkItemURI;
           this.position = position;
           this.retainDocumentFlow = retainDocumentFlow;
    }


    /**
     * Gets the workItemURI value for this MoveWorkItemToDocument.
     * 
     * @return workItemURI
     */
    public java.lang.String getWorkItemURI() {
        return workItemURI;
    }


    /**
     * Sets the workItemURI value for this MoveWorkItemToDocument.
     * 
     * @param workItemURI
     */
    public void setWorkItemURI(java.lang.String workItemURI) {
        this.workItemURI = workItemURI;
    }


    /**
     * Gets the documentURI value for this MoveWorkItemToDocument.
     * 
     * @return documentURI
     */
    public java.lang.String getDocumentURI() {
        return documentURI;
    }


    /**
     * Sets the documentURI value for this MoveWorkItemToDocument.
     * 
     * @param documentURI
     */
    public void setDocumentURI(java.lang.String documentURI) {
        this.documentURI = documentURI;
    }


    /**
     * Gets the parentWorkItemURI value for this MoveWorkItemToDocument.
     * 
     * @return parentWorkItemURI
     */
    public java.lang.String getParentWorkItemURI() {
        return parentWorkItemURI;
    }


    /**
     * Sets the parentWorkItemURI value for this MoveWorkItemToDocument.
     * 
     * @param parentWorkItemURI
     */
    public void setParentWorkItemURI(java.lang.String parentWorkItemURI) {
        this.parentWorkItemURI = parentWorkItemURI;
    }


    /**
     * Gets the position value for this MoveWorkItemToDocument.
     * 
     * @return position
     */
    public int getPosition() {
        return position;
    }


    /**
     * Sets the position value for this MoveWorkItemToDocument.
     * 
     * @param position
     */
    public void setPosition(int position) {
        this.position = position;
    }


    /**
     * Gets the retainDocumentFlow value for this MoveWorkItemToDocument.
     * 
     * @return retainDocumentFlow
     */
    public boolean isRetainDocumentFlow() {
        return retainDocumentFlow;
    }


    /**
     * Sets the retainDocumentFlow value for this MoveWorkItemToDocument.
     * 
     * @param retainDocumentFlow
     */
    public void setRetainDocumentFlow(boolean retainDocumentFlow) {
        this.retainDocumentFlow = retainDocumentFlow;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveWorkItemToDocument)) return false;
        MoveWorkItemToDocument other = (MoveWorkItemToDocument) obj;
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
            ((this.documentURI==null && other.getDocumentURI()==null) || 
             (this.documentURI!=null &&
              this.documentURI.equals(other.getDocumentURI()))) &&
            ((this.parentWorkItemURI==null && other.getParentWorkItemURI()==null) || 
             (this.parentWorkItemURI!=null &&
              this.parentWorkItemURI.equals(other.getParentWorkItemURI()))) &&
            this.position == other.getPosition() &&
            this.retainDocumentFlow == other.isRetainDocumentFlow();
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
        if (getDocumentURI() != null) {
            _hashCode += getDocumentURI().hashCode();
        }
        if (getParentWorkItemURI() != null) {
            _hashCode += getParentWorkItemURI().hashCode();
        }
        _hashCode += getPosition();
        _hashCode += (isRetainDocumentFlow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveWorkItemToDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workItemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retainDocumentFlow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "retainDocumentFlow"));
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
