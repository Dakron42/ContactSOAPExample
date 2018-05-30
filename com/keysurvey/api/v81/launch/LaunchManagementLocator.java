/**
 * LaunchManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class LaunchManagementLocator extends org.apache.axis.client.Service implements com.keysurvey.api.v81.launch.LaunchManagement {

    public LaunchManagementLocator() {
    }


    public LaunchManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LaunchManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LaunchManagementServicePort
    private java.lang.String LaunchManagementServicePort_address = "http://app.form.com:80/Member/api/v81/launch/LaunchManagementService";

    public java.lang.String getLaunchManagementServicePortAddress() {
        return LaunchManagementServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LaunchManagementServicePortWSDDServiceName = "LaunchManagementServicePort";

    public java.lang.String getLaunchManagementServicePortWSDDServiceName() {
        return LaunchManagementServicePortWSDDServiceName;
    }

    public void setLaunchManagementServicePortWSDDServiceName(java.lang.String name) {
        LaunchManagementServicePortWSDDServiceName = name;
    }

    public com.keysurvey.api.v81.launch.LaunchManagementService getLaunchManagementServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LaunchManagementServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLaunchManagementServicePort(endpoint);
    }

    public com.keysurvey.api.v81.launch.LaunchManagementService getLaunchManagementServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.keysurvey.api.v81.launch.LaunchManagementServicePortBindingStub _stub = new com.keysurvey.api.v81.launch.LaunchManagementServicePortBindingStub(portAddress, this);
            _stub.setPortName(getLaunchManagementServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLaunchManagementServicePortEndpointAddress(java.lang.String address) {
        LaunchManagementServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.keysurvey.api.v81.launch.LaunchManagementService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.keysurvey.api.v81.launch.LaunchManagementServicePortBindingStub _stub = new com.keysurvey.api.v81.launch.LaunchManagementServicePortBindingStub(new java.net.URL(LaunchManagementServicePort_address), this);
                _stub.setPortName(getLaunchManagementServicePortWSDDServiceName());
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
        if ("LaunchManagementServicePort".equals(inputPortName)) {
            return getLaunchManagementServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "LaunchManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "LaunchManagementServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LaunchManagementServicePort".equals(portName)) {
            setLaunchManagementServicePortEndpointAddress(address);
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
