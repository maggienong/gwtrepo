package com.timemanager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle {
  private static DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GGT1V4UCOJ{margin-top:" + ("50px")  + ";margin-bottom:" + ("50px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";background:" + ("white")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#e4e9eb")  + ";}.GGT1V4UCPJ{margin-top:" + ("10px")  + ";}.GGT1V4UCNJ{border:" + ("1px"+ " " +"solid"+ " " +"#454547")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";background:") + (("white")  + ";}.GGT1V4UCAK{border:" + ("1px"+ " " +"solid"+ " " +"#454547")  + ";margin-top:" + ("10px")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";vertical-align:" + ("top")  + ";}")) : ((".GGT1V4UCOJ{margin-top:" + ("50px")  + ";margin-bottom:" + ("50px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";background:" + ("white")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#e4e9eb")  + ";}.GGT1V4UCPJ{margin-top:" + ("10px")  + ";}.GGT1V4UCNJ{border:" + ("1px"+ " " +"solid"+ " " +"#454547")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";background:") + (("white")  + ";}.GGT1V4UCAK{border:" + ("1px"+ " " +"solid"+ " " +"#454547")  + ";margin-top:" + ("10px")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";vertical-align:" + ("top")  + ";}"));
      }
      public java.lang.String datagrid(){
        return "GGT1V4UCNJ";
      }
      public java.lang.String mainpanel(){
        return "GGT1V4UCOJ";
      }
      public java.lang.String pager(){
        return "GGT1V4UCPJ";
      }
      public java.lang.String southpanel(){
        return "GGT1V4UCAK";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
