/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.projects;

public class User  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.Text description;

    private java.lang.Boolean disabledNotifications;

    private java.lang.String email;

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String[] voteURIs;

    private java.lang.String[] watcheURIs;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public User() {
    }

    public User(
           com.polarion.alm.ws.client.types.Text description,
           java.lang.Boolean disabledNotifications,
           java.lang.String email,
           java.lang.String id,
           java.lang.String name,
           java.lang.String[] voteURIs,
           java.lang.String[] watcheURIs,
           java.lang.String uri,
           boolean unresolvable) {
           this.description = description;
           this.disabledNotifications = disabledNotifications;
           this.email = email;
           this.id = id;
           this.name = name;
           this.voteURIs = voteURIs;
           this.watcheURIs = watcheURIs;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the description value for this User.
     * 
     * @return description
     */
    public com.polarion.alm.ws.client.types.Text getDescription() {
        return description;
    }


    /**
     * Sets the description value for this User.
     * 
     * @param description
     */
    public void setDescription(com.polarion.alm.ws.client.types.Text description) {
        this.description = description;
    }


    /**
     * Gets the disabledNotifications value for this User.
     * 
     * @return disabledNotifications
     */
    public java.lang.Boolean getDisabledNotifications() {
        return disabledNotifications;
    }


    /**
     * Sets the disabledNotifications value for this User.
     * 
     * @param disabledNotifications
     */
    public void setDisabledNotifications(java.lang.Boolean disabledNotifications) {
        this.disabledNotifications = disabledNotifications;
    }


    /**
     * Gets the email value for this User.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this User.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the id value for this User.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this User.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the name value for this User.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this User.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the voteURIs value for this User.
     * 
     * @return voteURIs
     */
    public java.lang.String[] getVoteURIs() {
        return voteURIs;
    }


    /**
     * Sets the voteURIs value for this User.
     * 
     * @param voteURIs
     */
    public void setVoteURIs(java.lang.String[] voteURIs) {
        this.voteURIs = voteURIs;
    }


    /**
     * Gets the watcheURIs value for this User.
     * 
     * @return watcheURIs
     */
    public java.lang.String[] getWatcheURIs() {
        return watcheURIs;
    }


    /**
     * Sets the watcheURIs value for this User.
     * 
     * @param watcheURIs
     */
    public void setWatcheURIs(java.lang.String[] watcheURIs) {
        this.watcheURIs = watcheURIs;
    }


    /**
     * Gets the uri value for this User.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this User.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this User.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this User.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.disabledNotifications==null && other.getDisabledNotifications()==null) || 
             (this.disabledNotifications!=null &&
              this.disabledNotifications.equals(other.getDisabledNotifications()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.voteURIs==null && other.getVoteURIs()==null) || 
             (this.voteURIs!=null &&
              java.util.Arrays.equals(this.voteURIs, other.getVoteURIs()))) &&
            ((this.watcheURIs==null && other.getWatcheURIs()==null) || 
             (this.watcheURIs!=null &&
              java.util.Arrays.equals(this.watcheURIs, other.getWatcheURIs()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisabledNotifications() != null) {
            _hashCode += getDisabledNotifications().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVoteURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVoteURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVoteURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWatcheURIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWatcheURIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWatcheURIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "disabledNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voteURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "voteURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watcheURIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "watcheURIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
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
