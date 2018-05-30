/**
 * ContactsManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class ContactsManagementLocator extends org.apache.axis.client.Service implements com.keysurvey.api.v81.contact.ContactsManagement {

    public ContactsManagementLocator() {
    }


    public ContactsManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContactsManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContactsManagementServicePort
    private java.lang.String ContactsManagementServicePort_address = "http://app.form.com:80/Member/api/v81/contact/ContactsManagementService";

    public java.lang.String getContactsManagementServicePortAddress() {
        return ContactsManagementServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContactsManagementServicePortWSDDServiceName = "ContactsManagementServicePort";

    public java.lang.String getContactsManagementServicePortWSDDServiceName() {
        return ContactsManagementServicePortWSDDServiceName;
    }

    public void setContactsManagementServicePortWSDDServiceName(java.lang.String name) {
        ContactsManagementServicePortWSDDServiceName = name;
    }

    public com.keysurvey.api.v81.contact.ContactsManagementService getContactsManagementServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContactsManagementServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContactsManagementServicePort(endpoint);
    }

    public com.keysurvey.api.v81.contact.ContactsManagementService getContactsManagementServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.keysurvey.api.v81.contact.ContactsManagementServicePortBindingStub _stub = new com.keysurvey.api.v81.contact.ContactsManagementServicePortBindingStub(portAddress, this);
            _stub.setPortName(getContactsManagementServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContactsManagementServicePortEndpointAddress(java.lang.String address) {
        ContactsManagementServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.keysurvey.api.v81.contact.ContactsManagementService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.keysurvey.api.v81.contact.ContactsManagementServicePortBindingStub _stub = new com.keysurvey.api.v81.contact.ContactsManagementServicePortBindingStub(new java.net.URL(ContactsManagementServicePort_address), this);
                _stub.setPortName(getContactsManagementServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ContactsManagementServicePort".equals(inputPortName)) {
            return getContactsManagementServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "ContactsManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "ContactsManagementServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContactsManagementServicePort".equals(portName)) {
            setContactsManagementServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
