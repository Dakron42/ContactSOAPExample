/**
 * WsEditResponseSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WsEditResponseSettings  implements java.io.Serializable {
    private boolean allowCopy;

    private boolean allowDelete;

    private boolean allowEdit;

    private boolean allowMultiple;

    private long formId;

    public WsEditResponseSettings() {
    }

    public WsEditResponseSettings(
           boolean allowCopy,
           boolean allowDelete,
           boolean allowEdit,
           boolean allowMultiple,
           long formId) {
           this.allowCopy = allowCopy;
           this.allowDelete = allowDelete;
           this.allowEdit = allowEdit;
           this.allowMultiple = allowMultiple;
           this.formId = formId;
    }


    /**
     * Gets the allowCopy value for this WsEditResponseSettings.
     * 
     * @return allowCopy
     */
    public boolean isAllowCopy() {
        return allowCopy;
    }


    /**
     * Sets the allowCopy value for this WsEditResponseSettings.
     * 
     * @param allowCopy
     */
    public void setAllowCopy(boolean allowCopy) {
        this.allowCopy = allowCopy;
    }


    /**
     * Gets the allowDelete value for this WsEditResponseSettings.
     * 
     * @return allowDelete
     */
    public boolean isAllowDelete() {
        return allowDelete;
    }


    /**
     * Sets the allowDelete value for this WsEditResponseSettings.
     * 
     * @param allowDelete
     */
    public void setAllowDelete(boolean allowDelete) {
        this.allowDelete = allowDelete;
    }


    /**
     * Gets the allowEdit value for this WsEditResponseSettings.
     * 
     * @return allowEdit
     */
    public boolean isAllowEdit() {
        return allowEdit;
    }


    /**
     * Sets the allowEdit value for this WsEditResponseSettings.
     * 
     * @param allowEdit
     */
    public void setAllowEdit(boolean allowEdit) {
        this.allowEdit = allowEdit;
    }


    /**
     * Gets the allowMultiple value for this WsEditResponseSettings.
     * 
     * @return allowMultiple
     */
    public boolean isAllowMultiple() {
        return allowMultiple;
    }


    /**
     * Sets the allowMultiple value for this WsEditResponseSettings.
     * 
     * @param allowMultiple
     */
    public void setAllowMultiple(boolean allowMultiple) {
        this.allowMultiple = allowMultiple;
    }


    /**
     * Gets the formId value for this WsEditResponseSettings.
     * 
     * @return formId
     */
    public long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WsEditResponseSettings.
     * 
     * @param formId
     */
    public void setFormId(long formId) {
        this.formId = formId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsEditResponseSettings)) return false;
        WsEditResponseSettings other = (WsEditResponseSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowCopy == other.isAllowCopy() &&
            this.allowDelete == other.isAllowDelete() &&
            this.allowEdit == other.isAllowEdit() &&
            this.allowMultiple == other.isAllowMultiple() &&
            this.formId == other.getFormId();
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
        _hashCode += (isAllowCopy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowDelete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowMultiple() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getFormId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsEditResponseSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsEditResponseSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
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
