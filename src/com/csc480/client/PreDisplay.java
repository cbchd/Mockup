package com.csc480.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class PreDisplay implements EntryPoint {
    /**
     * @wbp.parser.entryPoint
     */
    RootPanel rootPanel;

    @Override
    public void onModuleLoad() {
	rootPanel = Mockup.rootPanel;
	//Uncomment this first line to use the designer
	//RootPanel rootPanel = RootPanel.get();
	//Mockup.rootPanel.clear();
	
	HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
	rootPanel.add(horizontalSplitPanel, 10, 10);
	horizontalSplitPanel.setSize("430px", "247px");
	
	Label lblNewLabel = new Label("Options");
	lblNewLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	horizontalSplitPanel.setLeftWidget(lblNewLabel);
	lblNewLabel.setSize("212px", "40px");
	
	Label lblNewLabel_1 = new Label("Visualization\r\n");
	lblNewLabel_1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	horizontalSplitPanel.setRightWidget(lblNewLabel_1);
	lblNewLabel_1.setSize("208px", "34px");
	
	Button btnVisualizationData = new Button("Visualization + Data View");
	btnVisualizationData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("VisPlusData");
		}
	});
	rootPanel.add(btnVisualizationData, 256, 263);
	
	Button btnNewButton = new Button("Data Detail");
	btnNewButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("DataDetail");
		}
	});
	btnNewButton.setText("Data Detail");
	rootPanel.add(btnNewButton, 32, 263);
	btnNewButton.setSize("180px", "30px");
    }
}
