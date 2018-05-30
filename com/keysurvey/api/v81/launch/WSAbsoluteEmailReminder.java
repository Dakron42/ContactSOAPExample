/**
 * WSAbsoluteEmailReminder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSAbsoluteEmailReminder  extends com.keysurvey.api.v81.launch.WSEmailReminder  implements java.io.Serializable {
    private java.util.Calendar appointedDate;

    public WSAbsoluteEmailReminder() {
    }

    public WSAbsoluteEmailReminder(
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
           long reminderNumber,
           java.util.Calendar appointedDate) {
        super(
            versionId,
            accountId,
            attachments,
            enabled,
            formId,
            lastSentDate,
            mailBody,
            mailConfirmReceipt,
            mailFrom,
            mailIsHighPriority,
            mailReplyTo,
            mailSubject,
            mailUndeliveredTo,
            reminderId,
            reminderNumber);
        this.appointedDate = appointedDate;
    }


    /**
     * Gets the appointedDate value for this WSAbsoluteEmailReminder.
     * 
     * @return appointedDate
     */
    public java.util.Calendar getAppointedDate() {
        return appointedDate;
    }


    /**
     * Sets the appointedDate value for this WSAbsoluteEmailReminder.
     * 
     * @param appointedDate
     */
    public void setAppointedDate(java.util.Calendar appointedDate) {
        this.appointedDate = appointedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAbsoluteEmailReminder)) return false;
        WSAbsoluteEmailReminder other = (WSAbsoluteEmailReminder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appointedDate==null && other.getAppointedDate()==null) || 
             (this.appointedDate!=null &&
              this.appointedDate.equals(other.getAppointedDate())));
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
        if (getAppointedDate() != null) {
            _hashCode += getAppointedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAbsoluteEmailReminder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSAbsoluteEmailReminder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appointedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appointedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
