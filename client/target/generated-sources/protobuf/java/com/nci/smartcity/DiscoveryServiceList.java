// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartcity.proto

package com.nci.smartcity;

/**
 * Protobuf type {@code DiscoveryServiceList}
 */
public final class DiscoveryServiceList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DiscoveryServiceList)
    DiscoveryServiceListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DiscoveryServiceList.newBuilder() to construct.
  private DiscoveryServiceList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DiscoveryServiceList() {
    services_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DiscoveryServiceList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.nci.smartcity.Smartcity.internal_static_DiscoveryServiceList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.nci.smartcity.Smartcity.internal_static_DiscoveryServiceList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.nci.smartcity.DiscoveryServiceList.class, com.nci.smartcity.DiscoveryServiceList.Builder.class);
  }

  public static final int SERVICES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.nci.smartcity.DiscoveryServiceInfo> services_;
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.nci.smartcity.DiscoveryServiceInfo> getServicesList() {
    return services_;
  }
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.nci.smartcity.DiscoveryServiceInfoOrBuilder> 
      getServicesOrBuilderList() {
    return services_;
  }
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  @java.lang.Override
  public int getServicesCount() {
    return services_.size();
  }
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  @java.lang.Override
  public com.nci.smartcity.DiscoveryServiceInfo getServices(int index) {
    return services_.get(index);
  }
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  @java.lang.Override
  public com.nci.smartcity.DiscoveryServiceInfoOrBuilder getServicesOrBuilder(
      int index) {
    return services_.get(index);
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
    for (int i = 0; i < services_.size(); i++) {
      output.writeMessage(1, services_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < services_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, services_.get(i));
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
    if (!(obj instanceof com.nci.smartcity.DiscoveryServiceList)) {
      return super.equals(obj);
    }
    com.nci.smartcity.DiscoveryServiceList other = (com.nci.smartcity.DiscoveryServiceList) obj;

    if (!getServicesList()
        .equals(other.getServicesList())) return false;
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
    if (getServicesCount() > 0) {
      hash = (37 * hash) + SERVICES_FIELD_NUMBER;
      hash = (53 * hash) + getServicesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.nci.smartcity.DiscoveryServiceList parseFrom(
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
  public static Builder newBuilder(com.nci.smartcity.DiscoveryServiceList prototype) {
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
   * Protobuf type {@code DiscoveryServiceList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DiscoveryServiceList)
      com.nci.smartcity.DiscoveryServiceListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nci.smartcity.Smartcity.internal_static_DiscoveryServiceList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nci.smartcity.Smartcity.internal_static_DiscoveryServiceList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nci.smartcity.DiscoveryServiceList.class, com.nci.smartcity.DiscoveryServiceList.Builder.class);
    }

    // Construct using com.nci.smartcity.DiscoveryServiceList.newBuilder()
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
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
      } else {
        services_ = null;
        servicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.nci.smartcity.Smartcity.internal_static_DiscoveryServiceList_descriptor;
    }

    @java.lang.Override
    public com.nci.smartcity.DiscoveryServiceList getDefaultInstanceForType() {
      return com.nci.smartcity.DiscoveryServiceList.getDefaultInstance();
    }

    @java.lang.Override
    public com.nci.smartcity.DiscoveryServiceList build() {
      com.nci.smartcity.DiscoveryServiceList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.nci.smartcity.DiscoveryServiceList buildPartial() {
      com.nci.smartcity.DiscoveryServiceList result = new com.nci.smartcity.DiscoveryServiceList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.nci.smartcity.DiscoveryServiceList result) {
      if (servicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          services_ = java.util.Collections.unmodifiableList(services_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.services_ = services_;
      } else {
        result.services_ = servicesBuilder_.build();
      }
    }

    private void buildPartial0(com.nci.smartcity.DiscoveryServiceList result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.nci.smartcity.DiscoveryServiceList) {
        return mergeFrom((com.nci.smartcity.DiscoveryServiceList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.nci.smartcity.DiscoveryServiceList other) {
      if (other == com.nci.smartcity.DiscoveryServiceList.getDefaultInstance()) return this;
      if (servicesBuilder_ == null) {
        if (!other.services_.isEmpty()) {
          if (services_.isEmpty()) {
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServicesIsMutable();
            services_.addAll(other.services_);
          }
          onChanged();
        }
      } else {
        if (!other.services_.isEmpty()) {
          if (servicesBuilder_.isEmpty()) {
            servicesBuilder_.dispose();
            servicesBuilder_ = null;
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servicesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServicesFieldBuilder() : null;
          } else {
            servicesBuilder_.addAllMessages(other.services_);
          }
        }
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
            case 10: {
              com.nci.smartcity.DiscoveryServiceInfo m =
                  input.readMessage(
                      com.nci.smartcity.DiscoveryServiceInfo.parser(),
                      extensionRegistry);
              if (servicesBuilder_ == null) {
                ensureServicesIsMutable();
                services_.add(m);
              } else {
                servicesBuilder_.addMessage(m);
              }
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

    private java.util.List<com.nci.smartcity.DiscoveryServiceInfo> services_ =
      java.util.Collections.emptyList();
    private void ensureServicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        services_ = new java.util.ArrayList<com.nci.smartcity.DiscoveryServiceInfo>(services_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nci.smartcity.DiscoveryServiceInfo, com.nci.smartcity.DiscoveryServiceInfo.Builder, com.nci.smartcity.DiscoveryServiceInfoOrBuilder> servicesBuilder_;

    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public java.util.List<com.nci.smartcity.DiscoveryServiceInfo> getServicesList() {
      if (servicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(services_);
      } else {
        return servicesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public int getServicesCount() {
      if (servicesBuilder_ == null) {
        return services_.size();
      } else {
        return servicesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public com.nci.smartcity.DiscoveryServiceInfo getServices(int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder setServices(
        int index, com.nci.smartcity.DiscoveryServiceInfo value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.set(index, value);
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder setServices(
        int index, com.nci.smartcity.DiscoveryServiceInfo.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.set(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder addServices(com.nci.smartcity.DiscoveryServiceInfo value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder addServices(
        int index, com.nci.smartcity.DiscoveryServiceInfo value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(index, value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder addServices(
        com.nci.smartcity.DiscoveryServiceInfo.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder addServices(
        int index, com.nci.smartcity.DiscoveryServiceInfo.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder addAllServices(
        java.lang.Iterable<? extends com.nci.smartcity.DiscoveryServiceInfo> values) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, services_);
        onChanged();
      } else {
        servicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder clearServices() {
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servicesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public Builder removeServices(int index) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.remove(index);
        onChanged();
      } else {
        servicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public com.nci.smartcity.DiscoveryServiceInfo.Builder getServicesBuilder(
        int index) {
      return getServicesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public com.nci.smartcity.DiscoveryServiceInfoOrBuilder getServicesOrBuilder(
        int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);  } else {
        return servicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public java.util.List<? extends com.nci.smartcity.DiscoveryServiceInfoOrBuilder> 
         getServicesOrBuilderList() {
      if (servicesBuilder_ != null) {
        return servicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(services_);
      }
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public com.nci.smartcity.DiscoveryServiceInfo.Builder addServicesBuilder() {
      return getServicesFieldBuilder().addBuilder(
          com.nci.smartcity.DiscoveryServiceInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public com.nci.smartcity.DiscoveryServiceInfo.Builder addServicesBuilder(
        int index) {
      return getServicesFieldBuilder().addBuilder(
          index, com.nci.smartcity.DiscoveryServiceInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .DiscoveryServiceInfo services = 1;</code>
     */
    public java.util.List<com.nci.smartcity.DiscoveryServiceInfo.Builder> 
         getServicesBuilderList() {
      return getServicesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.nci.smartcity.DiscoveryServiceInfo, com.nci.smartcity.DiscoveryServiceInfo.Builder, com.nci.smartcity.DiscoveryServiceInfoOrBuilder> 
        getServicesFieldBuilder() {
      if (servicesBuilder_ == null) {
        servicesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.nci.smartcity.DiscoveryServiceInfo, com.nci.smartcity.DiscoveryServiceInfo.Builder, com.nci.smartcity.DiscoveryServiceInfoOrBuilder>(
                services_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        services_ = null;
      }
      return servicesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:DiscoveryServiceList)
  }

  // @@protoc_insertion_point(class_scope:DiscoveryServiceList)
  private static final com.nci.smartcity.DiscoveryServiceList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.nci.smartcity.DiscoveryServiceList();
  }

  public static com.nci.smartcity.DiscoveryServiceList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryServiceList>
      PARSER = new com.google.protobuf.AbstractParser<DiscoveryServiceList>() {
    @java.lang.Override
    public DiscoveryServiceList parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiscoveryServiceList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryServiceList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.nci.smartcity.DiscoveryServiceList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

