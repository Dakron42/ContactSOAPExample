/**
 * WSContactManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSContactManager  extends com.keysurvey.api.v81.contact.WSModel  implements java.io.Serializable {
    private java.lang.Integer contactInactiveAfterDays;

    private java.lang.Integer formFinishedPoints;

    private java.lang.Integer formStartedPoints;

    private java.lang.String offlinePortalURL;

    private java.lang.String onlinePortalURL;

    private com.keysurvey.api.v81.contact.WSPortalSetting portalSettings;

    private java.lang.Integer registrationPoints;

    public WSContactManager() {
    }

    public WSContactManager(
           com.keysurvey.api.v81.contact.WSModelColumn[] columns,
           java.lang.Long id,
           java.lang.String keyFieldName,
           java.lang.String name,
           java.lang.Integer contactInactiveAfterDays,
           java.lang.Integer formFinishedPoints,
           java.lang.Integer formStartedPoints,
           java.lang.String offlinePortalURL,
           java.lang.String onlinePortalURL,
           com.keysurvey.api.v81.contact.WSPortalSetting portalSettings,
           java.lang.Integer registrationPoints) {
        super(
            columns,
            id,
            keyFieldName,
            name);
        this.contactInactiveAfterDays = contactInactiveAfterDays;
        this.formFinishedPoints = formFinishedPoints;
        this.formStartedPoints = formStartedPoints;
        this.offlinePortalURL = offlinePortalURL;
        this.onlinePortalURL = onlinePortalURL;
        this.portalSettings = portalSettings;
        this.registrationPoints = registrationPoints;
    }


    /**
     * Gets the contactInactiveAfterDays value for this WSContactManager.
     * 
     * @return contactInactiveAfterDays
     */
    public java.lang.Integer getContactInactiveAfterDays() {
        return contactInactiveAfterDays;
    }


    /**
     * Sets the contactInactiveAfterDays value for this WSContactManager.
     * 
     * @param contactInactiveAfterDays
     */
    public void setContactInactiveAfterDays(java.lang.Integer contactInactiveAfterDays) {
        this.contactInactiveAfterDays = contactInactiveAfterDays;
    }


    /**
     * Gets the formFinishedPoints value for this WSContactManager.
     * 
     * @return formFinishedPoints
     */
    public java.lang.Integer getFormFinishedPoints() {
        return formFinishedPoints;
    }


    /**
     * Sets the formFinishedPoints value for this WSContactManager.
     * 
     * @param formFinishedPoints
     */
    public void setFormFinishedPoints(java.lang.Integer formFinishedPoints) {
        this.formFinishedPoints = formFinishedPoints;
    }


    /**
     * Gets the formStartedPoints value for this WSContactManager.
     * 
     * @return formStartedPoints
     */
    public java.lang.Integer getFormStartedPoints() {
        return formStartedPoints;
    }


    /**
     * Sets the formStartedPoints value for this WSContactManager.
     * 
     * @param formStartedPoints
     */
    public void setFormStartedPoints(java.lang.Integer formStartedPoints) {
        this.formStartedPoints = formStartedPoints;
    }


    /**
     * Gets the offlinePortalURL value for this WSContactManager.
     * 
     * @return offlinePortalURL
     */
    public java.lang.String getOfflinePortalURL() {
        return offlinePortalURL;
    }


    /**
     * Sets the offlinePortalURL value for this WSContactManager.
     * 
     * @param offlinePortalURL
     */
    public void setOfflinePortalURL(java.lang.String offlinePortalURL) {
        this.offlinePortalURL = offlinePortalURL;
    }


    /**
     * Gets the onlinePortalURL value for this WSContactManager.
     * 
     * @return onlinePortalURL
     */
    public java.lang.String getOnlinePortalURL() {
        return onlinePortalURL;
    }


    /**
     * Sets the onlinePortalURL value for this WSContactManager.
     * 
     * @param onlinePortalURL
     */
    public void setOnlinePortalURL(java.lang.String onlinePortalURL) {
        this.onlinePortalURL = onlinePortalURL;
    }


    /**
     * Gets the portalSettings value for this WSContactManager.
     * 
     * @return portalSettings
     */
    public com.keysurvey.api.v81.contact.WSPortalSetting getPortalSettings() {
        return portalSettings;
    }


    /**
     * Sets the portalSettings value for this WSContactManager.
     * 
     * @param portalSettings
     */
    public void setPortalSettings(com.keysurvey.api.v81.contact.WSPortalSetting portalSettings) {
        this.portalSettings = portalSettings;
    }


    /**
     * Gets the registrationPoints value for this WSContactManager.
     * 
     * @return registrationPoints
     */
    public java.lang.Integer getRegistrationPoints() {
        return registrationPoints;
    }


    /**
     * Sets the registrationPoints value for this WSContactManager.
     * 
     * @param registrationPoints
     */
    public void setRegistrationPoints(java.lang.Integer registrationPoints) {
        this.registrationPoints = registrationPoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSContactManager)) return false;
        WSContactManager other = (WSContactManager) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contactInactiveAfterDays==null && other.getContactInactiveAfterDays()==null) || 
             (this.contactInactiveAfterDays!=null &&
              this.contactInactiveAfterDays.equals(other.getContactInactiveAfterDays()))) &&
            ((this.formFinishedPoints==null && other.getFormFinishedPoints()==null) || 
             (this.formFinishedPoints!=null &&
              this.formFinishedPoints.equals(other.getFormFinishedPoints()))) &&
            ((this.formStartedPoints==null && other.getFormStartedPoints()==null) || 
             (this.formStartedPoints!=null &&
              this.formStartedPoints.equals(other.getFormStartedPoints()))) &&
            ((this.offlinePortalURL==null && other.getOfflinePortalURL()==null) || 
             (this.offlinePortalURL!=null &&
              this.offlinePortalURL.equals(other.getOfflinePortalURL()))) &&
            ((this.onlinePortalURL==null && other.getOnlinePortalURL()==null) || 
             (this.onlinePortalURL!=null &&
              this.onlinePortalURL.equals(other.getOnlinePortalURL()))) &&
            ((this.portalSettings==null && other.getPortalSettings()==null) || 
             (this.portalSettings!=null &&
              this.portalSettings.equals(other.getPortalSettings()))) &&
            ((this.registrationPoints==null && other.getRegistrationPoints()==null) || 
             (this.registrationPoints!=null &&
              this.registrationPoints.equals(other.getRegistrationPoints())));
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
        if (getContactInactiveAfterDays() != null) {
            _hashCode += getContactInactiveAfterDays().hashCode();
        }
        if (getFormFinishedPoints() != null) {
            _hashCode += getFormFinishedPoints().hashCode();
        }
        if (getFormStartedPoints() != null) {
            _hashCode += getFormStartedPoints().hashCode();
        }
        if (getOfflinePortalURL() != null) {
            _hashCode += getOfflinePortalURL().hashCode();
        }
        if (getOnlinePortalURL() != null) {
            _hashCode += getOnlinePortalURL().hashCode();
        }
        if (getPortalSettings() != null) {
            _hashCode += getPortalSettings().hashCode();
        }
        if (getRegistrationPoints() != null) {
            _hashCode += getRegistrationPoints().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSContactManager.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactManager"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInactiveAfterDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactInactiveAfterDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formFinishedPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formFinishedPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formStartedPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formStartedPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlinePortalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offlinePortalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlinePortalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlinePortalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portalSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSPortalSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "registrationPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
