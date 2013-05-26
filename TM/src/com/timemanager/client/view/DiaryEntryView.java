package com.timemanager.client.view;

import java.util.List;

import com.timemanager.shared.DiaryEntryVw;

public interface DiaryEntryView extends BaseView {
	public void addDataToProvider(List<DiaryEntryVw> listToWrap);
}
