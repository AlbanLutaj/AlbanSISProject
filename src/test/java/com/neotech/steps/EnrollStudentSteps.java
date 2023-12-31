package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnrollStudentSteps extends CommonMethods {

	@When("I select new as status and send the name of the new student")
	public void i_select_new_as_status_and_send_the_name_of_the_new_student() {	
		

	
	   
	   selectDropdown(student.statusDropdown, "Enrolled");
	   wait(1);
	   
	   selectDropdown(student.clickStudent, "Alban Lutaj");
	   wait(1);   
	   
	   /*sendText(student.searchText,"Alban Lutaj");
	   wait(2);
	   //WebElement el = student.searchText;
	   //el.sendKeys(Keys.ENTER); 
	   jsClick(student.clickSearch);
	   //waitForClickability(student.clickSearch);
	   wait(1);*/
	   
	}
	
	@When("I click the enroll")
	public void i_click_the_enroll() {
		
	    click(student.clickEnroll);
	    wait(2);
	    
	    
	    click(student.saveEnroll);
	}
	
	@Then("I verity the status of enrollment")
	public void i_verity_the_status_of_enrollment() {
		
	   List<WebElement> list = student.checkEnroll;
	   
	   for(WebElement el : list) 
	   {
		   String text = el.getText().trim();
		   if(text.contains("Alban Inter Lutaj")) 
		   {
			   Assert.assertTrue(true);
		   }
		   else 
		   {
			   Assert.assertTrue(false);
		   }
	   }
	}



	
}
