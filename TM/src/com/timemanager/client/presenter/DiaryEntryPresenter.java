package com.timemanager.client.presenter;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.TimeManagerService;
import com.timemanager.client.TimeManagerServiceAsync;
import com.timemanager.client.view.DiaryEntryView;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.UserReference;

public class DiaryEntryPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final DiaryEntryView view;
	private HasWidgets container = null;
	private AddDiaryEntryPopupPresenter popup;
	UserReference reference;

	TimeManagerServiceAsync tmService = GWT.create(TimeManagerService.class);

	public DiaryEntryPresenter(DiaryEntryView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();
		init();
	}

	public void init() {
		setUserReference();
		getData();
	}

	private void getData() {
		AsyncCallback<List<DiaryEntryVw>> callback = new AsyncCallback<List<DiaryEntryVw>>() {

			@Override
			public void onFailure(Throwable e) {
				Window.alert("failed to retrive ");
				e.printStackTrace();
			}

			@Override
			public void onSuccess(List<DiaryEntryVw> result) {
				view.addDataToProvider(result);
			} 

		};
		tmService.getAllDiaryEntry(view.getFromDate(),view.getToDate(), callback);
	}

	private void setUserReference() { 
		AsyncCallback<UserReference> callback1 = new AsyncCallback<UserReference>() {

			@Override
			public void onFailure(Throwable e) {
				Window.alert("failed to retrive user reference for ");
				e.printStackTrace();
			}

			@Override
			public void onSuccess(UserReference result) {
				reference = result;
			}
		};
		tmService.getUserReference(callback1);

	}

	private void bind() {
		view.getAddButton().addClickHandler(new ClickHandler() { 
			@Override
			public void onClick(ClickEvent event) {
				popup = new AddDiaryEntryPopupPresenter(eventBus, reference);
				popup.go(container);
			}
		});


	}

	@Override
	public void go(HasWidgets container) {
		this.container = container;
		container.clear();
		container.add(view.asWidget()); 
	}
}
