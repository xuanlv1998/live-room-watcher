// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: douyin_hack/webcast/data/ChatIdentity.proto
// Protobuf Java Version: 4.27.2

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

/**
 * <pre>
 * 更新时间 2023-01-11
 * </pre>
 *
 * Protobuf type {@code ChatIdentity}
 */
public final class ChatIdentity extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ChatIdentity)
    ChatIdentityOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ChatIdentity.class.getName());
  }
  // Use ChatIdentity.newBuilder() to construct.
  private ChatIdentity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ChatIdentity() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOuterClass.internal_static_ChatIdentity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOuterClass.internal_static_ChatIdentity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.Builder.class);
  }

  private int bitField0_;
  public static final int SHOWIDENTITY_FIELD_NUMBER = 1;
  private int showIdentity_ = 0;
  /**
   * <code>int32 showIdentity = 1;</code>
   * @return The showIdentity.
   */
  @java.lang.Override
  public int getShowIdentity() {
    return showIdentity_;
  }

  public static final int IDENTITYLABEL_FIELD_NUMBER = 2;
  private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image identityLabel_;
  /**
   * <code>.Image identityLabel = 2;</code>
   * @return Whether the identityLabel field is set.
   */
  @java.lang.Override
  public boolean hasIdentityLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Image identityLabel = 2;</code>
   * @return The identityLabel.
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getIdentityLabel() {
    return identityLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : identityLabel_;
  }
  /**
   * <code>.Image identityLabel = 2;</code>
   */
  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getIdentityLabelOrBuilder() {
    return identityLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : identityLabel_;
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
    if (showIdentity_ != 0) {
      output.writeInt32(1, showIdentity_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getIdentityLabel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (showIdentity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, showIdentity_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIdentityLabel());
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
    if (!(obj instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity)) {
      return super.equals(obj);
    }
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity other = (cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity) obj;

    if (getShowIdentity()
        != other.getShowIdentity()) return false;
    if (hasIdentityLabel() != other.hasIdentityLabel()) return false;
    if (hasIdentityLabel()) {
      if (!getIdentityLabel()
          .equals(other.getIdentityLabel())) return false;
    }
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
    hash = (37 * hash) + SHOWIDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getShowIdentity();
    if (hasIdentityLabel()) {
      hash = (37 * hash) + IDENTITYLABEL_FIELD_NUMBER;
      hash = (53 * hash) + getIdentityLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity parseFrom(
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
  public static Builder newBuilder(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity prototype) {
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
   * 更新时间 2023-01-11
   * </pre>
   *
   * Protobuf type {@code ChatIdentity}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ChatIdentity)
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOuterClass.internal_static_ChatIdentity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOuterClass.internal_static_ChatIdentity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.class, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.Builder.class);
    }

    // Construct using cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.newBuilder()
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
        getIdentityLabelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      showIdentity_ = 0;
      identityLabel_ = null;
      if (identityLabelBuilder_ != null) {
        identityLabelBuilder_.dispose();
        identityLabelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentityOuterClass.internal_static_ChatIdentity_descriptor;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity getDefaultInstanceForType() {
      return cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.getDefaultInstance();
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity build() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity buildPartial() {
      cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity result = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.showIdentity_ = showIdentity_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.identityLabel_ = identityLabelBuilder_ == null
            ? identityLabel_
            : identityLabelBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity) {
        return mergeFrom((cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity other) {
      if (other == cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity.getDefaultInstance()) return this;
      if (other.getShowIdentity() != 0) {
        setShowIdentity(other.getShowIdentity());
      }
      if (other.hasIdentityLabel()) {
        mergeIdentityLabel(other.getIdentityLabel());
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
            case 8: {
              showIdentity_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getIdentityLabelFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private int showIdentity_ ;
    /**
     * <code>int32 showIdentity = 1;</code>
     * @return The showIdentity.
     */
    @java.lang.Override
    public int getShowIdentity() {
      return showIdentity_;
    }
    /**
     * <code>int32 showIdentity = 1;</code>
     * @param value The showIdentity to set.
     * @return This builder for chaining.
     */
    public Builder setShowIdentity(int value) {

      showIdentity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 showIdentity = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShowIdentity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      showIdentity_ = 0;
      onChanged();
      return this;
    }

    private cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image identityLabel_;
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder> identityLabelBuilder_;
    /**
     * <code>.Image identityLabel = 2;</code>
     * @return Whether the identityLabel field is set.
     */
    public boolean hasIdentityLabel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     * @return The identityLabel.
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image getIdentityLabel() {
      if (identityLabelBuilder_ == null) {
        return identityLabel_ == null ? cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : identityLabel_;
      } else {
        return identityLabelBuilder_.getMessage();
      }
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public Builder setIdentityLabel(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image value) {
      if (identityLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        identityLabel_ = value;
      } else {
        identityLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public Builder setIdentityLabel(
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder builderForValue) {
      if (identityLabelBuilder_ == null) {
        identityLabel_ = builderForValue.build();
      } else {
        identityLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public Builder mergeIdentityLabel(cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image value) {
      if (identityLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          identityLabel_ != null &&
          identityLabel_ != cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance()) {
          getIdentityLabelBuilder().mergeFrom(value);
        } else {
          identityLabel_ = value;
        }
      } else {
        identityLabelBuilder_.mergeFrom(value);
      }
      if (identityLabel_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public Builder clearIdentityLabel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      identityLabel_ = null;
      if (identityLabelBuilder_ != null) {
        identityLabelBuilder_.dispose();
        identityLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder getIdentityLabelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIdentityLabelFieldBuilder().getBuilder();
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder getIdentityLabelOrBuilder() {
      if (identityLabelBuilder_ != null) {
        return identityLabelBuilder_.getMessageOrBuilder();
      } else {
        return identityLabel_ == null ?
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.getDefaultInstance() : identityLabel_;
      }
    }
    /**
     * <code>.Image identityLabel = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder> 
        getIdentityLabelFieldBuilder() {
      if (identityLabelBuilder_ == null) {
        identityLabelBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.Image.Builder, cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOrBuilder>(
                getIdentityLabel(),
                getParentForChildren(),
                isClean());
        identityLabel_ = null;
      }
      return identityLabelBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:ChatIdentity)
  }

  // @@protoc_insertion_point(class_scope:ChatIdentity)
  private static final cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity();
  }

  public static cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatIdentity>
      PARSER = new com.google.protobuf.AbstractParser<ChatIdentity>() {
    @java.lang.Override
    public ChatIdentity parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChatIdentity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatIdentity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ChatIdentity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

