package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** Define an environment variable that will be set in the runtime environment
by the workflow platform when executing the command line tool.  May be the
result of executing an expression, such as getting a parameter from input.
 */
@org.apache.avro.specific.AvroGenerated
public class EnvironmentDef extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnvironmentDef\",\"doc\":\"Define an environment variable that will be set in the runtime environment\\nby the workflow platform when executing the command line tool.  May be the\\nresult of executing an expression, such as getting a parameter from input.\\n\",\"fields\":[{\"name\":\"envName\",\"type\":\"string\",\"doc\":\"The environment variable name\"},{\"name\":\"envValue\",\"type\":[\"string\",{\"type\":\"enum\",\"name\":\"Expression\",\"doc\":\"Not a real type.  Indicates that a field must allow expressions.\\n\",\"symbols\":[\"ExpressionPlaceholder\"]}],\"doc\":\"The environment variable value\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The environment variable name */
  @Deprecated public java.lang.CharSequence envName;
  /** The environment variable value */
  @Deprecated public java.lang.Object envValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public EnvironmentDef() {}

  /**
   * All-args constructor.
   */
  public EnvironmentDef(java.lang.CharSequence envName, java.lang.Object envValue) {
    this.envName = envName;
    this.envValue = envValue;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return envName;
    case 1: return envValue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: envName = (java.lang.CharSequence)value$; break;
    case 1: envValue = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'envName' field.
   * The environment variable name   */
  public java.lang.CharSequence getEnvName() {
    return envName;
  }

  /**
   * Sets the value of the 'envName' field.
   * The environment variable name   * @param value the value to set.
   */
  public void setEnvName(java.lang.CharSequence value) {
    this.envName = value;
  }

  /**
   * Gets the value of the 'envValue' field.
   * The environment variable value   */
  public java.lang.Object getEnvValue() {
    return envValue;
  }

  /**
   * Sets the value of the 'envValue' field.
   * The environment variable value   * @param value the value to set.
   */
  public void setEnvValue(java.lang.Object value) {
    this.envValue = value;
  }

  /** Creates a new EnvironmentDef RecordBuilder */
  public static EnvironmentDef.Builder newBuilder() {
    return new EnvironmentDef.Builder();
  }
  
  /** Creates a new EnvironmentDef RecordBuilder by copying an existing Builder */
  public static EnvironmentDef.Builder newBuilder(EnvironmentDef.Builder other) {
    return new EnvironmentDef.Builder(other);
  }
  
  /** Creates a new EnvironmentDef RecordBuilder by copying an existing EnvironmentDef instance */
  public static EnvironmentDef.Builder newBuilder(EnvironmentDef other) {
    return new EnvironmentDef.Builder(other);
  }
  
  /**
   * RecordBuilder for EnvironmentDef instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnvironmentDef>
    implements org.apache.avro.data.RecordBuilder<EnvironmentDef> {

    private java.lang.CharSequence envName;
    private java.lang.Object envValue;

    /** Creates a new Builder */
    private Builder() {
      super(EnvironmentDef.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(EnvironmentDef.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.envName)) {
        this.envName = data().deepCopy(fields()[0].schema(), other.envName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.envValue)) {
        this.envValue = data().deepCopy(fields()[1].schema(), other.envValue);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EnvironmentDef instance */
    private Builder(EnvironmentDef other) {
            super(EnvironmentDef.SCHEMA$);
      if (isValidValue(fields()[0], other.envName)) {
        this.envName = data().deepCopy(fields()[0].schema(), other.envName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.envValue)) {
        this.envValue = data().deepCopy(fields()[1].schema(), other.envValue);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'envName' field */
    public java.lang.CharSequence getEnvName() {
      return envName;
    }
    
    /** Sets the value of the 'envName' field */
    public EnvironmentDef.Builder setEnvName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.envName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'envName' field has been set */
    public boolean hasEnvName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'envName' field */
    public EnvironmentDef.Builder clearEnvName() {
      envName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'envValue' field */
    public java.lang.Object getEnvValue() {
      return envValue;
    }
    
    /** Sets the value of the 'envValue' field */
    public EnvironmentDef.Builder setEnvValue(java.lang.Object value) {
      validate(fields()[1], value);
      this.envValue = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'envValue' field has been set */
    public boolean hasEnvValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'envValue' field */
    public EnvironmentDef.Builder clearEnvValue() {
      envValue = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EnvironmentDef build() {
      try {
        EnvironmentDef record = new EnvironmentDef();
        record.envName = fieldSetFlags()[0] ? this.envName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.envValue = fieldSetFlags()[1] ? this.envValue : (java.lang.Object) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
