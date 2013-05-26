package com.timemanager.client.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
public class AppViewImpl extends Composite implements AppView { 

	VerticalPanel menupanel;
	SimpleLayoutPanel panelmain;

	public AppViewImpl( ) {

		DockLayoutPanel panel = new DockLayoutPanel(Unit.PX);

		menupanel = new VerticalPanel(); 
		panel.addNorth(menupanel, 40);

		panelmain = new SimpleLayoutPanel();
		panel.addWest(panelmain, 800);


		initWidget(panel);
	} 

	public SimpleLayoutPanel getMainPanel() {
		return panelmain;
	}

	public VerticalPanel getMenuPanel() {
		return menupanel;
	}

}
