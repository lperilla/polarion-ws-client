/**
 * Build.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.builder;

public class Build  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.projects.User author;

    private java.lang.String birLocation;

    private java.lang.String buildDescriptorName;

    private java.lang.String buildStamp;

    private java.lang.String buildStatus;

    private java.lang.String buildTag;

    private com.polarion.alm.ws.client.types.builder.BuildTestResults buildTestResults;

    private java.lang.String calculationDescriptorName;

    private java.util.Calendar creationTime;

    private java.util.Calendar finishTime;

    private java.lang.String id;

    private java.lang.String jobId;

    private com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem[] linkedWorkItems;

    private java.lang.String localDeploymentSpaceName;

    private java.lang.String[] logFiles;

    private java.util.Calendar startTime;

    private java.lang.String uri;  // attribute

    private boolean unresolvable;  // attribute

    public Build() {
    }

    public Build(
           com.polarion.alm.ws.client.types.projects.User author,
           java.lang.String birLocation,
           java.lang.String buildDescriptorName,
           java.lang.String buildStamp,
           java.lang.String buildStatus,
           java.lang.String buildTag,
           com.polarion.alm.ws.client.types.builder.BuildTestResults buildTestResults,
           java.lang.String calculationDescriptorName,
           java.util.Calendar creationTime,
           java.util.Calendar finishTime,
           java.lang.String id,
           java.lang.String jobId,
           com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem[] linkedWorkItems,
           java.lang.String localDeploymentSpaceName,
           java.lang.String[] logFiles,
           java.util.Calendar startTime,
           java.lang.String uri,
           boolean unresolvable) {
           this.author = author;
           this.birLocation = birLocation;
           this.buildDescriptorName = buildDescriptorName;
           this.buildStamp = buildStamp;
           this.buildStatus = buildStatus;
           this.buildTag = buildTag;
           this.buildTestResults = buildTestResults;
           this.calculationDescriptorName = calculationDescriptorName;
           this.creationTime = creationTime;
           this.finishTime = finishTime;
           this.id = id;
           this.jobId = jobId;
           this.linkedWorkItems = linkedWorkItems;
           this.localDeploymentSpaceName = localDeploymentSpaceName;
           this.logFiles = logFiles;
           this.startTime = startTime;
           this.uri = uri;
           this.unresolvable = unresolvable;
    }


    /**
     * Gets the author value for this Build.
     * 
     * @return author
     */
    public com.polarion.alm.ws.client.types.projects.User getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this Build.
     * 
     * @param author
     */
    public void setAuthor(com.polarion.alm.ws.client.types.projects.User author) {
        this.author = author;
    }


    /**
     * Gets the birLocation value for this Build.
     * 
     * @return birLocation
     */
    public java.lang.String getBirLocation() {
        return birLocation;
    }


    /**
     * Sets the birLocation value for this Build.
     * 
     * @param birLocation
     */
    public void setBirLocation(java.lang.String birLocation) {
        this.birLocation = birLocation;
    }


    /**
     * Gets the buildDescriptorName value for this Build.
     * 
     * @return buildDescriptorName
     */
    public java.lang.String getBuildDescriptorName() {
        return buildDescriptorName;
    }


    /**
     * Sets the buildDescriptorName value for this Build.
     * 
     * @param buildDescriptorName
     */
    public void setBuildDescriptorName(java.lang.String buildDescriptorName) {
        this.buildDescriptorName = buildDescriptorName;
    }


    /**
     * Gets the buildStamp value for this Build.
     * 
     * @return buildStamp
     */
    public java.lang.String getBuildStamp() {
        return buildStamp;
    }


    /**
     * Sets the buildStamp value for this Build.
     * 
     * @param buildStamp
     */
    public void setBuildStamp(java.lang.String buildStamp) {
        this.buildStamp = buildStamp;
    }


    /**
     * Gets the buildStatus value for this Build.
     * 
     * @return buildStatus
     */
    public java.lang.String getBuildStatus() {
        return buildStatus;
    }


    /**
     * Sets the buildStatus value for this Build.
     * 
     * @param buildStatus
     */
    public void setBuildStatus(java.lang.String buildStatus) {
        this.buildStatus = buildStatus;
    }


    /**
     * Gets the buildTag value for this Build.
     * 
     * @return buildTag
     */
    public java.lang.String getBuildTag() {
        return buildTag;
    }


    /**
     * Sets the buildTag value for this Build.
     * 
     * @param buildTag
     */
    public void setBuildTag(java.lang.String buildTag) {
        this.buildTag = buildTag;
    }


    /**
     * Gets the buildTestResults value for this Build.
     * 
     * @return buildTestResults
     */
    public com.polarion.alm.ws.client.types.builder.BuildTestResults getBuildTestResults() {
        return buildTestResults;
    }


    /**
     * Sets the buildTestResults value for this Build.
     * 
     * @param buildTestResults
     */
    public void setBuildTestResults(com.polarion.alm.ws.client.types.builder.BuildTestResults buildTestResults) {
        this.buildTestResults = buildTestResults;
    }


    /**
     * Gets the calculationDescriptorName value for this Build.
     * 
     * @return calculationDescriptorName
     */
    public java.lang.String getCalculationDescriptorName() {
        return calculationDescriptorName;
    }


    /**
     * Sets the calculationDescriptorName value for this Build.
     * 
     * @param calculationDescriptorName
     */
    public void setCalculationDescriptorName(java.lang.String calculationDescriptorName) {
        this.calculationDescriptorName = calculationDescriptorName;
    }


    /**
     * Gets the creationTime value for this Build.
     * 
     * @return creationTime
     */
    public java.util.Calendar getCreationTime() {
        return creationTime;
    }


    /**
     * Sets the creationTime value for this Build.
     * 
     * @param creationTime
     */
    public void setCreationTime(java.util.Calendar creationTime) {
        this.creationTime = creationTime;
    }


    /**
     * Gets the finishTime value for this Build.
     * 
     * @return finishTime
     */
    public java.util.Calendar getFinishTime() {
        return finishTime;
    }


    /**
     * Sets the finishTime value for this Build.
     * 
     * @param finishTime
     */
    public void setFinishTime(java.util.Calendar finishTime) {
        this.finishTime = finishTime;
    }


    /**
     * Gets the id value for this Build.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Build.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the jobId value for this Build.
     * 
     * @return jobId
     */
    public java.lang.String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this Build.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the linkedWorkItems value for this Build.
     * 
     * @return linkedWorkItems
     */
    public com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem[] getLinkedWorkItems() {
        return linkedWorkItems;
    }


    /**
     * Sets the linkedWorkItems value for this Build.
     * 
     * @param linkedWorkItems
     */
    public void setLinkedWorkItems(com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem[] linkedWorkItems) {
        this.linkedWorkItems = linkedWorkItems;
    }


    /**
     * Gets the localDeploymentSpaceName value for this Build.
     * 
     * @return localDeploymentSpaceName
     */
    public java.lang.String getLocalDeploymentSpaceName() {
        return localDeploymentSpaceName;
    }


    /**
     * Sets the localDeploymentSpaceName value for this Build.
     * 
     * @param localDeploymentSpaceName
     */
    public void setLocalDeploymentSpaceName(java.lang.String localDeploymentSpaceName) {
        this.localDeploymentSpaceName = localDeploymentSpaceName;
    }


    /**
     * Gets the logFiles value for this Build.
     * 
     * @return logFiles
     */
    public java.lang.String[] getLogFiles() {
        return logFiles;
    }


    /**
     * Sets the logFiles value for this Build.
     * 
     * @param logFiles
     */
    public void setLogFiles(java.lang.String[] logFiles) {
        this.logFiles = logFiles;
    }


    /**
     * Gets the startTime value for this Build.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this Build.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the uri value for this Build.
     * 
     * @return uri
     */
    public java.lang.String getUri() {
        return uri;
    }


    /**
     * Sets the uri value for this Build.
     * 
     * @param uri
     */
    public void setUri(java.lang.String uri) {
        this.uri = uri;
    }


    /**
     * Gets the unresolvable value for this Build.
     * 
     * @return unresolvable
     */
    public boolean isUnresolvable() {
        return unresolvable;
    }


    /**
     * Sets the unresolvable value for this Build.
     * 
     * @param unresolvable
     */
    public void setUnresolvable(boolean unresolvable) {
        this.unresolvable = unresolvable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Build)) return false;
        Build other = (Build) obj;
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
            ((this.birLocation==null && other.getBirLocation()==null) || 
             (this.birLocation!=null &&
              this.birLocation.equals(other.getBirLocation()))) &&
            ((this.buildDescriptorName==null && other.getBuildDescriptorName()==null) || 
             (this.buildDescriptorName!=null &&
              this.buildDescriptorName.equals(other.getBuildDescriptorName()))) &&
            ((this.buildStamp==null && other.getBuildStamp()==null) || 
             (this.buildStamp!=null &&
              this.buildStamp.equals(other.getBuildStamp()))) &&
            ((this.buildStatus==null && other.getBuildStatus()==null) || 
             (this.buildStatus!=null &&
              this.buildStatus.equals(other.getBuildStatus()))) &&
            ((this.buildTag==null && other.getBuildTag()==null) || 
             (this.buildTag!=null &&
              this.buildTag.equals(other.getBuildTag()))) &&
            ((this.buildTestResults==null && other.getBuildTestResults()==null) || 
             (this.buildTestResults!=null &&
              this.buildTestResults.equals(other.getBuildTestResults()))) &&
            ((this.calculationDescriptorName==null && other.getCalculationDescriptorName()==null) || 
             (this.calculationDescriptorName!=null &&
              this.calculationDescriptorName.equals(other.getCalculationDescriptorName()))) &&
            ((this.creationTime==null && other.getCreationTime()==null) || 
             (this.creationTime!=null &&
              this.creationTime.equals(other.getCreationTime()))) &&
            ((this.finishTime==null && other.getFinishTime()==null) || 
             (this.finishTime!=null &&
              this.finishTime.equals(other.getFinishTime()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.linkedWorkItems==null && other.getLinkedWorkItems()==null) || 
             (this.linkedWorkItems!=null &&
              java.util.Arrays.equals(this.linkedWorkItems, other.getLinkedWorkItems()))) &&
            ((this.localDeploymentSpaceName==null && other.getLocalDeploymentSpaceName()==null) || 
             (this.localDeploymentSpaceName!=null &&
              this.localDeploymentSpaceName.equals(other.getLocalDeploymentSpaceName()))) &&
            ((this.logFiles==null && other.getLogFiles()==null) || 
             (this.logFiles!=null &&
              java.util.Arrays.equals(this.logFiles, other.getLogFiles()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
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
        if (getBirLocation() != null) {
            _hashCode += getBirLocation().hashCode();
        }
        if (getBuildDescriptorName() != null) {
            _hashCode += getBuildDescriptorName().hashCode();
        }
        if (getBuildStamp() != null) {
            _hashCode += getBuildStamp().hashCode();
        }
        if (getBuildStatus() != null) {
            _hashCode += getBuildStatus().hashCode();
        }
        if (getBuildTag() != null) {
            _hashCode += getBuildTag().hashCode();
        }
        if (getBuildTestResults() != null) {
            _hashCode += getBuildTestResults().hashCode();
        }
        if (getCalculationDescriptorName() != null) {
            _hashCode += getCalculationDescriptorName().hashCode();
        }
        if (getCreationTime() != null) {
            _hashCode += getCreationTime().hashCode();
        }
        if (getFinishTime() != null) {
            _hashCode += getFinishTime().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getLinkedWorkItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedWorkItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedWorkItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalDeploymentSpaceName() != null) {
            _hashCode += getLocalDeploymentSpaceName().hashCode();
        }
        if (getLogFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(Build.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "birLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildDescriptorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "buildDescriptorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "buildStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "buildStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "buildTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildTestResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "buildTestResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildTestResults"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculationDescriptorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "calculationDescriptorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "creationTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "finishTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "jobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedWorkItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "linkedWorkItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDeploymentSpaceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "localDeploymentSpaceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "logFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
