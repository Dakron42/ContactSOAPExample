/**
 * WSLastSurveyStatusFilterExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSLastSurveyStatusFilterExpression  extends com.keysurvey.api.v81.contact.WSFilterExpression  implements java.io.Serializable {
    private com.keysurvey.api.v81.contact.WSLastSurveyStatus status;

    public WSLastSurveyStatusFilterExpression() {
    }

    public WSLastSurveyStatusFilterExpression(
           com.keysurvey.api.v81.contact.WSLastSurveyStatus status) {
        this.status = status;
    }


    /**
     * Gets the status value for this WSLastSurveyStatusFilterExpression.
     * 
     * @return status
     */
    public com.keysurvey.api.v81.contact.WSLastSurveyStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSLastSurveyStatusFilterExpression.
     * 
     * @param status
     */
    public void setStatus(com.keysurvey.api.v81.contact.WSLastSurveyStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSLastSurveyStatusFilterExpression)) return false;
        WSLastSurveyStatusFilterExpression other = (WSLastSurveyStatusFilterExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSLastSurveyStatusFilterExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSLastSurveyStatusFilterExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSLastSurveyStatus"));
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
