package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewStudentSteps extends CommonMethods {

	@When("I click on Add Student")
	public void i_click_on_add_student() {

		click(student.addnew);
		wait(1);

	}

	@When("I filed up all the section except local id, grade section, and username")
	public void i_filed_up_all_the_section_except_local_id_grade_section_and_username() {
		
		sendText(addNew.stateId,"MD");
		wait(1);
		sendText(addNew.lastName,"Alban");
		wait(1);
		sendText(addNew.firstName,"Lutaj");
		wait(1);
		sendText(addNew.middleName,"Ronaldo");
		wait(1);
		sendText(addNew.suffix,"mr");
		wait(1);
		sendText(addNew.ssn,"331-36-4664");
		wait(1);
		sendText(addNew.email,"alban@gmail.com");
		wait(1);
		sendText(addNew.birthDay,"12/05/1990");
		wait(1);
		selectDropdown(addNew.genderListdropdown,"Male");
		wait(1);
		selectDropdown(addNew.luchTypeDropdown,"Free");
		wait(1);
		selectDropdown(addNew.ethnicityDropdown,"Hispanic or Latino");
		wait(1);
		click(addNew.dropdownButton);
		click(addNew.BoR);
		wait(1);
		sendText(addNew.label,"100");
		wait(1);
		click(addNew.submitButton);
		wait(2);
		
	

		
	}

	@Then("i Validate success message displayed indicating student is created")
	public void i_validate_success_message_displayed_indicating_student_is_created() {

		String actual = getAlertText().trim();

		String expected = "Successfully Added";

		acceptAlert();

		Assert.assertEquals(expected, actual);

	}

}
