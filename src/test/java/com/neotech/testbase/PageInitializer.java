package com.neotech.testbase;

import com.neotech.pages.AddEmployeePageElements;

public class PageInitializer extends BaseClass {
	
	public static AddEmployeePageElements addEmployee;
	

	public static void initialize() {
		
		addEmployee = new AddEmployeePageElements();
		
	}
}
