// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartcity.proto

package com.nci.smartcity;

public interface DiscoveryServiceListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DiscoveryServiceList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  java.util.List<com.nci.smartcity.DiscoveryServiceInfo> 
      getServicesList();
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  com.nci.smartcity.DiscoveryServiceInfo getServices(int index);
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  int getServicesCount();
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  java.util.List<? extends com.nci.smartcity.DiscoveryServiceInfoOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <code>repeated .DiscoveryServiceInfo services = 1;</code>
   */
  com.nci.smartcity.DiscoveryServiceInfoOrBuilder getServicesOrBuilder(
      int index);
}
