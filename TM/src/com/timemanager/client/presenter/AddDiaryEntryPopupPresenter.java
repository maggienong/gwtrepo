package com.timemanager.client.presenter;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.TimeManagerService;
import com.timemanager.client.TimeManagerServiceAsync;
import com.timemanager.client.view.AddDiaryEntryPopup;
import com.timemanager.client.view.AddDiaryEntryPopupView;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserReference;

public class AddDiaryEntryPopupPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final AddDiaryEntryPopupView view;
	private UserReference ref;

	TimeManagerServiceAsync tmService = GWT.create(TimeManagerService.class);
	
	public AddDiaryEntryPopupPresenter(HandlerManager eventBus, UserReference ref) {
		this.view = new AddDiaryEntryPopup(ref.getCategoryMap());
		this.eventBus = eventBus;
		this.ref = ref;
		bind();
	}

	@Override
	public void go(HasWidgets container) {
		this.view.show();
//		container.clear();
//		container.add(view.asWidget()); 
	}

	private void bind() {
		view.getCancelButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				 view.hide();
			}
		});
		
		view.getCategoryList().addValueChangeHandler(new ValueChangeHandler<CategoryDTO>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<CategoryDTO> event) {
				CategoryDTO cat = event.getValue();
				List<TaskDTO> taskList = ref.getCategoryMap().get(cat);
				if (taskList!=null && taskList.size()>0) view.getTaskList().setAcceptableValues(taskList);
			}
		});
	}
}
