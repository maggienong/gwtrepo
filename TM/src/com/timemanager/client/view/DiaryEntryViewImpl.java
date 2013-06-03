package com.timemanager.client.view;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.EditTextCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.builder.shared.TableCellBuilder;
import com.google.gwt.dom.builder.shared.TableRowBuilder;
import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.cellview.client.AbstractCellTableBuilder;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.timemanager.shared.DiaryEntryVw;

public class DiaryEntryViewImpl extends Composite implements DiaryEntryView {
	@UiTemplate("DiaryEntry.ui.xml")
	interface myViewUiBinder extends UiBinder<Widget, DiaryEntryViewImpl> {}
	private static myViewUiBinder uiBinder =  GWT.create(myViewUiBinder.class);

	private ListDataProvider<DiaryEntryVw> dataProvider = new ListDataProvider<DiaryEntryVw>();
	private ListHandler<DiaryEntryVw> sortHandler;

	@UiField(provided = true) DataGrid<DiaryEntryVw> dataGrid;
	@UiField(provided = true) SimplePager pager;
	@UiField Button addButton;
	@UiField Button deleteButton;
	@UiField Button saveButton;
	@UiField DateBox fromDate; 
	@UiField DateBox toDate; 
	@UiField Button retrieve;
	
	
	public Button getRetrieve() {
		return retrieve;
	}

	public Date getFromDate() {
		Date date = fromDate.getValue();
		return getFormatedDate(date);
	}
	
	public Date getToDate() {
		Date date = toDate.getValue();
		return getFormatedDate(date);
	}
	
	private Date getFormatedDate(Date dt) {
		DateTimeFormat f = DateTimeFormat.getFormat("yyyy/MM/dd");
		String s = f.format(dt);
		return f.parse(s);
	}
	public DiaryEntryViewImpl() {
		ProvidesKey<DiaryEntryVw> KEY_PROVIDER = new ProvidesKey<DiaryEntryVw>() {
			@Override
			public Object getKey(DiaryEntryVw item) {
				return item == null ? null : item.getId();
			}
		};

		DataGrid.Resources customDataGridResources = GWT.create(tmDataGridResources.class);
		//DataGridRecouceBoundle.INSTANCE.stylesheet1().ensureInjected(); 
		dataGrid = new DataGrid<DiaryEntryVw>(20,customDataGridResources,KEY_PROVIDER);
		dataGrid.setWidth("700px");
		dataGrid.setHeight("400px");

		dataGrid.setAutoHeaderRefreshDisabled(true); 
		dataGrid.setEmptyTableWidget(new Label("No Data Yet"));

		// Attach a column sort handler to the ListDataProvider to sort the list.
		getDataProvider().addDataDisplay(dataGrid);
		sortHandler = new ListHandler<DiaryEntryVw>(getDataProvider().getList()) ;
		dataGrid.addColumnSortHandler(sortHandler);

		// Create a Pager to control the table.
		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(dataGrid);

		// Add a selection model so we can select cells.
		final MultiSelectionModel<DiaryEntryVw> selectionModel = new MultiSelectionModel<DiaryEntryVw>(KEY_PROVIDER);
		dataGrid.setSelectionModel(selectionModel, DefaultSelectionEventManager.<DiaryEntryVw> createCheckboxManager());

		// Initialize the columns.
		initTableColumns(selectionModel, sortHandler); 

		//dataGrid.setTableBuilder(new CustomTableBuilder());
		initWidget(uiBinder.createAndBindUi(this));
 
		fromDate.setTitle("Choose from calendar");
		fromDate.setWidth("100px");
		fromDate.setValue(new Date());
		fromDate.setFormat(new MyCustomDateBoxFormat());
		
		
		toDate.setTitle("Choose from calendar");
		toDate.setWidth("100px");
		toDate.setValue(new Date());
		toDate.setFormat(new MyCustomDateBoxFormat());
		
		//dataGrid.redraw();

	}

	public ListDataProvider<DiaryEntryVw> getDataProvider() {
		return dataProvider;
	}

	
	public Button getAddButton() {
		return addButton;
	}

