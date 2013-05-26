package com.timemanager.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DiaryEntryDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getCategory_id(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::category_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setCategory_id(com.timemanager.shared.DiaryEntryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::category_id = value;
  }-*/;
  
  private static native double getDuration(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::duration;
  }-*/;
  
  private static native void setDuration(com.timemanager.shared.DiaryEntryDTO instance, double value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::duration = value;
  }-*/;
  
  private static native java.sql.Timestamp getEnd_time(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::end_time;
  }-*/;
  
  private static native void setEnd_time(com.timemanager.shared.DiaryEntryDTO instance, java.sql.Timestamp value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::end_time = value;
  }-*/;
  
  private static native java.sql.Timestamp getEntry_date(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::entry_date;
  }-*/;
  
  private static native void setEntry_date(com.timemanager.shared.DiaryEntryDTO instance, java.sql.Timestamp value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::entry_date = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getId(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setId(com.timemanager.shared.DiaryEntryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::id = value;
  }-*/;
  
  private static native java.sql.Timestamp getStart_time(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::start_time;
  }-*/;
  
  private static native void setStart_time(com.timemanager.shared.DiaryEntryDTO instance, java.sql.Timestamp value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::start_time = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getTask_id(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::task_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setTask_id(com.timemanager.shared.DiaryEntryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::task_id = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long getUser_id(com.timemanager.shared.DiaryEntryDTO instance) /*-{
    return instance.@com.timemanager.shared.DiaryEntryDTO::user_id;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void setUser_id(com.timemanager.shared.DiaryEntryDTO instance, long value) 
  /*-{
    instance.@com.timemanager.shared.DiaryEntryDTO::user_id = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.timemanager.shared.DiaryEntryDTO instance) throws SerializationException {
    setCategory_id(instance, streamReader.readLong());
    setDuration(instance, streamReader.readDouble());
    setEnd_time(instance, (java.sql.Timestamp) streamReader.readObject());
    setEntry_date(instance, (java.sql.Timestamp) streamReader.readObject());
    setId(instance, streamReader.readLong());
    setStart_time(instance, (java.sql.Timestamp) streamReader.readObject());
    setTask_id(instance, streamReader.readLong());
    setUser_id(instance, streamReader.readLong());
    
  }
  
  public static com.timemanager.shared.DiaryEntryDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.timemanager.shared.DiaryEntryDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.timemanager.shared.DiaryEntryDTO instance) throws SerializationException {
    streamWriter.writeLong(getCategory_id(instance));
    streamWriter.writeDouble(getDuration(instance));
    streamWriter.writeObject(getEnd_time(instance));
    streamWriter.writeObject(getEntry_date(instance));
    streamWriter.writeLong(getId(instance));
    streamWriter.writeObject(getStart_time(instance));
    streamWriter.writeLong(getTask_id(instance));
    streamWriter.writeLong(getUser_id(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.timemanager.shared.DiaryEntryDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.timemanager.shared.DiaryEntryDTO_FieldSerializer.deserialize(reader, (com.timemanager.shared.DiaryEntryDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.timemanager.shared.DiaryEntryDTO_FieldSerializer.serialize(writer, (com.timemanager.shared.DiaryEntryDTO)object);
  }
  
}
