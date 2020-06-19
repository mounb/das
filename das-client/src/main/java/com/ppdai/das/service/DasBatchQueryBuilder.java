/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ppdai.das.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2020-06-19")
public class DasBatchQueryBuilder implements org.apache.thrift.TBase<DasBatchQueryBuilder, DasBatchQueryBuilder._Fields>, java.io.Serializable, Cloneable, Comparable<DasBatchQueryBuilder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DasBatchQueryBuilder");

  private static final org.apache.thrift.protocol.TField SQL_BUILDERS_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlBuilders", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ENTITY_META_FIELD_DESC = new org.apache.thrift.protocol.TField("entityMeta", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DasBatchQueryBuilderStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DasBatchQueryBuilderTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<DasSqlBuilder> sqlBuilders; // optional
  public @org.apache.thrift.annotation.Nullable EntityMeta entityMeta; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQL_BUILDERS((short)1, "sqlBuilders"),
    ENTITY_META((short)2, "entityMeta");

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
        case 1: // SQL_BUILDERS
          return SQL_BUILDERS;
        case 2: // ENTITY_META
          return ENTITY_META;
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
  private static final _Fields optionals[] = {_Fields.SQL_BUILDERS,_Fields.ENTITY_META};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQL_BUILDERS, new org.apache.thrift.meta_data.FieldMetaData("sqlBuilders", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DasSqlBuilder.class))));
    tmpMap.put(_Fields.ENTITY_META, new org.apache.thrift.meta_data.FieldMetaData("entityMeta", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EntityMeta.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DasBatchQueryBuilder.class, metaDataMap);
  }

  public DasBatchQueryBuilder() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DasBatchQueryBuilder(DasBatchQueryBuilder other) {
    if (other.isSetSqlBuilders()) {
      java.util.List<DasSqlBuilder> __this__sqlBuilders = new java.util.ArrayList<DasSqlBuilder>(other.sqlBuilders.size());
      for (DasSqlBuilder other_element : other.sqlBuilders) {
        __this__sqlBuilders.add(new DasSqlBuilder(other_element));
      }
      this.sqlBuilders = __this__sqlBuilders;
    }
    if (other.isSetEntityMeta()) {
      this.entityMeta = new EntityMeta(other.entityMeta);
    }
  }

  public DasBatchQueryBuilder deepCopy() {
    return new DasBatchQueryBuilder(this);
  }

  @Override
  public void clear() {
    this.sqlBuilders = null;
    this.entityMeta = null;
  }

  public int getSqlBuildersSize() {
    return (this.sqlBuilders == null) ? 0 : this.sqlBuilders.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<DasSqlBuilder> getSqlBuildersIterator() {
    return (this.sqlBuilders == null) ? null : this.sqlBuilders.iterator();
  }

  public void addToSqlBuilders(DasSqlBuilder elem) {
    if (this.sqlBuilders == null) {
      this.sqlBuilders = new java.util.ArrayList<DasSqlBuilder>();
    }
    this.sqlBuilders.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<DasSqlBuilder> getSqlBuilders() {
    return this.sqlBuilders;
  }

  public DasBatchQueryBuilder setSqlBuilders(@org.apache.thrift.annotation.Nullable java.util.List<DasSqlBuilder> sqlBuilders) {
    this.sqlBuilders = sqlBuilders;
    return this;
  }

  public void unsetSqlBuilders() {
    this.sqlBuilders = null;
  }

  /** Returns true if field sqlBuilders is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlBuilders() {
    return this.sqlBuilders != null;
  }

  public void setSqlBuildersIsSet(boolean value) {
    if (!value) {
      this.sqlBuilders = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public EntityMeta getEntityMeta() {
    return this.entityMeta;
  }

  public DasBatchQueryBuilder setEntityMeta(@org.apache.thrift.annotation.Nullable EntityMeta entityMeta) {
    this.entityMeta = entityMeta;
    return this;
  }

  public void unsetEntityMeta() {
    this.entityMeta = null;
  }

  /** Returns true if field entityMeta is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityMeta() {
    return this.entityMeta != null;
  }

  public void setEntityMetaIsSet(boolean value) {
    if (!value) {
      this.entityMeta = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case SQL_BUILDERS:
      if (value == null) {
        unsetSqlBuilders();
      } else {
        setSqlBuilders((java.util.List<DasSqlBuilder>)value);
      }
      break;

    case ENTITY_META:
      if (value == null) {
        unsetEntityMeta();
      } else {
        setEntityMeta((EntityMeta)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SQL_BUILDERS:
      return getSqlBuilders();

    case ENTITY_META:
      return getEntityMeta();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SQL_BUILDERS:
      return isSetSqlBuilders();
    case ENTITY_META:
      return isSetEntityMeta();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DasBatchQueryBuilder)
      return this.equals((DasBatchQueryBuilder)that);
    return false;
  }

  public boolean equals(DasBatchQueryBuilder that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sqlBuilders = true && this.isSetSqlBuilders();
    boolean that_present_sqlBuilders = true && that.isSetSqlBuilders();
    if (this_present_sqlBuilders || that_present_sqlBuilders) {
      if (!(this_present_sqlBuilders && that_present_sqlBuilders))
        return false;
      if (!this.sqlBuilders.equals(that.sqlBuilders))
        return false;
    }

    boolean this_present_entityMeta = true && this.isSetEntityMeta();
    boolean that_present_entityMeta = true && that.isSetEntityMeta();
    if (this_present_entityMeta || that_present_entityMeta) {
      if (!(this_present_entityMeta && that_present_entityMeta))
        return false;
      if (!this.entityMeta.equals(that.entityMeta))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSqlBuilders()) ? 131071 : 524287);
    if (isSetSqlBuilders())
      hashCode = hashCode * 8191 + sqlBuilders.hashCode();

    hashCode = hashCode * 8191 + ((isSetEntityMeta()) ? 131071 : 524287);
    if (isSetEntityMeta())
      hashCode = hashCode * 8191 + entityMeta.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DasBatchQueryBuilder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSqlBuilders()).compareTo(other.isSetSqlBuilders());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlBuilders()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlBuilders, other.sqlBuilders);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityMeta()).compareTo(other.isSetEntityMeta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityMeta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityMeta, other.entityMeta);
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
    StringBuilder sb = new StringBuilder("DasBatchQueryBuilder(");
    boolean first = true;

    if (isSetSqlBuilders()) {
      sb.append("sqlBuilders:");
      if (this.sqlBuilders == null) {
        sb.append("null");
      } else {
        sb.append(this.sqlBuilders);
      }
      first = false;
    }
    if (isSetEntityMeta()) {
      if (!first) sb.append(", ");
      sb.append("entityMeta:");
      if (this.entityMeta == null) {
        sb.append("null");
      } else {
        sb.append(this.entityMeta);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (entityMeta != null) {
      entityMeta.validate();
    }
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

  private static class DasBatchQueryBuilderStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasBatchQueryBuilderStandardScheme getScheme() {
      return new DasBatchQueryBuilderStandardScheme();
    }
  }

  private static class DasBatchQueryBuilderStandardScheme extends org.apache.thrift.scheme.StandardScheme<DasBatchQueryBuilder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DasBatchQueryBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQL_BUILDERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list118 = iprot.readListBegin();
                struct.sqlBuilders = new java.util.ArrayList<DasSqlBuilder>(_list118.size);
                @org.apache.thrift.annotation.Nullable DasSqlBuilder _elem119;
                for (int _i120 = 0; _i120 < _list118.size; ++_i120)
                {
                  _elem119 = new DasSqlBuilder();
                  _elem119.read(iprot);
                  struct.sqlBuilders.add(_elem119);
                }
                iprot.readListEnd();
              }
              struct.setSqlBuildersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTITY_META
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entityMeta = new EntityMeta();
              struct.entityMeta.read(iprot);
              struct.setEntityMetaIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DasBatchQueryBuilder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sqlBuilders != null) {
        if (struct.isSetSqlBuilders()) {
          oprot.writeFieldBegin(SQL_BUILDERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sqlBuilders.size()));
            for (DasSqlBuilder _iter121 : struct.sqlBuilders)
            {
              _iter121.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.entityMeta != null) {
        if (struct.isSetEntityMeta()) {
          oprot.writeFieldBegin(ENTITY_META_FIELD_DESC);
          struct.entityMeta.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DasBatchQueryBuilderTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DasBatchQueryBuilderTupleScheme getScheme() {
      return new DasBatchQueryBuilderTupleScheme();
    }
  }

  private static class DasBatchQueryBuilderTupleScheme extends org.apache.thrift.scheme.TupleScheme<DasBatchQueryBuilder> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DasBatchQueryBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSqlBuilders()) {
        optionals.set(0);
      }
      if (struct.isSetEntityMeta()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSqlBuilders()) {
        {
          oprot.writeI32(struct.sqlBuilders.size());
          for (DasSqlBuilder _iter122 : struct.sqlBuilders)
          {
            _iter122.write(oprot);
          }
        }
      }
      if (struct.isSetEntityMeta()) {
        struct.entityMeta.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DasBatchQueryBuilder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list123 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sqlBuilders = new java.util.ArrayList<DasSqlBuilder>(_list123.size);
          @org.apache.thrift.annotation.Nullable DasSqlBuilder _elem124;
          for (int _i125 = 0; _i125 < _list123.size; ++_i125)
          {
            _elem124 = new DasSqlBuilder();
            _elem124.read(iprot);
            struct.sqlBuilders.add(_elem124);
          }
        }
        struct.setSqlBuildersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.entityMeta = new EntityMeta();
        struct.entityMeta.read(iprot);
        struct.setEntityMetaIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

