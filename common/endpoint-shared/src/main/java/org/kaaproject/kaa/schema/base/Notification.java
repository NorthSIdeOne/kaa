/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.schema.base;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Notification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Notification\",\"namespace\":\"org.kaaproject.kaa.schema.base\",\"fields\":[]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new Notification RecordBuilder
   */
  public static org.kaaproject.kaa.schema.base.Notification.Builder newBuilder() {
    return new org.kaaproject.kaa.schema.base.Notification.Builder();
  }

  /**
   * Creates a new Notification RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.schema.base.Notification.Builder newBuilder(org.kaaproject.kaa.schema.base.Notification.Builder other) {
    return new org.kaaproject.kaa.schema.base.Notification.Builder(other);
  }

  /**
   * Creates a new Notification RecordBuilder by copying an existing Notification instance
   */
  public static org.kaaproject.kaa.schema.base.Notification.Builder newBuilder(org.kaaproject.kaa.schema.base.Notification other) {
    return new org.kaaproject.kaa.schema.base.Notification.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * RecordBuilder for Notification instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Notification>
      implements org.apache.avro.data.RecordBuilder<Notification> {


    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.schema.base.Notification.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.schema.base.Notification.Builder other) {
      super(other);
    }

    /**
     * Creates a Builder by copying an existing Notification instance
     */
    private Builder(org.kaaproject.kaa.schema.base.Notification other) {
      super(org.kaaproject.kaa.schema.base.Notification.SCHEMA$);
    }

    @Override
    public Notification build() {
      try {
        Notification record = new Notification();
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
