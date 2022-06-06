/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_account_entity;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class References extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2241994374816114569L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"References\",\"namespace\":\"avro_generated_types.root_account_entity\",\"fields\":[{\"name\":\"NN\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<References> ENCODER =
      new BinaryMessageEncoder<References>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<References> DECODER =
      new BinaryMessageDecoder<References>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<References> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<References> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<References>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this References to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a References from a ByteBuffer. */
  public static References fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence NN;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public References() {}

  /**
   * All-args constructor.
   * @param NN The new value for NN
   */
  public References(java.lang.CharSequence NN) {
    this.NN = NN;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return NN;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: NN = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'NN' field.
   * @return The value of the 'NN' field.
   */
  public java.lang.CharSequence getNN() {
    return NN;
  }

  /**
   * Sets the value of the 'NN' field.
   * @param value the value to set.
   */
  public void setNN(java.lang.CharSequence value) {
    this.NN = value;
  }

  /**
   * Creates a new References RecordBuilder.
   * @return A new References RecordBuilder
   */
  public static avro_generated_types.root_account_entity.References.Builder newBuilder() {
    return new avro_generated_types.root_account_entity.References.Builder();
  }

  /**
   * Creates a new References RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new References RecordBuilder
   */
  public static avro_generated_types.root_account_entity.References.Builder newBuilder(avro_generated_types.root_account_entity.References.Builder other) {
    return new avro_generated_types.root_account_entity.References.Builder(other);
  }

  /**
   * Creates a new References RecordBuilder by copying an existing References instance.
   * @param other The existing instance to copy.
   * @return A new References RecordBuilder
   */
  public static avro_generated_types.root_account_entity.References.Builder newBuilder(avro_generated_types.root_account_entity.References other) {
    return new avro_generated_types.root_account_entity.References.Builder(other);
  }

  /**
   * RecordBuilder for References instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<References>
    implements org.apache.avro.data.RecordBuilder<References> {

    private java.lang.CharSequence NN;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_account_entity.References.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.NN)) {
        this.NN = data().deepCopy(fields()[0].schema(), other.NN);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing References instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_account_entity.References other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.NN)) {
        this.NN = data().deepCopy(fields()[0].schema(), other.NN);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'NN' field.
      * @return The value.
      */
    public java.lang.CharSequence getNN() {
      return NN;
    }

    /**
      * Sets the value of the 'NN' field.
      * @param value The value of 'NN'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.References.Builder setNN(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.NN = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'NN' field has been set.
      * @return True if the 'NN' field has been set, false otherwise.
      */
    public boolean hasNN() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'NN' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.References.Builder clearNN() {
      NN = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public References build() {
      try {
        References record = new References();
        record.NN = fieldSetFlags()[0] ? this.NN : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<References>
    WRITER$ = (org.apache.avro.io.DatumWriter<References>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<References>
    READER$ = (org.apache.avro.io.DatumReader<References>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
