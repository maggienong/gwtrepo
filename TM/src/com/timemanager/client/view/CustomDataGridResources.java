package com.timemanager.client.view;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.DataGrid.Resources;

public interface CustomDataGridResources extends Resources {
    @Source({DataGrid.Style.DEFAULT_CSS, "CustomDataGridStyles.css"})
    @CssResource.NotStrict
    CustomStyle dataGridStyle();

    interface CustomStyle extends DataGrid.Style {
    }
}