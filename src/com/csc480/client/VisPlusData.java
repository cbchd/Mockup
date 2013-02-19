package com.csc480.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalSplitPanel;
import com.google.gwt.user.client.ui.NumberLabel;

public class VisPlusData implements EntryPoint {

    @Override
    public void onModuleLoad() {
	RootPanel rootPanel = RootPanel.get();
	
	HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
	rootPanel.add(horizontalSplitPanel, 10, 10);
	horizontalSplitPanel.setSize("430px", "280px");
	
	VerticalSplitPanel verticalSplitPanel = new VerticalSplitPanel();
	horizontalSplitPanel.setLeftWidget(verticalSplitPanel);
	verticalSplitPanel.setSize("100%", "100%");
	
	Label lblNewLabel = new Label("Visualization");
	lblNewLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	verticalSplitPanel.setTopWidget(lblNewLabel);
	lblNewLabel.setSize("100%", "100%");
	
	Label lblNewLabel_1 = new Label("Options");
	lblNewLabel_1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	verticalSplitPanel.setBottomWidget(lblNewLabel_1);
	lblNewLabel_1.setSize("100%", "100%");
	
	VerticalSplitPanel verticalSplitPanel_1 = new VerticalSplitPanel();
	horizontalSplitPanel.setRightWidget(verticalSplitPanel_1);
	verticalSplitPanel_1.setSize("100%", "100%");
	
	Label lblNewLabel_2 = new Label("Options");
	lblNewLabel_2.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	verticalSplitPanel_1.setBottomWidget(lblNewLabel_2);
	lblNewLabel_2.setSize("100%", "100%");
	
	Label lblDataView = new Label("Data View");
	lblDataView.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	verticalSplitPanel_1.setTopWidget(lblDataView);
	lblDataView.setSize("100%", "100%");
	
    }
}
