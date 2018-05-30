/**
 * WSPortalSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSPortalSetting  implements java.io.Serializable {
    private java.util.Calendar activateDate;

    private java.util.Calendar deactivateDate;

    private java.lang.String emailField;

    private java.lang.String loginField;

    private java.lang.String passwordField;

    private java.lang.String title;

    public WSPortalSetting() {
    }

    public WSPortalSetting(
           java.util.Calendar activateDate,
           java.util.Calendar deactivateDate,
           java.lang.String emailField,
           java.lang.String loginField,
           java.lang.String passwordField,
           java.lang.String title) {
           this.activateDate = activateDate;
           this.deactivateDate = deactivateDate;
           this.emailField = emailField;
           this.loginField = loginField;
           this.passwordField = passwordField;
           this.title = title;
    }


    /**
     * Gets the activateDate value for this WSPortalSetting.
     * 
     * @return activateDate
     */
    public java.util.Calendar getActivateDate() {
        return activateDate;
    }


    /**
     * Sets the activateDate value for this WSPortalSetting.
     * 
     * @param activateDate
     */
    public void setActivateDate(java.util.Calendar activateDate) {
        this.activateDate = activateDate;
    }


    /**
     * Gets the deactivateDate value for this WSPortalSetting.
     * 
     * @return deactivateDate
     */
    public java.util.Calendar getDeactivateDate() {
        return deactivateDate;
    }


    /**
     * Sets the deactivateDate value for this WSPortalSetting.
     * 
     * @param deactivateDate
     */
    public void setDeactivateDate(java.util.Calendar deactivateDate) {
        this.deactivateDate = deactivateDate;
    }


    /**
     * Gets the emailField value for this WSPortalSetting.
     * 
     * @return emailField
     */
    public java.lang.String getEmailField() {
        return emailField;
    }


    /**
     * Sets the emailField value for this WSPortalSetting.
     * 
     * @param emailField
     */
    public void setEmailField(java.lang.String emailField) {
        this.emailField = emailField;
    }


    /**
     * Gets the loginField value for this WSPortalSetting.
     * 
     * @return loginField
     */
    public java.lang.String getLoginField() {
        return loginField;
    }


    /**
     * Sets the loginField value for this WSPortalSetting.
     * 
     * @param loginField
     */
    public void setLoginField(java.lang.String loginField) {
        this.loginField = loginField;
    }


    /**
     * Gets the passwordField value for this WSPortalSetting.
     * 
     * @return passwordField
     */
    public java.lang.String getPasswordField() {
        return passwordField;
    }


    /**
     * Sets the passwordField value for this WSPortalSetting.
     * 
     * @param passwordField
     */
    public void setPasswordField(java.lang.String passwordField) {
        this.passwordField = passwordField;
    }


    /**
     * Gets the title value for this WSPortalSetting.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WSPortalSetting.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPortalSetting)) return false;
        WSPortalSetting other = (WSPortalSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activateDate==null && other.getActivateDate()==null) || 
             (this.activateDate!=null &&
              this.activateDate.equals(other.getActivateDate()))) &&
            ((this.deactivateDate==null && other.getDeactivateDate()==null) || 
             (this.deactivateDate!=null &&
              this.deactivateDate.equals(other.getDeactivateDate()))) &&
            ((this.emailField==null && other.getEmailField()==null) || 
             (this.emailField!=null &&
              this.emailField.equals(other.getEmailField()))) &&
            ((this.loginField==null && other.getLoginField()==null) || 
             (this.loginField!=null &&
              this.loginField.equals(other.getLoginField()))) &&
            ((this.passwordField==null && other.getPasswordField()==null) || 
             (this.passwordField!=null &&
              this.passwordField.equals(other.getPasswordField()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActivateDate() != null) {
            _hashCode += getActivateDate().hashCode();
        }
        if (getDeactivateDate() != null) {
            _hashCode += getDeactivateDate().hashCode();
        }
        if (getEmailField() != null) {
            _hashCode += getEmailField().hashCode();
        }
        if (getLoginField() != null) {
            _hashCode += getLoginField().hashCode();
        }
        if (getPasswordField() != null) {
            _hashCode += getPasswordField().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPortalSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSPortalSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deactivateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deactivateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwordField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
