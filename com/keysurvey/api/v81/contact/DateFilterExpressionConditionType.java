/**
 * DateFilterExpressionConditionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class DateFilterExpressionConditionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateFilterExpressionConditionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ABSENT = "ABSENT";
    public static final java.lang.String _EXACTLY = "EXACTLY";
    public static final java.lang.String _MORE_THAN_AGO = "MORE_THAN_AGO";
    public static final java.lang.String _LESS_THAN_AGO = "LESS_THAN_AGO";
    public static final java.lang.String _ON = "ON";
    public static final java.lang.String _BEFORE = "BEFORE";
    public static final java.lang.String _AFTER = "AFTER";
    public static final java.lang.String _BEFORE_OR_EQUAL = "BEFORE_OR_EQUAL";
    public static final java.lang.String _AFTER_OR_EQUAL = "AFTER_OR_EQUAL";
    public static final DateFilterExpressionConditionType ABSENT = new DateFilterExpressionConditionType(_ABSENT);
    public static final DateFilterExpressionConditionType EXACTLY = new DateFilterExpressionConditionType(_EXACTLY);
    public static final DateFilterExpressionConditionType MORE_THAN_AGO = new DateFilterExpressionConditionType(_MORE_THAN_AGO);
    public static final DateFilterExpressionConditionType LESS_THAN_AGO = new DateFilterExpressionConditionType(_LESS_THAN_AGO);
    public static final DateFilterExpressionConditionType ON = new DateFilterExpressionConditionType(_ON);
    public static final DateFilterExpressionConditionType BEFORE = new DateFilterExpressionConditionType(_BEFORE);
    public static final DateFilterExpressionConditionType AFTER = new DateFilterExpressionConditionType(_AFTER);
    public static final DateFilterExpressionConditionType BEFORE_OR_EQUAL = new DateFilterExpressionConditionType(_BEFORE_OR_EQUAL);
    public static final DateFilterExpressionConditionType AFTER_OR_EQUAL = new DateFilterExpressionConditionType(_AFTER_OR_EQUAL);
    public java.lang.String getValue() { return _value_;}
    public static DateFilterExpressionConditionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateFilterExpressionConditionType enumeration = (DateFilterExpressionConditionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateFilterExpressionConditionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateFilterExpressionConditionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "dateFilterExpressionConditionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
