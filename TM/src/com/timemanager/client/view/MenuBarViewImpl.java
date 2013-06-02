package com.timemanager.client.view;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.timemanager.client.event.AddCategoryEvent;
import com.timemanager.client.event.AddTaskEvent;
import com.timemanager.client.event.DiaryEntryViewEvent;
import com.timemanager.client.event.LoginEvent;

public class MenuBarViewImpl extends Composite implements MenuBarView {
	MenuBar menuTop;
	private HandlerManager eventBus;
	
	public MenuBarViewImpl() {
		menuTop = new MenuBar();
		menuTop.setAutoOpen(true);
		menuTop.setAnimationEnabled(true);

		// Create the diaryMenu
		MenuBar diaryMenu = new MenuBar(true);
		diaryMenu.setAnimationEnabled(true); 

		diaryMenu.addItem(createItem("Show Diary Entry"));
		//diaryMenu.addItem(createItem("Search Diary Entry"));

		MenuBar taskMenu = new MenuBar(true);
		taskMenu.setAnimationEnabled(true); 

		taskMenu.addItem(createItem("Add Category"));
		//taskMenu.addItem(createItem("Search Category"));
		//taskMenu.addItem(createItem("Add Task"));
		//taskMenu.addItem(createItem("Search Goal"));
 
		MenuBar settingMenu = new MenuBar(true);
		settingMenu.setAnimationEnabled(true); 
		settingMenu.addItem(createItem("Account Setting"));
		settingMenu.addItem(createItem("Log Out"));
		
		menuTop.addSeparator();
		menuTop.addItem(new MenuItem("Diary", diaryMenu));
		menuTop.addSeparator();
		menuTop.addItem(new MenuItem("Task", taskMenu));
		menuTop.addSeparator();
		menuTop.addItem(new MenuItem("Setting", settingMenu));
		menuTop.addSeparator();
		
		//menuTop.setPixelSize(800, 20);
		 
		HorizontalPanel panel = new HorizontalPanel();
		HTML html = new HTML("<div > </div>"); 
		html.setWidth("30px");
		panel.add(html); 
		panel.add(menuTop);
		menuTop.setWidth("770px");
		
		panel.setStyleName("menu_panel");
		
		initWidget(panel);
	}

	private MenuItem createItem(final String text) {
		MenuItem item = new MenuItem(text,  new Command() {
			@Override
			public void execute() {
				firMenuItemEvent(text);
			}
		});
		return item;
	}

	private void firMenuItemEvent(String menuItemName){
//		if ("Add Task".equals(menuItemName))
//			eventBus.fireEvent(new AddTaskEvent());
//		else 
			if ("Show Diary Entry".equals(menuItemName))
			eventBus.fireEvent(new DiaryEntryViewEvent());
		else if ("Log Out".equals(menuItemName))
			eventBus.fireEvent(new LoginEvent());
		else if ("Add Category".equals(menuItemName))
			eventBus.fireEvent(new AddCategoryEvent());
	}

	public HandlerManager getEventBus() {
		return eventBus;
	}

	public void setEventBus(HandlerManager eventBus) {
		this.eventBus = eventBus;
	} 
}
