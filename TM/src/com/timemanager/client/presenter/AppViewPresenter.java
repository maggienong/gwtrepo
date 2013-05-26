package com.timemanager.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.event.AddTaskEvent;
import com.timemanager.client.event.AddTaskEventHandler;
import com.timemanager.client.event.DiaryEntryViewEvent;
import com.timemanager.client.event.DiaryEntryViewHandler;
import com.timemanager.client.view.AddTaskViewImpl;
import com.timemanager.client.view.AppView;
import com.timemanager.client.view.DiaryEntryView;
import com.timemanager.client.view.DiaryEntryViewImpl;
import com.timemanager.client.view.MenuBarViewImpl;

public class AppViewPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final AppView view;
	private MenuBarPresener menuPresenter;
	private Presenter mainPresenter;
	private HasWidgets container = null;

	public AppViewPresenter(HandlerManager eventBus, AppView view) {
		this.eventBus = eventBus;
		this.view = view;

		MenuBarViewImpl menubar = new MenuBarViewImpl();
		menuPresenter = new MenuBarPresener(menubar, eventBus); 

		bind();
	}

	@Override
	public void go(HasWidgets container) {
		this.container = container;

		menuPresenter.go(view.getMenuPanel());
		if (mainPresenter!=null) {
			mainPresenter.go(view.getMainPanel());
		}
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {  
		eventBus.addHandler(AddTaskEvent.TYPE,
				new AddTaskEventHandler() {
			public void onAddTask(AddTaskEvent event) {
				doAddNewTask();
			} 
		});  
		eventBus.addHandler(DiaryEntryViewEvent.TYPE,
				new DiaryEntryViewHandler() {
			public void onShow(DiaryEntryViewEvent event) {
				doDiaryEntryView();
			} 
		});  
	}
	private void doAddNewTask() {
		AddTaskViewImpl newView = new AddTaskViewImpl();
		AddTaskViewPresenter presenter = new AddTaskViewPresenter(newView, eventBus);
		mainPresenter = presenter;
		go(this.container);
	}
	private void doDiaryEntryView() {
		DiaryEntryView newView = new DiaryEntryViewImpl();
		DiaryEntryPresenter presenter = new DiaryEntryPresenter(newView, eventBus);
		mainPresenter = presenter;
		go(this.container);
	} 
}
