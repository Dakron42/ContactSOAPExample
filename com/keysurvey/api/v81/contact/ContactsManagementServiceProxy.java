package com.keysurvey.api.v81.contact;

public class ContactsManagementServiceProxy implements com.keysurvey.api.v81.contact.ContactsManagementService {
  private String _endpoint = null;
  private com.keysurvey.api.v81.contact.ContactsManagementService contactsManagementService = null;
  
  public ContactsManagementServiceProxy() {
    _initContactsManagementServiceProxy();
  }
  
  public ContactsManagementServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContactsManagementServiceProxy();
  }
  
  private void _initContactsManagementServiceProxy() {
    try {
      contactsManagementService = (new com.keysurvey.api.v81.contact.ContactsManagementLocator()).getContactsManagementServicePort();
      if (contactsManagementService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contactsManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contactsManagementService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contactsManagementService != null)
      ((javax.xml.rpc.Stub)contactsManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.keysurvey.api.v81.contact.ContactsManagementService getContactsManagementService() {
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService;
  }
  
  public com.keysurvey.api.v81.contact.WSModelObjectFilter getFilter(java.lang.Long filterId) throws java.rmi.RemoteException{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getFilter(filterId);
  }
  
  public com.keysurvey.api.v81.contact.WSModelObjectFilter createFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.createFilter(cmId, filter);
  }
  
  public com.keysurvey.api.v81.contact.WSModelObjectFilter[] getFilters(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getFilters(contactManagerId);
  }
  
  public com.keysurvey.api.v81.contact.WSContactManager getContactManagerById(java.lang.Long contactManagerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getContactManagerById(contactManagerId);
  }
  
  public com.keysurvey.api.v81.contact.WSContactManager renameContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.renameContactManager(contactManager);
  }
  
  public com.keysurvey.api.v81.contact.WSContactManager createContactManager(com.keysurvey.api.v81.contact.WSContactManager contactManager) throws java.rmi.RemoteException{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.createContactManager(contactManager);
  }
  
  public void requirePasswordChange(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.requirePasswordChange(contactManagerId, contactId);
  }
  
  public void resetContactPassword(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.resetContactPassword(contactManagerId, contactId);
  }
  
  public void unlockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.unlockContact(contactManagerId, contactId);
  }
  
  public void lockContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.lockContact(contactManagerId, contactId);
  }
  
  public com.keysurvey.api.v81.contact.WSContact editContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.editContact(contactManagerId, contact);
  }
  
  public void deleteContact(java.lang.Long contactManagerId, java.lang.Long contactId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.deleteContact(contactManagerId, contactId);
  }
  
  public com.keysurvey.api.v81.contact.WSContact[] addContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact[] contacts) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.addContacts(contactManagerId, contacts);
  }
  
  public com.keysurvey.api.v81.contact.WSContact addContact(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSContact contact) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.addContact(contactManagerId, contact);
  }
  
  public com.keysurvey.api.v81.contact.WSContact[] getFilteredContacts(java.lang.Long contactManagerId, com.keysurvey.api.v81.contact.WSModelObjectFilter filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getFilteredContacts(contactManagerId, filter);
  }
  
  public com.keysurvey.api.v81.contact.WSContact[] getContactByFilter(java.lang.Long contactManagerId, java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getContactByFilter(contactManagerId, filterId);
  }
  
  public void deleteFilter(java.lang.Long filterId) throws java.rmi.RemoteException{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    contactsManagementService.deleteFilter(filterId);
  }
  
  public com.keysurvey.api.v81.contact.WSContactManager setKeyField(java.lang.Long contactManagerId, java.lang.String uniqueKeyName) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.setKeyField(contactManagerId, uniqueKeyName);
  }
  
  public com.keysurvey.api.v81.contact.WSContactManager[] listContactManagers() throws java.rmi.RemoteException{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.listContactManagers();
  }
  
  public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchFilter(java.lang.Long filterId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getLaunchFilter(filterId);
  }
  
  public com.keysurvey.api.v81.contact.WSModelFilterGroup getLaunchedSurveyFilter(java.lang.Long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.getLaunchedSurveyFilter(formId);
  }
  
  public com.keysurvey.api.v81.contact.WSModelFilterGroup createLaunchFilter(java.lang.Long cmId, com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.createLaunchFilter(cmId, filter);
  }
  
  public com.keysurvey.api.v81.contact.WSModelFilterGroup updateLaunchFilter(com.keysurvey.api.v81.contact.WSModelFilterGroup filter) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (contactsManagementService == null)
      _initContactsManagementServiceProxy();
    return contactsManagementService.updateLaunchFilter(filter);
  }
  
  
}