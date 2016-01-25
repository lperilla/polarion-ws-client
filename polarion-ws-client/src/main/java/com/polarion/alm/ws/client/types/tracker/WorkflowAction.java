/**
 * WorkflowAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class WorkflowAction  implements java.io.Serializable {
    private int actionId;

    private java.lang.String actionName;

    private java.lang.String[] cleanedFeatures;

    private java.lang.String nativeActionId;

    private java.lang.String[] requiredFeatures;

    private java.lang.String[] suggestedFeatures;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId targetStatus;

    private java.lang.String unavailabilityMessage;

    public WorkflowAction() {
    }

    public WorkflowAction(
           int actionId,
           java.lang.String actionName,
           java.lang.String[] cleanedFeatures,
           java.lang.String nativeActionId,
           java.lang.String[] requiredFeatures,
           java.lang.String[] suggestedFeatures,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId targetStatus,
           java.lang.String unavailabilityMessage) {
           this.actionId = actionId;
           this.actionName = actionName;
           this.cleanedFeatures = cleanedFeatures;
           this.nativeActionId = nativeActionId;
           this.requiredFeatures = requiredFeatures;
           this.suggestedFeatures = suggestedFeatures;
           this.targetStatus = targetStatus;
           this.unavailabilityMessage = unavailabilityMessage;
    }


    /**
     * Gets the actionId value for this WorkflowAction.
     * 
     * @return actionId
     */
    public int getActionId() {
        return actionId;
    }


    /**
     * Sets the actionId value for this WorkflowAction.
     * 
     * @param actionId
     */
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }


    /**
     * Gets the actionName value for this WorkflowAction.
     * 
     * @return actionName
     */
    public java.lang.String getActionName() {
        return actionName;
    }


    /**
     * Sets the actionName value for this WorkflowAction.
     * 
     * @param actionName
     */
    public void setActionName(java.lang.String actionName) {
        this.actionName = actionName;
    }


    /**
     * Gets the cleanedFeatures value for this WorkflowAction.
     * 
     * @return cleanedFeatures
     */
    public java.lang.String[] getCleanedFeatures() {
        return cleanedFeatures;
    }


    /**
     * Sets the cleanedFeatures value for this WorkflowAction.
     * 
     * @param cleanedFeatures
     */
    public void setCleanedFeatures(java.lang.String[] cleanedFeatures) {
        this.cleanedFeatures = cleanedFeatures;
    }


    /**
     * Gets the nativeActionId value for this WorkflowAction.
     * 
     * @return nativeActionId
     */
    public java.lang.String getNativeActionId() {
        return nativeActionId;
    }


    /**
     * Sets the nativeActionId value for this WorkflowAction.
     * 
     * @param nativeActionId
     */
    public void setNativeActionId(java.lang.String nativeActionId) {
        this.nativeActionId = nativeActionId;
    }


    /**
     * Gets the requiredFeatures value for this WorkflowAction.
     * 
     * @return requiredFeatures
     */
    public java.lang.String[] getRequiredFeatures() {
        return requiredFeatures;
    }


    /**
     * Sets the requiredFeatures value for this WorkflowAction.
     * 
     * @param requiredFeatures
     */
    public void setRequiredFeatures(java.lang.String[] requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
    }


    /**
     * Gets the suggestedFeatures value for this WorkflowAction.
     * 
     * @return suggestedFeatures
     */
    public java.lang.String[] getSuggestedFeatures() {
        return suggestedFeatures;
    }


    /**
     * Sets the suggestedFeatures value for this WorkflowAction.
     * 
     * @param suggestedFeatures
     */
    public void setSuggestedFeatures(java.lang.String[] suggestedFeatures) {
        this.suggestedFeatures = suggestedFeatures;
    }


    /**
     * Gets the targetStatus value for this WorkflowAction.
     * 
     * @return targetStatus
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getTargetStatus() {
        return targetStatus;
    }


    /**
     * Sets the targetStatus value for this WorkflowAction.
     * 
     * @param targetStatus
     */
    public void setTargetStatus(com.polarion.alm.ws.client.types.tracker.EnumOptionId targetStatus) {
        this.targetStatus = targetStatus;
    }


    /**
     * Gets the unavailabilityMessage value for this WorkflowAction.
     * 
     * @return unavailabilityMessage
     */
    public java.lang.String getUnavailabilityMessage() {
        return unavailabilityMessage;
    }


    /**
     * Sets the unavailabilityMessage value for this WorkflowAction.
     * 
     * @param unavailabilityMessage
     */
    public void setUnavailabilityMessage(java.lang.String unavailabilityMessage) {
        this.unavailabilityMessage = unavailabilityMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowAction)) return false;
        WorkflowAction other = (WorkflowAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.actionId == other.getActionId() &&
            ((this.actionName==null && other.getActionName()==null) || 
             (this.actionName!=null &&
              this.actionName.equals(other.getActionName()))) &&
            ((this.cleanedFeatures==null && other.getCleanedFeatures()==null) || 
             (this.cleanedFeatures!=null &&
              java.util.Arrays.equals(this.cleanedFeatures, other.getCleanedFeatures()))) &&
            ((this.nativeActionId==null && other.getNativeActionId()==null) || 
             (this.nativeActionId!=null &&
              this.nativeActionId.equals(other.getNativeActionId()))) &&
            ((this.requiredFeatures==null && other.getRequiredFeatures()==null) || 
             (this.requiredFeatures!=null &&
              java.util.Arrays.equals(this.requiredFeatures, other.getRequiredFeatures()))) &&
            ((this.suggestedFeatures==null && other.getSuggestedFeatures()==null) || 
             (this.suggestedFeatures!=null &&
              java.util.Arrays.equals(this.suggestedFeatures, other.getSuggestedFeatures()))) &&
            ((this.targetStatus==null && other.getTargetStatus()==null) || 
             (this.targetStatus!=null &&
              this.targetStatus.equals(other.getTargetStatus()))) &&
            ((this.unavailabilityMessage==null && other.getUnavailabilityMessage()==null) || 
             (this.unavailabilityMessage!=null &&
              this.unavailabilityMessage.equals(other.getUnavailabilityMessage())));
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
        _hashCode += getActionId();
        if (getActionName() != null) {
            _hashCode += getActionName().hashCode();
        }
        if (getCleanedFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCleanedFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCleanedFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNativeActionId() != null) {
            _hashCode += getNativeActionId().hashCode();
        }
        if (getRequiredFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuggestedFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuggestedFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuggestedFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetStatus() != null) {
            _hashCode += getTargetStatus().hashCode();
        }
        if (getUnavailabilityMessage() != null) {
            _hashCode += getUnavailabilityMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "actionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "actionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleanedFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "cleanedFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeActionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "nativeActionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "requiredFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "suggestedFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "targetStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unavailabilityMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "unavailabilityMessage"));
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
