package com.timemanager.client;

import com.timemanager.client.presenter.AppViewPresenter;
import com.timemanager.client.view.AddTaskView;
import com.timemanager.client.view.AddTaskViewImpl;
import com.timemanager.client.view.AppView;
import com.timemanager.client.view.AppViewImpl;
import com.timemanager.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TM implements EntryPoint {

	public void onModuleLoad() {
		ResourceBundle.INSTANCE.stylesheet1().ensureInjected(); 
		HandlerManager event_bus = new HandlerManager(null);
	   
		AddTaskView view = new AddTaskViewImpl(); 
		AppView app = new AppViewImpl(); 
		AppViewPresenter appViewer = new AppViewPresenter(event_bus, app); 
//		
//		DiaryEntryView view = new DiaryEntryViewImpl();  
//		DiaryEntryPresenter appViewer = new DiaryEntryPresenter(view, event_bus); 
		
		//appViewer.go(RootLayoutPanel.get("app")); 
		RootLayoutPanel root = RootLayoutPanel.get();
		root.setStyleName("mainBodyDiv");
		appViewer.go(root);
	}
}
