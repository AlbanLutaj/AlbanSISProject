package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends CommonMethods {

	
	@When("I logged in")
	public void i_logged_in() {
	   
		login.validLogin();
		
	}
	
	@Then("I validate the Announcment section i visible")
	public void i_validate_the_announcment_section_i_visible() {
	   
		Assert.assertTrue(dashboard.announcment.isDisplayed());
	}
	
	@Then("I validate the url includes the {string} extension")
	public void i_validate_the_url_includes_the_extension(String extension) {
	    
		String url = driver.getCurrentUrl();
		
		Boolean contains = url.contains(extension);
		
		Assert.assertTrue(contains);
		
	}



}
