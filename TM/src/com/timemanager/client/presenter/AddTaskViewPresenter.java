package com.timemanager.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets; 
import com.timemanager.client.TimeManagerService;
import com.timemanager.client.TimeManagerServiceAsync;
import com.timemanager.client.view.AddTaskView;
import com.timemanager.shared.TaskDTO;

public class AddTaskViewPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final AddTaskView view;

	TimeManagerServiceAsync tmService = GWT.create(TimeManagerService.class);
	
	public AddTaskViewPresenter(AddTaskView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {  
		view.getAddButton().addClickHandler(
				new ClickHandler() {
					@Override
					public void onClick(ClickEvent event) {
						save();
					} 
				});
	}
	
	private void save() {
		TaskDTO dto = new TaskDTO();
		 
		dto.setDescription(view.getTextBox().getText());
		
		AsyncCallback<Boolean> callback = new AsyncCallback<Boolean>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to save");
			}

			public void onSuccess(Boolean result) {
				Window.alert("data saved");
			}

		};
		//tmService.saveTask(dto, callback);
		
	}
}
