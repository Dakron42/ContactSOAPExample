/**
 * WSEmailReminder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public abstract class WSEmailReminder  extends com.keysurvey.api.v81.WSObject  implements java.io.Serializable {
    private long accountId;

    private com.keysurvey.api.v81.launch.WSFileAttachment[] attachments;

    private boolean enabled;

    private long formId;

    private java.util.Calendar lastSentDate;

    private java.lang.String mailBody;

    private boolean mailConfirmReceipt;

    private java.lang.String mailFrom;

    private boolean mailIsHighPriority;

    private java.lang.String mailReplyTo;

    private java.lang.String mailSubject;

    private java.lang.String mailUndeliveredTo;

    private long reminderId;

    private long reminderNumber;

    public WSEmailReminder() {
    }

    public WSEmailReminder(
           long versionId,
           long accountId,
           com.keysurvey.api.v81.launch.WSFileAttachment[] attachments,
           boolean enabled,
           long formId,
           java.util.Calendar lastSentDate,
           java.lang.String mailBody,
           boolean mailConfirmReceipt,
           java.lang.String mailFrom,
           boolean mailIsHighPriority,
           java.lang.String mailReplyTo,
           java.lang.String mailSubject,
           java.lang.String mailUndeliveredTo,
           long reminderId,
           long reminderNumber) {
        super(
            versionId);
        this.accountId = accountId;
        this.attachments = attachments;
        this.enabled = enabled;
        this.formId = formId;
        this.lastSentDate = lastSentDate;
        this.mailBody = mailBody;
        this.mailConfirmReceipt = mailConfirmReceipt;
        this.mailFrom = mailFrom;
        this.mailIsHighPriority = mailIsHighPriority;
        this.mailReplyTo = mailReplyTo;
        this.mailSubject = mailSubject;
        this.mailUndeliveredTo = mailUndeliveredTo;
        this.reminderId = reminderId;
        this.reminderNumber = reminderNumber;
    }


    /**
     * Gets the accountId value for this WSEmailReminder.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this WSEmailReminder.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the attachments value for this WSEmailReminder.
     * 
     * @return attachments
     */
    public com.keysurvey.api.v81.launch.WSFileAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this WSEmailReminder.
     * 
     * @param attachments
     */
    public void setAttachments(com.keysurvey.api.v81.launch.WSFileAttachment[] attachments) {
        this.attachments = attachments;
    }

    public com.keysurvey.api.v81.launch.WSFileAttachment getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.keysurvey.api.v81.launch.WSFileAttachment _value) {
        this.attachments[i] = _value;
    }


    /**
     * Gets the enabled value for this WSEmailReminder.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this WSEmailReminder.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the formId value for this WSEmailReminder.
     * 
     * @return formId
     */
    public long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WSEmailReminder.
     * 
     * @param formId
     */
    public void setFormId(long formId) {
        this.formId = formId;
    }


    /**
     * Gets the lastSentDate value for this WSEmailReminder.
     * 
     * @return lastSentDate
     */
    public java.util.Calendar getLastSentDate() {
        return lastSentDate;
    }


    /**
     * Sets the lastSentDate value for this WSEmailReminder.
     * 
     * @param lastSentDate
     */
    public void setLastSentDate(java.util.Calendar lastSentDate) {
        this.lastSentDate = lastSentDate;
    }


    /**
     * Gets the mailBody value for this WSEmailReminder.
     * 
     * @return mailBody
     */
    public java.lang.String getMailBody() {
        return mailBody;
    }


    /**
     * Sets the mailBody value for this WSEmailReminder.
     * 
     * @param mailBody
     */
    public void setMailBody(java.lang.String mailBody) {
        this.mailBody = mailBody;
    }


    /**
     * Gets the mailConfirmReceipt value for this WSEmailReminder.
     * 
     * @return mailConfirmReceipt
     */
    public boolean isMailConfirmReceipt() {
        return mailConfirmReceipt;
    }


    /**
     * Sets the mailConfirmReceipt value for this WSEmailReminder.
     * 
     * @param mailConfirmReceipt
     */
    public void setMailConfirmReceipt(boolean mailConfirmReceipt) {
        this.mailConfirmReceipt = mailConfirmReceipt;
    }


    /**
     * Gets the mailFrom value for this WSEmailReminder.
     * 
     * @return mailFrom
     */
    public java.lang.String getMailFrom() {
        return mailFrom;
    }


    /**
     * Sets the mailFrom value for this WSEmailReminder.
     * 
     * @param mailFrom
     */
    public void setMailFrom(java.lang.String mailFrom) {
        this.mailFrom = mailFrom;
    }


    /**
     * Gets the mailIsHighPriority value for this WSEmailReminder.
     * 
     * @return mailIsHighPriority
     */
    public boolean isMailIsHighPriority() {
        return mailIsHighPriority;
    }


    /**
     * Sets the mailIsHighPriority value for this WSEmailReminder.
     * 
     * @param mailIsHighPriority
     */
    public void setMailIsHighPriority(boolean mailIsHighPriority) {
        this.mailIsHighPriority = mailIsHighPriority;
    }


    /**
     * Gets the mailReplyTo value for this WSEmailReminder.
     * 
     * @return mailReplyTo
     */
    public java.lang.String getMailReplyTo() {
        return mailReplyTo;
    }


    /**
     * Sets the mailReplyTo value for this WSEmailReminder.
     * 
     * @param mailReplyTo
     */
    public void setMailReplyTo(java.lang.String mailReplyTo) {
        this.mailReplyTo = mailReplyTo;
    }


    /**
     * Gets the mailSubject value for this WSEmailReminder.
     * 
     * @return mailSubject
     */
    public java.lang.String getMailSubject() {
        return mailSubject;
    }


    /**
     * Sets the mailSubject value for this WSEmailReminder.
     * 
     * @param mailSubject
     */
    public void setMailSubject(java.lang.String mailSubject) {
        this.mailSubject = mailSubject;
    }


    /**
     * Gets the mailUndeliveredTo value for this WSEmailReminder.
     * 
     * @return mailUndeliveredTo
     */
    public java.lang.String getMailUndeliveredTo() {
        return mailUndeliveredTo;
    }


    /**
     * Sets the mailUndeliveredTo value for this WSEmailReminder.
     * 
     * @param mailUndeliveredTo
     */
    public void setMailUndeliveredTo(java.lang.String mailUndeliveredTo) {
        this.mailUndeliveredTo = mailUndeliveredTo;
    }


    /**
     * Gets the reminderId value for this WSEmailReminder.
     * 
     * @return reminderId
     */
    public long getReminderId() {
        return reminderId;
    }


    /**
     * Sets the reminderId value for this WSEmailReminder.
     * 
     * @param reminderId
     */
    public void setReminderId(long reminderId) {
        this.reminderId = reminderId;
    }


    /**
     * Gets the reminderNumber value for this WSEmailReminder.
     * 
     * @return reminderNumber
     */
    public long getReminderNumber() {
        return reminderNumber;
    }


    /**
     * Sets the reminderNumber value for this WSEmailReminder.
     * 
     * @param reminderNumber
     */
    public void setReminderNumber(long reminderNumber) {
        this.reminderNumber = reminderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSEmailReminder)) return false;
        WSEmailReminder other = (WSEmailReminder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.accountId == other.getAccountId() &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            this.enabled == other.isEnabled() &&
            this.formId == other.getFormId() &&
            ((this.lastSentDate==null && other.getLastSentDate()==null) || 
             (this.lastSentDate!=null &&
              this.lastSentDate.equals(other.getLastSentDate()))) &&
            ((this.mailBody==null && other.getMailBody()==null) || 
             (this.mailBody!=null &&
              this.mailBody.equals(other.getMailBody()))) &&
            this.mailConfirmReceipt == other.isMailConfirmReceipt() &&
            ((this.mailFrom==null && other.getMailFrom()==null) || 
             (this.mailFrom!=null &&
              this.mailFrom.equals(other.getMailFrom()))) &&
            this.mailIsHighPriority == other.isMailIsHighPriority() &&
            ((this.mailReplyTo==null && other.getMailReplyTo()==null) || 
             (this.mailReplyTo!=null &&
              this.mailReplyTo.equals(other.getMailReplyTo()))) &&
            ((this.mailSubject==null && other.getMailSubject()==null) || 
             (this.mailSubject!=null &&
              this.mailSubject.equals(other.getMailSubject()))) &&
            ((this.mailUndeliveredTo==null && other.getMailUndeliveredTo()==null) || 
             (this.mailUndeliveredTo!=null &&
              this.mailUndeliveredTo.equals(other.getMailUndeliveredTo()))) &&
            this.reminderId == other.getReminderId() &&
            this.reminderNumber == other.getReminderNumber();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Long(getAccountId()).hashCode();
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getFormId()).hashCode();
        if (getLastSentDate() != null) {
            _hashCode += getLastSentDate().hashCode();
        }
        if (getMailBody() != null) {
            _hashCode += getMailBody().hashCode();
        }
        _hashCode += (isMailConfirmReceipt() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMailFrom() != null) {
            _hashCode += getMailFrom().hashCode();
        }
        _hashCode += (isMailIsHighPriority() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMailReplyTo() != null) {
            _hashCode += getMailReplyTo().hashCode();
        }
        if (getMailSubject() != null) {
            _hashCode += getMailSubject().hashCode();
        }
        if (getMailUndeliveredTo() != null) {
            _hashCode += getMailUndeliveredTo().hashCode();
        }
        _hashCode += new Long(getReminderId()).hashCode();
        _hashCode += new Long(getReminderNumber()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSEmailReminder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSEmailReminder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailConfirmReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailConfirmReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailIsHighPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailIsHighPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailReplyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailReplyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailUndeliveredTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailUndeliveredTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
