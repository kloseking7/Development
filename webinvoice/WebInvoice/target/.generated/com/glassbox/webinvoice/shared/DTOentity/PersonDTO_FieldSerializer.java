package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PersonDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getAddresses(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::addresses;
  }-*/;
  
  private static native void setAddresses(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.util.List value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::addresses = value;
  }-*/;
  
  private static native java.util.List getEmails(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::emails;
  }-*/;
  
  private static native void setEmails(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.util.List value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::emails = value;
  }-*/;
  
  private static native java.lang.String getFirstname(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::firstname;
  }-*/;
  
  private static native void setFirstname(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::firstname = value;
  }-*/;
  
  private static native java.lang.String getId(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::id = value;
  }-*/;
  
  private static native java.lang.String getLastname(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::lastname;
  }-*/;
  
  private static native void setLastname(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::lastname = value;
  }-*/;
  
  private static native java.util.Date getLogintime(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::logintime;
  }-*/;
  
  private static native void setLogintime(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.util.Date value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::logintime = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::password;
  }-*/;
  
  private static native void setPassword(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::password = value;
  }-*/;
  
  private static native com.glassbox.webinvoice.shared.DTOentity.RoleDTO getRole(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::role;
  }-*/;
  
  private static native void setRole(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, com.glassbox.webinvoice.shared.DTOentity.RoleDTO value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::role = value;
  }-*/;
  
  private static native java.util.List getUserAutonums(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::userAutonums;
  }-*/;
  
  private static native void setUserAutonums(com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance, java.util.List value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.PersonDTO::userAutonums = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) throws SerializationException {
    setAddresses(instance, (java.util.List) streamReader.readObject());
    setEmails(instance, (java.util.List) streamReader.readObject());
    setFirstname(instance, streamReader.readString());
    setId(instance, streamReader.readString());
    setLastname(instance, streamReader.readString());
    setLogintime(instance, (java.util.Date) streamReader.readObject());
    setPassword(instance, streamReader.readString());
    setRole(instance, (com.glassbox.webinvoice.shared.DTOentity.RoleDTO) streamReader.readObject());
    setUserAutonums(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.PersonDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.PersonDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.PersonDTO instance) throws SerializationException {
    streamWriter.writeObject(getAddresses(instance));
    streamWriter.writeObject(getEmails(instance));
    streamWriter.writeString(getFirstname(instance));
    streamWriter.writeString(getId(instance));
    streamWriter.writeString(getLastname(instance));
    streamWriter.writeObject(getLogintime(instance));
    streamWriter.writeString(getPassword(instance));
    streamWriter.writeObject(getRole(instance));
    streamWriter.writeObject(getUserAutonums(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.PersonDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.PersonDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.PersonDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.PersonDTO)object);
  }
  
}
