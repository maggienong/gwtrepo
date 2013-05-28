package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CategoryDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescription(com.timemanager.shared.CategoryDTO instance) /*-{
    return instance.@com.timemanager.shared.CategoryDTO::description;
  }-*/;
  
  private static native void setDescription(com.timemanager.shared.CategoryDTO instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.CategoryDTO::description = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.timemanager.shared.CategoryDTO instance) /*-{
    return instance.@com.timemanager.shared.CategoryDTO::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.timemanager.shared.CategoryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.CategoryDTO::id = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getUser_id(com.timemanager.shared.CategoryDTO instance) /*-{
    return instance.@com.timemanager.shared.CategoryDTO::user_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setUser_id(com.timemanager.shared.CategoryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.CategoryDTO::user_id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.CategoryDTO instance) throws SerializationException {
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readLong());
    setUser_id(instance, streamReader.readLong());
    
  }
  
  public static com.timemanager.shared.CategoryDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.CategoryDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.CategoryDTO instance) throws SerializationException {
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeLong(getUser_id(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.CategoryDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.CategoryDTO_FieldSerializer.deserialize(reader, (com.timemanager.shared.CategoryDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.CategoryDTO_FieldSerializer.serialize(writer, (com.timemanager.shared.CategoryDTO)object);
  }
  
}
