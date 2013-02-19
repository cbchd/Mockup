package com.csc480.client;

import com.google.gwt.dev.jjs.impl.gflow.cfg.CfgEndNode;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class HaveDataNeedData {
    RootPanel rootPanel;
    
    public void onModuleLoad() {
	//RootPanel rootPan = RootPanel.get();
	rootPanel = Mockup.rootPanel;
	
	HorizontalPanel panel = new HorizontalPanel();
	panel.setHeight(Window.getClientHeight()-40 + "px");
	panel.setHorizontalAlignment(HorizontalPanel.ALIGN_CENTER);
	panel.setVerticalAlignment(HorizontalPanel.ALIGN_MIDDLE);
	panel.setSpacing(20);
	panel.getElement().setId("haveDataNeedDataPanel");
	
	Button btnHaveData = new Button("Have Data");
	btnHaveData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("PreDisplay");
		}
	});
	panel.add(btnHaveData);
	btnHaveData.setSize("212px", "280px");
	
	Button btnNeedData = new Button("Need Data");
	btnNeedData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		}
	});
	panel.add(btnNeedData);
	btnNeedData.setSize("212px", "280px");
	
	rootPanel.add(panel);
	
    }
}
