package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewParentsSteps extends CommonMethods {

	@When("I click to Parental")
	public void i_click_to_parental() {
		
	   click(student.clickParental);
	   wait(2);
	}
	
	@When("I click add primary Parent")
	public void i_click_add_primary_parent() {
		
	   click(addParent.addPrimaryParent);
	   wait(1);
	}
	
	@Then("I fil up the primary parent form and save it")
	public void i_fil_up_the_primary_parent_form_and_save_it() {
		
	    selectDropdown(addParent.titleDrop,"Mr.");
	    wait(1);
	    sendText(addParent.firstName,"Diego");
	    wait(1);
	    sendText(addParent.lastName,"Lutaj");
	    wait(1);
	    sendText(addParent.password,"Neotech");
	    wait(1);
	    selectDropdown(addParent.relationList,"Father");
	    wait(1);
	    sendText(addParent.address,"Via Roma");
	    wait(1);
	    sendText(addParent.address2,"Via Padava");
	    wait(1);
	    sendText(addParent.city,"Firenze");
	    wait(1);
	    selectDropdown(addParent.state,"AL");
	    wait(1);
	    sendText(addParent.zipCode,"50013");
	    wait(1);
	    sendText(addParent.homePhone,"055-131517");
	    wait(1);
	    sendText(addParent.workphone,"3384596745");
	    wait(1);
	    sendText(addParent.workphonext,"123");
	    wait(1);
	    sendText(addParent.cellphone,"328745126");
	    wait(1);
	    sendText(addParent.email,"diego@gmail.com");
	    wait(1);
	    sendText(addParent.email2,"pablo@gmail.com");
	    wait(1);
	    click(addParent.savePrimary);
	    wait(2);
	
	    
	}
	
	@Then("I click add secondary Parent")
	public void i_click_add_secondary_parent() {
		
		click(addParent.addSecondaryParent);
		   wait(1);
	}
	
	@Then("I fill up the secondary parent form and save it")
	public void i_fill_up_the_secondary_parent_form_and_save_it() {
		
		selectDropdown(addParent.secTitleDrop,"Mrs.");
	    wait(1);
	    sendText(addParent.secfirstName,"Maria");
	    wait(1);
	    sendText(addParent.seclastName,"Lutaj");
	    wait(1);
	    sendText(addParent.secpassword,"Neotech");
	    wait(1);
	    selectDropdown(addParent.secRelationList,"Mother");
	    wait(1);
	    sendText(addParent.secaddress,"Via Roma");
	    wait(1);
	    sendText(addParent.secaddress2,"Via Padava");
	    wait(1);
	    sendText(addParent.seccity,"Firenze");
	    wait(1);
	    selectDropdown(addParent.secstate,"AL");
	    wait(1);
	    sendText(addParent.seczipCode,"50013");
	    wait(1);
	    sendText(addParent.sechomePhone,"055-156848");
	    wait(1);
	    sendText(addParent.secworkphone,"3384596745");
	    wait(1);
	    sendText(addParent.secworkphonext,"123");
	    wait(1);
	    sendText(addParent.seccellphone,"328745126");
	    wait(1);
	    sendText(addParent.secemail,"maria@gmail.com");
	    wait(1);
	    sendText(addParent.secemail2,"carmela@gmail.com");
	    wait(1);
	    click(addParent.secsavePrimary);
	    
	}
	

}
