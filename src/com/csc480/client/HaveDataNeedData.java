package com.csc480.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class HaveDataNeedData {
    RootPanel rootPanel;
    
    public void onModuleLoad() {
	//RootPanel rootPan = RootPanel.get();
	rootPanel = Mockup.rootPanel;
	
	Button btnHaveData = new Button("Have Data");
	btnHaveData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("PreDisplay");
		}
	});
	rootPanel.add(btnHaveData, 10, 10);
	btnHaveData.setSize("212px", "280px");
	
	Button btnNeedData = new Button("Need Data");
	btnNeedData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		}
	});
	rootPanel.add(btnNeedData, 228, 10);
	btnNeedData.setSize("212px", "280px");
	// TODO Auto-generated method stub
	
    }
}
