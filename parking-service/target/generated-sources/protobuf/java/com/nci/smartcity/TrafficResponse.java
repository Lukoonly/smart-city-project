// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartcity.proto

package com.nci.smartcity;

/**
 * Protobuf type {@code TrafficResponse}
 */
public final class TrafficResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrafficResponse)
    TrafficResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrafficResponse.newBuilder() to construct.
  private TrafficResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrafficResponse() {
    congestionLevel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrafficResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.nci.smartcity.Smartcity.internal_static_TrafficResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nci.smartcity.Smartcity.internal_static_TrafficResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nci.smartcity.TrafficResponse.class, com.nci.smartcity.TrafficResponse.Builder.class);
  }

  public static final int VEHICLE_COUNT_FIELD_NUMBER = 1;
  private int vehicleCount_ = 0;
  /**
   * <code>int32 vehicle_count = 1;</code>
   * @return The vehicleCount.
   */
  @java.lang.Override
  public int getVehicleCount() {
    return vehicleCount_;
  }

  public static final int AVERAGE_SPEED_FIELD_NUMBER = 2;
  private double averageSpeed_ = 0D;
  /**
   * <code>double average_speed = 2;</code>
   * @return The averageSpeed.
   */
  @java.lang.Override
  public double getAverageSpeed() {
    return averageSpeed_;
  }

  public static final int CONGESTION_LEVEL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object congestionLevel_ = "";
  /**
   * <code>string congestion_level = 3;</code>
   * @return The congestionLevel.
   */
  @java.lang.Override
  public java.lang.String getCongestionLevel() {
    java.lang.Object ref = congestionLevel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      congestionLevel_ = s;
      return s;
    }
  }
  /**
   * <code>string congestion_level = 3;</code>
   * @return The bytes for congestionLevel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCongestionLevelBytes() {
    java.lang.Object ref = congestionLevel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      congestionLevel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (vehicleCount_ != 0) {
      output.writeInt32(1, vehicleCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(averageSpeed_) != 0) {
      output.writeDouble(2, averageSpeed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(congestionLevel_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, congestionLevel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vehicleCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, vehicleCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(averageSpeed_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, averageSpeed_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(congestionLevel_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, congestionLevel_);
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
    if (!(obj instanceof com.nci.smartcity.TrafficResponse)) {
      return super.equals(obj);
    }
    com.nci.smartcity.TrafficResponse other = (com.nci.smartcity.TrafficResponse) obj;

    if (getVehicleCount()
        != other.getVehicleCount()) return false;
    if (java.lang.Double.doubleToLongBits(getAverageSpeed())
        != java.lang.Double.doubleToLongBits(
            other.getAverageSpeed())) return false;
    if (!getCongestionLevel()
        .equals(other.getCongestionLevel())) return false;
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
    hash = (37 * hash) + VEHICLE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getVehicleCount();
    hash = (37 * hash) + AVERAGE_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAverageSpeed()));
    hash = (37 * hash) + CONGESTION_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getCongestionLevel().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nci.smartcity.TrafficResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nci.smartcity.TrafficResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.TrafficResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.TrafficResponse parseFrom(
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
  public static Builder newBuilder(com.nci.smartcity.TrafficResponse prototype) {
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
   * Protobuf type {@code TrafficResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrafficResponse)
      com.nci.smartcity.TrafficResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nci.smartcity.Smartcity.internal_static_TrafficResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nci.smartcity.Smartcity.internal_static_TrafficResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nci.smartcity.TrafficResponse.class, com.nci.smartcity.TrafficResponse.Builder.class);
    }

    // Construct using com.nci.smartcity.TrafficResponse.newBuilder()
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
      vehicleCount_ = 0;
      averageSpeed_ = 0D;
      congestionLevel_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nci.smartcity.Smartcity.internal_static_TrafficResponse_descriptor;
    }

    @java.lang.Override
    public com.nci.smartcity.TrafficResponse getDefaultInstanceForType() {
      return com.nci.smartcity.TrafficResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.nci.smartcity.TrafficResponse build() {
      com.nci.smartcity.TrafficResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.nci.smartcity.TrafficResponse buildPartial() {
      com.nci.smartcity.TrafficResponse result = new com.nci.smartcity.TrafficResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.nci.smartcity.TrafficResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vehicleCount_ = vehicleCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.averageSpeed_ = averageSpeed_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.congestionLevel_ = congestionLevel_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.nci.smartcity.TrafficResponse) {
        return mergeFrom((com.nci.smartcity.TrafficResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nci.smartcity.TrafficResponse other) {
      if (other == com.nci.smartcity.TrafficResponse.getDefaultInstance()) return this;
      if (other.getVehicleCount() != 0) {
        setVehicleCount(other.getVehicleCount());
      }
      if (other.getAverageSpeed() != 0D) {
        setAverageSpeed(other.getAverageSpeed());
      }
      if (!other.getCongestionLevel().isEmpty()) {
        congestionLevel_ = other.congestionLevel_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
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
            case 8: {
              vehicleCount_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 17: {
              averageSpeed_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 26: {
              congestionLevel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int vehicleCount_ ;
    /**
     * <code>int32 vehicle_count = 1;</code>
     * @return The vehicleCount.
     */
    @java.lang.Override
    public int getVehicleCount() {
      return vehicleCount_;
    }
    /**
     * <code>int32 vehicle_count = 1;</code>
     * @param value The vehicleCount to set.
     * @return This builder for chaining.
     */
    public Builder setVehicleCount(int value) {

      vehicleCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 vehicle_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVehicleCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vehicleCount_ = 0;
      onChanged();
      return this;
    }

    private double averageSpeed_ ;
    /**
     * <code>double average_speed = 2;</code>
     * @return The averageSpeed.
     */
    @java.lang.Override
    public double getAverageSpeed() {
      return averageSpeed_;
    }
    /**
     * <code>double average_speed = 2;</code>
     * @param value The averageSpeed to set.
     * @return This builder for chaining.
     */
    public Builder setAverageSpeed(double value) {

      averageSpeed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double average_speed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAverageSpeed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      averageSpeed_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object congestionLevel_ = "";
    /**
     * <code>string congestion_level = 3;</code>
     * @return The congestionLevel.
     */
    public java.lang.String getCongestionLevel() {
      java.lang.Object ref = congestionLevel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        congestionLevel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string congestion_level = 3;</code>
     * @return The bytes for congestionLevel.
     */
    public com.google.protobuf.ByteString
        getCongestionLevelBytes() {
      java.lang.Object ref = congestionLevel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        congestionLevel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string congestion_level = 3;</code>
     * @param value The congestionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setCongestionLevel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      congestionLevel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string congestion_level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCongestionLevel() {
      congestionLevel_ = getDefaultInstance().getCongestionLevel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string congestion_level = 3;</code>
     * @param value The bytes for congestionLevel to set.
     * @return This builder for chaining.
     */
    public Builder setCongestionLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      congestionLevel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:TrafficResponse)
  }

  // @@protoc_insertion_point(class_scope:TrafficResponse)
  private static final com.nci.smartcity.TrafficResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nci.smartcity.TrafficResponse();
  }

  public static com.nci.smartcity.TrafficResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrafficResponse>
      PARSER = new com.google.protobuf.AbstractParser<TrafficResponse>() {
    @java.lang.Override
    public TrafficResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TrafficResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrafficResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.nci.smartcity.TrafficResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

