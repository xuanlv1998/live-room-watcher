// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: webcast/im/RoomRankMessage.proto

package cool.scx.live_room_watcher.douyin.proto_entity.webcast.im;

public interface RoomRankMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomRankMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>repeated .RoomRankMessage.RoomRank ranksList = 2;</code>
   */
  java.util.List<cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomRankMessage.RoomRank> 
      getRanksListList();
  /**
   * <code>repeated .RoomRankMessage.RoomRank ranksList = 2;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomRankMessage.RoomRank getRanksList(int index);
  /**
   * <code>repeated .RoomRankMessage.RoomRank ranksList = 2;</code>
   */
  int getRanksListCount();
  /**
   * <code>repeated .RoomRankMessage.RoomRank ranksList = 2;</code>
   */
  java.util.List<? extends cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomRankMessage.RoomRankOrBuilder> 
      getRanksListOrBuilderList();
  /**
   * <code>repeated .RoomRankMessage.RoomRank ranksList = 2;</code>
   */
  cool.scx.live_room_watcher.douyin.proto_entity.webcast.im.RoomRankMessage.RoomRankOrBuilder getRanksListOrBuilder(
      int index);
}
