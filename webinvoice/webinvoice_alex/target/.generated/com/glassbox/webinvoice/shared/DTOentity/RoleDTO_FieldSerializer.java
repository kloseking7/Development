package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RoleDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.glassbox.webinvoice.shared.entity.RoleType getId(com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.RoleDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance, com.glassbox.webinvoice.shared.entity.RoleType value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.RoleDTO::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.RoleDTO::name;
  }-*/;
  
  private static native void setName(com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.RoleDTO::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance) throws SerializationException {
    setId(instance, (com.glassbox.webinvoice.shared.entity.RoleType) streamReader.readObject());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.RoleDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.RoleDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.RoleDTO instance) throws SerializationException {
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.RoleDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.RoleDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.RoleDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.RoleDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.RoleDTO)object);
  }
  
}
