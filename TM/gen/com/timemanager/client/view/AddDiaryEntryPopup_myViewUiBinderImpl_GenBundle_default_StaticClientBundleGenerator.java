package com.timemanager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle {
  private static AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GGT1V4UCGK{margin-top:" + ("10px")  + ";align:" + ("center")  + ";background:" + ("white")  + ";margin-right:" + ("auto")  + ";margin-left:" + ("auto")  + ";}.GGT1V4UCHK{align:" + ("center")  + ";}")) : ((".GGT1V4UCGK{margin-top:" + ("10px")  + ";align:" + ("center")  + ";background:" + ("white")  + ";margin-left:" + ("auto")  + ";margin-right:" + ("auto")  + ";}.GGT1V4UCHK{align:" + ("center")  + ";}"));
      }
      public java.lang.String addTaskPanel(){
        return "GGT1V4UCGK";
      }
      public java.lang.String title(){
        return "GGT1V4UCHK";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
