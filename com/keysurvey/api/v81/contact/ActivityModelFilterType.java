/**
 * ActivityModelFilterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class ActivityModelFilterType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActivityModelFilterType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONTACT_SCORE = "CONTACT_SCORE";
    public static final java.lang.String _CONTACT_STATUS = "CONTACT_STATUS";
    public static final java.lang.String _SURVEYS_FINISHED = "SURVEYS_FINISHED";
    public static final java.lang.String _LAST_INVITATION_SEND = "LAST_INVITATION_SEND";
    public static final java.lang.String _LAST_SURVEY_STARTED = "LAST_SURVEY_STARTED";
    public static final java.lang.String _LAST_COMPLETED_SURVEY = "LAST_COMPLETED_SURVEY";
    public static final java.lang.String _LAST_SURVEY_STATUS = "LAST_SURVEY_STATUS";
    public static final ActivityModelFilterType CONTACT_SCORE = new ActivityModelFilterType(_CONTACT_SCORE);
    public static final ActivityModelFilterType CONTACT_STATUS = new ActivityModelFilterType(_CONTACT_STATUS);
    public static final ActivityModelFilterType SURVEYS_FINISHED = new ActivityModelFilterType(_SURVEYS_FINISHED);
    public static final ActivityModelFilterType LAST_INVITATION_SEND = new ActivityModelFilterType(_LAST_INVITATION_SEND);
    public static final ActivityModelFilterType LAST_SURVEY_STARTED = new ActivityModelFilterType(_LAST_SURVEY_STARTED);
    public static final ActivityModelFilterType LAST_COMPLETED_SURVEY = new ActivityModelFilterType(_LAST_COMPLETED_SURVEY);
    public static final ActivityModelFilterType LAST_SURVEY_STATUS = new ActivityModelFilterType(_LAST_SURVEY_STATUS);
    public java.lang.String getValue() { return _value_;}
    public static ActivityModelFilterType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActivityModelFilterType enumeration = (ActivityModelFilterType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActivityModelFilterType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActivityModelFilterType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "activityModelFilterType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
