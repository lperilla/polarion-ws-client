/**
 * QueryWorkItemsInBaselineBySQL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class QueryWorkItemsInBaselineBySQL  implements java.io.Serializable {
    private java.lang.String sqlQuery;

    private java.lang.String baselineRevision;

    private java.lang.String[] fields;

    public QueryWorkItemsInBaselineBySQL() {
    }

    public QueryWorkItemsInBaselineBySQL(
           java.lang.String sqlQuery,
           java.lang.String baselineRevision,
           java.lang.String[] fields) {
           this.sqlQuery = sqlQuery;
           this.baselineRevision = baselineRevision;
           this.fields = fields;
    }


    /**
     * Gets the sqlQuery value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @return sqlQuery
     */
    public java.lang.String getSqlQuery() {
        return sqlQuery;
    }


    /**
     * Sets the sqlQuery value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @param sqlQuery
     */
    public void setSqlQuery(java.lang.String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }


    /**
     * Gets the baselineRevision value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @return baselineRevision
     */
    public java.lang.String getBaselineRevision() {
        return baselineRevision;
    }


    /**
     * Sets the baselineRevision value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @param baselineRevision
     */
    public void setBaselineRevision(java.lang.String baselineRevision) {
        this.baselineRevision = baselineRevision;
    }


    /**
     * Gets the fields value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @return fields
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this QueryWorkItemsInBaselineBySQL.
     * 
     * @param fields
     */
    public void setFields(java.lang.String[] fields) {
        this.fields = fields;
    }

    public java.lang.String getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, java.lang.String _value) {
        this.fields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryWorkItemsInBaselineBySQL)) return false;
        QueryWorkItemsInBaselineBySQL other = (QueryWorkItemsInBaselineBySQL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqlQuery==null && other.getSqlQuery()==null) || 
             (this.sqlQuery!=null &&
              this.sqlQuery.equals(other.getSqlQuery()))) &&
            ((this.baselineRevision==null && other.getBaselineRevision()==null) || 
             (this.baselineRevision!=null &&
              this.baselineRevision.equals(other.getBaselineRevision()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields())));
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
        if (getSqlQuery() != null) {
            _hashCode += getSqlQuery().hashCode();
        }
        if (getBaselineRevision() != null) {
            _hashCode += getBaselineRevision().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
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
        new org.apache.axis.description.TypeDesc(QueryWorkItemsInBaselineBySQL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineBySQL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baselineRevision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"));
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
