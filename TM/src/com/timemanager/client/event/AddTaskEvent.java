package com.timemanager.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class AddTaskEvent extends GwtEvent<AddTaskEventHandler> {
  public static Type<AddTaskEventHandler> TYPE = new Type<AddTaskEventHandler>();
  
  @Override
  public Type<AddTaskEventHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(AddTaskEventHandler handler) {
    handler.onAddTask(this);
  }
}
