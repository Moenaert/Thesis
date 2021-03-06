/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_bid_entity._meta;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Offset extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1887767895870511646L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Offset\",\"namespace\":\"avro_generated_types.root_bid_entity._meta\",\"fields\":[{\"name\":\"topic\",\"type\":[\"null\",\"string\"]},{\"name\":\"partition\",\"type\":[\"null\",\"long\"]},{\"name\":\"offset\",\"type\":[\"null\",\"long\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Offset> ENCODER =
      new BinaryMessageEncoder<Offset>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Offset> DECODER =
      new BinaryMessageDecoder<Offset>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Offset> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Offset> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Offset>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Offset to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Offset from a ByteBuffer. */
  public static Offset fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence topic;
  @Deprecated public java.lang.Long partition;
  @Deprecated public java.lang.Long offset;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Offset() {}

  /**
   * All-args constructor.
   * @param topic The new value for topic
   * @param partition The new value for partition
   * @param offset The new value for offset
   */
  public Offset(java.lang.CharSequence topic, java.lang.Long partition, java.lang.Long offset) {
    this.topic = topic;
    this.partition = partition;
    this.offset = offset;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return topic;
    case 1: return partition;
    case 2: return offset;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: topic = (java.lang.CharSequence)value$; break;
    case 1: partition = (java.lang.Long)value$; break;
    case 2: offset = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'topic' field.
   * @return The value of the 'topic' field.
   */
  public java.lang.CharSequence getTopic() {
    return topic;
  }

  /**
   * Sets the value of the 'topic' field.
   * @param value the value to set.
   */
  public void setTopic(java.lang.CharSequence value) {
    this.topic = value;
  }

  /**
   * Gets the value of the 'partition' field.
   * @return The value of the 'partition' field.
   */
  public java.lang.Long getPartition() {
    return partition;
  }

  /**
   * Sets the value of the 'partition' field.
   * @param value the value to set.
   */
  public void setPartition(java.lang.Long value) {
    this.partition = value;
  }

  /**
   * Gets the value of the 'offset' field.
   * @return The value of the 'offset' field.
   */
  public java.lang.Long getOffset() {
    return offset;
  }

  /**
   * Sets the value of the 'offset' field.
   * @param value the value to set.
   */
  public void setOffset(java.lang.Long value) {
    this.offset = value;
  }

  /**
   * Creates a new Offset RecordBuilder.
   * @return A new Offset RecordBuilder
   */
  public static avro_generated_types.root_bid_entity._meta.Offset.Builder newBuilder() {
    return new avro_generated_types.root_bid_entity._meta.Offset.Builder();
  }

  /**
   * Creates a new Offset RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Offset RecordBuilder
   */
  public static avro_generated_types.root_bid_entity._meta.Offset.Builder newBuilder(avro_generated_types.root_bid_entity._meta.Offset.Builder other) {
    return new avro_generated_types.root_bid_entity._meta.Offset.Builder(other);
  }

  /**
   * Creates a new Offset RecordBuilder by copying an existing Offset instance.
   * @param other The existing instance to copy.
   * @return A new Offset RecordBuilder
   */
  public static avro_generated_types.root_bid_entity._meta.Offset.Builder newBuilder(avro_generated_types.root_bid_entity._meta.Offset other) {
    return new avro_generated_types.root_bid_entity._meta.Offset.Builder(other);
  }

  /**
   * RecordBuilder for Offset instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Offset>
    implements org.apache.avro.data.RecordBuilder<Offset> {

    private java.lang.CharSequence topic;
    private java.lang.Long partition;
    private java.lang.Long offset;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_bid_entity._meta.Offset.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partition)) {
        this.partition = data().deepCopy(fields()[1].schema(), other.partition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.offset)) {
        this.offset = data().deepCopy(fields()[2].schema(), other.offset);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Offset instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_bid_entity._meta.Offset other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.topic)) {
        this.topic = data().deepCopy(fields()[0].schema(), other.topic);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partition)) {
        this.partition = data().deepCopy(fields()[1].schema(), other.partition);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.offset)) {
        this.offset = data().deepCopy(fields()[2].schema(), other.offset);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'topic' field.
      * @return The value.
      */
    public java.lang.CharSequence getTopic() {
      return topic;
    }

    /**
      * Sets the value of the 'topic' field.
      * @param value The value of 'topic'.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder setTopic(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.topic = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'topic' field has been set.
      * @return True if the 'topic' field has been set, false otherwise.
      */
    public boolean hasTopic() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'topic' field.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder clearTopic() {
      topic = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'partition' field.
      * @return The value.
      */
    public java.lang.Long getPartition() {
      return partition;
    }

    /**
      * Sets the value of the 'partition' field.
      * @param value The value of 'partition'.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder setPartition(java.lang.Long value) {
      validate(fields()[1], value);
      this.partition = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'partition' field has been set.
      * @return True if the 'partition' field has been set, false otherwise.
      */
    public boolean hasPartition() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'partition' field.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder clearPartition() {
      partition = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'offset' field.
      * @return The value.
      */
    public java.lang.Long getOffset() {
      return offset;
    }

    /**
      * Sets the value of the 'offset' field.
      * @param value The value of 'offset'.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder setOffset(java.lang.Long value) {
      validate(fields()[2], value);
      this.offset = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'offset' field has been set.
      * @return True if the 'offset' field has been set, false otherwise.
      */
    public boolean hasOffset() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'offset' field.
      * @return This builder.
      */
    public avro_generated_types.root_bid_entity._meta.Offset.Builder clearOffset() {
      offset = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Offset build() {
      try {
        Offset record = new Offset();
        record.topic = fieldSetFlags()[0] ? this.topic : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.partition = fieldSetFlags()[1] ? this.partition : (java.lang.Long) defaultValue(fields()[1]);
        record.offset = fieldSetFlags()[2] ? this.offset : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Offset>
    WRITER$ = (org.apache.avro.io.DatumWriter<Offset>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Offset>
    READER$ = (org.apache.avro.io.DatumReader<Offset>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
