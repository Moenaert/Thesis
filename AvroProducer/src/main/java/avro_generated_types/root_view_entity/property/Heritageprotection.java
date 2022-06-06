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
public class Heritageprotection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -769127450170390443L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Heritageprotection\",\"namespace\":\"avro_generated_types.root_view_entity.property\",\"fields\":[{\"name\":\"takeResponsibilityForMissingMandatoryHeritageProtectionInformation\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"goodEstablishedInventoryType\",\"type\":[\"null\",\"string\"]},{\"name\":\"rankingHeritageType\",\"type\":[\"null\",\"string\"]},{\"name\":\"inventoryType\",\"type\":[\"null\",\"string\"]},{\"name\":\"hasProcedureRankingHeritage\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"goodEstablishedInventoryDetails\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Heritageprotection> ENCODER =
      new BinaryMessageEncoder<Heritageprotection>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Heritageprotection> DECODER =
      new BinaryMessageDecoder<Heritageprotection>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Heritageprotection> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Heritageprotection> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Heritageprotection>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Heritageprotection to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Heritageprotection from a ByteBuffer. */
  public static Heritageprotection fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Boolean takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
  @Deprecated public java.lang.CharSequence goodEstablishedInventoryType;
  @Deprecated public java.lang.CharSequence rankingHeritageType;
  @Deprecated public java.lang.CharSequence inventoryType;
  @Deprecated public java.lang.Boolean hasProcedureRankingHeritage;
  @Deprecated public java.lang.CharSequence goodEstablishedInventoryDetails;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Heritageprotection() {}

  /**
   * All-args constructor.
   * @param takeResponsibilityForMissingMandatoryHeritageProtectionInformation The new value for takeResponsibilityForMissingMandatoryHeritageProtectionInformation
   * @param goodEstablishedInventoryType The new value for goodEstablishedInventoryType
   * @param rankingHeritageType The new value for rankingHeritageType
   * @param inventoryType The new value for inventoryType
   * @param hasProcedureRankingHeritage The new value for hasProcedureRankingHeritage
   * @param goodEstablishedInventoryDetails The new value for goodEstablishedInventoryDetails
   */
  public Heritageprotection(java.lang.Boolean takeResponsibilityForMissingMandatoryHeritageProtectionInformation, java.lang.CharSequence goodEstablishedInventoryType, java.lang.CharSequence rankingHeritageType, java.lang.CharSequence inventoryType, java.lang.Boolean hasProcedureRankingHeritage, java.lang.CharSequence goodEstablishedInventoryDetails) {
    this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
    this.goodEstablishedInventoryType = goodEstablishedInventoryType;
    this.rankingHeritageType = rankingHeritageType;
    this.inventoryType = inventoryType;
    this.hasProcedureRankingHeritage = hasProcedureRankingHeritage;
    this.goodEstablishedInventoryDetails = goodEstablishedInventoryDetails;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
    case 1: return goodEstablishedInventoryType;
    case 2: return rankingHeritageType;
    case 3: return inventoryType;
    case 4: return hasProcedureRankingHeritage;
    case 5: return goodEstablishedInventoryDetails;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: takeResponsibilityForMissingMandatoryHeritageProtectionInformation = (java.lang.Boolean)value$; break;
    case 1: goodEstablishedInventoryType = (java.lang.CharSequence)value$; break;
    case 2: rankingHeritageType = (java.lang.CharSequence)value$; break;
    case 3: inventoryType = (java.lang.CharSequence)value$; break;
    case 4: hasProcedureRankingHeritage = (java.lang.Boolean)value$; break;
    case 5: goodEstablishedInventoryDetails = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
   * @return The value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
   */
  public java.lang.Boolean getTakeResponsibilityForMissingMandatoryHeritageProtectionInformation() {
    return takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
  }

  /**
   * Sets the value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
   * @param value the value to set.
   */
  public void setTakeResponsibilityForMissingMandatoryHeritageProtectionInformation(java.lang.Boolean value) {
    this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = value;
  }

  /**
   * Gets the value of the 'goodEstablishedInventoryType' field.
   * @return The value of the 'goodEstablishedInventoryType' field.
   */
  public java.lang.CharSequence getGoodEstablishedInventoryType() {
    return goodEstablishedInventoryType;
  }

  /**
   * Sets the value of the 'goodEstablishedInventoryType' field.
   * @param value the value to set.
   */
  public void setGoodEstablishedInventoryType(java.lang.CharSequence value) {
    this.goodEstablishedInventoryType = value;
  }

  /**
   * Gets the value of the 'rankingHeritageType' field.
   * @return The value of the 'rankingHeritageType' field.
   */
  public java.lang.CharSequence getRankingHeritageType() {
    return rankingHeritageType;
  }

  /**
   * Sets the value of the 'rankingHeritageType' field.
   * @param value the value to set.
   */
  public void setRankingHeritageType(java.lang.CharSequence value) {
    this.rankingHeritageType = value;
  }

  /**
   * Gets the value of the 'inventoryType' field.
   * @return The value of the 'inventoryType' field.
   */
  public java.lang.CharSequence getInventoryType() {
    return inventoryType;
  }

  /**
   * Sets the value of the 'inventoryType' field.
   * @param value the value to set.
   */
  public void setInventoryType(java.lang.CharSequence value) {
    this.inventoryType = value;
  }

  /**
   * Gets the value of the 'hasProcedureRankingHeritage' field.
   * @return The value of the 'hasProcedureRankingHeritage' field.
   */
  public java.lang.Boolean getHasProcedureRankingHeritage() {
    return hasProcedureRankingHeritage;
  }

  /**
   * Sets the value of the 'hasProcedureRankingHeritage' field.
   * @param value the value to set.
   */
  public void setHasProcedureRankingHeritage(java.lang.Boolean value) {
    this.hasProcedureRankingHeritage = value;
  }

  /**
   * Gets the value of the 'goodEstablishedInventoryDetails' field.
   * @return The value of the 'goodEstablishedInventoryDetails' field.
   */
  public java.lang.CharSequence getGoodEstablishedInventoryDetails() {
    return goodEstablishedInventoryDetails;
  }

  /**
   * Sets the value of the 'goodEstablishedInventoryDetails' field.
   * @param value the value to set.
   */
  public void setGoodEstablishedInventoryDetails(java.lang.CharSequence value) {
    this.goodEstablishedInventoryDetails = value;
  }

  /**
   * Creates a new Heritageprotection RecordBuilder.
   * @return A new Heritageprotection RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Heritageprotection.Builder newBuilder() {
    return new avro_generated_types.root_view_entity.property.Heritageprotection.Builder();
  }

  /**
   * Creates a new Heritageprotection RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Heritageprotection RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Heritageprotection.Builder newBuilder(avro_generated_types.root_view_entity.property.Heritageprotection.Builder other) {
    return new avro_generated_types.root_view_entity.property.Heritageprotection.Builder(other);
  }

  /**
   * Creates a new Heritageprotection RecordBuilder by copying an existing Heritageprotection instance.
   * @param other The existing instance to copy.
   * @return A new Heritageprotection RecordBuilder
   */
  public static avro_generated_types.root_view_entity.property.Heritageprotection.Builder newBuilder(avro_generated_types.root_view_entity.property.Heritageprotection other) {
    return new avro_generated_types.root_view_entity.property.Heritageprotection.Builder(other);
  }

  /**
   * RecordBuilder for Heritageprotection instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Heritageprotection>
    implements org.apache.avro.data.RecordBuilder<Heritageprotection> {

    private java.lang.Boolean takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
    private java.lang.CharSequence goodEstablishedInventoryType;
    private java.lang.CharSequence rankingHeritageType;
    private java.lang.CharSequence inventoryType;
    private java.lang.Boolean hasProcedureRankingHeritage;
    private java.lang.CharSequence goodEstablishedInventoryDetails;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.Heritageprotection.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.takeResponsibilityForMissingMandatoryHeritageProtectionInformation)) {
        this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = data().deepCopy(fields()[0].schema(), other.takeResponsibilityForMissingMandatoryHeritageProtectionInformation);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.goodEstablishedInventoryType)) {
        this.goodEstablishedInventoryType = data().deepCopy(fields()[1].schema(), other.goodEstablishedInventoryType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rankingHeritageType)) {
        this.rankingHeritageType = data().deepCopy(fields()[2].schema(), other.rankingHeritageType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inventoryType)) {
        this.inventoryType = data().deepCopy(fields()[3].schema(), other.inventoryType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hasProcedureRankingHeritage)) {
        this.hasProcedureRankingHeritage = data().deepCopy(fields()[4].schema(), other.hasProcedureRankingHeritage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.goodEstablishedInventoryDetails)) {
        this.goodEstablishedInventoryDetails = data().deepCopy(fields()[5].schema(), other.goodEstablishedInventoryDetails);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Heritageprotection instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_view_entity.property.Heritageprotection other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.takeResponsibilityForMissingMandatoryHeritageProtectionInformation)) {
        this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = data().deepCopy(fields()[0].schema(), other.takeResponsibilityForMissingMandatoryHeritageProtectionInformation);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.goodEstablishedInventoryType)) {
        this.goodEstablishedInventoryType = data().deepCopy(fields()[1].schema(), other.goodEstablishedInventoryType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rankingHeritageType)) {
        this.rankingHeritageType = data().deepCopy(fields()[2].schema(), other.rankingHeritageType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.inventoryType)) {
        this.inventoryType = data().deepCopy(fields()[3].schema(), other.inventoryType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.hasProcedureRankingHeritage)) {
        this.hasProcedureRankingHeritage = data().deepCopy(fields()[4].schema(), other.hasProcedureRankingHeritage);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.goodEstablishedInventoryDetails)) {
        this.goodEstablishedInventoryDetails = data().deepCopy(fields()[5].schema(), other.goodEstablishedInventoryDetails);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
      * @return The value.
      */
    public java.lang.Boolean getTakeResponsibilityForMissingMandatoryHeritageProtectionInformation() {
      return takeResponsibilityForMissingMandatoryHeritageProtectionInformation;
    }

    /**
      * Sets the value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
      * @param value The value of 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setTakeResponsibilityForMissingMandatoryHeritageProtectionInformation(java.lang.Boolean value) {
      validate(fields()[0], value);
      this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field has been set.
      * @return True if the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field has been set, false otherwise.
      */
    public boolean hasTakeResponsibilityForMissingMandatoryHeritageProtectionInformation() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'takeResponsibilityForMissingMandatoryHeritageProtectionInformation' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearTakeResponsibilityForMissingMandatoryHeritageProtectionInformation() {
      takeResponsibilityForMissingMandatoryHeritageProtectionInformation = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'goodEstablishedInventoryType' field.
      * @return The value.
      */
    public java.lang.CharSequence getGoodEstablishedInventoryType() {
      return goodEstablishedInventoryType;
    }

    /**
      * Sets the value of the 'goodEstablishedInventoryType' field.
      * @param value The value of 'goodEstablishedInventoryType'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setGoodEstablishedInventoryType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.goodEstablishedInventoryType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'goodEstablishedInventoryType' field has been set.
      * @return True if the 'goodEstablishedInventoryType' field has been set, false otherwise.
      */
    public boolean hasGoodEstablishedInventoryType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'goodEstablishedInventoryType' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearGoodEstablishedInventoryType() {
      goodEstablishedInventoryType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rankingHeritageType' field.
      * @return The value.
      */
    public java.lang.CharSequence getRankingHeritageType() {
      return rankingHeritageType;
    }

    /**
      * Sets the value of the 'rankingHeritageType' field.
      * @param value The value of 'rankingHeritageType'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setRankingHeritageType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.rankingHeritageType = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rankingHeritageType' field has been set.
      * @return True if the 'rankingHeritageType' field has been set, false otherwise.
      */
    public boolean hasRankingHeritageType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rankingHeritageType' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearRankingHeritageType() {
      rankingHeritageType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'inventoryType' field.
      * @return The value.
      */
    public java.lang.CharSequence getInventoryType() {
      return inventoryType;
    }

    /**
      * Sets the value of the 'inventoryType' field.
      * @param value The value of 'inventoryType'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setInventoryType(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.inventoryType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'inventoryType' field has been set.
      * @return True if the 'inventoryType' field has been set, false otherwise.
      */
    public boolean hasInventoryType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'inventoryType' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearInventoryType() {
      inventoryType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'hasProcedureRankingHeritage' field.
      * @return The value.
      */
    public java.lang.Boolean getHasProcedureRankingHeritage() {
      return hasProcedureRankingHeritage;
    }

    /**
      * Sets the value of the 'hasProcedureRankingHeritage' field.
      * @param value The value of 'hasProcedureRankingHeritage'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setHasProcedureRankingHeritage(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.hasProcedureRankingHeritage = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'hasProcedureRankingHeritage' field has been set.
      * @return True if the 'hasProcedureRankingHeritage' field has been set, false otherwise.
      */
    public boolean hasHasProcedureRankingHeritage() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'hasProcedureRankingHeritage' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearHasProcedureRankingHeritage() {
      hasProcedureRankingHeritage = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'goodEstablishedInventoryDetails' field.
      * @return The value.
      */
    public java.lang.CharSequence getGoodEstablishedInventoryDetails() {
      return goodEstablishedInventoryDetails;
    }

    /**
      * Sets the value of the 'goodEstablishedInventoryDetails' field.
      * @param value The value of 'goodEstablishedInventoryDetails'.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder setGoodEstablishedInventoryDetails(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.goodEstablishedInventoryDetails = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'goodEstablishedInventoryDetails' field has been set.
      * @return True if the 'goodEstablishedInventoryDetails' field has been set, false otherwise.
      */
    public boolean hasGoodEstablishedInventoryDetails() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'goodEstablishedInventoryDetails' field.
      * @return This builder.
      */
    public avro_generated_types.root_view_entity.property.Heritageprotection.Builder clearGoodEstablishedInventoryDetails() {
      goodEstablishedInventoryDetails = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Heritageprotection build() {
      try {
        Heritageprotection record = new Heritageprotection();
        record.takeResponsibilityForMissingMandatoryHeritageProtectionInformation = fieldSetFlags()[0] ? this.takeResponsibilityForMissingMandatoryHeritageProtectionInformation : (java.lang.Boolean) defaultValue(fields()[0]);
        record.goodEstablishedInventoryType = fieldSetFlags()[1] ? this.goodEstablishedInventoryType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.rankingHeritageType = fieldSetFlags()[2] ? this.rankingHeritageType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.inventoryType = fieldSetFlags()[3] ? this.inventoryType : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.hasProcedureRankingHeritage = fieldSetFlags()[4] ? this.hasProcedureRankingHeritage : (java.lang.Boolean) defaultValue(fields()[4]);
        record.goodEstablishedInventoryDetails = fieldSetFlags()[5] ? this.goodEstablishedInventoryDetails : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Heritageprotection>
    WRITER$ = (org.apache.avro.io.DatumWriter<Heritageprotection>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Heritageprotection>
    READER$ = (org.apache.avro.io.DatumReader<Heritageprotection>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
