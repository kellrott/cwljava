package io.cwl.avro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** Associate an output parameter of the underlying process with a workflow
parameter.  The workflow parameter (given in the `id` field) be may be used
as a `source` to connect with input parameters of other workflow steps, or
with an output parameter of the process.
 */
@org.apache.avro.specific.AvroGenerated
public class WorkflowStepOutput extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WorkflowStepOutput\",\"doc\":\"Associate an output parameter of the underlying process with a workflow\\nparameter.  The workflow parameter (given in the `id` field) be may be used\\nas a `source` to connect with input parameters of other workflow steps, or\\nwith an output parameter of the process.\\n\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"A unique identifier for this workflow output parameter.  This is the\\nidentifier to use in the `source` field of `WorkflowStepInput` to\\nconnect the output value to downstream parameters.\\n\",\"jsonldPredicate\":\"@id\"}],\"docParent\":\"https://w3id.org/cwl/cwl#WorkflowStep\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** A unique identifier for this workflow output parameter.  This is the
identifier to use in the `source` field of `WorkflowStepInput` to
connect the output value to downstream parameters.
 */
  @Deprecated public java.lang.CharSequence id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public WorkflowStepOutput() {}

  /**
   * All-args constructor.
   */
  public WorkflowStepOutput(java.lang.CharSequence id) {
    this.id = id;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * A unique identifier for this workflow output parameter.  This is the
identifier to use in the `source` field of `WorkflowStepInput` to
connect the output value to downstream parameters.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * A unique identifier for this workflow output parameter.  This is the
identifier to use in the `source` field of `WorkflowStepInput` to
connect the output value to downstream parameters.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /** Creates a new WorkflowStepOutput RecordBuilder */
  public static WorkflowStepOutput.Builder newBuilder() {
    return new WorkflowStepOutput.Builder();
  }
  
  /** Creates a new WorkflowStepOutput RecordBuilder by copying an existing Builder */
  public static WorkflowStepOutput.Builder newBuilder(WorkflowStepOutput.Builder other) {
    return new WorkflowStepOutput.Builder(other);
  }
  
  /** Creates a new WorkflowStepOutput RecordBuilder by copying an existing WorkflowStepOutput instance */
  public static WorkflowStepOutput.Builder newBuilder(WorkflowStepOutput other) {
    return new WorkflowStepOutput.Builder(other);
  }
  
  /**
   * RecordBuilder for WorkflowStepOutput instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WorkflowStepOutput>
    implements org.apache.avro.data.RecordBuilder<WorkflowStepOutput> {

    private java.lang.CharSequence id;

    /** Creates a new Builder */
    private Builder() {
      super(WorkflowStepOutput.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(WorkflowStepOutput.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing WorkflowStepOutput instance */
    private Builder(WorkflowStepOutput other) {
            super(WorkflowStepOutput.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public WorkflowStepOutput.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public WorkflowStepOutput.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public WorkflowStepOutput build() {
      try {
        WorkflowStepOutput record = new WorkflowStepOutput();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
