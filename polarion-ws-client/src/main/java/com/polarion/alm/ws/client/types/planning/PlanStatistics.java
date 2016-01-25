/**
 * PlanStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.planning;

public class PlanStatistics  implements java.io.Serializable {
    private float done;

    private float todo;

    private java.lang.Integer numberOfResolved;

    private java.lang.Integer numberOfUnresolved;

    private java.lang.Integer numberOfPlanned;

    private float planned;

    private float progress;

    private float idealProgress;

    private java.lang.String doneAsString;

    private java.lang.String todoAsString;

    private java.lang.String plannedAsString;

    private java.lang.String idealProgressAsString;

    private java.lang.String progressAsString;

    public PlanStatistics() {
    }

    public PlanStatistics(
           float done,
           float todo,
           java.lang.Integer numberOfResolved,
           java.lang.Integer numberOfUnresolved,
           java.lang.Integer numberOfPlanned,
           float planned,
           float progress,
           float idealProgress,
           java.lang.String doneAsString,
           java.lang.String todoAsString,
           java.lang.String plannedAsString,
           java.lang.String idealProgressAsString,
           java.lang.String progressAsString) {
           this.done = done;
           this.todo = todo;
           this.numberOfResolved = numberOfResolved;
           this.numberOfUnresolved = numberOfUnresolved;
           this.numberOfPlanned = numberOfPlanned;
           this.planned = planned;
           this.progress = progress;
           this.idealProgress = idealProgress;
           this.doneAsString = doneAsString;
           this.todoAsString = todoAsString;
           this.plannedAsString = plannedAsString;
           this.idealProgressAsString = idealProgressAsString;
           this.progressAsString = progressAsString;
    }


    /**
     * Gets the done value for this PlanStatistics.
     * 
     * @return done
     */
    public float getDone() {
        return done;
    }


    /**
     * Sets the done value for this PlanStatistics.
     * 
     * @param done
     */
    public void setDone(float done) {
        this.done = done;
    }


    /**
     * Gets the todo value for this PlanStatistics.
     * 
     * @return todo
     */
    public float getTodo() {
        return todo;
    }


    /**
     * Sets the todo value for this PlanStatistics.
     * 
     * @param todo
     */
    public void setTodo(float todo) {
        this.todo = todo;
    }


    /**
     * Gets the numberOfResolved value for this PlanStatistics.
     * 
     * @return numberOfResolved
     */
    public java.lang.Integer getNumberOfResolved() {
        return numberOfResolved;
    }


    /**
     * Sets the numberOfResolved value for this PlanStatistics.
     * 
     * @param numberOfResolved
     */
    public void setNumberOfResolved(java.lang.Integer numberOfResolved) {
        this.numberOfResolved = numberOfResolved;
    }


    /**
     * Gets the numberOfUnresolved value for this PlanStatistics.
     * 
     * @return numberOfUnresolved
     */
    public java.lang.Integer getNumberOfUnresolved() {
        return numberOfUnresolved;
    }


    /**
     * Sets the numberOfUnresolved value for this PlanStatistics.
     * 
     * @param numberOfUnresolved
     */
    public void setNumberOfUnresolved(java.lang.Integer numberOfUnresolved) {
        this.numberOfUnresolved = numberOfUnresolved;
    }


    /**
     * Gets the numberOfPlanned value for this PlanStatistics.
     * 
     * @return numberOfPlanned
     */
    public java.lang.Integer getNumberOfPlanned() {
        return numberOfPlanned;
    }


    /**
     * Sets the numberOfPlanned value for this PlanStatistics.
     * 
     * @param numberOfPlanned
     */
    public void setNumberOfPlanned(java.lang.Integer numberOfPlanned) {
        this.numberOfPlanned = numberOfPlanned;
    }


    /**
     * Gets the planned value for this PlanStatistics.
     * 
     * @return planned
     */
    public float getPlanned() {
        return planned;
    }


    /**
     * Sets the planned value for this PlanStatistics.
     * 
     * @param planned
     */
    public void setPlanned(float planned) {
        this.planned = planned;
    }


    /**
     * Gets the progress value for this PlanStatistics.
     * 
     * @return progress
     */
    public float getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this PlanStatistics.
     * 
     * @param progress
     */
    public void setProgress(float progress) {
        this.progress = progress;
    }


    /**
     * Gets the idealProgress value for this PlanStatistics.
     * 
     * @return idealProgress
     */
    public float getIdealProgress() {
        return idealProgress;
    }


    /**
     * Sets the idealProgress value for this PlanStatistics.
     * 
     * @param idealProgress
     */
    public void setIdealProgress(float idealProgress) {
        this.idealProgress = idealProgress;
    }


    /**
     * Gets the doneAsString value for this PlanStatistics.
     * 
     * @return doneAsString
     */
    public java.lang.String getDoneAsString() {
        return doneAsString;
    }


    /**
     * Sets the doneAsString value for this PlanStatistics.
     * 
     * @param doneAsString
     */
    public void setDoneAsString(java.lang.String doneAsString) {
        this.doneAsString = doneAsString;
    }


    /**
     * Gets the todoAsString value for this PlanStatistics.
     * 
     * @return todoAsString
     */
    public java.lang.String getTodoAsString() {
        return todoAsString;
    }


    /**
     * Sets the todoAsString value for this PlanStatistics.
     * 
     * @param todoAsString
     */
    public void setTodoAsString(java.lang.String todoAsString) {
        this.todoAsString = todoAsString;
    }


    /**
     * Gets the plannedAsString value for this PlanStatistics.
     * 
     * @return plannedAsString
     */
    public java.lang.String getPlannedAsString() {
        return plannedAsString;
    }


    /**
     * Sets the plannedAsString value for this PlanStatistics.
     * 
     * @param plannedAsString
     */
    public void setPlannedAsString(java.lang.String plannedAsString) {
        this.plannedAsString = plannedAsString;
    }


    /**
     * Gets the idealProgressAsString value for this PlanStatistics.
     * 
     * @return idealProgressAsString
     */
    public java.lang.String getIdealProgressAsString() {
        return idealProgressAsString;
    }


    /**
     * Sets the idealProgressAsString value for this PlanStatistics.
     * 
     * @param idealProgressAsString
     */
    public void setIdealProgressAsString(java.lang.String idealProgressAsString) {
        this.idealProgressAsString = idealProgressAsString;
    }


    /**
     * Gets the progressAsString value for this PlanStatistics.
     * 
     * @return progressAsString
     */
    public java.lang.String getProgressAsString() {
        return progressAsString;
    }


    /**
     * Sets the progressAsString value for this PlanStatistics.
     * 
     * @param progressAsString
     */
    public void setProgressAsString(java.lang.String progressAsString) {
        this.progressAsString = progressAsString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanStatistics)) return false;
        PlanStatistics other = (PlanStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.done == other.getDone() &&
            this.todo == other.getTodo() &&
            ((this.numberOfResolved==null && other.getNumberOfResolved()==null) || 
             (this.numberOfResolved!=null &&
              this.numberOfResolved.equals(other.getNumberOfResolved()))) &&
            ((this.numberOfUnresolved==null && other.getNumberOfUnresolved()==null) || 
             (this.numberOfUnresolved!=null &&
              this.numberOfUnresolved.equals(other.getNumberOfUnresolved()))) &&
            ((this.numberOfPlanned==null && other.getNumberOfPlanned()==null) || 
             (this.numberOfPlanned!=null &&
              this.numberOfPlanned.equals(other.getNumberOfPlanned()))) &&
            this.planned == other.getPlanned() &&
            this.progress == other.getProgress() &&
            this.idealProgress == other.getIdealProgress() &&
            ((this.doneAsString==null && other.getDoneAsString()==null) || 
             (this.doneAsString!=null &&
              this.doneAsString.equals(other.getDoneAsString()))) &&
            ((this.todoAsString==null && other.getTodoAsString()==null) || 
             (this.todoAsString!=null &&
              this.todoAsString.equals(other.getTodoAsString()))) &&
            ((this.plannedAsString==null && other.getPlannedAsString()==null) || 
             (this.plannedAsString!=null &&
              this.plannedAsString.equals(other.getPlannedAsString()))) &&
            ((this.idealProgressAsString==null && other.getIdealProgressAsString()==null) || 
             (this.idealProgressAsString!=null &&
              this.idealProgressAsString.equals(other.getIdealProgressAsString()))) &&
            ((this.progressAsString==null && other.getProgressAsString()==null) || 
             (this.progressAsString!=null &&
              this.progressAsString.equals(other.getProgressAsString())));
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
        _hashCode += new Float(getDone()).hashCode();
        _hashCode += new Float(getTodo()).hashCode();
        if (getNumberOfResolved() != null) {
            _hashCode += getNumberOfResolved().hashCode();
        }
        if (getNumberOfUnresolved() != null) {
            _hashCode += getNumberOfUnresolved().hashCode();
        }
        if (getNumberOfPlanned() != null) {
            _hashCode += getNumberOfPlanned().hashCode();
        }
        _hashCode += new Float(getPlanned()).hashCode();
        _hashCode += new Float(getProgress()).hashCode();
        _hashCode += new Float(getIdealProgress()).hashCode();
        if (getDoneAsString() != null) {
            _hashCode += getDoneAsString().hashCode();
        }
        if (getTodoAsString() != null) {
            _hashCode += getTodoAsString().hashCode();
        }
        if (getPlannedAsString() != null) {
            _hashCode += getPlannedAsString().hashCode();
        }
        if (getIdealProgressAsString() != null) {
            _hashCode += getIdealProgressAsString().hashCode();
        }
        if (getProgressAsString() != null) {
            _hashCode += getProgressAsString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("done");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "done"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "todo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfResolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "numberOfResolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfUnresolved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "numberOfUnresolved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPlanned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "numberOfPlanned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "planned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idealProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "idealProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doneAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "doneAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todoAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "todoAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plannedAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "plannedAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idealProgressAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "idealProgressAsString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressAsString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "progressAsString"));
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
