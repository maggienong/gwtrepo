package com.timemanager.client.event;

import com.google.gwt.event.shared.EventHandler;

public interface AddTaskEventHandler extends EventHandler { 
	public void onAddTask(AddTaskEvent event); 
}
