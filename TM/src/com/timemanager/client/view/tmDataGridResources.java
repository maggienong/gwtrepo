package com.timemanager.client.view;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.DataGrid.Resources;

public interface tmDataGridResources extends Resources {
	
	@Source("css/asc.gif")
	@ImageOptions(flipRtl = true)
	ImageResource dataGridSortAscending();
	
	@Source("css/desc.gif")
	@ImageOptions(flipRtl = true)
	ImageResource dataGridSortDescending();
	
	
    @Source({ "css/tmDataGridStyles.css"})
    @CssResource.NotStrict
    CustomStyle dataGridStyle();

    interface CustomStyle extends DataGrid.Style {
    }
}