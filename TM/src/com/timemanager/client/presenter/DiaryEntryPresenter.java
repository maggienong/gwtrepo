package com.timemanager.client.presenter;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.TimeManagerService;
import com.timemanager.client.TimeManagerServiceAsync;
import com.timemanager.client.view.DiaryEntryView;
import com.timemanager.shared.DiaryEntryVw;

public class DiaryEntryPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final DiaryEntryView view;

	TimeManagerServiceAsync tmService = GWT.create(TimeManagerService.class);

	public DiaryEntryPresenter(DiaryEntryView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();
		init();
	}
	
	public void init() {
		final long user_id = 1;
		AsyncCallback<List<DiaryEntryVw>> callback = new AsyncCallback<List<DiaryEntryVw>>() {

			@Override
			public void onFailure(Throwable e) {
				Window.alert("failed to retrive " + user_id);
				e.printStackTrace();
			}

			@Override
			public void onSuccess(List<DiaryEntryVw> result) {
				view.addDataToProvider(result);
			} 
			 
		};
		tmService.getAllDiaryEntry(user_id, callback);
	}

	private void bind() {
		// TODO Auto-generated method stub

	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}
}
