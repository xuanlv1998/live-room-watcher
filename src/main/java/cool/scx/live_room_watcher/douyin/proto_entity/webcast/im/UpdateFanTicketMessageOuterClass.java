// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/UpdateFanTicketMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public final class UpdateFanTicketMessageOuterClass {
  private UpdateFanTicketMessageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateFanTicketMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateFanTicketMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'webcast/im/UpdateFanTicketMessage.prot" +
      "o\032\030webcast/im/Message.proto\032\027webcast/im/" +
      "Common.proto\"\202\001\n\026UpdateFanTicketMessage\022" +
      "\027\n\006common\030\001 \001(\0132\007.Common\022\036\n\026roomFanTicke" +
      "tCountText\030\002 \001(\t\022\032\n\022roomFanTicketCount\030\003" +
      " \001(\003\022\023\n\013forceUpdate\030\004 \001(\010B=\n9cool.scx.li" +
      "ve_room_watcher.douyin.proto_entity.webc" +
      "ast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.MessageOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
        });
    internal_static_UpdateFanTicketMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdateFanTicketMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateFanTicketMessage_descriptor,
        new java.lang.String[] { "Common", "RoomFanTicketCountText", "RoomFanTicketCount", "ForceUpdate", });
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.MessageOuterClass.getDescriptor();
    cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
