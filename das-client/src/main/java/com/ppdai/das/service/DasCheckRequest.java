/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2020-06-18")
public class DasCheckRequest implements org.apache.thrift.TBase<DasCheckRequest, DasCheckRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DasCheckRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasCheckRequest");

  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("appId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DAS_CLIENT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("dasClientVersion", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PPDAI_CLIENT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("ppdaiClientVersion", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLIENT_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("clientAddress", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasCheckRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasCheckRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String appId; // required
  public @org.apache.thrift.annotation.Nullable String dasClientVersion; // required
  public @org.apache.thrift.annotation.Nullable String ppdaiClientVersion; // required
  public @org.apache.thrift.annotation.Nullable String clientAddress; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APP_ID((short)1, "appId"),
    DAS_CLIENT_VERSION((short)2, "dasClientVersion"),
    PPDAI_CLIENT_VERSION((short)3, "ppdaiClientVersion"),
    CLIENT_ADDRESS((short)4, "clientAddress");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // APP_ID
          return APP_ID;
        case 2: // DAS_CLIENT_VERSION
          return DAS_CLIENT_VERSION;
        case 3: // PPDAI_CLIENT_VERSION
          return PPDAI_CLIENT_VERSION;
        case 4: // CLIENT_ADDRESS
          return CLIENT_ADDRESS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DAS_CLIENT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("dasClientVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PPDAI_CLIENT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("ppdaiClientVersion", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLIENT_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("clientAddress", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasCheckRequest.class, metaDataMap);
  }

  public DasCheckRequest() {
  }

  public DasCheckRequest(
    String appId,
    String dasClientVersion,
    String ppdaiClientVersion,
    String clientAddress)
  {
    this();
    this.appId = appId;
    this.dasClientVersion = dasClientVersion;
    this.ppdaiClientVersion = ppdaiClientVersion;
    this.clientAddress = clientAddress;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasCheckRequest(DasCheckRequest other) {
    if (other.isSetAppId()) {
      this.appId = other.appId;
    }
    if (other.isSetDasClientVersion()) {
      this.dasClientVersion = other.dasClientVersion;
    }
    if (other.isSetPpdaiClientVersion()) {
      this.ppdaiClientVersion = other.ppdaiClientVersion;
    }
    if (other.isSetClientAddress()) {
      this.clientAddress = other.clientAddress;
    }
  }

  public DasCheckRequest deepCopy() {
    return new DasCheckRequest(this);
  }

  @Override
  public void clear() {
    this.appId = null;
    this.dasClientVersion = null;
    this.ppdaiClientVersion = null;
    this.clientAddress = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getAppId() {
    return this.appId;
  }

  public DasCheckRequest setAppId(@org.apache.thrift.annotation.Nullable String appId) {
    this.appId = appId;
    return this;
  }

  public void unsetAppId() {
    this.appId = null;
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return this.appId != null;
  }

  public void setAppIdIsSet(boolean value) {
    if (!value) {
      this.appId = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getDasClientVersion() {
    return this.dasClientVersion;
  }

  public DasCheckRequest setDasClientVersion(@org.apache.thrift.annotation.Nullable String dasClientVersion) {
    this.dasClientVersion = dasClientVersion;
    return this;
  }

  public void unsetDasClientVersion() {
    this.dasClientVersion = null;
  }

  /** Returns true if field dasClientVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetDasClientVersion() {
    return this.dasClientVersion != null;
  }

  public void setDasClientVersionIsSet(boolean value) {
    if (!value) {
      this.dasClientVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getPpdaiClientVersion() {
    return this.ppdaiClientVersion;
  }

  public DasCheckRequest setPpdaiClientVersion(@org.apache.thrift.annotation.Nullable String ppdaiClientVersion) {
    this.ppdaiClientVersion = ppdaiClientVersion;
    return this;
  }

  public void unsetPpdaiClientVersion() {
    this.ppdaiClientVersion = null;
  }

  /** Returns true if field ppdaiClientVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetPpdaiClientVersion() {
    return this.ppdaiClientVersion != null;
  }

  public void setPpdaiClientVersionIsSet(boolean value) {
    if (!value) {
      this.ppdaiClientVersion = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getClientAddress() {
    return this.clientAddress;
  }

  public DasCheckRequest setClientAddress(@org.apache.thrift.annotation.Nullable String clientAddress) {
    this.clientAddress = clientAddress;
    return this;
  }

  public void unsetClientAddress() {
    this.clientAddress = null;
  }

  /** Returns true if field clientAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetClientAddress() {
    return this.clientAddress != null;
  }

  public void setClientAddressIsSet(boolean value) {
    if (!value) {
      this.clientAddress = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((String)value);
      }
      break;

    case DAS_CLIENT_VERSION:
      if (value == null) {
        unsetDasClientVersion();
      } else {
        setDasClientVersion((String)value);
      }
      break;

    case PPDAI_CLIENT_VERSION:
      if (value == null) {
        unsetPpdaiClientVersion();
      } else {
        setPpdaiClientVersion((String)value);
      }
      break;

    case CLIENT_ADDRESS:
      if (value == null) {
        unsetClientAddress();
      } else {
        setClientAddress((String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case APP_ID:
      return getAppId();

    case DAS_CLIENT_VERSION:
      return getDasClientVersion();

    case PPDAI_CLIENT_VERSION:
      return getPpdaiClientVersion();

    case CLIENT_ADDRESS:
      return getClientAddress();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case APP_ID:
      return isSetAppId();
    case DAS_CLIENT_VERSION:
      return isSetDasClientVersion();
    case PPDAI_CLIENT_VERSION:
      return isSetPpdaiClientVersion();
    case CLIENT_ADDRESS:
      return isSetClientAddress();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DasCheckRequest)
      return this.equals((DasCheckRequest)that);
    return false;
  }

  public boolean equals(DasCheckRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_appId = true && this.isSetAppId();
    boolean that_present_appId = true && that.isSetAppId();
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (!this.appId.equals(that.appId))
        return false;
    }

    boolean this_present_dasClientVersion = true && this.isSetDasClientVersion();
    boolean that_present_dasClientVersion = true && that.isSetDasClientVersion();
    if (this_present_dasClientVersion || that_present_dasClientVersion) {
      if (!(this_present_dasClientVersion && that_present_dasClientVersion))
        return false;
      if (!this.dasClientVersion.equals(that.dasClientVersion))
        return false;
    }

    boolean this_present_ppdaiClientVersion = true && this.isSetPpdaiClientVersion();
    boolean that_present_ppdaiClientVersion = true && that.isSetPpdaiClientVersion();
    if (this_present_ppdaiClientVersion || that_present_ppdaiClientVersion) {
      if (!(this_present_ppdaiClientVersion && that_present_ppdaiClientVersion))
        return false;
      if (!this.ppdaiClientVersion.equals(that.ppdaiClientVersion))
        return false;
    }

    boolean this_present_clientAddress = true && this.isSetClientAddress();
    boolean that_present_clientAddress = true && that.isSetClientAddress();
    if (this_present_clientAddress || that_present_clientAddress) {
      if (!(this_present_clientAddress && that_present_clientAddress))
        return false;
      if (!this.clientAddress.equals(that.clientAddress))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAppId()) ? 131071 : 524287);
    if (isSetAppId())
      hashCode = hashCode * 8191 + appId.hashCode();

    hashCode = hashCode * 8191 + ((isSetDasClientVersion()) ? 131071 : 524287);
    if (isSetDasClientVersion())
      hashCode = hashCode * 8191 + dasClientVersion.hashCode();

    hashCode = hashCode * 8191 + ((isSetPpdaiClientVersion()) ? 131071 : 524287);
    if (isSetPpdaiClientVersion())
      hashCode = hashCode * 8191 + ppdaiClientVersion.hashCode();

    hashCode = hashCode * 8191 + ((isSetClientAddress()) ? 131071 : 524287);
    if (isSetClientAddress())
      hashCode = hashCode * 8191 + clientAddress.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasCheckRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDasClientVersion()).compareTo(other.isSetDasClientVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDasClientVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dasClientVersion, other.dasClientVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPpdaiClientVersion()).compareTo(other.isSetPpdaiClientVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPpdaiClientVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ppdaiClientVersion, other.ppdaiClientVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClientAddress()).compareTo(other.isSetClientAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientAddress, other.clientAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DasCheckRequest(");
    boolean first = true;

    sb.append("appId:");
    if (this.appId == null) {
      sb.append("null");
    } else {
      sb.append(this.appId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dasClientVersion:");
    if (this.dasClientVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.dasClientVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ppdaiClientVersion:");
    if (this.ppdaiClientVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.ppdaiClientVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("clientAddress:");
    if (this.clientAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.clientAddress);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (appId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'appId' was not present! Struct: " + toString());
    }
    if (dasClientVersion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dasClientVersion' was not present! Struct: " + toString());
    }
    if (ppdaiClientVersion == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ppdaiClientVersion' was not present! Struct: " + toString());
    }
    if (clientAddress == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'clientAddress' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DasCheckRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasCheckRequestStandardScheme getScheme() {
      return new DasCheckRequestStandardScheme();
    }
  }

  private static class DasCheckRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasCheckRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasCheckRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appId = iprot.readString();
              struct.setAppIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DAS_CLIENT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dasClientVersion = iprot.readString();
              struct.setDasClientVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PPDAI_CLIENT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ppdaiClientVersion = iprot.readString();
              struct.setPpdaiClientVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLIENT_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.clientAddress = iprot.readString();
              struct.setClientAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasCheckRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.appId != null) {
        oprot.writeFieldBegin(APP_ID_FIELD_DESC);
        oprot.writeString(struct.appId);
        oprot.writeFieldEnd();
      }
      if (struct.dasClientVersion != null) {
        oprot.writeFieldBegin(DAS_CLIENT_VERSION_FIELD_DESC);
        oprot.writeString(struct.dasClientVersion);
        oprot.writeFieldEnd();
      }
      if (struct.ppdaiClientVersion != null) {
        oprot.writeFieldBegin(PPDAI_CLIENT_VERSION_FIELD_DESC);
        oprot.writeString(struct.ppdaiClientVersion);
        oprot.writeFieldEnd();
      }
      if (struct.clientAddress != null) {
        oprot.writeFieldBegin(CLIENT_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.clientAddress);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasCheckRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasCheckRequestTupleScheme getScheme() {
      return new DasCheckRequestTupleScheme();
    }
  }

  private static class DasCheckRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasCheckRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasCheckRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.appId);
      oprot.writeString(struct.dasClientVersion);
      oprot.writeString(struct.ppdaiClientVersion);
      oprot.writeString(struct.clientAddress);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasCheckRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.appId = iprot.readString();
      struct.setAppIdIsSet(true);
      struct.dasClientVersion = iprot.readString();
      struct.setDasClientVersionIsSet(true);
      struct.ppdaiClientVersion = iprot.readString();
      struct.setPpdaiClientVersionIsSet(true);
      struct.clientAddress = iprot.readString();
      struct.setClientAddressIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

