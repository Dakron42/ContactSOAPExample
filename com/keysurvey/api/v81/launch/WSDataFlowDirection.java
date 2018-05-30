/**
 * WSDataFlowDirection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.launch;

public class WSDataFlowDirection implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WSDataFlowDirection(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _FROM_SURVEY_TO_CM = "FROM_SURVEY_TO_CM";
    public static final java.lang.String _FROM_CM_TO_SURVEY = "FROM_CM_TO_SURVEY";
    public static final java.lang.String _BIDIRECTIONAL = "BIDIRECTIONAL";
    public static final WSDataFlowDirection NONE = new WSDataFlowDirection(_NONE);
    public static final WSDataFlowDirection FROM_SURVEY_TO_CM = new WSDataFlowDirection(_FROM_SURVEY_TO_CM);
    public static final WSDataFlowDirection FROM_CM_TO_SURVEY = new WSDataFlowDirection(_FROM_CM_TO_SURVEY);
    public static final WSDataFlowDirection BIDIRECTIONAL = new WSDataFlowDirection(_BIDIRECTIONAL);
    public java.lang.String getValue() { return _value_;}
    public static WSDataFlowDirection fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WSDataFlowDirection enumeration = (WSDataFlowDirection)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WSDataFlowDirection fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WSDataFlowDirection.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://launch.v81.api.keysurvey.com", "WSDataFlowDirection"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
