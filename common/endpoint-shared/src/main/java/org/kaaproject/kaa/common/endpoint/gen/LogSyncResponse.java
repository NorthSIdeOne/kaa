/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.common.endpoint.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LogSyncResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogSyncResponse\",\"namespace\":\"org.kaaproject.kaa.common.endpoint.gen\",\"fields\":[{\"name\":\"deliveryStatuses\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LogDeliveryStatus\",\"fields\":[{\"name\":\"requestId\",\"type\":\"int\"},{\"name\":\"result\",\"type\":{\"type\":\"enum\",\"name\":\"SyncResponseResultType\",\"symbols\":[\"SUCCESS\",\"FAILURE\",\"PROFILE_RESYNC\",\"REDIRECT\"]}},{\"name\":\"errorCode\",\"type\":[{\"type\":\"enum\",\"name\":\"LogDeliveryErrorCode\",\"symbols\":[\"NO_APPENDERS_CONFIGURED\",\"APPENDER_INTERNAL_ERROR\",\"REMOTE_CONNECTION_ERROR\",\"REMOTE_INTERNAL_ERROR\"],\"direction\":\"in\"},\"null\"]}],\"direction\":\"in\"}},\"null\"]}],\"direction\":\"in\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> deliveryStatuses;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public LogSyncResponse() {}

  /**
   * All-args constructor.
   */
  public LogSyncResponse(java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> deliveryStatuses) {
    this.deliveryStatuses = deliveryStatuses;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return deliveryStatuses;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: deliveryStatuses = (java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'deliveryStatuses' field.
   */
  public java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> getDeliveryStatuses() {
    return deliveryStatuses;
  }

  /**
   * Sets the value of the 'deliveryStatuses' field.
   * @param value the value to set.
   */
  public void setDeliveryStatuses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> value) {
    this.deliveryStatuses = value;
  }

  /** Creates a new LogSyncResponse RecordBuilder */
  public static org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder newBuilder() {
    return new org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder();
  }
  
  /** Creates a new LogSyncResponse RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder other) {
    return new org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder(other);
  }
  
  /** Creates a new LogSyncResponse RecordBuilder by copying an existing LogSyncResponse instance */
  public static org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder newBuilder(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse other) {
    return new org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder(other);
  }
  
  /**
   * RecordBuilder for LogSyncResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogSyncResponse>
    implements org.apache.avro.data.RecordBuilder<LogSyncResponse> {

    private java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> deliveryStatuses;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.deliveryStatuses)) {
        this.deliveryStatuses = data().deepCopy(fields()[0].schema(), other.deliveryStatuses);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing LogSyncResponse instance */
    private Builder(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse other) {
            super(org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.SCHEMA$);
      if (isValidValue(fields()[0], other.deliveryStatuses)) {
        this.deliveryStatuses = data().deepCopy(fields()[0].schema(), other.deliveryStatuses);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'deliveryStatuses' field */
    public java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> getDeliveryStatuses() {
      return deliveryStatuses;
    }
    
    /** Sets the value of the 'deliveryStatuses' field */
    public org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder setDeliveryStatuses(java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus> value) {
      validate(fields()[0], value);
      this.deliveryStatuses = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'deliveryStatuses' field has been set */
    public boolean hasDeliveryStatuses() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'deliveryStatuses' field */
    public org.kaaproject.kaa.common.endpoint.gen.LogSyncResponse.Builder clearDeliveryStatuses() {
      deliveryStatuses = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public LogSyncResponse build() {
      try {
        LogSyncResponse record = new LogSyncResponse();
        record.deliveryStatuses = fieldSetFlags()[0] ? this.deliveryStatuses : (java.util.List<org.kaaproject.kaa.common.endpoint.gen.LogDeliveryStatus>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
