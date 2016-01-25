/**
 * CreateCommentNew.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.tracker.internal;

public class CreateCommentNew  implements java.io.Serializable {
    private java.lang.String parentURI;

    private java.lang.String title;

    private com.polarion.alm.ws.client.types.Text content;

    private java.lang.String[] visibleTo;

    public CreateCommentNew() {
    }

    public CreateCommentNew(
           java.lang.String parentURI,
           java.lang.String title,
           com.polarion.alm.ws.client.types.Text content,
           java.lang.String[] visibleTo) {
           this.parentURI = parentURI;
           this.title = title;
           this.content = content;
           this.visibleTo = visibleTo;
    }


    /**
     * Gets the parentURI value for this CreateCommentNew.
     * 
     * @return parentURI
     */
    public java.lang.String getParentURI() {
        return parentURI;
    }


    /**
     * Sets the parentURI value for this CreateCommentNew.
     * 
     * @param parentURI
     */
    public void setParentURI(java.lang.String parentURI) {
        this.parentURI = parentURI;
    }


    /**
     * Gets the title value for this CreateCommentNew.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CreateCommentNew.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the content value for this CreateCommentNew.
     * 
     * @return content
     */
    public com.polarion.alm.ws.client.types.Text getContent() {
        return content;
    }


    /**
     * Sets the content value for this CreateCommentNew.
     * 
     * @param content
     */
    public void setContent(com.polarion.alm.ws.client.types.Text content) {
        this.content = content;
    }


    /**
     * Gets the visibleTo value for this CreateCommentNew.
     * 
     * @return visibleTo
     */
    public java.lang.String[] getVisibleTo() {
        return visibleTo;
    }


    /**
     * Sets the visibleTo value for this CreateCommentNew.
     * 
     * @param visibleTo
     */
    public void setVisibleTo(java.lang.String[] visibleTo) {
        this.visibleTo = visibleTo;
    }

    public java.lang.String getVisibleTo(int i) {
        return this.visibleTo[i];
    }

    public void setVisibleTo(int i, java.lang.String _value) {
        this.visibleTo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateCommentNew)) return false;
        CreateCommentNew other = (CreateCommentNew) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parentURI==null && other.getParentURI()==null) || 
             (this.parentURI!=null &&
              this.parentURI.equals(other.getParentURI()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.visibleTo==null && other.getVisibleTo()==null) || 
             (this.visibleTo!=null &&
              java.util.Arrays.equals(this.visibleTo, other.getVisibleTo())));
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
        if (getParentURI() != null) {
            _hashCode += getParentURI().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getVisibleTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisibleTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisibleTo(), i);
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
        new org.apache.axis.description.TypeDesc(CreateCommentNew.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createCommentNew"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "visibleTo"));
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
