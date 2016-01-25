/**
 * Revision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types;

public class Revision  implements java.io.Serializable {
    private java.lang.String author;

    private java.util.Calendar created;

    private java.lang.Boolean internalCommit;

    private java.lang.String[] linkedWorkItemURIs;

    private java.lang.String message;

    private java.lang.String name;

    private java.lang.String repositoryName;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Revision() {
    }

    public Revision(
           java.lang.String author,
           java.util.Calendar created,
           java.lang.Boolean internalCommit,
           java.lang.String[] linkedWorkItemURIs,
           java.lang.String message,
           java.lang.String name,
           java.lang.String repositoryName,
           java.lang.String uri,
           boolean unresolvable) {
           this.author = author;
           this.created = created;
           this.internalCommit = internalCommit;
           this.linkedWorkItemURIs = linkedWorkItemURIs;
           this.message = message;
           this.name = name;
           this.repositoryName = repositoryName;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the author value for this Revision.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Revision.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the created value for this Revision.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this Revision.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the internalCommit value for this Revision.
     * 
     * @return internalCommit
     */
    public java.lang.Boolean getInternalCommit() {
        return internalCommit;
    }


    /**
     * Sets the internalCommit value for this Revision.
     * 
     * @param internalCommit
     */
    public void setInternalCommit(java.lang.Boolean internalCommit) {
        this.internalCommit = internalCommit;
    }


    /**
     * Gets the linkedWorkItemURIs value for this Revision.
     * 
     * @return linkedWorkItemURIs
     */
    public java.lang.String[] getLinkedWorkItemURIs() {
        return linkedWorkItemURIs;
    }


    /**
     * Sets the linkedWorkItemURIs value for this Revision.
     * 
     * @param linkedWorkItemURIs
     */
    public void setLinkedWorkItemURIs(java.lang.String[] linkedWorkItemURIs) {
        this.linkedWorkItemURIs = linkedWorkItemURIs;
    }


    /**
     * Gets the message value for this Revision.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Revision.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the name value for this Revision.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Revision.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the repositoryName value for this Revision.
     * 
     * @return repositoryName
     */
    public java.lang.String getRepositoryName() {
        return repositoryName;
    }


    /**
     * Sets the repositoryName value for this Revision.
     * 
     * @param repositoryName
     */
    public void setRepositoryName(java.lang.String repositoryName) {
        this.repositoryName = repositoryName;
    }


    /**
     * Gets the uri value for this Revision.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Revision.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Revision.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Revision.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Revision)) return false;
        Revision other = (Revision) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.internalCommit==null && other.getInternalCommit()==null) || 
             (this.internalCommit!=null &&
              this.internalCommit.equals(other.getInternalCommit()))) &&
            ((this.linkedWorkItemURIs==null && other.getLinkedWorkItemURIs()==null) || 
             (this.linkedWorkItemURIs!=null &&
              java.util.Arrays.equals(this.linkedWorkItemURIs, other.getLinkedWorkItemURIs()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.repositoryName==null && other.getRepositoryName()==null) || 
             (this.repositoryName!=null &&
              this.repositoryName.equals(other.getRepositoryName()))) &&
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
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getInternalCommit() != null) {
            _hashCode += getInternalCommit().hashCode();
        }
        if (getLinkedWorkItemURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedWorkItemURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedWorkItemURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRepositoryName() != null) {
            _hashCode += getRepositoryName().hashCode();
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
        new org.apache.axis.description.TypeDesc(Revision.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
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
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalCommit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "internalCommit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedWorkItemURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "linkedWorkItemURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "repositoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
