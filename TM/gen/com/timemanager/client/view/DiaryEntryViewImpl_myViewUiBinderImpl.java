package com.timemanager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class DiaryEntryViewImpl_myViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.timemanager.client.view.DiaryEntryViewImpl>, com.timemanager.client.view.DiaryEntryViewImpl.myViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<table style='width:100%'> <tr> <td align='center'> <span id='{0}'></span> </td> </tr> </table>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.timemanager.client.view.DiaryEntryViewImpl owner) {


    return new Widgets(owner).get_f_DockLayoutPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.timemanager.client.view.DiaryEntryViewImpl owner;


    public Widgets(final com.timemanager.client.view.DiaryEntryViewImpl owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle) GWT.create(com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_DockLayoutPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel1() {
      return build_f_DockLayoutPanel1();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
      // Setup section.
      f_DockLayoutPanel1.addSouth(get_f_HTMLPanel2(), 400);
      f_DockLayoutPanel1.add(get_dataGrid());


      return f_DockLayoutPanel1;
    }

    /**
     * Getter for dataGrid called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.cellview.client.DataGrid get_dataGrid() {
      return build_dataGrid();
    }
    private com.google.gwt.user.cellview.client.DataGrid build_dataGrid() {
      // Creation section.
      final com.google.gwt.user.cellview.client.DataGrid dataGrid = owner.dataGrid;
      assert dataGrid != null : "UiField dataGrid with 'provided = true' was null";
      // Setup section.
      dataGrid.addStyleName("" + get_style().dataGrid() + "");


      return dataGrid;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel2.addAndReplaceElement(get_pager(), get_domId0Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for pager called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.cellview.client.SimplePager get_pager() {
      return build_pager();
    }
    private com.google.gwt.user.cellview.client.SimplePager build_pager() {
      // Creation section.
      final com.google.gwt.user.cellview.client.SimplePager pager = owner.pager;
      assert pager != null : "UiField pager with 'provided = true' was null";
      // Setup section.


      return pager;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
