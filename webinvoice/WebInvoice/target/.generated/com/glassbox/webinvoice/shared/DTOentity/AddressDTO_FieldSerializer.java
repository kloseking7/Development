package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AddressDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getId(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::id = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.PersonDTO getPerson(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::person;
  }-*/;
  
  private static native void setPerson(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance, com.glassbox.webinvoice.shared.DTOentity.PersonDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::person = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.StateDTO getState(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::state;
  }-*/;
  
  private static native void setState(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance, com.glassbox.webinvoice.shared.DTOentity.StateDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::state = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.SuburbDTO getSuburb(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::suburb;
  }-*/;
  
  private static native void setSuburb(com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance, com.glassbox.webinvoice.shared.DTOentity.SuburbDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.AddressDTO::suburb = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setPerson(instance, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO) streamReader.readObject());
    setState(instance, (com.glassbox.webinvoice.shared.DTOentity.StateDTO) streamReader.readObject());
    setSuburb(instance, (com.glassbox.webinvoice.shared.DTOentity.SuburbDTO) streamReader.readObject());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.AddressDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.AddressDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.AddressDTO instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeObject(getPerson(instance));
    streamWriter.writeObject(getState(instance));
    streamWriter.writeObject(getSuburb(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.AddressDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AddressDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.AddressDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AddressDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.AddressDTO)object);
  }
  
}
