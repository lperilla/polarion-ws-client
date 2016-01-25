/**
 * QueryWikiPagesInBaseline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class QueryWikiPagesInBaseline  implements java.io.Serializable {
    private java.lang.String query;

    private java.lang.String sort;

    private java.lang.String baselineRevision;

    private java.lang.String[] fields;

    private int resultsLimit;

    public QueryWikiPagesInBaseline() {
    }

    public QueryWikiPagesInBaseline(
           java.lang.String query,
           java.lang.String sort,
           java.lang.String baselineRevision,
           java.lang.String[] fields,
           int resultsLimit) {
           this.query = query;
           this.sort = sort;
           this.baselineRevision = baselineRevision;
           this.fields = fields;
           this.resultsLimit = resultsLimit;
    }


    /**
     * Gets the query value for this QueryWikiPagesInBaseline.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this QueryWikiPagesInBaseline.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the sort value for this QueryWikiPagesInBaseline.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this QueryWikiPagesInBaseline.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the baselineRevision value for this QueryWikiPagesInBaseline.
     * 
     * @return baselineRevision
     */
    public java.lang.String getBaselineRevision() {
        return baselineRevision;
    }


    /**
     * Sets the baselineRevision value for this QueryWikiPagesInBaseline.
     * 
     * @param baselineRevision
     */
    public void setBaselineRevision(java.lang.String baselineRevision) {
        this.baselineRevision = baselineRevision;
    }


    /**
     * Gets the fields value for this QueryWikiPagesInBaseline.
     * 
     * @return fields
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this QueryWikiPagesInBaseline.
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


    /**
     * Gets the resultsLimit value for this QueryWikiPagesInBaseline.
     * 
     * @return resultsLimit
     */
    public int getResultsLimit() {
        return resultsLimit;
    }


    /**
     * Sets the resultsLimit value for this QueryWikiPagesInBaseline.
     * 
     * @param resultsLimit
     */
    public void setResultsLimit(int resultsLimit) {
        this.resultsLimit = resultsLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryWikiPagesInBaseline)) return false;
        QueryWikiPagesInBaseline other = (QueryWikiPagesInBaseline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.baselineRevision==null && other.getBaselineRevision()==null) || 
             (this.baselineRevision!=null &&
              this.baselineRevision.equals(other.getBaselineRevision()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            this.resultsLimit == other.getResultsLimit();
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
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
        _hashCode += getResultsLimit();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryWikiPagesInBaseline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesInBaseline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultsLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"));
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
