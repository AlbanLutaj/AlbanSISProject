package com.neotech.testbase;

import com.neotech.pages.AddNewParentPage;
import com.neotech.pages.AddNewStudentPage;
import com.neotech.pages.AddNewTeacherPage;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.StudentPageElements;
import com.neotech.pages.ValidateAssignmentTabsPage;
import com.neotech.pages.ValidateParentUserLoginPage;
import com.neotech.pages.ValidateStudentUserLoginPage;
import com.neotech.pages.ValidateTeacherUserLoginPage;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login;
	
	public static DashboardPageElements dashboard;
	
	public static StudentPageElements student;
	
	public static AddNewStudentPage addNew;
	
	public static AddNewParentPage addParent;
	
	public static AddNewTeacherPage addTeacher;
	
	public static ValidateAssignmentTabsPage validAss;
	
	public static ValidateParentUserLoginPage validParentLogin;
	
	public static ValidateTeacherUserLoginPage validTeacherLogin;
	
	public static ValidateStudentUserLoginPage validStudentLogin;

	public static void initialize() {
		
		login = new LoginPageElements();
		
		dashboard = new DashboardPageElements();
		
		student = new StudentPageElements();
		
		addNew = new AddNewStudentPage();
		
		addParent = new AddNewParentPage();
		
		addTeacher = new AddNewTeacherPage();
		
		validAss = new ValidateAssignmentTabsPage();
		
		validParentLogin = new ValidateParentUserLoginPage();
		
		validTeacherLogin = new ValidateTeacherUserLoginPage();
		
		validStudentLogin = new ValidateStudentUserLoginPage();
		
	}
}
