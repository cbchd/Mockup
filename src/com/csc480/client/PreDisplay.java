package com.csc480.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;
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
	rootPanel.add(horizontalSplitPanel);
	rootPanel.addStyleName("darkBG");
	horizontalSplitPanel.setSize("100%", Window.getClientHeight()-20 + "px");
	horizontalSplitPanel.setSplitPosition("20%");
	
	VerticalPanel leftPanel = new VerticalPanel();
	leftPanel.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
	leftPanel.setSize("100%", "100%");
	leftPanel.setSpacing(15);
	leftPanel.addStyleName("blueBG");
	
	leftPanel.add(new Label("Options"));
	leftPanel.add(new Button("Button 1"));
	leftPanel.add(new Button("Button 2"));
	leftPanel.add(new CheckBox("Checkbox 1"));
	leftPanel.add(new CheckBox("Checkbox 2"));
	leftPanel.add(new RadioButton("Radio 1"));
	leftPanel.add(new RadioButton("Radio 2"));
	TextBox textBox1 = new TextBox(),textBox2 = new TextBox();
	textBox1.setValue("Textbox 1");
	textBox2.setValue("Textbox 2");
	leftPanel.add(textBox1);
	leftPanel.add(textBox2);
	leftPanel.add(new DatePicker());
	
	horizontalSplitPanel.setLeftWidget(leftPanel);
	
//	lblNewLabel.setSize("212px", "40px");
	
	VerticalPanel rightPanel = new VerticalPanel();
	rightPanel.setSpacing(15);
	rightPanel.setSize("100%", "100%");
	rightPanel.addStyleName("yellowBG");
	
	Label lblNewLabel_1 = new Label("Visualization\r\n");
	lblNewLabel_1.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
	rightPanel.add(lblNewLabel_1);
	
	horizontalSplitPanel.setRightWidget(rightPanel);
//	lblNewLabel_1.setSize("208px", "34px");
	
	Button btnVisualizationData = new Button("Visualization + Data View");
	btnVisualizationData.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("VisPlusData");
		}
	});
//	rootPanel.add(btnVisualizationData, 256, 263);
	leftPanel.add(btnVisualizationData);
	
	Button btnNewButton = new Button("Data Detail");
	btnNewButton.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
		    rootPanel.clear();
		    Mockup.controller("DataDetail");
		}
	});
	btnNewButton.setText("Data Detail");
//	rootPanel.add(btnNewButton, 32, 263);
	leftPanel.add(btnNewButton);
	btnNewButton.setSize("180px", "30px");
    }
}
