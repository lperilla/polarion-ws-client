/**
 * TestManagementWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.testmanagement;

public interface TestManagementWebService extends java.rmi.Remote {

    /**
     * Adds new Attachment to specified Test Record. 
     * Created attachment can have differed file name from given one.
     * @param testRunUri testRunUri URI of the Test Run which contains target
     * test record.
     * @param index index of the Test Record in the test run.
     * @param fileName attachment file name
     * @param title attachment title
     * @param data attachment data
     * @since 3.7.3
     */
    public void addAttachmentToTestRecord(java.lang.String testRunUri, int index, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Adds new Attachment to given Test Run or Test Run Template.
     * 
     * @param testRunUri URI of the target Test Run or Test Run Template
     * @param fileName attachment file name
     * @param title attachment title
     * @param data attachment data
     * @since 3.7.1
     */
    public void addAttachmentToTestRun(java.lang.String testRunUri, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Adds new Attachment to specified Test Step. 
     * Created attachment can have differed file name from given one.
     * @param testRunUri testRunUri URI of the test run which contains target
     * Test Step.
     * @param index index of the Test Record in the Test Run which contains
     * target Test Step.
     * @param testStepIndex index of the Test Step in the Test Record.
     * @param fileName attachment file name
     * @param title attachment title
     * @param data attachment data
     * @since 3.7.3
     */
    public void addAttachmentToTestStep(java.lang.String testRunUri, int index, int testStepIndex, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Add a test record to a test run.
     * @param testRunUri URI of the test run to which the test record will
     * be added.
     * @param testCaseUri URI of the test case to be executed.
     * @param testResultId ID of the test result, can be {@code null}.
     * @param testComment comment to be tracked with the test record, can
     * be {@code null}.
     * @param executedByUri URI of the user to be used as author of the test
     * record, can be {@code null}.
     * @param executed date when the test case has been executed, can be
     * {@code null}.
     * @param duration duration of the test case execution, any negative
     * value is treated as {@code null}.
     * @param defectUri URI of the defect Work Item to be linked from created
     * record, can be {@code null}. 
     * @since 3.6.0
     */
    public void addTestRecord(java.lang.String testRunUri, java.lang.String testCaseUri, java.lang.String testResultId, com.polarion.alm.ws.client.types.Text testComment, java.lang.String executedByUri, java.util.Calendar executed, float duration, java.lang.String defectUri) throws java.rmi.RemoteException;

    /**
     * Adds the Test Record to the Test Run. If the Test Record to
     * add 
     * has result but does not have Test Case revision filled, the added
     * Test Record will have 
     * the Test Case revision set automatically to the current revision of
     * the Test Case. 
     * @param testRunUri URI of the target Test Run 
     * @param testRecord Test Record to add
     * @since 3.7.0
     */
    public void addTestRecordToTestRun(java.lang.String testRunUri, com.polarion.alm.ws.client.types.testmanagement.TestRecord testRecord) throws java.rmi.RemoteException;

    /**
     * Create or return existing summary defect Work Item of a test
     * run.
     * @param testRunUri URI of the test run to update the summary defect
     * for.
     * @param defectTemplateUri URI of the defect template Work Item to be
     * used, the configured template will be used if {@code null}.
     * @return the URI of the created or existing summary defect Work Item.
     * @since 3.6.0
     */
    public java.lang.String createSummaryDefect(java.lang.String testRunUri, java.lang.String defectTemplateUri) throws java.rmi.RemoteException;

    /**
     * Create a new test run
     * @param project project the test run will be created in. 
     * @param id id of the test run to be created.
     * @param template template to be used to create the test run.
     * @return URI of the created test run.
     * @since 3.6.0
     */
    public java.lang.String createTestRun(java.lang.String project, java.lang.String id, java.lang.String template) throws java.rmi.RemoteException;

    /**
     * Deletes Test Record Attachment given by Test Run, index of
     * Test Record and attachment's file name.
     * @param testRunUri testRunUri URI of the test run which contains target
     * test record.
     * @param index index of the Test Record in the test run.
     * @param fileName attachment file name
     * @since 3.7.3
     */
    public void deleteAttachmentFromTestRecord(java.lang.String testRunUri, int index, java.lang.String fileName) throws java.rmi.RemoteException;

    /**
     * Deletes Test Step Attachment given by Test Run, index of Test
     * Record, index of Test Step and attachment's file name.
     * @param testRunUri testRunUri URI of the test run which contains target
     * test record.
     * @param index index of the Test Record in the test run.
     * @param testStepIndex index of the Test Step in the Test Record.
     * @param fileName attachment file name
     * @since 3.7.3
     */
    public void deleteAttachmentFromTestStep(java.lang.String testRunUri, int index, int testStepIndex, java.lang.String fileName) throws java.rmi.RemoteException;

    /**
     * Deletes Test Run Attachment given by Test Run and attachment's
     * file name.
     * Method is applicable on Test Run Template. 
     * @param testRunUri URI of Test Run or Test Run Template containing
     * target attachment (not null)
     * @param fileName file name of Attachment to delete
     * @since 3.7.1
     */
    public void deleteTestRunAttachment(java.lang.String testRunUri, java.lang.String fileName) throws java.rmi.RemoteException;

    /**
     * Returns Attachment of given Test Run or Test Run Template.
     * 
     * @param testRunUri URI of the target Test Run or Test Run Template
     * @return the attachment
     * @since 3.7.1
     */
    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment getTestRunAttachment(java.lang.String testRunUri, java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Returns Attachments of given Test Run or Test Run Template.
     * 
     * @param testRunUri URI of the target Test Run or Test Run Template
     * @return attachments
     * @since 3.7.1
     */
    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] getTestRunAttachments(java.lang.String testRunUri) throws java.rmi.RemoteException;

    /**
     * Returns a specific test run.
     * @param project ID of the project that contains the test run to load.
     * @param id ID of the test run to load.
     * @return the test run.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunById(java.lang.String project, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * Returns a specific test run.
     * @param uri URI of the test run to load.
     * @return the test run.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunByUri(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Gets the TestSteps of WI with given URI.
     * @param uri the URI of the work item to get.
     * @return the test steps of WI with given URI
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestSteps getTestSteps(java.lang.String uri) throws java.rmi.RemoteException;

    /**
     * Gets the configuration of the Test Steps custom field.
     * @param projectId the id of the project containing the Test Steps configuration
     * 
     * @return an EnumOption Array containing the configuration for each
     * Test Steps column 
     * @since 3.7.0
     */
    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getTestStepsConfiguration(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Get the test management configuration for a specific project.
     * @param projectId the ID of the project to get the tests configuration
     * for.
     * @return the configuration.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getTestsConfiguration(java.lang.String projectId) throws java.rmi.RemoteException;

    /**
     * Returns Wiki Page content of Test Run or Test Run Template.
     * 
     * @param testRunUri URI of the target Test Run or Test Run Template
     * @return Wiki Page content of Test Run or Test Run Template  
     * @since 3.7.1
     */
    public com.polarion.alm.ws.client.types.Text getWikiContentForTestRun(java.lang.String testRunUri) throws java.rmi.RemoteException;

    /**
     * Search for test records.
     * @param query the query used to find test records.
     * @param sort the sort field.
     * @param limit the maximum number of records to be returned, -1 for
     * no limit.
     * @return the found test records.
     * @since 3.6.0
     * @deprecated since 3.8.1 with no direct replacement.
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRecord[] searchTestRecords(java.lang.String query, java.lang.String sort, int limit) throws java.rmi.RemoteException;

    /**
     * Search test run templates.
     * @param query the query used to find test run templates.
     * @param sort the field used to sort the result.
     * @return the found test run templates.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplates(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException;

    /**
     * Search test run templates.
     * @param query the query used to find test run templates.
     * @param sort the field used to sort the result.
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found test run templates.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Search test run templates.
     * @param query the query used to find test run templates.
     * @param sort the field used to sort the result.
     * @param fields test run fields that should be initialized, all other
     * fields will be {@code null}.
     * @return the found test run templates.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesWithFields(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Search test run templates.
     * @param query the query used to find test run templates.
     * @param sort the field used to sort the result.
     * @param fields test run fields that should be initialized, all other
     * fields will be {@code null}.
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found test run templates.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesWithFieldsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Search test runs.
     * @param query the query used to find test runs.
     * @param sort the field used to sort the result.
     * @return the found test runs.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRuns(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException;

    /**
     * Search test runs.
     * @param query the query used to find test runs.
     * @param sort the field used to sort the result.
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found test runs.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Search test runs.
     * @param query the query used to find test runs.
     * @param sort the field used to sort the result.
     * @param fields test run fields that should be initialized, all other
     * fields will be {@code null}.
     * @return the found test runs.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsWithFields(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException;

    /**
     * Search test runs.
     * @param query the query used to find test runs.
     * @param sort the field used to sort the result.
     * @param fields test run fields that should be initialized, all other
     * fields will be {@code null}.
     * @param resultsLimit the maximum number of records to be returned,
     * -1 for no limit.
     * @return the found test runs.
     * @since 3.6.0
     */
    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsWithFieldsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException;

    /**
     * Adds Test Steps to WI with given URI (add operation). 
     * If WI already has Test Steps, they will be completely replaced (update
     * operation). 
     * If the testSteps parameter is {@code null}, the content of the Test
     * Steps field will be emptied (delete operation).
     * @param workItemURI the SubterraURI of the item to set the WI
     * @param testSteps an array containing an entry for each step
     * @since 3.7.0
     */
    public void setTestSteps(java.lang.String workItemURI, com.polarion.alm.ws.client.types.testmanagement.TestStep[] testSteps) throws java.rmi.RemoteException;

    /**
     * Create or update the summary defect Work Item of a test run.
     * @param testRunUri URI of the test run to update the summary defect
     * for.
     * @param source source of the summary defect, used to generate the description
     * content.
     * @param totalFailures amount of total failures in the test run, used
     * to generate the description content.
     * @param totalErrors amount of total errors in the test run, used to
     * generate the description content.
     * @param totalTests amount of total tests in the test run, used to generate
     * the description content.
     * @param defectTemplateUri URI of the defect template Work Item to be
     * used, the configured template will be used if {@code null}.
     * @return the URI of the created summary defect Work Item.
     * @since 3.6.0
     */
    public java.lang.String updateSummaryDefect(java.lang.String testRunUri, java.lang.String source, int totalFailures, int totalErrors, int totalTests, java.lang.String defectTemplateUri) throws java.rmi.RemoteException;

    /**
     * Update a test record.
     * @param testRunUri URI of the test run in which the test record will
     * be updated.
     * @param index of the test record in the test run.
     * @param testResultId ID of the test result, can be {@code null}.
     * @param testComment comment to be tracked with the test record, can
     * be {@code null}.
     * @param executedByUri URI of the user to be used as author of the test
     * record, can be {@code null}.
     * @param executed date when the test case has been executed, can be
     * {@code null}.
     * @param duration duration of the test case execution, any negative
     * value is treated as {@code null}.
     * @param defectUri URI of the defect Work Item to be linked from created
     * record, can be {@code null}. 
     * @since 3.6.0
     */
    public void updateTestRecord(java.lang.String testRunUri, int index, java.lang.String testResultId, com.polarion.alm.ws.client.types.Text testComment, java.lang.String executedByUri, java.util.Calendar executed, float duration, java.lang.String defectUri) throws java.rmi.RemoteException;

    /**
     * Updates or removes the Test Record at given index in the Test
     * Run. 
     * @param testRunUri URI of the target Test Run 
     * @param index index of the Test Record in the list of all Test Records
     * of the target Test Run 
     * @param testRecord new Test Record content, or null to remove the Test
     * Record
     * @since 3.7.0
     */
    public void updateTestRecordAtIndex(java.lang.String testRunUri, int index, com.polarion.alm.ws.client.types.testmanagement.TestRecord testRecord) throws java.rmi.RemoteException;

    /**
     * Update a test run.
     * @param content new content of the test run, the uri of the content
     * must be set otherwise the call will fail.
     * @since 3.6.0
     */
    public void updateTestRun(com.polarion.alm.ws.client.types.testmanagement.TestRun content) throws java.rmi.RemoteException;

    /**
     * Updates Test Run Attachment given by Test Run and attachment's
     * file name.
     * Method is applicable on Test Run Template.
     * @param testRunUri URI of Test Run or Test Run Template containing
     * target attachment
     * @param fileName file name of Attachment to update
     * @param title new attachment title (if null attachment title is not
     * updated)
     * @param data new attachment data (if null attachment data is not updated)
     * @since 3.7.1
     */
    public void updateTestRunAttachment(java.lang.String testRunUri, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException;

    /**
     * Updates Wiki Page content of given Test Run or Test Run Template.
     * 
     * @param testRunUri URI of Test Run or Test Run Template
     * @param content new Wiki Page content of Test Run or Test Run Template
     * 
     * @since 3.7.1
     */
    public void updateWikiContentForTestRun(java.lang.String testRunUri, com.polarion.alm.ws.client.types.Text content) throws java.rmi.RemoteException;
}
