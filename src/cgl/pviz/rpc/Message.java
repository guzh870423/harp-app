package cgl.pviz.rpc;


public final class Message {
  private Message() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PositionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required double x = 1;
    /**
     * <code>required double x = 1;</code>
     */
    boolean hasX();
    /**
     * <code>required double x = 1;</code>
     */
    double getX();

    // required double y = 2;
    /**
     * <code>required double y = 2;</code>
     */
    boolean hasY();
    /**
     * <code>required double y = 2;</code>
     */
    double getY();

    // required double z = 3;
    /**
     * <code>required double z = 3;</code>
     */
    boolean hasZ();
    /**
     * <code>required double z = 3;</code>
     */
    double getZ();
  }
  /**
   * Protobuf type {@code cgl.pviz.rpc.Position}
   */
  public static final class Position extends
      com.google.protobuf.GeneratedMessage
      implements PositionOrBuilder {
    // Use Position.newBuilder() to construct.
    private Position(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Position(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Position defaultInstance;
    public static Position getDefaultInstance() {
      return defaultInstance;
    }

    public Position getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Position(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 9: {
              bitField0_ |= 0x00000001;
              x_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              y_ = input.readDouble();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              z_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_Position_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cgl.pviz.rpc.Message.Position.class, cgl.pviz.rpc.Message.Position.Builder.class);
    }

    public static com.google.protobuf.Parser<Position> PARSER =
        new com.google.protobuf.AbstractParser<Position>() {
      public Position parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Position(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Position> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required double x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>required double x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required double x = 1;</code>
     */
    public double getX() {
      return x_;
    }

    // required double y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>required double y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required double y = 2;</code>
     */
    public double getY() {
      return y_;
    }

    // required double z = 3;
    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>required double z = 3;</code>
     */
    public boolean hasZ() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required double z = 3;</code>
     */
    public double getZ() {
      return z_;
    }

    private void initFields() {
      x_ = 0D;
      y_ = 0D;
      z_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasX()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasY()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasZ()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeDouble(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeDouble(3, z_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cgl.pviz.rpc.Message.Position parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.Position parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cgl.pviz.rpc.Message.Position parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cgl.pviz.rpc.Message.Position parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cgl.pviz.rpc.Message.Position prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code cgl.pviz.rpc.Position}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cgl.pviz.rpc.Message.PositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_Position_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_Position_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cgl.pviz.rpc.Message.Position.class, cgl.pviz.rpc.Message.Position.Builder.class);
      }

      // Construct using cgl.pviz.rpc.Message.Position.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        x_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        z_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_Position_descriptor;
      }

      public cgl.pviz.rpc.Message.Position getDefaultInstanceForType() {
        return cgl.pviz.rpc.Message.Position.getDefaultInstance();
      }

      public cgl.pviz.rpc.Message.Position build() {
        cgl.pviz.rpc.Message.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cgl.pviz.rpc.Message.Position buildPartial() {
        cgl.pviz.rpc.Message.Position result = new cgl.pviz.rpc.Message.Position(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.z_ = z_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cgl.pviz.rpc.Message.Position) {
          return mergeFrom((cgl.pviz.rpc.Message.Position)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cgl.pviz.rpc.Message.Position other) {
        if (other == cgl.pviz.rpc.Message.Position.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        if (other.hasZ()) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasX()) {
          
          return false;
        }
        if (!hasY()) {
          
          return false;
        }
        if (!hasZ()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cgl.pviz.rpc.Message.Position parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cgl.pviz.rpc.Message.Position) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required double x = 1;
      private double x_ ;
      /**
       * <code>required double x = 1;</code>
       */
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required double x = 1;</code>
       */
      public double getX() {
        return x_;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder setX(double value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double x = 1;</code>
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0D;
        onChanged();
        return this;
      }

      // required double y = 2;
      private double y_ ;
      /**
       * <code>required double y = 2;</code>
       */
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required double y = 2;</code>
       */
      public double getY() {
        return y_;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder setY(double value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double y = 2;</code>
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0D;
        onChanged();
        return this;
      }

      // required double z = 3;
      private double z_ ;
      /**
       * <code>required double z = 3;</code>
       */
      public boolean hasZ() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required double z = 3;</code>
       */
      public double getZ() {
        return z_;
      }
      /**
       * <code>required double z = 3;</code>
       */
      public Builder setZ(double value) {
        bitField0_ |= 0x00000004;
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required double z = 3;</code>
       */
      public Builder clearZ() {
        bitField0_ = (bitField0_ & ~0x00000004);
        z_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:cgl.pviz.rpc.Position)
    }

    static {
      defaultInstance = new Position(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:cgl.pviz.rpc.Position)
  }

  public interface PvizMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;
    /**
     * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
     */
    cgl.pviz.rpc.Message.PvizMessage.mtype getType();

    // required int64 Timestamp = 2;
    /**
     * <code>required int64 Timestamp = 2;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 Timestamp = 2;</code>
     */
    long getTimestamp();

    // required int64 Stepid = 3;
    /**
     * <code>required int64 Stepid = 3;</code>
     */
    boolean hasStepid();
    /**
     * <code>required int64 Stepid = 3;</code>
     */
    long getStepid();

    // repeated int32 Labels = 4;
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    java.util.List<java.lang.Integer> getLabelsList();
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    int getLabelsCount();
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    int getLabels(int index);

    // repeated .cgl.pviz.rpc.Position Positions = 5;
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    java.util.List<cgl.pviz.rpc.Message.Position> 
        getPositionsList();
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    cgl.pviz.rpc.Message.Position getPositions(int index);
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    int getPositionsCount();
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    java.util.List<? extends cgl.pviz.rpc.Message.PositionOrBuilder> 
        getPositionsOrBuilderList();
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    cgl.pviz.rpc.Message.PositionOrBuilder getPositionsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code cgl.pviz.rpc.PvizMessage}
   */
  public static final class PvizMessage extends
      com.google.protobuf.GeneratedMessage
      implements PvizMessageOrBuilder {
    // Use PvizMessage.newBuilder() to construct.
    private PvizMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PvizMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PvizMessage defaultInstance;
    public static PvizMessage getDefaultInstance() {
      return defaultInstance;
    }

    public PvizMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PvizMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              cgl.pviz.rpc.Message.PvizMessage.mtype value = cgl.pviz.rpc.Message.PvizMessage.mtype.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              timestamp_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              stepid_ = input.readInt64();
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                labels_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              labels_.add(input.readInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                labels_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                labels_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                positions_ = new java.util.ArrayList<cgl.pviz.rpc.Message.Position>();
                mutable_bitField0_ |= 0x00000010;
              }
              positions_.add(input.readMessage(cgl.pviz.rpc.Message.Position.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_PvizMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_PvizMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cgl.pviz.rpc.Message.PvizMessage.class, cgl.pviz.rpc.Message.PvizMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<PvizMessage> PARSER =
        new com.google.protobuf.AbstractParser<PvizMessage>() {
      public PvizMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PvizMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PvizMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code cgl.pviz.rpc.PvizMessage.mtype}
     */
    public enum mtype
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>DATA = 0;</code>
       */
      DATA(0, 0),
      /**
       * <code>SYNC = 1;</code>
       */
      SYNC(1, 1),
      /**
       * <code>FIN = 2;</code>
       */
      FIN(2, 2),
      ;

      /**
       * <code>DATA = 0;</code>
       */
      public static final int DATA_VALUE = 0;
      /**
       * <code>SYNC = 1;</code>
       */
      public static final int SYNC_VALUE = 1;
      /**
       * <code>FIN = 2;</code>
       */
      public static final int FIN_VALUE = 2;


      public final int getNumber() { return value; }

      public static mtype valueOf(int value) {
        switch (value) {
          case 0: return DATA;
          case 1: return SYNC;
          case 2: return FIN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<mtype>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<mtype>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<mtype>() {
              public mtype findValueByNumber(int number) {
                return mtype.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return cgl.pviz.rpc.Message.PvizMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final mtype[] VALUES = values();

      public static mtype valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private mtype(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:cgl.pviz.rpc.PvizMessage.mtype)
    }

    private int bitField0_;
    // required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private cgl.pviz.rpc.Message.PvizMessage.mtype type_;
    /**
     * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
     */
    public cgl.pviz.rpc.Message.PvizMessage.mtype getType() {
      return type_;
    }

    // required int64 Timestamp = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>required int64 Timestamp = 2;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 Timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    // required int64 Stepid = 3;
    public static final int STEPID_FIELD_NUMBER = 3;
    private long stepid_;
    /**
     * <code>required int64 Stepid = 3;</code>
     */
    public boolean hasStepid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 Stepid = 3;</code>
     */
    public long getStepid() {
      return stepid_;
    }

    // repeated int32 Labels = 4;
    public static final int LABELS_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> labels_;
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    public java.util.List<java.lang.Integer>
        getLabelsList() {
      return labels_;
    }
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     * <code>repeated int32 Labels = 4;</code>
     */
    public int getLabels(int index) {
      return labels_.get(index);
    }

    // repeated .cgl.pviz.rpc.Position Positions = 5;
    public static final int POSITIONS_FIELD_NUMBER = 5;
    private java.util.List<cgl.pviz.rpc.Message.Position> positions_;
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    public java.util.List<cgl.pviz.rpc.Message.Position> getPositionsList() {
      return positions_;
    }
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    public java.util.List<? extends cgl.pviz.rpc.Message.PositionOrBuilder> 
        getPositionsOrBuilderList() {
      return positions_;
    }
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    public cgl.pviz.rpc.Message.Position getPositions(int index) {
      return positions_.get(index);
    }
    /**
     * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
     */
    public cgl.pviz.rpc.Message.PositionOrBuilder getPositionsOrBuilder(
        int index) {
      return positions_.get(index);
    }

    private void initFields() {
      type_ = cgl.pviz.rpc.Message.PvizMessage.mtype.DATA;
      timestamp_ = 0L;
      stepid_ = 0L;
      labels_ = java.util.Collections.emptyList();
      positions_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStepid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getPositionsCount(); i++) {
        if (!getPositions(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, stepid_);
      }
      for (int i = 0; i < labels_.size(); i++) {
        output.writeInt32(4, labels_.get(i));
      }
      for (int i = 0; i < positions_.size(); i++) {
        output.writeMessage(5, positions_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, stepid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < labels_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(labels_.get(i));
        }
        size += dataSize;
        size += 1 * getLabelsList().size();
      }
      for (int i = 0; i < positions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, positions_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static cgl.pviz.rpc.Message.PvizMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(cgl.pviz.rpc.Message.PvizMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code cgl.pviz.rpc.PvizMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements cgl.pviz.rpc.Message.PvizMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_PvizMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_PvizMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cgl.pviz.rpc.Message.PvizMessage.class, cgl.pviz.rpc.Message.PvizMessage.Builder.class);
      }

      // Construct using cgl.pviz.rpc.Message.PvizMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPositionsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = cgl.pviz.rpc.Message.PvizMessage.mtype.DATA;
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        stepid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cgl.pviz.rpc.Message.internal_static_cgl_pviz_rpc_PvizMessage_descriptor;
      }

      public cgl.pviz.rpc.Message.PvizMessage getDefaultInstanceForType() {
        return cgl.pviz.rpc.Message.PvizMessage.getDefaultInstance();
      }

      public cgl.pviz.rpc.Message.PvizMessage build() {
        cgl.pviz.rpc.Message.PvizMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cgl.pviz.rpc.Message.PvizMessage buildPartial() {
        cgl.pviz.rpc.Message.PvizMessage result = new cgl.pviz.rpc.Message.PvizMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.stepid_ = stepid_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.labels_ = labels_;
        if (positionsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            positions_ = java.util.Collections.unmodifiableList(positions_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.positions_ = positions_;
        } else {
          result.positions_ = positionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cgl.pviz.rpc.Message.PvizMessage) {
          return mergeFrom((cgl.pviz.rpc.Message.PvizMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cgl.pviz.rpc.Message.PvizMessage other) {
        if (other == cgl.pviz.rpc.Message.PvizMessage.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasStepid()) {
          setStepid(other.getStepid());
        }
        if (!other.labels_.isEmpty()) {
          if (labels_.isEmpty()) {
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureLabelsIsMutable();
            labels_.addAll(other.labels_);
          }
          onChanged();
        }
        if (positionsBuilder_ == null) {
          if (!other.positions_.isEmpty()) {
            if (positions_.isEmpty()) {
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensurePositionsIsMutable();
              positions_.addAll(other.positions_);
            }
            onChanged();
          }
        } else {
          if (!other.positions_.isEmpty()) {
            if (positionsBuilder_.isEmpty()) {
              positionsBuilder_.dispose();
              positionsBuilder_ = null;
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000010);
              positionsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPositionsFieldBuilder() : null;
            } else {
              positionsBuilder_.addAllMessages(other.positions_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasTimestamp()) {
          
          return false;
        }
        if (!hasStepid()) {
          
          return false;
        }
        for (int i = 0; i < getPositionsCount(); i++) {
          if (!getPositions(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cgl.pviz.rpc.Message.PvizMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cgl.pviz.rpc.Message.PvizMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;
      private cgl.pviz.rpc.Message.PvizMessage.mtype type_ = cgl.pviz.rpc.Message.PvizMessage.mtype.DATA;
      /**
       * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
       */
      public cgl.pviz.rpc.Message.PvizMessage.mtype getType() {
        return type_;
      }
      /**
       * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
       */
      public Builder setType(cgl.pviz.rpc.Message.PvizMessage.mtype value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .cgl.pviz.rpc.PvizMessage.mtype Type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = cgl.pviz.rpc.Message.PvizMessage.mtype.DATA;
        onChanged();
        return this;
      }

      // required int64 Timestamp = 2;
      private long timestamp_ ;
      /**
       * <code>required int64 Timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 Timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 Timestamp = 2;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 Timestamp = 2;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // required int64 Stepid = 3;
      private long stepid_ ;
      /**
       * <code>required int64 Stepid = 3;</code>
       */
      public boolean hasStepid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 Stepid = 3;</code>
       */
      public long getStepid() {
        return stepid_;
      }
      /**
       * <code>required int64 Stepid = 3;</code>
       */
      public Builder setStepid(long value) {
        bitField0_ |= 0x00000004;
        stepid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 Stepid = 3;</code>
       */
      public Builder clearStepid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stepid_ = 0L;
        onChanged();
        return this;
      }

      // repeated int32 Labels = 4;
      private java.util.List<java.lang.Integer> labels_ = java.util.Collections.emptyList();
      private void ensureLabelsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          labels_ = new java.util.ArrayList<java.lang.Integer>(labels_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public java.util.List<java.lang.Integer>
          getLabelsList() {
        return java.util.Collections.unmodifiableList(labels_);
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public int getLabelsCount() {
        return labels_.size();
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public int getLabels(int index) {
        return labels_.get(index);
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public Builder setLabels(
          int index, int value) {
        ensureLabelsIsMutable();
        labels_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public Builder addLabels(int value) {
        ensureLabelsIsMutable();
        labels_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public Builder addAllLabels(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLabelsIsMutable();
        super.addAll(values, labels_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 Labels = 4;</code>
       */
      public Builder clearLabels() {
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      // repeated .cgl.pviz.rpc.Position Positions = 5;
      private java.util.List<cgl.pviz.rpc.Message.Position> positions_ =
        java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          positions_ = new java.util.ArrayList<cgl.pviz.rpc.Message.Position>(positions_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          cgl.pviz.rpc.Message.Position, cgl.pviz.rpc.Message.Position.Builder, cgl.pviz.rpc.Message.PositionOrBuilder> positionsBuilder_;

      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public java.util.List<cgl.pviz.rpc.Message.Position> getPositionsList() {
        if (positionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(positions_);
        } else {
          return positionsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public int getPositionsCount() {
        if (positionsBuilder_ == null) {
          return positions_.size();
        } else {
          return positionsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public cgl.pviz.rpc.Message.Position getPositions(int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);
        } else {
          return positionsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder setPositions(
          int index, cgl.pviz.rpc.Message.Position value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.set(index, value);
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder setPositions(
          int index, cgl.pviz.rpc.Message.Position.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder addPositions(cgl.pviz.rpc.Message.Position value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder addPositions(
          int index, cgl.pviz.rpc.Message.Position value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(index, value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder addPositions(
          cgl.pviz.rpc.Message.Position.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder addPositions(
          int index, cgl.pviz.rpc.Message.Position.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends cgl.pviz.rpc.Message.Position> values) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          super.addAll(values, positions_);
          onChanged();
        } else {
          positionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder clearPositions() {
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public Builder removePositions(int index) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.remove(index);
          onChanged();
        } else {
          positionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public cgl.pviz.rpc.Message.Position.Builder getPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public cgl.pviz.rpc.Message.PositionOrBuilder getPositionsOrBuilder(
          int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);  } else {
          return positionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public java.util.List<? extends cgl.pviz.rpc.Message.PositionOrBuilder> 
           getPositionsOrBuilderList() {
        if (positionsBuilder_ != null) {
          return positionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(positions_);
        }
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public cgl.pviz.rpc.Message.Position.Builder addPositionsBuilder() {
        return getPositionsFieldBuilder().addBuilder(
            cgl.pviz.rpc.Message.Position.getDefaultInstance());
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public cgl.pviz.rpc.Message.Position.Builder addPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().addBuilder(
            index, cgl.pviz.rpc.Message.Position.getDefaultInstance());
      }
      /**
       * <code>repeated .cgl.pviz.rpc.Position Positions = 5;</code>
       */
      public java.util.List<cgl.pviz.rpc.Message.Position.Builder> 
           getPositionsBuilderList() {
        return getPositionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          cgl.pviz.rpc.Message.Position, cgl.pviz.rpc.Message.Position.Builder, cgl.pviz.rpc.Message.PositionOrBuilder> 
          getPositionsFieldBuilder() {
        if (positionsBuilder_ == null) {
          positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              cgl.pviz.rpc.Message.Position, cgl.pviz.rpc.Message.Position.Builder, cgl.pviz.rpc.Message.PositionOrBuilder>(
                  positions_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          positions_ = null;
        }
        return positionsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:cgl.pviz.rpc.PvizMessage)
    }

    static {
      defaultInstance = new PvizMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:cgl.pviz.rpc.PvizMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cgl_pviz_rpc_Position_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cgl_pviz_rpc_Position_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_cgl_pviz_rpc_PvizMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_cgl_pviz_rpc_PvizMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\014cgl.pviz.rpc\"+\n\010Positio" +
      "n\022\t\n\001x\030\001 \002(\001\022\t\n\001y\030\002 \002(\001\022\t\n\001z\030\003 \002(\001\"\300\001\n\013P" +
      "vizMessage\022-\n\004Type\030\001 \002(\0162\037.cgl.pviz.rpc." +
      "PvizMessage.mtype\022\021\n\tTimestamp\030\002 \002(\003\022\016\n\006" +
      "Stepid\030\003 \002(\003\022\016\n\006Labels\030\004 \003(\005\022)\n\tPosition" +
      "s\030\005 \003(\0132\026.cgl.pviz.rpc.Position\"$\n\005mtype" +
      "\022\010\n\004DATA\020\000\022\010\n\004SYNC\020\001\022\007\n\003FIN\020\002"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_cgl_pviz_rpc_Position_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_cgl_pviz_rpc_Position_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cgl_pviz_rpc_Position_descriptor,
              new java.lang.String[] { "X", "Y", "Z", });
          internal_static_cgl_pviz_rpc_PvizMessage_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_cgl_pviz_rpc_PvizMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_cgl_pviz_rpc_PvizMessage_descriptor,
              new java.lang.String[] { "Type", "Timestamp", "Stepid", "Labels", "Positions", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
