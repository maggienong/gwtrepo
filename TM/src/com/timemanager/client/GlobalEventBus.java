package com.timemanager.client;

import com.google.gwt.event.shared.HandlerManager;

public class GlobalEventBus {
	HandlerManager event_bus;
	
	private static GlobalEventBus instance= new GlobalEventBus();
	
	private GlobalEventBus() {
		event_bus = new HandlerManager(null);
	}
	
	public static GlobalEventBus getInstance() {
		return instance;
	}

	public HandlerManager getEvent_bus() {
		return event_bus;
	}
	
	
}
