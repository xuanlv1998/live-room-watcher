// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tiktok_hack/webcast/im/SpecifiedDisplayText.proto

// Protobuf Java Version: 4.26.1
package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

/**
 * <pre>
 * 更新时间 : 2024-04-29
 * </pre>
 *
 * Protobuf type {@code tiktok_hack.SpecifiedDisplayText}
 */
public final class SpecifiedDisplayText extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tiktok_hack.SpecifiedDisplayText)
    SpecifiedDisplayTextOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      SpecifiedDisplayText.class.getName());
  }
  // Use SpecifiedDisplayText.newBuilder() to construct.
  private SpecifiedDisplayText(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SpecifiedDisplayText() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.internal_static_tiktok_hack_SpecifiedDisplayText_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.internal_static_tiktok_hack_SpecifiedDisplayText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.class, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText other = (cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 更新时间 : 2024-04-29
   * </pre>
   *
   * Protobuf type {@code tiktok_hack.SpecifiedDisplayText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tiktok_hack.SpecifiedDisplayText)
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.internal_static_tiktok_hack_SpecifiedDisplayText_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.internal_static_tiktok_hack_SpecifiedDisplayText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.class, cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayTextOuterClass.internal_static_tiktok_hack_SpecifiedDisplayText_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText build() {
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText buildPartial() {
      cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText result = new cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText) {
        return mergeFrom((cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText other) {
      if (other == cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tiktok_hack.SpecifiedDisplayText)
  }

  // @@protoc_insertion_point(class_scope:tiktok_hack.SpecifiedDisplayText)
  private static final cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText();
  }

  public static cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpecifiedDisplayText>
      PARSER = new com.google.protobuf.AbstractParser<SpecifiedDisplayText>() {
    @java.lang.Override
    public SpecifiedDisplayText parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SpecifiedDisplayText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpecifiedDisplayText> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.SpecifiedDisplayText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

