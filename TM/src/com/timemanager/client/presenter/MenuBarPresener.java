package com.timemanager.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.view.MenuBarView;

public class MenuBarPresener implements Presenter {
	private final HandlerManager eventBus;
	private final MenuBarView view;

	public MenuBarPresener(MenuBarView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		view.setEventBus(eventBus);
		bind();
	}
	
	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {  
		
	}
}
