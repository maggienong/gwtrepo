package com.timemanager.client.view;

import java.util.Comparator;

import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.cell.client.ClickableTextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;

public class AddCategoryViewImpl  extends Composite implements AddCategoryView {

	@UiTemplate("AddCategoryView.ui.xml")
	interface myViewUiBinder extends UiBinder<Widget, AddCategoryViewImpl> {}
	private static myViewUiBinder uiBinder =  GWT.create(myViewUiBinder.class);

	@UiField TextBox catField;
	@UiField Button addButton;
	@UiField(provided = true) CellTable cellTable;
	ListDataProvider<CategoryDTO> dataProvider;
	@UiField TextBox taskField;
	@UiField Button addTaskButton;
	@UiField(provided = true) CellTable taskCellTable;
	ListDataProvider<TaskDTO> taskDataProvider;
	CategoryDTO category = null;

	public AddCategoryViewImpl() {
		cellTable = new CellTable<CategoryDTO>();
		TextColumn<CategoryDTO> nameColumn = new TextColumn<CategoryDTO>() {
			@Override
			public String getValue(CategoryDTO dto) {
				return dto.getDescription();
			}
		};

		// Make the name column sortable.
		nameColumn.setSortable(true);

		// Add the columns.
		cellTable.addColumn(nameColumn, "Category");

		dataProvider = new ListDataProvider<CategoryDTO>();

		// Connect the table to the data provider.
		dataProvider.addDataDisplay(cellTable);
		ListHandler<CategoryDTO> columnSortHandler = new ListHandler<CategoryDTO>(dataProvider.getList());
		columnSortHandler.setComparator(nameColumn,
				new Comparator<CategoryDTO>() {
			public int compare(CategoryDTO o1, CategoryDTO o2) {
				if (o1 == o2) {
					return 0;
				}

				// Compare the name columns.
				if (o1 != null) {
					return (o2 != null) ? o1.getDescription().compareTo(o2.getDescription()) : 1;
				}
				return -1;
			}
		});
		cellTable.addColumnSortHandler(columnSortHandler);

		// We know that the data is sorted alphabetically by default.
		cellTable.getColumnSortList().push(nameColumn);

		

		taskCellTable = new CellTable<TaskDTO>();
		TextColumn<TaskDTO> descColumn = new TextColumn<TaskDTO>() {
			@Override
			public String getValue(TaskDTO dto) {
				return dto.getDescription();
			}
		};
		descColumn.setSortable(true);
		taskCellTable.addColumn(descColumn, "Task");

		taskDataProvider = new ListDataProvider<TaskDTO>();

		// Connect the table to the data provider.
		taskDataProvider.addDataDisplay(taskCellTable);

		ListHandler<TaskDTO> columnSortHandler1 = new ListHandler<TaskDTO>(taskDataProvider.getList());
		columnSortHandler1.setComparator(descColumn,
				new Comparator<TaskDTO>() {
			public int compare(TaskDTO o1, TaskDTO o2) {
				if (o1 == o2) {
					return 0;
				}

				// Compare the name columns.
				if (o1 != null) {
					return (o2 != null) ? o1.getDescription().compareTo(o2.getDescription()) : 1;
				}
				return -1;
			}
		});
		taskCellTable.addColumnSortHandler(columnSortHandler1);
		taskCellTable.getColumnSortList().push(descColumn);
		
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Button getAddButton() {
		return addButton;
	}

	public TextBox getTextBox() {
		return catField;
	}

	public CellTable getCellTable() {
		return cellTable;
	}
	public ListDataProvider<CategoryDTO> getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(ListDataProvider<CategoryDTO> dataProvider) {
		this.dataProvider = dataProvider;
	}

	public TextBox getTaskField() {
		return taskField;
	}

	public Button getAddTaskButton() {
		return addTaskButton;
	}

	public CellTable getTaskCellTable() {
		return taskCellTable;
	}

	public ListDataProvider<TaskDTO> getTaskDataProvider() {
		return taskDataProvider;
	}

	public CategoryDTO getCategory() {
		return category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}



}
