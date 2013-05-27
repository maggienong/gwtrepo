package com.timemanager.client.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
 
import com.google.gwt.core.client.GWT;
import com.google.gwt.text.shared.Renderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.timemanager.client.util.ClosablePanel;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;

public class AddDiaryEntryPopup extends ClosablePanel implements AddDiaryEntryPopupView{
	@UiTemplate("AddDiaryEntryPopup.ui.xml")
	interface myViewUiBinder extends UiBinder<Widget, AddDiaryEntryPopup> {}
	private static myViewUiBinder uiBinder =  GWT.create(myViewUiBinder.class);

	@UiField Button cancelButton;
	@UiField Button addButton;
	@UiField TextBox duration;
	@UiField(provided = true) ValueListBox<CategoryDTO> categoryList = 
			new ValueListBox<CategoryDTO>(new Renderer<CategoryDTO>() { 
				@Override
				public String render(CategoryDTO object) {
					if (object!=null)
						return object.getDescription();
					else return "";
				}

				@Override
				public void render(CategoryDTO object, Appendable appendable)
						throws IOException { 
				}
			});
	@UiField(provided = true) ValueListBox<TaskDTO> taskList =new ValueListBox<TaskDTO>(new Renderer<TaskDTO>() { 
		@Override
		public String render(TaskDTO object) {
			if (object!=null)
				return object.getDescription();
			else return "";
		}

		@Override
		public void render(TaskDTO object, Appendable appendable)
				throws IOException {
		}
	});

	public AddDiaryEntryPopup(Map<CategoryDTO, List<TaskDTO>> categoryMap) {
		categoryList.setAcceptableValues(categoryMap.keySet()); 
		taskList.setAcceptableValues(new ArrayList<TaskDTO>());
		setWidget(uiBinder.createAndBindUi(this));
	}

	public Button getCancelButton() {
		return cancelButton;
	}

	public Button getAddButton() {
		return addButton;
	}

	public ValueListBox<CategoryDTO> getCategoryList() {
		return categoryList;
	}

	public ValueListBox<TaskDTO> getTaskList() {
		return taskList;
	}
	
}
