/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_account_entity.profile;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Notificationpreferences extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4482646151229833123L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Notificationpreferences\",\"namespace\":\"avro_generated_types.root_account_entity.profile\",\"fields\":[{\"name\":\"emailEnabled\",\"type\":[\"null\",\"boolean\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Boolean emailEnabled;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Notificationpreferences() {}

  /**
   * All-args constructor.
   * @param emailEnabled The new value for emailEnabled
   */
  public Notificationpreferences(java.lang.Boolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return emailEnabled;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: emailEnabled = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'emailEnabled' field.
   * @return The value of the 'emailEnabled' field.
   */
  public java.lang.Boolean getEmailEnabled() {
    return emailEnabled;
  }

  /**
   * Sets the value of the 'emailEnabled' field.
   * @param value the value to set.
   */
  public void setEmailEnabled(java.lang.Boolean value) {
    this.emailEnabled = value;
  }

  /**
   * Creates a new Notificationpreferences RecordBuilder.
   * @return A new Notificationpreferences RecordBuilder
   */
  public static avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder newBuilder() {
    return new avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder();
  }

  /**
   * Creates a new Notificationpreferences RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Notificationpreferences RecordBuilder
   */
  public static avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder newBuilder(avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder other) {
    return new avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder(other);
  }

  /**
   * Creates a new Notificationpreferences RecordBuilder by copying an existing Notificationpreferences instance.
   * @param other The existing instance to copy.
   * @return A new Notificationpreferences RecordBuilder
   */
  public static avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder newBuilder(avro_generated_types.root_account_entity.profile.Notificationpreferences other) {
    return new avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder(other);
  }

  /**
   * RecordBuilder for Notificationpreferences instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Notificationpreferences>
    implements org.apache.avro.data.RecordBuilder<Notificationpreferences> {

    private java.lang.Boolean emailEnabled;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.emailEnabled)) {
        this.emailEnabled = data().deepCopy(fields()[0].schema(), other.emailEnabled);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Notificationpreferences instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_account_entity.profile.Notificationpreferences other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.emailEnabled)) {
        this.emailEnabled = data().deepCopy(fields()[0].schema(), other.emailEnabled);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'emailEnabled' field.
      * @return The value.
      */
    public java.lang.Boolean getEmailEnabled() {
      return emailEnabled;
    }

    /**
      * Sets the value of the 'emailEnabled' field.
      * @param value The value of 'emailEnabled'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder setEmailEnabled(java.lang.Boolean value) {
      validate(fields()[0], value);
      this.emailEnabled = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'emailEnabled' field has been set.
      * @return True if the 'emailEnabled' field has been set, false otherwise.
      */
    public boolean hasEmailEnabled() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'emailEnabled' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.profile.Notificationpreferences.Builder clearEmailEnabled() {
      emailEnabled = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Notificationpreferences build() {
      try {
        Notificationpreferences record = new Notificationpreferences();
        record.emailEnabled = fieldSetFlags()[0] ? this.emailEnabled : (java.lang.Boolean) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}