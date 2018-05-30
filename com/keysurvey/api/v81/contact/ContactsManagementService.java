/**
 * ContactsManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public interface ContactsManagementService extends java.rmi.Remote {
    public com.keysurvey.api.v81.contact.WSModelObjectFilter getFilter(java.lang.Long filterId) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.contact.WSModelObjectFilter createFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSModelObjectFilter[] getFilters(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContactManager getContactManagerById(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContactManager renameContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContactManager createContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException;
    public void requirePasswordChange(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public void resetContactPassword(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public void unlockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public void lockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContact editContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public void deleteContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContact[] addContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact[] contacts) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContact addContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContact[] getFilteredContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContact[] getContactByFilter(java.lang.Long contactManagerId, java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public void deleteFilter(java.lang.Long filterId) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.contact.WSContactManager setKeyField(java.lang.Long contactManagerId, java.lang.String uniqueKeyName) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSContactManager[] listContactManagers() throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchFilter(java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchedSurveyFilter(java.lang.Long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSModelFilterGroup createLaunchFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.contact.WSModelFilterGroup updateLaunchFilter(com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
}
