package com.keysurvey.api.v81.launch;

public class LaunchManagementServiceProxy implements com.keysurvey.api.v81.launch.LaunchManagementService {
  private String _endpoint = null;
  private com.keysurvey.api.v81.launch.LaunchManagementService launchManagementService = null;
  
  public LaunchManagementServiceProxy() {
    _initLaunchManagementServiceProxy();
  }
  
  public LaunchManagementServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initLaunchManagementServiceProxy();
  }
  
  private void _initLaunchManagementServiceProxy() {
    try {
      launchManagementService = (new com.keysurvey.api.v81.launch.LaunchManagementLocator()).getLaunchManagementServicePort();
      if (launchManagementService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)launchManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)launchManagementService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (launchManagementService != null)
      ((javax.xml.rpc.Stub)launchManagementService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.keysurvey.api.v81.launch.LaunchManagementService getLaunchManagementService() {
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService;
  }
  
  public com.keysurvey.api.v81.launch.WSEmailLink getVotingLink(java.lang.Long arg0, com.keysurvey.api.v81.launch.WSUrlType arg1) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getVotingLink(arg0, arg1);
  }
  
  public com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus getUniqueUrlSendingStatus(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getUniqueUrlSendingStatus(formId);
  }
  
  public void sendUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.sendUniqueUrlWithAutofillByEmail(formId, urlType, autofillDataList);
  }
  
  public java.lang.String getUniqueUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getUniqueUrl(formId, urlType, email);
  }
  
  public java.lang.String getMasterUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getMasterUrl(formId, urlType);
  }
  
  public java.lang.String[] getIncompleteEmails(long formId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getIncompleteEmails(formId);
  }
  
  public com.keysurvey.api.v81.launch.WSUrlType getDefaultUrlType(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getDefaultUrlType(formId);
  }
  
  public void setDefaultUrlType(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.setDefaultUrlType(formId, urlType);
  }
  
  public void sendUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.sendUniqueUrlByEmail(formId, urlType, emailList);
  }
  
  public com.keysurvey.api.v81.launch.WSFormEmailTemplate getFormEmailTemplate(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getFormEmailTemplate(formId);
  }
  
  public com.keysurvey.api.v81.launch.WSFormEmailTemplate setFormEmailTemplate(com.keysurvey.api.v81.launch.WSFormEmailTemplate template) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.setFormEmailTemplate(template);
  }
  
  public java.lang.String getAutofillData(long formId, java.lang.String uniqueUrl, long answerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getAutofillData(formId, uniqueUrl, answerId);
  }
  
  public com.keysurvey.api.v81.launch.WSFormTag getFormTag(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getFormTag(formId);
  }
  
  public com.keysurvey.api.v81.launch.WSFormTag setFormTag(com.keysurvey.api.v81.launch.WSFormTag formTag) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.setFormTag(formTag);
  }
  
  public void deleteEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.deleteEmailReminder(reminderId);
  }
  
  public com.keysurvey.api.v81.launch.WSEmailReminder getEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getEmailReminder(reminderId);
  }
  
  public com.keysurvey.api.v81.launch.WSEmailReminder updateEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.updateEmailReminder(reminder);
  }
  
  public long createEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.createEmailReminder(reminder);
  }
  
  public com.keysurvey.api.v81.launch.WSEmailReminder[] getEmailReminders(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getEmailReminders(formId);
  }
  
  public java.lang.String[] getUniqueUrls(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getUniqueUrls(formId, urlType, email);
  }
  
  public void passwordProtectionThroughContactManagerForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.passwordProtectionThroughContactManagerForNewFilter(formId, cmId, filter);
  }
  
  public boolean isFormPublishedToPortal(java.lang.Long formId, java.lang.Long cmId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.isFormPublishedToPortal(formId, cmId);
  }
  
  public boolean lockAccessToContact(java.lang.Long formId, java.lang.Long contactId, java.lang.Boolean locked) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.lockAccessToContact(formId, contactId, locked);
  }
  
  public void sendUniqueURLsToCMList(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.sendUniqueURLsToCMList(formId, cmId, filterId);
  }
  
  public com.keysurvey.api.v81.launch.WSDataFlow getDataFlowSettings(java.lang.Long formId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getDataFlowSettings(formId);
  }
  
  public void setDataFlowSettings(com.keysurvey.api.v81.launch.WSDataFlow dataFlow) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.setDataFlowSettings(dataFlow);
  }
  
  public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getUniqueUrlByEmail(formId, urlType, emailList);
  }
  
  public void passwordProtectionThroughContactManager(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.passwordProtectionThroughContactManager(formId, cmId, filterId);
  }
  
  public void sendUniqueURLsToCMListForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.sendUniqueURLsToCMListForNewFilter(formId, cmId, filter);
  }
  
  public com.keysurvey.api.v81.launch.WSPortalVisibility getFormVisibilityOnPortal(long formId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getFormVisibilityOnPortal(formId);
  }
  
  public void setFormVisibilityOnPortal(com.keysurvey.api.v81.launch.WSPortalVisibility portalVisibility) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.setFormVisibilityOnPortal(portalVisibility);
  }
  
  public com.keysurvey.api.v81.launch.WsEditResponseSettings getPortalResponseSettings(java.lang.Long settings) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getPortalResponseSettings(settings);
  }
  
  public void setPortalResponseSettings(com.keysurvey.api.v81.launch.WsEditResponseSettings settings) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.setPortalResponseSettings(settings);
  }
  
  public void publishOnParticipantPortal(long formId, long cmId, java.lang.Long filterId) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.publishOnParticipantPortal(formId, cmId, filterId);
  }
  
  public void publishOnParticipantPortalWithNewFilter(long formId, long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    launchManagementService.publishOnParticipantPortalWithNewFilter(formId, cmId, filter);
  }
  
  public com.keysurvey.api.v81.WSResponse passwordProtectWithAutofill(long formId, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.passwordProtectWithAutofill(formId, autofillDataList);
  }
  
  public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault{
    if (launchManagementService == null)
      _initLaunchManagementServiceProxy();
    return launchManagementService.getUniqueUrlWithAutofillByEmail(formId, urlType, autofillDataList);
  }
  
  
}