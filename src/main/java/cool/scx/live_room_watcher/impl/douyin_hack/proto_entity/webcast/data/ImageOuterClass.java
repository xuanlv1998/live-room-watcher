// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/data/Image.proto
// Protobuf Java Version: 4.26.0

package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.data;

public final class ImageOuterClass {
  private ImageOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      ImageOuterClass.class.getName());
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
    internal_static_Image_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_Content_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_Content_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Image_NinePatchSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Image_NinePatchSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$douyin_hack/webcast/data/Image.proto\"\212" +
      "\003\n\005Image\022\023\n\013urlListList\030\001 \003(\t\022\013\n\003uri\030\002 \001" +
      "(\t\022\016\n\006height\030\003 \001(\003\022\r\n\005width\030\004 \001(\003\022\020\n\010avg" +
      "Color\030\005 \001(\t\022\021\n\timageType\030\006 \001(\005\022\022\n\nopenWe" +
      "bUrl\030\007 \001(\t\022\037\n\007content\030\010 \001(\0132\016.Image.Cont" +
      "ent\022\022\n\nisAnimated\030\t \001(\010\0224\n\023flexSettingLi" +
      "stList\030\n \003(\0132\027.Image.NinePatchSetting\0224\n" +
      "\023textSettingListList\030\013 \003(\0132\027.Image.NineP" +
      "atchSetting\032R\n\007Content\022\014\n\004name\030\001 \001(\t\022\021\n\t" +
      "fontColor\030\002 \001(\t\022\r\n\005level\030\003 \001(\003\022\027\n\017altern" +
      "ativeText\030\004 \001(\t\032\022\n\020NinePatchSettingBI\nEc" +
      "ool.scx.live_room_watcher.impl.douyin_ha" +
      "ck.proto_entity.webcast.dataP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_descriptor,
        new java.lang.String[] { "UrlListList", "Uri", "Height", "Width", "AvgColor", "ImageType", "OpenWebUrl", "Content", "IsAnimated", "FlexSettingListList", "TextSettingListList", });
    internal_static_Image_Content_descriptor =
      internal_static_Image_descriptor.getNestedTypes().get(0);
    internal_static_Image_Content_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_Content_descriptor,
        new java.lang.String[] { "Name", "FontColor", "Level", "AlternativeText", });
    internal_static_Image_NinePatchSetting_descriptor =
      internal_static_Image_descriptor.getNestedTypes().get(1);
    internal_static_Image_NinePatchSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Image_NinePatchSetting_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
