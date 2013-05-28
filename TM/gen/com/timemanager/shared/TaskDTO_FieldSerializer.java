package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TaskDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getCategory_id(com.timemanager.shared.TaskDTO instance) /*-{
    return instance.@com.timemanager.shared.TaskDTO::category_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setCategory_id(com.timemanager.shared.TaskDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.TaskDTO::category_id = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.timemanager.shared.TaskDTO instance) /*-{
    return instance.@com.timemanager.shared.TaskDTO::description;
  }-*/;
  
  private static native void setDescription(com.timemanager.shared.TaskDTO instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.TaskDTO::description = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.timemanager.shared.TaskDTO instance) /*-{
    return instance.@com.timemanager.shared.TaskDTO::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.timemanager.shared.TaskDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.TaskDTO::id = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getUser_id(com.timemanager.shared.TaskDTO instance) /*-{
    return instance.@com.timemanager.shared.TaskDTO::user_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setUser_id(com.timemanager.shared.TaskDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.TaskDTO::user_id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.TaskDTO instance) throws SerializationException {
    setCategory_id(instance, streamReader.readLong());
    setDescription(instance, streamReader.readString());
    setId(instance, streamReader.readLong());
    setUser_id(instance, streamReader.readLong());
    
  }
  
  public static com.timemanager.shared.TaskDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.TaskDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.TaskDTO instance) throws SerializationException {
    streamWriter.writeLong(getCategory_id(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeLong(getUser_id(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.TaskDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.TaskDTO_FieldSerializer.deserialize(reader, (com.timemanager.shared.TaskDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.TaskDTO_FieldSerializer.serialize(writer, (com.timemanager.shared.TaskDTO)object);
  }
  
}
