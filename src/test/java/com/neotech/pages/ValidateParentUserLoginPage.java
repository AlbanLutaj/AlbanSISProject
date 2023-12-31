package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ValidateParentUserLoginPage {
	
	
	@FindBy(xpath= "//*[@id='lAddress']")
	public WebElement adress;
	
	@FindBy(xpath= "//*[@id='lLastName']")
	public WebElement firstName;
	
	@FindBy(xpath= "//*[@id='lHomePhone']")
	public WebElement homePhone;
	
	@FindBy(xpath= "//*[@id='lEmail']")
	public WebElement email;
	
	@FindBy(xpath= "//*[@id='GridStudents_ctl02_lStudentName']")
	public WebElement studentName;
	
	@FindBy(xpath= "//*[@id='GridStudents_ctl02_lStdId']")
	public WebElement studentID;
	
	@FindBy(xpath= "//*[@id='GridStudents_ctl02_lblGradeLevel']")
	public WebElement gradeLevel;
	
	@FindBy(xpath="//*[@id='form1']/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[@background='../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> tabs;
	
	
	

	public ValidateParentUserLoginPage()
	{
	   PageFactory.initElements(BaseClass.driver, this);	
	}
}
