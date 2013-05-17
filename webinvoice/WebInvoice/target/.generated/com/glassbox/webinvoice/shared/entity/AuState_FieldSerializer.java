package com.glassbox.webinvoice.shared.entity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AuState_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.entity.AuState instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.glassbox.webinvoice.shared.entity.AuState instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.glassbox.webinvoice.shared.entity.AuState[] values = com.glassbox.webinvoice.shared.entity.AuState.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.entity.AuState instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.entity.AuState_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.entity.AuState_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.entity.AuState)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.entity.AuState_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.entity.AuState)object);
  }
  
}
