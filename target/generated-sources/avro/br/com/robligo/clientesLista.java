/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.robligo;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class clientesLista extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6399121706898095419L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"clientesLista\",\"namespace\":\"br.com.robligo\",\"fields\":[{\"name\":\"nome\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<clientesLista> ENCODER =
      new BinaryMessageEncoder<clientesLista>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<clientesLista> DECODER =
      new BinaryMessageDecoder<clientesLista>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<clientesLista> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<clientesLista> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<clientesLista> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<clientesLista>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this clientesLista to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a clientesLista from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a clientesLista instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static clientesLista fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence nome;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public clientesLista() {}

  /**
   * All-args constructor.
   * @param nome The new value for nome
   */
  public clientesLista(java.lang.CharSequence nome) {
    this.nome = nome;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nome;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nome = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.CharSequence getNome() {
    return nome;
  }


  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.CharSequence value) {
    this.nome = value;
  }

  /**
   * Creates a new clientesLista RecordBuilder.
   * @return A new clientesLista RecordBuilder
   */
  public static br.com.robligo.clientesLista.Builder newBuilder() {
    return new br.com.robligo.clientesLista.Builder();
  }

  /**
   * Creates a new clientesLista RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new clientesLista RecordBuilder
   */
  public static br.com.robligo.clientesLista.Builder newBuilder(br.com.robligo.clientesLista.Builder other) {
    if (other == null) {
      return new br.com.robligo.clientesLista.Builder();
    } else {
      return new br.com.robligo.clientesLista.Builder(other);
    }
  }

  /**
   * Creates a new clientesLista RecordBuilder by copying an existing clientesLista instance.
   * @param other The existing instance to copy.
   * @return A new clientesLista RecordBuilder
   */
  public static br.com.robligo.clientesLista.Builder newBuilder(br.com.robligo.clientesLista other) {
    if (other == null) {
      return new br.com.robligo.clientesLista.Builder();
    } else {
      return new br.com.robligo.clientesLista.Builder(other);
    }
  }

  /**
   * RecordBuilder for clientesLista instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<clientesLista>
    implements org.apache.avro.data.RecordBuilder<clientesLista> {

    private java.lang.CharSequence nome;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.robligo.clientesLista.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing clientesLista instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.robligo.clientesLista other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.CharSequence getNome() {
      return nome;
    }


    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public br.com.robligo.clientesLista.Builder setNome(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nome = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public br.com.robligo.clientesLista.Builder clearNome() {
      nome = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public clientesLista build() {
      try {
        clientesLista record = new clientesLista();
        record.nome = fieldSetFlags()[0] ? this.nome : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<clientesLista>
    WRITER$ = (org.apache.avro.io.DatumWriter<clientesLista>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<clientesLista>
    READER$ = (org.apache.avro.io.DatumReader<clientesLista>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.nome);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










