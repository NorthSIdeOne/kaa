/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.cassandra.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ClusteringElement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClusteringElement\",\"namespace\":\"org.kaaproject.kaa.server.appenders.cassandra.config.gen\",\"fields\":[{\"name\":\"columnName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Name\",\"weight\":0.2,\"by_default\":\"application_token\"},{\"name\":\"order\",\"type\":{\"type\":\"enum\",\"name\":\"OrderType\",\"symbols\":[\"DESC\",\"ASC\"]},\"displayName\":\"Order\",\"weight\":0.2,\"by_default\":\"DESC\"}]}");
  private java.lang.String columnName;
  private org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType order;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public ClusteringElement() {
  }

  /**
   * All-args constructor.
   */
  public ClusteringElement(java.lang.String columnName, org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType order) {
    this.columnName = columnName;
    this.order = order;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new ClusteringElement RecordBuilder
   */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder();
  }

  /**
   * Creates a new ClusteringElement RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder(other);
  }

  /**
   * Creates a new ClusteringElement RecordBuilder by copying an existing ClusteringElement instance
   */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return columnName;
      case 1:
        return order;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        columnName = (java.lang.String) value$;
        break;
      case 1:
        order = (org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'columnName' field.
   */
  public java.lang.String getColumnName() {
    return columnName;
  }

  /**
   * Sets the value of the 'columnName' field.
   *
   * @param value the value to set.
   */
  public void setColumnName(java.lang.String value) {
    this.columnName = value;
  }

  /**
   * Gets the value of the 'order' field.
   */
  public org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType getOrder() {
    return order;
  }

  /**
   * Sets the value of the 'order' field.
   *
   * @param value the value to set.
   */
  public void setOrder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType value) {
    this.order = value;
  }

  /**
   * RecordBuilder for ClusteringElement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClusteringElement>
      implements org.apache.avro.data.RecordBuilder<ClusteringElement> {

    private java.lang.String columnName;
    private org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType order;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.columnName)) {
        this.columnName = data().deepCopy(fields()[0].schema(), other.columnName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order)) {
        this.order = data().deepCopy(fields()[1].schema(), other.order);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ClusteringElement instance
     */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement other) {
      super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.SCHEMA$);
      if (isValidValue(fields()[0], other.columnName)) {
        this.columnName = data().deepCopy(fields()[0].schema(), other.columnName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.order)) {
        this.order = data().deepCopy(fields()[1].schema(), other.order);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'columnName' field
     */
    public java.lang.String getColumnName() {
      return columnName;
    }

    /**
     * Sets the value of the 'columnName' field
     */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder setColumnName(java.lang.String value) {
      validate(fields()[0], value);
      this.columnName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'columnName' field has been set
     */
    public boolean hasColumnName() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'columnName' field
     */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder clearColumnName() {
      columnName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'order' field
     */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType getOrder() {
      return order;
    }

    /**
     * Sets the value of the 'order' field
     */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder setOrder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType value) {
      validate(fields()[1], value);
      this.order = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'order' field has been set
     */
    public boolean hasOrder() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'order' field
     */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ClusteringElement.Builder clearOrder() {
      order = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public ClusteringElement build() {
      try {
        ClusteringElement record = new ClusteringElement();
        record.columnName = fieldSetFlags()[0] ? this.columnName : (java.lang.String) defaultValue(fields()[0]);
        record.order = fieldSetFlags()[1] ? this.order : (org.kaaproject.kaa.server.appenders.cassandra.config.gen.OrderType) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
