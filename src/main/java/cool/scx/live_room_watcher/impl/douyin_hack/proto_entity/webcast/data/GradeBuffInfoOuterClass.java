// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/GradeBuffInfo.proto
// Protobuf Java Version: 4.26.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class GradeBuffInfoOuterClass {
  private GradeBuffInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      GradeBuffInfoOuterClass.class.getName());
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
    internal_static_GradeBuffInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GradeBuffInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GradeBuffInfo_StatsInfoMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GradeBuffInfo_StatsInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,douyin_hack/webcast/data/GradeBuffInfo" +
      ".proto\032$douyin_hack/webcast/data/Image.p" +
      "roto\"\313\001\n\rGradeBuffInfo\022\021\n\tbuffLevel\030\001 \001(" +
      "\003\022\016\n\006status\030\002 \001(\005\022\017\n\007endTime\030\003 \001(\003\0226\n\014st" +
      "atsInfoMap\030\004 \003(\0132 .GradeBuffInfo.StatsIn" +
      "foMapEntry\022\031\n\tbuffBadge\030\005 \001(\0132\006.Image\0323\n" +
      "\021StatsInfoMapEntry\022\013\n\003key\030\001 \001(\003\022\r\n\005value" +
      "\030\002 \001(\003:\0028\001BI\nEcool.scx.live_room_watcher" +
      ".impl.douyin_hack.proto_entity.webcast.d" +
      "ataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor(),
        });
    internal_static_GradeBuffInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GradeBuffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GradeBuffInfo_descriptor,
        new java.lang.String[] { "BuffLevel", "Status", "EndTime", "StatsInfoMap", "BuffBadge", });
    internal_static_GradeBuffInfo_StatsInfoMapEntry_descriptor =
      internal_static_GradeBuffInfo_descriptor.getNestedTypes().get(0);
    internal_static_GradeBuffInfo_StatsInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GradeBuffInfo_StatsInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data.ImageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
