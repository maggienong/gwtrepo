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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GGT1V4UCHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GGT1V4UCIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GGT1V4UCBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GGT1V4UCFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GGT1V4UCFH:hover{color:" + ("#6c6b6b")  + ";}.GGT1V4UCCG{background:" + ("#fff")  + ";}.GGT1V4UCDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GGT1V4UCBH{background:" + ("#f3f7fb")  + ";}.GGT1V4UCCH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GGT1V4UCJG{background:" + ("#eee")  + ";}.GGT1V4UCKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GGT1V4UCMG{background:" + ("#ffc")  + ";}.GGT1V4UCNG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GGT1V4UCDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GGT1V4UCEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GGT1V4UCLG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}")) : ((".GGT1V4UCHG{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GGT1V4UCIG{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:") + (("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";}.GGT1V4UCBG{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GGT1V4UCFH{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GGT1V4UCFH:hover{color:" + ("#6c6b6b")  + ";}.GGT1V4UCCG{background:" + ("#fff")  + ";}.GGT1V4UCDG{border:" + ("2px"+ " " +"solid"+ " " +"#fff") ) + (";}.GGT1V4UCBH{background:" + ("#f3f7fb")  + ";}.GGT1V4UCCH{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb")  + ";}.GGT1V4UCJG{background:" + ("#eee")  + ";}.GGT1V4UCKG{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GGT1V4UCMG{background:" + ("#ffc")  + ";}.GGT1V4UCNG{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GGT1V4UCDH{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GGT1V4UCEH{border:") + (("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GGT1V4UCLG{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}"));
      }
      public java.lang.String dataGridCell(){
        return "GGT1V4UCBG";
      }
      public java.lang.String dataGridEvenRow(){
        return "GGT1V4UCCG";
      }
      public java.lang.String dataGridEvenRowCell(){
        return "GGT1V4UCDG";
      }
      public java.lang.String dataGridFirstColumn(){
        return "GGT1V4UCEG";
      }
      public java.lang.String dataGridFirstColumnFooter(){
        return "GGT1V4UCFG";
      }
      public java.lang.String dataGridFirstColumnHeader(){
        return "GGT1V4UCGG";
      }
      public java.lang.String dataGridFooter(){
        return "GGT1V4UCHG";
      }
      public java.lang.String dataGridHeader(){
        return "GGT1V4UCIG";
      }
      public java.lang.String dataGridHoveredRow(){
        return "GGT1V4UCJG";
      }
      public java.lang.String dataGridHoveredRowCell(){
        return "GGT1V4UCKG";
      }
      public java.lang.String dataGridKeyboardSelectedCell(){
        return "GGT1V4UCLG";
      }
      public java.lang.String dataGridKeyboardSelectedRow(){
        return "GGT1V4UCMG";
      }
      public java.lang.String dataGridKeyboardSelectedRowCell(){
        return "GGT1V4UCNG";
      }
      public java.lang.String dataGridLastColumn(){
        return "GGT1V4UCOG";
      }
      public java.lang.String dataGridLastColumnFooter(){
        return "GGT1V4UCPG";
      }
      public java.lang.String dataGridLastColumnHeader(){
        return "GGT1V4UCAH";
      }
      public java.lang.String dataGridOddRow(){
        return "GGT1V4UCBH";
      }
      public java.lang.String dataGridOddRowCell(){
        return "GGT1V4UCCH";
      }
      public java.lang.String dataGridSelectedRow(){
        return "GGT1V4UCDH";
      }
      public java.lang.String dataGridSelectedRowCell(){
        return "GGT1V4UCEH";
      }
      public java.lang.String dataGridSortableHeader(){
        return "GGT1V4UCFH";
      }
      public java.lang.String dataGridSortedHeaderAscending(){
        return "GGT1V4UCGH";
      }
      public java.lang.String dataGridSortedHeaderDescending(){
        return "GGT1V4UCHH";
      }
      public java.lang.String dataGridWidget(){
        return "GGT1V4UCIH";
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
