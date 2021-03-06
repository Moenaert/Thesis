/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_view_entity.auction;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Infosessiondetailsmultilingual extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8842376069175894406L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Infosessiondetailsmultilingual\",\"namespace\":\"avro_generated_types.root_view_entity.auction\",\"fields\":[{\"name\":\"fr\",\"type\":[\"null\",\"string\"]},{\"name\":\"nl\",\"type\":[\"null\",\"string\"]},{\"name\":\"en\",\"type\":[\"null\",\"string\"]},{\"name\":\"de\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Infosessiondetailsmultilingual> ENCODER =
      new BinaryMessageEncoder<Infosessiondetailsmultilingual>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Infosessiondetailsmultilingual> DECODER =
      new BinaryMessageDecoder<Infosessiondetailsmultilingual>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Infosessiondetailsmultilingual> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Infosessiondetailsmultilingual> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Infosessiondetailsmultilingual>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Infosessiondetailsmultilingual to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Infosessiondetailsmultilingual from a ByteBuffer. */
  public static Infosessiondetailsmultilingual fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence fr;
  @Deprecated public java.lang.CharSequence nl;
  @Deprecated public java.lang.CharSequence en;
  @Deprecated public java.lang.CharSequence de;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Infosessiondetailsmultilingual() {}

  /**
   * All-args constructor.
   * @param fr The new value for fr
   * @param nl The new value for nl
   * @param en The new value for en
   * @param de The new value for de
   */
  public Infosessiondetailsmultilingual(java.lang.CharSequence fr, java.lang.CharSequence nl, java.lang.CharSequence en, java.lang.CharSequence de) {
    this.fr = fr;
    this.nl = nl;
    this.en = en;
    this.de = de;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fr;
    case 1: return nl;
    case 2: return en;
    case 3: return de;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fr = (java.lang.CharSequence)value$; break;
    case 1: nl = (java.lang.CharSequence)value$; break;
    case 2: en = (java.lang.CharSequence)value$; break;
    case 3: de = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fr' field.
   * @return The value of the 'fr' field.
   */
  public java.lang.CharSequence getFr() {
    return fr;
  }

  /**
   * Sets the value of the 'fr' field.
   * @param value the value to set.
   */
  public void setFr(java.lang.CharSequence value) {
    this.fr = value;
  }

  /**
   * Gets the value of the 'nl' field.
   * @return The value of the 'nl' field.
   */
  public java.lang.CharSequence getNl() {
    return nl;
  }

  /**
   * Sets the value of the 'nl' field.
   * @param value the value to set.
   */
  public void setNl(java.lang.CharSequence value) {
    this.nl = value;
  }

  /**
   * Gets the value of the 'en' field.
   * @return The value of the 'en' field.
   */
  public java.lang.CharSequence getEn() {
    return en;
  }

  /**
   * Sets the value of the 'en' field.
   * @param value the value to set.
   */
  public void setEn(java.lang.CharSequence value) {
    this.en = value;
  }

  /**
   * Gets the value of the 'de' field.
   * @return The value of the 'de' field.
   */
  public java.lang.CharSequence getDe() {
    return de;
  }

  /**
   * Sets the value of the 'de' field.
   * @param value the value to set.
   */
  public void setDe(java.lang.CharSequence value) {
    this.de = value;
  }

  /**
   * Creates a new Infosessiondetailsmultilingual RecordBuilder.
   * @return A new Infosessiondetailsmultilingual RecordBuilder
   */
  public static avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder newBuilder() {
    return new avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder();
  }

  /**
   * Creates a new Infosessiondetailsmultilingual RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Infosessiondetailsmultilingual RecordBuilder
   */
  public static avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder newBuilder(avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder other) {
    return new avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder(other);
  }

  /**
   * Creates a new Infosessiondetailsmultilingual RecordBuilder by copying an existing Infosessiondetailsmultilingual instance.
   * @param other The existing instance to copy.
   * @return A new Infosessiondetailsmultilingual RecordBuilder
   */
  public static avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder newBuilder(avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual other) {
    return new avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder(other);
  }

  /**
   * RecordBuilder for Infosessiondetailsmultilingual instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Infosessiondetailsmultilingual>
    implements org.apache.avro.data.RecordBuilder<Infosessiondetailsmultilingual> {

    private java.lang.CharSequence fr;
    private java.lang.CharSequence nl;
    private java.lang.CharSequence en;
    private java.lang.CharSequence de;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.fr)) {
        this.fr = data().deepCopy(fields()[0].schema(), other.fr);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nl)) {
        this.nl = data().deepCopy(fields()[1].schema(), other.nl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.en)) {
        this.en = data().deepCopy(fields()[2].schema(), other.en);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.de)) {
        this.de = data().deepCopy(fields()[3].schema(), other.de);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Infosessiondetailsmultilingual instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.fr)) {
        this.fr = data().deepCopy(fields()[0].schema(), other.fr);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nl)) {
        this.nl = data().deepCopy(fields()[1].schema(), other.nl);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.en)) {
        this.en = data().deepCopy(fields()[2].schema(), other.en);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.de)) {
        this.de = data().deepCopy(fields()[3].schema(), other.de);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'fr' field.
      * @return The value.
      */
    public java.lang.CharSequence getFr() {
      return fr;
    }

    /**
      * Sets the value of the 'fr' field.
      * @param value The value of 'fr'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder setFr(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.fr = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'fr' field has been set.
      * @return True if the 'fr' field has been set, false otherwise.
      */
    public boolean hasFr() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'fr' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder clearFr() {
      fr = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nl' field.
      * @return The value.
      */
    public java.lang.CharSequence getNl() {
      return nl;
    }

    /**
      * Sets the value of the 'nl' field.
      * @param value The value of 'nl'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder setNl(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nl = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nl' field has been set.
      * @return True if the 'nl' field has been set, false otherwise.
      */
    public boolean hasNl() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nl' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder clearNl() {
      nl = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'en' field.
      * @return The value.
      */
    public java.lang.CharSequence getEn() {
      return en;
    }

    /**
      * Sets the value of the 'en' field.
      * @param value The value of 'en'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder setEn(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.en = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'en' field has been set.
      * @return True if the 'en' field has been set, false otherwise.
      */
    public boolean hasEn() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'en' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder clearEn() {
      en = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'de' field.
      * @return The value.
      */
    public java.lang.CharSequence getDe() {
      return de;
    }

    /**
      * Sets the value of the 'de' field.
      * @param value The value of 'de'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder setDe(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.de = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'de' field has been set.
      * @return True if the 'de' field has been set, false otherwise.
      */
    public boolean hasDe() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'de' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.auction.Infosessiondetailsmultilingual.Builder clearDe() {
      de = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Infosessiondetailsmultilingual build() {
      try {
        Infosessiondetailsmultilingual record = new Infosessiondetailsmultilingual();
        record.fr = fieldSetFlags()[0] ? this.fr : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.nl = fieldSetFlags()[1] ? this.nl : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.en = fieldSetFlags()[2] ? this.en : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.de = fieldSetFlags()[3] ? this.de : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Infosessiondetailsmultilingual>
    WRITER$ = (org.apache.avro.io.DatumWriter<Infosessiondetailsmultilingual>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Infosessiondetailsmultilingual>
    READER$ = (org.apache.avro.io.DatumReader<Infosessiondetailsmultilingual>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
