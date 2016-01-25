/**
 * PlanningWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.planning;

public class PlanningWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.polarion.alm.ws.client.planning.PlanningWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[20];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPlanAllowedType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "workItemType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addPlanItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addProjectToPlanProjectSpan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "parentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "templateId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "createPlanReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPlanTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "templateId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "createPlanTemplateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deletePlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlanById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanByIdReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlanByUri");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanByUriReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlanStatistics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanStatistics"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.PlanStatistics.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanStatisticsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPlanWikiContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.Text.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanWikiContentReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePlanAllowedType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "workItemType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "EnumOptionId"), com.polarion.alm.ws.client.types.tracker.EnumOptionId.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removePlanItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "items"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeProjectFromPlanProjectSpan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPlanTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplatesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPlanTemplatesWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplatesWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPlans");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlansReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPlansWithFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "resultsLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.planning.Plan[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlansWithFieldsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPlanWikiContent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "Text"), com.polarion.alm.ws.client.types.Text.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updatePlan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan"), com.polarion.alm.ws.client.types.planning.Plan.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("wasPlanStarted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "uri"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/types", "SubterraURI"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "wasPlanStartedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    public PlanningWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PlanningWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PlanningWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addPlanAllowedType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddPlanAllowedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addPlanAllowedTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddPlanAllowedTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addPlanItems");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddPlanItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addPlanItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddPlanItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addProjectToPlanProjectSpan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddProjectToPlanProjectSpan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">addProjectToPlanProjectSpanResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.AddProjectToPlanProjectSpanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">createPlan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.CreatePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">createPlanResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.CreatePlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">createPlanTemplate");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.CreatePlanTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">createPlanTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.CreatePlanTemplateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">deletePlans");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.DeletePlans.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">deletePlansResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.DeletePlansResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanById");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanById.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanByIdResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanByIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanByUri");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanByUri.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanByUriResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanByUriResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanStatistics");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanStatisticsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanStatisticsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanWikiContent");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanWikiContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">getPlanWikiContentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.GetPlanWikiContentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removePlanAllowedType");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemovePlanAllowedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removePlanAllowedTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemovePlanAllowedTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removePlanItems");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemovePlanItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removePlanItemsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemovePlanItemsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removeProjectFromPlanProjectSpan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemoveProjectFromPlanProjectSpan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">removeProjectFromPlanProjectSpanResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.RemoveProjectFromPlanProjectSpanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlans");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SearchPlans.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlansResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlansReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlansWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SearchPlansWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlansWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlansWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlanTemplates");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SearchPlanTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlanTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplatesReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlanTemplatesWithFields");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SearchPlanTemplatesWithFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">searchPlanTemplatesWithFieldsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.Plan[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "Plan");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplatesWithFieldsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">setPlanWikiContent");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SetPlanWikiContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">setPlanWikiContentResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.SetPlanWikiContentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">updatePlan");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.UpdatePlan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">updatePlanResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.UpdatePlanResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">wasPlanStarted");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.WasPlanStarted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", ">wasPlanStartedResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.internal.WasPlanStartedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-types", "PlanStatistics");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.planning.PlanStatistics.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Category");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Category.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Comment");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Comment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "ExternallyLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.ExternallyLinkedWorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "Hyperlink");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.Hyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/TrackerWebService-types", "LinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.tracker.LinkedWorkItem.class;
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

    public void addPlanAllowedType(java.lang.String uri, com.polarion.alm.ws.client.types.tracker.EnumOptionId workItemType) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "addPlanAllowedType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, workItemType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addPlanItems(java.lang.String uri, java.lang.String[] items) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "addPlanItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, items});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addProjectToPlanProjectSpan(java.lang.String uri, java.lang.String projectId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "addProjectToPlanProjectSpan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String createPlan(java.lang.String projectId, java.lang.String name, java.lang.String id, java.lang.String parentId, java.lang.String templateId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "createPlan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, name, id, parentId, templateId});

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

    public java.lang.String createPlanTemplate(java.lang.String projectId, java.lang.String name, java.lang.String id, java.lang.String templateId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "createPlanTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, name, id, templateId});

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

    public void deletePlans(java.lang.String projectId, java.lang.String[] ids) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "deletePlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan getPlanById(java.lang.String projectId, java.lang.String id) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId, id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan getPlanByUri(java.lang.String uri) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanByUri"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.PlanStatistics getPlanStatistics(java.lang.String uri) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanStatistics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.PlanStatistics) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.PlanStatistics) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.PlanStatistics.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.Text getPlanWikiContent(java.lang.String uri) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "getPlanWikiContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

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

    public void removePlanAllowedType(java.lang.String uri, com.polarion.alm.ws.client.types.tracker.EnumOptionId workItemType) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "removePlanAllowedType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, workItemType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removePlanItems(java.lang.String uri, java.lang.String[] items) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "removePlanItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, items});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void removeProjectFromPlanProjectSpan(java.lang.String uri, java.lang.String projectId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "removeProjectFromPlanProjectSpan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlanTemplates(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlanTemplatesWithFields(java.lang.String query, java.lang.String sort, int resultsLimit, java.lang.String[] fields) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlanTemplatesWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit), fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlans(java.lang.String query, java.lang.String sort, int resultsLimit) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlans"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.planning.Plan[] searchPlansWithFields(java.lang.String query, java.lang.String sort, int resultsLimit, java.lang.String[] fields) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "searchPlansWithFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, sort, new java.lang.Integer(resultsLimit), fields});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.planning.Plan[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.planning.Plan[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setPlanWikiContent(java.lang.String uri, com.polarion.alm.ws.client.types.Text text) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "setPlanWikiContent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri, text});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void updatePlan(com.polarion.alm.ws.client.types.planning.Plan content) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "updatePlan"));

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

    public boolean wasPlanStarted(java.lang.String uri) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/PlanningWebService-impl", "wasPlanStarted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uri});

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

}
