/**
 * WSOrgChartModelFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSOrgChartModelFilter  extends com.keysurvey.api.v81.contact.WSModelFilter  implements java.io.Serializable {
    private java.lang.String childFieldName;

    private java.lang.Long[] contactIds;

    private boolean exclude;

    private java.lang.String parentFieldName;

    private boolean withRoot;

    public WSOrgChartModelFilter() {
    }

    public WSOrgChartModelFilter(
           java.lang.String childFieldName,
           java.lang.Long[] contactIds,
           boolean exclude,
           java.lang.String parentFieldName,
           boolean withRoot) {
        this.childFieldName = childFieldName;
        this.contactIds = contactIds;
        this.exclude = exclude;
        this.parentFieldName = parentFieldName;
        this.withRoot = withRoot;
    }


    /**
     * Gets the childFieldName value for this WSOrgChartModelFilter.
     * 
     * @return childFieldName
     */
    public java.lang.String getChildFieldName() {
        return childFieldName;
    }


    /**
     * Sets the childFieldName value for this WSOrgChartModelFilter.
     * 
     * @param childFieldName
     */
    public void setChildFieldName(java.lang.String childFieldName) {
        this.childFieldName = childFieldName;
    }


    /**
     * Gets the contactIds value for this WSOrgChartModelFilter.
     * 
     * @return contactIds
     */
    public java.lang.Long[] getContactIds() {
        return contactIds;
    }


    /**
     * Sets the contactIds value for this WSOrgChartModelFilter.
     * 
     * @param contactIds
     */
    public void setContactIds(java.lang.Long[] contactIds) {
        this.contactIds = contactIds;
    }

    public java.lang.Long getContactIds(int i) {
        return this.contactIds[i];
    }

    public void setContactIds(int i, java.lang.Long _value) {
        this.contactIds[i] = _value;
    }


    /**
     * Gets the exclude value for this WSOrgChartModelFilter.
     * 
     * @return exclude
     */
    public boolean isExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this WSOrgChartModelFilter.
     * 
     * @param exclude
     */
    public void setExclude(boolean exclude) {
        this.exclude = exclude;
    }


    /**
     * Gets the parentFieldName value for this WSOrgChartModelFilter.
     * 
     * @return parentFieldName
     */
    public java.lang.String getParentFieldName() {
        return parentFieldName;
    }


    /**
     * Sets the parentFieldName value for this WSOrgChartModelFilter.
     * 
     * @param parentFieldName
     */
    public void setParentFieldName(java.lang.String parentFieldName) {
        this.parentFieldName = parentFieldName;
    }


    /**
     * Gets the withRoot value for this WSOrgChartModelFilter.
     * 
     * @return withRoot
     */
    public boolean isWithRoot() {
        return withRoot;
    }


    /**
     * Sets the withRoot value for this WSOrgChartModelFilter.
     * 
     * @param withRoot
     */
    public void setWithRoot(boolean withRoot) {
        this.withRoot = withRoot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSOrgChartModelFilter)) return false;
        WSOrgChartModelFilter other = (WSOrgChartModelFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.childFieldName==null && other.getChildFieldName()==null) || 
             (this.childFieldName!=null &&
              this.childFieldName.equals(other.getChildFieldName()))) &&
            ((this.contactIds==null && other.getContactIds()==null) || 
             (this.contactIds!=null &&
              java.util.Arrays.equals(this.contactIds, other.getContactIds()))) &&
            this.exclude == other.isExclude() &&
            ((this.parentFieldName==null && other.getParentFieldName()==null) || 
             (this.parentFieldName!=null &&
              this.parentFieldName.equals(other.getParentFieldName()))) &&
            this.withRoot == other.isWithRoot();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getChildFieldName() != null) {
            _hashCode += getChildFieldName().hashCode();
        }
        if (getContactIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isExclude() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getParentFieldName() != null) {
            _hashCode += getParentFieldName().hashCode();
        }
        _hashCode += (isWithRoot() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSOrgChartModelFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSOrgChartModelFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "childFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withRoot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "withRoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
