/**
 * ContactsManagementServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class ContactsManagementServicePortBindingStub extends org.apache.axis.client.Stub implements com.keysurvey.api.v81.contact.ContactsManagementService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[23];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelObjectFilter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter"), com.keysurvey.api.v81.contact.WSModelObjectFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelObjectFilter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
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
        oper.setName("getFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelObjectFilter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContactManagerById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContactManager.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renameContactManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"), com.keysurvey.api.v81.contact.WSContactManager.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContactManager.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createContactManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"), com.keysurvey.api.v81.contact.WSContactManager.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContactManager.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requirePasswordChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetContactPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unlockContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("lockContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
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
        oper.setName("editContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contact"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"), com.keysurvey.api.v81.contact.WSContact.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContact.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addContacts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contacts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"), com.keysurvey.api.v81.contact.WSContact[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContact[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contact"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"), com.keysurvey.api.v81.contact.WSContact.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContact.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFilteredContacts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter"), com.keysurvey.api.v81.contact.WSModelObjectFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContact[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContactByFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContact[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setKeyField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contactManagerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uniqueKeyName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContactManager.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
                      "com.keysurvey.api.v81.WSFault",
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listContactManagers");
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSContactManager[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLaunchFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filterId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
        oper.setName("getLaunchedSurveyFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "formId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createLaunchFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cmId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"), com.keysurvey.api.v81.contact.WSModelFilterGroup.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSCMDoesNotExistException"),
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
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateLaunchFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"), com.keysurvey.api.v81.contact.WSModelFilterGroup.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"));
        oper.setReturnClass(com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
        _operations[22] = oper;

    }

    public ContactsManagementServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ContactsManagementServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ContactsManagementServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", ">>WSModelObject>properties>entry");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", ">WSModelObject>properties");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", ">>WSModelObject>properties>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "activityModelFilterType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.ActivityModelFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "dateFilterExpressionConditionType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.DateFilterExpressionConditionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "numberFilterExpressionConditionType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.NumberFilterExpressionConditionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "textFilterExpressionConditionType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.TextFilterExpressionConditionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSActivityModelFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSActivityModelFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContact");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSContactManager.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactStatistics");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSContactStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactStatus");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSContactStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactStatusFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSContactStatusFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSDateFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSDateFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSDecimalFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSDecimalFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSFieldModelFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSFieldModelFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "wsFilterCondition");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WsFilterCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSInModelFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSInModelFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSIntegerFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSIntegerFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSLastSurveyStatus");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSLastSurveyStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSLastSurveyStatusFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSLastSurveyStatusFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModel");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelColumn");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelColumnType");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelColumnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelFilterGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObject");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelObjectFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObjectFilterCondition");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSModelObjectFilterCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSNaturalNumberFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSNaturalNumberFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSOrgChartModelFilter");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSOrgChartModelFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSPortalSetting");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSPortalSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSTextFilterExpression");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.contact.WSTextFilterExpression.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://v81.api.keysurvey.com", "WSFault");
            cachedSerQNames.add(qName);
            cls = com.keysurvey.api.v81.WSFault.class;
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

    public com.keysurvey.api.v81.contact.WSModelObjectFilter getFilter(java.lang.Long filterId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelObjectFilter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelObjectFilter createFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "createFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cmId, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelObjectFilter.class);
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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelObjectFilter[] getFilters(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelObjectFilter[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelObjectFilter[].class);
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

    public com.keysurvey.api.v81.contact.WSContactManager getContactManagerById(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getContactManagerById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContactManager) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContactManager) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContactManager.class);
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

    public com.keysurvey.api.v81.contact.WSContactManager renameContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "renameContactManager"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContactManager) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContactManager) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContactManager.class);
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

    public com.keysurvey.api.v81.contact.WSContactManager createContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "createContactManager"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContactManager) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContactManager) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContactManager.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void requirePasswordChange(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "requirePasswordChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contactId});

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
   }
  throw axisFaultException;
}
    }

    public void resetContactPassword(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "resetContactPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contactId});

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
   }
  throw axisFaultException;
}
    }

    public void unlockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "unlockContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contactId});

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
   }
  throw axisFaultException;
}
    }

    public void lockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "lockContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contactId});

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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSContact editContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "editContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contact});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContact) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContact) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContact.class);
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

    public void deleteContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "deleteContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contactId});

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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSContact[] addContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact[] contacts) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "addContacts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contacts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContact[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContact[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContact[].class);
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

    public com.keysurvey.api.v81.contact.WSContact addContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "addContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, contact});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContact) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContact) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContact.class);
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

    public com.keysurvey.api.v81.contact.WSContact[] getFilteredContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getFilteredContacts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContact[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContact[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContact[].class);
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

    public com.keysurvey.api.v81.contact.WSContact[] getContactByFilter(java.lang.Long contactManagerId, java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getContactByFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContact[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContact[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContact[].class);
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

    public void deleteFilter(java.lang.Long filterId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "deleteFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSContactManager setKeyField(java.lang.Long contactManagerId, java.lang.String uniqueKeyName) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "setKeyField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactManagerId, uniqueKeyName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContactManager) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContactManager) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContactManager.class);
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

    public com.keysurvey.api.v81.contact.WSContactManager[] listContactManagers() throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "listContactManagers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSContactManager[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSContactManager[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSContactManager[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchFilter(java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getLaunchFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filterId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchedSurveyFilter(java.lang.Long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "getLaunchedSurveyFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {formId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelFilterGroup createLaunchFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "createLaunchFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cmId, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
   }
  throw axisFaultException;
}
    }

    public com.keysurvey.api.v81.contact.WSModelFilterGroup updateLaunchFilter(com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "updateLaunchFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.keysurvey.api.v81.contact.WSModelFilterGroup) org.apache.axis.utils.JavaUtils.convert(_resp, com.keysurvey.api.v81.contact.WSModelFilterGroup.class);
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
   }
  throw axisFaultException;
}
    }

}
