/**
 * TestsConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.testmanagement;

public class TestsConfiguration  implements java.io.Serializable {
    private boolean defectAutoAssignementEnabled;

    private java.lang.String defectReuseType;

    private java.lang.String defectTemplate;

    private java.lang.String defectToTestCaseLinkRoleId;

    private java.lang.String defectWorkItemType;

    private java.lang.String defectsProject;

    private com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestCaseToDefect;

    private com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToLinkedDefect;

    private com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToNewDefect;

    private java.lang.Integer maxCreatedDefects;

    private java.lang.Integer maxCreatedDefectsPercent;

    private java.lang.String resultErrorEnumId;

    private java.lang.String resultFailedEnumId;

    private java.lang.String resultPassedEnumId;

    private boolean retestAllowed;

    private java.lang.String statusErrorEnumId;

    private java.lang.String statusFailedEnumId;

    private java.lang.String statusOkEnumId;

    private java.lang.String summaryDefectSeverity;

    private java.lang.String testCaseIdCustomField;

    private java.lang.String testCaseTemplate;

    private java.lang.String testCaseTestCommentFieldId;

    private java.lang.String testCaseTestResultFieldId;

    private java.lang.String testCaseWorkItemType;

    private java.lang.String testRunTemplate;

    private boolean testRunsGeneratedIdEnabled;

    public TestsConfiguration() {
    }

    public TestsConfiguration(
           boolean defectAutoAssignementEnabled,
           java.lang.String defectReuseType,
           java.lang.String defectTemplate,
           java.lang.String defectToTestCaseLinkRoleId,
           java.lang.String defectWorkItemType,
           java.lang.String defectsProject,
           com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestCaseToDefect,
           com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToLinkedDefect,
           com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToNewDefect,
           java.lang.Integer maxCreatedDefects,
           java.lang.Integer maxCreatedDefectsPercent,
           java.lang.String resultErrorEnumId,
           java.lang.String resultFailedEnumId,
           java.lang.String resultPassedEnumId,
           boolean retestAllowed,
           java.lang.String statusErrorEnumId,
           java.lang.String statusFailedEnumId,
           java.lang.String statusOkEnumId,
           java.lang.String summaryDefectSeverity,
           java.lang.String testCaseIdCustomField,
           java.lang.String testCaseTemplate,
           java.lang.String testCaseTestCommentFieldId,
           java.lang.String testCaseTestResultFieldId,
           java.lang.String testCaseWorkItemType,
           java.lang.String testRunTemplate,
           boolean testRunsGeneratedIdEnabled) {
           this.defectAutoAssignementEnabled = defectAutoAssignementEnabled;
           this.defectReuseType = defectReuseType;
           this.defectTemplate = defectTemplate;
           this.defectToTestCaseLinkRoleId = defectToTestCaseLinkRoleId;
           this.defectWorkItemType = defectWorkItemType;
           this.defectsProject = defectsProject;
           this.fieldsToCopyFromTestCaseToDefect = fieldsToCopyFromTestCaseToDefect;
           this.fieldsToCopyFromTestRunToLinkedDefect = fieldsToCopyFromTestRunToLinkedDefect;
           this.fieldsToCopyFromTestRunToNewDefect = fieldsToCopyFromTestRunToNewDefect;
           this.maxCreatedDefects = maxCreatedDefects;
           this.maxCreatedDefectsPercent = maxCreatedDefectsPercent;
           this.resultErrorEnumId = resultErrorEnumId;
           this.resultFailedEnumId = resultFailedEnumId;
           this.resultPassedEnumId = resultPassedEnumId;
           this.retestAllowed = retestAllowed;
           this.statusErrorEnumId = statusErrorEnumId;
           this.statusFailedEnumId = statusFailedEnumId;
           this.statusOkEnumId = statusOkEnumId;
           this.summaryDefectSeverity = summaryDefectSeverity;
           this.testCaseIdCustomField = testCaseIdCustomField;
           this.testCaseTemplate = testCaseTemplate;
           this.testCaseTestCommentFieldId = testCaseTestCommentFieldId;
           this.testCaseTestResultFieldId = testCaseTestResultFieldId;
           this.testCaseWorkItemType = testCaseWorkItemType;
           this.testRunTemplate = testRunTemplate;
           this.testRunsGeneratedIdEnabled = testRunsGeneratedIdEnabled;
    }


    /**
     * Gets the defectAutoAssignementEnabled value for this TestsConfiguration.
     * 
     * @return defectAutoAssignementEnabled
     */
    public boolean isDefectAutoAssignementEnabled() {
        return defectAutoAssignementEnabled;
    }


    /**
     * Sets the defectAutoAssignementEnabled value for this TestsConfiguration.
     * 
     * @param defectAutoAssignementEnabled
     */
    public void setDefectAutoAssignementEnabled(boolean defectAutoAssignementEnabled) {
        this.defectAutoAssignementEnabled = defectAutoAssignementEnabled;
    }


    /**
     * Gets the defectReuseType value for this TestsConfiguration.
     * 
     * @return defectReuseType
     */
    public java.lang.String getDefectReuseType() {
        return defectReuseType;
    }


    /**
     * Sets the defectReuseType value for this TestsConfiguration.
     * 
     * @param defectReuseType
     */
    public void setDefectReuseType(java.lang.String defectReuseType) {
        this.defectReuseType = defectReuseType;
    }


    /**
     * Gets the defectTemplate value for this TestsConfiguration.
     * 
     * @return defectTemplate
     */
    public java.lang.String getDefectTemplate() {
        return defectTemplate;
    }


    /**
     * Sets the defectTemplate value for this TestsConfiguration.
     * 
     * @param defectTemplate
     */
    public void setDefectTemplate(java.lang.String defectTemplate) {
        this.defectTemplate = defectTemplate;
    }


    /**
     * Gets the defectToTestCaseLinkRoleId value for this TestsConfiguration.
     * 
     * @return defectToTestCaseLinkRoleId
     */
    public java.lang.String getDefectToTestCaseLinkRoleId() {
        return defectToTestCaseLinkRoleId;
    }


    /**
     * Sets the defectToTestCaseLinkRoleId value for this TestsConfiguration.
     * 
     * @param defectToTestCaseLinkRoleId
     */
    public void setDefectToTestCaseLinkRoleId(java.lang.String defectToTestCaseLinkRoleId) {
        this.defectToTestCaseLinkRoleId = defectToTestCaseLinkRoleId;
    }


    /**
     * Gets the defectWorkItemType value for this TestsConfiguration.
     * 
     * @return defectWorkItemType
     */
    public java.lang.String getDefectWorkItemType() {
        return defectWorkItemType;
    }


    /**
     * Sets the defectWorkItemType value for this TestsConfiguration.
     * 
     * @param defectWorkItemType
     */
    public void setDefectWorkItemType(java.lang.String defectWorkItemType) {
        this.defectWorkItemType = defectWorkItemType;
    }


    /**
     * Gets the defectsProject value for this TestsConfiguration.
     * 
     * @return defectsProject
     */
    public java.lang.String getDefectsProject() {
        return defectsProject;
    }


    /**
     * Sets the defectsProject value for this TestsConfiguration.
     * 
     * @param defectsProject
     */
    public void setDefectsProject(java.lang.String defectsProject) {
        this.defectsProject = defectsProject;
    }


    /**
     * Gets the fieldsToCopyFromTestCaseToDefect value for this TestsConfiguration.
     * 
     * @return fieldsToCopyFromTestCaseToDefect
     */
    public com.polarion.alm.ws.client.types.testmanagement.Property[] getFieldsToCopyFromTestCaseToDefect() {
        return fieldsToCopyFromTestCaseToDefect;
    }


    /**
     * Sets the fieldsToCopyFromTestCaseToDefect value for this TestsConfiguration.
     * 
     * @param fieldsToCopyFromTestCaseToDefect
     */
    public void setFieldsToCopyFromTestCaseToDefect(com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestCaseToDefect) {
        this.fieldsToCopyFromTestCaseToDefect = fieldsToCopyFromTestCaseToDefect;
    }


    /**
     * Gets the fieldsToCopyFromTestRunToLinkedDefect value for this TestsConfiguration.
     * 
     * @return fieldsToCopyFromTestRunToLinkedDefect
     */
    public com.polarion.alm.ws.client.types.testmanagement.Property[] getFieldsToCopyFromTestRunToLinkedDefect() {
        return fieldsToCopyFromTestRunToLinkedDefect;
    }


    /**
     * Sets the fieldsToCopyFromTestRunToLinkedDefect value for this TestsConfiguration.
     * 
     * @param fieldsToCopyFromTestRunToLinkedDefect
     */
    public void setFieldsToCopyFromTestRunToLinkedDefect(com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToLinkedDefect) {
        this.fieldsToCopyFromTestRunToLinkedDefect = fieldsToCopyFromTestRunToLinkedDefect;
    }


    /**
     * Gets the fieldsToCopyFromTestRunToNewDefect value for this TestsConfiguration.
     * 
     * @return fieldsToCopyFromTestRunToNewDefect
     */
    public com.polarion.alm.ws.client.types.testmanagement.Property[] getFieldsToCopyFromTestRunToNewDefect() {
        return fieldsToCopyFromTestRunToNewDefect;
    }


    /**
     * Sets the fieldsToCopyFromTestRunToNewDefect value for this TestsConfiguration.
     * 
     * @param fieldsToCopyFromTestRunToNewDefect
     */
    public void setFieldsToCopyFromTestRunToNewDefect(com.polarion.alm.ws.client.types.testmanagement.Property[] fieldsToCopyFromTestRunToNewDefect) {
        this.fieldsToCopyFromTestRunToNewDefect = fieldsToCopyFromTestRunToNewDefect;
    }


    /**
     * Gets the maxCreatedDefects value for this TestsConfiguration.
     * 
     * @return maxCreatedDefects
     */
    public java.lang.Integer getMaxCreatedDefects() {
        return maxCreatedDefects;
    }


    /**
     * Sets the maxCreatedDefects value for this TestsConfiguration.
     * 
     * @param maxCreatedDefects
     */
    public void setMaxCreatedDefects(java.lang.Integer maxCreatedDefects) {
        this.maxCreatedDefects = maxCreatedDefects;
    }


    /**
     * Gets the maxCreatedDefectsPercent value for this TestsConfiguration.
     * 
     * @return maxCreatedDefectsPercent
     */
    public java.lang.Integer getMaxCreatedDefectsPercent() {
        return maxCreatedDefectsPercent;
    }


    /**
     * Sets the maxCreatedDefectsPercent value for this TestsConfiguration.
     * 
     * @param maxCreatedDefectsPercent
     */
    public void setMaxCreatedDefectsPercent(java.lang.Integer maxCreatedDefectsPercent) {
        this.maxCreatedDefectsPercent = maxCreatedDefectsPercent;
    }


    /**
     * Gets the resultErrorEnumId value for this TestsConfiguration.
     * 
     * @return resultErrorEnumId
     */
    public java.lang.String getResultErrorEnumId() {
        return resultErrorEnumId;
    }


    /**
     * Sets the resultErrorEnumId value for this TestsConfiguration.
     * 
     * @param resultErrorEnumId
     */
    public void setResultErrorEnumId(java.lang.String resultErrorEnumId) {
        this.resultErrorEnumId = resultErrorEnumId;
    }


    /**
     * Gets the resultFailedEnumId value for this TestsConfiguration.
     * 
     * @return resultFailedEnumId
     */
    public java.lang.String getResultFailedEnumId() {
        return resultFailedEnumId;
    }


    /**
     * Sets the resultFailedEnumId value for this TestsConfiguration.
     * 
     * @param resultFailedEnumId
     */
    public void setResultFailedEnumId(java.lang.String resultFailedEnumId) {
        this.resultFailedEnumId = resultFailedEnumId;
    }


    /**
     * Gets the resultPassedEnumId value for this TestsConfiguration.
     * 
     * @return resultPassedEnumId
     */
    public java.lang.String getResultPassedEnumId() {
        return resultPassedEnumId;
    }


    /**
     * Sets the resultPassedEnumId value for this TestsConfiguration.
     * 
     * @param resultPassedEnumId
     */
    public void setResultPassedEnumId(java.lang.String resultPassedEnumId) {
        this.resultPassedEnumId = resultPassedEnumId;
    }


    /**
     * Gets the retestAllowed value for this TestsConfiguration.
     * 
     * @return retestAllowed
     */
    public boolean isRetestAllowed() {
        return retestAllowed;
    }


    /**
     * Sets the retestAllowed value for this TestsConfiguration.
     * 
     * @param retestAllowed
     */
    public void setRetestAllowed(boolean retestAllowed) {
        this.retestAllowed = retestAllowed;
    }


    /**
     * Gets the statusErrorEnumId value for this TestsConfiguration.
     * 
     * @return statusErrorEnumId
     */
    public java.lang.String getStatusErrorEnumId() {
        return statusErrorEnumId;
    }


    /**
     * Sets the statusErrorEnumId value for this TestsConfiguration.
     * 
     * @param statusErrorEnumId
     */
    public void setStatusErrorEnumId(java.lang.String statusErrorEnumId) {
        this.statusErrorEnumId = statusErrorEnumId;
    }


    /**
     * Gets the statusFailedEnumId value for this TestsConfiguration.
     * 
     * @return statusFailedEnumId
     */
    public java.lang.String getStatusFailedEnumId() {
        return statusFailedEnumId;
    }


    /**
     * Sets the statusFailedEnumId value for this TestsConfiguration.
     * 
     * @param statusFailedEnumId
     */
    public void setStatusFailedEnumId(java.lang.String statusFailedEnumId) {
        this.statusFailedEnumId = statusFailedEnumId;
    }


    /**
     * Gets the statusOkEnumId value for this TestsConfiguration.
     * 
     * @return statusOkEnumId
     */
    public java.lang.String getStatusOkEnumId() {
        return statusOkEnumId;
    }


    /**
     * Sets the statusOkEnumId value for this TestsConfiguration.
     * 
     * @param statusOkEnumId
     */
    public void setStatusOkEnumId(java.lang.String statusOkEnumId) {
        this.statusOkEnumId = statusOkEnumId;
    }


    /**
     * Gets the summaryDefectSeverity value for this TestsConfiguration.
     * 
     * @return summaryDefectSeverity
     */
    public java.lang.String getSummaryDefectSeverity() {
        return summaryDefectSeverity;
    }


    /**
     * Sets the summaryDefectSeverity value for this TestsConfiguration.
     * 
     * @param summaryDefectSeverity
     */
    public void setSummaryDefectSeverity(java.lang.String summaryDefectSeverity) {
        this.summaryDefectSeverity = summaryDefectSeverity;
    }


    /**
     * Gets the testCaseIdCustomField value for this TestsConfiguration.
     * 
     * @return testCaseIdCustomField
     */
    public java.lang.String getTestCaseIdCustomField() {
        return testCaseIdCustomField;
    }


    /**
     * Sets the testCaseIdCustomField value for this TestsConfiguration.
     * 
     * @param testCaseIdCustomField
     */
    public void setTestCaseIdCustomField(java.lang.String testCaseIdCustomField) {
        this.testCaseIdCustomField = testCaseIdCustomField;
    }


    /**
     * Gets the testCaseTemplate value for this TestsConfiguration.
     * 
     * @return testCaseTemplate
     */
    public java.lang.String getTestCaseTemplate() {
        return testCaseTemplate;
    }


    /**
     * Sets the testCaseTemplate value for this TestsConfiguration.
     * 
     * @param testCaseTemplate
     */
    public void setTestCaseTemplate(java.lang.String testCaseTemplate) {
        this.testCaseTemplate = testCaseTemplate;
    }


    /**
     * Gets the testCaseTestCommentFieldId value for this TestsConfiguration.
     * 
     * @return testCaseTestCommentFieldId
     */
    public java.lang.String getTestCaseTestCommentFieldId() {
        return testCaseTestCommentFieldId;
    }


    /**
     * Sets the testCaseTestCommentFieldId value for this TestsConfiguration.
     * 
     * @param testCaseTestCommentFieldId
     */
    public void setTestCaseTestCommentFieldId(java.lang.String testCaseTestCommentFieldId) {
        this.testCaseTestCommentFieldId = testCaseTestCommentFieldId;
    }


    /**
     * Gets the testCaseTestResultFieldId value for this TestsConfiguration.
     * 
     * @return testCaseTestResultFieldId
     */
    public java.lang.String getTestCaseTestResultFieldId() {
        return testCaseTestResultFieldId;
    }


    /**
     * Sets the testCaseTestResultFieldId value for this TestsConfiguration.
     * 
     * @param testCaseTestResultFieldId
     */
    public void setTestCaseTestResultFieldId(java.lang.String testCaseTestResultFieldId) {
        this.testCaseTestResultFieldId = testCaseTestResultFieldId;
    }


    /**
     * Gets the testCaseWorkItemType value for this TestsConfiguration.
     * 
     * @return testCaseWorkItemType
     */
    public java.lang.String getTestCaseWorkItemType() {
        return testCaseWorkItemType;
    }


    /**
     * Sets the testCaseWorkItemType value for this TestsConfiguration.
     * 
     * @param testCaseWorkItemType
     */
    public void setTestCaseWorkItemType(java.lang.String testCaseWorkItemType) {
        this.testCaseWorkItemType = testCaseWorkItemType;
    }


    /**
     * Gets the testRunTemplate value for this TestsConfiguration.
     * 
     * @return testRunTemplate
     */
    public java.lang.String getTestRunTemplate() {
        return testRunTemplate;
    }


    /**
     * Sets the testRunTemplate value for this TestsConfiguration.
     * 
     * @param testRunTemplate
     */
    public void setTestRunTemplate(java.lang.String testRunTemplate) {
        this.testRunTemplate = testRunTemplate;
    }


    /**
     * Gets the testRunsGeneratedIdEnabled value for this TestsConfiguration.
     * 
     * @return testRunsGeneratedIdEnabled
     */
    public boolean isTestRunsGeneratedIdEnabled() {
        return testRunsGeneratedIdEnabled;
    }


    /**
     * Sets the testRunsGeneratedIdEnabled value for this TestsConfiguration.
     * 
     * @param testRunsGeneratedIdEnabled
     */
    public void setTestRunsGeneratedIdEnabled(boolean testRunsGeneratedIdEnabled) {
        this.testRunsGeneratedIdEnabled = testRunsGeneratedIdEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestsConfiguration)) return false;
        TestsConfiguration other = (TestsConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.defectAutoAssignementEnabled == other.isDefectAutoAssignementEnabled() &&
            ((this.defectReuseType==null && other.getDefectReuseType()==null) || 
             (this.defectReuseType!=null &&
              this.defectReuseType.equals(other.getDefectReuseType()))) &&
            ((this.defectTemplate==null && other.getDefectTemplate()==null) || 
             (this.defectTemplate!=null &&
              this.defectTemplate.equals(other.getDefectTemplate()))) &&
            ((this.defectToTestCaseLinkRoleId==null && other.getDefectToTestCaseLinkRoleId()==null) || 
             (this.defectToTestCaseLinkRoleId!=null &&
              this.defectToTestCaseLinkRoleId.equals(other.getDefectToTestCaseLinkRoleId()))) &&
            ((this.defectWorkItemType==null && other.getDefectWorkItemType()==null) || 
             (this.defectWorkItemType!=null &&
              this.defectWorkItemType.equals(other.getDefectWorkItemType()))) &&
            ((this.defectsProject==null && other.getDefectsProject()==null) || 
             (this.defectsProject!=null &&
              this.defectsProject.equals(other.getDefectsProject()))) &&
            ((this.fieldsToCopyFromTestCaseToDefect==null && other.getFieldsToCopyFromTestCaseToDefect()==null) || 
             (this.fieldsToCopyFromTestCaseToDefect!=null &&
              java.util.Arrays.equals(this.fieldsToCopyFromTestCaseToDefect, other.getFieldsToCopyFromTestCaseToDefect()))) &&
            ((this.fieldsToCopyFromTestRunToLinkedDefect==null && other.getFieldsToCopyFromTestRunToLinkedDefect()==null) || 
             (this.fieldsToCopyFromTestRunToLinkedDefect!=null &&
              java.util.Arrays.equals(this.fieldsToCopyFromTestRunToLinkedDefect, other.getFieldsToCopyFromTestRunToLinkedDefect()))) &&
            ((this.fieldsToCopyFromTestRunToNewDefect==null && other.getFieldsToCopyFromTestRunToNewDefect()==null) || 
             (this.fieldsToCopyFromTestRunToNewDefect!=null &&
              java.util.Arrays.equals(this.fieldsToCopyFromTestRunToNewDefect, other.getFieldsToCopyFromTestRunToNewDefect()))) &&
            ((this.maxCreatedDefects==null && other.getMaxCreatedDefects()==null) || 
             (this.maxCreatedDefects!=null &&
              this.maxCreatedDefects.equals(other.getMaxCreatedDefects()))) &&
            ((this.maxCreatedDefectsPercent==null && other.getMaxCreatedDefectsPercent()==null) || 
             (this.maxCreatedDefectsPercent!=null &&
              this.maxCreatedDefectsPercent.equals(other.getMaxCreatedDefectsPercent()))) &&
            ((this.resultErrorEnumId==null && other.getResultErrorEnumId()==null) || 
             (this.resultErrorEnumId!=null &&
              this.resultErrorEnumId.equals(other.getResultErrorEnumId()))) &&
            ((this.resultFailedEnumId==null && other.getResultFailedEnumId()==null) || 
             (this.resultFailedEnumId!=null &&
              this.resultFailedEnumId.equals(other.getResultFailedEnumId()))) &&
            ((this.resultPassedEnumId==null && other.getResultPassedEnumId()==null) || 
             (this.resultPassedEnumId!=null &&
              this.resultPassedEnumId.equals(other.getResultPassedEnumId()))) &&
            this.retestAllowed == other.isRetestAllowed() &&
            ((this.statusErrorEnumId==null && other.getStatusErrorEnumId()==null) || 
             (this.statusErrorEnumId!=null &&
              this.statusErrorEnumId.equals(other.getStatusErrorEnumId()))) &&
            ((this.statusFailedEnumId==null && other.getStatusFailedEnumId()==null) || 
             (this.statusFailedEnumId!=null &&
              this.statusFailedEnumId.equals(other.getStatusFailedEnumId()))) &&
            ((this.statusOkEnumId==null && other.getStatusOkEnumId()==null) || 
             (this.statusOkEnumId!=null &&
              this.statusOkEnumId.equals(other.getStatusOkEnumId()))) &&
            ((this.summaryDefectSeverity==null && other.getSummaryDefectSeverity()==null) || 
             (this.summaryDefectSeverity!=null &&
              this.summaryDefectSeverity.equals(other.getSummaryDefectSeverity()))) &&
            ((this.testCaseIdCustomField==null && other.getTestCaseIdCustomField()==null) || 
             (this.testCaseIdCustomField!=null &&
              this.testCaseIdCustomField.equals(other.getTestCaseIdCustomField()))) &&
            ((this.testCaseTemplate==null && other.getTestCaseTemplate()==null) || 
             (this.testCaseTemplate!=null &&
              this.testCaseTemplate.equals(other.getTestCaseTemplate()))) &&
            ((this.testCaseTestCommentFieldId==null && other.getTestCaseTestCommentFieldId()==null) || 
             (this.testCaseTestCommentFieldId!=null &&
              this.testCaseTestCommentFieldId.equals(other.getTestCaseTestCommentFieldId()))) &&
            ((this.testCaseTestResultFieldId==null && other.getTestCaseTestResultFieldId()==null) || 
             (this.testCaseTestResultFieldId!=null &&
              this.testCaseTestResultFieldId.equals(other.getTestCaseTestResultFieldId()))) &&
            ((this.testCaseWorkItemType==null && other.getTestCaseWorkItemType()==null) || 
             (this.testCaseWorkItemType!=null &&
              this.testCaseWorkItemType.equals(other.getTestCaseWorkItemType()))) &&
            ((this.testRunTemplate==null && other.getTestRunTemplate()==null) || 
             (this.testRunTemplate!=null &&
              this.testRunTemplate.equals(other.getTestRunTemplate()))) &&
            this.testRunsGeneratedIdEnabled == other.isTestRunsGeneratedIdEnabled();
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
        _hashCode += (isDefectAutoAssignementEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDefectReuseType() != null) {
            _hashCode += getDefectReuseType().hashCode();
        }
        if (getDefectTemplate() != null) {
            _hashCode += getDefectTemplate().hashCode();
        }
        if (getDefectToTestCaseLinkRoleId() != null) {
            _hashCode += getDefectToTestCaseLinkRoleId().hashCode();
        }
        if (getDefectWorkItemType() != null) {
            _hashCode += getDefectWorkItemType().hashCode();
        }
        if (getDefectsProject() != null) {
            _hashCode += getDefectsProject().hashCode();
        }
        if (getFieldsToCopyFromTestCaseToDefect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldsToCopyFromTestCaseToDefect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldsToCopyFromTestCaseToDefect(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldsToCopyFromTestRunToLinkedDefect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldsToCopyFromTestRunToLinkedDefect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldsToCopyFromTestRunToLinkedDefect(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFieldsToCopyFromTestRunToNewDefect() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldsToCopyFromTestRunToNewDefect());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldsToCopyFromTestRunToNewDefect(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxCreatedDefects() != null) {
            _hashCode += getMaxCreatedDefects().hashCode();
        }
        if (getMaxCreatedDefectsPercent() != null) {
            _hashCode += getMaxCreatedDefectsPercent().hashCode();
        }
        if (getResultErrorEnumId() != null) {
            _hashCode += getResultErrorEnumId().hashCode();
        }
        if (getResultFailedEnumId() != null) {
            _hashCode += getResultFailedEnumId().hashCode();
        }
        if (getResultPassedEnumId() != null) {
            _hashCode += getResultPassedEnumId().hashCode();
        }
        _hashCode += (isRetestAllowed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatusErrorEnumId() != null) {
            _hashCode += getStatusErrorEnumId().hashCode();
        }
        if (getStatusFailedEnumId() != null) {
            _hashCode += getStatusFailedEnumId().hashCode();
        }
        if (getStatusOkEnumId() != null) {
            _hashCode += getStatusOkEnumId().hashCode();
        }
        if (getSummaryDefectSeverity() != null) {
            _hashCode += getSummaryDefectSeverity().hashCode();
        }
        if (getTestCaseIdCustomField() != null) {
            _hashCode += getTestCaseIdCustomField().hashCode();
        }
        if (getTestCaseTemplate() != null) {
            _hashCode += getTestCaseTemplate().hashCode();
        }
        if (getTestCaseTestCommentFieldId() != null) {
            _hashCode += getTestCaseTestCommentFieldId().hashCode();
        }
        if (getTestCaseTestResultFieldId() != null) {
            _hashCode += getTestCaseTestResultFieldId().hashCode();
        }
        if (getTestCaseWorkItemType() != null) {
            _hashCode += getTestCaseWorkItemType().hashCode();
        }
        if (getTestRunTemplate() != null) {
            _hashCode += getTestRunTemplate().hashCode();
        }
        _hashCode += (isTestRunsGeneratedIdEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestsConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestsConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectAutoAssignementEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectAutoAssignementEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectReuseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectReuseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectToTestCaseLinkRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectToTestCaseLinkRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectWorkItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectWorkItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defectsProject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "defectsProject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsToCopyFromTestCaseToDefect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "fieldsToCopyFromTestCaseToDefect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsToCopyFromTestRunToLinkedDefect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "fieldsToCopyFromTestRunToLinkedDefect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldsToCopyFromTestRunToNewDefect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "fieldsToCopyFromTestRunToNewDefect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCreatedDefects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "maxCreatedDefects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCreatedDefectsPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "maxCreatedDefectsPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultErrorEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "resultErrorEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFailedEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "resultFailedEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultPassedEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "resultPassedEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retestAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "retestAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusErrorEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "statusErrorEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusFailedEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "statusFailedEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusOkEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "statusOkEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryDefectSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "summaryDefectSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseIdCustomField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseIdCustomField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseTestCommentFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseTestCommentFieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseTestResultFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseTestResultFieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseWorkItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testCaseWorkItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testRunTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunsGeneratedIdEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "testRunsGeneratedIdEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
