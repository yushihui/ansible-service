// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Ansible.proto

package com.netbrain.rpc.ansible;

/**
 * Protobuf enum {@code com.netbrain.rpc.ansible.JobPriority}
 */
public enum JobPriority
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Low = 0;</code>
   */
  Low(0),
  /**
   * <code>Normal = 1;</code>
   */
  Normal(1),
  /**
   * <code>High = 2;</code>
   */
  High(2),
  /**
   * <code>Higher = 3;</code>
   */
  Higher(3),
  /**
   * <code>Super = 4;</code>
   */
  Super(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Low = 0;</code>
   */
  public static final int Low_VALUE = 0;
  /**
   * <code>Normal = 1;</code>
   */
  public static final int Normal_VALUE = 1;
  /**
   * <code>High = 2;</code>
   */
  public static final int High_VALUE = 2;
  /**
   * <code>Higher = 3;</code>
   */
  public static final int Higher_VALUE = 3;
  /**
   * <code>Super = 4;</code>
   */
  public static final int Super_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static JobPriority valueOf(int value) {
    return forNumber(value);
  }

  public static JobPriority forNumber(int value) {
    switch (value) {
      case 0: return Low;
      case 1: return Normal;
      case 2: return High;
      case 3: return Higher;
      case 4: return Super;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobPriority>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
          JobPriority> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JobPriority>() {
          public JobPriority findValueByNumber(int number) {
            return JobPriority.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return AnsibleProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final JobPriority[] VALUES = values();

  public static JobPriority valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobPriority(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.netbrain.rpc.ansible.JobPriority)
}
