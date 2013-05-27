package com.timemanager.client.util;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

public class ClosablePanel extends DialogBox {

   private PopupPanel closePnl = null;

   public ClosablePanel() {
      super(true);

      //super.setStyleName("border-closable");
      createClosePanel();

      setStyleName("gwt-DialogBox-ClosePanel");
   }


   public ClosablePanel(boolean autoHide, boolean modal) {
      super(autoHide, modal);

      createClosePanel();

      setStyleName("gwt-DialogBox-ClosePanel");
   }



   @Override
   protected void beginDragging(MouseDownEvent event) {
      super.beginDragging(event);
      if (closePnl.isShowing()) {
         positionClose();
      }
   }

   @Override
   protected void continueDragging(MouseMoveEvent event) {
      super.continueDragging(event);
      if (closePnl.isShowing()) {
         positionClose();
      }
   }

   @Override
   protected void endDragging(MouseUpEvent event) {
      super.endDragging(event);
      if (closePnl.isShowing()) {
         positionClose();
      }

   }

   protected void createClosePanel() {

      // Image img = new Image("images/Close_icon.gif");
      Image img = new Image("images/close-popup.png");
      img.addClickHandler(new ClickHandler() {

                             @Override
                             public void onClick(ClickEvent event) {
                                ClosablePanel.this.hide();
                                closePnl.hide();
                             }
                          }
                         );

      HorizontalPanel pnl = new HorizontalPanel();
      pnl.add(img);
      pnl.setBorderWidth(0);
      // pnl.setSize("10px", "10px");
      closePnl = new PopupPanel(false, false);
      closePnl.setPixelSize(10, 10);
      closePnl.add(pnl);
      closePnl.setStyleName("glassPanel");

      closePnl.addCloseHandler(new CloseHandler<PopupPanel>() {

                                  @Override
                                  public void onClose(CloseEvent<PopupPanel> event) {
                                     ClosablePanel.this.hide();
                                  }
                               }
                              );

      addCloseHandler(new CloseHandler<PopupPanel>() {

                         @Override
                         public void onClose(CloseEvent<PopupPanel> event) {
                            closePnl.hide();
                         }
                      }
                     );
   }

   @Override
   public void add(Widget w) {
      HorizontalPanel pnl = new HorizontalPanel();
      // pnl.setStyleName("hp-border-closable");
      // pnl.setBorderWidth(10);
      // DOM.setElementProperty(pnl.getElement(), "border-color", "#b4d0f8");
      //DOM.setStyleAttribute(getElement(), "borderColor", "#b4d0f8");
      //DOM.setStyleAttribute(getElement(), "borderTopWidth", "14px");

      pnl.add(w);

      super.add(pnl);
   }

   @Override
   public void show() {
      super.show();
      positionClose();
   }
   
   public void hideWindow() {
	   ClosablePanel.this.hide();
       closePnl.hide();
   }

   private void positionClose() {
      if (closePnl != null) {
         // closePnl.setPopupPosition(this.getAbsoluteLeft() +
         // getWidget().getOffsetWidth(), this.getAbsoluteTop() - 15);
         closePnl.setPopupPosition(this.getAbsoluteLeft() - 5,
                                   this.getAbsoluteTop() - 5);
         closePnl.show();
      }
   }
}
