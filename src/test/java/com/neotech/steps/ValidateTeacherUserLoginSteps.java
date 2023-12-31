package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ValidateTeacherUserLoginSteps extends CommonMethods {

	
	@Then("I validate teacher information")
	public void i_validate_teacher_information() {
	   
		Assert.assertTrue(validTeacherLogin.studentTab.isDisplayed());
		
		click(validTeacherLogin.clickShow);
		wait(1);
		
		String actualID = validTeacherLogin.localID.getText();
		String expectedID = "1229";
		Assert.assertEquals(expectedID, actualID);
		
		String actualStateID = validTeacherLogin.stateID.getText();
		String expectedStateID = "ALB123";
		Assert.assertEquals(expectedStateID, actualStateID);
		
		String actualLicense = validTeacherLogin.license.getText();
		String expectedLicense = "EL-12390";
		Assert.assertEquals(expectedLicense, actualLicense);
		
		String actualjobTitle = validTeacherLogin.jobTitle.getText();
		String expectedjobTitle = "Developers";
		Assert.assertEquals(expectedjobTitle, actualjobTitle);
		
		String actualDepartment = validTeacherLogin.department.getText();
		String expectedDepartment = "Mathematics";
		Assert.assertEquals(expectedDepartment, actualDepartment);
		
		String actualHomeRoom = validTeacherLogin.homeRoom.getText();
		String expectedHomeRoom = "3rd Grade";
		Assert.assertEquals(expectedHomeRoom, actualHomeRoom);
		
		String actualGender = validTeacherLogin.gender.getText();
		String expectedGender = "Male";
		Assert.assertEquals(expectedGender, actualGender);
				
		String actualAdress = validTeacherLogin.adress.getText();
		String expectedAdress = "via roma, Roma, AL 50013";
		Assert.assertEquals(expectedAdress, actualAdress);
		
		String actualCellPhone = validTeacherLogin.cellPhone.getText();
		String expectedCellPhone = "345-49059604";
		Assert.assertEquals(expectedCellPhone, actualCellPhone);
		
		String actualSchoolEmail = validTeacherLogin.schoolEmail.getText();
		String expectedSchoolEmail = "neotech@gmail.com";
		Assert.assertEquals(expectedSchoolEmail, actualSchoolEmail);
	
		String actualPersonalEmail = validTeacherLogin.personalEmail.getText();
		String expectedPersonalEmail = "elion@gmail.com";
		Assert.assertEquals(expectedPersonalEmail, actualPersonalEmail);
		
		Assert.assertTrue(validTeacherLogin.studentTab.isDisplayed());
	}


}
