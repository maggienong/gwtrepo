package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UserDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getEmail(com.timemanager.shared.UserDTO instance) /*-{
    return instance.@com.timemanager.shared.UserDTO::email;
  }-*/;
  
  private static native void setEmail(com.timemanager.shared.UserDTO instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.UserDTO::email = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.timemanager.shared.UserDTO instance) /*-{
    return instance.@com.timemanager.shared.UserDTO::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.timemanager.shared.UserDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.UserDTO::id = value;
  }-*/;
  
  private static native java.lang.String getName(com.timemanager.shared.UserDTO instance) /*-{
    return instance.@com.timemanager.shared.UserDTO::name;
  }-*/;
  
  private static native void setName(com.timemanager.shared.UserDTO instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.UserDTO::name = value;
  }-*/;
  
  private static native java.lang.String getPassword(com.timemanager.shared.UserDTO instance) /*-{
    return instance.@com.timemanager.shared.UserDTO::password;
  }-*/;
  
  private static native void setPassword(com.timemanager.shared.UserDTO instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.UserDTO::password = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.UserDTO instance) throws SerializationException {
    setEmail(instance, streamReader.readString());
    setId(instance, streamReader.readLong());
    setName(instance, streamReader.readString());
    setPassword(instance, streamReader.readString());
    
  }
  
  public static com.timemanager.shared.UserDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.UserDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.UserDTO instance) throws SerializationException {
    streamWriter.writeString(getEmail(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPassword(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.UserDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.UserDTO_FieldSerializer.deserialize(reader, (com.timemanager.shared.UserDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.UserDTO_FieldSerializer.serialize(writer, (com.timemanager.shared.UserDTO)object);
  }
  
}
