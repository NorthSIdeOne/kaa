/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.oraclenosql.config.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class OracleNoSqlConfig extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OracleNoSqlConfig\",\"namespace\":\"org.kaaproject.kaa.server.appenders.oraclenosql.config.gen\",\"fields\":[{\"name\":\"storeName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"KVStore name\",\"by_default\":\"kvstore\"},{\"name\":\"kvStoreNodes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"KvStoreNode\",\"fields\":[{\"name\":\"host\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Host\",\"weight\":0.75,\"by_default\":\"localhost\"},{\"name\":\"port\",\"type\":\"int\",\"displayName\":\"Port\",\"weight\":0.25,\"by_default\":5000}]}},\"displayName\":\"KVStore nodes\",\"minRowCount\":1},{\"name\":\"username\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Username\"},{\"name\":\"walletDir\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Oracle Wallet directory\"},{\"name\":\"pwdFile\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Password store file\"},{\"name\":\"securityFile\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Security properties file\"},{\"name\":\"transport\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"KVStore communication transport\"},{\"name\":\"ssl\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Security transport\"},{\"name\":\"sslCipherSuites\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"SSL/TLS cipher suites\"},{\"name\":\"sslProtocols\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"SSL/TLS procotols\"},{\"name\":\"sslHostnameVerifier\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"SSL/TLS hostname verifier\"},{\"name\":\"sslTrustStore\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Java truststore file location\"},{\"name\":\"sslTrustStoreType\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"displayName\":\"Java truststore type\"}]}");
  private java.lang.String storeName;
  private java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> kvStoreNodes;
  private java.lang.String username;
  private java.lang.String walletDir;
  private java.lang.String pwdFile;
  private java.lang.String securityFile;
  private java.lang.String transport;
  private java.lang.String ssl;
  private java.lang.String sslCipherSuites;
  private java.lang.String sslProtocols;
  private java.lang.String sslHostnameVerifier;
  private java.lang.String sslTrustStore;
  private java.lang.String sslTrustStoreType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public OracleNoSqlConfig() {
  }

  /**
   * All-args constructor.
   */
  public OracleNoSqlConfig(java.lang.String storeName, java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> kvStoreNodes, java.lang.String username, java.lang.String walletDir, java.lang.String pwdFile, java.lang.String securityFile, java.lang.String transport, java.lang.String ssl, java.lang.String sslCipherSuites, java.lang.String sslProtocols, java.lang.String sslHostnameVerifier, java.lang.String sslTrustStore, java.lang.String sslTrustStoreType) {
    this.storeName = storeName;
    this.kvStoreNodes = kvStoreNodes;
    this.username = username;
    this.walletDir = walletDir;
    this.pwdFile = pwdFile;
    this.securityFile = securityFile;
    this.transport = transport;
    this.ssl = ssl;
    this.sslCipherSuites = sslCipherSuites;
    this.sslProtocols = sslProtocols;
    this.sslHostnameVerifier = sslHostnameVerifier;
    this.sslTrustStore = sslTrustStore;
    this.sslTrustStoreType = sslTrustStoreType;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new OracleNoSqlConfig RecordBuilder
   */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder();
  }

  /**
   * Creates a new OracleNoSqlConfig RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder other) {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder(other);
  }

  /**
   * Creates a new OracleNoSqlConfig RecordBuilder by copying an existing OracleNoSqlConfig instance
   */
  public static org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder newBuilder(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig other) {
    return new org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return storeName;
      case 1:
        return kvStoreNodes;
      case 2:
        return username;
      case 3:
        return walletDir;
      case 4:
        return pwdFile;
      case 5:
        return securityFile;
      case 6:
        return transport;
      case 7:
        return ssl;
      case 8:
        return sslCipherSuites;
      case 9:
        return sslProtocols;
      case 10:
        return sslHostnameVerifier;
      case 11:
        return sslTrustStore;
      case 12:
        return sslTrustStoreType;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        storeName = (java.lang.String) value$;
        break;
      case 1:
        kvStoreNodes = (java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode>) value$;
        break;
      case 2:
        username = (java.lang.String) value$;
        break;
      case 3:
        walletDir = (java.lang.String) value$;
        break;
      case 4:
        pwdFile = (java.lang.String) value$;
        break;
      case 5:
        securityFile = (java.lang.String) value$;
        break;
      case 6:
        transport = (java.lang.String) value$;
        break;
      case 7:
        ssl = (java.lang.String) value$;
        break;
      case 8:
        sslCipherSuites = (java.lang.String) value$;
        break;
      case 9:
        sslProtocols = (java.lang.String) value$;
        break;
      case 10:
        sslHostnameVerifier = (java.lang.String) value$;
        break;
      case 11:
        sslTrustStore = (java.lang.String) value$;
        break;
      case 12:
        sslTrustStoreType = (java.lang.String) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'storeName' field.
   */
  public java.lang.String getStoreName() {
    return storeName;
  }

  /**
   * Sets the value of the 'storeName' field.
   *
   * @param value the value to set.
   */
  public void setStoreName(java.lang.String value) {
    this.storeName = value;
  }

  /**
   * Gets the value of the 'kvStoreNodes' field.
   */
  public java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> getKvStoreNodes() {
    return kvStoreNodes;
  }

  /**
   * Sets the value of the 'kvStoreNodes' field.
   *
   * @param value the value to set.
   */
  public void setKvStoreNodes(java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> value) {
    this.kvStoreNodes = value;
  }

  /**
   * Gets the value of the 'username' field.
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Sets the value of the 'username' field.
   *
   * @param value the value to set.
   */
  public void setUsername(java.lang.String value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'walletDir' field.
   */
  public java.lang.String getWalletDir() {
    return walletDir;
  }

  /**
   * Sets the value of the 'walletDir' field.
   *
   * @param value the value to set.
   */
  public void setWalletDir(java.lang.String value) {
    this.walletDir = value;
  }

  /**
   * Gets the value of the 'pwdFile' field.
   */
  public java.lang.String getPwdFile() {
    return pwdFile;
  }

  /**
   * Sets the value of the 'pwdFile' field.
   *
   * @param value the value to set.
   */
  public void setPwdFile(java.lang.String value) {
    this.pwdFile = value;
  }

  /**
   * Gets the value of the 'securityFile' field.
   */
  public java.lang.String getSecurityFile() {
    return securityFile;
  }

  /**
   * Sets the value of the 'securityFile' field.
   *
   * @param value the value to set.
   */
  public void setSecurityFile(java.lang.String value) {
    this.securityFile = value;
  }

  /**
   * Gets the value of the 'transport' field.
   */
  public java.lang.String getTransport() {
    return transport;
  }

  /**
   * Sets the value of the 'transport' field.
   *
   * @param value the value to set.
   */
  public void setTransport(java.lang.String value) {
    this.transport = value;
  }

  /**
   * Gets the value of the 'ssl' field.
   */
  public java.lang.String getSsl() {
    return ssl;
  }

  /**
   * Sets the value of the 'ssl' field.
   *
   * @param value the value to set.
   */
  public void setSsl(java.lang.String value) {
    this.ssl = value;
  }

  /**
   * Gets the value of the 'sslCipherSuites' field.
   */
  public java.lang.String getSslCipherSuites() {
    return sslCipherSuites;
  }

  /**
   * Sets the value of the 'sslCipherSuites' field.
   *
   * @param value the value to set.
   */
  public void setSslCipherSuites(java.lang.String value) {
    this.sslCipherSuites = value;
  }

  /**
   * Gets the value of the 'sslProtocols' field.
   */
  public java.lang.String getSslProtocols() {
    return sslProtocols;
  }

  /**
   * Sets the value of the 'sslProtocols' field.
   *
   * @param value the value to set.
   */
  public void setSslProtocols(java.lang.String value) {
    this.sslProtocols = value;
  }

  /**
   * Gets the value of the 'sslHostnameVerifier' field.
   */
  public java.lang.String getSslHostnameVerifier() {
    return sslHostnameVerifier;
  }

  /**
   * Sets the value of the 'sslHostnameVerifier' field.
   *
   * @param value the value to set.
   */
  public void setSslHostnameVerifier(java.lang.String value) {
    this.sslHostnameVerifier = value;
  }

  /**
   * Gets the value of the 'sslTrustStore' field.
   */
  public java.lang.String getSslTrustStore() {
    return sslTrustStore;
  }

  /**
   * Sets the value of the 'sslTrustStore' field.
   *
   * @param value the value to set.
   */
  public void setSslTrustStore(java.lang.String value) {
    this.sslTrustStore = value;
  }

  /**
   * Gets the value of the 'sslTrustStoreType' field.
   */
  public java.lang.String getSslTrustStoreType() {
    return sslTrustStoreType;
  }

  /**
   * Sets the value of the 'sslTrustStoreType' field.
   *
   * @param value the value to set.
   */
  public void setSslTrustStoreType(java.lang.String value) {
    this.sslTrustStoreType = value;
  }

  /**
   * RecordBuilder for OracleNoSqlConfig instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OracleNoSqlConfig>
      implements org.apache.avro.data.RecordBuilder<OracleNoSqlConfig> {

    private java.lang.String storeName;
    private java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> kvStoreNodes;
    private java.lang.String username;
    private java.lang.String walletDir;
    private java.lang.String pwdFile;
    private java.lang.String securityFile;
    private java.lang.String transport;
    private java.lang.String ssl;
    private java.lang.String sslCipherSuites;
    private java.lang.String sslProtocols;
    private java.lang.String sslHostnameVerifier;
    private java.lang.String sslTrustStore;
    private java.lang.String sslTrustStoreType;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.storeName)) {
        this.storeName = data().deepCopy(fields()[0].schema(), other.storeName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.kvStoreNodes)) {
        this.kvStoreNodes = data().deepCopy(fields()[1].schema(), other.kvStoreNodes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.username)) {
        this.username = data().deepCopy(fields()[2].schema(), other.username);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.walletDir)) {
        this.walletDir = data().deepCopy(fields()[3].schema(), other.walletDir);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pwdFile)) {
        this.pwdFile = data().deepCopy(fields()[4].schema(), other.pwdFile);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.securityFile)) {
        this.securityFile = data().deepCopy(fields()[5].schema(), other.securityFile);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.transport)) {
        this.transport = data().deepCopy(fields()[6].schema(), other.transport);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ssl)) {
        this.ssl = data().deepCopy(fields()[7].schema(), other.ssl);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sslCipherSuites)) {
        this.sslCipherSuites = data().deepCopy(fields()[8].schema(), other.sslCipherSuites);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.sslProtocols)) {
        this.sslProtocols = data().deepCopy(fields()[9].schema(), other.sslProtocols);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.sslHostnameVerifier)) {
        this.sslHostnameVerifier = data().deepCopy(fields()[10].schema(), other.sslHostnameVerifier);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sslTrustStore)) {
        this.sslTrustStore = data().deepCopy(fields()[11].schema(), other.sslTrustStore);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.sslTrustStoreType)) {
        this.sslTrustStoreType = data().deepCopy(fields()[12].schema(), other.sslTrustStoreType);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing OracleNoSqlConfig instance
     */
    private Builder(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig other) {
      super(org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.SCHEMA$);
      if (isValidValue(fields()[0], other.storeName)) {
        this.storeName = data().deepCopy(fields()[0].schema(), other.storeName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.kvStoreNodes)) {
        this.kvStoreNodes = data().deepCopy(fields()[1].schema(), other.kvStoreNodes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.username)) {
        this.username = data().deepCopy(fields()[2].schema(), other.username);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.walletDir)) {
        this.walletDir = data().deepCopy(fields()[3].schema(), other.walletDir);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.pwdFile)) {
        this.pwdFile = data().deepCopy(fields()[4].schema(), other.pwdFile);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.securityFile)) {
        this.securityFile = data().deepCopy(fields()[5].schema(), other.securityFile);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.transport)) {
        this.transport = data().deepCopy(fields()[6].schema(), other.transport);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.ssl)) {
        this.ssl = data().deepCopy(fields()[7].schema(), other.ssl);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sslCipherSuites)) {
        this.sslCipherSuites = data().deepCopy(fields()[8].schema(), other.sslCipherSuites);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.sslProtocols)) {
        this.sslProtocols = data().deepCopy(fields()[9].schema(), other.sslProtocols);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.sslHostnameVerifier)) {
        this.sslHostnameVerifier = data().deepCopy(fields()[10].schema(), other.sslHostnameVerifier);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.sslTrustStore)) {
        this.sslTrustStore = data().deepCopy(fields()[11].schema(), other.sslTrustStore);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.sslTrustStoreType)) {
        this.sslTrustStoreType = data().deepCopy(fields()[12].schema(), other.sslTrustStoreType);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Gets the value of the 'storeName' field
     */
    public java.lang.String getStoreName() {
      return storeName;
    }

    /**
     * Sets the value of the 'storeName' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setStoreName(java.lang.String value) {
      validate(fields()[0], value);
      this.storeName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'storeName' field has been set
     */
    public boolean hasStoreName() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'storeName' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearStoreName() {
      storeName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'kvStoreNodes' field
     */
    public java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> getKvStoreNodes() {
      return kvStoreNodes;
    }

    /**
     * Sets the value of the 'kvStoreNodes' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setKvStoreNodes(java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode> value) {
      validate(fields()[1], value);
      this.kvStoreNodes = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'kvStoreNodes' field has been set
     */
    public boolean hasKvStoreNodes() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'kvStoreNodes' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearKvStoreNodes() {
      kvStoreNodes = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'username' field
     */
    public java.lang.String getUsername() {
      return username;
    }

    /**
     * Sets the value of the 'username' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setUsername(java.lang.String value) {
      validate(fields()[2], value);
      this.username = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'username' field has been set
     */
    public boolean hasUsername() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'username' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearUsername() {
      username = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'walletDir' field
     */
    public java.lang.String getWalletDir() {
      return walletDir;
    }

    /**
     * Sets the value of the 'walletDir' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setWalletDir(java.lang.String value) {
      validate(fields()[3], value);
      this.walletDir = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'walletDir' field has been set
     */
    public boolean hasWalletDir() {
      return fieldSetFlags()[3];
    }

    /**
     * Clears the value of the 'walletDir' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearWalletDir() {
      walletDir = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'pwdFile' field
     */
    public java.lang.String getPwdFile() {
      return pwdFile;
    }

    /**
     * Sets the value of the 'pwdFile' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setPwdFile(java.lang.String value) {
      validate(fields()[4], value);
      this.pwdFile = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'pwdFile' field has been set
     */
    public boolean hasPwdFile() {
      return fieldSetFlags()[4];
    }

    /**
     * Clears the value of the 'pwdFile' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearPwdFile() {
      pwdFile = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
     * Gets the value of the 'securityFile' field
     */
    public java.lang.String getSecurityFile() {
      return securityFile;
    }

    /**
     * Sets the value of the 'securityFile' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSecurityFile(java.lang.String value) {
      validate(fields()[5], value);
      this.securityFile = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
     * Checks whether the 'securityFile' field has been set
     */
    public boolean hasSecurityFile() {
      return fieldSetFlags()[5];
    }

    /**
     * Clears the value of the 'securityFile' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSecurityFile() {
      securityFile = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
     * Gets the value of the 'transport' field
     */
    public java.lang.String getTransport() {
      return transport;
    }

    /**
     * Sets the value of the 'transport' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setTransport(java.lang.String value) {
      validate(fields()[6], value);
      this.transport = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
     * Checks whether the 'transport' field has been set
     */
    public boolean hasTransport() {
      return fieldSetFlags()[6];
    }

    /**
     * Clears the value of the 'transport' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearTransport() {
      transport = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
     * Gets the value of the 'ssl' field
     */
    public java.lang.String getSsl() {
      return ssl;
    }

    /**
     * Sets the value of the 'ssl' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSsl(java.lang.String value) {
      validate(fields()[7], value);
      this.ssl = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
     * Checks whether the 'ssl' field has been set
     */
    public boolean hasSsl() {
      return fieldSetFlags()[7];
    }

    /**
     * Clears the value of the 'ssl' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSsl() {
      ssl = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
     * Gets the value of the 'sslCipherSuites' field
     */
    public java.lang.String getSslCipherSuites() {
      return sslCipherSuites;
    }

    /**
     * Sets the value of the 'sslCipherSuites' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSslCipherSuites(java.lang.String value) {
      validate(fields()[8], value);
      this.sslCipherSuites = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
     * Checks whether the 'sslCipherSuites' field has been set
     */
    public boolean hasSslCipherSuites() {
      return fieldSetFlags()[8];
    }

    /**
     * Clears the value of the 'sslCipherSuites' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSslCipherSuites() {
      sslCipherSuites = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
     * Gets the value of the 'sslProtocols' field
     */
    public java.lang.String getSslProtocols() {
      return sslProtocols;
    }

    /**
     * Sets the value of the 'sslProtocols' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSslProtocols(java.lang.String value) {
      validate(fields()[9], value);
      this.sslProtocols = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
     * Checks whether the 'sslProtocols' field has been set
     */
    public boolean hasSslProtocols() {
      return fieldSetFlags()[9];
    }

    /**
     * Clears the value of the 'sslProtocols' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSslProtocols() {
      sslProtocols = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
     * Gets the value of the 'sslHostnameVerifier' field
     */
    public java.lang.String getSslHostnameVerifier() {
      return sslHostnameVerifier;
    }

    /**
     * Sets the value of the 'sslHostnameVerifier' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSslHostnameVerifier(java.lang.String value) {
      validate(fields()[10], value);
      this.sslHostnameVerifier = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
     * Checks whether the 'sslHostnameVerifier' field has been set
     */
    public boolean hasSslHostnameVerifier() {
      return fieldSetFlags()[10];
    }

    /**
     * Clears the value of the 'sslHostnameVerifier' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSslHostnameVerifier() {
      sslHostnameVerifier = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
     * Gets the value of the 'sslTrustStore' field
     */
    public java.lang.String getSslTrustStore() {
      return sslTrustStore;
    }

    /**
     * Sets the value of the 'sslTrustStore' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSslTrustStore(java.lang.String value) {
      validate(fields()[11], value);
      this.sslTrustStore = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
     * Checks whether the 'sslTrustStore' field has been set
     */
    public boolean hasSslTrustStore() {
      return fieldSetFlags()[11];
    }

    /**
     * Clears the value of the 'sslTrustStore' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSslTrustStore() {
      sslTrustStore = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
     * Gets the value of the 'sslTrustStoreType' field
     */
    public java.lang.String getSslTrustStoreType() {
      return sslTrustStoreType;
    }

    /**
     * Sets the value of the 'sslTrustStoreType' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder setSslTrustStoreType(java.lang.String value) {
      validate(fields()[12], value);
      this.sslTrustStoreType = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
     * Checks whether the 'sslTrustStoreType' field has been set
     */
    public boolean hasSslTrustStoreType() {
      return fieldSetFlags()[12];
    }

    /**
     * Clears the value of the 'sslTrustStoreType' field
     */
    public org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.OracleNoSqlConfig.Builder clearSslTrustStoreType() {
      sslTrustStoreType = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public OracleNoSqlConfig build() {
      try {
        OracleNoSqlConfig record = new OracleNoSqlConfig();
        record.storeName = fieldSetFlags()[0] ? this.storeName : (java.lang.String) defaultValue(fields()[0]);
        record.kvStoreNodes = fieldSetFlags()[1] ? this.kvStoreNodes : (java.util.List<org.kaaproject.kaa.server.appenders.oraclenosql.config.gen.KvStoreNode>) defaultValue(fields()[1]);
        record.username = fieldSetFlags()[2] ? this.username : (java.lang.String) defaultValue(fields()[2]);
        record.walletDir = fieldSetFlags()[3] ? this.walletDir : (java.lang.String) defaultValue(fields()[3]);
        record.pwdFile = fieldSetFlags()[4] ? this.pwdFile : (java.lang.String) defaultValue(fields()[4]);
        record.securityFile = fieldSetFlags()[5] ? this.securityFile : (java.lang.String) defaultValue(fields()[5]);
        record.transport = fieldSetFlags()[6] ? this.transport : (java.lang.String) defaultValue(fields()[6]);
        record.ssl = fieldSetFlags()[7] ? this.ssl : (java.lang.String) defaultValue(fields()[7]);
        record.sslCipherSuites = fieldSetFlags()[8] ? this.sslCipherSuites : (java.lang.String) defaultValue(fields()[8]);
        record.sslProtocols = fieldSetFlags()[9] ? this.sslProtocols : (java.lang.String) defaultValue(fields()[9]);
        record.sslHostnameVerifier = fieldSetFlags()[10] ? this.sslHostnameVerifier : (java.lang.String) defaultValue(fields()[10]);
        record.sslTrustStore = fieldSetFlags()[11] ? this.sslTrustStore : (java.lang.String) defaultValue(fields()[11]);
        record.sslTrustStoreType = fieldSetFlags()[12] ? this.sslTrustStoreType : (java.lang.String) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
