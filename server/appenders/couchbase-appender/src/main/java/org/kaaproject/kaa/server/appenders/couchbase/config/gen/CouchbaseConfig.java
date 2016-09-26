/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.couchbase.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CouchbaseConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CouchbaseConfig\",\"namespace\":\"org.kaaproject.kaa.server.appenders.couchbase.config.gen\",\"fields\":[{\"name\":\"couchbaseServerUris\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CouchbaseServerUri\",\"fields\":[{\"name\":\"serverUri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Server URI\",\"by_default\":\"http://127.0.0.1:8091/pools\"}]}},\"displayName\":\"Couchbase servers list\",\"minRowCount\":1},{\"name\":\"bucket\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Couchbase bucket name\",\"by_default\":\"default\"},{\"name\":\"password\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Couchbase bucket password\",\"inputType\":\"password\"}]}");
  private java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> couchbaseServerUris;
  private java.lang.String bucket;
  private java.lang.String password;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public CouchbaseConfig() {
  }

  /**
   * All-args constructor.
   */
  public CouchbaseConfig(java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> couchbaseServerUris, java.lang.String bucket, java.lang.String password) {
    this.couchbaseServerUris = couchbaseServerUris;
    this.bucket = bucket;
    this.password = password;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new CouchbaseConfig RecordBuilder
   */
  public static org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder();
  }

  /**
   * Creates a new CouchbaseConfig RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder other) {
    return new org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder(other);
  }

  /**
   * Creates a new CouchbaseConfig RecordBuilder by copying an existing CouchbaseConfig instance
   */
  public static org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig other) {
    return new org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return couchbaseServerUris;
      case 1:
        return bucket;
      case 2:
        return password;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        couchbaseServerUris = (java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri>) value$;
        break;
      case 1:
        bucket = (java.lang.String) value$;
        break;
      case 2:
        password = (java.lang.String) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'couchbaseServerUris' field.
   */
  public java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> getCouchbaseServerUris() {
    return couchbaseServerUris;
  }

  /**
   * Sets the value of the 'couchbaseServerUris' field.
   *
   * @param value the value to set.
   */
  public void setCouchbaseServerUris(java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> value) {
    this.couchbaseServerUris = value;
  }

  /**
   * Gets the value of the 'bucket' field.
   */
  public java.lang.String getBucket() {
    return bucket;
  }

  /**
   * Sets the value of the 'bucket' field.
   *
   * @param value the value to set.
   */
  public void setBucket(java.lang.String value) {
    this.bucket = value;
  }

  /**
   * Gets the value of the 'password' field.
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Sets the value of the 'password' field.
   *
   * @param value the value to set.
   */
  public void setPassword(java.lang.String value) {
    this.password = value;
  }

  /**
   * RecordBuilder for CouchbaseConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CouchbaseConfig>
      implements org.apache.avro.data.RecordBuilder<CouchbaseConfig> {

    private java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> couchbaseServerUris;
    private java.lang.String bucket;
    private java.lang.String password;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.couchbaseServerUris)) {
        this.couchbaseServerUris = data().deepCopy(fields()[0].schema(), other.couchbaseServerUris);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bucket)) {
        this.bucket = data().deepCopy(fields()[1].schema(), other.bucket);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.password)) {
        this.password = data().deepCopy(fields()[2].schema(), other.password);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CouchbaseConfig instance
     */
    private Builder(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig other) {
      super(org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.couchbaseServerUris)) {
        this.couchbaseServerUris = data().deepCopy(fields()[0].schema(), other.couchbaseServerUris);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bucket)) {
        this.bucket = data().deepCopy(fields()[1].schema(), other.bucket);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.password)) {
        this.password = data().deepCopy(fields()[2].schema(), other.password);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Gets the value of the 'couchbaseServerUris' field
     */
    public java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> getCouchbaseServerUris() {
      return couchbaseServerUris;
    }

    /**
     * Sets the value of the 'couchbaseServerUris' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder setCouchbaseServerUris(java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri> value) {
      validate(fields()[0], value);
      this.couchbaseServerUris = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'couchbaseServerUris' field has been set
     */
    public boolean hasCouchbaseServerUris() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'couchbaseServerUris' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder clearCouchbaseServerUris() {
      couchbaseServerUris = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'bucket' field
     */
    public java.lang.String getBucket() {
      return bucket;
    }

    /**
     * Sets the value of the 'bucket' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder setBucket(java.lang.String value) {
      validate(fields()[1], value);
      this.bucket = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'bucket' field has been set
     */
    public boolean hasBucket() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'bucket' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder clearBucket() {
      bucket = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'password' field
     */
    public java.lang.String getPassword() {
      return password;
    }

    /**
     * Sets the value of the 'password' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder setPassword(java.lang.String value) {
      validate(fields()[2], value);
      this.password = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'password' field has been set
     */
    public boolean hasPassword() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'password' field
     */
    public org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseConfig.Builder clearPassword() {
      password = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public CouchbaseConfig build() {
      try {
        CouchbaseConfig record = new CouchbaseConfig();
        record.couchbaseServerUris = fieldSetFlags()[0] ? this.couchbaseServerUris : (java.util.List<org.kaaproject.kaa.server.appenders.couchbase.config.gen.CouchbaseServerUri>) defaultValue(fields()[0]);
        record.bucket = fieldSetFlags()[1] ? this.bucket : (java.lang.String) defaultValue(fields()[1]);
        record.password = fieldSetFlags()[2] ? this.password : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
