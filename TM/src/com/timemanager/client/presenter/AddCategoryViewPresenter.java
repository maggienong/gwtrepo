package com.timemanager.client.presenter;

import java.util.List;

import com.google.gwt.cell.client.ClickableTextCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.gwt.view.client.SingleSelectionModel;
import com.timemanager.client.TimeManagerService;
import com.timemanager.client.TimeManagerServiceAsync;
import com.timemanager.client.view.AddCategoryView;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;

public class AddCategoryViewPresenter implements Presenter {

	private final HandlerManager eventBus;
	private final AddCategoryView view;

	TimeManagerServiceAsync tmService = GWT.create(TimeManagerService.class);

	public AddCategoryViewPresenter(AddCategoryView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();
		init();
	}

	private void init() {
		refresh();
	}

	private void refresh() {

		AsyncCallback<List<CategoryDTO>> callback = new AsyncCallback<List<CategoryDTO>>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to get category");
			}

			public void onSuccess(List<CategoryDTO> result) { 
				if (result!=null) {
					view.getDataProvider().getList().clear();
					for (CategoryDTO dto:result) {
						view.getDataProvider().getList().add(dto);
					}
					ColumnSortEvent.fire(view.getCellTable(), view.getCellTable().getColumnSortList());
				}
			}

		};
		tmService.getCategoryByUser(callback);

	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {  
		view.getAddButton().addClickHandler(
				new ClickHandler() {
					@Override
					public void onClick(ClickEvent event) {
						saveCategory();
					} 
				});
		view.getAddTaskButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				saveTask();
			}
		});
		
		final SingleSelectionModel<CategoryDTO> selectionModel = new  SingleSelectionModel<CategoryDTO>(); 

		Handler selectionHandler = new SelectionChangeEvent.Handler() { 

			@Override 
			public void onSelectionChange( SelectionChangeEvent event) { 
				CategoryDTO dto  = selectionModel.getSelectedObject(); 
				view.setCategory(dto);
				AsyncCallback<List<TaskDTO>> callback = new AsyncCallback<List<TaskDTO>>() {
					public void onFailure(Throwable caught) {
						Window.alert("failed to get category");
					}

					public void onSuccess(List<TaskDTO> result) {
						view.getTaskDataProvider().getList().clear();
						if (result!=null) {
							for (TaskDTO dto:result) {
								view.getTaskDataProvider().getList().add(dto);
							}
							ColumnSortEvent.fire(view.getTaskCellTable(), view.getTaskCellTable().getColumnSortList());
						}
					}

				};
				tmService.getTaskByUserCategory(dto.getId(), callback);
			} 

		}; 
		selectionModel.addSelectionChangeHandler(selectionHandler);  
		view.getCellTable().setSelectionModel(selectionModel);
		
		Column<CategoryDTO, String> imageColumn = 
				new Column<CategoryDTO, String>(
						new ClickableTextCell() 
						{
							public void render(Context  context, 
									SafeHtml value, 
									SafeHtmlBuilder sb)
							{
								sb.appendHtmlConstant("<img width=\"20\" src=\"images/" 
										+ value.asString() + "\">");
							}


						}) {
			@Override
			public String getValue(CategoryDTO object) {
				return "delete.png";
			}
			@Override
			public void onBrowserEvent(Context context, com.google.gwt.dom.client.Element elem,
					CategoryDTO object, NativeEvent event ) {
				// TODO Auto-generated method stub
				super.onBrowserEvent(context, elem, object, event);
				if ("click".equals(event.getType())) {
					removeCategory(object);
				}
			}
		};

		view.getCellTable().addColumn(imageColumn, "");
		 
		Column<TaskDTO, String> imageColumn1 = 
				new Column<TaskDTO, String>(
						new ClickableTextCell() 
						{
							@Override
							public void render(Context  context, 
									SafeHtml value, 
									SafeHtmlBuilder sb)
							{
								sb.appendHtmlConstant("<img width=\"20\" src=\"images/" 
										+ value.asString() + "\">");
							}

						 
						}) {
			@Override
			public void onBrowserEvent(Context context, com.google.gwt.dom.client.Element elem,
					TaskDTO object, NativeEvent event ) {
				// TODO Auto-generated method stub
				super.onBrowserEvent(context, elem, object, event);
				if ("click".equals(event.getType())) {
					removeTask(object);
				}
			}

			@Override
			public String getValue(TaskDTO object) {
				return "delete.png";
			}
		};

		view.getTaskCellTable().addColumn(imageColumn1, "");


	}

	protected void saveTask() {
		if (view.getCategory()==null) {
			Window.alert("Please choose a category first"); 
			return;
		}
		
		TaskDTO dto = new TaskDTO(); 
		dto.setDescription(view.getTaskField().getText());
		dto.setCategory_id(view.getCategory().getId());
		//dto.setCategory_id(view.getCellTable().getSelectionModel().)

		AsyncCallback<TaskDTO> callback = new AsyncCallback<TaskDTO>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to save");
			}

			public void onSuccess(TaskDTO result) {
				if (result!=null) {
					view.getTaskDataProvider().getList().add(result);
					ColumnSortEvent.fire(view.getTaskCellTable(), view.getTaskCellTable().getColumnSortList());
				}
			}

		};
		tmService.addTask(dto, callback);
		view.getTaskField().setText("");
	}

	private void removeCategory(final CategoryDTO dto) {
		AsyncCallback<Void> callback = new AsyncCallback<Void>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to delete ");
			}

			public void onSuccess(Void result) {
				view.setCategory(null);
				view.getDataProvider().getList().remove(dto);
				view.getTaskDataProvider().getList().clear();
				Window.alert("remove category");
			}

		};
		tmService.delteCategory(dto, callback); 
	}
	
	private void removeTask(final TaskDTO dto) {
		AsyncCallback<Void> callback = new AsyncCallback<Void>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to delete ");
			}

			public void onSuccess(Void result) { 
				view.getTaskDataProvider().getList().remove(dto);
				Window.alert("remove Task");
			}

		};
		tmService.delteTask(dto, callback); 
	}
	
	private void saveCategory() {
		CategoryDTO dto = new CategoryDTO();

		dto.setDescription(view.getTextBox().getText());

		AsyncCallback<CategoryDTO> callback = new AsyncCallback<CategoryDTO>() {
			public void onFailure(Throwable caught) {
				Window.alert("failed to save");
			}

			public void onSuccess(CategoryDTO result) {
				if (result!=null) {
					view.getDataProvider().getList().add(result);
					ColumnSortEvent.fire(view.getCellTable(), view.getCellTable().getColumnSortList());
					view.getCellTable().getSelectionModel().setSelected(result, true);
				}
			}

		};
		tmService.addCategory(dto, callback);
		view.getTextBox().setText("");
	}
}
