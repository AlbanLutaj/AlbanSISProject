package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentSteps extends CommonMethods {

	
	@When("I click to the Students Tab")
	public void i_click_to_the_students_tab() {
		
	click(dashboard.student);
	    
	}
	@Then("I validate all the tabs in student page")
	public void i_validate_all_the_tabs_in_student_page(DataTable dataTable) {
	  
	    
	    List<String> expectedTabs = dataTable.asList();
	    
	    List<String> actualTabs = new ArrayList<>();
	    
	    
	    for (WebElement el : student.tabs) 
	    {
	    	actualTabs.add(el.getText().trim());
	    }
	    
	    Assert.assertEquals(expectedTabs, actualTabs);
	}


}
