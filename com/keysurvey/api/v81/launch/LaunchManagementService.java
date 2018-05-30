/**
 * LaunchManagementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public interface LaunchManagementService extends java.rmi.Remote {
    public com.keysurvey.api.v81.launch.WSEmailLink getVotingLink(java.lang.Long arg0, com.keysurvey.api.v81.launch.WSUrlType arg1) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSUniqueUrlSendingStatus getUniqueUrlSendingStatus(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void sendUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public java.lang.String getUniqueUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public java.lang.String getMasterUrl(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public java.lang.String[] getIncompleteEmails(long formId) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.launch.WSUrlType getDefaultUrlType(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void setDefaultUrlType(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void sendUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSFormEmailTemplate getFormEmailTemplate(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSFormEmailTemplate setFormEmailTemplate(com.keysurvey.api.v81.launch.WSFormEmailTemplate template) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public java.lang.String getAutofillData(long formId, java.lang.String uniqueUrl, long answerId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSFormTag getFormTag(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSFormTag setFormTag(com.keysurvey.api.v81.launch.WSFormTag formTag) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void deleteEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSEmailReminder getEmailReminder(long reminderId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSEmailReminder updateEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public long createEmailReminder(com.keysurvey.api.v81.launch.WSEmailReminder reminder) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSEmailReminder[] getEmailReminders(long formId) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public java.lang.String[] getUniqueUrls(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String email) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void passwordProtectionThroughContactManagerForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException;
    public boolean isFormPublishedToPortal(java.lang.Long formId, java.lang.Long cmId) throws java.rmi.RemoteException;
    public boolean lockAccessToContact(java.lang.Long formId, java.lang.Long contactId, java.lang.Boolean locked) throws java.rmi.RemoteException;
    public void sendUniqueURLsToCMList(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.launch.WSDataFlow getDataFlowSettings(java.lang.Long formId) throws java.rmi.RemoteException;
    public void setDataFlowSettings(com.keysurvey.api.v81.launch.WSDataFlow dataFlow) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, java.lang.String[] emailList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public void passwordProtectionThroughContactManager(java.lang.Long formId, java.lang.Long cmId, java.lang.Long filterId) throws java.rmi.RemoteException;
    public void sendUniqueURLsToCMListForNewFilter(java.lang.Long formId, java.lang.Long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.launch.WSPortalVisibility getFormVisibilityOnPortal(long formId) throws java.rmi.RemoteException;
    public void setFormVisibilityOnPortal(com.keysurvey.api.v81.launch.WSPortalVisibility portalVisibility) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.launch.WsEditResponseSettings getPortalResponseSettings(java.lang.Long settings) throws java.rmi.RemoteException;
    public void setPortalResponseSettings(com.keysurvey.api.v81.launch.WsEditResponseSettings settings) throws java.rmi.RemoteException;
    public void publishOnParticipantPortal(long formId, long cmId, java.lang.Long filterId) throws java.rmi.RemoteException;
    public void publishOnParticipantPortalWithNewFilter(long formId, long cmId, com.keysurvey.api.v81.launch.WSModelObjectFilter filter) throws java.rmi.RemoteException;
    public com.keysurvey.api.v81.WSResponse passwordProtectWithAutofill(long formId, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
    public com.keysurvey.api.v81.launch.WSEmailLink[] getUniqueUrlWithAutofillByEmail(long formId, com.keysurvey.api.v81.launch.WSUrlType urlType, com.keysurvey.api.v81.launch.WSAutofillData[] autofillDataList) throws java.rmi.RemoteException, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault, com.keysurvey.api.v81.WSFault;
}