	public void addDataToProvider(List<DiaryEntryVw> listToWrap) {
		if (listToWrap==null) return;
		dataProvider.getList().clear();
		for (DiaryEntryVw vw:listToWrap) {
			dataProvider.getList().add(vw);
		}
		ColumnSortEvent.fire(dataGrid, dataGrid.getColumnSortList());
	}
	private void initTableColumns(final MultiSelectionModel<DiaryEntryVw> selectionModel,
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
		CheckboxHeader header = new CheckboxHeader(selectionModel, dataProvider);
		dataGrid.addColumn(checkColumn, header);
		//dataGrid.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
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
				new Column<DiaryEntryVw, String>(new EditTextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return String.valueOf(object.getDuration());
			}
		};
		durationColumn.setFieldUpdater(new FieldUpdater<DiaryEntryVw, String>() {
			@Override
			public void update(int index, DiaryEntryVw object, String value) {
				// Called when the user changes the value.
				selectionModel.setSelected(object, true);
				object.getDiaryEntry().setDuration(Double.parseDouble(value)); 
			}
		});
		durationColumn.setSortable(true);
		sortHandler.setComparator(durationColumn, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return (int) (o1.getDuration()-(o2.getDuration()));
			}
		});
		dataGrid.addColumn(durationColumn, "Duration");
		dataGrid.setColumnWidth(durationColumn, 15, Unit.PCT);

		final DateTimeFormat f = DateTimeFormat.getFormat("yyyy/MM/dd");

		Column<DiaryEntryVw, String> entryTime =
				new Column<DiaryEntryVw, String>(new TextCell()) {
			@Override
			public String getValue(DiaryEntryVw object) {
				return f.format(object.getEntry_date());
			}
		};
		entryTime.setSortable(true);
		sortHandler.setComparator(entryTime, new Comparator<DiaryEntryVw>() {
			@Override
			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
				return (o1.getEntry_date().compareTo((o2.getEntry_date())));
			}
		});
		dataGrid.addColumn(entryTime, "Entered");
		dataGrid.setColumnWidth(entryTime, 25, Unit.PCT);
		
		// Start Time
//		Column<DiaryEntryVw, String> stTimeColumn =
//				new Column<DiaryEntryVw, String>(new TextCell()) {
//			@Override
//			public String getValue(DiaryEntryVw object) {
//				return f.format(object.getStart_time());
//			}
//		};
//		stTimeColumn.setSortable(true);
//		sortHandler.setComparator(stTimeColumn, new Comparator<DiaryEntryVw>() {
//			@Override
//			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
//				return (o1.getStart_time().compareTo((o2.getStart_time())));
//			}
//		});
//		dataGrid.addColumn(stTimeColumn, "Start Time");
//		dataGrid.setColumnWidth(stTimeColumn, 25, Unit.PCT);

		// End Time
//		Column<DiaryEntryVw, String> endTimeColumn =
//				new Column<DiaryEntryVw, String>(new TextCell()) {
//			@Override
//			public String getValue(DiaryEntryVw object) {
//				return f.format(object.getEnd_time());
//			}
//		};
//		endTimeColumn.setSortable(true);
//		sortHandler.setComparator(endTimeColumn, new Comparator<DiaryEntryVw>() {
//			@Override
//			public int compare(DiaryEntryVw o1, DiaryEntryVw o2) {
//				return (o1.getEnd_time().compareTo((o2.getEnd_time())));
//			}
//		});
//		dataGrid.addColumn(endTimeColumn, "End Time");
//		dataGrid.setColumnWidth(endTimeColumn, 25, Unit.PCT);
	}

	private class CustomTableBuilder extends AbstractCellTableBuilder<DiaryEntryVw> {
		String category = "";

		public CustomTableBuilder() {
			super(dataGrid);
		}

		@Override
		protected void buildRowImpl(DiaryEntryVw rowValue, int absRowIndex) {
			if (!category.equals(rowValue.getCategory())) {
				TableRowBuilder row = startRow();
				row.style().textAlign(TextAlign.LEFT);
				TableCellBuilder td = row.startTD().colSpan(dataGrid.getColumnCount());
				//td.style().trustedBackgroundColor("#0066cc").endStyle();
				td.text(rowValue.getCategory()).endTD();
				row.endTR();
			}
			TableRowBuilder row = startRow();
			for (int i=0;i<dataGrid.getColumnCount();i++) {
				TableCellBuilder td = row.startTD(); 
				renderCell(td, createContext(i), dataGrid.getColumn(i), rowValue); 
				td.endTD();
			}
			row.endTR();
		}
	}
 
	
}
