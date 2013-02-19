package com.csc480.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class DataDetail {

	List<Selection> selections = new ArrayList<Selection>();

	// Widgets
	HorizontalPanel panel;
	CellTable<Selection> ctSelector;
	CellTable<String> ctData;

	// Sample data
	private static final String[] SAMPLE_COLS = { "Column 1", "Column 2",
			"Column 3", "Column 4", "Column 5" };
	private static final String[] SAMPLE_DATA = { "Data point A",
			"Data point B", "Data point C", "Data point D", "Data point E",
			"Data point F", "Data point G", "Data point H", "Datapoint I" };

	public void onModuleLoad() {

		initPanel();
		initSelector();
		initDataTable();
		
		// Create selections and add them to selector table
		for (String s : SAMPLE_COLS)
			selections.add(createSelection(s));
		ctSelector.setRowData(selections);
		
		// Set data for data table
		ctData.setRowData(0, Arrays.asList(SAMPLE_DATA));
	}
	
	private void initPanel() {
		panel = new HorizontalPanel();
		panel.setSize("100%", "100%");
		panel.setSpacing(10);
		panel.setHorizontalAlignment(HorizontalPanel.ALIGN_LEFT);
		panel.getElement().setId("dataViewPanel");
		RootPanel.get().addStyleName("darkBG");
		RootPanel.get().add(panel);
	}

	private void initSelector() {
		ctSelector = new CellTable<Selection>();
		ctSelector.setSize("100%", "auto");
		
		// Set up column
		Column<Selection, String> col = new Column<Selection, String>(
				new ButtonCell()) {
			@Override
			public String getValue(Selection object) {
				return object.toString();
			}
		};
		col.setFieldUpdater(new FieldUpdater<Selection, String>() {
			@Override
			public void update(int index, Selection object, String value) {
				int colIndex = ctData.getColumnIndex(object.getColumn());
				if(colIndex == -1)
					ctData.addColumn(object.getColumn(), object.toString());
				else
					ctData.removeColumn(colIndex);
			}
		});
		ctSelector.addColumn(col);

		ctSelector.getElement().setId("selectorTable");
		VerticalPanel selectorPanel = new VerticalPanel();
		selectorPanel.setSize("200px", "100%");
		selectorPanel.getElement().setId("selectorPanel");
		selectorPanel.add(ctSelector);
		panel.add(selectorPanel);
		panel.setCellWidth(selectorPanel, "200px");
	}
	
	private void initDataTable() {
		ctData = new CellTable<String>();
		ctData.setSize("100%", Window.getClientHeight()-40 + "px");
		ctData.getElement().setId("dataTable");
		panel.add(ctData);
	}

	private Selection createSelection(String name) {
		TextColumn<String> col = new TextColumn<String>() {
			@Override
			public String getValue(String object) {
				return object;
			}
		};
		return new Selection(name, col);
	}

	class Selection {
		private TextColumn<String> col;
		private String name;

		public Selection(String name, TextColumn<String> col) {
			this.name = name;
			this.col = col;
		}

		public TextColumn<String> getColumn() {
			return col;
		}

		public String toString() {
			return name;
		}
	}
}
