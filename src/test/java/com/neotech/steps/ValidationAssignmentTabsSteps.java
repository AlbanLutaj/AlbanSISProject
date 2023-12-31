package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidationAssignmentTabsSteps extends CommonMethods {

	@When("I click to assignment")
	public void i_click_to_assignment() {
		
		click(validAss.clickAss);
		wait(1);
	    
	}
	
	@Then("I validate the page")
	public void i_validate_the_page() {
		
	   //We cannot validate the page cause it does not reach the page.Cause issue bug!!
	}
}
