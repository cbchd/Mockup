package com.csc480.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Mockup implements EntryPoint {
    static RootPanel rootPanel;

    @Override
    public void onModuleLoad() {
	RootPanel rootPan = RootPanel.get();
	rootPanel = rootPan;
	controller("HaveDataNeedData"); //Start controller with the default homepage "HaveDataDeedData"
    }
    
    static public void controller(String location) {
	if (location.equals("HaveDataNeedData")) {
	    HaveDataNeedData homepage = new HaveDataNeedData();
	    homepage.onModuleLoad();
	} else if (location.equals("PreDisplay")) {
	    PreDisplay preDisplay = new PreDisplay();
	    preDisplay.onModuleLoad();
	} else if (location.equals("VisPlusData")) {
	    VisPlusData visPlusData = new VisPlusData();
	    visPlusData.onModuleLoad();
	} else if (location.equals("DataDetail")) {
	    DataDetail dataDetail = new DataDetail();
	    dataDetail.onModuleLoad();
	}
    }
}
