package com.timemanager.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class NewAccountEvent extends GwtEvent<NewAccountEventHandler> {
	public static Type<NewAccountEventHandler> TYPE = new Type<NewAccountEventHandler>();

	@Override
	public Type<NewAccountEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(NewAccountEventHandler handler) {
		handler.show(this);
	}
}