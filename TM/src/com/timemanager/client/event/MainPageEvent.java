package com.timemanager.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class MainPageEvent extends GwtEvent<MainPageEventHandler> {
	public static Type<MainPageEventHandler> TYPE = new Type<MainPageEventHandler>();

	@Override
	public Type<MainPageEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(MainPageEventHandler handler) {
		handler.show(this);
	}
}
