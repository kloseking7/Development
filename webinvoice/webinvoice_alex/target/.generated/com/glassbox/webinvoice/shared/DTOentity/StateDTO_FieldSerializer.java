package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class StateDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.glassbox.webinvoice.shared.entity.AuState getId(com.glassbox.webinvoice.shared.DTOentity.StateDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.StateDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.StateDTO instance, com.glassbox.webinvoice.shared.entity.AuState value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.StateDTO::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.glassbox.webinvoice.shared.DTOentity.StateDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.StateDTO::name;
  }-*/;
  
  private static native void setName(com.glassbox.webinvoice.shared.DTOentity.StateDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.StateDTO::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.StateDTO instance) throws SerializationException {
    setId(instance, (com.glassbox.webinvoice.shared.entity.AuState) streamReader.readObject());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.StateDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.StateDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.StateDTO instance) throws SerializationException {
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.StateDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.StateDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.StateDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.StateDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.StateDTO)object);
  }
  
}
