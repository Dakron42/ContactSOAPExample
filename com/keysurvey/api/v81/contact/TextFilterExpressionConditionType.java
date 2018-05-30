/**
 * TextFilterExpressionConditionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class TextFilterExpressionConditionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TextFilterExpressionConditionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONTAIN = "CONTAIN";
    public static final java.lang.String _ANY_WORDS = "ANY_WORDS";
    public static final java.lang.String _MATCH = "MATCH";
    public static final java.lang.String _EQUAL = "EQUAL";
    public static final TextFilterExpressionConditionType CONTAIN = new TextFilterExpressionConditionType(_CONTAIN);
    public static final TextFilterExpressionConditionType ANY_WORDS = new TextFilterExpressionConditionType(_ANY_WORDS);
    public static final TextFilterExpressionConditionType MATCH = new TextFilterExpressionConditionType(_MATCH);
    public static final TextFilterExpressionConditionType EQUAL = new TextFilterExpressionConditionType(_EQUAL);
    public java.lang.String getValue() { return _value_;}
    public static TextFilterExpressionConditionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TextFilterExpressionConditionType enumeration = (TextFilterExpressionConditionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TextFilterExpressionConditionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TextFilterExpressionConditionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "textFilterExpressionConditionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
