/**
 * GetInitialWorkflowActionForProjectAndTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class GetInitialWorkflowActionForProjectAndTypeResponse  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowActionForProjectAndTypeReturn;

    public GetInitialWorkflowActionForProjectAndTypeResponse() {
    }

    public GetInitialWorkflowActionForProjectAndTypeResponse(
           com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowActionForProjectAndTypeReturn) {
           this.getInitialWorkflowActionForProjectAndTypeReturn = getInitialWorkflowActionForProjectAndTypeReturn;
    }


    /**
     * Gets the getInitialWorkflowActionForProjectAndTypeReturn value for this GetInitialWorkflowActionForProjectAndTypeResponse.
     * 
     * @return getInitialWorkflowActionForProjectAndTypeReturn
     */
    public com.polarion.alm.ws.client.types.tracker.WorkflowAction getGetInitialWorkflowActionForProjectAndTypeReturn() {
        return getInitialWorkflowActionForProjectAndTypeReturn;
    }


    /**
     * Sets the getInitialWorkflowActionForProjectAndTypeReturn value for this GetInitialWorkflowActionForProjectAndTypeResponse.
     * 
     * @param getInitialWorkflowActionForProjectAndTypeReturn
     */
    public void setGetInitialWorkflowActionForProjectAndTypeReturn(com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowActionForProjectAndTypeReturn) {
        this.getInitialWorkflowActionForProjectAndTypeReturn = getInitialWorkflowActionForProjectAndTypeReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInitialWorkflowActionForProjectAndTypeResponse)) return false;
        GetInitialWorkflowActionForProjectAndTypeResponse other = (GetInitialWorkflowActionForProjectAndTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInitialWorkflowActionForProjectAndTypeReturn==null && other.getGetInitialWorkflowActionForProjectAndTypeReturn()==null) || 
             (this.getInitialWorkflowActionForProjectAndTypeReturn!=null &&
              this.getInitialWorkflowActionForProjectAndTypeReturn.equals(other.getGetInitialWorkflowActionForProjectAndTypeReturn())));
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
        if (getGetInitialWorkflowActionForProjectAndTypeReturn() != null) {
            _hashCode += getGetInitialWorkflowActionForProjectAndTypeReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInitialWorkflowActionForProjectAndTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getInitialWorkflowActionForProjectAndTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInitialWorkflowActionForProjectAndTypeReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getInitialWorkflowActionForProjectAndTypeReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
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
