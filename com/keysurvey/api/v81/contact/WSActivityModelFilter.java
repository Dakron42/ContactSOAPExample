/**
 * WSActivityModelFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSActivityModelFilter  extends com.keysurvey.api.v81.contact.WSModelFilter  implements java.io.Serializable {
    private com.keysurvey.api.v81.contact.ActivityModelFilterType activityType;

    private boolean exclude;

    private com.keysurvey.api.v81.contact.WSFilterExpression expression;

    public WSActivityModelFilter() {
    }

    public WSActivityModelFilter(
           com.keysurvey.api.v81.contact.ActivityModelFilterType activityType,
           boolean exclude,
           com.keysurvey.api.v81.contact.WSFilterExpression expression) {
        this.activityType = activityType;
        this.exclude = exclude;
        this.expression = expression;
    }


    /**
     * Gets the activityType value for this WSActivityModelFilter.
     * 
     * @return activityType
     */
    public com.keysurvey.api.v81.contact.ActivityModelFilterType getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this WSActivityModelFilter.
     * 
     * @param activityType
     */
    public void setActivityType(com.keysurvey.api.v81.contact.ActivityModelFilterType activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the exclude value for this WSActivityModelFilter.
     * 
     * @return exclude
     */
    public boolean isExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this WSActivityModelFilter.
     * 
     * @param exclude
     */
    public void setExclude(boolean exclude) {
        this.exclude = exclude;
    }


    /**
     * Gets the expression value for this WSActivityModelFilter.
     * 
     * @return expression
     */
    public com.keysurvey.api.v81.contact.WSFilterExpression getExpression() {
        return expression;
    }


    /**
     * Sets the expression value for this WSActivityModelFilter.
     * 
     * @param expression
     */
    public void setExpression(com.keysurvey.api.v81.contact.WSFilterExpression expression) {
        this.expression = expression;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSActivityModelFilter)) return false;
        WSActivityModelFilter other = (WSActivityModelFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            this.exclude == other.isExclude() &&
            ((this.expression==null && other.getExpression()==null) || 
             (this.expression!=null &&
              this.expression.equals(other.getExpression())));
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
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        _hashCode += (isExclude() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExpression() != null) {
            _hashCode += getExpression().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSActivityModelFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSActivityModelFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "activityModelFilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSFilterExpression"));
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
