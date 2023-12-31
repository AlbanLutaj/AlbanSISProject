package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class AddNewParentPage {
	
	
	@FindBy(xpath="//input[@id='bAddNew']")
	public WebElement addPrimaryParent;
	
	@FindBy(xpath="//select[@id='ppTitle_list']")
	public WebElement titleDrop;
	
	@FindBy(xpath="//input[@id='ppFirstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='ppLastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='ppPassword']")
	public WebElement password;
	
	@FindBy(xpath="//select[@id='ppRelation_list']")
	public WebElement relationList;
	
	@FindBy(xpath="//input[@id='ppAddress']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='ppAddress2']")
	public WebElement address2;
	
	@FindBy(xpath="//input[@id='ppCity']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='ppState_list']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='ppZipCode']")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@id='ppHomePhone']")
	public WebElement homePhone;
	
	@FindBy(xpath="//input[@id='ppWorkPhone']")
	public WebElement workphone;
	
	@FindBy(xpath="//input[@id='ppWorkPhoneExt']")
	public WebElement workphonext;
	
	@FindBy(xpath="//input[@id='ppCellPhone']")
	public WebElement cellphone;
	
	@FindBy(xpath="//input[@id='ppEmail1']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='ppEmail2']")
	public WebElement email2;
	
	@FindBy(xpath="//input[@id='bSave']")
	public WebElement savePrimary;
	
	
	//Secondary parent
	
	@FindBy(xpath="//input[@id='bAddNewSP']")
	public WebElement addSecondaryParent;
	
	@FindBy(xpath="//input[@id='bAddNewSP']")
	public WebElement secTitleDrop;
	
	@FindBy(xpath="//input[@id='spFirstName']")
	public WebElement secfirstName;
	
	@FindBy(xpath="//input[@id='spLastName']")
	public WebElement seclastName;
	
	@FindBy(xpath="//input[@id='spPassword']")
	public WebElement secpassword;
	
	@FindBy(xpath="//select[@id='spRelation_list']")
	public WebElement secRelationList;
	
	@FindBy(xpath="//input[@id='spAddress']")
	public WebElement secaddress;
	
	@FindBy(xpath="//input[@id='spAddress2']")
	public WebElement secaddress2;
	
	@FindBy(xpath="//input[@id='spCity']")
	public WebElement seccity;
	
	@FindBy(xpath="//select[@id='spState_list']")
	public WebElement secstate;
	
	@FindBy(xpath="//input[@id='spZipCode']")
	public WebElement seczipCode;
	
	@FindBy(xpath="//input[@id='spHomePhone']")
	public WebElement sechomePhone;
	
	@FindBy(xpath="//input[@id='spWorkPhone']")
	public WebElement secworkphone;
	
	@FindBy(xpath="//input[@id='spWorkPhoneExt']")
	public WebElement secworkphonext;
	
	@FindBy(xpath="//input[@id='spCellPhone']")
	public WebElement seccellphone;
	
	@FindBy(xpath="//input[@id='spEmail1']")
	public WebElement secemail;
	
	@FindBy(xpath="//input[@id='spEmail2']")
	public WebElement secemail2;
	
	@FindBy(xpath="//input[@id='bSaveSP']")
	public WebElement secsavePrimary;
	

	public AddNewParentPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
