package com.timemanager.client.view;

import java.util.Comparator;
import java.util.List;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionModel;
import com.timemanager.shared.DiaryEntryVw;

public class DiaryEntryViewImpl extends Composite implements DiaryEntryView {
	@UiTemplate("DiaryEntry.ui.xml")
	interface myViewUiBinder extends UiBinder<Widget, DiaryEntryViewImpl> {}
	private static myViewUiBinder uiBinder =  GWT.create(myViewUiBinder.class);

	private ListDataProvider<DiaryEntryVw> dataProvider = new ListDataProvider<DiaryEntryVw>();


	@UiField(provided = true) DataGrid<DiaryEntryVw> dataGrid;
	@UiField(provided = true) SimplePager pager;

	public DiaryEntryViewImpl() {
		ProvidesKey<DiaryEntryVw> KEY_PROVIDER = new ProvidesKey<DiaryEntryVw>() {
			@Override
			public Object getKey(DiaryEntryVw item) {
				return item == null ? null : item.getId();
			}
		};

		dataGrid = new DataGrid<DiaryEntryVw>(KEY_PROVIDER);
		dataGrid.setWidth("700px");
		dataGrid.setHeight("300px");

		dataGrid.setAutoHeaderRefreshDisabled(true); 
		dataGrid.setEmptyTableWidget(new Label("No Data Yet"));

		// Attach a column sort handler to the ListDataProvider to sort the list.

		ListHandler<DiaryEntryVw> sortHandler =
				new ListHandler<DiaryEntryVw>(getDataProvider().getList());
		dataGrid.addColumnSortHandler(sortHandler);

		// Create a Pager to control the table.
		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(dataGrid);

		// Add a selection model so we can select cells.
		final SelectionModel<DiaryEntryVw> selectionModel = new MultiSelectionModel<DiaryEntryVw>(KEY_PROVIDER);
		dataGrid.setSelectionModel(selectionModel, DefaultSelectionEventManager.<DiaryEntryVw> createCheckboxManager());

		// Initialize the columns.
		initTableColumns(selectionModel, sortHandler); 

		initWidget(uiBinder.createAndBindUi(this));

		dataGrid.redraw();

	}

	public ListDataProvider<DiaryEntryVw> getDataProvider() {
		return dataProvider;
	}

	public void setDataProvider(ListDataProvider<DiaryEntryVw> dataProvider) {
		this.dataProvider = dataProvider;
	}

	public void addDataToProvider(List<DiaryEntryVw> listToWrap) {
		dataProvider.setList(listToWrap );
		dataProvider.addDataDisplay(dataGrid);
	}
	private void initTableColumns(final SelectionModel<DiaryEntryVw> selectionModel,
			ListHandler<DiaryEntryVw> sortHandler) {
		// Checkbox column. This table will uses a checkbox column for selection.
		// Alternatively, you can call dataGrid.setSelectionEnabled(true) to enable
		// mouse selection.
		Column<DiaryEntryVw, Boolean> checkColumn =
				new Column<DiaryEntryVw, Boolean>(new CheckboxCell(true, false)) {
			@Override
			public Boolean getValue(DiaryEntryVw object) {
				// Get the value from the selection model.
				return selectionModel.isSelected(object);
			}
		};
		dataGrid.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
		dataGrid.setColumnWidth(checkColumn,40, Unit.PX);

		// First name.
		Column<DiaryEntryVw, String> taskColumn =
				new Column<DiaryEntryVw, String>(new TextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return object.getTask();
			}
		};
		taskColumn.setSortable(true);
		sortHandler.setComparator(taskColumn, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return o1.getTask().compareTo(o2.getTask());
			}
		});
		dataGrid.addColumn(taskColumn, "Task");
		//		taskColumn.setFieldUpdater(new FieldUpdater<DiaryEntryDTO, String>() {
		//			@Override
		//			public void update(int index, DiaryEntryDTO object, String value) {
		//				// Called when the user changes the value.
		//				object.setUser_id(value); 
		//			}
		//		});
		dataGrid.setColumnWidth(taskColumn, 40, Unit.PCT);

		// Duration.
		Column<DiaryEntryVw, String> durationColumn =
				new Column<DiaryEntryVw, String>(new TextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return String.valueOf(object.getDuration());
			}
		};
		durationColumn.setSortable(true);
		sortHandler.setComparator(durationColumn, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return (int) (o1.getDuration()-(o2.getDuration()));
			}
		});
		dataGrid.addColumn(durationColumn, "Duration");
		dataGrid.setColumnWidth(durationColumn, 15, Unit.PCT);
		
		final DateTimeFormat f = DateTimeFormat.getFormat("yyyy/MM/dd HH:mm:ss");

		// Start Time
		Column<DiaryEntryVw, String> stTimeColumn =
				new Column<DiaryEntryVw, String>(new TextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return f.format(object.getStart_time());
			}
		};
		stTimeColumn.setSortable(true);
		sortHandler.setComparator(stTimeColumn, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return (o1.getStart_time().compareTo((o2.getStart_time())));
			}
		});
		dataGrid.addColumn(stTimeColumn, "Start Time");
		dataGrid.setColumnWidth(stTimeColumn, 25, Unit.PCT);

		// End Time
		Column<DiaryEntryVw, String> endTimeColumn =
				new Column<DiaryEntryVw, String>(new TextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return f.format(object.getEnd_time());
			}
		};
		endTimeColumn.setSortable(true);
		sortHandler.setComparator(endTimeColumn, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return (o1.getEnd_time().compareTo((o2.getEnd_time())));
			}
		});
		dataGrid.addColumn(endTimeColumn, "End Time");
		dataGrid.setColumnWidth(endTimeColumn, 25, Unit.PCT);
	}
}
