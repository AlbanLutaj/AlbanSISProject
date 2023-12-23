package com.neotech.testbase;

import com.neotech.pages.AddNewStudentPage;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.StudentPageElements;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	
	public static DashboardPageElements dashboard;
	
	public static StudentPageElements student;
	
	public static AddNewStudentPage addNew;
	

	public static void initialize() {
		
		login = new LoginPageElements();
		
		dashboard = new DashboardPageElements();
		
		student = new StudentPageElements();
		
		addNew = new AddNewStudentPage();
		
	}
}
