/**
 * WSContactStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.keysurvey.api.v81.contact;

public class WSContactStatistics  implements java.io.Serializable {
    private java.util.Calendar dateLastActivity;

    private java.util.Calendar dateLastFinished;

    private java.util.Calendar dateLastInvited;

    private java.util.Calendar dateLastStarted;

    private java.math.BigDecimal maxPoints;

    private java.math.BigDecimal numFormsFinished;

    private java.math.BigDecimal numFormsInvitedTo;

    private java.math.BigDecimal numFormsStarted;

    private java.math.BigDecimal points;

    private java.math.BigDecimal score;

    private com.keysurvey.api.v81.contact.WSContactStatus status;

    public WSContactStatistics() {
    }

    public WSContactStatistics(
           java.util.Calendar dateLastActivity,
           java.util.Calendar dateLastFinished,
           java.util.Calendar dateLastInvited,
           java.util.Calendar dateLastStarted,
           java.math.BigDecimal maxPoints,
           java.math.BigDecimal numFormsFinished,
           java.math.BigDecimal numFormsInvitedTo,
           java.math.BigDecimal numFormsStarted,
           java.math.BigDecimal points,
           java.math.BigDecimal score,
           com.keysurvey.api.v81.contact.WSContactStatus status) {
           this.dateLastActivity = dateLastActivity;
           this.dateLastFinished = dateLastFinished;
           this.dateLastInvited = dateLastInvited;
           this.dateLastStarted = dateLastStarted;
           this.maxPoints = maxPoints;
           this.numFormsFinished = numFormsFinished;
           this.numFormsInvitedTo = numFormsInvitedTo;
           this.numFormsStarted = numFormsStarted;
           this.points = points;
           this.score = score;
           this.status = status;
    }


    /**
     * Gets the dateLastActivity value for this WSContactStatistics.
     * 
     * @return dateLastActivity
     */
    public java.util.Calendar getDateLastActivity() {
        return dateLastActivity;
    }


    /**
     * Sets the dateLastActivity value for this WSContactStatistics.
     * 
     * @param dateLastActivity
     */
    public void setDateLastActivity(java.util.Calendar dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }


    /**
     * Gets the dateLastFinished value for this WSContactStatistics.
     * 
     * @return dateLastFinished
     */
    public java.util.Calendar getDateLastFinished() {
        return dateLastFinished;
    }


    /**
     * Sets the dateLastFinished value for this WSContactStatistics.
     * 
     * @param dateLastFinished
     */
    public void setDateLastFinished(java.util.Calendar dateLastFinished) {
        this.dateLastFinished = dateLastFinished;
    }


    /**
     * Gets the dateLastInvited value for this WSContactStatistics.
     * 
     * @return dateLastInvited
     */
    public java.util.Calendar getDateLastInvited() {
        return dateLastInvited;
    }


    /**
     * Sets the dateLastInvited value for this WSContactStatistics.
     * 
     * @param dateLastInvited
     */
    public void setDateLastInvited(java.util.Calendar dateLastInvited) {
        this.dateLastInvited = dateLastInvited;
    }


    /**
     * Gets the dateLastStarted value for this WSContactStatistics.
     * 
     * @return dateLastStarted
     */
    public java.util.Calendar getDateLastStarted() {
        return dateLastStarted;
    }


    /**
     * Sets the dateLastStarted value for this WSContactStatistics.
     * 
     * @param dateLastStarted
     */
    public void setDateLastStarted(java.util.Calendar dateLastStarted) {
        this.dateLastStarted = dateLastStarted;
    }


    /**
     * Gets the maxPoints value for this WSContactStatistics.
     * 
     * @return maxPoints
     */
    public java.math.BigDecimal getMaxPoints() {
        return maxPoints;
    }


    /**
     * Sets the maxPoints value for this WSContactStatistics.
     * 
     * @param maxPoints
     */
    public void setMaxPoints(java.math.BigDecimal maxPoints) {
        this.maxPoints = maxPoints;
    }


    /**
     * Gets the numFormsFinished value for this WSContactStatistics.
     * 
     * @return numFormsFinished
     */
    public java.math.BigDecimal getNumFormsFinished() {
        return numFormsFinished;
    }


    /**
     * Sets the numFormsFinished value for this WSContactStatistics.
     * 
     * @param numFormsFinished
     */
    public void setNumFormsFinished(java.math.BigDecimal numFormsFinished) {
        this.numFormsFinished = numFormsFinished;
    }


    /**
     * Gets the numFormsInvitedTo value for this WSContactStatistics.
     * 
     * @return numFormsInvitedTo
     */
    public java.math.BigDecimal getNumFormsInvitedTo() {
        return numFormsInvitedTo;
    }


    /**
     * Sets the numFormsInvitedTo value for this WSContactStatistics.
     * 
     * @param numFormsInvitedTo
     */
    public void setNumFormsInvitedTo(java.math.BigDecimal numFormsInvitedTo) {
        this.numFormsInvitedTo = numFormsInvitedTo;
    }


    /**
     * Gets the numFormsStarted value for this WSContactStatistics.
     * 
     * @return numFormsStarted
     */
    public java.math.BigDecimal getNumFormsStarted() {
        return numFormsStarted;
    }


    /**
     * Sets the numFormsStarted value for this WSContactStatistics.
     * 
     * @param numFormsStarted
     */
    public void setNumFormsStarted(java.math.BigDecimal numFormsStarted) {
        this.numFormsStarted = numFormsStarted;
    }


    /**
     * Gets the points value for this WSContactStatistics.
     * 
     * @return points
     */
    public java.math.BigDecimal getPoints() {
        return points;
    }


    /**
     * Sets the points value for this WSContactStatistics.
     * 
     * @param points
     */
    public void setPoints(java.math.BigDecimal points) {
        this.points = points;
    }


    /**
     * Gets the score value for this WSContactStatistics.
     * 
     * @return score
     */
    public java.math.BigDecimal getScore() {
        return score;
    }


    /**
     * Sets the score value for this WSContactStatistics.
     * 
     * @param score
     */
    public void setScore(java.math.BigDecimal score) {
        this.score = score;
    }


    /**
     * Gets the status value for this WSContactStatistics.
     * 
     * @return status
     */
    public com.keysurvey.api.v81.contact.WSContactStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WSContactStatistics.
     * 
     * @param status
     */
    public void setStatus(com.keysurvey.api.v81.contact.WSContactStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSContactStatistics)) return false;
        WSContactStatistics other = (WSContactStatistics) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateLastActivity==null && other.getDateLastActivity()==null) || 
             (this.dateLastActivity!=null &&
              this.dateLastActivity.equals(other.getDateLastActivity()))) &&
            ((this.dateLastFinished==null && other.getDateLastFinished()==null) || 
             (this.dateLastFinished!=null &&
              this.dateLastFinished.equals(other.getDateLastFinished()))) &&
            ((this.dateLastInvited==null && other.getDateLastInvited()==null) || 
             (this.dateLastInvited!=null &&
              this.dateLastInvited.equals(other.getDateLastInvited()))) &&
            ((this.dateLastStarted==null && other.getDateLastStarted()==null) || 
             (this.dateLastStarted!=null &&
              this.dateLastStarted.equals(other.getDateLastStarted()))) &&
            ((this.maxPoints==null && other.getMaxPoints()==null) || 
             (this.maxPoints!=null &&
              this.maxPoints.equals(other.getMaxPoints()))) &&
            ((this.numFormsFinished==null && other.getNumFormsFinished()==null) || 
             (this.numFormsFinished!=null &&
              this.numFormsFinished.equals(other.getNumFormsFinished()))) &&
            ((this.numFormsInvitedTo==null && other.getNumFormsInvitedTo()==null) || 
             (this.numFormsInvitedTo!=null &&
              this.numFormsInvitedTo.equals(other.getNumFormsInvitedTo()))) &&
            ((this.numFormsStarted==null && other.getNumFormsStarted()==null) || 
             (this.numFormsStarted!=null &&
              this.numFormsStarted.equals(other.getNumFormsStarted()))) &&
            ((this.points==null && other.getPoints()==null) || 
             (this.points!=null &&
              this.points.equals(other.getPoints()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getDateLastActivity() != null) {
            _hashCode += getDateLastActivity().hashCode();
        }
        if (getDateLastFinished() != null) {
            _hashCode += getDateLastFinished().hashCode();
        }
        if (getDateLastInvited() != null) {
            _hashCode += getDateLastInvited().hashCode();
        }
        if (getDateLastStarted() != null) {
            _hashCode += getDateLastStarted().hashCode();
        }
        if (getMaxPoints() != null) {
            _hashCode += getMaxPoints().hashCode();
        }
        if (getNumFormsFinished() != null) {
            _hashCode += getNumFormsFinished().hashCode();
        }
        if (getNumFormsInvitedTo() != null) {
            _hashCode += getNumFormsInvitedTo().hashCode();
        }
        if (getNumFormsStarted() != null) {
            _hashCode += getNumFormsStarted().hashCode();
        }
        if (getPoints() != null) {
            _hashCode += getPoints().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSContactStatistics.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactStatistics"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastActivity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastActivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastFinished");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastFinished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastInvited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastInvited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLastStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateLastStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFormsFinished");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numFormsFinished"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFormsInvitedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numFormsInvitedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFormsStarted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numFormsStarted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("", "points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://contact.v81.api.keysurvey.com", "WSContactStatus"));
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
