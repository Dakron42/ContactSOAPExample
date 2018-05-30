/**
 * WSFormEmailTemplate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSFormEmailTemplate  implements java.io.Serializable {
    private com.keysurvey.api.v81.launch.WSFileAttachment[] attachments;

    private java.lang.String content;

    private long formId;

    private java.lang.String from;

    private java.lang.String replyTo;

    private java.lang.String subject;

    private java.lang.String undeliveredTo;

    public WSFormEmailTemplate() {
    }

    public WSFormEmailTemplate(
           com.keysurvey.api.v81.launch.WSFileAttachment[] attachments,
           java.lang.String content,
           long formId,
           java.lang.String from,
           java.lang.String replyTo,
           java.lang.String subject,
           java.lang.String undeliveredTo) {
           this.attachments = attachments;
           this.content = content;
           this.formId = formId;
           this.from = from;
           this.replyTo = replyTo;
           this.subject = subject;
           this.undeliveredTo = undeliveredTo;
    }


    /**
     * Gets the attachments value for this WSFormEmailTemplate.
     * 
     * @return attachments
     */
    public com.keysurvey.api.v81.launch.WSFileAttachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this WSFormEmailTemplate.
     * 
     * @param attachments
     */
    public void setAttachments(com.keysurvey.api.v81.launch.WSFileAttachment[] attachments) {
        this.attachments = attachments;
    }

    public com.keysurvey.api.v81.launch.WSFileAttachment getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.keysurvey.api.v81.launch.WSFileAttachment _value) {
        this.attachments[i] = _value;
    }


    /**
     * Gets the content value for this WSFormEmailTemplate.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this WSFormEmailTemplate.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the formId value for this WSFormEmailTemplate.
     * 
     * @return formId
     */
    public long getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this WSFormEmailTemplate.
     * 
     * @param formId
     */
    public void setFormId(long formId) {
        this.formId = formId;
    }


    /**
     * Gets the from value for this WSFormEmailTemplate.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this WSFormEmailTemplate.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the replyTo value for this WSFormEmailTemplate.
     * 
     * @return replyTo
     */
    public java.lang.String getReplyTo() {
        return replyTo;
    }


    /**
     * Sets the replyTo value for this WSFormEmailTemplate.
     * 
     * @param replyTo
     */
    public void setReplyTo(java.lang.String replyTo) {
        this.replyTo = replyTo;
    }


    /**
     * Gets the subject value for this WSFormEmailTemplate.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this WSFormEmailTemplate.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the undeliveredTo value for this WSFormEmailTemplate.
     * 
     * @return undeliveredTo
     */
    public java.lang.String getUndeliveredTo() {
        return undeliveredTo;
    }


    /**
     * Sets the undeliveredTo value for this WSFormEmailTemplate.
     * 
     * @param undeliveredTo
     */
    public void setUndeliveredTo(java.lang.String undeliveredTo) {
        this.undeliveredTo = undeliveredTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSFormEmailTemplate)) return false;
        WSFormEmailTemplate other = (WSFormEmailTemplate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.formId == other.getFormId() &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.replyTo==null && other.getReplyTo()==null) || 
             (this.replyTo!=null &&
              this.replyTo.equals(other.getReplyTo()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.undeliveredTo==null && other.getUndeliveredTo()==null) || 
             (this.undeliveredTo!=null &&
              this.undeliveredTo.equals(other.getUndeliveredTo())));
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
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += new Long(getFormId()).hashCode();
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getReplyTo() != null) {
            _hashCode += getReplyTo().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getUndeliveredTo() != null) {
            _hashCode += getUndeliveredTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSFormEmailTemplate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFormEmailTemplate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSFileAttachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliveredTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undeliveredTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
