package com.timemanager.client.view;
 

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;

public class CheckboxHeader<T> extends Header {

	private final MultiSelectionModel selectionModel;
	private final ListDataProvider<T> provider;

	public CheckboxHeader(MultiSelectionModel selectionModel,
			ListDataProvider provider) {
		super(new CheckboxCell());
		this.selectionModel = selectionModel;
		this.provider = provider;
	}

	@Override
	public Boolean getValue() {
		int size = selectionModel.getSelectedSet().size();
		boolean allItemsSelected = (size>0&& size == provider.getList().size());
		return allItemsSelected;
	}

	@Override
	public void onBrowserEvent(Context context, Element elem, NativeEvent event) {
		InputElement input = elem.getFirstChild().cast();
		Boolean isChecked = input.isChecked();
		for (T element : provider.getList()) {
			selectionModel.setSelected(element, isChecked);
		}
	}

}