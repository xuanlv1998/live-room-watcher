// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tiktok_hack/webcast/im/Response.proto
// Protobuf Java Version: 4.26.1

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

public final class ResponseOuterClass {
  private ResponseOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ResponseOuterClass.class.getName());
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
    internal_static_tiktok_hack_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tiktok_hack_Response_RouteParamsMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_Response_RouteParamsMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%tiktok_hack/webcast/im/Response.proto\022" +
      "\013tiktok_hack\032$tiktok_hack/webcast/im/Mes" +
      "sage.proto\"\222\003\n\010Response\022*\n\014messagesList\030" +
      "\001 \003(\0132\024.tiktok_hack.Message\022\016\n\006cursor\030\002 " +
      "\001(\t\022\025\n\rfetchInterval\030\003 \001(\003\022\013\n\003now\030\004 \001(\003\022" +
      "\023\n\013internalExt\030\005 \001(\t\022\021\n\tfetchType\030\006 \001(\005\022" +
      "A\n\016routeParamsMap\030\007 \003(\0132).tiktok_hack.Re" +
      "sponse.RouteParamsMapEntry\022\031\n\021heartbeatD" +
      "uration\030\010 \001(\003\022\017\n\007needAck\030\t \001(\010\022\022\n\npushSe" +
      "rver\030\n \001(\t\022\017\n\007isFirst\030\013 \001(\t\022\034\n\024historyCo" +
      "mmentCursor\030\014 \001(\t\022\025\n\rhistoryNoMore\030\r \001(\010" +
      "\0325\n\023RouteParamsMapEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001BG\nCcool.scx.live_room_wa" +
      "tcher.impl.tiktok_hack.proto_entity.webc" +
      "ast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_Response_descriptor,
        new java.lang.String[] { "MessagesList", "Cursor", "FetchInterval", "Now", "InternalExt", "FetchType", "RouteParamsMap", "HeartbeatDuration", "NeedAck", "PushServer", "IsFirst", "HistoryCommentCursor", "HistoryNoMore", });
    internal_static_tiktok_hack_Response_RouteParamsMapEntry_descriptor =
      internal_static_tiktok_hack_Response_descriptor.getNestedTypes().get(0);
    internal_static_tiktok_hack_Response_RouteParamsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_Response_RouteParamsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
