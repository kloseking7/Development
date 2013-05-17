package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AutonumDTO_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_Array_Rank_1_FieldSerializer.deserialize(reader, (com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.glassbox.webinvoice.shared.DTOentity.AutonumDTO_Array_Rank_1_FieldSerializer.serialize(writer, (com.glassbox.webinvoice.shared.DTOentity.AutonumDTO[])object);
  }
  
}
