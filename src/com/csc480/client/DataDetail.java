package com.csc480.client;

import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;

public class DataDetail implements EntryPoint {

    @Override
    public void onModuleLoad() {
	//Sample data
	// Column names
	ArrayList<String> sampleChoices = new ArrayList<String>();
	sampleChoices.add("Column 1");
	sampleChoices.add("Column 2");
	sampleChoices.add("Column 3");
	sampleChoices.add("Column 4");
	sampleChoices.add("Column 5");
	// Data
	ArrayList<Integer> sampleData = new ArrayList<Integer>();
	for (int x = 0; x < 10; x++) {
	    sampleData.add(x);
	}
	// Columns
	//Column<YerValueObject, String> newCol = new Column<YerValueObject, String>
//	Column[] sampleColumns = new Column[sampleChoices.size()];
//	for (int i=0; i<sampleChoices.size(); i++) {
//	    ColumnItem colItem = new ColumnItem();
//	   // Column<sampleChoices[], String> newCol = new Column<YerValueObject, String>
//	}
	
	RootPanel rootPanel = RootPanel.get();
	CellTable<String> cellTable = new CellTable<String>();
	rootPanel.add(cellTable, 111, 10);
	cellTable.setSize("329px", "280px");
	
	ListBox listBox = new ListBox();
	for (String col : sampleChoices) {
	    listBox.addItem(col);
	}
	listBox.addClickHandler(new ClickHandler() {
		public void onClick(ClickEvent event) {
//		    Column col = new Column<String, String>();
//		    String selection = (String) event.getSource();
//		    cellTable.addColumn(col);
		}
	});
	rootPanel.add(listBox, 10, 10);
	listBox.setSize("91px", "276px");
	listBox.setVisibleItemCount(5);
	//Populate toggle button column
    }
    
//    class ColumnItem {
//	private Column col;
//	private String name;
//	
//	public columnItem(String name, Column col) {
//	    this.name = name;
//	    this.col = col;
//	}
//	
//	public Column getColumn() {
//	    return col;
//	}
//	
//	public String toString() {
//	    return name;
//	}
//    }
}
