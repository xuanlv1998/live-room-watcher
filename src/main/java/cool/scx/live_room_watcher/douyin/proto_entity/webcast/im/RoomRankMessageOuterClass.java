// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/RoomRankMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public final class RoomRankMessageOuterClass {
  private RoomRankMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoomRankMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoomRankMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoomRankMessage_RoomRank_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoomRankMessage_RoomRank_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n webcast/im/RoomRankMessage.proto\032\027webc" +
      "ast/im/Common.proto\032\027webcast/data/Text.p" +
      "roto\032\027webcast/data/User.proto\"\242\001\n\017RoomRa" +
      "nkMessage\022\027\n\006common\030\001 \001(\0132\007.Common\022,\n\tra" +
      "nksList\030\002 \003(\0132\031.RoomRankMessage.RoomRank" +
      "\032H\n\010RoomRank\022\023\n\004user\030\001 \001(\0132\005.User\022\020\n\010sco" +
      "reStr\030\002 \001(\t\022\025\n\rprofileHidden\030\003 \001(\010B=\n9co" +
      "ol.scx.live_room_watcher.douyin.proto_en" +
      "tity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.UserOuterClass.getDescriptor(),
        });
    internal_static_RoomRankMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoomRankMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoomRankMessage_descriptor,
        new java.lang.String[] { "Common", "RanksList", });
    internal_static_RoomRankMessage_RoomRank_descriptor =
      internal_static_RoomRankMessage_descriptor.getNestedTypes().get(0);
    internal_static_RoomRankMessage_RoomRank_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoomRankMessage_RoomRank_descriptor,
        new java.lang.String[] { "User", "ScoreStr", "ProfileHidden", });
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.data.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
