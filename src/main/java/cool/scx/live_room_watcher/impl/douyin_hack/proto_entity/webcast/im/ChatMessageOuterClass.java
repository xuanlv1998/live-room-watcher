// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/ChatMessage.proto
// Protobuf Java Version: 4.26.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class ChatMessageOuterClass {
  private ChatMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      ChatMessageOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(douyin_hack/webcast/im/ChatMessage.pro" +
      "to\032#douyin_hack/webcast/im/Common.proto\032" +
      "#douyin_hack/webcast/data/User.proto\032$do" +
      "uyin_hack/webcast/data/Image.proto\032-douy" +
      "in_hack/webcast/im/PublicAreaCommon.prot" +
      "o\032#douyin_hack/webcast/data/Text.proto\0320" +
      "douyin_hack/webcast/im/LandscapeAreaComm" +
      "on.proto\"\250\004\n\013ChatMessage\022\027\n\006common\030\001 \001(\013" +
      "2\007.Common\022\023\n\004user\030\002 \001(\0132\005.User\022\017\n\007conten" +
      "t\030\003 \001(\t\022\027\n\017visibleToSender\030\004 \001(\010\022\037\n\017back" +
      "groundImage\030\005 \001(\0132\006.Image\022\033\n\023fullScreenT" +
      "extColor\030\006 \001(\t\022!\n\021backgroundImageV2\030\007 \001(" +
      "\0132\006.Image\022+\n\020publicAreaCommon\030\t \001(\0132\021.Pu" +
      "blicAreaCommon\022\031\n\tgiftImage\030\n \001(\0132\006.Imag" +
      "e\022\022\n\nagreeMsgId\030\013 \001(\003\022\025\n\rpriorityLevel\030\014" +
      " \001(\005\0221\n\023landscapeAreaCommon\030\r \001(\0132\024.Land" +
      "scapeAreaCommon\022\021\n\teventTime\030\017 \001(\003\022\022\n\nse" +
      "ndReview\030\020 \001(\010\022\024\n\014fromIntercom\030\021 \001(\010\022\034\n\024" +
      "intercomHideUserCard\030\022 \001(\010\022\024\n\014chatTagsLi" +
      "st\030\023 \001(\005\022\016\n\006chatBy\030\024 \001(\003\022\036\n\026individualCh" +
      "atPriority\030\025 \001(\005\022\031\n\nrtfContent\030( \001(\0132\005.T" +
      "extBG\nCcool.scx.live_room_watcher.impl.d" +
      "ouyin_hack.proto_entity.webcast.imP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LandscapeAreaCommonOuterClass.getDescriptor(),
        });
    internal_static_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChatMessage_descriptor,
        new java.lang.String[] { "Common", "User", "Content", "VisibleToSender", "BackgroundImage", "FullScreenTextColor", "BackgroundImageV2", "PublicAreaCommon", "GiftImage", "AgreeMsgId", "PriorityLevel", "LandscapeAreaCommon", "EventTime", "SendReview", "FromIntercom", "IntercomHideUserCard", "ChatTagsList", "ChatBy", "IndividualChatPriority", "RtfContent", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.PublicAreaCommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.LandscapeAreaCommonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
