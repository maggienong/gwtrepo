package com.timemanager.client.view;

import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public interface AppView extends BaseView {
	public SimpleLayoutPanel getMainPanel();
	public VerticalPanel getMenuPanel();
}
