/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.gov.saude.esusab.ras.common;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2020-11-10")
public class ResultadoExameThrift implements org.apache.thrift.TBase<ResultadoExameThrift, ResultadoExameThrift._Fields>, java.io.Serializable, Cloneable, Comparable<ResultadoExameThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ResultadoExameThrift");

  private static final org.apache.thrift.protocol.TField TIPO_RESULTADO_FIELD_DESC = new org.apache.thrift.protocol.TField("tipoResultado", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField VALOR_RESULTADO_FIELD_DESC = new org.apache.thrift.protocol.TField("valorResultado", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResultadoExameThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResultadoExameThriftTupleSchemeFactory());
  }

  private int tipoResultado; // optional
  private String valorResultado; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIPO_RESULTADO((short)1, "tipoResultado"),
    VALOR_RESULTADO((short)2, "valorResultado");

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
        case 1: // TIPO_RESULTADO
          return TIPO_RESULTADO;
        case 2: // VALOR_RESULTADO
          return VALOR_RESULTADO;
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
  private static final int __TIPORESULTADO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIPO_RESULTADO,_Fields.VALOR_RESULTADO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIPO_RESULTADO, new org.apache.thrift.meta_data.FieldMetaData("tipoResultado", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALOR_RESULTADO, new org.apache.thrift.meta_data.FieldMetaData("valorResultado", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ResultadoExameThrift.class, metaDataMap);
  }

  public ResultadoExameThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ResultadoExameThrift(ResultadoExameThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tipoResultado = other.tipoResultado;
    if (other.isSetValorResultado()) {
      this.valorResultado = other.valorResultado;
    }
  }

  public ResultadoExameThrift deepCopy() {
    return new ResultadoExameThrift(this);
  }

  @Override
  public void clear() {
    setTipoResultadoIsSet(false);
    this.tipoResultado = 0;
    this.valorResultado = null;
  }

  public int getTipoResultado() {
    return this.tipoResultado;
  }

  public void setTipoResultado(int tipoResultado) {
    this.tipoResultado = tipoResultado;
    setTipoResultadoIsSet(true);
  }

  public void unsetTipoResultado() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIPORESULTADO_ISSET_ID);
  }

  /** Returns true if field tipoResultado is set (has been assigned a value) and false otherwise */
  public boolean isSetTipoResultado() {
    return EncodingUtils.testBit(__isset_bitfield, __TIPORESULTADO_ISSET_ID);
  }

  public void setTipoResultadoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIPORESULTADO_ISSET_ID, value);
  }

  public String getValorResultado() {
    return this.valorResultado;
  }

  public void setValorResultado(String valorResultado) {
    this.valorResultado = valorResultado;
  }

  public void unsetValorResultado() {
    this.valorResultado = null;
  }

  /** Returns true if field valorResultado is set (has been assigned a value) and false otherwise */
  public boolean isSetValorResultado() {
    return this.valorResultado != null;
  }

  public void setValorResultadoIsSet(boolean value) {
    if (!value) {
      this.valorResultado = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIPO_RESULTADO:
      if (value == null) {
        unsetTipoResultado();
      } else {
        setTipoResultado((Integer)value);
      }
      break;

    case VALOR_RESULTADO:
      if (value == null) {
        unsetValorResultado();
      } else {
        setValorResultado((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIPO_RESULTADO:
      return getTipoResultado();

    case VALOR_RESULTADO:
      return getValorResultado();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIPO_RESULTADO:
      return isSetTipoResultado();
    case VALOR_RESULTADO:
      return isSetValorResultado();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ResultadoExameThrift)
      return this.equals((ResultadoExameThrift)that);
    return false;
  }

  public boolean equals(ResultadoExameThrift that) {
    if (that == null)
      return false;

    boolean this_present_tipoResultado = true && this.isSetTipoResultado();
    boolean that_present_tipoResultado = true && that.isSetTipoResultado();
    if (this_present_tipoResultado || that_present_tipoResultado) {
      if (!(this_present_tipoResultado && that_present_tipoResultado))
        return false;
      if (this.tipoResultado != that.tipoResultado)
        return false;
    }

    boolean this_present_valorResultado = true && this.isSetValorResultado();
    boolean that_present_valorResultado = true && that.isSetValorResultado();
    if (this_present_valorResultado || that_present_valorResultado) {
      if (!(this_present_valorResultado && that_present_valorResultado))
        return false;
      if (!this.valorResultado.equals(that.valorResultado))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tipoResultado = true && (isSetTipoResultado());
    list.add(present_tipoResultado);
    if (present_tipoResultado)
      list.add(tipoResultado);

    boolean present_valorResultado = true && (isSetValorResultado());
    list.add(present_valorResultado);
    if (present_valorResultado)
      list.add(valorResultado);

    return list.hashCode();
  }

  @Override
  public int compareTo(ResultadoExameThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTipoResultado()).compareTo(other.isSetTipoResultado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTipoResultado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tipoResultado, other.tipoResultado);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValorResultado()).compareTo(other.isSetValorResultado());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValorResultado()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.valorResultado, other.valorResultado);
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
    StringBuilder sb = new StringBuilder("ResultadoExameThrift(");
    boolean first = true;

    if (isSetTipoResultado()) {
      sb.append("tipoResultado:");
      sb.append(this.tipoResultado);
      first = false;
    }
    if (isSetValorResultado()) {
      if (!first) sb.append(", ");
      sb.append("valorResultado:");
      if (this.valorResultado == null) {
        sb.append("null");
      } else {
        sb.append(this.valorResultado);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class ResultadoExameThriftStandardSchemeFactory implements SchemeFactory {
    public ResultadoExameThriftStandardScheme getScheme() {
      return new ResultadoExameThriftStandardScheme();
    }
  }

  private static class ResultadoExameThriftStandardScheme extends StandardScheme<ResultadoExameThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ResultadoExameThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIPO_RESULTADO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tipoResultado = iprot.readI32();
              struct.setTipoResultadoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALOR_RESULTADO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.valorResultado = iprot.readString();
              struct.setValorResultadoIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ResultadoExameThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTipoResultado()) {
        oprot.writeFieldBegin(TIPO_RESULTADO_FIELD_DESC);
        oprot.writeI32(struct.tipoResultado);
        oprot.writeFieldEnd();
      }
      if (struct.valorResultado != null) {
        if (struct.isSetValorResultado()) {
          oprot.writeFieldBegin(VALOR_RESULTADO_FIELD_DESC);
          oprot.writeString(struct.valorResultado);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResultadoExameThriftTupleSchemeFactory implements SchemeFactory {
    public ResultadoExameThriftTupleScheme getScheme() {
      return new ResultadoExameThriftTupleScheme();
    }
  }

  private static class ResultadoExameThriftTupleScheme extends TupleScheme<ResultadoExameThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ResultadoExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTipoResultado()) {
        optionals.set(0);
      }
      if (struct.isSetValorResultado()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTipoResultado()) {
        oprot.writeI32(struct.tipoResultado);
      }
      if (struct.isSetValorResultado()) {
        oprot.writeString(struct.valorResultado);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ResultadoExameThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.tipoResultado = iprot.readI32();
        struct.setTipoResultadoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.valorResultado = iprot.readString();
        struct.setValorResultadoIsSet(true);
      }
    }
  }

}

