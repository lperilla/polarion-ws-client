/**
 * WorkRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker;

public class WorkRecord  implements java.io.Serializable {
    private java.lang.String comment;

    private java.util.Date date;

    private java.lang.String id;

    private java.lang.String timeSpent;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId type;

    private com.polarion.alm.ws.client.types.projects.User user;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public WorkRecord() {
    }

    public WorkRecord(
           java.lang.String comment,
           java.util.Date date,
           java.lang.String id,
           java.lang.String timeSpent,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId type,
           com.polarion.alm.ws.client.types.projects.User user,
           java.lang.String uri,
           boolean unresolvable) {
           this.comment = comment;
           this.date = date;
           this.id = id;
           this.timeSpent = timeSpent;
           this.type = type;
           this.user = user;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the comment value for this WorkRecord.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WorkRecord.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the date value for this WorkRecord.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this WorkRecord.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the id value for this WorkRecord.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkRecord.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the timeSpent value for this WorkRecord.
     * 
     * @return timeSpent
     */
    public java.lang.String getTimeSpent() {
        return timeSpent;
    }


    /**
     * Sets the timeSpent value for this WorkRecord.
     * 
     * @param timeSpent
     */
    public void setTimeSpent(java.lang.String timeSpent) {
        this.timeSpent = timeSpent;
    }


    /**
     * Gets the type value for this WorkRecord.
     * 
     * @return type
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getType() {
        return type;
    }


    /**
     * Sets the type value for this WorkRecord.
     * 
     * @param type
     */
    public void setType(com.polarion.alm.ws.client.types.tracker.EnumOptionId type) {
        this.type = type;
    }


    /**
     * Gets the user value for this WorkRecord.
     * 
     * @return user
     */
    public com.polarion.alm.ws.client.types.projects.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this WorkRecord.
     * 
     * @param user
     */
    public void setUser(com.polarion.alm.ws.client.types.projects.User user) {
        this.user = user;
    }


    /**
     * Gets the uri value for this WorkRecord.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this WorkRecord.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this WorkRecord.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this WorkRecord.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkRecord)) return false;
        WorkRecord other = (WorkRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.timeSpent==null && other.getTimeSpent()==null) || 
             (this.timeSpent!=null &&
              this.timeSpent.equals(other.getTimeSpent()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            this.unresolvable == other.isUnresolvable();
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTimeSpent() != null) {
            _hashCode += getTimeSpent().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        _hashCode += (isUnresolvable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("uri");
        attrField.setXmlName(new javax.xml.namespace.QName("", "uri"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unresolvable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "unresolvable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSpent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "timeSpent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
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
