/**
 * NumberFilterExpressionConditionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class NumberFilterExpressionConditionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NumberFilterExpressionConditionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _MORE_OR_EQUAL = "MORE_OR_EQUAL";
    public static final java.lang.String _LESS_OR_EQUAL = "LESS_OR_EQUAL";
    public static final java.lang.String _EQUAL_TO = "EQUAL_TO";
    public static final java.lang.String _MORE = "MORE";
    public static final java.lang.String _LESS = "LESS";
    public static final NumberFilterExpressionConditionType MORE_OR_EQUAL = new NumberFilterExpressionConditionType(_MORE_OR_EQUAL);
    public static final NumberFilterExpressionConditionType LESS_OR_EQUAL = new NumberFilterExpressionConditionType(_LESS_OR_EQUAL);
    public static final NumberFilterExpressionConditionType EQUAL_TO = new NumberFilterExpressionConditionType(_EQUAL_TO);
    public static final NumberFilterExpressionConditionType MORE = new NumberFilterExpressionConditionType(_MORE);
    public static final NumberFilterExpressionConditionType LESS = new NumberFilterExpressionConditionType(_LESS);
    public java.lang.String getValue() { return _value_;}
    public static NumberFilterExpressionConditionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NumberFilterExpressionConditionType enumeration = (NumberFilterExpressionConditionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NumberFilterExpressionConditionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NumberFilterExpressionConditionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "numberFilterExpressionConditionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
