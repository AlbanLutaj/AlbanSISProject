package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ValidateStudentUserLoginPage {
	
	@FindBy(xpath= "//*[@id='lStudentID']")
	public WebElement studentID;
	
	@FindBy(xpath= "//*[@id='lStdName']")
	public WebElement studentName;
	
	@FindBy(xpath= "//*[@id='lGrdSec']")
	public WebElement gradeSection;
	
	@FindBy(xpath= "//*[@id='lUserName']")
	public WebElement userName;
	
	public ValidateStudentUserLoginPage ()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
