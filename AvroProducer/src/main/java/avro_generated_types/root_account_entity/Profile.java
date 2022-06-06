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
public class Profile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 145666478132572296L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Profile\",\"namespace\":\"avro_generated_types.root_account_entity\",\"fields\":[{\"name\":\"notificationPreferences\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Notificationpreferences\",\"namespace\":\"avro_generated_types.root_account_entity.profile\",\"fields\":[{\"name\":\"emailEnabled\",\"type\":[\"null\",\"boolean\"]}]}]},{\"name\":\"language\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Profile> ENCODER =
      new BinaryMessageEncoder<Profile>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Profile> DECODER =
      new BinaryMessageDecoder<Profile>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Profile> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Profile> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Profile>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Profile to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Profile from a ByteBuffer. */
  public static Profile fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public avro_generated_types.root_account_entity.profile.Notificationpreferences notificationPreferences;
  @Deprecated public java.lang.CharSequence language;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Profile() {}

  /**
   * All-args constructor.
   * @param notificationPreferences The new value for notificationPreferences
   * @param language The new value for language
   */
  public Profile(avro_generated_types.root_account_entity.profile.Notificationpreferences notificationPreferences, java.lang.CharSequence language) {
    this.notificationPreferences = notificationPreferences;
    this.language = language;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return notificationPreferences;
    case 1: return language;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: notificationPreferences = (avro_generated_types.root_account_entity.profile.Notificationpreferences)value$; break;
    case 1: language = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'notificationPreferences' field.
   * @return The value of the 'notificationPreferences' field.
   */
  public avro_generated_types.root_account_entity.profile.Notificationpreferences getNotificationPreferences() {
    return notificationPreferences;
  }

  /**
   * Sets the value of the 'notificationPreferences' field.
   * @param value the value to set.
   */
  public void setNotificationPreferences(avro_generated_types.root_account_entity.profile.Notificationpreferences value) {
    this.notificationPreferences = value;
  }

  /**
   * Gets the value of the 'language' field.
   * @return The value of the 'language' field.
   */
  public java.lang.CharSequence getLanguage() {
    return language;
  }

  /**
   * Sets the value of the 'language' field.
   * @param value the value to set.
   */
  public void setLanguage(java.lang.CharSequence value) {
    this.language = value;
  }

  /**
   * Creates a new Profile RecordBuilder.
   * @return A new Profile RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Profile.Builder newBuilder() {
    return new avro_generated_types.root_account_entity.Profile.Builder();
  }

  /**
   * Creates a new Profile RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Profile RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Profile.Builder newBuilder(avro_generated_types.root_account_entity.Profile.Builder other) {
    return new avro_generated_types.root_account_entity.Profile.Builder(other);
  }

  /**
   * Creates a new Profile RecordBuilder by copying an existing Profile instance.
   * @param other The existing instance to copy.
   * @return A new Profile RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Profile.Builder newBuilder(avro_generated_types.root_account_entity.Profile other) {
    return new avro_generated_types.root_account_entity.Profile.Builder(other);
  }

  /**
   * RecordBuilder for Profile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Profile>
    implements org.apache.avro.data.RecordBuilder<Profile> {

    private avro_generated_types.root_account_entity.profile.Notificationpreferences notificationPreferences;
    private avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder notificationPreferencesBuilder;
    private java.lang.CharSequence language;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_account_entity.Profile.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.notificationPreferences)) {
        this.notificationPreferences = data().deepCopy(fields()[0].schema(), other.notificationPreferences);
        fieldSetFlags()[0] = true;
      }
      if (other.hasNotificationPreferencesBuilder()) {
        this.notificationPreferencesBuilder = avro_generated_types.root_account_entity.profile.Notificationpreferences.newBuilder(other.getNotificationPreferencesBuilder());
      }
      if (isValidValue(fields()[1], other.language)) {
        this.language = data().deepCopy(fields()[1].schema(), other.language);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Profile instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_account_entity.Profile other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.notificationPreferences)) {
        this.notificationPreferences = data().deepCopy(fields()[0].schema(), other.notificationPreferences);
        fieldSetFlags()[0] = true;
      }
      this.notificationPreferencesBuilder = null;
      if (isValidValue(fields()[1], other.language)) {
        this.language = data().deepCopy(fields()[1].schema(), other.language);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'notificationPreferences' field.
      * @return The value.
      */
    public avro_generated_types.root_account_entity.profile.Notificationpreferences getNotificationPreferences() {
      return notificationPreferences;
    }

    /**
      * Sets the value of the 'notificationPreferences' field.
      * @param value The value of 'notificationPreferences'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Profile.Builder setNotificationPreferences(avro_generated_types.root_account_entity.profile.Notificationpreferences value) {
      validate(fields()[0], value);
      this.notificationPreferencesBuilder = null;
      this.notificationPreferences = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'notificationPreferences' field has been set.
      * @return True if the 'notificationPreferences' field has been set, false otherwise.
      */
    public boolean hasNotificationPreferences() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'notificationPreferences' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder getNotificationPreferencesBuilder() {
      if (notificationPreferencesBuilder == null) {
        if (hasNotificationPreferences()) {
          setNotificationPreferencesBuilder(avro_generated_types.root_account_entity.profile.Notificationpreferences.newBuilder(notificationPreferences));
        } else {
          setNotificationPreferencesBuilder(avro_generated_types.root_account_entity.profile.Notificationpreferences.newBuilder());
        }
      }
      return notificationPreferencesBuilder;
    }

    /**
     * Sets the Builder instance for the 'notificationPreferences' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Profile.Builder setNotificationPreferencesBuilder(avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder value) {
      clearNotificationPreferences();
      notificationPreferencesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'notificationPreferences' field has an active Builder instance
     * @return True if the 'notificationPreferences' field has an active Builder instance
     */
    public boolean hasNotificationPreferencesBuilder() {
      return notificationPreferencesBuilder != null;
    }

    /**
      * Clears the value of the 'notificationPreferences' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Profile.Builder clearNotificationPreferences() {
      notificationPreferences = null;
      notificationPreferencesBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'language' field.
      * @return The value.
      */
    public java.lang.CharSequence getLanguage() {
      return language;
    }

    /**
      * Sets the value of the 'language' field.
      * @param value The value of 'language'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Profile.Builder setLanguage(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.language = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'language' field has been set.
      * @return True if the 'language' field has been set, false otherwise.
      */
    public boolean hasLanguage() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'language' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Profile.Builder clearLanguage() {
      language = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Profile build() {
      try {
        Profile record = new Profile();
        if (notificationPreferencesBuilder != null) {
          record.notificationPreferences = this.notificationPreferencesBuilder.build();
        } else {
          record.notificationPreferences = fieldSetFlags()[0] ? this.notificationPreferences : (avro_generated_types.root_account_entity.profile.Notificationpreferences) defaultValue(fields()[0]);
        }
        record.language = fieldSetFlags()[1] ? this.language : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Profile>
    WRITER$ = (org.apache.avro.io.DatumWriter<Profile>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Profile>
    READER$ = (org.apache.avro.io.DatumReader<Profile>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
