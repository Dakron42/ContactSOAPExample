/**
 * WSQuestionTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSQuestionTag  implements java.io.Serializable {
    private boolean autofilled;

    private boolean hidden;

    private long questionId;

    private boolean readOnlyAutofill;

    public WSQuestionTag() {
    }

    public WSQuestionTag(
           boolean autofilled,
           boolean hidden,
           long questionId,
           boolean readOnlyAutofill) {
           this.autofilled = autofilled;
           this.hidden = hidden;
           this.questionId = questionId;
           this.readOnlyAutofill = readOnlyAutofill;
    }


    /**
     * Gets the autofilled value for this WSQuestionTag.
     * 
     * @return autofilled
     */
    public boolean isAutofilled() {
        return autofilled;
    }


    /**
     * Sets the autofilled value for this WSQuestionTag.
     * 
     * @param autofilled
     */
    public void setAutofilled(boolean autofilled) {
        this.autofilled = autofilled;
    }


    /**
     * Gets the hidden value for this WSQuestionTag.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this WSQuestionTag.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the questionId value for this WSQuestionTag.
     * 
     * @return questionId
     */
    public long getQuestionId() {
        return questionId;
    }


    /**
     * Sets the questionId value for this WSQuestionTag.
     * 
     * @param questionId
     */
    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }


    /**
     * Gets the readOnlyAutofill value for this WSQuestionTag.
     * 
     * @return readOnlyAutofill
     */
    public boolean isReadOnlyAutofill() {
        return readOnlyAutofill;
    }


    /**
     * Sets the readOnlyAutofill value for this WSQuestionTag.
     * 
     * @param readOnlyAutofill
     */
    public void setReadOnlyAutofill(boolean readOnlyAutofill) {
        this.readOnlyAutofill = readOnlyAutofill;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSQuestionTag)) return false;
        WSQuestionTag other = (WSQuestionTag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.autofilled == other.isAutofilled() &&
            this.hidden == other.isHidden() &&
            this.questionId == other.getQuestionId() &&
            this.readOnlyAutofill == other.isReadOnlyAutofill();
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
        _hashCode += (isAutofilled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getQuestionId()).hashCode();
        _hashCode += (isReadOnlyAutofill() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSQuestionTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSQuestionTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autofilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autofilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnlyAutofill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readOnlyAutofill"));
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
