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
public class _Src extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 851340704539821969L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"_Src\",\"namespace\":\"avro_generated_types.root_account_entity\",\"fields\":[{\"name\":\"op\",\"type\":[\"null\",\"string\"]},{\"name\":\"ts\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]},{\"name\":\"partial\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"entity_ns\",\"type\":[\"null\",\"string\"]},{\"name\":\"entity_name\",\"type\":[\"null\",\"string\"]},{\"name\":\"version\",\"type\":[\"null\",\"string\"]},{\"name\":\"connector\",\"type\":[\"null\",\"string\"]},{\"name\":\"snapshot\",\"type\":[\"null\",\"string\"]},{\"name\":\"ts_ms\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]},{\"name\":\"db\",\"type\":[\"null\",\"string\"]},{\"name\":\"rs\",\"type\":[\"null\",\"string\"]},{\"name\":\"collection\",\"type\":[\"null\",\"string\"]},{\"name\":\"h\",\"type\":[\"null\",\"long\"]},{\"name\":\"ord\",\"type\":[\"null\",\"long\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<_Src> ENCODER =
      new BinaryMessageEncoder<_Src>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<_Src> DECODER =
      new BinaryMessageDecoder<_Src>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<_Src> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<_Src> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<_Src>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this _Src to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a _Src from a ByteBuffer. */
  public static _Src fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence op;
  @Deprecated public java.lang.Long ts;
  @Deprecated public java.lang.Boolean partial;
  @Deprecated public java.lang.CharSequence entity_ns;
  @Deprecated public java.lang.CharSequence entity_name;
  @Deprecated public java.lang.CharSequence version;
  @Deprecated public java.lang.CharSequence connector;
  @Deprecated public java.lang.CharSequence snapshot;
  @Deprecated public java.lang.Long ts_ms;
  @Deprecated public java.lang.CharSequence db;
  @Deprecated public java.lang.CharSequence rs;
  @Deprecated public java.lang.CharSequence collection;
  @Deprecated public java.lang.Long h;
  @Deprecated public java.lang.Long ord;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public _Src() {}

  /**
   * All-args constructor.
   * @param op The new value for op
   * @param ts The new value for ts
   * @param partial The new value for partial
   * @param entity_ns The new value for entity_ns
   * @param entity_name The new value for entity_name
   * @param version The new value for version
   * @param connector The new value for connector
   * @param snapshot The new value for snapshot
   * @param ts_ms The new value for ts_ms
   * @param db The new value for db
   * @param rs The new value for rs
   * @param collection The new value for collection
   * @param h The new value for h
   * @param ord The new value for ord
   */
  public _Src(java.lang.CharSequence op, java.lang.Long ts, java.lang.Boolean partial, java.lang.CharSequence entity_ns, java.lang.CharSequence entity_name, java.lang.CharSequence version, java.lang.CharSequence connector, java.lang.CharSequence snapshot, java.lang.Long ts_ms, java.lang.CharSequence db, java.lang.CharSequence rs, java.lang.CharSequence collection, java.lang.Long h, java.lang.Long ord) {
    this.op = op;
    this.ts = ts;
    this.partial = partial;
    this.entity_ns = entity_ns;
    this.entity_name = entity_name;
    this.version = version;
    this.connector = connector;
    this.snapshot = snapshot;
    this.ts_ms = ts_ms;
    this.db = db;
    this.rs = rs;
    this.collection = collection;
    this.h = h;
    this.ord = ord;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return op;
    case 1: return ts;
    case 2: return partial;
    case 3: return entity_ns;
    case 4: return entity_name;
    case 5: return version;
    case 6: return connector;
    case 7: return snapshot;
    case 8: return ts_ms;
    case 9: return db;
    case 10: return rs;
    case 11: return collection;
    case 12: return h;
    case 13: return ord;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: op = (java.lang.CharSequence)value$; break;
    case 1: ts = (java.lang.Long)value$; break;
    case 2: partial = (java.lang.Boolean)value$; break;
    case 3: entity_ns = (java.lang.CharSequence)value$; break;
    case 4: entity_name = (java.lang.CharSequence)value$; break;
    case 5: version = (java.lang.CharSequence)value$; break;
    case 6: connector = (java.lang.CharSequence)value$; break;
    case 7: snapshot = (java.lang.CharSequence)value$; break;
    case 8: ts_ms = (java.lang.Long)value$; break;
    case 9: db = (java.lang.CharSequence)value$; break;
    case 10: rs = (java.lang.CharSequence)value$; break;
    case 11: collection = (java.lang.CharSequence)value$; break;
    case 12: h = (java.lang.Long)value$; break;
    case 13: ord = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'op' field.
   * @return The value of the 'op' field.
   */
  public java.lang.CharSequence getOp() {
    return op;
  }

  /**
   * Sets the value of the 'op' field.
   * @param value the value to set.
   */
  public void setOp(java.lang.CharSequence value) {
    this.op = value;
  }

  /**
   * Gets the value of the 'ts' field.
   * @return The value of the 'ts' field.
   */
  public java.lang.Long getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   * @param value the value to set.
   */
  public void setTs(java.lang.Long value) {
    this.ts = value;
  }

  /**
   * Gets the value of the 'partial' field.
   * @return The value of the 'partial' field.
   */
  public java.lang.Boolean getPartial() {
    return partial;
  }

  /**
   * Sets the value of the 'partial' field.
   * @param value the value to set.
   */
  public void setPartial(java.lang.Boolean value) {
    this.partial = value;
  }

  /**
   * Gets the value of the 'entity_ns' field.
   * @return The value of the 'entity_ns' field.
   */
  public java.lang.CharSequence getEntityNs() {
    return entity_ns;
  }

  /**
   * Sets the value of the 'entity_ns' field.
   * @param value the value to set.
   */
  public void setEntityNs(java.lang.CharSequence value) {
    this.entity_ns = value;
  }

  /**
   * Gets the value of the 'entity_name' field.
   * @return The value of the 'entity_name' field.
   */
  public java.lang.CharSequence getEntityName() {
    return entity_name;
  }

  /**
   * Sets the value of the 'entity_name' field.
   * @param value the value to set.
   */
  public void setEntityName(java.lang.CharSequence value) {
    this.entity_name = value;
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.CharSequence getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.CharSequence value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'connector' field.
   * @return The value of the 'connector' field.
   */
  public java.lang.CharSequence getConnector() {
    return connector;
  }

  /**
   * Sets the value of the 'connector' field.
   * @param value the value to set.
   */
  public void setConnector(java.lang.CharSequence value) {
    this.connector = value;
  }

  /**
   * Gets the value of the 'snapshot' field.
   * @return The value of the 'snapshot' field.
   */
  public java.lang.CharSequence getSnapshot() {
    return snapshot;
  }

  /**
   * Sets the value of the 'snapshot' field.
   * @param value the value to set.
   */
  public void setSnapshot(java.lang.CharSequence value) {
    this.snapshot = value;
  }

  /**
   * Gets the value of the 'ts_ms' field.
   * @return The value of the 'ts_ms' field.
   */
  public java.lang.Long getTsMs() {
    return ts_ms;
  }

  /**
   * Sets the value of the 'ts_ms' field.
   * @param value the value to set.
   */
  public void setTsMs(java.lang.Long value) {
    this.ts_ms = value;
  }

  /**
   * Gets the value of the 'db' field.
   * @return The value of the 'db' field.
   */
  public java.lang.CharSequence getDb() {
    return db;
  }

  /**
   * Sets the value of the 'db' field.
   * @param value the value to set.
   */
  public void setDb(java.lang.CharSequence value) {
    this.db = value;
  }

  /**
   * Gets the value of the 'rs' field.
   * @return The value of the 'rs' field.
   */
  public java.lang.CharSequence getRs() {
    return rs;
  }

  /**
   * Sets the value of the 'rs' field.
   * @param value the value to set.
   */
  public void setRs(java.lang.CharSequence value) {
    this.rs = value;
  }

  /**
   * Gets the value of the 'collection' field.
   * @return The value of the 'collection' field.
   */
  public java.lang.CharSequence getCollection() {
    return collection;
  }

  /**
   * Sets the value of the 'collection' field.
   * @param value the value to set.
   */
  public void setCollection(java.lang.CharSequence value) {
    this.collection = value;
  }

  /**
   * Gets the value of the 'h' field.
   * @return The value of the 'h' field.
   */
  public java.lang.Long getH() {
    return h;
  }

  /**
   * Sets the value of the 'h' field.
   * @param value the value to set.
   */
  public void setH(java.lang.Long value) {
    this.h = value;
  }

  /**
   * Gets the value of the 'ord' field.
   * @return The value of the 'ord' field.
   */
  public java.lang.Long getOrd() {
    return ord;
  }

  /**
   * Sets the value of the 'ord' field.
   * @param value the value to set.
   */
  public void setOrd(java.lang.Long value) {
    this.ord = value;
  }

  /**
   * Creates a new _Src RecordBuilder.
   * @return A new _Src RecordBuilder
   */
  public static avro_generated_types.root_account_entity._Src.Builder newBuilder() {
    return new avro_generated_types.root_account_entity._Src.Builder();
  }

  /**
   * Creates a new _Src RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new _Src RecordBuilder
   */
  public static avro_generated_types.root_account_entity._Src.Builder newBuilder(avro_generated_types.root_account_entity._Src.Builder other) {
    return new avro_generated_types.root_account_entity._Src.Builder(other);
  }

  /**
   * Creates a new _Src RecordBuilder by copying an existing _Src instance.
   * @param other The existing instance to copy.
   * @return A new _Src RecordBuilder
   */
  public static avro_generated_types.root_account_entity._Src.Builder newBuilder(avro_generated_types.root_account_entity._Src other) {
    return new avro_generated_types.root_account_entity._Src.Builder(other);
  }

  /**
   * RecordBuilder for _Src instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<_Src>
    implements org.apache.avro.data.RecordBuilder<_Src> {

    private java.lang.CharSequence op;
    private java.lang.Long ts;
    private java.lang.Boolean partial;
    private java.lang.CharSequence entity_ns;
    private java.lang.CharSequence entity_name;
    private java.lang.CharSequence version;
    private java.lang.CharSequence connector;
    private java.lang.CharSequence snapshot;
    private java.lang.Long ts_ms;
    private java.lang.CharSequence db;
    private java.lang.CharSequence rs;
    private java.lang.CharSequence collection;
    private java.lang.Long h;
    private java.lang.Long ord;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_account_entity._Src.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.op)) {
        this.op = data().deepCopy(fields()[0].schema(), other.op);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ts)) {
        this.ts = data().deepCopy(fields()[1].schema(), other.ts);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.partial)) {
        this.partial = data().deepCopy(fields()[2].schema(), other.partial);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.entity_ns)) {
        this.entity_ns = data().deepCopy(fields()[3].schema(), other.entity_ns);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.entity_name)) {
        this.entity_name = data().deepCopy(fields()[4].schema(), other.entity_name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.version)) {
        this.version = data().deepCopy(fields()[5].schema(), other.version);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.connector)) {
        this.connector = data().deepCopy(fields()[6].schema(), other.connector);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.snapshot)) {
        this.snapshot = data().deepCopy(fields()[7].schema(), other.snapshot);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[8].schema(), other.ts_ms);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.db)) {
        this.db = data().deepCopy(fields()[9].schema(), other.db);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.rs)) {
        this.rs = data().deepCopy(fields()[10].schema(), other.rs);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.collection)) {
        this.collection = data().deepCopy(fields()[11].schema(), other.collection);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.h)) {
        this.h = data().deepCopy(fields()[12].schema(), other.h);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.ord)) {
        this.ord = data().deepCopy(fields()[13].schema(), other.ord);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing _Src instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_account_entity._Src other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.op)) {
        this.op = data().deepCopy(fields()[0].schema(), other.op);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ts)) {
        this.ts = data().deepCopy(fields()[1].schema(), other.ts);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.partial)) {
        this.partial = data().deepCopy(fields()[2].schema(), other.partial);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.entity_ns)) {
        this.entity_ns = data().deepCopy(fields()[3].schema(), other.entity_ns);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.entity_name)) {
        this.entity_name = data().deepCopy(fields()[4].schema(), other.entity_name);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.version)) {
        this.version = data().deepCopy(fields()[5].schema(), other.version);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.connector)) {
        this.connector = data().deepCopy(fields()[6].schema(), other.connector);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.snapshot)) {
        this.snapshot = data().deepCopy(fields()[7].schema(), other.snapshot);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ts_ms)) {
        this.ts_ms = data().deepCopy(fields()[8].schema(), other.ts_ms);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.db)) {
        this.db = data().deepCopy(fields()[9].schema(), other.db);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.rs)) {
        this.rs = data().deepCopy(fields()[10].schema(), other.rs);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.collection)) {
        this.collection = data().deepCopy(fields()[11].schema(), other.collection);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.h)) {
        this.h = data().deepCopy(fields()[12].schema(), other.h);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.ord)) {
        this.ord = data().deepCopy(fields()[13].schema(), other.ord);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'op' field.
      * @return The value.
      */
    public java.lang.CharSequence getOp() {
      return op;
    }

    /**
      * Sets the value of the 'op' field.
      * @param value The value of 'op'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setOp(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.op = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'op' field has been set.
      * @return True if the 'op' field has been set, false otherwise.
      */
    public boolean hasOp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'op' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearOp() {
      op = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts' field.
      * @return The value.
      */
    public java.lang.Long getTs() {
      return ts;
    }

    /**
      * Sets the value of the 'ts' field.
      * @param value The value of 'ts'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setTs(java.lang.Long value) {
      validate(fields()[1], value);
      this.ts = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ts' field has been set.
      * @return True if the 'ts' field has been set, false otherwise.
      */
    public boolean hasTs() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ts' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearTs() {
      ts = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'partial' field.
      * @return The value.
      */
    public java.lang.Boolean getPartial() {
      return partial;
    }

    /**
      * Sets the value of the 'partial' field.
      * @param value The value of 'partial'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setPartial(java.lang.Boolean value) {
      validate(fields()[2], value);
      this.partial = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'partial' field has been set.
      * @return True if the 'partial' field has been set, false otherwise.
      */
    public boolean hasPartial() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'partial' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearPartial() {
      partial = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'entity_ns' field.
      * @return The value.
      */
    public java.lang.CharSequence getEntityNs() {
      return entity_ns;
    }

    /**
      * Sets the value of the 'entity_ns' field.
      * @param value The value of 'entity_ns'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setEntityNs(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.entity_ns = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'entity_ns' field has been set.
      * @return True if the 'entity_ns' field has been set, false otherwise.
      */
    public boolean hasEntityNs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'entity_ns' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearEntityNs() {
      entity_ns = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'entity_name' field.
      * @return The value.
      */
    public java.lang.CharSequence getEntityName() {
      return entity_name;
    }

    /**
      * Sets the value of the 'entity_name' field.
      * @param value The value of 'entity_name'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setEntityName(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.entity_name = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'entity_name' field has been set.
      * @return True if the 'entity_name' field has been set, false otherwise.
      */
    public boolean hasEntityName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'entity_name' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearEntityName() {
      entity_name = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.CharSequence getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setVersion(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.version = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearVersion() {
      version = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'connector' field.
      * @return The value.
      */
    public java.lang.CharSequence getConnector() {
      return connector;
    }

    /**
      * Sets the value of the 'connector' field.
      * @param value The value of 'connector'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setConnector(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.connector = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'connector' field has been set.
      * @return True if the 'connector' field has been set, false otherwise.
      */
    public boolean hasConnector() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'connector' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearConnector() {
      connector = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'snapshot' field.
      * @return The value.
      */
    public java.lang.CharSequence getSnapshot() {
      return snapshot;
    }

    /**
      * Sets the value of the 'snapshot' field.
      * @param value The value of 'snapshot'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setSnapshot(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.snapshot = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'snapshot' field has been set.
      * @return True if the 'snapshot' field has been set, false otherwise.
      */
    public boolean hasSnapshot() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'snapshot' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearSnapshot() {
      snapshot = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts_ms' field.
      * @return The value.
      */
    public java.lang.Long getTsMs() {
      return ts_ms;
    }

    /**
      * Sets the value of the 'ts_ms' field.
      * @param value The value of 'ts_ms'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setTsMs(java.lang.Long value) {
      validate(fields()[8], value);
      this.ts_ms = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'ts_ms' field has been set.
      * @return True if the 'ts_ms' field has been set, false otherwise.
      */
    public boolean hasTsMs() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'ts_ms' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearTsMs() {
      ts_ms = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'db' field.
      * @return The value.
      */
    public java.lang.CharSequence getDb() {
      return db;
    }

    /**
      * Sets the value of the 'db' field.
      * @param value The value of 'db'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setDb(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.db = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'db' field has been set.
      * @return True if the 'db' field has been set, false otherwise.
      */
    public boolean hasDb() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'db' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearDb() {
      db = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'rs' field.
      * @return The value.
      */
    public java.lang.CharSequence getRs() {
      return rs;
    }

    /**
      * Sets the value of the 'rs' field.
      * @param value The value of 'rs'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setRs(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.rs = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'rs' field has been set.
      * @return True if the 'rs' field has been set, false otherwise.
      */
    public boolean hasRs() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'rs' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearRs() {
      rs = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'collection' field.
      * @return The value.
      */
    public java.lang.CharSequence getCollection() {
      return collection;
    }

    /**
      * Sets the value of the 'collection' field.
      * @param value The value of 'collection'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setCollection(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.collection = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'collection' field has been set.
      * @return True if the 'collection' field has been set, false otherwise.
      */
    public boolean hasCollection() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'collection' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearCollection() {
      collection = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'h' field.
      * @return The value.
      */
    public java.lang.Long getH() {
      return h;
    }

    /**
      * Sets the value of the 'h' field.
      * @param value The value of 'h'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setH(java.lang.Long value) {
      validate(fields()[12], value);
      this.h = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'h' field has been set.
      * @return True if the 'h' field has been set, false otherwise.
      */
    public boolean hasH() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'h' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearH() {
      h = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'ord' field.
      * @return The value.
      */
    public java.lang.Long getOrd() {
      return ord;
    }

    /**
      * Sets the value of the 'ord' field.
      * @param value The value of 'ord'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder setOrd(java.lang.Long value) {
      validate(fields()[13], value);
      this.ord = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'ord' field has been set.
      * @return True if the 'ord' field has been set, false otherwise.
      */
    public boolean hasOrd() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'ord' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity._Src.Builder clearOrd() {
      ord = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public _Src build() {
      try {
        _Src record = new _Src();
        record.op = fieldSetFlags()[0] ? this.op : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ts = fieldSetFlags()[1] ? this.ts : (java.lang.Long) defaultValue(fields()[1]);
        record.partial = fieldSetFlags()[2] ? this.partial : (java.lang.Boolean) defaultValue(fields()[2]);
        record.entity_ns = fieldSetFlags()[3] ? this.entity_ns : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.entity_name = fieldSetFlags()[4] ? this.entity_name : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.version = fieldSetFlags()[5] ? this.version : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.connector = fieldSetFlags()[6] ? this.connector : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.snapshot = fieldSetFlags()[7] ? this.snapshot : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.ts_ms = fieldSetFlags()[8] ? this.ts_ms : (java.lang.Long) defaultValue(fields()[8]);
        record.db = fieldSetFlags()[9] ? this.db : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.rs = fieldSetFlags()[10] ? this.rs : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.collection = fieldSetFlags()[11] ? this.collection : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.h = fieldSetFlags()[12] ? this.h : (java.lang.Long) defaultValue(fields()[12]);
        record.ord = fieldSetFlags()[13] ? this.ord : (java.lang.Long) defaultValue(fields()[13]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<_Src>
    WRITER$ = (org.apache.avro.io.DatumWriter<_Src>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<_Src>
    READER$ = (org.apache.avro.io.DatumReader<_Src>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
