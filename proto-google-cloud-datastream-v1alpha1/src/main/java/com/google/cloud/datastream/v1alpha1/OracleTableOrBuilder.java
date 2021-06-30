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

public interface OracleTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.OracleTable)
    com.google.protobuf.MessageOrBuilder {

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
  java.lang.String getTableName();
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
  com.google.protobuf.ByteString getTableNameBytes();

  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.OracleColumn> getOracleColumnsList();
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleColumn getOracleColumns(int index);
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  int getOracleColumnsCount();
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder>
      getOracleColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Oracle columns in the schema.
   * When unspecified as part of inclue/exclude lists, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.OracleColumn oracle_columns = 2;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleColumnOrBuilder getOracleColumnsOrBuilder(int index);
}
