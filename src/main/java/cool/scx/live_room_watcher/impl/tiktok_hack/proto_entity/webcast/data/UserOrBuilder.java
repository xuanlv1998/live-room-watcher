// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tiktok_hack/webcast/data/User.proto

// Protobuf Java Version: 4.26.1
package cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tiktok_hack.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string nickname = 3;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 3;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>.tiktok_hack.Image avatarThumb = 9;</code>
   * @return Whether the avatarThumb field is set.
   */
  boolean hasAvatarThumb();
  /**
   * <code>.tiktok_hack.Image avatarThumb = 9;</code>
   * @return The avatarThumb.
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.Image getAvatarThumb();
  /**
   * <code>.tiktok_hack.Image avatarThumb = 9;</code>
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOrBuilder getAvatarThumbOrBuilder();

  /**
   * <code>.tiktok_hack.Image avatarMedium = 10;</code>
   * @return Whether the avatarMedium field is set.
   */
  boolean hasAvatarMedium();
  /**
   * <code>.tiktok_hack.Image avatarMedium = 10;</code>
   * @return The avatarMedium.
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.Image getAvatarMedium();
  /**
   * <code>.tiktok_hack.Image avatarMedium = 10;</code>
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOrBuilder getAvatarMediumOrBuilder();

  /**
   * <code>.tiktok_hack.Image avatarLarge = 11;</code>
   * @return Whether the avatarLarge field is set.
   */
  boolean hasAvatarLarge();
  /**
   * <code>.tiktok_hack.Image avatarLarge = 11;</code>
   * @return The avatarLarge.
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.Image getAvatarLarge();
  /**
   * <code>.tiktok_hack.Image avatarLarge = 11;</code>
   */
  cool.scx.live_room_watcher.impl.tiktok_hack.proto_entity.webcast.data.ImageOrBuilder getAvatarLargeOrBuilder();
}
