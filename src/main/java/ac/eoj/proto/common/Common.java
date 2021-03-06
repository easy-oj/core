// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package ac.eoj.proto.common;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code common.SubmissionStatus}
   */
  public enum SubmissionStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IN_QUEUE = 0;</code>
     */
    IN_QUEUE(0),
    /**
     * <code>JUDGING = 1;</code>
     */
    JUDGING(1),
    /**
     * <code>SYSTEM_ERROR = 2;</code>
     */
    SYSTEM_ERROR(2),
    /**
     * <code>COMPILE_ERROR = 3;</code>
     */
    COMPILE_ERROR(3),
    /**
     * <code>FAILURE = 4;</code>
     */
    FAILURE(4),
    /**
     * <code>ACCEPTED = 5;</code>
     */
    ACCEPTED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IN_QUEUE = 0;</code>
     */
    public static final int IN_QUEUE_VALUE = 0;
    /**
     * <code>JUDGING = 1;</code>
     */
    public static final int JUDGING_VALUE = 1;
    /**
     * <code>SYSTEM_ERROR = 2;</code>
     */
    public static final int SYSTEM_ERROR_VALUE = 2;
    /**
     * <code>COMPILE_ERROR = 3;</code>
     */
    public static final int COMPILE_ERROR_VALUE = 3;
    /**
     * <code>FAILURE = 4;</code>
     */
    public static final int FAILURE_VALUE = 4;
    /**
     * <code>ACCEPTED = 5;</code>
     */
    public static final int ACCEPTED_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SubmissionStatus valueOf(int value) {
      return forNumber(value);
    }

    public static SubmissionStatus forNumber(int value) {
      switch (value) {
        case 0: return IN_QUEUE;
        case 1: return JUDGING;
        case 2: return SYSTEM_ERROR;
        case 3: return COMPILE_ERROR;
        case 4: return FAILURE;
        case 5: return ACCEPTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SubmissionStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SubmissionStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SubmissionStatus>() {
            public SubmissionStatus findValueByNumber(int number) {
              return SubmissionStatus.forNumber(number);
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
      return ac.eoj.proto.common.Common.getDescriptor().getEnumTypes().get(0);
    }

    private static final SubmissionStatus[] VALUES = values();

    public static SubmissionStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SubmissionStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:common.SubmissionStatus)
  }

  /**
   * Protobuf enum {@code common.ExecutionStatus}
   */
  public enum ExecutionStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EXECUTION_ERROR = 0;</code>
     */
    EXECUTION_ERROR(0),
    /**
     * <code>RUNTIME_ERROR = 1;</code>
     */
    RUNTIME_ERROR(1),
    /**
     * <code>TIME_LIMIT_EXCEED = 2;</code>
     */
    TIME_LIMIT_EXCEED(2),
    /**
     * <code>MEMORY_LIMIT_EXCEED = 3;</code>
     */
    MEMORY_LIMIT_EXCEED(3),
    /**
     * <code>ILLEGAL_SYSCALL = 4;</code>
     */
    ILLEGAL_SYSCALL(4),
    /**
     * <code>WRONG_ANSWER = 5;</code>
     */
    WRONG_ANSWER(5),
    /**
     * <code>PRESENTATION_ERROR = 6;</code>
     */
    PRESENTATION_ERROR(6),
    /**
     * <code>EXECUTION_ACCEPTED = 7;</code>
     */
    EXECUTION_ACCEPTED(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EXECUTION_ERROR = 0;</code>
     */
    public static final int EXECUTION_ERROR_VALUE = 0;
    /**
     * <code>RUNTIME_ERROR = 1;</code>
     */
    public static final int RUNTIME_ERROR_VALUE = 1;
    /**
     * <code>TIME_LIMIT_EXCEED = 2;</code>
     */
    public static final int TIME_LIMIT_EXCEED_VALUE = 2;
    /**
     * <code>MEMORY_LIMIT_EXCEED = 3;</code>
     */
    public static final int MEMORY_LIMIT_EXCEED_VALUE = 3;
    /**
     * <code>ILLEGAL_SYSCALL = 4;</code>
     */
    public static final int ILLEGAL_SYSCALL_VALUE = 4;
    /**
     * <code>WRONG_ANSWER = 5;</code>
     */
    public static final int WRONG_ANSWER_VALUE = 5;
    /**
     * <code>PRESENTATION_ERROR = 6;</code>
     */
    public static final int PRESENTATION_ERROR_VALUE = 6;
    /**
     * <code>EXECUTION_ACCEPTED = 7;</code>
     */
    public static final int EXECUTION_ACCEPTED_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExecutionStatus valueOf(int value) {
      return forNumber(value);
    }

    public static ExecutionStatus forNumber(int value) {
      switch (value) {
        case 0: return EXECUTION_ERROR;
        case 1: return RUNTIME_ERROR;
        case 2: return TIME_LIMIT_EXCEED;
        case 3: return MEMORY_LIMIT_EXCEED;
        case 4: return ILLEGAL_SYSCALL;
        case 5: return WRONG_ANSWER;
        case 6: return PRESENTATION_ERROR;
        case 7: return EXECUTION_ACCEPTED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExecutionStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExecutionStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExecutionStatus>() {
            public ExecutionStatus findValueByNumber(int number) {
              return ExecutionStatus.forNumber(number);
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
      return ac.eoj.proto.common.Common.getDescriptor().getEnumTypes().get(1);
    }

    private static final ExecutionStatus[] VALUES = values();

    public static ExecutionStatus valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ExecutionStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:common.ExecutionStatus)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\022\006common*m\n\020SubmissionStat" +
      "us\022\014\n\010IN_QUEUE\020\000\022\013\n\007JUDGING\020\001\022\020\n\014SYSTEM_" +
      "ERROR\020\002\022\021\n\rCOMPILE_ERROR\020\003\022\013\n\007FAILURE\020\004\022" +
      "\014\n\010ACCEPTED\020\005*\300\001\n\017ExecutionStatus\022\023\n\017EXE" +
      "CUTION_ERROR\020\000\022\021\n\rRUNTIME_ERROR\020\001\022\025\n\021TIM" +
      "E_LIMIT_EXCEED\020\002\022\027\n\023MEMORY_LIMIT_EXCEED\020" +
      "\003\022\023\n\017ILLEGAL_SYSCALL\020\004\022\020\n\014WRONG_ANSWER\020\005" +
      "\022\026\n\022PRESENTATION_ERROR\020\006\022\026\n\022EXECUTION_AC" +
      "CEPTED\020\007BE\n\023ac.eoj.proto.commonB\006CommonZ" +
      "&github.com/easy-oj/common/proto/commonb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
