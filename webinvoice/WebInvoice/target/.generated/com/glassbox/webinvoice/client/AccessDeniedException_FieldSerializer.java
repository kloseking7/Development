package com.glassbox.webinvoice.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AccessDeniedException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.client.AccessDeniedException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.glassbox.webinvoice.client.AccessDeniedException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.client.AccessDeniedException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.client.AccessDeniedException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.client.AccessDeniedException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.client.AccessDeniedException_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.client.AccessDeniedException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.client.AccessDeniedException_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.client.AccessDeniedException)object);
  }
  
}
