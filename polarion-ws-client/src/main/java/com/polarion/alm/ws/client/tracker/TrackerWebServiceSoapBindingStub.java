/**
 * TrackerWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.tracker;

public class TrackerWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.polarion.alm.ws.client.tracker.TrackerWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[180];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addApprovee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "approveeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAssignee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "assigneeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addAssigneeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addCategoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addCommentToActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "activityGlobalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentText"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addExternalLinkedRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "repositoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addExternalLinkedRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addExternallyLinkedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedExternalWorkitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addExternallyLinkedItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addHyperlinkReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLinkedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedWorkitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLinkedItemWithRev");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedItemWithRevReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLinkedRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPlaningContraint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "constraint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addPlaningContraintReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("canCommentActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "activityGlobalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "canCommentActivityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("canCurrentUserAddCommentToActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "activityGlobalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "canCurrentUserAddCommentToActivityReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Baseline.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCommentNew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "visibleTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createCommentNewReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentTitle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "allowedWITypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "structureLinkRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "homePageContent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocumentComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocumentCommentReferringWI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReferringWIReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createDocumentCommentReply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReplyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "allowedWITypes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "structureLinkRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentToChild"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "homePageContent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createModuleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWorkItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"), com.polarion.alm.ws.client.types.tracker.WorkItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWorkItemInModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"), com.polarion.alm.ws.client.types.tracker.WorkItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkItemInModuleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWorkRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"), com.polarion.alm.ws.client.types.projects.User.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "timeSpent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "duration"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWorkRecordWithTypeAndComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"), com.polarion.alm.ws.client.types.projects.User.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"), java.util.Date.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "timeSpent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "duration"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteWorkRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workRecordURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
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
        oper.setName("doAutoSuspect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAutoassign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editApproval");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "approveeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "ignoredFields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fieldOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Change"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Change[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "generateHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getActivityByGlobalId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "activityGlobalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Activity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getActivityByGlobalIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllEnumOptionIdsForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllEnumOptionIdsForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllEnumOptionsForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllEnumOptionsForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllowedApprovers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.projects.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedApproversReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllowedAssignees");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.projects.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedAssigneesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableActionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableEnumOptionIdsForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAvailableEnumOptionIdsForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBackLinkedWorkitems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getBackLinkedWorkitemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Category[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCategoriesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomField"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.CustomField.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomFieldKeys");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldKeysReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomFieldType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.CustomFieldType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldTypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCustomFieldTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldTypesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultLanguageDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.LanguageDefinition.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefaultLanguageDefinitionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefinedCustomFieldKeys");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "typeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldKeysReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefinedCustomFieldType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "typeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.CustomFieldType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldTypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefinedCustomFieldTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "typeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldTypesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentLocationsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDocumentSpaces");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentSpacesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDurationHours");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDurationHoursReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumControlKeyForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumControlKeyForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumControlKeyForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumControlKeyForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionFromObjectUriForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionFromObjectUriForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionFromObjectUriForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "prototypeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionFromObjectUriForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionWithEnumId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionWithEnumIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionWithKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionWithKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionsForId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionsForIdWithControl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "enumID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "controlValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForIdWithControlReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionsForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEnumOptionsForKeyWithControl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "controlValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKeyWithControlReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFilteredEnumOptionsForKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.EnumOption[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFilteredEnumOptionsForKeyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "folderName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Folder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolderReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFolderForURI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "objectURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Folder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolderForURIReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFolders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Folder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFoldersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInitialWorkflowAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkflowAction.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getInitialWorkflowActionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getInitialWorkflowActionForProjectAndType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "wiType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkflowAction.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getInitialWorkflowActionForProjectAndTypeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLanguageDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.LanguageDefinition.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinitionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLanguageDefinitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.LanguageDefinition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinitionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocalizedWorkItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Text.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemDescriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocalizedWorkItemDescriptionField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemDescriptionFieldReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocalizedWorkItemTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemTitleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLocalizedWorkItemTitleField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemTitleFieldReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleByLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByLocationReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleByLocationWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByLocationWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleByUriWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByUriWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleWorkItemUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItemUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModuleWorkItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModulesSubFolders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesSubFoldersReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getModulesWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOneDayLength");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getOneDayLengthReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "repositoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Revision.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRevisionByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Revision.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRevisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTimepoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TimePoint"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.TimePoint[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getTimepointsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUnavailableActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getUnavailableActionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiPageByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiPageByUriWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUriWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiPageUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "spaceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "spaceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPagesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiPagesWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "spaceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPagesWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWikiSpaces");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiSpacesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemByIdsWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByIdsWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemByUriInRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriInRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemByUriInRevisionWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriInRevisionWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemByUriWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsCountReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemsLinkedToRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkItemsLinkedToRevisionWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "keys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevisionWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isHistoryAvailable");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "isHistoryAvailableReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isResolvedComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "isResolvedCommentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listActivitySources");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivitySource"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.ActivitySource[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listActivitySourcesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listAllActivities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivitiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listAllActivitiesGlobalIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivitiesGlobalIdsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listGroupActivities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivitiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listGroupActivitiesGlobalIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivitiesGlobalIdsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listProjectActivities");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Activity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivitiesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listProjectActivitiesGlobalIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "count"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivitiesGlobalIdsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveWorkItemToDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "retainDocumentFlow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveWorkItemToModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "parentWorkItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performWorkflowAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "actionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryBaselines");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Baseline[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryBaselinesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModuleUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModuleUrisBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModuleUrisInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModuleUrisInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModulesBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModulesInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryModulesInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.Module[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryRevisionUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "includeInternal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisionUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryRevisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Revision[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisionsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPageUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPageUrisBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPageUrisInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPageUrisInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPagesBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPagesInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWikiPagesInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUris");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUrisBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUrisInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUrisInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUrisInBaselineLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemUrisLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsInBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsInBaselineBySQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sqlQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineBySQLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsInBaselineLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baselineRevision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsInRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsInRevisionLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevisionLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryWorkItemsLimited");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsLimitedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeApprovee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "approveeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeAssignee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "assigneeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeAssigneeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "categoryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeCategoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeExternalLinkedRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "repositoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeExternalLinkedRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeExternallyLinkedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedExternalWorkitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeExternallyLinkedItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeHyperlinkReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLinkedItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkedItemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeLinkedItemReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeLinkedRevision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revisionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeLinkedRevisionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePlaningConstraint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "constraint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removePlaningConstraintReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workflowObjectURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reuseDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sourceURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetProjectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetLocation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetTitle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateTitleInDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "derivedFields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "reuseDocumentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("reuseModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "sourceURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetProjectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetLocation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "targetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "linkRole"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "exceptFields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "derivedFields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "reuseModuleReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCommentTags");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "tags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCustomField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "customField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomField"), com.polarion.alm.ws.client.types.tracker.CustomField.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFieldsNull");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLocalizedWorkItemDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setLocalizedWorkItemTitle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setResolvedComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "commentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resolved"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAttachment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "workitemURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "fileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBaseline");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "baseline"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline"), com.polarion.alm.ws.client.types.tracker.Baseline.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDerivedDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "autoSuspect"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateDerivedModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moduleURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "revision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module"), com.polarion.alm.ws.client.types.tracker.Module.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTitleHeadingInDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "documentURI"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "title"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateTitleHeadingInDocumentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateWorkItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem"), com.polarion.alm.ws.client.types.tracker.WorkItem.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[179] = oper;

    }

    public TrackerWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TrackerWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TrackerWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings2();
        addBindings3();
        addBindings4();
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "ArrayOfPlan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "ArrayOfPlanRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.PlanRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanRecord");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.PlanRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "ArrayOfUser");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.projects.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addApprovee");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddApprovee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addApproveeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddApproveeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addAssignee");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddAssignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addAssigneeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddAssigneeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addCategory");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addCommentToActivity");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddCommentToActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addCommentToActivityResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddCommentToActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addExternalLinkedRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddExternalLinkedRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addExternalLinkedRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddExternalLinkedRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addExternallyLinkedItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddExternallyLinkedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addExternallyLinkedItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddExternallyLinkedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addHyperlink");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedItemWithRev");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedItemWithRev.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedItemWithRevResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedItemWithRevResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addLinkedRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddLinkedRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addPlaningContraint");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddPlaningContraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">addPlaningContraintResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.AddPlaningContraintResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">canCommentActivity");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CanCommentActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">canCommentActivityResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CanCommentActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">canCurrentUserAddCommentToActivity");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CanCurrentUserAddCommentToActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">canCurrentUserAddCommentToActivityResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CanCurrentUserAddCommentToActivityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateBaselineResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createCommentNew");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateCommentNew.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createCommentNewResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateCommentNewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createCommentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateCommentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocument");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReferringWI");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentCommentReferringWI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReferringWIResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentCommentReferringWIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReply");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentCommentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentReplyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentCommentReplyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentCommentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentCommentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkItemInModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkItemInModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkItemInModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkItemInModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkRecordWithTypeAndComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkRecordWithTypeAndComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">createWorkRecordWithTypeAndCommentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.CreateWorkRecordWithTypeAndCommentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteBaselineResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteWorkRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteWorkRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">deleteWorkRecordResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DeleteWorkRecordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">doAutoassign");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DoAutoassign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">doAutoassignResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DoAutoassignResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">doAutoSuspect");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DoAutoSuspect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">doAutoSuspectResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.DoAutoSuspectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">editApproval");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.EditApproval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">editApprovalResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.EditApprovalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">generateHistory");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GenerateHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">generateHistoryResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Change[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Change");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "generateHistoryReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getActivityByGlobalId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetActivityByGlobalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getActivityByGlobalIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetActivityByGlobalIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionIdsForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllEnumOptionIdsForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionIdsForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForIdReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionIdsForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllEnumOptionIdsForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionIdsForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForKeyReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionsForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllEnumOptionsForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionsForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForIdReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionsForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllEnumOptionsForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllEnumOptionsForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForKeyReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllowedApprovers");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllowedApprovers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllowedApproversResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.projects.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedApproversReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllowedAssignees");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAllowedAssignees.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAllowedAssigneesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.projects.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "User");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedAssigneesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableActions");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAvailableActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableActionsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableEnumOptionIdsForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAvailableEnumOptionIdsForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableEnumOptionIdsForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForIdReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableEnumOptionIdsForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetAvailableEnumOptionIdsForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getAvailableEnumOptionIdsForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForKeyReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getBackLinkedWorkitems");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetBackLinkedWorkitems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getBackLinkedWorkitemsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getBackLinkedWorkitemsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCategories");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCategories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCategoriesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCategoriesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomField");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldKeys");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomFieldKeys.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldKeysResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldKeysReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomFieldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomFieldTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldTypes");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetCustomFieldTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getCustomFieldTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldTypesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefaultLanguageDefinition");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefaultLanguageDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefaultLanguageDefinitionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefaultLanguageDefinitionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldKeys");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefinedCustomFieldKeys.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldKeysResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldKeysReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefinedCustomFieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefinedCustomFieldTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldTypes");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDefinedCustomFieldTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDefinedCustomFieldTypesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomFieldType");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldTypesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDocumentLocations");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDocumentLocations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDocumentLocationsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentLocationsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDocumentSpaces");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDocumentSpaces.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDocumentSpacesResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentSpacesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDurationHours");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDurationHours.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getDurationHoursResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetDurationHoursResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumControlKeyForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumControlKeyForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumControlKeyForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumControlKeyForIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumControlKeyForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumControlKeyForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumControlKeyForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumControlKeyForKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionFromObjectUriForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionFromObjectUriForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionFromObjectUriForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionFromObjectUriForIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionFromObjectUriForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionFromObjectUriForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionFromObjectUriForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionFromObjectUriForKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionsForId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForIdReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForIdWithControl");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionsForIdWithControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForIdWithControlResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForIdWithControlReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionsForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKeyReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForKeyWithControl");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionsForKeyWithControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionsForKeyWithControlResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKeyWithControlReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionWithEnumId");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionWithEnumId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionWithEnumIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionWithEnumIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionWithKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionWithKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getEnumOptionWithKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetEnumOptionWithKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFilteredEnumOptionsForKey");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFilteredEnumOptionsForKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFilteredEnumOptionsForKeyResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.EnumOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOption");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFilteredEnumOptionsForKeyReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolder");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolderForURI");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFolderForURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolderForURIResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFolderForURIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolderResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFolderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFolders");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetFolders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getFoldersResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Folder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFoldersReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getInitialWorkflowAction");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetInitialWorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getInitialWorkflowActionForProjectAndType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetInitialWorkflowActionForProjectAndType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getInitialWorkflowActionForProjectAndTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetInitialWorkflowActionForProjectAndTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getInitialWorkflowActionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetInitialWorkflowActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLanguageDefinition");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLanguageDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLanguageDefinitionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLanguageDefinitionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLanguageDefinitions");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLanguageDefinitions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLanguageDefinitionsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LanguageDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinitionsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemDescription");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemDescriptionField");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemDescriptionField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemDescriptionFieldResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemDescriptionFieldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemTitle");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemTitleField");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemTitleField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemTitleFieldResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemTitleFieldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getLocalizedWorkItemTitleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetLocalizedWorkItemTitleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByLocation");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByLocationResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByLocationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByLocationWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByLocationWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByLocationWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByLocationWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByUriWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByUriWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleByUriWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleByUriWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModules");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModulesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModulesSubFolders");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModulesSubFolders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModulesSubFoldersResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesSubFoldersReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModulesWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModulesWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModulesWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItems");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleWorkItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItemsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItemUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetModuleWorkItemUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getModuleWorkItemUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItemUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getOneDayLength");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetOneDayLength.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getOneDayLengthResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetOneDayLengthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisionByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetRevisionByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisionByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetRevisionByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisions");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetRevisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getRevisionsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getTimepoints");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetTimepoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getTimepointsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.TimePoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TimePoint");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getTimepointsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getUnavailableActions");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetUnavailableActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getUnavailableActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getUnavailableActionsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPageByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPageByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUriWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPageByUriWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageByUriWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPageByUriWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPages");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPagesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPagesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPagesWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPagesWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPagesWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPagesWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiPageUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiPageUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiSpaces");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWikiSpaces.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWikiSpacesResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiSpacesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemById");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemById.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByIdsWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByIdsWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByIdsWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByIdsWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriInRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriInRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriInRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriInRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriInRevisionWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriInRevisionWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriInRevisionWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriInRevisionWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemByUriWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemByUriWithFieldsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsCount");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemsCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsCountResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemsCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsLinkedToRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemsLinkedToRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsLinkedToRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevisionReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsLinkedToRevisionWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.GetWorkItemsLinkedToRevisionWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">getWorkItemsLinkedToRevisionWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevisionWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">isHistoryAvailable");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.IsHistoryAvailable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">isHistoryAvailableResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.IsHistoryAvailableResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">isResolvedComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.IsResolvedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">isResolvedCommentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.IsResolvedCommentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listActivitySources");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListActivitySources.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listActivitySourcesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivitySource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivitySource");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listActivitySourcesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listAllActivities");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListAllActivities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listAllActivitiesGlobalIds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListAllActivitiesGlobalIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listAllActivitiesGlobalIdsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivitiesGlobalIdsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listAllActivitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivitiesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listGroupActivities");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListGroupActivities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listGroupActivitiesGlobalIds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListGroupActivitiesGlobalIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listGroupActivitiesGlobalIdsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivitiesGlobalIdsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listGroupActivitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivitiesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listProjectActivities");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListProjectActivities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listProjectActivitiesGlobalIds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ListProjectActivitiesGlobalIds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listProjectActivitiesGlobalIdsResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivitiesGlobalIdsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">listProjectActivitiesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Activity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivitiesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToDocument");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.MoveWorkItemToDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.MoveWorkItemToDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.MoveWorkItemToModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">moveWorkItemToModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.MoveWorkItemToModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">performWorkflowAction");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.PerformWorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">performWorkflowActionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.PerformWorkflowActionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryBaselines");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryBaselines.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryBaselinesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Baseline[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryBaselinesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModules");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModules.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModulesBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModulesInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModulesInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModulesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Module");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModuleUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModuleUrisBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModuleUrisInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryModuleUrisInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryModuleUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryRevisions");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryRevisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryRevisionsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Revision[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisionsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryRevisionUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryRevisionUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryRevisionUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisionUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPages");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPagesBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPagesInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPagesInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPagesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPageUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPageUrisBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPageUrisInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWikiPageUrisInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWikiPageUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItems");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsInBaselineLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsInRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInRevisionLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsInRevisionLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInRevisionLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevisionLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsInRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevisionReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemsLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsLimitedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUris");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUris.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUrisBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUrisInBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaselineBySQL");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUrisInBaselineBySQL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaselineBySQLResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineBySQLReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaselineLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUrisInBaselineLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaselineLimitedResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisInBaselineResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisLimited");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.QueryWorkItemUrisLimited.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisLimitedResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisLimitedReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">queryWorkItemUrisResponse");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeApprovee");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveApprovee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeApproveeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveApproveeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeAssignee");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveAssignee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeAssigneeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveAssigneeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeCategory");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternalLinkedRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveExternalLinkedRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternalLinkedRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveExternalLinkedRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternallyLinkedItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveExternallyLinkedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeExternallyLinkedItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveExternallyLinkedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeHyperlink");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeLinkedItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveLinkedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeLinkedItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveLinkedItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeLinkedRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveLinkedRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removeLinkedRevisionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemoveLinkedRevisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removePlaningConstraint");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemovePlaningConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">removePlaningConstraintResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.RemovePlaningConstraintResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">resetWorkflow");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ResetWorkflow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">resetWorkflowResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ResetWorkflowResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">reuseDocument");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ReuseDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">reuseDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ReuseDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">reuseModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ReuseModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">reuseModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.ReuseModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setCommentTags");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetCommentTags.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setCommentTagsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetCommentTagsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setCustomField");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setCustomFieldResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetCustomFieldResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setFieldsNull");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetFieldsNull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setFieldsNullResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetFieldsNullResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setLocalizedWorkItemDescription");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetLocalizedWorkItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setLocalizedWorkItemDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetLocalizedWorkItemDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setLocalizedWorkItemTitle");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetLocalizedWorkItemTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setLocalizedWorkItemTitleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetLocalizedWorkItemTitleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setResolvedComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetResolvedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">setResolvedCommentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.SetResolvedCommentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateAttachmentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateAttachmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateBaseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateBaseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateBaselineResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateBaselineResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateDerivedDocument");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateDerivedDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateDerivedDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateDerivedDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateDerivedModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateDerivedModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateDerivedModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateDerivedModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateModule");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateModuleResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateModuleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateTitleHeadingInDocument");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateTitleHeadingInDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateTitleHeadingInDocumentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateTitleHeadingInDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateWorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", ">updateWorkItemResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.internal.UpdateWorkItemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Activity");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Activity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivityComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityCustomValue");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivityCustomValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityCustomValueEntry");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivitySource");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivitySource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Approval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfApproval");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Approval[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Approval");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Attachment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfCategory");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Category[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Comment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfExternallyLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfHyperlink");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Hyperlink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem");
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfPlanningConstraint");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.PlanningConstraint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PlanningConstraint");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PlanningConstraint");
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfWikiPageAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPageAttachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPageAttachment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPageAttachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ArrayOfWorkRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Baseline");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Baseline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Change");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Change.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Comment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ContextId");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Custom");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Custom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "CustomField");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.CustomField.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "FieldDiff");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.FieldDiff.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Folder");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Hyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ImportedComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ImportedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LanguageDefinition");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LanguageDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LinkedWorkItem.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "PlanningConstraint");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.PlanningConstraint.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "TimePoint");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.TimePoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPage");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WikiPageAttachment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WikiPageAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkflowAction");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkflowAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "WorkRecord");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.WorkRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_tns2_Location");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_tns3_ActivityComment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivityComment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityComment");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_tns3_ActivityCustomValueEntry");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ActivityCustomValueEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ActivityCustomValueEntry");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_tns3_FieldDiff");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.FieldDiff[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "FieldDiff");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_xsd_anyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "ArrayOfRevision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Revision[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Currency");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "duration");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Revision");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.Revision.class;
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

    public void addApprovee(java.lang.String workitemURI, java.lang.String approveeId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addApprovee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, approveeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addAssignee(java.lang.String workitemURI, java.lang.String assigneeId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addAssignee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, assigneeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addCategory(java.lang.String workitemURI, java.lang.String categoryId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, categoryId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addCommentToActivity(java.lang.String activityGlobalId, com.polarion.alm.ws.client.types.Text commentText) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addCommentToActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activityGlobalId, commentText});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addExternalLinkedRevision(java.lang.String workitemURI, java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addExternalLinkedRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, repositoryName, revisionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addExternallyLinkedItem(java.lang.String workitemURI, java.lang.String linkedExternalWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addExternallyLinkedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, linkedExternalWorkitemURI, role});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addHyperlink(java.lang.String workitemURI, java.lang.String url, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, url, role});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addLinkedItem(java.lang.String workitemURI, java.lang.String linkedWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, linkedWorkitemURI, role});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addLinkedItemWithRev(java.lang.String in0, java.lang.String in1, com.polarion.alm.ws.client.types.tracker.EnumOptionId in2, java.lang.String in3, boolean in4) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedItemWithRev"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0, in1, in2, in3, new java.lang.Boolean(in4)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addLinkedRevision(java.lang.String workitemURI, java.lang.String revisionId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addLinkedRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, revisionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean addPlaningContraint(java.lang.String workitemURI, java.util.Calendar date, com.polarion.alm.ws.client.types.tracker.EnumOptionId constraint) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "addPlaningContraint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, date, constraint});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean canCommentActivity(java.lang.String activityGlobalId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "canCommentActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activityGlobalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean canCurrentUserAddCommentToActivity(java.lang.String activityGlobalId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "canCurrentUserAddCommentToActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activityGlobalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createAttachment(java.lang.String workitemURI, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Baseline createBaseline(java.lang.String projectId, java.lang.String name, java.lang.String description, java.lang.String revision) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, name, description, revision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Baseline) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Baseline) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Baseline.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createComment(java.lang.String workitemURI, com.polarion.alm.ws.client.types.Text content) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, content});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String createCommentNew(java.lang.String parentURI, java.lang.String title, com.polarion.alm.ws.client.types.Text content, java.lang.String[] visibleTo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createCommentNew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parentURI, title, content, visibleTo});

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

    public java.lang.String createDocument(java.lang.String projectId, java.lang.String location, java.lang.String documentName, java.lang.String documentTitle, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes, com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole, java.lang.String homePageContent) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location, documentName, documentTitle, allowedWITypes, structureLinkRole, homePageContent});

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

    public java.lang.String createDocumentComment(java.lang.String documentURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {documentURI, text});

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

    public java.lang.String createDocumentCommentReferringWI(java.lang.String documentURI, java.lang.String workItemURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReferringWI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {documentURI, workItemURI, text});

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

    public java.lang.String createDocumentCommentReply(java.lang.String parentURI, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createDocumentCommentReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parentURI, text});

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

    public java.lang.String createModule(java.lang.String projectId, java.lang.String location, java.lang.String moduleName, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] allowedWITypes, com.polarion.alm.ws.client.types.tracker.EnumOptionId structureLinkRole, boolean parentToChild, java.lang.String homePageContent) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location, moduleName, allowedWITypes, structureLinkRole, new java.lang.Boolean(parentToChild), homePageContent});

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

    public java.lang.String createWorkItem(com.polarion.alm.ws.client.types.tracker.WorkItem content) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {content});

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

    public java.lang.String createWorkItemInModule(java.lang.String moduleURI, java.lang.String parentWorkItemURI, com.polarion.alm.ws.client.types.tracker.WorkItem workItem) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkItemInModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moduleURI, parentWorkItemURI, workItem});

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

    public void createWorkRecord(java.lang.String workitemURI, com.polarion.alm.ws.client.types.projects.User user, java.util.Date date, java.lang.String timeSpent) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, user, date, timeSpent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createWorkRecordWithTypeAndComment(java.lang.String workitemURI, com.polarion.alm.ws.client.types.projects.User user, java.util.Date date, com.polarion.alm.ws.client.types.tracker.EnumOptionId type, java.lang.String timeSpent, java.lang.String comment) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "createWorkRecordWithTypeAndComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, user, date, type, timeSpent, comment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteAttachment(java.lang.String workitemURI, java.lang.String id) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deleteAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteBaseline(java.lang.String baselineURI) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deleteBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baselineURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteModule(java.lang.String moduleURI) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deleteModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moduleURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteWorkRecord(java.lang.String workitemURI, java.lang.String workRecordURI) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "deleteWorkRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, workRecordURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doAutoSuspect(java.lang.String workitemURI) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "doAutoSuspect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doAutoassign(java.lang.String workitemURI) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "doAutoassign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void editApproval(java.lang.String workitemURI, java.lang.String approveeId, com.polarion.alm.ws.client.types.tracker.EnumOptionId status) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "editApproval"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, approveeId, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Change[] generateHistory(java.lang.String workitemURI, java.lang.String[] ignoredFields, java.lang.String[] fieldOrder) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "generateHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, ignoredFields, fieldOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Change[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Change[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Change[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Activity getActivityByGlobalId(java.lang.String activityGlobalId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getActivityByGlobalId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activityGlobalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Activity) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Activity) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Activity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllEnumOptionIdsForId(java.lang.String projectID, java.lang.String enumId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, enumId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAllEnumOptionIdsForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionIdsForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getAllEnumOptionsForId(java.lang.String projectID, java.lang.String enumID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, enumID});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getAllEnumOptionsForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllEnumOptionsForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, key});

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

    public com.polarion.alm.ws.client.types.projects.User[] getAllowedApprovers(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedApprovers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.projects.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.projects.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.projects.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.projects.User[] getAllowedAssignees(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAllowedAssignees"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.projects.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.projects.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.projects.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkflowAction[] getAvailableActions(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAvailableEnumOptionIdsForId(java.lang.String workitemURI, java.lang.String enumID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, enumID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOptionId[] getAvailableEnumOptionIdsForKey(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getAvailableEnumOptionIdsForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOptionId[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOptionId[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[] getBackLinkedWorkitems(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getBackLinkedWorkitems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.LinkedWorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Category[] getCategories(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Category[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Category[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Category[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.CustomField getCustomField(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.CustomField) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.CustomField) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.CustomField.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getCustomFieldKeys(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldKeys"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.CustomFieldType getCustomFieldType(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.CustomFieldType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.CustomFieldType[] getCustomFieldTypes(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getCustomFieldTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition getDefaultLanguageDefinition(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefaultLanguageDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.LanguageDefinition.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getDefinedCustomFieldKeys(java.lang.String projectID, java.lang.String typeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldKeys"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, typeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.CustomFieldType getDefinedCustomFieldType(java.lang.String projectID, java.lang.String typeID, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, typeID, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.CustomFieldType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.CustomFieldType[] getDefinedCustomFieldTypes(java.lang.String projectID, java.lang.String typeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDefinedCustomFieldTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, typeID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.CustomFieldType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.CustomFieldType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getDocumentLocations(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getDocumentSpaces(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDocumentSpaces"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public float getDurationHours(java.lang.String duration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getDurationHours"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {duration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Float) _resp).floatValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getEnumControlKeyForId(java.lang.String projectID, java.lang.String enumID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumControlKeyForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, enumID});

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

    public java.lang.String getEnumControlKeyForKey(java.lang.String projectID, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumControlKeyForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, key});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForId(java.lang.String uri, java.lang.String enumId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionFromObjectUriForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, enumId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOption.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionFromObjectUriForKey(java.lang.String uri, java.lang.String prototypeName, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionFromObjectUriForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, prototypeName, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOption.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithEnumId(java.lang.String workitemURI, java.lang.String enumID, com.polarion.alm.ws.client.types.tracker.EnumOptionId id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionWithEnumId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, enumID, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOption.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption getEnumOptionWithKey(java.lang.String workitemURI, java.lang.String key, com.polarion.alm.ws.client.types.tracker.EnumOptionId id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionWithKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, key, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.EnumOption) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.EnumOption.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForId(java.lang.String workitemURI, java.lang.String enumID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, enumID});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForIdWithControl(java.lang.String projectID, java.lang.String enumID, java.lang.String controlValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForIdWithControl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, enumID, controlValue});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForKey(java.lang.String workitemURI, java.lang.String key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, key});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getEnumOptionsForKeyWithControl(java.lang.String projectID, java.lang.String key, java.lang.String controlValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getEnumOptionsForKeyWithControl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectID, key, controlValue});

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

    public com.polarion.alm.ws.client.types.tracker.EnumOption[] getFilteredEnumOptionsForKey(java.lang.String uri, java.lang.String key, java.lang.String filter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFilteredEnumOptionsForKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, key, filter});

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

    public com.polarion.alm.ws.client.types.tracker.Folder getFolder(java.lang.String projectId, java.lang.String folderName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, folderName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Folder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Folder) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Folder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Folder getFolderForURI(java.lang.String objectURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolderForURI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Folder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Folder) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Folder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Folder[] getFolders(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getFolders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Folder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Folder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Folder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowAction(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getInitialWorkflowAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkflowAction.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkflowAction getInitialWorkflowActionForProjectAndType(java.lang.String projectId, com.polarion.alm.ws.client.types.tracker.EnumOptionId wiType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getInitialWorkflowActionForProjectAndType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, wiType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkflowAction.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition getLanguageDefinition(java.lang.String projectId, java.lang.String language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, language});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.LanguageDefinition.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.LanguageDefinition[] getLanguageDefinitions(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLanguageDefinitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.LanguageDefinition[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.LanguageDefinition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Text getLocalizedWorkItemDescription(java.lang.String uri, java.lang.String language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, language});

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

    public java.lang.String getLocalizedWorkItemDescriptionField(java.lang.String projectId, java.lang.String language, com.polarion.alm.ws.client.types.tracker.EnumOptionId type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemDescriptionField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, language, type});

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

    public java.lang.String getLocalizedWorkItemTitle(java.lang.String uri, java.lang.String language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, language});

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

    public java.lang.String getLocalizedWorkItemTitleField(java.lang.String projectId, java.lang.String language, com.polarion.alm.ws.client.types.tracker.EnumOptionId type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getLocalizedWorkItemTitleField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, language, type});

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

    public com.polarion.alm.ws.client.types.tracker.Module getModuleByLocation(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module getModuleByLocationWithFields(java.lang.String projectId, java.lang.String location, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByLocationWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module getModuleByUri(java.lang.String uri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module getModuleByUriWithFields(java.lang.String uri, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleByUriWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getModuleUris(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getModuleWorkItemUris(java.lang.String moduleURI, java.lang.String parentWorkItemURI, boolean deep) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItemUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moduleURI, parentWorkItemURI, new java.lang.Boolean(deep)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getModuleWorkItems(java.lang.String moduleURI, java.lang.String parentWorkItemURI, boolean deep, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModuleWorkItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moduleURI, parentWorkItemURI, new java.lang.Boolean(deep), fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] getModules(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getModulesSubFolders(java.lang.String projectId, java.lang.String location) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesSubFolders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] getModulesWithFields(java.lang.String projectId, java.lang.String location, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getModulesWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, location, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public long getOneDayLength() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getOneDayLength"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Revision getRevision(java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {repositoryName, revisionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.Revision) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.Revision) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.Revision.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Revision getRevisionByUri(java.lang.String revisionURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisionByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {revisionURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.Revision) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.Revision) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.Revision.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getRevisions(java.lang.String in0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getRevisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.TimePoint[] getTimepoints(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getTimepoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.TimePoint[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.TimePoint[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.TimePoint[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkflowAction[] getUnavailableActions(java.lang.String workitemURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getUnavailableActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkflowAction[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkflowAction[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUri(java.lang.String uri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage getWikiPageByUriWithFields(java.lang.String uri, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageByUriWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getWikiPageUris(java.lang.String projectId, java.lang.String spaceId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPageUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, spaceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] getWikiPages(java.lang.String projectId, java.lang.String spaceId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, spaceId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] getWikiPagesWithFields(java.lang.String projectId, java.lang.String spaceId, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiPagesWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, spaceId, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] getWikiSpaces(java.lang.String projectId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWikiSpaces"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemById(java.lang.String projectId, java.lang.String workitemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, workitemId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByIdsWithFields(java.lang.String projectId, java.lang.String workitemId, java.lang.String[] keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByIdsWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, workitemId, keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUri(java.lang.String uri) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevision(java.lang.String uri, java.lang.String revision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriInRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, revision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriInRevisionWithFields(java.lang.String uri, java.lang.String revision, java.lang.String[] keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriInRevisionWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, revision, keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem getWorkItemByUriWithFields(java.lang.String uri, java.lang.String[] keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemByUriWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int getWorkItemsCount(java.lang.String query) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getWorkItemsLinkedToRevision(java.lang.String revisionURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {revisionURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] getWorkItemsLinkedToRevisionWithFields(java.lang.String revisionURI, java.lang.String[] keys) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "getWorkItemsLinkedToRevisionWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {revisionURI, keys});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isHistoryAvailable() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "isHistoryAvailable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isResolvedComment(java.lang.String commentURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "isResolvedComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commentURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.ActivitySource[] listActivitySources() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listActivitySources"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.ActivitySource[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.ActivitySource[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.ActivitySource[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Activity[] listAllActivities(java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] listAllActivitiesGlobalIds(java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listAllActivitiesGlobalIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Activity[] listGroupActivities(java.lang.String uri, java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] listGroupActivitiesGlobalIds(java.lang.String uri, java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listGroupActivitiesGlobalIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Activity[] listProjectActivities(java.lang.String projectId, java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Activity[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Activity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] listProjectActivitiesGlobalIds(java.lang.String projectId, java.lang.String query, int count) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "listProjectActivitiesGlobalIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, query, new java.lang.Integer(count)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void moveWorkItemToDocument(java.lang.String workItemURI, java.lang.String documentURI, java.lang.String parentWorkItemURI, int position, boolean retainDocumentFlow) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moveWorkItemToDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workItemURI, documentURI, parentWorkItemURI, new java.lang.Integer(position), new java.lang.Boolean(retainDocumentFlow)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void moveWorkItemToModule(java.lang.String workItemURI, java.lang.String moduleURI, java.lang.String parentWorkItemURI, int position) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "moveWorkItemToModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workItemURI, moduleURI, parentWorkItemURI, new java.lang.Integer(position)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void performWorkflowAction(java.lang.String workitemURI, int actionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "performWorkflowAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, new java.lang.Integer(actionId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Baseline[] queryBaselines(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryBaselines"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Baseline[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Baseline[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Baseline[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryModuleUris(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryModuleUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryModuleUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryModuleUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModuleUrisInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] queryModules(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.Module[] queryModulesInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryModulesInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.Module[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.Module[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryRevisionUris(java.lang.String query, java.lang.String sort, boolean includeInternal) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisionUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Boolean(includeInternal)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Revision[] queryRevisions(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryRevisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.Revision[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.Revision[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.Revision[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWikiPageUris(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWikiPageUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWikiPageUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWikiPageUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPageUrisInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPages(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WikiPage[] queryWikiPagesInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWikiPagesInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WikiPage[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WikiPage[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUris(java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUris"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUrisBySQL(java.lang.String sqlQuery) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUrisInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUrisInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUrisInBaselineLimited(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisInBaselineLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] queryWorkItemUrisLimited(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemUrisLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItems(java.lang.String query, java.lang.String sort, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsBySQL(java.lang.String sqlQuery, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaseline(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaselineBySQL(java.lang.String sqlQuery, java.lang.String baselineRevision, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineBySQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sqlQuery, baselineRevision, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInBaselineLimited(java.lang.String query, java.lang.String sort, java.lang.String baselineRevision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInBaselineLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, baselineRevision, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInRevision(java.lang.String query, java.lang.String sort, java.lang.String revision, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, revision, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsInRevisionLimited(java.lang.String query, java.lang.String sort, java.lang.String revision, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsInRevisionLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, revision, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.tracker.WorkItem[] queryWorkItemsLimited(java.lang.String query, java.lang.String sort, java.lang.String[] fields, int resultsLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "queryWorkItemsLimited"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, fields, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.tracker.WorkItem[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.tracker.WorkItem[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeApprovee(java.lang.String workitemURI, java.lang.String approveeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeApprovee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, approveeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeAssignee(java.lang.String workitemURI, java.lang.String assigneeId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeAssignee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, assigneeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeCategory(java.lang.String workitemURI, java.lang.String categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, categoryId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeExternalLinkedRevision(java.lang.String workitemURI, java.lang.String repositoryName, java.lang.String revisionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeExternalLinkedRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, repositoryName, revisionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeExternallyLinkedItem(java.lang.String workitemURI, java.lang.String linkedExternalWorkitemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeExternallyLinkedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, linkedExternalWorkitemURI, role});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeHyperlink(java.lang.String workitemURI, java.lang.String url) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeLinkedItem(java.lang.String workitemURI, java.lang.String linkedItemURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId role) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeLinkedItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, linkedItemURI, role});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removeLinkedRevision(java.lang.String workitemURI, java.lang.String revisionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removeLinkedRevision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, revisionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean removePlaningConstraint(java.lang.String workitemURI, java.util.Calendar date, com.polarion.alm.ws.client.types.tracker.EnumOptionId constraint) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "removePlaningConstraint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, date, constraint});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void resetWorkflow(java.lang.String workflowObjectURI) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "resetWorkflow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workflowObjectURI});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String reuseDocument(java.lang.String sourceURI, java.lang.String targetProjectId, java.lang.String targetLocation, java.lang.String targetName, java.lang.String targetTitle, boolean updateTitleInDocument, com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole, java.lang.String[] derivedFields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "reuseDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sourceURI, targetProjectId, targetLocation, targetName, targetTitle, new java.lang.Boolean(updateTitleInDocument), linkRole, derivedFields});

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

    public java.lang.String reuseModule(java.lang.String sourceURI, java.lang.String targetProjectId, java.lang.String targetLocation, java.lang.String targetName, com.polarion.alm.ws.client.types.tracker.EnumOptionId linkRole, java.lang.String[] fields, java.lang.String[] exceptFields, java.lang.String[] derivedFields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "reuseModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sourceURI, targetProjectId, targetLocation, targetName, linkRole, fields, exceptFields, derivedFields});

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

    public void setCommentTags(java.lang.String commentURI, com.polarion.alm.ws.client.types.tracker.EnumOptionId[] tags) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setCommentTags"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commentURI, tags});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setCustomField(com.polarion.alm.ws.client.types.tracker.CustomField customField) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setCustomField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customField});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setFieldsNull(java.lang.String workitemURI, java.lang.String[] fields) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setFieldsNull"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setLocalizedWorkItemDescription(java.lang.String uri, java.lang.String language, com.polarion.alm.ws.client.types.Text description) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setLocalizedWorkItemDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, language, description});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setLocalizedWorkItemTitle(java.lang.String uri, java.lang.String language, java.lang.String title) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setLocalizedWorkItemTitle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, language, title});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setResolvedComment(java.lang.String commentURI, boolean resolved) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "setResolvedComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commentURI, new java.lang.Boolean(resolved)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateAttachment(java.lang.String workitemURI, java.lang.String id, java.lang.String fileName, java.lang.String title, byte[] data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateAttachment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workitemURI, id, fileName, title, data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateBaseline(com.polarion.alm.ws.client.types.tracker.Baseline baseline) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateBaseline"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {baseline});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateDerivedDocument(java.lang.String documentURI, java.lang.String revision, boolean autoSuspect) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateDerivedDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {documentURI, revision, new java.lang.Boolean(autoSuspect)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateDerivedModule(java.lang.String moduleURI, java.lang.String revision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateDerivedModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {moduleURI, revision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updateModule(com.polarion.alm.ws.client.types.tracker.Module module) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {module});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String updateTitleHeadingInDocument(java.lang.String documentURI, java.lang.String title) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateTitleHeadingInDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {documentURI, title});

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

    public void updateWorkItem(com.polarion.alm.ws.client.types.tracker.WorkItem content) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-impl", "updateWorkItem"));

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

}
