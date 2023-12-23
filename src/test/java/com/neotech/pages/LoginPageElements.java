package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods{

	@FindBy(xpath="//input[@id='tUsername']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='tPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='bLogin']")
	public WebElement login;
		
	public LoginPageElements()
	{
	   PageFactory.initElements(BaseClass.driver, this);
	  
	}
	
	public void validLogin() 
	{
		sendText(userName,ConfigsReader.getProperty("username"));
		sendText(password,ConfigsReader.getProperty("password"));
		click(login);
		wait(2);
		
	}
	
}
