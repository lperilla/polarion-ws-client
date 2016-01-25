/**
 * ReuseDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class ReuseDocument  implements java.io.Serializable {
    private java.lang.String sourceURI;

    private java.lang.String targetProjectId;

    private java.lang.String targetLocation;

    private java.lang.String targetName;

    private java.lang.String targetTitle;

    private boolean updateTitleInDocument;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole;

    private java.lang.String[] derivedFields;

    public ReuseDocument() {
    }

    public ReuseDocument(
           java.lang.String sourceURI,
           java.lang.String targetProjectId,
           java.lang.String targetLocation,
           java.lang.String targetName,
           java.lang.String targetTitle,
           boolean updateTitleInDocument,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole,
           java.lang.String[] derivedFields) {
           this.sourceURI = sourceURI;
           this.targetProjectId = targetProjectId;
           this.targetLocation = targetLocation;
           this.targetName = targetName;
           this.targetTitle = targetTitle;
           this.updateTitleInDocument = updateTitleInDocument;
           this.linkRole = linkRole;
           this.derivedFields = derivedFields;
    }


    /**
     * Gets the sourceURI value for this ReuseDocument.
     * 
     * @return sourceURI
     */
    public java.lang.String getSourceURI() {
        return sourceURI;
    }


    /**
     * Sets the sourceURI value for this ReuseDocument.
     * 
     * @param sourceURI
     */
    public void setSourceURI(java.lang.String sourceURI) {
        this.sourceURI = sourceURI;
    }


    /**
     * Gets the targetProjectId value for this ReuseDocument.
     * 
     * @return targetProjectId
     */
    public java.lang.String getTargetProjectId() {
        return targetProjectId;
    }


    /**
     * Sets the targetProjectId value for this ReuseDocument.
     * 
     * @param targetProjectId
     */
    public void setTargetProjectId(java.lang.String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }


    /**
     * Gets the targetLocation value for this ReuseDocument.
     * 
     * @return targetLocation
     */
    public java.lang.String getTargetLocation() {
        return targetLocation;
    }


    /**
     * Sets the targetLocation value for this ReuseDocument.
     * 
     * @param targetLocation
     */
    public void setTargetLocation(java.lang.String targetLocation) {
        this.targetLocation = targetLocation;
    }


    /**
     * Gets the targetName value for this ReuseDocument.
     * 
     * @return targetName
     */
    public java.lang.String getTargetName() {
        return targetName;
    }


    /**
     * Sets the targetName value for this ReuseDocument.
     * 
     * @param targetName
     */
    public void setTargetName(java.lang.String targetName) {
        this.targetName = targetName;
    }


    /**
     * Gets the targetTitle value for this ReuseDocument.
     * 
     * @return targetTitle
     */
    public java.lang.String getTargetTitle() {
        return targetTitle;
    }


    /**
     * Sets the targetTitle value for this ReuseDocument.
     * 
     * @param targetTitle
     */
    public void setTargetTitle(java.lang.String targetTitle) {
        this.targetTitle = targetTitle;
    }


    /**
     * Gets the updateTitleInDocument value for this ReuseDocument.
     * 
     * @return updateTitleInDocument
     */
    public boolean isUpdateTitleInDocument() {
        return updateTitleInDocument;
    }


    /**
     * Sets the updateTitleInDocument value for this ReuseDocument.
     * 
     * @param updateTitleInDocument
     */
    public void setUpdateTitleInDocument(boolean updateTitleInDocument) {
        this.updateTitleInDocument = updateTitleInDocument;
    }


    /**
     * Gets the linkRole value for this ReuseDocument.
     * 
     * @return linkRole
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getLinkRole() {
        return linkRole;
    }


    /**
     * Sets the linkRole value for this ReuseDocument.
     * 
     * @param linkRole
     */
    public void setLinkRole(com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole) {
        this.linkRole = linkRole;
    }


    /**
     * Gets the derivedFields value for this ReuseDocument.
     * 
     * @return derivedFields
     */
    public java.lang.String[] getDerivedFields() {
        return derivedFields;
    }


    /**
     * Sets the derivedFields value for this ReuseDocument.
     * 
     * @param derivedFields
     */
    public void setDerivedFields(java.lang.String[] derivedFields) {
        this.derivedFields = derivedFields;
    }

    public java.lang.String getDerivedFields(int i) {
        return this.derivedFields[i];
    }

    public void setDerivedFields(int i, java.lang.String _value) {
        this.derivedFields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReuseDocument)) return false;
        ReuseDocument other = (ReuseDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceURI==null && other.getSourceURI()==null) || 
             (this.sourceURI!=null &&
              this.sourceURI.equals(other.getSourceURI()))) &&
            ((this.targetProjectId==null && other.getTargetProjectId()==null) || 
             (this.targetProjectId!=null &&
              this.targetProjectId.equals(other.getTargetProjectId()))) &&
            ((this.targetLocation==null && other.getTargetLocation()==null) || 
             (this.targetLocation!=null &&
              this.targetLocation.equals(other.getTargetLocation()))) &&
            ((this.targetName==null && other.getTargetName()==null) || 
             (this.targetName!=null &&
              this.targetName.equals(other.getTargetName()))) &&
            ((this.targetTitle==null && other.getTargetTitle()==null) || 
             (this.targetTitle!=null &&
              this.targetTitle.equals(other.getTargetTitle()))) &&
            this.updateTitleInDocument == other.isUpdateTitleInDocument() &&
            ((this.linkRole==null && other.getLinkRole()==null) || 
             (this.linkRole!=null &&
              this.linkRole.equals(other.getLinkRole()))) &&
            ((this.derivedFields==null && other.getDerivedFields()==null) || 
             (this.derivedFields!=null &&
              java.util.Arrays.equals(this.derivedFields, other.getDerivedFields())));
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
        if (getSourceURI() != null) {
            _hashCode += getSourceURI().hashCode();
        }
        if (getTargetProjectId() != null) {
            _hashCode += getTargetProjectId().hashCode();
        }
        if (getTargetLocation() != null) {
            _hashCode += getTargetLocation().hashCode();
        }
        if (getTargetName() != null) {
            _hashCode += getTargetName().hashCode();
        }
        if (getTargetTitle() != null) {
            _hashCode += getTargetTitle().hashCode();
        }
        _hashCode += (isUpdateTitleInDocument() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLinkRole() != null) {
            _hashCode += getLinkRole().hashCode();
        }
        if (getDerivedFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDerivedFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDerivedFields(), i);
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
        new org.apache.axis.description.TypeDesc(ReuseDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">reuseDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sourceURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetProjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetProjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTitleInDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateTitleInDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("derivedFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "derivedFields"));
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
