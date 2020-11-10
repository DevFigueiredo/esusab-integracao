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
public class EncaminhamentoExternoThrift implements org.apache.thrift.TBase<EncaminhamentoExternoThrift, EncaminhamentoExternoThrift._Fields>, java.io.Serializable, Cloneable, Comparable<EncaminhamentoExternoThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EncaminhamentoExternoThrift");

  private static final org.apache.thrift.protocol.TField ESPECIALIDADE_FIELD_DESC = new org.apache.thrift.protocol.TField("especialidade", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField HIPOTESE_DIAGNOSTICO_CID10_FIELD_DESC = new org.apache.thrift.protocol.TField("hipoteseDiagnosticoCid10", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HIPOTESE_DIAGNOSTICO_CIAP2_FIELD_DESC = new org.apache.thrift.protocol.TField("hipoteseDiagnosticoCiap2", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CLASSIFICACAO_RISCO_FIELD_DESC = new org.apache.thrift.protocol.TField("classificacaoRisco", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EncaminhamentoExternoThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EncaminhamentoExternoThriftTupleSchemeFactory());
  }

  private long especialidade; // optional
  private String hipoteseDiagnosticoCid10; // optional
  private String hipoteseDiagnosticoCiap2; // optional
  private long classificacaoRisco; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ESPECIALIDADE((short)1, "especialidade"),
    HIPOTESE_DIAGNOSTICO_CID10((short)2, "hipoteseDiagnosticoCid10"),
    HIPOTESE_DIAGNOSTICO_CIAP2((short)3, "hipoteseDiagnosticoCiap2"),
    CLASSIFICACAO_RISCO((short)4, "classificacaoRisco");

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
        case 1: // ESPECIALIDADE
          return ESPECIALIDADE;
        case 2: // HIPOTESE_DIAGNOSTICO_CID10
          return HIPOTESE_DIAGNOSTICO_CID10;
        case 3: // HIPOTESE_DIAGNOSTICO_CIAP2
          return HIPOTESE_DIAGNOSTICO_CIAP2;
        case 4: // CLASSIFICACAO_RISCO
          return CLASSIFICACAO_RISCO;
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
  private static final int __ESPECIALIDADE_ISSET_ID = 0;
  private static final int __CLASSIFICACAORISCO_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ESPECIALIDADE,_Fields.HIPOTESE_DIAGNOSTICO_CID10,_Fields.HIPOTESE_DIAGNOSTICO_CIAP2,_Fields.CLASSIFICACAO_RISCO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ESPECIALIDADE, new org.apache.thrift.meta_data.FieldMetaData("especialidade", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HIPOTESE_DIAGNOSTICO_CID10, new org.apache.thrift.meta_data.FieldMetaData("hipoteseDiagnosticoCid10", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HIPOTESE_DIAGNOSTICO_CIAP2, new org.apache.thrift.meta_data.FieldMetaData("hipoteseDiagnosticoCiap2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLASSIFICACAO_RISCO, new org.apache.thrift.meta_data.FieldMetaData("classificacaoRisco", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EncaminhamentoExternoThrift.class, metaDataMap);
  }

  public EncaminhamentoExternoThrift() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EncaminhamentoExternoThrift(EncaminhamentoExternoThrift other) {
    __isset_bitfield = other.__isset_bitfield;
    this.especialidade = other.especialidade;
    if (other.isSetHipoteseDiagnosticoCid10()) {
      this.hipoteseDiagnosticoCid10 = other.hipoteseDiagnosticoCid10;
    }
    if (other.isSetHipoteseDiagnosticoCiap2()) {
      this.hipoteseDiagnosticoCiap2 = other.hipoteseDiagnosticoCiap2;
    }
    this.classificacaoRisco = other.classificacaoRisco;
  }

  public EncaminhamentoExternoThrift deepCopy() {
    return new EncaminhamentoExternoThrift(this);
  }

  @Override
  public void clear() {
    setEspecialidadeIsSet(false);
    this.especialidade = 0;
    this.hipoteseDiagnosticoCid10 = null;
    this.hipoteseDiagnosticoCiap2 = null;
    setClassificacaoRiscoIsSet(false);
    this.classificacaoRisco = 0;
  }

  public long getEspecialidade() {
    return this.especialidade;
  }

  public void setEspecialidade(long especialidade) {
    this.especialidade = especialidade;
    setEspecialidadeIsSet(true);
  }

  public void unsetEspecialidade() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ESPECIALIDADE_ISSET_ID);
  }

  /** Returns true if field especialidade is set (has been assigned a value) and false otherwise */
  public boolean isSetEspecialidade() {
    return EncodingUtils.testBit(__isset_bitfield, __ESPECIALIDADE_ISSET_ID);
  }

  public void setEspecialidadeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ESPECIALIDADE_ISSET_ID, value);
  }

  public String getHipoteseDiagnosticoCid10() {
    return this.hipoteseDiagnosticoCid10;
  }

  public void setHipoteseDiagnosticoCid10(String hipoteseDiagnosticoCid10) {
    this.hipoteseDiagnosticoCid10 = hipoteseDiagnosticoCid10;
  }

  public void unsetHipoteseDiagnosticoCid10() {
    this.hipoteseDiagnosticoCid10 = null;
  }

  /** Returns true if field hipoteseDiagnosticoCid10 is set (has been assigned a value) and false otherwise */
  public boolean isSetHipoteseDiagnosticoCid10() {
    return this.hipoteseDiagnosticoCid10 != null;
  }

  public void setHipoteseDiagnosticoCid10IsSet(boolean value) {
    if (!value) {
      this.hipoteseDiagnosticoCid10 = null;
    }
  }

  public String getHipoteseDiagnosticoCiap2() {
    return this.hipoteseDiagnosticoCiap2;
  }

  public void setHipoteseDiagnosticoCiap2(String hipoteseDiagnosticoCiap2) {
    this.hipoteseDiagnosticoCiap2 = hipoteseDiagnosticoCiap2;
  }

  public void unsetHipoteseDiagnosticoCiap2() {
    this.hipoteseDiagnosticoCiap2 = null;
  }

  /** Returns true if field hipoteseDiagnosticoCiap2 is set (has been assigned a value) and false otherwise */
  public boolean isSetHipoteseDiagnosticoCiap2() {
    return this.hipoteseDiagnosticoCiap2 != null;
  }

  public void setHipoteseDiagnosticoCiap2IsSet(boolean value) {
    if (!value) {
      this.hipoteseDiagnosticoCiap2 = null;
    }
  }

  public long getClassificacaoRisco() {
    return this.classificacaoRisco;
  }

  public void setClassificacaoRisco(long classificacaoRisco) {
    this.classificacaoRisco = classificacaoRisco;
    setClassificacaoRiscoIsSet(true);
  }

  public void unsetClassificacaoRisco() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLASSIFICACAORISCO_ISSET_ID);
  }

  /** Returns true if field classificacaoRisco is set (has been assigned a value) and false otherwise */
  public boolean isSetClassificacaoRisco() {
    return EncodingUtils.testBit(__isset_bitfield, __CLASSIFICACAORISCO_ISSET_ID);
  }

  public void setClassificacaoRiscoIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLASSIFICACAORISCO_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ESPECIALIDADE:
      if (value == null) {
        unsetEspecialidade();
      } else {
        setEspecialidade((Long)value);
      }
      break;

    case HIPOTESE_DIAGNOSTICO_CID10:
      if (value == null) {
        unsetHipoteseDiagnosticoCid10();
      } else {
        setHipoteseDiagnosticoCid10((String)value);
      }
      break;

    case HIPOTESE_DIAGNOSTICO_CIAP2:
      if (value == null) {
        unsetHipoteseDiagnosticoCiap2();
      } else {
        setHipoteseDiagnosticoCiap2((String)value);
      }
      break;

    case CLASSIFICACAO_RISCO:
      if (value == null) {
        unsetClassificacaoRisco();
      } else {
        setClassificacaoRisco((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ESPECIALIDADE:
      return getEspecialidade();

    case HIPOTESE_DIAGNOSTICO_CID10:
      return getHipoteseDiagnosticoCid10();

    case HIPOTESE_DIAGNOSTICO_CIAP2:
      return getHipoteseDiagnosticoCiap2();

    case CLASSIFICACAO_RISCO:
      return getClassificacaoRisco();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ESPECIALIDADE:
      return isSetEspecialidade();
    case HIPOTESE_DIAGNOSTICO_CID10:
      return isSetHipoteseDiagnosticoCid10();
    case HIPOTESE_DIAGNOSTICO_CIAP2:
      return isSetHipoteseDiagnosticoCiap2();
    case CLASSIFICACAO_RISCO:
      return isSetClassificacaoRisco();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EncaminhamentoExternoThrift)
      return this.equals((EncaminhamentoExternoThrift)that);
    return false;
  }

  public boolean equals(EncaminhamentoExternoThrift that) {
    if (that == null)
      return false;

    boolean this_present_especialidade = true && this.isSetEspecialidade();
    boolean that_present_especialidade = true && that.isSetEspecialidade();
    if (this_present_especialidade || that_present_especialidade) {
      if (!(this_present_especialidade && that_present_especialidade))
        return false;
      if (this.especialidade != that.especialidade)
        return false;
    }

    boolean this_present_hipoteseDiagnosticoCid10 = true && this.isSetHipoteseDiagnosticoCid10();
    boolean that_present_hipoteseDiagnosticoCid10 = true && that.isSetHipoteseDiagnosticoCid10();
    if (this_present_hipoteseDiagnosticoCid10 || that_present_hipoteseDiagnosticoCid10) {
      if (!(this_present_hipoteseDiagnosticoCid10 && that_present_hipoteseDiagnosticoCid10))
        return false;
      if (!this.hipoteseDiagnosticoCid10.equals(that.hipoteseDiagnosticoCid10))
        return false;
    }

    boolean this_present_hipoteseDiagnosticoCiap2 = true && this.isSetHipoteseDiagnosticoCiap2();
    boolean that_present_hipoteseDiagnosticoCiap2 = true && that.isSetHipoteseDiagnosticoCiap2();
    if (this_present_hipoteseDiagnosticoCiap2 || that_present_hipoteseDiagnosticoCiap2) {
      if (!(this_present_hipoteseDiagnosticoCiap2 && that_present_hipoteseDiagnosticoCiap2))
        return false;
      if (!this.hipoteseDiagnosticoCiap2.equals(that.hipoteseDiagnosticoCiap2))
        return false;
    }

    boolean this_present_classificacaoRisco = true && this.isSetClassificacaoRisco();
    boolean that_present_classificacaoRisco = true && that.isSetClassificacaoRisco();
    if (this_present_classificacaoRisco || that_present_classificacaoRisco) {
      if (!(this_present_classificacaoRisco && that_present_classificacaoRisco))
        return false;
      if (this.classificacaoRisco != that.classificacaoRisco)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_especialidade = true && (isSetEspecialidade());
    list.add(present_especialidade);
    if (present_especialidade)
      list.add(especialidade);

    boolean present_hipoteseDiagnosticoCid10 = true && (isSetHipoteseDiagnosticoCid10());
    list.add(present_hipoteseDiagnosticoCid10);
    if (present_hipoteseDiagnosticoCid10)
      list.add(hipoteseDiagnosticoCid10);

    boolean present_hipoteseDiagnosticoCiap2 = true && (isSetHipoteseDiagnosticoCiap2());
    list.add(present_hipoteseDiagnosticoCiap2);
    if (present_hipoteseDiagnosticoCiap2)
      list.add(hipoteseDiagnosticoCiap2);

    boolean present_classificacaoRisco = true && (isSetClassificacaoRisco());
    list.add(present_classificacaoRisco);
    if (present_classificacaoRisco)
      list.add(classificacaoRisco);

    return list.hashCode();
  }

  @Override
  public int compareTo(EncaminhamentoExternoThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEspecialidade()).compareTo(other.isSetEspecialidade());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEspecialidade()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.especialidade, other.especialidade);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHipoteseDiagnosticoCid10()).compareTo(other.isSetHipoteseDiagnosticoCid10());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHipoteseDiagnosticoCid10()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hipoteseDiagnosticoCid10, other.hipoteseDiagnosticoCid10);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHipoteseDiagnosticoCiap2()).compareTo(other.isSetHipoteseDiagnosticoCiap2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHipoteseDiagnosticoCiap2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hipoteseDiagnosticoCiap2, other.hipoteseDiagnosticoCiap2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClassificacaoRisco()).compareTo(other.isSetClassificacaoRisco());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClassificacaoRisco()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.classificacaoRisco, other.classificacaoRisco);
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
    StringBuilder sb = new StringBuilder("EncaminhamentoExternoThrift(");
    boolean first = true;

    if (isSetEspecialidade()) {
      sb.append("especialidade:");
      sb.append(this.especialidade);
      first = false;
    }
    if (isSetHipoteseDiagnosticoCid10()) {
      if (!first) sb.append(", ");
      sb.append("hipoteseDiagnosticoCid10:");
      if (this.hipoteseDiagnosticoCid10 == null) {
        sb.append("null");
      } else {
        sb.append(this.hipoteseDiagnosticoCid10);
      }
      first = false;
    }
    if (isSetHipoteseDiagnosticoCiap2()) {
      if (!first) sb.append(", ");
      sb.append("hipoteseDiagnosticoCiap2:");
      if (this.hipoteseDiagnosticoCiap2 == null) {
        sb.append("null");
      } else {
        sb.append(this.hipoteseDiagnosticoCiap2);
      }
      first = false;
    }
    if (isSetClassificacaoRisco()) {
      if (!first) sb.append(", ");
      sb.append("classificacaoRisco:");
      sb.append(this.classificacaoRisco);
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

  private static class EncaminhamentoExternoThriftStandardSchemeFactory implements SchemeFactory {
    public EncaminhamentoExternoThriftStandardScheme getScheme() {
      return new EncaminhamentoExternoThriftStandardScheme();
    }
  }

  private static class EncaminhamentoExternoThriftStandardScheme extends StandardScheme<EncaminhamentoExternoThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EncaminhamentoExternoThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ESPECIALIDADE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.especialidade = iprot.readI64();
              struct.setEspecialidadeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HIPOTESE_DIAGNOSTICO_CID10
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hipoteseDiagnosticoCid10 = iprot.readString();
              struct.setHipoteseDiagnosticoCid10IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HIPOTESE_DIAGNOSTICO_CIAP2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hipoteseDiagnosticoCiap2 = iprot.readString();
              struct.setHipoteseDiagnosticoCiap2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLASSIFICACAO_RISCO
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.classificacaoRisco = iprot.readI64();
              struct.setClassificacaoRiscoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EncaminhamentoExternoThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetEspecialidade()) {
        oprot.writeFieldBegin(ESPECIALIDADE_FIELD_DESC);
        oprot.writeI64(struct.especialidade);
        oprot.writeFieldEnd();
      }
      if (struct.hipoteseDiagnosticoCid10 != null) {
        if (struct.isSetHipoteseDiagnosticoCid10()) {
          oprot.writeFieldBegin(HIPOTESE_DIAGNOSTICO_CID10_FIELD_DESC);
          oprot.writeString(struct.hipoteseDiagnosticoCid10);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hipoteseDiagnosticoCiap2 != null) {
        if (struct.isSetHipoteseDiagnosticoCiap2()) {
          oprot.writeFieldBegin(HIPOTESE_DIAGNOSTICO_CIAP2_FIELD_DESC);
          oprot.writeString(struct.hipoteseDiagnosticoCiap2);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetClassificacaoRisco()) {
        oprot.writeFieldBegin(CLASSIFICACAO_RISCO_FIELD_DESC);
        oprot.writeI64(struct.classificacaoRisco);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EncaminhamentoExternoThriftTupleSchemeFactory implements SchemeFactory {
    public EncaminhamentoExternoThriftTupleScheme getScheme() {
      return new EncaminhamentoExternoThriftTupleScheme();
    }
  }

  private static class EncaminhamentoExternoThriftTupleScheme extends TupleScheme<EncaminhamentoExternoThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EncaminhamentoExternoThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEspecialidade()) {
        optionals.set(0);
      }
      if (struct.isSetHipoteseDiagnosticoCid10()) {
        optionals.set(1);
      }
      if (struct.isSetHipoteseDiagnosticoCiap2()) {
        optionals.set(2);
      }
      if (struct.isSetClassificacaoRisco()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetEspecialidade()) {
        oprot.writeI64(struct.especialidade);
      }
      if (struct.isSetHipoteseDiagnosticoCid10()) {
        oprot.writeString(struct.hipoteseDiagnosticoCid10);
      }
      if (struct.isSetHipoteseDiagnosticoCiap2()) {
        oprot.writeString(struct.hipoteseDiagnosticoCiap2);
      }
      if (struct.isSetClassificacaoRisco()) {
        oprot.writeI64(struct.classificacaoRisco);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EncaminhamentoExternoThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.especialidade = iprot.readI64();
        struct.setEspecialidadeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.hipoteseDiagnosticoCid10 = iprot.readString();
        struct.setHipoteseDiagnosticoCid10IsSet(true);
      }
      if (incoming.get(2)) {
        struct.hipoteseDiagnosticoCiap2 = iprot.readString();
        struct.setHipoteseDiagnosticoCiap2IsSet(true);
      }
      if (incoming.get(3)) {
        struct.classificacaoRisco = iprot.readI64();
        struct.setClassificacaoRiscoIsSet(true);
      }
    }
  }

}

