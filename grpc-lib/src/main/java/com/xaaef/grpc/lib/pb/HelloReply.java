// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet.proto

// Protobuf Java Version: 3.25.3
package com.xaaef.grpc.lib.pb;

/**
 * <pre>
 * The response message containing the greetings.
 * </pre>
 *
 * Protobuf type {@code com.xaaef.HelloReply}
 */
public final class HelloReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.xaaef.HelloReply)
    HelloReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloReply.newBuilder() to construct.
  private HelloReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloReply();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetMessage();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xaaef.grpc.lib.pb.HelloReply.class, com.xaaef.grpc.lib.pb.HelloReply.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private static final class MessageDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_MessageEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> message_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMessage() {
    if (message_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MessageDefaultEntryHolder.defaultEntry);
    }
    return message_;
  }
  public int getMessageCount() {
    return internalGetMessage().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; message = 1;</code>
   */
  @java.lang.Override
  public boolean containsMessage(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMessage().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMessageMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMessage() {
    return getMessageMap();
  }
  /**
   * <code>map&lt;string, string&gt; message = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getMessageMap() {
    return internalGetMessage().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; message = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getMessageOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMessage().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; message = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getMessageOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMessage().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMessage(),
        MessageDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMessage().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      message__ = MessageDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, message__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xaaef.grpc.lib.pb.HelloReply)) {
      return super.equals(obj);
    }
    com.xaaef.grpc.lib.pb.HelloReply other = (com.xaaef.grpc.lib.pb.HelloReply) obj;

    if (!internalGetMessage().equals(
        other.internalGetMessage())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetMessage().getMap().isEmpty()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMessage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.xaaef.grpc.lib.pb.HelloReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.xaaef.grpc.lib.pb.HelloReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xaaef.grpc.lib.pb.HelloReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xaaef.grpc.lib.pb.HelloReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response message containing the greetings.
   * </pre>
   *
   * Protobuf type {@code com.xaaef.HelloReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.xaaef.HelloReply)
      com.xaaef.grpc.lib.pb.HelloReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMessage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableMessage();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xaaef.grpc.lib.pb.HelloReply.class, com.xaaef.grpc.lib.pb.HelloReply.Builder.class);
    }

    // Construct using com.xaaef.grpc.lib.pb.HelloReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableMessage().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xaaef.grpc.lib.pb.Greet.internal_static_com_xaaef_HelloReply_descriptor;
    }

    @java.lang.Override
    public com.xaaef.grpc.lib.pb.HelloReply getDefaultInstanceForType() {
      return com.xaaef.grpc.lib.pb.HelloReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.xaaef.grpc.lib.pb.HelloReply build() {
      com.xaaef.grpc.lib.pb.HelloReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xaaef.grpc.lib.pb.HelloReply buildPartial() {
      com.xaaef.grpc.lib.pb.HelloReply result = new com.xaaef.grpc.lib.pb.HelloReply(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.xaaef.grpc.lib.pb.HelloReply result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.message_ = internalGetMessage();
        result.message_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xaaef.grpc.lib.pb.HelloReply) {
        return mergeFrom((com.xaaef.grpc.lib.pb.HelloReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xaaef.grpc.lib.pb.HelloReply other) {
      if (other == com.xaaef.grpc.lib.pb.HelloReply.getDefaultInstance()) return this;
      internalGetMutableMessage().mergeFrom(
          other.internalGetMessage());
      bitField0_ |= 0x00000001;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              message__ = input.readMessage(
                  MessageDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableMessage().getMutableMap().put(
                  message__.getKey(), message__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> message_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMessage() {
      if (message_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MessageDefaultEntryHolder.defaultEntry);
      }
      return message_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableMessage() {
      if (message_ == null) {
        message_ = com.google.protobuf.MapField.newMapField(
            MessageDefaultEntryHolder.defaultEntry);
      }
      if (!message_.isMutable()) {
        message_ = message_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return message_;
    }
    public int getMessageCount() {
      return internalGetMessage().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    @java.lang.Override
    public boolean containsMessage(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMessage().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMessageMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMessage() {
      return getMessageMap();
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getMessageMap() {
      return internalGetMessage().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getMessageOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMessage().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getMessageOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMessage().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableMessage().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    public Builder removeMessage(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMessage().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableMessage() {
      bitField0_ |= 0x00000001;
      return internalGetMutableMessage().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    public Builder putMessage(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableMessage().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; message = 1;</code>
     */
    public Builder putAllMessage(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMessage().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.xaaef.HelloReply)
  }

  // @@protoc_insertion_point(class_scope:com.xaaef.HelloReply)
  private static final com.xaaef.grpc.lib.pb.HelloReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xaaef.grpc.lib.pb.HelloReply();
  }

  public static com.xaaef.grpc.lib.pb.HelloReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloReply>
      PARSER = new com.google.protobuf.AbstractParser<HelloReply>() {
    @java.lang.Override
    public HelloReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HelloReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xaaef.grpc.lib.pb.HelloReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
