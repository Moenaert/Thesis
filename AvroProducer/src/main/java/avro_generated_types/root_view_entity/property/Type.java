/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_view_entity.property;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Type extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5502682549403934292L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Type\",\"namespace\":\"avro_generated_types.root_view_entity.property\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"sortNr\",\"type\":[\"null\",\"long\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Type> ENCODER =
      new BinaryMessageEncoder<Type>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Type> DECODER =
      new BinaryMessageDecoder<Type>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Type> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Type> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Type>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Type to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Type from a ByteBuffer. */
  public static Type fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Long sortNr;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Type() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param sortNr The new value for sortNr
   */
  public Type(java.lang.CharSequence name, java.lang.Long sortNr) {
    this.name = name;
    this.sortNr = sortNr;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return sortNr;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: sortNr = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'sortNr' field.
   * @return The value of the 'sortNr' field.
   */
  public java.lang.Long getSortNr() {
    return sortNr;
  }

  /**
   * Sets the value of the 'sortNr' field.
   * @param value the value to set.
   */
  public void setSortNr(java.lang.Long value) {
    this.sortNr = value;
  }

  /**
   * Creates a new Type RecordBuilder.
   * @return A new Type RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Type.Builder newBuilder() {
    return new avro_generated_types.root_view_entity.property.Type.Builder();
  }

  /**
   * Creates a new Type RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Type RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Type.Builder newBuilder(avro_generated_types.root_view_entity.property.Type.Builder other) {
    return new avro_generated_types.root_view_entity.property.Type.Builder(other);
  }

  /**
   * Creates a new Type RecordBuilder by copying an existing Type instance.
   * @param other The existing instance to copy.
   * @return A new Type RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Type.Builder newBuilder(avro_generated_types.root_view_entity.property.Type other) {
    return new avro_generated_types.root_view_entity.property.Type.Builder(other);
  }

  /**
   * RecordBuilder for Type instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Type>
    implements org.apache.avro.data.RecordBuilder<Type> {

    private java.lang.CharSequence name;
    private java.lang.Long sortNr;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.Type.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sortNr)) {
        this.sortNr = data().deepCopy(fields()[1].schema(), other.sortNr);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Type instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.Type other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sortNr)) {
        this.sortNr = data().deepCopy(fields()[1].schema(), other.sortNr);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Type.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Type.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sortNr' field.
      * @return The value.
      */
    public java.lang.Long getSortNr() {
      return sortNr;
    }

    /**
      * Sets the value of the 'sortNr' field.
      * @param value The value of 'sortNr'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Type.Builder setSortNr(java.lang.Long value) {
      validate(fields()[1], value);
      this.sortNr = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sortNr' field has been set.
      * @return True if the 'sortNr' field has been set, false otherwise.
      */
    public boolean hasSortNr() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sortNr' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Type.Builder clearSortNr() {
      sortNr = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Type build() {
      try {
        Type record = new Type();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sortNr = fieldSetFlags()[1] ? this.sortNr : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Type>
    WRITER$ = (org.apache.avro.io.DatumWriter<Type>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Type>
    READER$ = (org.apache.avro.io.DatumReader<Type>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
