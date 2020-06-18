/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2020-06-18")
public class DasDiagEntry implements org.apache.thrift.TBase<DasDiagEntry, DasDiagEntry._Fields>, java.io.Serializable, Cloneable, Comparable<DasDiagEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasDiagEntry");

  private static final org.apache.thrift.protocol.TField STAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("stage", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COST_FIELD_DESC = new org.apache.thrift.protocol.TField("cost", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CONTEXTS_FIELD_DESC = new org.apache.thrift.protocol.TField("contexts", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasDiagEntryStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasDiagEntryTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String stage; // required
  public long cost; // required
  public @org.apache.thrift.annotation.Nullable java.util.Map<String, String> contexts; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STAGE((short)1, "stage"),
    COST((short)2, "cost"),
    CONTEXTS((short)3, "contexts");

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
        case 1: // STAGE
          return STAGE;
        case 2: // COST
          return COST;
        case 3: // CONTEXTS
          return CONTEXTS;
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
  private static final int __COST_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CONTEXTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STAGE, new org.apache.thrift.meta_data.FieldMetaData("stage", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COST, new org.apache.thrift.meta_data.FieldMetaData("cost", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CONTEXTS, new org.apache.thrift.meta_data.FieldMetaData("contexts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasDiagEntry.class, metaDataMap);
  }

  public DasDiagEntry() {
  }

  public DasDiagEntry(
    String stage,
    long cost)
  {
    this();
    this.stage = stage;
    this.cost = cost;
    setCostIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasDiagEntry(DasDiagEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStage()) {
      this.stage = other.stage;
    }
    this.cost = other.cost;
    if (other.isSetContexts()) {
      java.util.Map<String, String> __this__contexts = new java.util.HashMap<String, String>(other.contexts);
      this.contexts = __this__contexts;
    }
  }

  public DasDiagEntry deepCopy() {
    return new DasDiagEntry(this);
  }

  @Override
  public void clear() {
    this.stage = null;
    setCostIsSet(false);
    this.cost = 0;
    this.contexts = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getStage() {
    return this.stage;
  }

  public DasDiagEntry setStage(@org.apache.thrift.annotation.Nullable String stage) {
    this.stage = stage;
    return this;
  }

  public void unsetStage() {
    this.stage = null;
  }

  /** Returns true if field stage is set (has been assigned a value) and false otherwise */
  public boolean isSetStage() {
    return this.stage != null;
  }

  public void setStageIsSet(boolean value) {
    if (!value) {
      this.stage = null;
    }
  }

  public long getCost() {
    return this.cost;
  }

  public DasDiagEntry setCost(long cost) {
    this.cost = cost;
    setCostIsSet(true);
    return this;
  }

  public void unsetCost() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COST_ISSET_ID);
  }

  /** Returns true if field cost is set (has been assigned a value) and false otherwise */
  public boolean isSetCost() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COST_ISSET_ID);
  }

  public void setCostIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COST_ISSET_ID, value);
  }

  public int getContextsSize() {
    return (this.contexts == null) ? 0 : this.contexts.size();
  }

  public void putToContexts(String key, String val) {
    if (this.contexts == null) {
      this.contexts = new java.util.HashMap<String, String>();
    }
    this.contexts.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<String, String> getContexts() {
    return this.contexts;
  }

  public DasDiagEntry setContexts(@org.apache.thrift.annotation.Nullable java.util.Map<String, String> contexts) {
    this.contexts = contexts;
    return this;
  }

  public void unsetContexts() {
    this.contexts = null;
  }

  /** Returns true if field contexts is set (has been assigned a value) and false otherwise */
  public boolean isSetContexts() {
    return this.contexts != null;
  }

  public void setContextsIsSet(boolean value) {
    if (!value) {
      this.contexts = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case STAGE:
      if (value == null) {
        unsetStage();
      } else {
        setStage((String)value);
      }
      break;

    case COST:
      if (value == null) {
        unsetCost();
      } else {
        setCost((Long)value);
      }
      break;

    case CONTEXTS:
      if (value == null) {
        unsetContexts();
      } else {
        setContexts((java.util.Map<String, String>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STAGE:
      return getStage();

    case COST:
      return getCost();

    case CONTEXTS:
      return getContexts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STAGE:
      return isSetStage();
    case COST:
      return isSetCost();
    case CONTEXTS:
      return isSetContexts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DasDiagEntry)
      return this.equals((DasDiagEntry)that);
    return false;
  }

  public boolean equals(DasDiagEntry that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_stage = true && this.isSetStage();
    boolean that_present_stage = true && that.isSetStage();
    if (this_present_stage || that_present_stage) {
      if (!(this_present_stage && that_present_stage))
        return false;
      if (!this.stage.equals(that.stage))
        return false;
    }

    boolean this_present_cost = true;
    boolean that_present_cost = true;
    if (this_present_cost || that_present_cost) {
      if (!(this_present_cost && that_present_cost))
        return false;
      if (this.cost != that.cost)
        return false;
    }

    boolean this_present_contexts = true && this.isSetContexts();
    boolean that_present_contexts = true && that.isSetContexts();
    if (this_present_contexts || that_present_contexts) {
      if (!(this_present_contexts && that_present_contexts))
        return false;
      if (!this.contexts.equals(that.contexts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStage()) ? 131071 : 524287);
    if (isSetStage())
      hashCode = hashCode * 8191 + stage.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(cost);

    hashCode = hashCode * 8191 + ((isSetContexts()) ? 131071 : 524287);
    if (isSetContexts())
      hashCode = hashCode * 8191 + contexts.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasDiagEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStage()).compareTo(other.isSetStage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stage, other.stage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCost()).compareTo(other.isSetCost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCost()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cost, other.cost);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContexts()).compareTo(other.isSetContexts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContexts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contexts, other.contexts);
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
    StringBuilder sb = new StringBuilder("DasDiagEntry(");
    boolean first = true;

    sb.append("stage:");
    if (this.stage == null) {
      sb.append("null");
    } else {
      sb.append(this.stage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cost:");
    sb.append(this.cost);
    first = false;
    if (isSetContexts()) {
      if (!first) sb.append(", ");
      sb.append("contexts:");
      if (this.contexts == null) {
        sb.append("null");
      } else {
        sb.append(this.contexts);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (stage == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stage' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'cost' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DasDiagEntryStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasDiagEntryStandardScheme getScheme() {
      return new DasDiagEntryStandardScheme();
    }
  }

  private static class DasDiagEntryStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasDiagEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasDiagEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stage = iprot.readString();
              struct.setStageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COST
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cost = iprot.readI64();
              struct.setCostIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTEXTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map166 = iprot.readMapBegin();
                struct.contexts = new java.util.HashMap<String, String>(2*_map166.size);
                @org.apache.thrift.annotation.Nullable String _key167;
                @org.apache.thrift.annotation.Nullable String _val168;
                for (int _i169 = 0; _i169 < _map166.size; ++_i169)
                {
                  _key167 = iprot.readString();
                  _val168 = iprot.readString();
                  struct.contexts.put(_key167, _val168);
                }
                iprot.readMapEnd();
              }
              struct.setContextsIsSet(true);
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
      if (!struct.isSetCost()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'cost' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasDiagEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stage != null) {
        oprot.writeFieldBegin(STAGE_FIELD_DESC);
        oprot.writeString(struct.stage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COST_FIELD_DESC);
      oprot.writeI64(struct.cost);
      oprot.writeFieldEnd();
      if (struct.contexts != null) {
        if (struct.isSetContexts()) {
          oprot.writeFieldBegin(CONTEXTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.contexts.size()));
            for (java.util.Map.Entry<String, String> _iter170 : struct.contexts.entrySet())
            {
              oprot.writeString(_iter170.getKey());
              oprot.writeString(_iter170.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasDiagEntryTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasDiagEntryTupleScheme getScheme() {
      return new DasDiagEntryTupleScheme();
    }
  }

  private static class DasDiagEntryTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasDiagEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasDiagEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.stage);
      oprot.writeI64(struct.cost);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetContexts()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetContexts()) {
        {
          oprot.writeI32(struct.contexts.size());
          for (java.util.Map.Entry<String, String> _iter171 : struct.contexts.entrySet())
          {
            oprot.writeString(_iter171.getKey());
            oprot.writeString(_iter171.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasDiagEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.stage = iprot.readString();
      struct.setStageIsSet(true);
      struct.cost = iprot.readI64();
      struct.setCostIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map172 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contexts = new java.util.HashMap<String, String>(2*_map172.size);
          @org.apache.thrift.annotation.Nullable String _key173;
          @org.apache.thrift.annotation.Nullable String _val174;
          for (int _i175 = 0; _i175 < _map172.size; ++_i175)
          {
            _key173 = iprot.readString();
            _val174 = iprot.readString();
            struct.contexts.put(_key173, _val174);
          }
        }
        struct.setContextsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

