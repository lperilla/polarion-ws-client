/**
 * TestManagementWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.testmanagement;

public class TestManagementWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.polarion.alm.ws.client.testmanagement.TestManagementWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachmentToTestRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachmentToTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttachmentToTestStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testStepIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTestRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testCaseUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testResultId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executedByUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTestRecordToTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"), com.polarion.alm.ws.client.types.testmanagement.TestRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSummaryDefect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectTemplateUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createSummaryDefectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "template"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createTestRunReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAttachmentFromTestRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAttachmentFromTestStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testStepIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTestRunAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestRunAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "filename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.TestRunAttachment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunAttachmentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestRunAttachments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.TestRunAttachment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunAttachmentsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestRunById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestRunByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestSteps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestSteps"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestSteps.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestStepsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestStepsConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestStepsConfigurationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestsConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestsConfiguration"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestsConfigurationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiContentForTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Text.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getWikiContentForTestRunReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRecords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRecord[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRecordsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunTemplatesLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunTemplatesWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunTemplatesWithFieldsLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFieldsLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRuns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunsLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunsWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTestRunsWithFieldsLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFieldsLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setTestSteps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "workItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testSteps"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStep"), com.polarion.alm.ws.client.types.testmanagement.TestStep[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSummaryDefect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalFailures"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalErrors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "totalTests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectTemplateUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateSummaryDefectReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTestRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testResultId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executedByUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "executed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "defectUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTestRecordAtIndex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "index"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord"), com.polarion.alm.ws.client.types.testmanagement.TestRecord.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun"), com.polarion.alm.ws.client.types.testmanagement.TestRun.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTestRunAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateWikiContentForTestRun");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "testRunUri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

    }

    public TestManagementWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TestManagementWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TestManagementWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.projects.Project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.projects.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestStep");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addAttachmentToTestStepResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddAttachmentToTestStepResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addTestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddTestRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addTestRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddTestRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addTestRecordToTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddTestRecordToTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">addTestRecordToTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.AddTestRecordToTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createSummaryDefect");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.CreateSummaryDefect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createSummaryDefectResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.CreateSummaryDefectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.CreateTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">createTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.CreateTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteAttachmentFromTestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteAttachmentFromTestRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteAttachmentFromTestRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteAttachmentFromTestRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteAttachmentFromTestStep");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteAttachmentFromTestStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteAttachmentFromTestStepResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteAttachmentFromTestStepResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteTestRunAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteTestRunAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">deleteTestRunAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.DeleteTestRunAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunAttachments");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunAttachments.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunAttachmentsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.TestRunAttachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunAttachmentsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunById");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunById.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestRunByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestRunByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestsConfiguration");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestsConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestsConfigurationResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestsConfigurationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestSteps");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestSteps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestStepsConfiguration");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestStepsConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestStepsConfigurationResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestStepsConfigurationReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getTestStepsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetTestStepsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getWikiContentForTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetWikiContentForTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">getWikiContentForTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.GetWikiContentForTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRecords");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRecords.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRecordsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRecordsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRuns");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRuns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunsLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunsWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsWithFieldsLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunsWithFieldsLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsWithFieldsLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFieldsLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunsWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplates");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunTemplatesLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunTemplatesWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesWithFieldsLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SearchTestRunTemplatesWithFieldsLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesWithFieldsLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFieldsLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">searchTestRunTemplatesWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">setTestSteps");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SetTestSteps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">setTestStepsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.SetTestStepsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateSummaryDefect");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateSummaryDefect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateSummaryDefectResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateSummaryDefectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRecordAtIndex");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRecordAtIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRecordAtIndexResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRecordAtIndexResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRunAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRunAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRunAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRunAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateWikiContentForTestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateWikiContentForTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", ">updateWikiContentForTestRunResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.internal.UpdateWikiContentForTestRunResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "ArrayOfTestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "ArrayOfTestStep");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStep");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStep");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "ArrayOfTestStepResult");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestStepResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "Properties");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.Property[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "property");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.Property.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestRun");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestsConfiguration");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStep");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestStepResult");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestStepResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-types", "TestSteps");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.testmanagement.TestSteps.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfCustom");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Custom[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfEnumOptionId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfModuleComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ModuleComment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfPriorityOptionId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.PriorityOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PriorityOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PriorityOptionId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfTestRunAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.TestRunAttachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Custom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.CustomFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumCustomFieldType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumCustomFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ImportedComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ImportedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ModuleComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ModuleComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PriorityOpt");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.PriorityOpt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PriorityOptionId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.PriorityOptionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TestRunAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.TestRunAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "ArrayOfSubterraURI");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "ArrayOfText");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Text[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Currency");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Properties");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Property[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "property");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "property");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "property");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Property.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Text.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void addAttachmentToTestRecord(java.lang.String testRunUri, int index, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "addAttachmentToTestRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addAttachmentToTestRun(java.lang.String testRunUri, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "addAttachmentToTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addAttachmentToTestStep(java.lang.String testRunUri, int index, int testStepIndex, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "addAttachmentToTestStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), new java.lang.Integer(testStepIndex), fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addTestRecord(java.lang.String testRunUri, java.lang.String testCaseUri, java.lang.String testResultId, com.polarion.alm.ws.client.types.Text testComment, java.lang.String executedByUri, java.util.Calendar executed, float duration, java.lang.String defectUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "addTestRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, testCaseUri, testResultId, testComment, executedByUri, executed, new java.lang.Float(duration), defectUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addTestRecordToTestRun(java.lang.String testRunUri, com.polarion.alm.ws.client.types.testmanagement.TestRecord testRecord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "addTestRecordToTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, testRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String createSummaryDefect(java.lang.String testRunUri, java.lang.String defectTemplateUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createSummaryDefect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, defectTemplateUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String createTestRun(java.lang.String project, java.lang.String id, java.lang.String template) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "createTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {project, id, template});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteAttachmentFromTestRecord(java.lang.String testRunUri, int index, java.lang.String fileName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "deleteAttachmentFromTestRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), fileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteAttachmentFromTestStep(java.lang.String testRunUri, int index, int testStepIndex, java.lang.String fileName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "deleteAttachmentFromTestStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), new java.lang.Integer(testStepIndex), fileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteTestRunAttachment(java.lang.String testRunUri, java.lang.String fileName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "deleteTestRunAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, fileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment getTestRunAttachment(java.lang.String testRunUri, java.lang.String filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, filename});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.TestRunAttachment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.TestRunAttachment) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.TestRunAttachment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.TestRunAttachment[] getTestRunAttachments(java.lang.String testRunUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunAttachments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.TestRunAttachment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.TestRunAttachment[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.TestRunAttachment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunById(java.lang.String project, java.lang.String id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {project, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun getTestRunByUri(java.lang.String uri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestRunByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestSteps getTestSteps(java.lang.String uri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestSteps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestSteps) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestSteps) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestSteps.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getTestStepsConfiguration(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestStepsConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration getTestsConfiguration(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getTestsConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestsConfiguration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Text getWikiContentForTestRun(java.lang.String testRunUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "getWikiContentForTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.Text) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.Text) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.Text.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRecord[] searchTestRecords(java.lang.String query, java.lang.String sort, int limit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRecords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRecord[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRecord[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRecord[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplates(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesWithFields(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunTemplatesWithFieldsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunTemplatesWithFieldsLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRuns(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRuns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsWithFields(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.testmanagement.TestRun[] searchTestRunsWithFieldsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "searchTestRunsWithFieldsLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.testmanagement.TestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.testmanagement.TestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setTestSteps(java.lang.String workItemURI, com.polarion.alm.ws.client.types.testmanagement.TestStep[] testSteps) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "setTestSteps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workItemURI, testSteps});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateSummaryDefect(java.lang.String testRunUri, java.lang.String source, int totalFailures, int totalErrors, int totalTests, java.lang.String defectTemplateUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateSummaryDefect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, source, new java.lang.Integer(totalFailures), new java.lang.Integer(totalErrors), new java.lang.Integer(totalTests), defectTemplateUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateTestRecord(java.lang.String testRunUri, int index, java.lang.String testResultId, com.polarion.alm.ws.client.types.Text testComment, java.lang.String executedByUri, java.util.Calendar executed, float duration, java.lang.String defectUri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateTestRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), testResultId, testComment, executedByUri, executed, new java.lang.Float(duration), defectUri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateTestRecordAtIndex(java.lang.String testRunUri, int index, com.polarion.alm.ws.client.types.testmanagement.TestRecord testRecord) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateTestRecordAtIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, new java.lang.Integer(index), testRecord});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateTestRun(com.polarion.alm.ws.client.types.testmanagement.TestRun content) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {content});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateTestRunAttachment(java.lang.String testRunUri, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateTestRunAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateWikiContentForTestRun(java.lang.String testRunUri, com.polarion.alm.ws.client.types.Text content) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TestManagementWebService-impl", "updateWikiContentForTestRun"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunUri, content});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
