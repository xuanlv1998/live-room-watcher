// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tiktok_hack/webcast/im/Common.proto
// Protobuf Java Version: 4.27.2

package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im;

public final class CommonOuterClass {
  private CommonOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      CommonOuterClass.class.getName());
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
    internal_static_tiktok_hack_Common_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tiktok_hack_Common_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#tiktok_hack/webcast/im/Common.proto\022\013t" +
      "iktok_hack\032,tiktok_hack/webcast/data/Liv" +
      "eMessageID.proto\032#tiktok_hack/webcast/da" +
      "ta/Text.proto\032$tiktok_hack/webcast/im/Me" +
      "ssage.proto\"\220\005\n\006Common\022\016\n\006method\030\001 \001(\t\022\r" +
      "\n\005msgId\030\002 \001(\003\022\016\n\006roomId\030\003 \001(\003\022\022\n\ncreateT" +
      "ime\030\004 \001(\003\022\017\n\007monitor\030\005 \001(\005\022\021\n\tisShowMsg\030" +
      "\006 \001(\010\022\020\n\010describe\030\007 \001(\t\022&\n\013displayText\030\010" +
      " \001(\0132\021.tiktok_hack.Text\022\020\n\010foldType\030\t \001(" +
      "\003\022\026\n\016anchorFoldType\030\n \001(\003\022\025\n\rprioritySco" +
      "re\030\013 \001(\003\022\r\n\005logId\030\014 \001(\t\022\031\n\021msgProcessFil" +
      "terK\030\r \001(\t\022\031\n\021msgProcessFilterV\030\016 \001(\t\022\017\n" +
      "\007fromIdc\030\017 \001(\t\022\r\n\005toIdc\030\020 \001(\t\022/\n\021filterM" +
      "sgTagsList\030\021 \003(\0132\024.tiktok_hack.Message\022\013" +
      "\n\003sei\030\022 \001(\003\0220\n\014dependRootId\030\023 \001(\0132\032.tikt" +
      "ok_hack.LiveMessageID\022,\n\010dependId\030\024 \001(\0132" +
      "\032.tiktok_hack.LiveMessageID\022\033\n\023anchorPri" +
      "orityScore\030\025 \001(\t\022\034\n\024roomMessageHeatLevel" +
      "\030\026 \001(\t\022\026\n\016foldTypeForWeb\030\027 \001(\t\022\034\n\024anchor" +
      "FoldTypeForWeb\030\030 \001(\t\022\026\n\016clientSendTime\030\031" +
      " \001(\t\022\030\n\020dispatchStrategy\030\032 \001(\003BG\nCcool.s" +
      "cx.live_room_watcher.impl.tiktok_hack.pr" +
      "oto_entity.webcast.imP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor(),
          cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor(),
        });
    internal_static_tiktok_hack_Common_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tiktok_hack_Common_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tiktok_hack_Common_descriptor,
        new java.lang.String[] { "Method", "MsgId", "RoomId", "CreateTime", "Monitor", "IsShowMsg", "Describe", "DisplayText", "FoldType", "AnchorFoldType", "PriorityScore", "LogId", "MsgProcessFilterK", "MsgProcessFilterV", "FromIdc", "ToIdc", "FilterMsgTagsList", "Sei", "DependRootId", "DependId", "AnchorPriorityScore", "RoomMessageHeatLevel", "FoldTypeForWeb", "AnchorFoldTypeForWeb", "ClientSendTime", "DispatchStrategy", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.LiveMessageIDOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.TextOuterClass.getDescriptor();
    cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.im.MessageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
