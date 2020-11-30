/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * Common request options for various APIs.
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.RequestOptions}
 */
public final class RequestOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.RequestOptions)
    RequestOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RequestOptions.newBuilder() to construct.
  private RequestOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RequestOptions() {
    priority_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RequestOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RequestOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              priority_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_RequestOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto
        .internal_static_google_spanner_v1_RequestOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.RequestOptions.class,
            com.google.spanner.v1.RequestOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The relative priority for requests. Note that priority is not applicable
   * for BeginTransaction.
   * </pre>
   *
   * Protobuf enum {@code google.spanner.v1.RequestOptions.Priority}
   */
  public enum Priority implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * PRIORITY_UNSPECIFIED is equivalent to PRIORITY_HIGH.
     * </pre>
     *
     * <code>PRIORITY_UNSPECIFIED = 0;</code>
     */
    PRIORITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * This specifies that the request is low priority.
     * </pre>
     *
     * <code>PRIORITY_LOW = 1;</code>
     */
    PRIORITY_LOW(1),
    /**
     *
     *
     * <pre>
     * This specifies that the request is medium priority.
     * </pre>
     *
     * <code>PRIORITY_MEDIUM = 2;</code>
     */
    PRIORITY_MEDIUM(2),
    /**
     *
     *
     * <pre>
     * This specifies that the request is high priority.
     * </pre>
     *
     * <code>PRIORITY_HIGH = 3;</code>
     */
    PRIORITY_HIGH(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * PRIORITY_UNSPECIFIED is equivalent to PRIORITY_HIGH.
     * </pre>
     *
     * <code>PRIORITY_UNSPECIFIED = 0;</code>
     */
    public static final int PRIORITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * This specifies that the request is low priority.
     * </pre>
     *
     * <code>PRIORITY_LOW = 1;</code>
     */
    public static final int PRIORITY_LOW_VALUE = 1;
    /**
     *
     *
     * <pre>
     * This specifies that the request is medium priority.
     * </pre>
     *
     * <code>PRIORITY_MEDIUM = 2;</code>
     */
    public static final int PRIORITY_MEDIUM_VALUE = 2;
    /**
     *
     *
     * <pre>
     * This specifies that the request is high priority.
     * </pre>
     *
     * <code>PRIORITY_HIGH = 3;</code>
     */
    public static final int PRIORITY_HIGH_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Priority valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Priority forNumber(int value) {
      switch (value) {
        case 0:
          return PRIORITY_UNSPECIFIED;
        case 1:
          return PRIORITY_LOW;
        case 2:
          return PRIORITY_MEDIUM;
        case 3:
          return PRIORITY_HIGH;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Priority> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Priority> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Priority>() {
          public Priority findValueByNumber(int number) {
            return Priority.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.spanner.v1.RequestOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final Priority[] VALUES = values();

    public static Priority valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Priority(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.spanner.v1.RequestOptions.Priority)
  }

  public static final int PRIORITY_FIELD_NUMBER = 1;
  private int priority_;
  /**
   *
   *
   * <pre>
   * Priority for the request.
   * </pre>
   *
   * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
   *
   * @return The enum numeric value on the wire for priority.
   */
  @java.lang.Override
  public int getPriorityValue() {
    return priority_;
  }
  /**
   *
   *
   * <pre>
   * Priority for the request.
   * </pre>
   *
   * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
   *
   * @return The priority.
   */
  @java.lang.Override
  public com.google.spanner.v1.RequestOptions.Priority getPriority() {
    @SuppressWarnings("deprecation")
    com.google.spanner.v1.RequestOptions.Priority result =
        com.google.spanner.v1.RequestOptions.Priority.valueOf(priority_);
    return result == null ? com.google.spanner.v1.RequestOptions.Priority.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (priority_
        != com.google.spanner.v1.RequestOptions.Priority.PRIORITY_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, priority_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (priority_
        != com.google.spanner.v1.RequestOptions.Priority.PRIORITY_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, priority_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.v1.RequestOptions)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.RequestOptions other = (com.google.spanner.v1.RequestOptions) obj;

    if (priority_ != other.priority_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + priority_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.RequestOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.RequestOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.RequestOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.v1.RequestOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Common request options for various APIs.
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.RequestOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.RequestOptions)
      com.google.spanner.v1.RequestOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_RequestOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_RequestOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.RequestOptions.class,
              com.google.spanner.v1.RequestOptions.Builder.class);
    }

    // Construct using com.google.spanner.v1.RequestOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      priority_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto
          .internal_static_google_spanner_v1_RequestOptions_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.v1.RequestOptions getDefaultInstanceForType() {
      return com.google.spanner.v1.RequestOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.v1.RequestOptions build() {
      com.google.spanner.v1.RequestOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.v1.RequestOptions buildPartial() {
      com.google.spanner.v1.RequestOptions result = new com.google.spanner.v1.RequestOptions(this);
      result.priority_ = priority_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.RequestOptions) {
        return mergeFrom((com.google.spanner.v1.RequestOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.RequestOptions other) {
      if (other == com.google.spanner.v1.RequestOptions.getDefaultInstance()) return this;
      if (other.priority_ != 0) {
        setPriorityValue(other.getPriorityValue());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.spanner.v1.RequestOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.RequestOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int priority_ = 0;
    /**
     *
     *
     * <pre>
     * Priority for the request.
     * </pre>
     *
     * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
     *
     * @return The enum numeric value on the wire for priority.
     */
    @java.lang.Override
    public int getPriorityValue() {
      return priority_;
    }
    /**
     *
     *
     * <pre>
     * Priority for the request.
     * </pre>
     *
     * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
     *
     * @param value The enum numeric value on the wire for priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriorityValue(int value) {

      priority_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Priority for the request.
     * </pre>
     *
     * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
     *
     * @return The priority.
     */
    @java.lang.Override
    public com.google.spanner.v1.RequestOptions.Priority getPriority() {
      @SuppressWarnings("deprecation")
      com.google.spanner.v1.RequestOptions.Priority result =
          com.google.spanner.v1.RequestOptions.Priority.valueOf(priority_);
      return result == null ? com.google.spanner.v1.RequestOptions.Priority.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Priority for the request.
     * </pre>
     *
     * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
     *
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(com.google.spanner.v1.RequestOptions.Priority value) {
      if (value == null) {
        throw new NullPointerException();
      }

      priority_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Priority for the request.
     * </pre>
     *
     * <code>.google.spanner.v1.RequestOptions.Priority priority = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPriority() {

      priority_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.RequestOptions)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.RequestOptions)
  private static final com.google.spanner.v1.RequestOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.RequestOptions();
  }

  public static com.google.spanner.v1.RequestOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestOptions> PARSER =
      new com.google.protobuf.AbstractParser<RequestOptions>() {
        @java.lang.Override
        public RequestOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RequestOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RequestOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.v1.RequestOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
