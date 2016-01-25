/**
 * Activity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class Activity  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry[] activityCustomValues;

    private com.polarion.alm.ws.client.types.tracker.ActivityComment[] comments;

    private java.lang.String contextId;

    private java.lang.String globalId;

    private java.lang.String id;

    private com.polarion.alm.ws.client.types.Text info;

    private java.lang.String prefix;

    private java.lang.String[] resourceLocations;

    private java.lang.String sourceId;

    private java.util.Calendar timestamp;

    private java.lang.String type;

    private java.lang.String userId;

    public Activity() {
    }

    public Activity(
           com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry[] activityCustomValues,
           com.polarion.alm.ws.client.types.tracker.ActivityComment[] comments,
           java.lang.String contextId,
           java.lang.String globalId,
           java.lang.String id,
           com.polarion.alm.ws.client.types.Text info,
           java.lang.String prefix,
           java.lang.String[] resourceLocations,
           java.lang.String sourceId,
           java.util.Calendar timestamp,
           java.lang.String type,
           java.lang.String userId) {
           this.activityCustomValues = activityCustomValues;
           this.comments = comments;
           this.contextId = contextId;
           this.globalId = globalId;
           this.id = id;
           this.info = info;
           this.prefix = prefix;
           this.resourceLocations = resourceLocations;
           this.sourceId = sourceId;
           this.timestamp = timestamp;
           this.type = type;
           this.userId = userId;
    }


    /**
     * Gets the activityCustomValues value for this Activity.
     * 
     * @return activityCustomValues
     */
    public com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry[] getActivityCustomValues() {
        return activityCustomValues;
    }


    /**
     * Sets the activityCustomValues value for this Activity.
     * 
     * @param activityCustomValues
     */
    public void setActivityCustomValues(com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry[] activityCustomValues) {
        this.activityCustomValues = activityCustomValues;
    }


    /**
     * Gets the comments value for this Activity.
     * 
     * @return comments
     */
    public com.polarion.alm.ws.client.types.tracker.ActivityComment[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this Activity.
     * 
     * @param comments
     */
    public void setComments(com.polarion.alm.ws.client.types.tracker.ActivityComment[] comments) {
        this.comments = comments;
    }


    /**
     * Gets the contextId value for this Activity.
     * 
     * @return contextId
     */
    public java.lang.String getContextId() {
        return contextId;
    }


    /**
     * Sets the contextId value for this Activity.
     * 
     * @param contextId
     */
    public void setContextId(java.lang.String contextId) {
        this.contextId = contextId;
    }


    /**
     * Gets the globalId value for this Activity.
     * 
     * @return globalId
     */
    public java.lang.String getGlobalId() {
        return globalId;
    }


    /**
     * Sets the globalId value for this Activity.
     * 
     * @param globalId
     */
    public void setGlobalId(java.lang.String globalId) {
        this.globalId = globalId;
    }


    /**
     * Gets the id value for this Activity.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Activity.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the info value for this Activity.
     * 
     * @return info
     */
    public com.polarion.alm.ws.client.types.Text getInfo() {
        return info;
    }


    /**
     * Sets the info value for this Activity.
     * 
     * @param info
     */
    public void setInfo(com.polarion.alm.ws.client.types.Text info) {
        this.info = info;
    }


    /**
     * Gets the prefix value for this Activity.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this Activity.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the resourceLocations value for this Activity.
     * 
     * @return resourceLocations
     */
    public java.lang.String[] getResourceLocations() {
        return resourceLocations;
    }


    /**
     * Sets the resourceLocations value for this Activity.
     * 
     * @param resourceLocations
     */
    public void setResourceLocations(java.lang.String[] resourceLocations) {
        this.resourceLocations = resourceLocations;
    }


    /**
     * Gets the sourceId value for this Activity.
     * 
     * @return sourceId
     */
    public java.lang.String getSourceId() {
        return sourceId;
    }


    /**
     * Sets the sourceId value for this Activity.
     * 
     * @param sourceId
     */
    public void setSourceId(java.lang.String sourceId) {
        this.sourceId = sourceId;
    }


    /**
     * Gets the timestamp value for this Activity.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this Activity.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the type value for this Activity.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Activity.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the userId value for this Activity.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Activity.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Activity)) return false;
        Activity other = (Activity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activityCustomValues==null && other.getActivityCustomValues()==null) || 
             (this.activityCustomValues!=null &&
              java.util.Arrays.equals(this.activityCustomValues, other.getActivityCustomValues()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.contextId==null && other.getContextId()==null) || 
             (this.contextId!=null &&
              this.contextId.equals(other.getContextId()))) &&
            ((this.globalId==null && other.getGlobalId()==null) || 
             (this.globalId!=null &&
              this.globalId.equals(other.getGlobalId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.resourceLocations==null && other.getResourceLocations()==null) || 
             (this.resourceLocations!=null &&
              java.util.Arrays.equals(this.resourceLocations, other.getResourceLocations()))) &&
            ((this.sourceId==null && other.getSourceId()==null) || 
             (this.sourceId!=null &&
              this.sourceId.equals(other.getSourceId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getActivityCustomValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityCustomValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityCustomValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContextId() != null) {
            _hashCode += getContextId().hashCode();
        }
        if (getGlobalId() != null) {
            _hashCode += getGlobalId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getResourceLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSourceId() != null) {
            _hashCode += getSourceId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Activity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityCustomValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "activityCustomValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityCustomValueEntry"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityComment"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "contextId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "globalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "resourceLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "sourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "userId"));
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
