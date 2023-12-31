package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ValidateAssignmentTabsPage {
	
	@FindBy(xpath="//a[text()='Assignments']")
	public WebElement clickAss;

	
	public ValidateAssignmentTabsPage()
	{
	   PageFactory.initElements(BaseClass.driver, this);	
	}
}
