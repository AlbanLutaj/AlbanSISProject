package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ValidateTeacherUserLoginPage {
	
	
	@FindBy(xpath="//td[text()='Welcome Mr. Limanaj']")
	public WebElement welcomeMr;
	
	@FindBy(xpath="//*[@id='linkShow']")
	public WebElement clickShow;
	
	@FindBy(xpath="//*[@id='lblStaffId']")
	public WebElement localID;
	
	@FindBy(xpath="//*[@id='lblStaffStateId']")
	public WebElement stateID;
	
	@FindBy(xpath="//*[@id='lblLicenseCertificationNo']")
	public WebElement license;
	
	@FindBy(xpath="//*[@id='lblJobTitle']")
	public WebElement jobTitle;
		
	@FindBy(xpath="//*[@id='lblDepartment']")
	public WebElement department;
	
	@FindBy(xpath="//*[@id='lblAdvisorOf']")
	public WebElement advisorOF;
	
	@FindBy(xpath="//*[@id='lblHomeRoom']")
	public WebElement homeRoom;
	
	@FindBy(xpath="//*[@id='lblRoomNo']")
	public WebElement classRoom;
	
	@FindBy(xpath="//*[@id='lblGender']")
	public WebElement gender;
	
	@FindBy(xpath="//*[@id='lblAddress']")
	public WebElement adress;
	
	@FindBy(xpath="//*[@id='lblHomePhone']")
	public WebElement homePhone;
	
	@FindBy(xpath="//*[@id='lblCellPhone']")
	public WebElement cellPhone;
	
	@FindBy(xpath="//*[@id='lblSchoolEmail']")
	public WebElement schoolEmail;
	
	@FindBy(xpath="//*[@id='lblPersonalEmail']")
	public WebElement personalEmail;
	
	@FindBy(xpath= "//a[text()='Students']")
	public WebElement studentTab;
	

	public ValidateTeacherUserLoginPage ()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
