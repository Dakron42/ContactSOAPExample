/**
 * WSModelObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSModelObject  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String keyFieldName;

    private com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry[] properties;

    public WSModelObject() {
    }

    public WSModelObject(
           java.lang.Long id,
           java.lang.String keyFieldName,
           com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry[] properties) {
           this.id = id;
           this.keyFieldName = keyFieldName;
           this.properties = properties;
    }


    /**
     * Gets the id value for this WSModelObject.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this WSModelObject.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the keyFieldName value for this WSModelObject.
     * 
     * @return keyFieldName
     */
    public java.lang.String getKeyFieldName() {
        return keyFieldName;
    }


    /**
     * Sets the keyFieldName value for this WSModelObject.
     * 
     * @param keyFieldName
     */
    public void setKeyFieldName(java.lang.String keyFieldName) {
        this.keyFieldName = keyFieldName;
    }


    /**
     * Gets the properties value for this WSModelObject.
     * 
     * @return properties
     */
    public com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this WSModelObject.
     * 
     * @param properties
     */
    public void setProperties(com.keysurvey.api.v81.contact.WSModelObjectPropertiesEntry[] properties) {
        this.properties = properties;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSModelObject)) return false;
        WSModelObject other = (WSModelObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.keyFieldName==null && other.getKeyFieldName()==null) || 
             (this.keyFieldName!=null &&
              this.keyFieldName.equals(other.getKeyFieldName()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKeyFieldName() != null) {
            _hashCode += getKeyFieldName().hashCode();
        }
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
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
        new org.apache.axis.description.TypeDesc(WSModelObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("", "properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", ">>WSModelObject>properties>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
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
