/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tim.packet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-05")
public class TimRemoteUserBean implements org.apache.thrift.TBase<TimRemoteUserBean, TimRemoteUserBean._Fields>, java.io.Serializable, Cloneable, Comparable<TimRemoteUserBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimRemoteUserBean");

  private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField("error", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField UB_FIELD_DESC = new org.apache.thrift.protocol.TField("ub", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimRemoteUserBeanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimRemoteUserBeanTupleSchemeFactory());
  }

  /**
   * 错误码
   */
  public TimError error; // optional
  /**
   * 远程用户信息
   */
  public TimUserBean ub; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 错误码
     */
    ERROR((short)1, "error"),
    /**
     * 远程用户信息
     */
    UB((short)2, "ub"),
    EXTRA_MAP((short)3, "extraMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR
          return ERROR;
        case 2: // UB
          return UB;
        case 3: // EXTRA_MAP
          return EXTRA_MAP;
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
  private static final _Fields optionals[] = {_Fields.ERROR,_Fields.UB,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimError.class)));
    tmpMap.put(_Fields.UB, new org.apache.thrift.meta_data.FieldMetaData("ub", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimUserBean.class)));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimRemoteUserBean.class, metaDataMap);
  }

  public TimRemoteUserBean() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimRemoteUserBean(TimRemoteUserBean other) {
    if (other.isSetError()) {
      this.error = new TimError(other.error);
    }
    if (other.isSetUb()) {
      this.ub = new TimUserBean(other.ub);
    }
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>(other.extraMap);
      this.extraMap = __this__extraMap;
    }
  }

  public TimRemoteUserBean deepCopy() {
    return new TimRemoteUserBean(this);
  }

  @Override
  public void clear() {
    this.error = null;
    this.ub = null;
    this.extraMap = null;
  }

  /**
   * 错误码
   */
  public TimError getError() {
    return this.error;
  }

  /**
   * 错误码
   */
  public TimRemoteUserBean setError(TimError error) {
    this.error = error;
    return this;
  }

  public void unsetError() {
    this.error = null;
  }

  /** Returns true if field error is set (has been assigned a value) and false otherwise */
  public boolean isSetError() {
    return this.error != null;
  }

  public void setErrorIsSet(boolean value) {
    if (!value) {
      this.error = null;
    }
  }

  /**
   * 远程用户信息
   */
  public TimUserBean getUb() {
    return this.ub;
  }

  /**
   * 远程用户信息
   */
  public TimRemoteUserBean setUb(TimUserBean ub) {
    this.ub = ub;
    return this;
  }

  public void unsetUb() {
    this.ub = null;
  }

  /** Returns true if field ub is set (has been assigned a value) and false otherwise */
  public boolean isSetUb() {
    return this.ub != null;
  }

  public void setUbIsSet(boolean value) {
    if (!value) {
      this.ub = null;
    }
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public TimRemoteUserBean setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR:
      if (value == null) {
        unsetError();
      } else {
        setError((TimError)value);
      }
      break;

    case UB:
      if (value == null) {
        unsetUb();
      } else {
        setUb((TimUserBean)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR:
      return getError();

    case UB:
      return getUb();

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR:
      return isSetError();
    case UB:
      return isSetUb();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimRemoteUserBean)
      return this.equals((TimRemoteUserBean)that);
    return false;
  }

  public boolean equals(TimRemoteUserBean that) {
    if (that == null)
      return false;

    boolean this_present_error = true && this.isSetError();
    boolean that_present_error = true && that.isSetError();
    if (this_present_error || that_present_error) {
      if (!(this_present_error && that_present_error))
        return false;
      if (!this.error.equals(that.error))
        return false;
    }

    boolean this_present_ub = true && this.isSetUb();
    boolean that_present_ub = true && that.isSetUb();
    if (this_present_ub || that_present_ub) {
      if (!(this_present_ub && that_present_ub))
        return false;
      if (!this.ub.equals(that.ub))
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_error = true && (isSetError());
    list.add(present_error);
    if (present_error)
      list.add(error);

    boolean present_ub = true && (isSetUb());
    list.add(present_ub);
    if (present_ub)
      list.add(ub);

    boolean present_extraMap = true && (isSetExtraMap());
    list.add(present_extraMap);
    if (present_extraMap)
      list.add(extraMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimRemoteUserBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUb()).compareTo(other.isSetUb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ub, other.ub);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(other.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, other.extraMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimRemoteUserBean(");
    boolean first = true;

    if (isSetError()) {
      sb.append("error:");
      if (this.error == null) {
        sb.append("null");
      } else {
        sb.append(this.error);
      }
      first = false;
    }
    if (isSetUb()) {
      if (!first) sb.append(", ");
      sb.append("ub:");
      if (this.ub == null) {
        sb.append("null");
      } else {
        sb.append(this.ub);
      }
      first = false;
    }
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (error != null) {
      error.validate();
    }
    if (ub != null) {
      ub.validate();
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

  private static class TimRemoteUserBeanStandardSchemeFactory implements SchemeFactory {
    public TimRemoteUserBeanStandardScheme getScheme() {
      return new TimRemoteUserBeanStandardScheme();
    }
  }

  private static class TimRemoteUserBeanStandardScheme extends StandardScheme<TimRemoteUserBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimRemoteUserBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.error = new TimError();
              struct.error.read(iprot);
              struct.setErrorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ub = new TimUserBean();
              struct.ub.read(iprot);
              struct.setUbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map196 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map196.size);
                String _key197;
                String _val198;
                for (int _i199 = 0; _i199 < _map196.size; ++_i199)
                {
                  _key197 = iprot.readString();
                  _val198 = iprot.readString();
                  struct.extraMap.put(_key197, _val198);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimRemoteUserBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.error != null) {
        if (struct.isSetError()) {
          oprot.writeFieldBegin(ERROR_FIELD_DESC);
          struct.error.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ub != null) {
        if (struct.isSetUb()) {
          oprot.writeFieldBegin(UB_FIELD_DESC);
          struct.ub.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter200 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter200.getKey());
              oprot.writeString(_iter200.getValue());
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

  private static class TimRemoteUserBeanTupleSchemeFactory implements SchemeFactory {
    public TimRemoteUserBeanTupleScheme getScheme() {
      return new TimRemoteUserBeanTupleScheme();
    }
  }

  private static class TimRemoteUserBeanTupleScheme extends TupleScheme<TimRemoteUserBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimRemoteUserBean struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetError()) {
        optionals.set(0);
      }
      if (struct.isSetUb()) {
        optionals.set(1);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetError()) {
        struct.error.write(oprot);
      }
      if (struct.isSetUb()) {
        struct.ub.write(oprot);
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter201 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter201.getKey());
            oprot.writeString(_iter201.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimRemoteUserBean struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.error = new TimError();
        struct.error.read(iprot);
        struct.setErrorIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ub = new TimUserBean();
        struct.ub.read(iprot);
        struct.setUbIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map202 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map202.size);
          String _key203;
          String _val204;
          for (int _i205 = 0; _i205 < _map202.size; ++_i205)
          {
            _key203 = iprot.readString();
            _val204 = iprot.readString();
            struct.extraMap.put(_key203, _val204);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

