// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/UpdateFanTicketMessage.proto
// Protobuf Java Version: 4.26.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public final class UpdateFanTicketMessageOuterClass {
  private UpdateFanTicketMessageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      UpdateFanTicketMessageOuterClass.class.getName());
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
    internal_static_UpdateFanTicketMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_UpdateFanTicketMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3douyin_hack/webcast/im/UpdateFanTicket" +
      "Message.proto\032#douyin_hack/webcast/im/Co" +
      "mmon.proto\"\202\001\n\026UpdateFanTicketMessage\022\027\n" +
      "\006common\030\001 \001(\0132\007.Common\022\036\n\026roomFanTicketC" +
      "ountText\030\002 \001(\t\022\032\n\022roomFanTicketCount\030\003 \001" +
      "(\003\022\023\n\013forceUpdate\030\004 \001(\010BG\nCcool.scx.live" +
      "_room_watcher.impl.douyin_hack.proto_ent" +
      "ity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor(),
        });
    internal_static_UpdateFanTicketMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdateFanTicketMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_UpdateFanTicketMessage_descriptor,
        new java.lang.String[] { "Common", "RoomFanTicketCountText", "RoomFanTicketCount", "ForceUpdate", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.CommonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
