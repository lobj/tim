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


#if !SILVERLIGHT
[Serializable]
#endif
public partial class TimPage : TBase
{
  private string _fromTimeStamp;
  private string _toTimeStamp;
  private int _limitCount;
  private Dictionary<string, string> _extraMap;

  /// <summary>
  /// 时间上
  /// </summary>
  public string FromTimeStamp
  {
    get
    {
      return _fromTimeStamp;
    }
    set
    {
      __isset.fromTimeStamp = true;
      this._fromTimeStamp = value;
    }
  }

  /// <summary>
  /// 时间下
  /// </summary>
  public string ToTimeStamp
  {
    get
    {
      return _toTimeStamp;
    }
    set
    {
      __isset.toTimeStamp = true;
      this._toTimeStamp = value;
    }
  }

  /// <summary>
  /// 条数
  /// </summary>
  public int LimitCount
  {
    get
    {
      return _limitCount;
    }
    set
    {
      __isset.limitCount = true;
      this._limitCount = value;
    }
  }

  public Dictionary<string, string> ExtraMap
  {
    get
    {
      return _extraMap;
    }
    set
    {
      __isset.extraMap = true;
      this._extraMap = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool fromTimeStamp;
    public bool toTimeStamp;
    public bool limitCount;
    public bool extraMap;
  }

  public TimPage() {
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
              FromTimeStamp = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              ToTimeStamp = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              LimitCount = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Map) {
              {
                ExtraMap = new Dictionary<string, string>();
                TMap _map131 = iprot.ReadMapBegin();
                for( int _i132 = 0; _i132 < _map131.Count; ++_i132)
                {
                  string _key133;
                  string _val134;
                  _key133 = iprot.ReadString();
                  _val134 = iprot.ReadString();
                  ExtraMap[_key133] = _val134;
                }
                iprot.ReadMapEnd();
              }
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
      TStruct struc = new TStruct("TimPage");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (FromTimeStamp != null && __isset.fromTimeStamp) {
        field.Name = "fromTimeStamp";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(FromTimeStamp);
        oprot.WriteFieldEnd();
      }
      if (ToTimeStamp != null && __isset.toTimeStamp) {
        field.Name = "toTimeStamp";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ToTimeStamp);
        oprot.WriteFieldEnd();
      }
      if (__isset.limitCount) {
        field.Name = "limitCount";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(LimitCount);
        oprot.WriteFieldEnd();
      }
      if (ExtraMap != null && __isset.extraMap) {
        field.Name = "extraMap";
        field.Type = TType.Map;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, ExtraMap.Count));
          foreach (string _iter135 in ExtraMap.Keys)
          {
            oprot.WriteString(_iter135);
            oprot.WriteString(ExtraMap[_iter135]);
          }
          oprot.WriteMapEnd();
        }
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
    StringBuilder __sb = new StringBuilder("TimPage(");
    bool __first = true;
    if (FromTimeStamp != null && __isset.fromTimeStamp) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FromTimeStamp: ");
      __sb.Append(FromTimeStamp);
    }
    if (ToTimeStamp != null && __isset.toTimeStamp) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ToTimeStamp: ");
      __sb.Append(ToTimeStamp);
    }
    if (__isset.limitCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("LimitCount: ");
      __sb.Append(LimitCount);
    }
    if (ExtraMap != null && __isset.extraMap) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ExtraMap: ");
      __sb.Append(ExtraMap);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

