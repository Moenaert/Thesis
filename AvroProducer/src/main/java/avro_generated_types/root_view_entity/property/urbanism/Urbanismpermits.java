/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_view_entity.property.urbanism;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Urbanismpermits extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5104669874588711984L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Urbanismpermits\",\"namespace\":\"avro_generated_types.root_view_entity.property.urbanism\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",\"string\"]},{\"name\":\"number\",\"type\":[\"null\",\"string\"]},{\"name\":\"date\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]},{\"name\":\"title\",\"type\":[\"null\",\"string\"]},{\"name\":\"refused\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"expired\",\"type\":[\"null\",\"boolean\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Urbanismpermits> ENCODER =
      new BinaryMessageEncoder<Urbanismpermits>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Urbanismpermits> DECODER =
      new BinaryMessageDecoder<Urbanismpermits>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Urbanismpermits> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Urbanismpermits> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Urbanismpermits>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Urbanismpermits to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Urbanismpermits from a ByteBuffer. */
  public static Urbanismpermits fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.CharSequence number;
  @Deprecated public java.lang.Long date;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.Boolean refused;
  @Deprecated public java.lang.Boolean expired;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Urbanismpermits() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param number The new value for number
   * @param date The new value for date
   * @param title The new value for title
   * @param refused The new value for refused
   * @param expired The new value for expired
   */
  public Urbanismpermits(java.lang.CharSequence type, java.lang.CharSequence number, java.lang.Long date, java.lang.CharSequence title, java.lang.Boolean refused, java.lang.Boolean expired) {
    this.type = type;
    this.number = number;
    this.date = date;
    this.title = title;
    this.refused = refused;
    this.expired = expired;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return number;
    case 2: return date;
    case 3: return title;
    case 4: return refused;
    case 5: return expired;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.CharSequence)value$; break;
    case 1: number = (java.lang.CharSequence)value$; break;
    case 2: date = (java.lang.Long)value$; break;
    case 3: title = (java.lang.CharSequence)value$; break;
    case 4: refused = (java.lang.Boolean)value$; break;
    case 5: expired = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'number' field.
   * @return The value of the 'number' field.
   */
  public java.lang.CharSequence getNumber() {
    return number;
  }

  /**
   * Sets the value of the 'number' field.
   * @param value the value to set.
   */
  public void setNumber(java.lang.CharSequence value) {
    this.number = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.Long getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.Long value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'refused' field.
   * @return The value of the 'refused' field.
   */
  public java.lang.Boolean getRefused() {
    return refused;
  }

  /**
   * Sets the value of the 'refused' field.
   * @param value the value to set.
   */
  public void setRefused(java.lang.Boolean value) {
    this.refused = value;
  }

  /**
   * Gets the value of the 'expired' field.
   * @return The value of the 'expired' field.
   */
  public java.lang.Boolean getExpired() {
    return expired;
  }

  /**
   * Sets the value of the 'expired' field.
   * @param value the value to set.
   */
  public void setExpired(java.lang.Boolean value) {
    this.expired = value;
  }

  /**
   * Creates a new Urbanismpermits RecordBuilder.
   * @return A new Urbanismpermits RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder newBuilder() {
    return new avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder();
  }

  /**
   * Creates a new Urbanismpermits RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Urbanismpermits RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder newBuilder(avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder other) {
    return new avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder(other);
  }

  /**
   * Creates a new Urbanismpermits RecordBuilder by copying an existing Urbanismpermits instance.
   * @param other The existing instance to copy.
   * @return A new Urbanismpermits RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder newBuilder(avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits other) {
    return new avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder(other);
  }

  /**
   * RecordBuilder for Urbanismpermits instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Urbanismpermits>
    implements org.apache.avro.data.RecordBuilder<Urbanismpermits> {

    private java.lang.CharSequence type;
    private java.lang.CharSequence number;
    private java.lang.Long date;
    private java.lang.CharSequence title;
    private java.lang.Boolean refused;
    private java.lang.Boolean expired;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.number)) {
        this.number = data().deepCopy(fields()[1].schema(), other.number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.refused)) {
        this.refused = data().deepCopy(fields()[4].schema(), other.refused);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.expired)) {
        this.expired = data().deepCopy(fields()[5].schema(), other.expired);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Urbanismpermits instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.number)) {
        this.number = data().deepCopy(fields()[1].schema(), other.number);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.title)) {
        this.title = data().deepCopy(fields()[3].schema(), other.title);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.refused)) {
        this.refused = data().deepCopy(fields()[4].schema(), other.refused);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.expired)) {
        this.expired = data().deepCopy(fields()[5].schema(), other.expired);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'number' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumber() {
      return number;
    }

    /**
      * Sets the value of the 'number' field.
      * @param value The value of 'number'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setNumber(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.number = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'number' field has been set.
      * @return True if the 'number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'number' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearNumber() {
      number = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.Long getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setDate(java.lang.Long value) {
      validate(fields()[2], value);
      this.date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearDate() {
      date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.CharSequence getTitle() {
      return title;
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.title = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearTitle() {
      title = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'refused' field.
      * @return The value.
      */
    public java.lang.Boolean getRefused() {
      return refused;
    }

    /**
      * Sets the value of the 'refused' field.
      * @param value The value of 'refused'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setRefused(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.refused = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'refused' field has been set.
      * @return True if the 'refused' field has been set, false otherwise.
      */
    public boolean hasRefused() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'refused' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearRefused() {
      refused = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'expired' field.
      * @return The value.
      */
    public java.lang.Boolean getExpired() {
      return expired;
    }

    /**
      * Sets the value of the 'expired' field.
      * @param value The value of 'expired'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder setExpired(java.lang.Boolean value) {
      validate(fields()[5], value);
      this.expired = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'expired' field has been set.
      * @return True if the 'expired' field has been set, false otherwise.
      */
    public boolean hasExpired() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'expired' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.urbanism.Urbanismpermits.Builder clearExpired() {
      expired = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Urbanismpermits build() {
      try {
        Urbanismpermits record = new Urbanismpermits();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.number = fieldSetFlags()[1] ? this.number : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (java.lang.Long) defaultValue(fields()[2]);
        record.title = fieldSetFlags()[3] ? this.title : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.refused = fieldSetFlags()[4] ? this.refused : (java.lang.Boolean) defaultValue(fields()[4]);
        record.expired = fieldSetFlags()[5] ? this.expired : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Urbanismpermits>
    WRITER$ = (org.apache.avro.io.DatumWriter<Urbanismpermits>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Urbanismpermits>
    READER$ = (org.apache.avro.io.DatumReader<Urbanismpermits>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
