package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SuburbDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getId(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::id;
  }-*/;
  
  private static native void setId(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::id = value;
  }-*/;
  
  private static native int getPostcode(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::postcode;
  }-*/;
  
  private static native void setPostcode(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance, int value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::postcode = value;
  }-*/;
  
  private static native java.lang.String getSuburb(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance) /*-{
    return instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::suburb;
  }-*/;
  
  private static native void setSuburb(com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance, java.lang.String value) 
  /*-{
    instance.@com.glassbox.webinvoice.shared.DTOentity.SuburbDTO::suburb = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance) throws SerializationException {
    setId(instance, streamReader.readString());
    setPostcode(instance, streamReader.readInt());
    setSuburb(instance, streamReader.readString());
    
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.glassbox.webinvoice.shared.DTOentity.SuburbDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.SuburbDTO instance) throws SerializationException {
    streamWriter.writeString(getId(instance));
    streamWriter.writeInt(getPostcode(instance));
    streamWriter.writeString(getSuburb(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.SuburbDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.SuburbDTO_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.SuburbDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.SuburbDTO_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.SuburbDTO)object);
  }
  
}
