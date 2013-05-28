package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UserReference_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Map getCategoryMap(com.timemanager.shared.UserReference instance) /*-{
    return instance.@com.timemanager.shared.UserReference::categoryMap;
  }-*/;
  
  private static native void setCategoryMap(com.timemanager.shared.UserReference instance, java.util.Map value) 
  /*-{
    instance.@com.timemanager.shared.UserReference::categoryMap = value;
  }-*/;
  
  private static native com.timemanager.shared.UserDTO getUser(com.timemanager.shared.UserReference instance) /*-{
    return instance.@com.timemanager.shared.UserReference::user;
  }-*/;
  
  private static native void setUser(com.timemanager.shared.UserReference instance, com.timemanager.shared.UserDTO value) 
  /*-{
    instance.@com.timemanager.shared.UserReference::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.UserReference instance) throws SerializationException {
    setCategoryMap(instance, (java.util.Map) streamReader.readObject());
    setUser(instance, (com.timemanager.shared.UserDTO) streamReader.readObject());
    
  }
  
  public static com.timemanager.shared.UserReference instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.UserReference();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.UserReference instance) throws SerializationException {
    streamWriter.writeObject(getCategoryMap(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.UserReference_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.UserReference_FieldSerializer.deserialize(reader, (com.timemanager.shared.UserReference)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.UserReference_FieldSerializer.serialize(writer, (com.timemanager.shared.UserReference)object);
  }
  
}
