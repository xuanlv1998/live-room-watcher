// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/EmojiChatMessage.proto

// Protobuf Java Version: 3.25.1
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class EmojiChatMessageOuterClass {
  private EmojiChatMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmojiChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmojiChatMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-douyin_hack/webcast/im/EmojiChatMessag" +
      "e.proto\032#douyin_hack/webcast/im/Common.p" +
      "roto\032#douyin_hack/webcast/data/User.prot" +
      "o\032#douyin_hack/webcast/data/Text.proto\032$" +
      "douyin_hack/webcast/data/Image.proto\"\333\001\n" +
      "\020EmojiChatMessage\022\027\n\006common\030\001 \001(\0132\007.Comm" +
      "on\022\023\n\004user\030\002 \001(\0132\005.User\022\017\n\007emojiId\030\003 \001(\003" +
      "\022\033\n\014emojiContent\030\004 \001(\0132\005.Text\022\026\n\016default" +
      "Content\030\005 \001(\t\022\037\n\017backgroundImage\030\006 \001(\0132\006" +
      ".Image\022\024\n\014fromIntercom\030\007 \001(\010\022\034\n\024intercom" +
      "HideUserCard\030\010 \001(\010BG\nCcool.scx.live_room" +
      "_watcher.impl.douyin_hack.proto_entity.w" +
      "ebcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
        });
    internal_static_EmojiChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmojiChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmojiChatMessage_descriptor,
        new java.lang.String[] { "Common", "User", "EmojiId", "EmojiContent", "DefaultContent", "BackgroundImage", "FromIntercom", "IntercomHideUserCard", });
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.UserOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
