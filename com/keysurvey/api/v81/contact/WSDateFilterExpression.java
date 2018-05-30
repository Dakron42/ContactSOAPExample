/**
 * WSDateFilterExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSDateFilterExpression  extends com.keysurvey.api.v81.contact.WSFilterExpression  implements java.io.Serializable {
    private com.keysurvey.api.v81.contact.DateFilterExpressionConditionType condition;

    private java.util.Calendar valueDate;

    private java.lang.Integer valueDays;

    public WSDateFilterExpression() {
    }

    public WSDateFilterExpression(
           com.keysurvey.api.v81.contact.DateFilterExpressionConditionType condition,
           java.util.Calendar valueDate,
           java.lang.Integer valueDays) {
        this.condition = condition;
        this.valueDate = valueDate;
        this.valueDays = valueDays;
    }


    /**
     * Gets the condition value for this WSDateFilterExpression.
     * 
     * @return condition
     */
    public com.keysurvey.api.v81.contact.DateFilterExpressionConditionType getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this WSDateFilterExpression.
     * 
     * @param condition
     */
    public void setCondition(com.keysurvey.api.v81.contact.DateFilterExpressionConditionType condition) {
        this.condition = condition;
    }


    /**
     * Gets the valueDate value for this WSDateFilterExpression.
     * 
     * @return valueDate
     */
    public java.util.Calendar getValueDate() {
        return valueDate;
    }


    /**
     * Sets the valueDate value for this WSDateFilterExpression.
     * 
     * @param valueDate
     */
    public void setValueDate(java.util.Calendar valueDate) {
        this.valueDate = valueDate;
    }


    /**
     * Gets the valueDays value for this WSDateFilterExpression.
     * 
     * @return valueDays
     */
    public java.lang.Integer getValueDays() {
        return valueDays;
    }


    /**
     * Sets the valueDays value for this WSDateFilterExpression.
     * 
     * @param valueDays
     */
    public void setValueDays(java.lang.Integer valueDays) {
        this.valueDays = valueDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDateFilterExpression)) return false;
        WSDateFilterExpression other = (WSDateFilterExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.valueDate==null && other.getValueDate()==null) || 
             (this.valueDate!=null &&
              this.valueDate.equals(other.getValueDate()))) &&
            ((this.valueDays==null && other.getValueDays()==null) || 
             (this.valueDays!=null &&
              this.valueDays.equals(other.getValueDays())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getValueDate() != null) {
            _hashCode += getValueDate().hashCode();
        }
        if (getValueDays() != null) {
            _hashCode += getValueDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDateFilterExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSDateFilterExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "dateFilterExpressionConditionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueDays"));
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
