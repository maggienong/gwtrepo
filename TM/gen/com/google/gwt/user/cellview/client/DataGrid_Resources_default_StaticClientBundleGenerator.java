package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DataGrid_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.cellview.client.DataGrid.Resources {
  private static DataGrid_Resources_default_StaticClientBundleGenerator _instance0 = new DataGrid_Resources_default_StaticClientBundleGenerator();
  private void dataGridLoadingInitializer() {
    dataGridLoading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridLoading",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage),
      0, 0, 43, 11, true, false
    );
  }
  private static class dataGridLoadingInitializer {
    static {
      _instance0.dataGridLoadingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridLoading;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridLoading() {
    return dataGridLoadingInitializer.get();
  }
  private void dataGridSortAscendingInitializer() {
    dataGridSortAscending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridSortAscending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None),
      11, 0, 11, 7, false, false
    );
  }
  private static class dataGridSortAscendingInitializer {
    static {
      _instance0.dataGridSortAscendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridSortAscending;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridSortAscending() {
    return dataGridSortAscendingInitializer.get();
  }
  private void dataGridSortDescendingInitializer() {
    dataGridSortDescending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dataGridSortDescending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None),
      0, 0, 11, 7, false, false
    );
  }
  private static class dataGridSortDescendingInitializer {
    static {
      _instance0.dataGridSortDescendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dataGridSortDescending;
    }
  }
  public com.google.gwt.resources.client.ImageResource dataGridSortDescending() {
    return dataGridSortDescendingInitializer.get();
  }
  private void dataGridStyleInitializer() {
    dataGridStyle = new com.google.gwt.user.cellview.client.DataGrid.Style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "dataGridStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GPBYFDEHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GPBYFDEIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GPBYFDEBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GPBYFDEFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GPBYFDEFH:hover{color:" + ("#6c6b6b")  + ";}.GPBYFDECG{background:" + ("#fff")  + ";}.GPBYFDEDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GPBYFDEBH{background:" + ("#f3f7fb")  + ";}.GPBYFDECH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GPBYFDEJG{background:" + ("#eee")  + ";}.GPBYFDEKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GPBYFDEMG{background:" + ("#ffc")  + ";}.GPBYFDENG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GPBYFDEDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GPBYFDEEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GPBYFDELG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}")) : ((".GPBYFDEHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GPBYFDEIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GPBYFDEBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GPBYFDEFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GPBYFDEFH:hover{color:" + ("#6c6b6b")  + ";}.GPBYFDECG{background:" + ("#fff")  + ";}.GPBYFDEDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GPBYFDEBH{background:" + ("#f3f7fb")  + ";}.GPBYFDECH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GPBYFDEJG{background:" + ("#eee")  + ";}.GPBYFDEKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GPBYFDEMG{background:" + ("#ffc")  + ";}.GPBYFDENG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GPBYFDEDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GPBYFDEEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GPBYFDELG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}"));
      }
      public java.lang.String dataGridCell(){
        return "GPBYFDEBG";
      }
      public java.lang.String dataGridEvenRow(){
        return "GPBYFDECG";
      }
      public java.lang.String dataGridEvenRowCell(){
        return "GPBYFDEDG";
      }
      public java.lang.String dataGridFirstColumn(){
        return "GPBYFDEEG";
      }
      public java.lang.String dataGridFirstColumnFooter(){
        return "GPBYFDEFG";
      }
      public java.lang.String dataGridFirstColumnHeader(){
        return "GPBYFDEGG";
      }
      public java.lang.String dataGridFooter(){
        return "GPBYFDEHG";
      }
      public java.lang.String dataGridHeader(){
        return "GPBYFDEIG";
      }
      public java.lang.String dataGridHoveredRow(){
        return "GPBYFDEJG";
      }
      public java.lang.String dataGridHoveredRowCell(){
        return "GPBYFDEKG";
      }
      public java.lang.String dataGridKeyboardSelectedCell(){
        return "GPBYFDELG";
      }
      public java.lang.String dataGridKeyboardSelectedRow(){
        return "GPBYFDEMG";
      }
      public java.lang.String dataGridKeyboardSelectedRowCell(){
        return "GPBYFDENG";
      }
      public java.lang.String dataGridLastColumn(){
        return "GPBYFDEOG";
      }
      public java.lang.String dataGridLastColumnFooter(){
        return "GPBYFDEPG";
      }
      public java.lang.String dataGridLastColumnHeader(){
        return "GPBYFDEAH";
      }
      public java.lang.String dataGridOddRow(){
        return "GPBYFDEBH";
      }
      public java.lang.String dataGridOddRowCell(){
        return "GPBYFDECH";
      }
      public java.lang.String dataGridSelectedRow(){
        return "GPBYFDEDH";
      }
      public java.lang.String dataGridSelectedRowCell(){
        return "GPBYFDEEH";
      }
      public java.lang.String dataGridSortableHeader(){
        return "GPBYFDEFH";
      }
      public java.lang.String dataGridSortedHeaderAscending(){
        return "GPBYFDEGH";
      }
      public java.lang.String dataGridSortedHeaderDescending(){
        return "GPBYFDEHH";
      }
      public java.lang.String dataGridWidget(){
        return "GPBYFDEIH";
      }
    }
    ;
  }
  private static class dataGridStyleInitializer {
    static {
      _instance0.dataGridStyleInitializer();
    }
    static com.google.gwt.user.cellview.client.DataGrid.Style get() {
      return dataGridStyle;
    }
  }
  public com.google.gwt.user.cellview.client.DataGrid.Style dataGridStyle() {
    return dataGridStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseForStaticFiles() + "AB196D9D7834625802449A82C5811B43.cache.png";
  private static final java.lang.String bundledImage_None_rtl = GWT.getModuleBaseForStaticFiles() + "3E13412DD77AE068AAF96B6978824A75.cache.png";
  private static final java.lang.String externalImage = GWT.getModuleBaseForStaticFiles() + "0F89659FF3F324AE4116F700257E32BD.cache.gif";
  private static final java.lang.String externalImage_rtl = GWT.getModuleBaseForStaticFiles() + "13D2931874E71D07F248A0CDF051CC85.cache.png";
  private static com.google.gwt.resources.client.ImageResource dataGridLoading;
  private static com.google.gwt.resources.client.ImageResource dataGridSortAscending;
  private static com.google.gwt.resources.client.ImageResource dataGridSortDescending;
  private static com.google.gwt.user.cellview.client.DataGrid.Style dataGridStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      dataGridLoading(), 
      dataGridSortAscending(), 
      dataGridSortDescending(), 
      dataGridStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("dataGridLoading", dataGridLoading());
        resourceMap.put("dataGridSortAscending", dataGridSortAscending());
        resourceMap.put("dataGridSortDescending", dataGridSortDescending());
        resourceMap.put("dataGridStyle", dataGridStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'dataGridLoading': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridLoading()();
      case 'dataGridSortAscending': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridSortAscending()();
      case 'dataGridSortDescending': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridSortDescending()();
      case 'dataGridStyle': return this.@com.google.gwt.user.cellview.client.DataGrid.Resources::dataGridStyle()();
    }
    return null;
  }-*/;
}
