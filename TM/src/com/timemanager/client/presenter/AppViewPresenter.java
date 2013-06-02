package com.timemanager.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.LoginService;
import com.timemanager.client.LoginServiceAsync;
import com.timemanager.client.event.AddCategoryEvent;
import com.timemanager.client.event.AddCategoryEventHandler;
import com.timemanager.client.event.AddTaskEvent;
import com.timemanager.client.event.AddTaskEventHandler;
import com.timemanager.client.event.DiaryEntryViewEvent;
import com.timemanager.client.event.DiaryEntryViewHandler;
import com.timemanager.client.event.LoginEvent;
import com.timemanager.client.event.LoginEventHandler;
import com.timemanager.client.event.MainPageEvent;
import com.timemanager.client.event.MainPageEventHandler;
import com.timemanager.client.event.NewAccountEvent;
import com.timemanager.client.event.NewAccountEventHandler;
import com.timemanager.client.view.AddCategoryView;
import com.timemanager.client.view.AddCategoryViewImpl;
import com.timemanager.client.view.AddTaskViewImpl;
import com.timemanager.client.view.AppView;
import com.timemanager.client.view.CreateAccountImpl;
import com.timemanager.client.view.DiaryEntryView;
import com.timemanager.client.view.DiaryEntryViewImpl;
import com.timemanager.client.view.LoginImpl;
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
		} else {
			view.getMainPanel().clear();
		}
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {
		eventBus.addHandler(LoginEvent.TYPE,
				new LoginEventHandler() { 
			@Override
			public void show(LoginEvent event) {
				gotoLoginPage();
			}
		});
		eventBus.addHandler(NewAccountEvent.TYPE,
				new NewAccountEventHandler() {

			@Override
			public void show(NewAccountEvent event) { 
				gotoAcctCreatePage();
			}
		});
		eventBus.addHandler(MainPageEvent.TYPE,
				new MainPageEventHandler() { 
			@Override
			public void show(MainPageEvent event) {
				gotoMainPage();
			} 
		});
		eventBus.addHandler(AddTaskEvent.TYPE,
				new AddTaskEventHandler() {
			public void onAddTask(AddTaskEvent event) {
				doAddNewTask();
			} 
		});  
		eventBus.addHandler(AddCategoryEvent.TYPE,
				new AddCategoryEventHandler() { 
			@Override
			public void onAdd(AddCategoryEvent event) {
				gotoAddCategoryPage();
			} 
		});  
		eventBus.addHandler(DiaryEntryViewEvent.TYPE,
				new DiaryEntryViewHandler() {
			public void onShow(DiaryEntryViewEvent event) {
				doDiaryEntryView();
			} 
		});  
	}

	protected void gotoAddCategoryPage() {
		AddCategoryView newView = new AddCategoryViewImpl();
		AddCategoryViewPresenter presenter = new AddCategoryViewPresenter(newView, eventBus);
		mainPresenter = presenter;
		go(this.container);
	}

	protected void gotoMainPage() {
		this.mainPresenter = null;
		go(this.container);
	}

	protected void gotoLoginPage() { 
		LoginPresenter loginPresenter = new LoginPresenter(new LoginImpl(), eventBus);
		loginPresenter.go(this.container);
	}

	protected void gotoAcctCreatePage() {
		CreateAccountPresenter acctPresenter = new CreateAccountPresenter(new CreateAccountImpl(), eventBus);
		acctPresenter.go(this.container);	
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

	public HasWidgets getContainer() {
		return container;
	}

	public void setContainer(HasWidgets container) {
		this.container = container;
	} 

}
