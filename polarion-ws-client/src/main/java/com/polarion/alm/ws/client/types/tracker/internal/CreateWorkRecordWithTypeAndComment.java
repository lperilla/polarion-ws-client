/**
 * CreateWorkRecordWithTypeAndComment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class CreateWorkRecordWithTypeAndComment  implements java.io.Serializable {
    private java.lang.String workitemURI;

    private com.polarion.alm.ws.client.types.projects.User user;

    private java.util.Date date;

    private com.polarion.alm.ws.client.types.tracker.EnumOptionId type;

    private java.lang.String timeSpent;

    private java.lang.String comment;

    public CreateWorkRecordWithTypeAndComment() {
    }

    public CreateWorkRecordWithTypeAndComment(
           java.lang.String workitemURI,
           com.polarion.alm.ws.client.types.projects.User user,
           java.util.Date date,
           com.polarion.alm.ws.client.types.tracker.EnumOptionId type,
           java.lang.String timeSpent,
           java.lang.String comment) {
           this.workitemURI = workitemURI;
           this.user = user;
           this.date = date;
           this.type = type;
           this.timeSpent = timeSpent;
           this.comment = comment;
    }


    /**
     * Gets the workitemURI value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return workitemURI
     */
    public java.lang.String getWorkitemURI() {
        return workitemURI;
    }


    /**
     * Sets the workitemURI value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param workitemURI
     */
    public void setWorkitemURI(java.lang.String workitemURI) {
        this.workitemURI = workitemURI;
    }


    /**
     * Gets the user value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return user
     */
    public com.polarion.alm.ws.client.types.projects.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param user
     */
    public void setUser(com.polarion.alm.ws.client.types.projects.User user) {
        this.user = user;
    }


    /**
     * Gets the date value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the type value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return type
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOptionId getType() {
        return type;
    }


    /**
     * Sets the type value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param type
     */
    public void setType(com.polarion.alm.ws.client.types.tracker.EnumOptionId type) {
        this.type = type;
    }


    /**
     * Gets the timeSpent value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return timeSpent
     */
    public java.lang.String getTimeSpent() {
        return timeSpent;
    }


    /**
     * Sets the timeSpent value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param timeSpent
     */
    public void setTimeSpent(java.lang.String timeSpent) {
        this.timeSpent = timeSpent;
    }


    /**
     * Gets the comment value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CreateWorkRecordWithTypeAndComment.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateWorkRecordWithTypeAndComment)) return false;
        CreateWorkRecordWithTypeAndComment other = (CreateWorkRecordWithTypeAndComment) obj;
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
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.timeSpent==null && other.getTimeSpent()==null) || 
             (this.timeSpent!=null &&
              this.timeSpent.equals(other.getTimeSpent()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTimeSpent() != null) {
            _hashCode += getTimeSpent().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateWorkRecordWithTypeAndComment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkRecordWithTypeAndComment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workitemURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSpent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "timeSpent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "comment"));
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
