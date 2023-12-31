
package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewTeacherSteps extends CommonMethods {

	@When("I click to Staff\\/Faculty")
	public void i_click_to_staff_faculty() {
		
		click(dashboard.staffClick);
		wait(1);
	}

	@When("I click Add New")
	public void i_click_add_new() {
		
		click(addTeacher.addNewClick);
		wait(1);
	}

	@When("I select Job Position annd Access Level")
	public void i_select_job_position_annd_access_level() {
		
		selectDropdown(addTeacher.selectJob, "Teacher/Teacher" );
	}

	@Then("I fill up the form")
	public void i_fill_up_the_form() {
		
		sendText(addTeacher.stateID,"ALB123");
		wait(1);
		click(addTeacher.clickStateReports);
		wait(1);	
		selectDropdown(addTeacher.selectTitle,"Mr.");
		wait(1);
		sendText(addTeacher.lastName,"Limanaj");
		wait(1);
		sendText(addTeacher.firstName,"Elion");
		wait(1);
		sendText(addTeacher.middleName,"Obama");
		wait(1);
		sendText(addTeacher.formerName,"Trump");
		wait(1);
		sendText(addTeacher.suffixName,"Milan");
		wait(1);
		//sendText(addTeacher.dateBirth,"12-05-1979");
		//wait(1);
		//sendText(addTeacher.SSN,"123456");
		//wait(1);
		selectDropdown(addTeacher.selectGender,"Male");
		wait(1);
		sendText(addTeacher.licenseCertification,"EL-12390");
		wait(1);
		sendText(addTeacher.password,"Neotech");
		wait(1);
		selectDropdown(addTeacher.ethnicity,"Not Hispanic or Latino");
		wait(1);
		selectDropdown(addTeacher.race,"White");
		wait(1);
		sendText(addTeacher.jobTtile,"Developers");
		wait(1);
		selectDropdown(addTeacher.selectDepartment,"Mathematics");
		wait(1);
		selectDropdown(addTeacher.advisorOf,"3rd Grade");
		wait(1);
		selectDropdown(addTeacher.homeRoom,"3rd Grade");
		wait(1);
		selectDropdown(addTeacher.classRoom,"3rd Grade");
		wait(1);
		sendText(addTeacher.address,"via roma");
		wait(1);
		sendText(addTeacher.city,"Roma");
		wait(1);
		selectDropdown(addTeacher.state,"AL");
		wait(1);
		sendText(addTeacher.zipCode,"50013");
		wait(1);
		sendText(addTeacher.homePhone,"055-2345869");
		wait(1);
		sendText(addTeacher.cellPhone,"345-49059604");
		wait(1);
		sendText(addTeacher.schoolPhone,"055-2345");
		wait(1);
		sendText(addTeacher.schoolEmail,"neotech@gmail.com");
		wait(1);
		sendText(addTeacher.personalEmail,"elion@gmail.com");
		wait(1);
		click(addTeacher.submitChanges);
		wait(1);
		
	
	}

}
