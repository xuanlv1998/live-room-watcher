// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/GameCPUserDownloadMessageEnum.proto

// Protobuf Java Version: 4.26.0
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

/**
 * <pre>
 * 更新时间 : 2023-01-11
 * </pre>
 *
 * Protobuf enum {@code GameCPUserDownloadMessageEnum}
 */
public enum GameCPUserDownloadMessageEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DEFAULTDOWNLOADMESSAGE = 0;</code>
   */
  DEFAULTDOWNLOADMESSAGE(0),
  /**
   * <code>USERRESERVEGAME = 1;</code>
   */
  USERRESERVEGAME(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      GameCPUserDownloadMessageEnum.class.getName());
  }
  /**
   * <code>DEFAULTDOWNLOADMESSAGE = 0;</code>
   */
  public static final int DEFAULTDOWNLOADMESSAGE_VALUE = 0;
  /**
   * <code>USERRESERVEGAME = 1;</code>
   */
  public static final int USERRESERVEGAME_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GameCPUserDownloadMessageEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameCPUserDownloadMessageEnum forNumber(int value) {
    switch (value) {
      case 0: return DEFAULTDOWNLOADMESSAGE;
      case 1: return USERRESERVEGAME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameCPUserDownloadMessageEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameCPUserDownloadMessageEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameCPUserDownloadMessageEnum>() {
          public GameCPUserDownloadMessageEnum findValueByNumber(int number) {
            return GameCPUserDownloadMessageEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.GameCPUserDownloadMessageEnumOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final GameCPUserDownloadMessageEnum[] VALUES = values();

  public static GameCPUserDownloadMessageEnum valueOf(
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

  private GameCPUserDownloadMessageEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:GameCPUserDownloadMessageEnum)
}

