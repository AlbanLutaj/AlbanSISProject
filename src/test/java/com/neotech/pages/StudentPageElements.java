package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StudentPageElements {

	@FindBy(xpath="//*[@id=\"form1\"]/script[12]/following-sibling::table//td[@background=\"../../Common/themes/Blue/mBg.jpg\"]")
	public List<WebElement> tabs;
	
	@FindBy(xpath="//input[@id='bAdd']")
	public WebElement addnew;
	
	@FindBy(id="studentStatus_list")
	public WebElement statusDropdown;
	
	@FindBy(id="AutoCompleteStudentName_tStudentName")
	public WebElement searchText;
	
	@FindBy(id="bStatusChange")
	public WebElement clickEnroll;
	
	@FindBy(id="bEnroll")
	public WebElement saveEnroll;
	
	@FindBy(id="students_students")
	public List<WebElement>checkEnroll;
	
	@FindBy(xpath="//div[@id='divUnenroll']")
	public WebElement getWindowHandle;

	
	public StudentPageElements()
	{
	   PageFactory.initElements(BaseClass.driver, this);	
	}
}
