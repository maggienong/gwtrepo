package com.timemanager.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class DiaryEntryViewEvent extends GwtEvent<DiaryEntryViewHandler> {
	public static Type<DiaryEntryViewHandler> TYPE = new Type<DiaryEntryViewHandler>();

	@Override
	public Type<DiaryEntryViewHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(DiaryEntryViewHandler handler) {
		handler.onShow(this);
	}
}