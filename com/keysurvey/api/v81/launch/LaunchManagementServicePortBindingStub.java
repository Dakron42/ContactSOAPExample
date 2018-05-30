/**
 * LaunchManagementServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class LaunchManagementServicePortBindingStub extends org.apache.axis.client.Stub implements com.keysurvey.api.v81.launch.LaunchManagementService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[37];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVotingLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailLink"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailLink.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniqueUrlSendingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUniqueUrlSendingStatus"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendUniqueUrlWithAutofillByEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autofillDataList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAutofillData"), com.keysurvey.api.v81.launch.WSAutofillData[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniqueUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMasterUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getIncompleteEmails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultUrlType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSUrlType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDefaultUrlType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendUniqueUrlByEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormEmailTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormEmailTemplate"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSFormEmailTemplate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFormEmailTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "template"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormEmailTemplate"), com.keysurvey.api.v81.launch.WSFormEmailTemplate.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormEmailTemplate"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSFormEmailTemplate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutofillData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uniqueUrl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "answerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormTag"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSFormTag.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFormTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormTag"), com.keysurvey.api.v81.launch.WSFormTag.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormTag"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSFormTag.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteEmailReminder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reminderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEmailReminder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reminderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailReminder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateEmailReminder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reminder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"), com.keysurvey.api.v81.launch.WSEmailReminder.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailReminder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEmailReminder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reminder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"), com.keysurvey.api.v81.launch.WSEmailReminder.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEmailReminders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailReminder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniqueUrls");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("passwordProtectionThroughContactManagerForNewFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSModelObjectFilter"), com.keysurvey.api.v81.launch.WSModelObjectFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isFormPublishedToPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lockAccessToContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "locked"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendUniqueURLsToCMList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDataFlowSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlow"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSDataFlow.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setDataFlowSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataFlow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlow"), com.keysurvey.api.v81.launch.WSDataFlow.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniqueUrlByEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emailList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailLink"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailLink[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("passwordProtectionThroughContactManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendUniqueURLsToCMListForNewFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSModelObjectFilter"), com.keysurvey.api.v81.launch.WSModelObjectFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFormVisibilityOnPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSPortalVisibility"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSPortalVisibility.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setFormVisibilityOnPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "portalVisibility"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSPortalVisibility"), com.keysurvey.api.v81.launch.WSPortalVisibility.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortalResponseSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "settings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsEditResponseSettings"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WsEditResponseSettings.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortalResponseSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "settings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsEditResponseSettings"), com.keysurvey.api.v81.launch.WsEditResponseSettings.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("publishOnParticipantPortal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("publishOnParticipantPortalWithNewFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSModelObjectFilter"), com.keysurvey.api.v81.launch.WSModelObjectFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("passwordProtectWithAutofill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autofillDataList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAutofillData"), com.keysurvey.api.v81.launch.WSAutofillData[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSResponse"));
        oper.setReturnClass(com.keysurvey.api.v81.WSResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUniqueUrlWithAutofillByEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "urlType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType"), com.keysurvey.api.v81.launch.WSUrlType.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autofillDataList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAutofillData"), com.keysurvey.api.v81.launch.WSAutofillData[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailLink"));
        oper.setReturnClass(com.keysurvey.api.v81.launch.WSEmailLink[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSInternalServerException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObjectNotFoundException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSSecurityException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSIllegalArgumentException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[36] = oper;

    }

    public LaunchManagementServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LaunchManagementServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LaunchManagementServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAbsoluteEmailReminder");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSAbsoluteEmailReminder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAutofillData");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSAutofillData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAutofillDataItem");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSAutofillDataItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlow");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSDataFlow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowDirection");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSDataFlowDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowSetting");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSDataFlowSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsEditResponseSettings");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WsEditResponseSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailLink");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSEmailLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSEmailReminder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsFilterCondition");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WsFilterCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormEmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSFormEmailTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormTag");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSFormTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSModelObjectFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSModelObjectFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSModelObjectFilterCondition");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSModelObjectFilterCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSPortalVisibility");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSPortalVisibility.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSQuestionTag");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSQuestionTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSRelativeEmailReminder");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSRelativeEmailReminder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUniqueUrlSendingStatus");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSUrlType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.launch.WSUrlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.WSFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSObject");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.WSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSResponse");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.WSResponse.class;
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

    public com.keysurvey.api.v81.launch.WSEmailLink getVotingLink(java.lang.Long arg0, com.keysurvey.api.v81.launch.WSUrlType arg1) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getVotingLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailLink) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailLink) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailLink.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus getUniqueUrlSendingStatus(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getUniqueUrlSendingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void sendUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "sendUniqueUrlWithAutofillByEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, autofillDataList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getUniqueUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getUniqueUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, email});

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
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getMasterUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getMasterUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType});

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
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getIncompleteEmails(long formId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getIncompleteEmails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

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

    public com.keysurvey.api.v81.launch.WSUrlType getDefaultUrlType(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getDefaultUrlType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSUrlType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSUrlType) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSUrlType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setDefaultUrlType(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setDefaultUrlType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void sendUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "sendUniqueUrlByEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, emailList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSFormEmailTemplate getFormEmailTemplate(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getFormEmailTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSFormEmailTemplate) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSFormEmailTemplate) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSFormEmailTemplate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSFormEmailTemplate setFormEmailTemplate(com.keysurvey.api.v81.launch.WSFormEmailTemplate template) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setFormEmailTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {template});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSFormEmailTemplate) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSFormEmailTemplate) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSFormEmailTemplate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getAutofillData(long formId, java.lang.String uniqueUrl, long answerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getAutofillData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), uniqueUrl, new java.lang.Long(answerId)});

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
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSFormTag getFormTag(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getFormTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSFormTag) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSFormTag) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSFormTag.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSFormTag setFormTag(com.keysurvey.api.v81.launch.WSFormTag formTag) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setFormTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formTag});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSFormTag) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSFormTag) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSFormTag.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "deleteEmailReminder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(reminderId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSEmailReminder getEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getEmailReminder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(reminderId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailReminder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailReminder) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailReminder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSEmailReminder updateEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "updateEmailReminder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reminder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailReminder) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailReminder) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailReminder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "createEmailReminder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reminder});

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
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSEmailReminder[] getEmailReminders(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getEmailReminders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailReminder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailReminder[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailReminder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getUniqueUrls(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getUniqueUrls"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, email});

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
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void passwordProtectionThroughContactManagerForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "passwordProtectionThroughContactManagerForNewFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, cmId, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isFormPublishedToPortal(java.lang.Long formId, java.lang.Long cmId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "isFormPublishedToPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, cmId});

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

    public boolean lockAccessToContact(java.lang.Long formId, java.lang.Long contactId, java.lang.Boolean locked) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "lockAccessToContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, contactId, locked});

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

    public void sendUniqueURLsToCMList(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "sendUniqueURLsToCMList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, cmId, filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSDataFlow getDataFlowSettings(java.lang.Long formId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getDataFlowSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSDataFlow) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSDataFlow) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSDataFlow.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setDataFlowSettings(com.keysurvey.api.v81.launch.WSDataFlow dataFlow) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setDataFlowSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataFlow});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getUniqueUrlByEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, emailList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailLink[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailLink[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailLink[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void passwordProtectionThroughContactManager(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "passwordProtectionThroughContactManager"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, cmId, filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void sendUniqueURLsToCMListForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "sendUniqueURLsToCMListForNewFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId, cmId, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSPortalVisibility getFormVisibilityOnPortal(long formId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getFormVisibilityOnPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSPortalVisibility) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSPortalVisibility) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSPortalVisibility.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setFormVisibilityOnPortal(com.keysurvey.api.v81.launch.WSPortalVisibility portalVisibility) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setFormVisibilityOnPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {portalVisibility});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WsEditResponseSettings getPortalResponseSettings(java.lang.Long settings) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getPortalResponseSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {settings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WsEditResponseSettings) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WsEditResponseSettings) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WsEditResponseSettings.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void setPortalResponseSettings(com.keysurvey.api.v81.launch.WsEditResponseSettings settings) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "setPortalResponseSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {settings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void publishOnParticipantPortal(long formId, long cmId, java.lang.Long filterId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "publishOnParticipantPortal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), new java.lang.Long(cmId), filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void publishOnParticipantPortalWithNewFilter(long formId, long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "publishOnParticipantPortalWithNewFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), new java.lang.Long(cmId), filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.WSResponse passwordProtectWithAutofill(long formId, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "passwordProtectWithAutofill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), autofillDataList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.WSResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.WSResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.WSResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "getUniqueUrlWithAutofillByEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(formId), urlType, autofillDataList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.launch.WSEmailLink[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.launch.WSEmailLink[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.launch.WSEmailLink[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.keysurvey.api.v81.WSFault) {
              throw (com.keysurvey.api.v81.WSFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
