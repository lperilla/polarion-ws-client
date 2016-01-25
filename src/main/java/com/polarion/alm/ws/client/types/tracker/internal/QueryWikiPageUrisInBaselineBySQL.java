/**
 * QueryWikiPageUrisInBaselineBySQL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class QueryWikiPageUrisInBaselineBySQL  implements java.io.Serializable {
    private java.lang.String sqlQuery;

    private java.lang.String baselineRevision;

    public QueryWikiPageUrisInBaselineBySQL() {
    }

    public QueryWikiPageUrisInBaselineBySQL(
           java.lang.String sqlQuery,
           java.lang.String baselineRevision) {
           this.sqlQuery = sqlQuery;
           this.baselineRevision = baselineRevision;
    }


    /**
     * Gets the sqlQuery value for this QueryWikiPageUrisInBaselineBySQL.
     * 
     * @return sqlQuery
     */
    public java.lang.String getSqlQuery() {
        return sqlQuery;
    }


    /**
     * Sets the sqlQuery value for this QueryWikiPageUrisInBaselineBySQL.
     * 
     * @param sqlQuery
     */
    public void setSqlQuery(java.lang.String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }


    /**
     * Gets the baselineRevision value for this QueryWikiPageUrisInBaselineBySQL.
     * 
     * @return baselineRevision
     */
    public java.lang.String getBaselineRevision() {
        return baselineRevision;
    }


    /**
     * Sets the baselineRevision value for this QueryWikiPageUrisInBaselineBySQL.
     * 
     * @param baselineRevision
     */
    public void setBaselineRevision(java.lang.String baselineRevision) {
        this.baselineRevision = baselineRevision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryWikiPageUrisInBaselineBySQL)) return false;
        QueryWikiPageUrisInBaselineBySQL other = (QueryWikiPageUrisInBaselineBySQL) obj;
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
              this.baselineRevision.equals(other.getBaselineRevision())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryWikiPageUrisInBaselineBySQL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisInBaselineBySQL"));
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
