/**
 * WSModelFilterGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSModelFilterGroup  implements java.io.Serializable {
    private com.keysurvey.api.v81.contact.WSModelFilter[] filters;

    private java.lang.Long id;

    private java.lang.String logicalCondition;

    private java.lang.String name;

    public WSModelFilterGroup() {
    }

    public WSModelFilterGroup(
           com.keysurvey.api.v81.contact.WSModelFilter[] filters,
           java.lang.Long id,
           java.lang.String logicalCondition,
           java.lang.String name) {
           this.filters = filters;
           this.id = id;
           this.logicalCondition = logicalCondition;
           this.name = name;
    }


    /**
     * Gets the filters value for this WSModelFilterGroup.
     * 
     * @return filters
     */
    public com.keysurvey.api.v81.contact.WSModelFilter[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this WSModelFilterGroup.
     * 
     * @param filters
     */
    public void setFilters(com.keysurvey.api.v81.contact.WSModelFilter[] filters) {
        this.filters = filters;
    }

    public com.keysurvey.api.v81.contact.WSModelFilter getFilters(int i) {
        return this.filters[i];
    }

    public void setFilters(int i, com.keysurvey.api.v81.contact.WSModelFilter _value) {
        this.filters[i] = _value;
    }


    /**
     * Gets the id value for this WSModelFilterGroup.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this WSModelFilterGroup.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the logicalCondition value for this WSModelFilterGroup.
     * 
     * @return logicalCondition
     */
    public java.lang.String getLogicalCondition() {
        return logicalCondition;
    }


    /**
     * Sets the logicalCondition value for this WSModelFilterGroup.
     * 
     * @param logicalCondition
     */
    public void setLogicalCondition(java.lang.String logicalCondition) {
        this.logicalCondition = logicalCondition;
    }


    /**
     * Gets the name value for this WSModelFilterGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WSModelFilterGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSModelFilterGroup)) return false;
        WSModelFilterGroup other = (WSModelFilterGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.logicalCondition==null && other.getLogicalCondition()==null) || 
             (this.logicalCondition!=null &&
              this.logicalCondition.equals(other.getLogicalCondition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLogicalCondition() != null) {
            _hashCode += getLogicalCondition().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSModelFilterGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilterGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSModelFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logicalCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
