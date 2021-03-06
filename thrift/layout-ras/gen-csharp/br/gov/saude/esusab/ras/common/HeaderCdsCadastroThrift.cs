/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace br.gov.saude.esusab.ras.common
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class HeaderCdsCadastroThrift : TBase
  {
    private string _cnesUnidadeSaude;
    private string _cnsProfissional;
    private string _codigoIbgeMunicipio;
    private long _dataAtendimento;
    private string _ineEquipe;
    private long _microarea;

    public string CnesUnidadeSaude
    {
      get
      {
        return _cnesUnidadeSaude;
      }
      set
      {
        __isset.cnesUnidadeSaude = true;
        this._cnesUnidadeSaude = value;
      }
    }

    public string CnsProfissional
    {
      get
      {
        return _cnsProfissional;
      }
      set
      {
        __isset.cnsProfissional = true;
        this._cnsProfissional = value;
      }
    }

    public string CodigoIbgeMunicipio
    {
      get
      {
        return _codigoIbgeMunicipio;
      }
      set
      {
        __isset.codigoIbgeMunicipio = true;
        this._codigoIbgeMunicipio = value;
      }
    }

    public long DataAtendimento
    {
      get
      {
        return _dataAtendimento;
      }
      set
      {
        __isset.dataAtendimento = true;
        this._dataAtendimento = value;
      }
    }

    public string IneEquipe
    {
      get
      {
        return _ineEquipe;
      }
      set
      {
        __isset.ineEquipe = true;
        this._ineEquipe = value;
      }
    }

    public long Microarea
    {
      get
      {
        return _microarea;
      }
      set
      {
        __isset.microarea = true;
        this._microarea = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool cnesUnidadeSaude;
      public bool cnsProfissional;
      public bool codigoIbgeMunicipio;
      public bool dataAtendimento;
      public bool ineEquipe;
      public bool microarea;
    }

    public HeaderCdsCadastroThrift() {
    }

    public void Read (TProtocol iprot)
    {
      iprot.IncrementRecursionDepth();
      try
      {
        TField field;
        iprot.ReadStructBegin();
        while (true)
        {
          field = iprot.ReadFieldBegin();
          if (field.Type == TType.Stop) { 
            break;
          }
          switch (field.ID)
          {
            case 1:
              if (field.Type == TType.String) {
                CnesUnidadeSaude = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                CnsProfissional = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.String) {
                CodigoIbgeMunicipio = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.I64) {
                DataAtendimento = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                IneEquipe = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 6:
              if (field.Type == TType.I64) {
                Microarea = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            default: 
              TProtocolUtil.Skip(iprot, field.Type);
              break;
          }
          iprot.ReadFieldEnd();
        }
        iprot.ReadStructEnd();
      }
      finally
      {
        iprot.DecrementRecursionDepth();
      }
    }

    public void Write(TProtocol oprot) {
      oprot.IncrementRecursionDepth();
      try
      {
        TStruct struc = new TStruct("HeaderCdsCadastroThrift");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (CnesUnidadeSaude != null && __isset.cnesUnidadeSaude) {
          field.Name = "cnesUnidadeSaude";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CnesUnidadeSaude);
          oprot.WriteFieldEnd();
        }
        if (CnsProfissional != null && __isset.cnsProfissional) {
          field.Name = "cnsProfissional";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CnsProfissional);
          oprot.WriteFieldEnd();
        }
        if (CodigoIbgeMunicipio != null && __isset.codigoIbgeMunicipio) {
          field.Name = "codigoIbgeMunicipio";
          field.Type = TType.String;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CodigoIbgeMunicipio);
          oprot.WriteFieldEnd();
        }
        if (__isset.dataAtendimento) {
          field.Name = "dataAtendimento";
          field.Type = TType.I64;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(DataAtendimento);
          oprot.WriteFieldEnd();
        }
        if (IneEquipe != null && __isset.ineEquipe) {
          field.Name = "ineEquipe";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(IneEquipe);
          oprot.WriteFieldEnd();
        }
        if (__isset.microarea) {
          field.Name = "microarea";
          field.Type = TType.I64;
          field.ID = 6;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Microarea);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }
      finally
      {
        oprot.DecrementRecursionDepth();
      }
    }

    public override string ToString() {
      StringBuilder __sb = new StringBuilder("HeaderCdsCadastroThrift(");
      bool __first = true;
      if (CnesUnidadeSaude != null && __isset.cnesUnidadeSaude) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CnesUnidadeSaude: ");
        __sb.Append(CnesUnidadeSaude);
      }
      if (CnsProfissional != null && __isset.cnsProfissional) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CnsProfissional: ");
        __sb.Append(CnsProfissional);
      }
      if (CodigoIbgeMunicipio != null && __isset.codigoIbgeMunicipio) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CodigoIbgeMunicipio: ");
        __sb.Append(CodigoIbgeMunicipio);
      }
      if (__isset.dataAtendimento) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("DataAtendimento: ");
        __sb.Append(DataAtendimento);
      }
      if (IneEquipe != null && __isset.ineEquipe) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("IneEquipe: ");
        __sb.Append(IneEquipe);
      }
      if (__isset.microarea) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Microarea: ");
        __sb.Append(Microarea);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
