package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddNewTeacherPage {


	@FindBy(xpath="//input[@id='bAdd']")
	public WebElement addNewClick;
	
	@FindBy(xpath="//select[@id='jPosAccLev']")
	public WebElement selectJob;
	
	//@FindBy(xpath="//input[@id='tStaffId']")
	//public WebElement localID;
	
	@FindBy(xpath="//input[@id='tStaffStateId']")
	public WebElement stateID;
	
	@FindBy(xpath="//input[@id='cbIncludeToStateReports']")
	public WebElement clickStateReports;
	
	@FindBy(xpath="//select[@id='myTitle_list']")
	public WebElement selectTitle;
	
	@FindBy(xpath="//input[@id='tLastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='tFirstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='tMiddleName']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@id='tFormerName']")
	public WebElement formerName;
	
	@FindBy(xpath="//input[@id='tNameSuffix']")
	public WebElement suffixName;
	
	@FindBy(xpath="//input[@id='tDateofBirth']")
	public WebElement dateBirth;
	
	@FindBy(xpath="//input[@id='tSSN']")
	public WebElement SSN;
	
	@FindBy(xpath="//select[@id='dGender_list']")
	public WebElement selectGender;
	
	@FindBy(xpath="//input[@id='tLicenseCertificationNo']")
	public WebElement licenseCertification;
	
	@FindBy(xpath="//input[@id='tPassword']")
	public WebElement password;
	
	@FindBy(xpath="//select[@id='ddEthnicity_list']")
	public WebElement ethnicity;
	
	@FindBy(xpath="//select[@id='ddRaceNew']")
	public WebElement race;
	
	@FindBy(xpath="//input[@id='tJTitle']")
	public WebElement jobTtile;
	
	@FindBy(xpath="//select[@id='dDepartment_list']")
	public WebElement selectDepartment;
	
	@FindBy(xpath="//select[@id='dAdvisory']")
	public WebElement advisorOf;
	
	@FindBy(xpath="//select[@id='dHomeroom']")
	public WebElement homeRoom;
	
	@FindBy(xpath="//select[@id='dClassroom_list']")
	public WebElement classRoom;
	
	@FindBy(xpath="//input[@id='tAddress']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='tCity']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='state_list']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='tZip']")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@id='tHomePhone']")
	public WebElement homePhone;
	
	@FindBy(xpath="//input[@id='tCellPhone']")
	public WebElement cellPhone;
	
	@FindBy(xpath="//input[@id='tSchoolPhone']")
	public WebElement schoolPhone;
	
	@FindBy(xpath="//input[@id='tSchoolEmail']")
	public WebElement schoolEmail;
	
	@FindBy(xpath="//input[@id='tPersonalEmail']")
	public WebElement personalEmail;
	
	@FindBy(xpath="//input[@id='bSubmit']")
	public WebElement submitChanges;
	

	public AddNewTeacherPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
