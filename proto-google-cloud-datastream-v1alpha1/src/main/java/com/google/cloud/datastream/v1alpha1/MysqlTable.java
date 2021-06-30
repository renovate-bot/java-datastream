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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * MySQL table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlTable}
 */
public final class MysqlTable extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.MysqlTable)
    MysqlTableOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MysqlTable.newBuilder() to construct.
  private MysqlTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MysqlTable() {
    tableName_ = "";
    mysqlColumns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MysqlTable();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MysqlTable(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              tableName_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mysqlColumns_ =
                    new java.util.ArrayList<com.google.cloud.datastream.v1alpha1.MysqlColumn>();
                mutable_bitField0_ |= 0x00000001;
              }
              mysqlColumns_.add(
                  input.readMessage(
                      com.google.cloud.datastream.v1alpha1.MysqlColumn.parser(),
                      extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mysqlColumns_ = java.util.Collections.unmodifiableList(mysqlColumns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_MysqlTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_MysqlTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.MysqlTable.class,
            com.google.cloud.datastream.v1alpha1.MysqlTable.Builder.class);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   *
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table_name = 1;</code>
   *
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MYSQL_COLUMNS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn> mysqlColumns_;
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn> getMysqlColumnsList() {
    return mysqlColumns_;
  }
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder>
      getMysqlColumnsOrBuilderList() {
    return mysqlColumns_;
  }
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  @java.lang.Override
  public int getMysqlColumnsCount() {
    return mysqlColumns_.size();
  }
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlColumn getMysqlColumns(int index) {
    return mysqlColumns_.get(index);
  }
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder getMysqlColumnsOrBuilder(
      int index) {
    return mysqlColumns_.get(index);
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
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    for (int i = 0; i < mysqlColumns_.size(); i++) {
      output.writeMessage(2, mysqlColumns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    for (int i = 0; i < mysqlColumns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, mysqlColumns_.get(i));
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.MysqlTable)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.MysqlTable other =
        (com.google.cloud.datastream.v1alpha1.MysqlTable) obj;

    if (!getTableName().equals(other.getTableName())) return false;
    if (!getMysqlColumnsList().equals(other.getMysqlColumnsList())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (getMysqlColumnsCount() > 0) {
      hash = (37 * hash) + MYSQL_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getMysqlColumnsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.MysqlTable prototype) {
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
   * MySQL table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.MysqlTable}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.MysqlTable)
      com.google.cloud.datastream.v1alpha1.MysqlTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.MysqlTable.class,
              com.google.cloud.datastream.v1alpha1.MysqlTable.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.MysqlTable.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMysqlColumnsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      tableName_ = "";

      if (mysqlColumnsBuilder_ == null) {
        mysqlColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mysqlColumnsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_MysqlTable_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlTable getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.MysqlTable.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlTable build() {
      com.google.cloud.datastream.v1alpha1.MysqlTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.MysqlTable buildPartial() {
      com.google.cloud.datastream.v1alpha1.MysqlTable result =
          new com.google.cloud.datastream.v1alpha1.MysqlTable(this);
      int from_bitField0_ = bitField0_;
      result.tableName_ = tableName_;
      if (mysqlColumnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mysqlColumns_ = java.util.Collections.unmodifiableList(mysqlColumns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mysqlColumns_ = mysqlColumns_;
      } else {
        result.mysqlColumns_ = mysqlColumnsBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.MysqlTable) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.MysqlTable) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.MysqlTable other) {
      if (other == com.google.cloud.datastream.v1alpha1.MysqlTable.getDefaultInstance())
        return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (mysqlColumnsBuilder_ == null) {
        if (!other.mysqlColumns_.isEmpty()) {
          if (mysqlColumns_.isEmpty()) {
            mysqlColumns_ = other.mysqlColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMysqlColumnsIsMutable();
            mysqlColumns_.addAll(other.mysqlColumns_);
          }
          onChanged();
        }
      } else {
        if (!other.mysqlColumns_.isEmpty()) {
          if (mysqlColumnsBuilder_.isEmpty()) {
            mysqlColumnsBuilder_.dispose();
            mysqlColumnsBuilder_ = null;
            mysqlColumns_ = other.mysqlColumns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mysqlColumnsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMysqlColumnsFieldBuilder()
                    : null;
          } else {
            mysqlColumnsBuilder_.addAllMessages(other.mysqlColumns_);
          }
        }
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
      com.google.cloud.datastream.v1alpha1.MysqlTable parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datastream.v1alpha1.MysqlTable) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object tableName_ = "";
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTableName() {

      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table name.
     * </pre>
     *
     * <code>string table_name = 1;</code>
     *
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      tableName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn> mysqlColumns_ =
        java.util.Collections.emptyList();

    private void ensureMysqlColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mysqlColumns_ =
            new java.util.ArrayList<com.google.cloud.datastream.v1alpha1.MysqlColumn>(
                mysqlColumns_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlColumn,
            com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder,
            com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder>
        mysqlColumnsBuilder_;

    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn> getMysqlColumnsList() {
      if (mysqlColumnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mysqlColumns_);
      } else {
        return mysqlColumnsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public int getMysqlColumnsCount() {
      if (mysqlColumnsBuilder_ == null) {
        return mysqlColumns_.size();
      } else {
        return mysqlColumnsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlColumn getMysqlColumns(int index) {
      if (mysqlColumnsBuilder_ == null) {
        return mysqlColumns_.get(index);
      } else {
        return mysqlColumnsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder setMysqlColumns(
        int index, com.google.cloud.datastream.v1alpha1.MysqlColumn value) {
      if (mysqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.set(index, value);
        onChanged();
      } else {
        mysqlColumnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder setMysqlColumns(
        int index, com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder builderForValue) {
      if (mysqlColumnsBuilder_ == null) {
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.set(index, builderForValue.build());
        onChanged();
      } else {
        mysqlColumnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder addMysqlColumns(com.google.cloud.datastream.v1alpha1.MysqlColumn value) {
      if (mysqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.add(value);
        onChanged();
      } else {
        mysqlColumnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder addMysqlColumns(
        int index, com.google.cloud.datastream.v1alpha1.MysqlColumn value) {
      if (mysqlColumnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.add(index, value);
        onChanged();
      } else {
        mysqlColumnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder addMysqlColumns(
        com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder builderForValue) {
      if (mysqlColumnsBuilder_ == null) {
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.add(builderForValue.build());
        onChanged();
      } else {
        mysqlColumnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder addMysqlColumns(
        int index, com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder builderForValue) {
      if (mysqlColumnsBuilder_ == null) {
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.add(index, builderForValue.build());
        onChanged();
      } else {
        mysqlColumnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder addAllMysqlColumns(
        java.lang.Iterable<? extends com.google.cloud.datastream.v1alpha1.MysqlColumn> values) {
      if (mysqlColumnsBuilder_ == null) {
        ensureMysqlColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mysqlColumns_);
        onChanged();
      } else {
        mysqlColumnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder clearMysqlColumns() {
      if (mysqlColumnsBuilder_ == null) {
        mysqlColumns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mysqlColumnsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public Builder removeMysqlColumns(int index) {
      if (mysqlColumnsBuilder_ == null) {
        ensureMysqlColumnsIsMutable();
        mysqlColumns_.remove(index);
        onChanged();
      } else {
        mysqlColumnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder getMysqlColumnsBuilder(
        int index) {
      return getMysqlColumnsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder getMysqlColumnsOrBuilder(
        int index) {
      if (mysqlColumnsBuilder_ == null) {
        return mysqlColumns_.get(index);
      } else {
        return mysqlColumnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder>
        getMysqlColumnsOrBuilderList() {
      if (mysqlColumnsBuilder_ != null) {
        return mysqlColumnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mysqlColumns_);
      }
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder addMysqlColumnsBuilder() {
      return getMysqlColumnsFieldBuilder()
          .addBuilder(com.google.cloud.datastream.v1alpha1.MysqlColumn.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder addMysqlColumnsBuilder(
        int index) {
      return getMysqlColumnsFieldBuilder()
          .addBuilder(index, com.google.cloud.datastream.v1alpha1.MysqlColumn.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * MySQL columns in the database.
     * When unspecified as part of include/exclude lists, includes/excludes
     * everything.
     * </pre>
     *
     * <code>repeated .google.cloud.datastream.v1alpha1.MysqlColumn mysql_columns = 2;</code>
     */
    public java.util.List<com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder>
        getMysqlColumnsBuilderList() {
      return getMysqlColumnsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datastream.v1alpha1.MysqlColumn,
            com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder,
            com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder>
        getMysqlColumnsFieldBuilder() {
      if (mysqlColumnsBuilder_ == null) {
        mysqlColumnsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datastream.v1alpha1.MysqlColumn,
                com.google.cloud.datastream.v1alpha1.MysqlColumn.Builder,
                com.google.cloud.datastream.v1alpha1.MysqlColumnOrBuilder>(
                mysqlColumns_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        mysqlColumns_ = null;
      }
      return mysqlColumnsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.MysqlTable)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.MysqlTable)
  private static final com.google.cloud.datastream.v1alpha1.MysqlTable DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.MysqlTable();
  }

  public static com.google.cloud.datastream.v1alpha1.MysqlTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlTable> PARSER =
      new com.google.protobuf.AbstractParser<MysqlTable>() {
        @java.lang.Override
        public MysqlTable parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MysqlTable(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MysqlTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.MysqlTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
