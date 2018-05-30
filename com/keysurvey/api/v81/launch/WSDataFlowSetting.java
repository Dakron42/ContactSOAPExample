/**
 * WSDataFlowSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSDataFlowSetting  implements java.io.Serializable {
    private java.lang.String cmFieldReference;

    private com.keysurvey.api.v81.launch.WSDataFlowDirection direction;

    private java.lang.String formFieldReference;

    private boolean overrideWithEmptyValues;

    public WSDataFlowSetting() {
    }

    public WSDataFlowSetting(
           java.lang.String cmFieldReference,
           com.keysurvey.api.v81.launch.WSDataFlowDirection direction,
           java.lang.String formFieldReference,
           boolean overrideWithEmptyValues) {
           this.cmFieldReference = cmFieldReference;
           this.direction = direction;
           this.formFieldReference = formFieldReference;
           this.overrideWithEmptyValues = overrideWithEmptyValues;
    }


    /**
     * Gets the cmFieldReference value for this WSDataFlowSetting.
     * 
     * @return cmFieldReference
     */
    public java.lang.String getCmFieldReference() {
        return cmFieldReference;
    }


    /**
     * Sets the cmFieldReference value for this WSDataFlowSetting.
     * 
     * @param cmFieldReference
     */
    public void setCmFieldReference(java.lang.String cmFieldReference) {
        this.cmFieldReference = cmFieldReference;
    }


    /**
     * Gets the direction value for this WSDataFlowSetting.
     * 
     * @return direction
     */
    public com.keysurvey.api.v81.launch.WSDataFlowDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this WSDataFlowSetting.
     * 
     * @param direction
     */
    public void setDirection(com.keysurvey.api.v81.launch.WSDataFlowDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the formFieldReference value for this WSDataFlowSetting.
     * 
     * @return formFieldReference
     */
    public java.lang.String getFormFieldReference() {
        return formFieldReference;
    }


    /**
     * Sets the formFieldReference value for this WSDataFlowSetting.
     * 
     * @param formFieldReference
     */
    public void setFormFieldReference(java.lang.String formFieldReference) {
        this.formFieldReference = formFieldReference;
    }


    /**
     * Gets the overrideWithEmptyValues value for this WSDataFlowSetting.
     * 
     * @return overrideWithEmptyValues
     */
    public boolean isOverrideWithEmptyValues() {
        return overrideWithEmptyValues;
    }


    /**
     * Sets the overrideWithEmptyValues value for this WSDataFlowSetting.
     * 
     * @param overrideWithEmptyValues
     */
    public void setOverrideWithEmptyValues(boolean overrideWithEmptyValues) {
        this.overrideWithEmptyValues = overrideWithEmptyValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDataFlowSetting)) return false;
        WSDataFlowSetting other = (WSDataFlowSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmFieldReference==null && other.getCmFieldReference()==null) || 
             (this.cmFieldReference!=null &&
              this.cmFieldReference.equals(other.getCmFieldReference()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.formFieldReference==null && other.getFormFieldReference()==null) || 
             (this.formFieldReference!=null &&
              this.formFieldReference.equals(other.getFormFieldReference()))) &&
            this.overrideWithEmptyValues == other.isOverrideWithEmptyValues();
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
        if (getCmFieldReference() != null) {
            _hashCode += getCmFieldReference().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getFormFieldReference() != null) {
            _hashCode += getFormFieldReference().hashCode();
        }
        _hashCode += (isOverrideWithEmptyValues() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDataFlowSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFieldReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmFieldReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formFieldReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formFieldReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideWithEmptyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideWithEmptyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
