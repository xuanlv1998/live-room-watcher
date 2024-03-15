// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/CommonTextMessage.proto

// Protobuf Java Version: 4.26.0
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

/**
 * <pre>
 * 更新时间 : 2023-01-09
 * </pre>
 *
 * Protobuf type {@code CommonTextMessage}
 */
public final class CommonTextMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:CommonTextMessage)
    CommonTextMessageOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      CommonTextMessage.class.getName());
  }
  // Use CommonTextMessage.newBuilder() to construct.
  private CommonTextMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CommonTextMessage() {
    scene_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOuterClass.internal_static_CommonTextMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOuterClass.internal_static_CommonTextMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.Builder.class);
  }

  private int bitField0_;
  public static final int COMMON_FIELD_NUMBER = 1;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  @java.lang.Override
  public boolean hasCommon() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }
  /**
   * <code>.Common common = 1;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
    return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
  }

  public static final int USER_FIELD_NUMBER = 2;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User user_;
  /**
   * <code>.User user = 2;</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.User user = 2;</code>
   * @return The user.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser() {
    return user_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.User user = 2;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.getDefaultInstance() : user_;
  }

  public static final int SCENE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object scene_ = "";
  /**
   * <code>string scene = 3;</code>
   * @return The scene.
   */
  @java.lang.Override
  public java.lang.String getScene() {
    java.lang.Object ref = scene_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scene_ = s;
      return s;
    }
  }
  /**
   * <code>string scene = 3;</code>
   * @return The bytes for scene.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSceneBytes() {
    java.lang.Object ref = scene_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scene_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCommon());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUser());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(scene_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, scene_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommon());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUser());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(scene_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, scene_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage) obj;

    if (hasCommon() != other.hasCommon()) return false;
    if (hasCommon()) {
      if (!getCommon()
          .equals(other.getCommon())) return false;
    }
    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getScene()
        .equals(other.getScene())) return false;
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
    if (hasCommon()) {
      hash = (37 * hash) + COMMON_FIELD_NUMBER;
      hash = (53 * hash) + getCommon().hashCode();
    }
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + SCENE_FIELD_NUMBER;
    hash = (53 * hash) + getScene().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage prototype) {
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
   * 更新时间 : 2023-01-09
   * </pre>
   *
   * Protobuf type {@code CommonTextMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CommonTextMessage)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOuterClass.internal_static_CommonTextMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOuterClass.internal_static_CommonTextMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getCommonFieldBuilder();
        getUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      scene_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessageOuterClass.internal_static_CommonTextMessage_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.common_ = commonBuilder_ == null
            ? common_
            : commonBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.scene_ = scene_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage.getDefaultInstance()) return this;
      if (other.hasCommon()) {
        mergeCommon(other.getCommon());
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getScene().isEmpty()) {
        scene_ = other.scene_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
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
            case 10: {
              input.readMessage(
                  getCommonFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              scene_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
    private int bitField0_;

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common common_;
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> commonBuilder_;
    /**
     * <code>.Common common = 1;</code>
     * @return Whether the common field is set.
     */
    public boolean hasCommon() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Common common = 1;</code>
     * @return The common.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common getCommon() {
      if (commonBuilder_ == null) {
        return common_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      } else {
        return commonBuilder_.getMessage();
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        common_ = value;
      } else {
        commonBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder setCommon(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder builderForValue) {
      if (commonBuilder_ == null) {
        common_ = builderForValue.build();
      } else {
        commonBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder mergeCommon(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common value) {
      if (commonBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          common_ != null &&
          common_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance()) {
          getCommonBuilder().mergeFrom(value);
        } else {
          common_ = value;
        }
      } else {
        commonBuilder_.mergeFrom(value);
      }
      if (common_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public Builder clearCommon() {
      bitField0_ = (bitField0_ & ~0x00000001);
      common_ = null;
      if (commonBuilder_ != null) {
        commonBuilder_.dispose();
        commonBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder getCommonBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCommonFieldBuilder().getBuilder();
    }
    /**
     * <code>.Common common = 1;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder() {
      if (commonBuilder_ != null) {
        return commonBuilder_.getMessageOrBuilder();
      } else {
        return common_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.getDefaultInstance() : common_;
      }
    }
    /**
     * <code>.Common common = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder> 
        getCommonFieldBuilder() {
      if (commonBuilder_ == null) {
        commonBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.Common.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOrBuilder>(
                getCommon(),
                getParentForChildren(),
                isClean());
        common_ = null;
      }
      return commonBuilder_;
    }

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User user_;
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder> userBuilder_;
    /**
     * <code>.User user = 2;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.User user = 2;</code>
     * @return The user.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.User user = 2;</code>
     */
    public Builder setUser(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public Builder setUser(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public Builder mergeUser(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          user_ != null &&
          user_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000002);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.User user = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.User user = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.User.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private java.lang.Object scene_ = "";
    /**
     * <code>string scene = 3;</code>
     * @return The scene.
     */
    public java.lang.String getScene() {
      java.lang.Object ref = scene_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scene_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string scene = 3;</code>
     * @return The bytes for scene.
     */
    public com.google.protobuf.ByteString
        getSceneBytes() {
      java.lang.Object ref = scene_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scene_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string scene = 3;</code>
     * @param value The scene to set.
     * @return This builder for chaining.
     */
    public Builder setScene(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      scene_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string scene = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearScene() {
      scene_ = getDefaultInstance().getScene();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string scene = 3;</code>
     * @param value The bytes for scene to set.
     * @return This builder for chaining.
     */
    public Builder setSceneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      scene_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:CommonTextMessage)
  }

  // @@protoc_insertion_point(class_scope:CommonTextMessage)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommonTextMessage>
      PARSER = new com.google.protobuf.AbstractParser<CommonTextMessage>() {
    @java.lang.Override
    public CommonTextMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommonTextMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommonTextMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonTextMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

