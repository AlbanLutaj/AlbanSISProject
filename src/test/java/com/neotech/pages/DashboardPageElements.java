package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	
	@FindBy(xpath="//img[@id='Header1_imgSchoolLogo']")
	public WebElement logo;
	
	@FindBy(xpath= "//*[@id=\"form1\"]/table[3]/tbody/tr/td[2]/table")
	public WebElement announcment;
	
	@FindBy(xpath="//a[text()= 'Students']")
	public WebElement student;
	
	
	public DashboardPageElements()
	{
	   PageFactory.initElements(BaseClass.driver, this);	
	}
}
