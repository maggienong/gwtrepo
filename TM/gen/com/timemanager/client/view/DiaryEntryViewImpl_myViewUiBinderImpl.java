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
    @Template("<table style='width:100%;height:100%;'> <tr> <td align='center' valign='bottom'> <span id='{0}'></span> </td> </tr> </table>")
    SafeHtml html1(String arg0);
     
    @Template("Add")
    SafeHtml html2();
     
    @Template("Delete")
    SafeHtml html3();
     
    @Template("Save")
    SafeHtml html4();
     
    @Template("<table><tr> <td><span id='{0}'></span> </td> <td><span id='{1}'></span></td> <td><span id='{2}'></span> </td> </tr></table>")
    SafeHtml html5(String arg0, String arg1, String arg2);
     
    @Template("<table><tr> <td><span id='{0}'></span></td> </tr></table>")
    SafeHtml html6(String arg0);
     
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
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 4
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 4
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5(get_domId1(), get_domId2(), get_domId3());
    }
    SafeHtml template_html6() {
      return template.html6(get_domId4());
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
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style style;
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.timemanager.client.view.DiaryEntryViewImpl_myViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_DockLayoutPanel1.addNorth(get_f_HTMLPanel2(), 100);
      f_DockLayoutPanel1.addSouth(get_f_HorizontalPanel3(), 100);
      f_DockLayoutPanel1.add(get_dataGrid());
      f_DockLayoutPanel1.addStyleName("" + get_style().mainpanel() + "");


      return f_DockLayoutPanel1;
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
      f_HTMLPanel2.addStyleName("" + get_style().pager() + "");

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
      dataGrid.addStyleName("" + get_style().datagrid() + "");


      return dataGrid;
    }

    /**
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.add(get_f_HTMLPanel4());
      f_HorizontalPanel3.add(get_f_HTMLPanel5());
      f_HorizontalPanel3.addStyleName("" + get_style().southpanel() + "");


      return f_HorizontalPanel3;
    }

    /**
     * Getter for f_HTMLPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel4() {
      return build_f_HTMLPanel4();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel4 = new com.google.gwt.user.client.ui.HTMLPanel(template_html5().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel4.getElement());
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();

      // Detach section.
      attachRecord1.detach();
      f_HTMLPanel4.addAndReplaceElement(get_addButton(), get_domId1Element().get());
      f_HTMLPanel4.addAndReplaceElement(get_deleteButton(), get_domId2Element().get());
      f_HTMLPanel4.addAndReplaceElement(get_saveButton(), get_domId3Element().get());

      return f_HTMLPanel4;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for addButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_addButton() {
      return build_addButton();
    }
    private com.google.gwt.user.client.ui.Button build_addButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button addButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      addButton.setHTML(template_html2().asString());


      owner.addButton = addButton;

      return addButton;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for deleteButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_deleteButton() {
      return build_deleteButton();
    }
    private com.google.gwt.user.client.ui.Button build_deleteButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button deleteButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      deleteButton.setHTML(template_html3().asString());


      owner.deleteButton = deleteButton;

      return deleteButton;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId3;
    }

    /**
     * Getter for saveButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_saveButton() {
      return build_saveButton();
    }
    private com.google.gwt.user.client.ui.Button build_saveButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button saveButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      saveButton.setHTML(template_html4().asString());


      owner.saveButton = saveButton;

      return saveButton;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.


      return domId3Element;
    }

    /**
     * Getter for f_HTMLPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel5() {
      return build_f_HTMLPanel5();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel5 = new com.google.gwt.user.client.ui.HTMLPanel(template_html6().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel5.getElement());
      get_domId4Element().get();

      // Detach section.
      attachRecord2.detach();
      f_HTMLPanel5.addAndReplaceElement(get_created(), get_domId4Element().get());

      return f_HTMLPanel5;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 4.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId4;
    }

    /**
     * Getter for created called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_created() {
      return build_created();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_created() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox created = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.


      owner.created = created;

      return created;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.


      return domId4Element;
    }
  }
}
