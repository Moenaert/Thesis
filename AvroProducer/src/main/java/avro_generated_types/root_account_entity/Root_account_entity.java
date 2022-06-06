/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro_generated_types.root_account_entity;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Root_account_entity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4696452760539668921L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Root_account_entity\",\"namespace\":\"avro_generated_types.root_account_entity\",\"fields\":[{\"name\":\"_class\",\"type\":[\"null\",\"string\"]},{\"name\":\"password\",\"type\":[\"null\",\"string\"]},{\"name\":\"active\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"profile\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Profile\",\"fields\":[{\"name\":\"notificationPreferences\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Notificationpreferences\",\"namespace\":\"avro_generated_types.root_account_entity.profile\",\"fields\":[{\"name\":\"emailEnabled\",\"type\":[\"null\",\"boolean\"]}]}]},{\"name\":\"language\",\"type\":[\"null\",\"string\"]}]}]},{\"name\":\"references\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"References\",\"fields\":[{\"name\":\"NN\",\"type\":[\"null\",\"string\"]}]}]},{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"__deleted\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"_meta\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"_Meta\",\"fields\":[{\"name\":\"offset\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Offset\",\"namespace\":\"avro_generated_types.root_account_entity._meta\",\"fields\":[{\"name\":\"topic\",\"type\":\"string\"},{\"name\":\"partition\",\"type\":\"long\"},{\"name\":\"offset\",\"type\":\"long\"}]}}},{\"name\":\"ts\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}},{\"name\":\"appId\",\"type\":\"string\"}]}]},{\"name\":\"_src\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"_Src\",\"fields\":[{\"name\":\"op\",\"type\":[\"null\",\"string\"]},{\"name\":\"ts\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]},{\"name\":\"partial\",\"type\":[\"null\",\"boolean\"]},{\"name\":\"entity_ns\",\"type\":[\"null\",\"string\"]},{\"name\":\"entity_name\",\"type\":[\"null\",\"string\"]},{\"name\":\"version\",\"type\":[\"null\",\"string\"]},{\"name\":\"connector\",\"type\":[\"null\",\"string\"]},{\"name\":\"snapshot\",\"type\":[\"null\",\"string\"]},{\"name\":\"ts_ms\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]},{\"name\":\"db\",\"type\":[\"null\",\"string\"]},{\"name\":\"rs\",\"type\":[\"null\",\"string\"]},{\"name\":\"collection\",\"type\":[\"null\",\"string\"]},{\"name\":\"h\",\"type\":[\"null\",\"long\"]},{\"name\":\"ord\",\"type\":[\"null\",\"long\"]}]}]},{\"name\":\"createdAt\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence _class;
  @Deprecated public java.lang.CharSequence password;
  @Deprecated public java.lang.Boolean active;
  @Deprecated public avro_generated_types.root_account_entity.Profile profile;
  @Deprecated public avro_generated_types.root_account_entity.References references;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.Boolean __deleted;
  @Deprecated public avro_generated_types.root_account_entity._Meta _meta;
  @Deprecated public avro_generated_types.root_account_entity._Src _src;
  @Deprecated public java.lang.Long createdAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Root_account_entity() {}

  /**
   * All-args constructor.
   * @param _class The new value for _class
   * @param password The new value for password
   * @param active The new value for active
   * @param profile The new value for profile
   * @param references The new value for references
   * @param id The new value for id
   * @param __deleted The new value for __deleted
   * @param _meta The new value for _meta
   * @param _src The new value for _src
   * @param createdAt The new value for createdAt
   */
  public Root_account_entity(java.lang.CharSequence _class, java.lang.CharSequence password, java.lang.Boolean active, avro_generated_types.root_account_entity.Profile profile, avro_generated_types.root_account_entity.References references, java.lang.CharSequence id, java.lang.Boolean __deleted, avro_generated_types.root_account_entity._Meta _meta, avro_generated_types.root_account_entity._Src _src, java.lang.Long createdAt) {
    this._class = _class;
    this.password = password;
    this.active = active;
    this.profile = profile;
    this.references = references;
    this.id = id;
    this.__deleted = __deleted;
    this._meta = _meta;
    this._src = _src;
    this.createdAt = createdAt;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return _class;
    case 1: return password;
    case 2: return active;
    case 3: return profile;
    case 4: return references;
    case 5: return id;
    case 6: return __deleted;
    case 7: return _meta;
    case 8: return _src;
    case 9: return createdAt;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: _class = (java.lang.CharSequence)value$; break;
    case 1: password = (java.lang.CharSequence)value$; break;
    case 2: active = (java.lang.Boolean)value$; break;
    case 3: profile = (avro_generated_types.root_account_entity.Profile)value$; break;
    case 4: references = (avro_generated_types.root_account_entity.References)value$; break;
    case 5: id = (java.lang.CharSequence)value$; break;
    case 6: __deleted = (java.lang.Boolean)value$; break;
    case 7: _meta = (avro_generated_types.root_account_entity._Meta)value$; break;
    case 8: _src = (avro_generated_types.root_account_entity._Src)value$; break;
    case 9: createdAt = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the '_class' field.
   * @return The value of the '_class' field.
   */
  public java.lang.CharSequence getClass$1() {
    return _class;
  }

  /**
   * Sets the value of the '_class' field.
   * @param value the value to set.
   */
  public void setClass$1(java.lang.CharSequence value) {
    this._class = value;
  }

  /**
   * Gets the value of the 'password' field.
   * @return The value of the 'password' field.
   */
  public java.lang.CharSequence getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   * @param value the value to set.
   */
  public void setPassword(java.lang.CharSequence value) {
    this.password = value;
  }

  /**
   * Gets the value of the 'active' field.
   * @return The value of the 'active' field.
   */
  public java.lang.Boolean getActive() {
    return active;
  }

  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(java.lang.Boolean value) {
    this.active = value;
  }

  /**
   * Gets the value of the 'profile' field.
   * @return The value of the 'profile' field.
   */
  public avro_generated_types.root_account_entity.Profile getProfile() {
    return profile;
  }

  /**
   * Sets the value of the 'profile' field.
   * @param value the value to set.
   */
  public void setProfile(avro_generated_types.root_account_entity.Profile value) {
    this.profile = value;
  }

  /**
   * Gets the value of the 'references' field.
   * @return The value of the 'references' field.
   */
  public avro_generated_types.root_account_entity.References getReferences() {
    return references;
  }

  /**
   * Sets the value of the 'references' field.
   * @param value the value to set.
   */
  public void setReferences(avro_generated_types.root_account_entity.References value) {
    this.references = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the '__deleted' field.
   * @return The value of the '__deleted' field.
   */
  public java.lang.Boolean getDeleted$1() {
    return __deleted;
  }

  /**
   * Sets the value of the '__deleted' field.
   * @param value the value to set.
   */
  public void setDeleted$1(java.lang.Boolean value) {
    this.__deleted = value;
  }

  /**
   * Gets the value of the '_meta' field.
   * @return The value of the '_meta' field.
   */
  public avro_generated_types.root_account_entity._Meta getMeta$1() {
    return _meta;
  }

  /**
   * Sets the value of the '_meta' field.
   * @param value the value to set.
   */
  public void setMeta$1(avro_generated_types.root_account_entity._Meta value) {
    this._meta = value;
  }

  /**
   * Gets the value of the '_src' field.
   * @return The value of the '_src' field.
   */
  public avro_generated_types.root_account_entity._Src getSrc$1() {
    return _src;
  }

  /**
   * Sets the value of the '_src' field.
   * @param value the value to set.
   */
  public void setSrc$1(avro_generated_types.root_account_entity._Src value) {
    this._src = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.Long value) {
    this.createdAt = value;
  }

  /**
   * Creates a new Root_account_entity RecordBuilder.
   * @return A new Root_account_entity RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Root_account_entity.Builder newBuilder() {
    return new avro_generated_types.root_account_entity.Root_account_entity.Builder();
  }

  /**
   * Creates a new Root_account_entity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Root_account_entity RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Root_account_entity.Builder newBuilder(avro_generated_types.root_account_entity.Root_account_entity.Builder other) {
    return new avro_generated_types.root_account_entity.Root_account_entity.Builder(other);
  }

  /**
   * Creates a new Root_account_entity RecordBuilder by copying an existing Root_account_entity instance.
   * @param other The existing instance to copy.
   * @return A new Root_account_entity RecordBuilder
   */
  public static avro_generated_types.root_account_entity.Root_account_entity.Builder newBuilder(avro_generated_types.root_account_entity.Root_account_entity other) {
    return new avro_generated_types.root_account_entity.Root_account_entity.Builder(other);
  }

  /**
   * RecordBuilder for Root_account_entity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Root_account_entity>
    implements org.apache.avro.data.RecordBuilder<Root_account_entity> {

    private java.lang.CharSequence _class;
    private java.lang.CharSequence password;
    private java.lang.Boolean active;
    private avro_generated_types.root_account_entity.Profile profile;
    private avro_generated_types.root_account_entity.Profile.Builder profileBuilder;
    private avro_generated_types.root_account_entity.References references;
    private avro_generated_types.root_account_entity.References.Builder referencesBuilder;
    private java.lang.CharSequence id;
    private java.lang.Boolean __deleted;
    private avro_generated_types.root_account_entity._Meta _meta;
    private avro_generated_types.root_account_entity._Meta.Builder _metaBuilder;
    private avro_generated_types.root_account_entity._Src _src;
    private avro_generated_types.root_account_entity._Src.Builder _srcBuilder;
    private java.lang.Long createdAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro_generated_types.root_account_entity.Root_account_entity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other._class)) {
        this._class = data().deepCopy(fields()[0].schema(), other._class);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.password)) {
        this.password = data().deepCopy(fields()[1].schema(), other.password);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.active)) {
        this.active = data().deepCopy(fields()[2].schema(), other.active);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profile)) {
        this.profile = data().deepCopy(fields()[3].schema(), other.profile);
        fieldSetFlags()[3] = true;
      }
      if (other.hasProfileBuilder()) {
        this.profileBuilder = avro_generated_types.root_account_entity.Profile.newBuilder(other.getProfileBuilder());
      }
      if (isValidValue(fields()[4], other.references)) {
        this.references = data().deepCopy(fields()[4].schema(), other.references);
        fieldSetFlags()[4] = true;
      }
      if (other.hasReferencesBuilder()) {
        this.referencesBuilder = avro_generated_types.root_account_entity.References.newBuilder(other.getReferencesBuilder());
      }
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.__deleted)) {
        this.__deleted = data().deepCopy(fields()[6].schema(), other.__deleted);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._meta)) {
        this._meta = data().deepCopy(fields()[7].schema(), other._meta);
        fieldSetFlags()[7] = true;
      }
      if (other.hasMetaBuilder$1()) {
        this._metaBuilder = avro_generated_types.root_account_entity._Meta.newBuilder(other.getMetaBuilder$1());
      }
      if (isValidValue(fields()[8], other._src)) {
        this._src = data().deepCopy(fields()[8].schema(), other._src);
        fieldSetFlags()[8] = true;
      }
      if (other.hasSrcBuilder$1()) {
        this._srcBuilder = avro_generated_types.root_account_entity._Src.newBuilder(other.getSrcBuilder$1());
      }
      if (isValidValue(fields()[9], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[9].schema(), other.createdAt);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Root_account_entity instance
     * @param other The existing instance to copy.
     */
    private Builder(avro_generated_types.root_account_entity.Root_account_entity other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other._class)) {
        this._class = data().deepCopy(fields()[0].schema(), other._class);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.password)) {
        this.password = data().deepCopy(fields()[1].schema(), other.password);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.active)) {
        this.active = data().deepCopy(fields()[2].schema(), other.active);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.profile)) {
        this.profile = data().deepCopy(fields()[3].schema(), other.profile);
        fieldSetFlags()[3] = true;
      }
      this.profileBuilder = null;
      if (isValidValue(fields()[4], other.references)) {
        this.references = data().deepCopy(fields()[4].schema(), other.references);
        fieldSetFlags()[4] = true;
      }
      this.referencesBuilder = null;
      if (isValidValue(fields()[5], other.id)) {
        this.id = data().deepCopy(fields()[5].schema(), other.id);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.__deleted)) {
        this.__deleted = data().deepCopy(fields()[6].schema(), other.__deleted);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other._meta)) {
        this._meta = data().deepCopy(fields()[7].schema(), other._meta);
        fieldSetFlags()[7] = true;
      }
      this._metaBuilder = null;
      if (isValidValue(fields()[8], other._src)) {
        this._src = data().deepCopy(fields()[8].schema(), other._src);
        fieldSetFlags()[8] = true;
      }
      this._srcBuilder = null;
      if (isValidValue(fields()[9], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[9].schema(), other.createdAt);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the '_class' field.
      * @return The value.
      */
    public java.lang.CharSequence getClass$1() {
      return _class;
    }

    /**
      * Sets the value of the '_class' field.
      * @param value The value of '_class'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setClass$1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this._class = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the '_class' field has been set.
      * @return True if the '_class' field has been set, false otherwise.
      */
    public boolean hasClass$1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the '_class' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearClass$1() {
      _class = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'password' field.
      * @return The value.
      */
    public java.lang.CharSequence getPassword() {
      return password;
    }

    /**
      * Sets the value of the 'password' field.
      * @param value The value of 'password'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setPassword(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.password = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'password' field has been set.
      * @return True if the 'password' field has been set, false otherwise.
      */
    public boolean hasPassword() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'password' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearPassword() {
      password = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'active' field.
      * @return The value.
      */
    public java.lang.Boolean getActive() {
      return active;
    }

    /**
      * Sets the value of the 'active' field.
      * @param value The value of 'active'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setActive(java.lang.Boolean value) {
      validate(fields()[2], value);
      this.active = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'active' field has been set.
      * @return True if the 'active' field has been set, false otherwise.
      */
    public boolean hasActive() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'active' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearActive() {
      active = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'profile' field.
      * @return The value.
      */
    public avro_generated_types.root_account_entity.Profile getProfile() {
      return profile;
    }

    /**
      * Sets the value of the 'profile' field.
      * @param value The value of 'profile'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setProfile(avro_generated_types.root_account_entity.Profile value) {
      validate(fields()[3], value);
      this.profileBuilder = null;
      this.profile = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'profile' field has been set.
      * @return True if the 'profile' field has been set, false otherwise.
      */
    public boolean hasProfile() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'profile' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Profile.Builder getProfileBuilder() {
      if (profileBuilder == null) {
        if (hasProfile()) {
          setProfileBuilder(avro_generated_types.root_account_entity.Profile.newBuilder(profile));
        } else {
          setProfileBuilder(avro_generated_types.root_account_entity.Profile.newBuilder());
        }
      }
      return profileBuilder;
    }

    /**
     * Sets the Builder instance for the 'profile' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setProfileBuilder(avro_generated_types.root_account_entity.Profile.Builder value) {
      clearProfile();
      profileBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'profile' field has an active Builder instance
     * @return True if the 'profile' field has an active Builder instance
     */
    public boolean hasProfileBuilder() {
      return profileBuilder != null;
    }

    /**
      * Clears the value of the 'profile' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearProfile() {
      profile = null;
      profileBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'references' field.
      * @return The value.
      */
    public avro_generated_types.root_account_entity.References getReferences() {
      return references;
    }

    /**
      * Sets the value of the 'references' field.
      * @param value The value of 'references'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setReferences(avro_generated_types.root_account_entity.References value) {
      validate(fields()[4], value);
      this.referencesBuilder = null;
      this.references = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'references' field has been set.
      * @return True if the 'references' field has been set, false otherwise.
      */
    public boolean hasReferences() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'references' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.References.Builder getReferencesBuilder() {
      if (referencesBuilder == null) {
        if (hasReferences()) {
          setReferencesBuilder(avro_generated_types.root_account_entity.References.newBuilder(references));
        } else {
          setReferencesBuilder(avro_generated_types.root_account_entity.References.newBuilder());
        }
      }
      return referencesBuilder;
    }

    /**
     * Sets the Builder instance for the 'references' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setReferencesBuilder(avro_generated_types.root_account_entity.References.Builder value) {
      clearReferences();
      referencesBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'references' field has an active Builder instance
     * @return True if the 'references' field has an active Builder instance
     */
    public boolean hasReferencesBuilder() {
      return referencesBuilder != null;
    }

    /**
      * Clears the value of the 'references' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearReferences() {
      references = null;
      referencesBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setId(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.id = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearId() {
      id = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the '__deleted' field.
      * @return The value.
      */
    public java.lang.Boolean getDeleted$1() {
      return __deleted;
    }

    /**
      * Sets the value of the '__deleted' field.
      * @param value The value of '__deleted'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setDeleted$1(java.lang.Boolean value) {
      validate(fields()[6], value);
      this.__deleted = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the '__deleted' field has been set.
      * @return True if the '__deleted' field has been set, false otherwise.
      */
    public boolean hasDeleted$1() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the '__deleted' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearDeleted$1() {
      __deleted = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the '_meta' field.
      * @return The value.
      */
    public avro_generated_types.root_account_entity._Meta getMeta$1() {
      return _meta;
    }

    /**
      * Sets the value of the '_meta' field.
      * @param value The value of '_meta'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setMeta$1(avro_generated_types.root_account_entity._Meta value) {
      validate(fields()[7], value);
      this._metaBuilder = null;
      this._meta = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the '_meta' field has been set.
      * @return True if the '_meta' field has been set, false otherwise.
      */
    public boolean hasMeta$1() {
      return fieldSetFlags()[7];
    }

    /**
     * Gets the Builder instance for the '_meta' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity._Meta.Builder getMetaBuilder$1() {
      if (_metaBuilder == null) {
        if (hasMeta$1()) {
          setMetaBuilder$1(avro_generated_types.root_account_entity._Meta.newBuilder(_meta));
        } else {
          setMetaBuilder$1(avro_generated_types.root_account_entity._Meta.newBuilder());
        }
      }
      return _metaBuilder;
    }

    /**
     * Sets the Builder instance for the '_meta' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setMetaBuilder$1(avro_generated_types.root_account_entity._Meta.Builder value) {
      clearMeta$1();
      _metaBuilder = value;
      return this;
    }

    /**
     * Checks whether the '_meta' field has an active Builder instance
     * @return True if the '_meta' field has an active Builder instance
     */
    public boolean hasMetaBuilder$1() {
      return _metaBuilder != null;
    }

    /**
      * Clears the value of the '_meta' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearMeta$1() {
      _meta = null;
      _metaBuilder = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the '_src' field.
      * @return The value.
      */
    public avro_generated_types.root_account_entity._Src getSrc$1() {
      return _src;
    }

    /**
      * Sets the value of the '_src' field.
      * @param value The value of '_src'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setSrc$1(avro_generated_types.root_account_entity._Src value) {
      validate(fields()[8], value);
      this._srcBuilder = null;
      this._src = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the '_src' field has been set.
      * @return True if the '_src' field has been set, false otherwise.
      */
    public boolean hasSrc$1() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the '_src' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity._Src.Builder getSrcBuilder$1() {
      if (_srcBuilder == null) {
        if (hasSrc$1()) {
          setSrcBuilder$1(avro_generated_types.root_account_entity._Src.newBuilder(_src));
        } else {
          setSrcBuilder$1(avro_generated_types.root_account_entity._Src.newBuilder());
        }
      }
      return _srcBuilder;
    }

    /**
     * Sets the Builder instance for the '_src' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setSrcBuilder$1(avro_generated_types.root_account_entity._Src.Builder value) {
      clearSrc$1();
      _srcBuilder = value;
      return this;
    }

    /**
     * Checks whether the '_src' field has an active Builder instance
     * @return True if the '_src' field has an active Builder instance
     */
    public boolean hasSrcBuilder$1() {
      return _srcBuilder != null;
    }

    /**
      * Clears the value of the '_src' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearSrc$1() {
      _src = null;
      _srcBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public java.lang.Long getCreatedAt() {
      return createdAt;
    }

    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder setCreatedAt(java.lang.Long value) {
      validate(fields()[9], value);
      this.createdAt = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public avro_generated_types.root_account_entity.Root_account_entity.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public Root_account_entity build() {
      try {
        Root_account_entity record = new Root_account_entity();
        record._class = fieldSetFlags()[0] ? this._class : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.password = fieldSetFlags()[1] ? this.password : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.active = fieldSetFlags()[2] ? this.active : (java.lang.Boolean) defaultValue(fields()[2]);
        if (profileBuilder != null) {
          record.profile = this.profileBuilder.build();
        } else {
          record.profile = fieldSetFlags()[3] ? this.profile : (avro_generated_types.root_account_entity.Profile) defaultValue(fields()[3]);
        }
        if (referencesBuilder != null) {
          record.references = this.referencesBuilder.build();
        } else {
          record.references = fieldSetFlags()[4] ? this.references : (avro_generated_types.root_account_entity.References) defaultValue(fields()[4]);
        }
        record.id = fieldSetFlags()[5] ? this.id : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.__deleted = fieldSetFlags()[6] ? this.__deleted : (java.lang.Boolean) defaultValue(fields()[6]);
        if (_metaBuilder != null) {
          record._meta = this._metaBuilder.build();
        } else {
          record._meta = fieldSetFlags()[7] ? this._meta : (avro_generated_types.root_account_entity._Meta) defaultValue(fields()[7]);
        }
        if (_srcBuilder != null) {
          record._src = this._srcBuilder.build();
        } else {
          record._src = fieldSetFlags()[8] ? this._src : (avro_generated_types.root_account_entity._Src) defaultValue(fields()[8]);
        }
        record.createdAt = fieldSetFlags()[9] ? this.createdAt : (java.lang.Long) defaultValue(fields()[9]);
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
