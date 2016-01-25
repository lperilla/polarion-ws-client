/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.projects;

public class Project  implements java.io.Serializable {
    private java.lang.Boolean active;

    private com.polarion.alm.ws.client.types.Text description;

    private java.util.Date finish;

    private java.lang.String id;

    private com.polarion.alm.ws.client.types.projects.User lead;

    private java.lang.String location;

    private java.util.Date lockWorkRecordsDate;

    private java.lang.String name;

    private java.lang.String projectGroupURI;

    private java.util.Date start;

    private java.lang.String trackerPrefix;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Project() {
    }

    public Project(
           java.lang.Boolean active,
           com.polarion.alm.ws.client.types.Text description,
           java.util.Date finish,
           java.lang.String id,
           com.polarion.alm.ws.client.types.projects.User lead,
           java.lang.String location,
           java.util.Date lockWorkRecordsDate,
           java.lang.String name,
           java.lang.String projectGroupURI,
           java.util.Date start,
           java.lang.String trackerPrefix,
           java.lang.String uri,
           boolean unresolvable) {
           this.active = active;
           this.description = description;
           this.finish = finish;
           this.id = id;
           this.lead = lead;
           this.location = location;
           this.lockWorkRecordsDate = lockWorkRecordsDate;
           this.name = name;
           this.projectGroupURI = projectGroupURI;
           this.start = start;
           this.trackerPrefix = trackerPrefix;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the active value for this Project.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this Project.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the description value for this Project.
     * 
     * @return description
     */
    public com.polarion.alm.ws.client.types.Text getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Project.
     * 
     * @param description
     */
    public void setDescription(com.polarion.alm.ws.client.types.Text description) {
        this.description = description;
    }


    /**
     * Gets the finish value for this Project.
     * 
     * @return finish
     */
    public java.util.Date getFinish() {
        return finish;
    }


    /**
     * Sets the finish value for this Project.
     * 
     * @param finish
     */
    public void setFinish(java.util.Date finish) {
        this.finish = finish;
    }


    /**
     * Gets the id value for this Project.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Project.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lead value for this Project.
     * 
     * @return lead
     */
    public com.polarion.alm.ws.client.types.projects.User getLead() {
        return lead;
    }


    /**
     * Sets the lead value for this Project.
     * 
     * @param lead
     */
    public void setLead(com.polarion.alm.ws.client.types.projects.User lead) {
        this.lead = lead;
    }


    /**
     * Gets the location value for this Project.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Project.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the lockWorkRecordsDate value for this Project.
     * 
     * @return lockWorkRecordsDate
     */
    public java.util.Date getLockWorkRecordsDate() {
        return lockWorkRecordsDate;
    }


    /**
     * Sets the lockWorkRecordsDate value for this Project.
     * 
     * @param lockWorkRecordsDate
     */
    public void setLockWorkRecordsDate(java.util.Date lockWorkRecordsDate) {
        this.lockWorkRecordsDate = lockWorkRecordsDate;
    }


    /**
     * Gets the name value for this Project.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Project.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectGroupURI value for this Project.
     * 
     * @return projectGroupURI
     */
    public java.lang.String getProjectGroupURI() {
        return projectGroupURI;
    }


    /**
     * Sets the projectGroupURI value for this Project.
     * 
     * @param projectGroupURI
     */
    public void setProjectGroupURI(java.lang.String projectGroupURI) {
        this.projectGroupURI = projectGroupURI;
    }


    /**
     * Gets the start value for this Project.
     * 
     * @return start
     */
    public java.util.Date getStart() {
        return start;
    }


    /**
     * Sets the start value for this Project.
     * 
     * @param start
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }


    /**
     * Gets the trackerPrefix value for this Project.
     * 
     * @return trackerPrefix
     */
    public java.lang.String getTrackerPrefix() {
        return trackerPrefix;
    }


    /**
     * Sets the trackerPrefix value for this Project.
     * 
     * @param trackerPrefix
     */
    public void setTrackerPrefix(java.lang.String trackerPrefix) {
        this.trackerPrefix = trackerPrefix;
    }


    /**
     * Gets the uri value for this Project.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Project.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Project.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Project.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.finish==null && other.getFinish()==null) || 
             (this.finish!=null &&
              this.finish.equals(other.getFinish()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lead==null && other.getLead()==null) || 
             (this.lead!=null &&
              this.lead.equals(other.getLead()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.lockWorkRecordsDate==null && other.getLockWorkRecordsDate()==null) || 
             (this.lockWorkRecordsDate!=null &&
              this.lockWorkRecordsDate.equals(other.getLockWorkRecordsDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectGroupURI==null && other.getProjectGroupURI()==null) || 
             (this.projectGroupURI!=null &&
              this.projectGroupURI.equals(other.getProjectGroupURI()))) &&
            ((this.start==null && other.getStart()==null) || 
             (this.start!=null &&
              this.start.equals(other.getStart()))) &&
            ((this.trackerPrefix==null && other.getTrackerPrefix()==null) || 
             (this.trackerPrefix!=null &&
              this.trackerPrefix.equals(other.getTrackerPrefix()))) &&
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFinish() != null) {
            _hashCode += getFinish().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLead() != null) {
            _hashCode += getLead().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLockWorkRecordsDate() != null) {
            _hashCode += getLockWorkRecordsDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectGroupURI() != null) {
            _hashCode += getProjectGroupURI().hashCode();
        }
        if (getStart() != null) {
            _hashCode += getStart().hashCode();
        }
        if (getTrackerPrefix() != null) {
            _hashCode += getTrackerPrefix().hashCode();
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
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finish");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "finish"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("lead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "lead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockWorkRecordsDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "lockWorkRecordsDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("projectGroupURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "projectGroupURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackerPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "trackerPrefix"));
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
