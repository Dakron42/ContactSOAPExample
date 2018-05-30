/**
 * WsFilterCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WsFilterCondition implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WsFilterCondition(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_EQUAL = "NOT_EQUAL";
    public static final java.lang.String _EQUAL = "EQUAL";
    public static final java.lang.String _CONTAINS = "CONTAINS";
    public static final WsFilterCondition NOT_EQUAL = new WsFilterCondition(_NOT_EQUAL);
    public static final WsFilterCondition EQUAL = new WsFilterCondition(_EQUAL);
    public static final WsFilterCondition CONTAINS = new WsFilterCondition(_CONTAINS);
    public java.lang.String getValue() { return _value_;}
    public static WsFilterCondition fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WsFilterCondition enumeration = (WsFilterCondition)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WsFilterCondition fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WsFilterCondition.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "wsFilterCondition"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
