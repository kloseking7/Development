package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AutonumDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native com.glassbox.webinvoice.shared.DTOentity.PersonDTO getClient(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::client;
  }-*/;
  
  private static native void setClient(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, com.glassbox.webinvoice.shared.DTOentity.PersonDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::client = value;
  }-*/;
  
  private static native java.lang.String getId(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::id = value;
  }-*/;
  
  private static native java.lang.String getNumber(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::number;
  }-*/;
  
  private static native void setNumber(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::number = value;
  }-*/;
  
  private static native java.lang.String getPrefix(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::prefix;
  }-*/;
  
  private static native void setPrefix(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::prefix = value;
  }-*/;
  
  private static native java.lang.String getSuffix(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::suffix;
  }-*/;
  
  private static native void setSuffix(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::suffix = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.PersonDTO getUser(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::user;
  }-*/;
  
  private static native void setUser(com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance, com.glassbox.webinvoice.shared.DTOentity.PersonDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AutonumDTO::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) throws SerializationException {
    setClient(instance, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO) streamReader.readObject());
    setId(instance, streamReader.readString());
    setNumber(instance, streamReader.readString());
    setPrefix(instance, streamReader.readString());
    setSuffix(instance, streamReader.readString());
    setUser(instance, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO) streamReader.readObject());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.AutonumDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.AutonumDTO instance) throws SerializationException {
    streamWriter.writeObject(getClient(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getNumber(instance));
    streamWriter.writeString(getPrefix(instance));
    streamWriter.writeString(getSuffix(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.AutonumDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.AutonumDTO)object);
  }
  
}
