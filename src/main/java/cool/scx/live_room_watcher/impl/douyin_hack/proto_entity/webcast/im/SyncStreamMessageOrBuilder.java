// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_hack/webcast/im/SyncStreamMessage.proto

// Protobuf Java Version: 4.26.0
package cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im;

public interface SyncStreamMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SyncStreamMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string common = 1;</code>
   * @return The common.
   */
  java.lang.String getCommon();
  /**
   * <code>string common = 1;</code>
   * @return The bytes for common.
   */
  com.google.protobuf.ByteString
      getCommonBytes();

  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  java.util.List<cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage> 
      getInfoListListList();
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessage getInfoListList(int index);
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  int getInfoListListCount();
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder> 
      getInfoListListOrBuilderList();
  /**
   * <code>repeated .SyncStreamInfoMessage infoListList = 2;</code>
   */
  cool.scx.live_room_watcher.impl.douyin_hack.proto_entity.webcast.im.SyncStreamInfoMessageOrBuilder getInfoListListOrBuilder(
      int index);
}
