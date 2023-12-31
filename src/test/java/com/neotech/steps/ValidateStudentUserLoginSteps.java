package com.neotech.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ValidateStudentUserLoginSteps extends CommonMethods {

	@Then("I validate student information")
	public void i_validate_student_information() {
		
		
	    
		String actualID = validStudentLogin.studentID.getText();

		String expectedID = "961";

		Assert.assertEquals(expectedID, actualID);
		
		
		String actualName = validStudentLogin.studentName.getText();

		String expectedName = "Lutaj Alban";

		Assert.assertEquals(expectedName, actualName);
		
		
		
		
		String actualGrade = validStudentLogin.gradeSection.getText();

		String expectedGrade = "1st Grade";

		Assert.assertEquals(expectedGrade, actualGrade);
		
		
		
		String actualUsername = validStudentLogin.userName.getText();

		String expectedUsername = "LuAlban";

		Assert.assertEquals(expectedUsername, actualUsername);
		
		
		
	}
}
