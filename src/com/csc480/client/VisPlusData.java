package com.csc480.client;

import java.util.Arrays;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.VerticalSplitPanel;
import com.google.gwt.user.client.ui.NumberLabel;

public class VisPlusData implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();

		HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();
		rootPanel.add(horizontalSplitPanel);
		horizontalSplitPanel.setSize("100%", Window.getClientHeight() - 20
				+ "px");

		// Visualization

		VerticalSplitPanel verticalSplitPanel = new VerticalSplitPanel();
		verticalSplitPanel.setSize("100%", "100%");
		verticalSplitPanel.setSplitPosition("80%");
		horizontalSplitPanel.setLeftWidget(verticalSplitPanel);

		Label lblNewLabel = new Label("Visualization");
		lblNewLabel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		verticalSplitPanel.setTopWidget(lblNewLabel);
		lblNewLabel.setSize("100%", "100%");
		lblNewLabel.addStyleName("yellowBG");

		// Visualization options

		HorizontalPanel vizOptPanel = new HorizontalPanel();
		vizOptPanel.setSize("100%", "100%");
		vizOptPanel.addStyleName("blueBG");
		vizOptPanel.setVerticalAlignment(HorizontalPanel.ALIGN_MIDDLE);

		Label lblNewLabel_1 = new Label("Options");
		lblNewLabel_1
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblNewLabel_1.setSize("100%", "100%");

		vizOptPanel.add(lblNewLabel_1);
		vizOptPanel.add(new Button("Button 1"));
		vizOptPanel.add(new Button("Button 2"));
		vizOptPanel.add(new Button("Button 3"));
		vizOptPanel.add(new Button("Button 4"));
		vizOptPanel.add(new Button("Button 5"));
		verticalSplitPanel.setBottomWidget(vizOptPanel);

		// Data view
		VerticalSplitPanel verticalSplitPanel_1 = new VerticalSplitPanel();
		horizontalSplitPanel.setRightWidget(verticalSplitPanel_1);
		verticalSplitPanel_1.setSplitPosition("80%");
		verticalSplitPanel_1.setSize("100%", "100%");
		VerticalPanel dataPanel = new VerticalPanel();
		dataPanel.setSize("100%", "100%");
		dataPanel.addStyleName("greenBG");

		Label lblDataView = new Label("Data View");
		lblDataView.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblDataView.setSize("100%", "100%");

		CellTable<String> table = new CellTable<String>();
		for (int i = 0; i < 5; i++)
			table.addColumn(new TextColumn<String>() {
				@Override
				public String getValue(String object) {
					return object;
				}
			}, "Column " + i);
		table.setRowData(Arrays.asList(new String[] { "Data1", "Data2",
				"Data3", "Data4", "Data5", "Data6", "Data7", "Data8", "Data9",
				"Data10", "Data11", "Data12", "Data13", "Data14", "Data15" }));
		table.setSize("100%", "100%");

		dataPanel.add(lblDataView);
		dataPanel.add(table);
		verticalSplitPanel_1.setTopWidget(dataPanel);

		// Data view options
		
		HorizontalPanel dataOptPanel = new HorizontalPanel();
		dataOptPanel.setSize("100%", "100%");
		dataOptPanel.addStyleName("blueBG");
		dataOptPanel.setVerticalAlignment(HorizontalPanel.ALIGN_MIDDLE);

		Label lblNewLabel_2 = new Label("Options");
		lblNewLabel_2
				.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblNewLabel_2.setSize("100%", "100%");
		
		dataOptPanel.add(lblNewLabel_2);
		dataOptPanel.add(new Button("Button 1"));
		dataOptPanel.add(new Button("Button 2"));
		dataOptPanel.add(new Button("Button 3"));
		dataOptPanel.add(new Button("Button 4"));
		dataOptPanel.add(new Button("Button 5"));
		verticalSplitPanel_1.setBottomWidget(dataOptPanel);

	}
}
