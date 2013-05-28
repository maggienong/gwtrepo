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

public class AddDiaryEntryPopup_myViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.timemanager.client.view.AddDiaryEntryPopup>, com.timemanager.client.view.AddDiaryEntryPopup.myViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Add")
    SafeHtml html1();
     
    @Template("Cancel")
    SafeHtml html2();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.timemanager.client.view.AddDiaryEntryPopup owner) {


    return new Widgets(owner).get_f_DecoratorPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.timemanager.client.view.AddDiaryEntryPopup owner;


    public Widgets(final com.timemanager.client.view.AddDiaryEntryPopup owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle) GWT.create(com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style style;
    private com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.timemanager.client.view.AddDiaryEntryPopup_myViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_DecoratorPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DecoratorPanel get_f_DecoratorPanel1() {
      return build_f_DecoratorPanel1();
    }
    private com.google.gwt.user.client.ui.DecoratorPanel build_f_DecoratorPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DecoratorPanel f_DecoratorPanel1 = (com.google.gwt.user.client.ui.DecoratorPanel) GWT.create(com.google.gwt.user.client.ui.DecoratorPanel.class);
      // Setup section.
      f_DecoratorPanel1.add(get_f_VerticalPanel2());
      f_DecoratorPanel1.addStyleName("" + get_style().addTaskPanel() + "");


      return f_DecoratorPanel1;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.add(get_f_Label3());
      f_VerticalPanel2.add(get_f_HorizontalPanel4());
      f_VerticalPanel2.add(get_f_HorizontalPanel6());
      f_VerticalPanel2.add(get_f_HorizontalPanel8());
      f_VerticalPanel2.add(get_f_HorizontalPanel10());
      f_VerticalPanel2.setHeight("250px");
      f_VerticalPanel2.setWidth("400px");


      return f_VerticalPanel2;
    }

    /**
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.addStyleName("" + get_style().title() + "");
      f_Label3.setText("Add Diary Entry");


      return f_Label3;
    }

    /**
     * Getter for f_HorizontalPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel4() {
      return build_f_HorizontalPanel4();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel4 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel4.add(get_f_Label5());
      f_HorizontalPanel4.add(get_categoryList());


      return f_HorizontalPanel4;
    }

    /**
     * Getter for f_Label5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label5() {
      return build_f_Label5();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label5() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label5.setText("Category:");


      return f_Label5;
    }

    /**
     * Getter for categoryList called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_categoryList() {
      return build_categoryList();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_categoryList() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox categoryList = owner.categoryList;
      assert categoryList != null : "UiField categoryList with 'provided = true' was null";
      // Setup section.


      return categoryList;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Label7());
      f_HorizontalPanel6.add(get_taskList());


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Label7 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label7() {
      return build_f_Label7();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label7.setText("Task:");


      return f_Label7;
    }

    /**
     * Getter for taskList called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_taskList() {
      return build_taskList();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_taskList() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox taskList = owner.taskList;
      assert taskList != null : "UiField taskList with 'provided = true' was null";
      // Setup section.


      return taskList;
    }

    /**
     * Getter for f_HorizontalPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel8() {
      return build_f_HorizontalPanel8();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel8.add(get_f_Label9());
      f_HorizontalPanel8.add(get_duration());


      return f_HorizontalPanel8;
    }

    /**
     * Getter for f_Label9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label9() {
      return build_f_Label9();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label9 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label9.setText("Duration:");


      return f_Label9;
    }

    /**
     * Getter for duration called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_duration() {
      return build_duration();
    }
    private com.google.gwt.user.client.ui.TextBox build_duration() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox duration = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      duration.setFocus(true);


      owner.duration = duration;

      return duration;
    }

    /**
     * Getter for f_HorizontalPanel10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel10() {
      return build_f_HorizontalPanel10();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel10 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel10.add(get_addButton());
      f_HorizontalPanel10.add(get_cancelButton());


      return f_HorizontalPanel10;
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
      addButton.setHTML(template_html1().asString());


      owner.addButton = addButton;

      return addButton;
    }

    /**
     * Getter for cancelButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Button get_cancelButton() {
      return build_cancelButton();
    }
    private com.google.gwt.user.client.ui.Button build_cancelButton() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button cancelButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      cancelButton.setHTML(template_html2().asString());


      owner.cancelButton = cancelButton;

      return cancelButton;
    }
  }
}
