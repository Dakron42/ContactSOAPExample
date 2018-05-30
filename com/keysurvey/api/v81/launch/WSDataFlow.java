/**
 * WSDataFlow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSDataFlow  implements java.io.Serializable {
    private java.lang.Long contactManagerId;

    private java.lang.Long formId;

    private com.keysurvey.api.v81.launch.WSDataFlowSetting[] settings;

    public WSDataFlow() {
    }

    public WSDataFlow(
           java.lang.Long contactManagerId,
           java.lang.Long formId,
           com.keysurvey.api.v81.launch.WSDataFlowSetting[] settings) {
           this.contactManagerId = contactManagerId;
           this.formId = formId;
           this.settings = settings;
    }


    /**
     * Gets the contactManagerId value for this WSDataFlow.
     * 
     * @return contactManagerId
     */
    public java.lang.Long getContactManagerId() {
        return contactManagerId;
    }


    /**
     * Sets the contactManagerId value for this WSDataFlow.
     * 
     * @param contactManagerId
     */
    public void setContactManagerId(java.lang.Long contactManagerId) {
        this.contactManagerId = contactManagerId;
    }


    /**
     * Gets the formId value for this WSDataFlow.
     * 
     * @return formId
     */
    public java.lang.Long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WSDataFlow.
     * 
     * @param formId
     */
    public void setFormId(java.lang.Long formId) {
        this.formId = formId;
    }


    /**
     * Gets the settings value for this WSDataFlow.
     * 
     * @return settings
     */
    public com.keysurvey.api.v81.launch.WSDataFlowSetting[] getSettings() {
        return settings;
    }


    /**
     * Sets the settings value for this WSDataFlow.
     * 
     * @param settings
     */
    public void setSettings(com.keysurvey.api.v81.launch.WSDataFlowSetting[] settings) {
        this.settings = settings;
    }

    public com.keysurvey.api.v81.launch.WSDataFlowSetting getSettings(int i) {
        return this.settings[i];
    }

    public void setSettings(int i, com.keysurvey.api.v81.launch.WSDataFlowSetting _value) {
        this.settings[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDataFlow)) return false;
        WSDataFlow other = (WSDataFlow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactManagerId==null && other.getContactManagerId()==null) || 
             (this.contactManagerId!=null &&
              this.contactManagerId.equals(other.getContactManagerId()))) &&
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.settings==null && other.getSettings()==null) || 
             (this.settings!=null &&
              java.util.Arrays.equals(this.settings, other.getSettings())));
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
        if (getContactManagerId() != null) {
            _hashCode += getContactManagerId().hashCode();
        }
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getSettings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSettings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSettings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDataFlow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactManagerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactManagerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
