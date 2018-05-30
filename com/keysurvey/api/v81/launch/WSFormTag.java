/**
 * WSFormTag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSFormTag  implements java.io.Serializable {
    private long formId;

    private boolean frozen;

    private com.keysurvey.api.v81.launch.WSQuestionTag[] questionTags;

    public WSFormTag() {
    }

    public WSFormTag(
           long formId,
           boolean frozen,
           com.keysurvey.api.v81.launch.WSQuestionTag[] questionTags) {
           this.formId = formId;
           this.frozen = frozen;
           this.questionTags = questionTags;
    }


    /**
     * Gets the formId value for this WSFormTag.
     * 
     * @return formId
     */
    public long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WSFormTag.
     * 
     * @param formId
     */
    public void setFormId(long formId) {
        this.formId = formId;
    }


    /**
     * Gets the frozen value for this WSFormTag.
     * 
     * @return frozen
     */
    public boolean isFrozen() {
        return frozen;
    }


    /**
     * Sets the frozen value for this WSFormTag.
     * 
     * @param frozen
     */
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }


    /**
     * Gets the questionTags value for this WSFormTag.
     * 
     * @return questionTags
     */
    public com.keysurvey.api.v81.launch.WSQuestionTag[] getQuestionTags() {
        return questionTags;
    }


    /**
     * Sets the questionTags value for this WSFormTag.
     * 
     * @param questionTags
     */
    public void setQuestionTags(com.keysurvey.api.v81.launch.WSQuestionTag[] questionTags) {
        this.questionTags = questionTags;
    }

    public com.keysurvey.api.v81.launch.WSQuestionTag getQuestionTags(int i) {
        return this.questionTags[i];
    }

    public void setQuestionTags(int i, com.keysurvey.api.v81.launch.WSQuestionTag _value) {
        this.questionTags[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSFormTag)) return false;
        WSFormTag other = (WSFormTag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.formId == other.getFormId() &&
            this.frozen == other.isFrozen() &&
            ((this.questionTags==null && other.getQuestionTags()==null) || 
             (this.questionTags!=null &&
              java.util.Arrays.equals(this.questionTags, other.getQuestionTags())));
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
        _hashCode += new Long(getFormId()).hashCode();
        _hashCode += (isFrozen() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getQuestionTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestionTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestionTags(), i);
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
        new org.apache.axis.description.TypeDesc(WSFormTag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormTag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frozen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frozen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questionTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "questionTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSQuestionTag"));
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
