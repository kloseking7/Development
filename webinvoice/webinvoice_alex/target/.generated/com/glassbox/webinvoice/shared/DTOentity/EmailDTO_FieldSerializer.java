package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class EmailDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getEmailAddress(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::emailAddress;
  }-*/;
  
  private static native void setEmailAddress(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::emailAddress = value;
  }-*/;
  
  private static native java.lang.String getId(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::id = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.PersonDTO getPerson(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::person;
  }-*/;
  
  private static native void setPerson(com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance, com.glassbox.webinvoice.shared.DTOentity.PersonDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.EmailDTO::person = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance) throws SerializationException {
    setEmailAddress(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setPerson(instance, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO) streamReader.readObject());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.EmailDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.EmailDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.EmailDTO instance) throws SerializationException {
    streamWriter.writeString(getEmailAddress(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getPerson(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.EmailDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.EmailDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.EmailDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.EmailDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.EmailDTO)object);
  }
  
}
