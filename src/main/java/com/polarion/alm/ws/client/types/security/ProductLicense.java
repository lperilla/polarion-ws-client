/**
 * ProductLicense.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.polarion.alm.ws.client.types.security;

public class ProductLicense  implements java.io.Serializable {
    private com.polarion.alm.ws.client.types.security.LicenseInfo[] concurrentLicenseData;

    private java.lang.String customerCompany;

    private java.lang.String customerEmail;

    private java.lang.String customerName;

    private java.util.Calendar dateCreated;

    private java.util.Calendar expirationDate;

    private java.lang.String generatedBy;

    private java.lang.String ipAddress;

    private java.lang.String licenseFormat;

    private java.lang.String licenseProfile;

    private java.lang.String macAddress;

    private com.polarion.alm.ws.client.types.security.LicenseInfo[] namedLicenseData;

    public ProductLicense() {
    }

    public ProductLicense(
           com.polarion.alm.ws.client.types.security.LicenseInfo[] concurrentLicenseData,
           java.lang.String customerCompany,
           java.lang.String customerEmail,
           java.lang.String customerName,
           java.util.Calendar dateCreated,
           java.util.Calendar expirationDate,
           java.lang.String generatedBy,
           java.lang.String ipAddress,
           java.lang.String licenseFormat,
           java.lang.String licenseProfile,
           java.lang.String macAddress,
           com.polarion.alm.ws.client.types.security.LicenseInfo[] namedLicenseData) {
           this.concurrentLicenseData = concurrentLicenseData;
           this.customerCompany = customerCompany;
           this.customerEmail = customerEmail;
           this.customerName = customerName;
           this.dateCreated = dateCreated;
           this.expirationDate = expirationDate;
           this.generatedBy = generatedBy;
           this.ipAddress = ipAddress;
           this.licenseFormat = licenseFormat;
           this.licenseProfile = licenseProfile;
           this.macAddress = macAddress;
           this.namedLicenseData = namedLicenseData;
    }


    /**
     * Gets the concurrentLicenseData value for this ProductLicense.
     * 
     * @return concurrentLicenseData
     */
    public com.polarion.alm.ws.client.types.security.LicenseInfo[] getConcurrentLicenseData() {
        return concurrentLicenseData;
    }


    /**
     * Sets the concurrentLicenseData value for this ProductLicense.
     * 
     * @param concurrentLicenseData
     */
    public void setConcurrentLicenseData(com.polarion.alm.ws.client.types.security.LicenseInfo[] concurrentLicenseData) {
        this.concurrentLicenseData = concurrentLicenseData;
    }


    /**
     * Gets the customerCompany value for this ProductLicense.
     * 
     * @return customerCompany
     */
    public java.lang.String getCustomerCompany() {
        return customerCompany;
    }


    /**
     * Sets the customerCompany value for this ProductLicense.
     * 
     * @param customerCompany
     */
    public void setCustomerCompany(java.lang.String customerCompany) {
        this.customerCompany = customerCompany;
    }


    /**
     * Gets the customerEmail value for this ProductLicense.
     * 
     * @return customerEmail
     */
    public java.lang.String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this ProductLicense.
     * 
     * @param customerEmail
     */
    public void setCustomerEmail(java.lang.String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the customerName value for this ProductLicense.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this ProductLicense.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the dateCreated value for this ProductLicense.
     * 
     * @return dateCreated
     */
    public java.util.Calendar getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this ProductLicense.
     * 
     * @param dateCreated
     */
    public void setDateCreated(java.util.Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the expirationDate value for this ProductLicense.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this ProductLicense.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the generatedBy value for this ProductLicense.
     * 
     * @return generatedBy
     */
    public java.lang.String getGeneratedBy() {
        return generatedBy;
    }


    /**
     * Sets the generatedBy value for this ProductLicense.
     * 
     * @param generatedBy
     */
    public void setGeneratedBy(java.lang.String generatedBy) {
        this.generatedBy = generatedBy;
    }


    /**
     * Gets the ipAddress value for this ProductLicense.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this ProductLicense.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the licenseFormat value for this ProductLicense.
     * 
     * @return licenseFormat
     */
    public java.lang.String getLicenseFormat() {
        return licenseFormat;
    }


    /**
     * Sets the licenseFormat value for this ProductLicense.
     * 
     * @param licenseFormat
     */
    public void setLicenseFormat(java.lang.String licenseFormat) {
        this.licenseFormat = licenseFormat;
    }


    /**
     * Gets the licenseProfile value for this ProductLicense.
     * 
     * @return licenseProfile
     */
    public java.lang.String getLicenseProfile() {
        return licenseProfile;
    }


    /**
     * Sets the licenseProfile value for this ProductLicense.
     * 
     * @param licenseProfile
     */
    public void setLicenseProfile(java.lang.String licenseProfile) {
        this.licenseProfile = licenseProfile;
    }


    /**
     * Gets the macAddress value for this ProductLicense.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this ProductLicense.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }


    /**
     * Gets the namedLicenseData value for this ProductLicense.
     * 
     * @return namedLicenseData
     */
    public com.polarion.alm.ws.client.types.security.LicenseInfo[] getNamedLicenseData() {
        return namedLicenseData;
    }


    /**
     * Sets the namedLicenseData value for this ProductLicense.
     * 
     * @param namedLicenseData
     */
    public void setNamedLicenseData(com.polarion.alm.ws.client.types.security.LicenseInfo[] namedLicenseData) {
        this.namedLicenseData = namedLicenseData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductLicense)) return false;
        ProductLicense other = (ProductLicense) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.concurrentLicenseData==null && other.getConcurrentLicenseData()==null) || 
             (this.concurrentLicenseData!=null &&
              java.util.Arrays.equals(this.concurrentLicenseData, other.getConcurrentLicenseData()))) &&
            ((this.customerCompany==null && other.getCustomerCompany()==null) || 
             (this.customerCompany!=null &&
              this.customerCompany.equals(other.getCustomerCompany()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) || 
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.generatedBy==null && other.getGeneratedBy()==null) || 
             (this.generatedBy!=null &&
              this.generatedBy.equals(other.getGeneratedBy()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.licenseFormat==null && other.getLicenseFormat()==null) || 
             (this.licenseFormat!=null &&
              this.licenseFormat.equals(other.getLicenseFormat()))) &&
            ((this.licenseProfile==null && other.getLicenseProfile()==null) || 
             (this.licenseProfile!=null &&
              this.licenseProfile.equals(other.getLicenseProfile()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress()))) &&
            ((this.namedLicenseData==null && other.getNamedLicenseData()==null) || 
             (this.namedLicenseData!=null &&
              java.util.Arrays.equals(this.namedLicenseData, other.getNamedLicenseData())));
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
        if (getConcurrentLicenseData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConcurrentLicenseData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConcurrentLicenseData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerCompany() != null) {
            _hashCode += getCustomerCompany().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getGeneratedBy() != null) {
            _hashCode += getGeneratedBy().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getLicenseFormat() != null) {
            _hashCode += getLicenseFormat().hashCode();
        }
        if (getLicenseProfile() != null) {
            _hashCode += getLicenseProfile().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        if (getNamedLicenseData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedLicenseData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedLicenseData(), i);
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
        new org.apache.axis.description.TypeDesc(ProductLicense.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "ProductLicense"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrentLicenseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "concurrentLicenseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "LicenseInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "customerCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "customerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "generatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "licenseFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "licenseProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedLicenseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "namedLicenseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService-types", "LicenseInfo"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.polarion.com/SecurityWebService", "item"));
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
          new  com.polarion.alm.ws.client.internal.encoding.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
