package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DiaryEntryVw_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCategory(com.timemanager.shared.DiaryEntryVw instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryVw::category;
  }-*/;
  
  private static native void setCategory(com.timemanager.shared.DiaryEntryVw instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryVw::category = value;
  }-*/;
  
  private static native com.timemanager.shared.DiaryEntryDTO getDiaryEntry(com.timemanager.shared.DiaryEntryVw instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryVw::diaryEntry;
  }-*/;
  
  private static native void setDiaryEntry(com.timemanager.shared.DiaryEntryVw instance, com.timemanager.shared.DiaryEntryDTO value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryVw::diaryEntry = value;
  }-*/;
  
  private static native java.lang.String getTask(com.timemanager.shared.DiaryEntryVw instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryVw::task;
  }-*/;
  
  private static native void setTask(com.timemanager.shared.DiaryEntryVw instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryVw::task = value;
  }-*/;
  
  private static native java.lang.String getUser_name(com.timemanager.shared.DiaryEntryVw instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryVw::user_name;
  }-*/;
  
  private static native void setUser_name(com.timemanager.shared.DiaryEntryVw instance, java.lang.String value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryVw::user_name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.DiaryEntryVw instance) throws SerializationException {
    setCategory(instance, streamReader.readString());
    setDiaryEntry(instance, (com.timemanager.shared.DiaryEntryDTO) streamReader.readObject());
    setTask(instance, streamReader.readString());
    setUser_name(instance, streamReader.readString());
    
  }
  
  public static com.timemanager.shared.DiaryEntryVw instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.DiaryEntryVw();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.DiaryEntryVw instance) throws SerializationException {
    streamWriter.writeString(getCategory(instance));
    streamWriter.writeObject(getDiaryEntry(instance));
    streamWriter.writeString(getTask(instance));
    streamWriter.writeString(getUser_name(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.DiaryEntryVw_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.DiaryEntryVw_FieldSerializer.deserialize(reader, (com.timemanager.shared.DiaryEntryVw)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.DiaryEntryVw_FieldSerializer.serialize(writer, (com.timemanager.shared.DiaryEntryVw)object);
  }
  
}
