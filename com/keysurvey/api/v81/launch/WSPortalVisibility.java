/**
 * WSPortalVisibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSPortalVisibility  implements java.io.Serializable {
    private java.lang.Long formId;

    private java.util.Calendar startHideDate;

    private java.util.Calendar startShowDate;

    public WSPortalVisibility() {
    }

    public WSPortalVisibility(
           java.lang.Long formId,
           java.util.Calendar startHideDate,
           java.util.Calendar startShowDate) {
           this.formId = formId;
           this.startHideDate = startHideDate;
           this.startShowDate = startShowDate;
    }


    /**
     * Gets the formId value for this WSPortalVisibility.
     * 
     * @return formId
     */
    public java.lang.Long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WSPortalVisibility.
     * 
     * @param formId
     */
    public void setFormId(java.lang.Long formId) {
        this.formId = formId;
    }


    /**
     * Gets the startHideDate value for this WSPortalVisibility.
     * 
     * @return startHideDate
     */
    public java.util.Calendar getStartHideDate() {
        return startHideDate;
    }


    /**
     * Sets the startHideDate value for this WSPortalVisibility.
     * 
     * @param startHideDate
     */
    public void setStartHideDate(java.util.Calendar startHideDate) {
        this.startHideDate = startHideDate;
    }


    /**
     * Gets the startShowDate value for this WSPortalVisibility.
     * 
     * @return startShowDate
     */
    public java.util.Calendar getStartShowDate() {
        return startShowDate;
    }


    /**
     * Sets the startShowDate value for this WSPortalVisibility.
     * 
     * @param startShowDate
     */
    public void setStartShowDate(java.util.Calendar startShowDate) {
        this.startShowDate = startShowDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPortalVisibility)) return false;
        WSPortalVisibility other = (WSPortalVisibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.formId==null && other.getFormId()==null) || 
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.startHideDate==null && other.getStartHideDate()==null) || 
             (this.startHideDate!=null &&
              this.startHideDate.equals(other.getStartHideDate()))) &&
            ((this.startShowDate==null && other.getStartShowDate()==null) || 
             (this.startShowDate!=null &&
              this.startShowDate.equals(other.getStartShowDate())));
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
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getStartHideDate() != null) {
            _hashCode += getStartHideDate().hashCode();
        }
        if (getStartShowDate() != null) {
            _hashCode += getStartShowDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPortalVisibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSPortalVisibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHideDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startHideDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startShowDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startShowDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
