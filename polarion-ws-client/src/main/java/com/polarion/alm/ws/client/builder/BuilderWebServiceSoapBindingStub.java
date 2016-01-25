/**
 * BuilderWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.builder;

public class BuilderWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.polarion.alm.ws.client.builder.BuilderWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllBuilds");
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.builder.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getAllBuildsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBuilds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project"), com.polarion.alm.ws.client.types.projects.Project.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.builder.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getBuildsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryBuilds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.polarion.com/ProjectWebService-types", "Project"), com.polarion.alm.ws.client.types.projects.Project.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build"));
        oper.setReturnClass(com.polarion.alm.ws.client.types.builder.Build[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "queryBuildsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public BuilderWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BuilderWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BuilderWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">getAllBuilds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.internal.GetAllBuilds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">getAllBuildsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.Build[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getAllBuildsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">getBuilds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.internal.GetBuilds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">getBuildsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.Build[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getBuildsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">queryBuilds");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.internal.QueryBuilds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", ">queryBuildsResponse");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.Build[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "queryBuildsReturn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "ArrayOfBuildLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "Build");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.Build.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildLinkedWorkItem");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.BuildLinkedWorkItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-types", "BuildTestResults");
            cachedSerQNames.add(qName);
            cls = com.polarion.alm.ws.client.types.builder.BuildTestResults.class;
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

            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "ArrayOfLocation");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
            qName2 = new javax.xml.namespace.QName("http://ws.polarion.com/types", "Location");
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

    public com.polarion.alm.ws.client.types.builder.Build[] getAllBuilds() throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getAllBuilds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.builder.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.builder.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.builder.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.builder.Build[] getBuilds(com.polarion.alm.ws.client.types.projects.Project project) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "getBuilds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {project});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.builder.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.builder.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.builder.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.polarion.alm.ws.client.types.builder.Build[] queryBuilds(com.polarion.alm.ws.client.types.projects.Project project, java.lang.String query, java.lang.String sort) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.polarion.com/BuilderWebService-impl", "queryBuilds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {project, query, sort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.polarion.alm.ws.client.types.builder.Build[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.polarion.alm.ws.client.types.builder.Build[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.polarion.alm.ws.client.types.builder.Build[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
