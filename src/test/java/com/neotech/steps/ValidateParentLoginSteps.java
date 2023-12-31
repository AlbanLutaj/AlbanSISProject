package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class ValidateParentLoginSteps extends CommonMethods {

	@Then("I validate parent information")
	public void i_validate_parent_information(DataTable dataTable) {

		List<String> expectedTabs = dataTable.asList();

		List<String> actualTabs = new ArrayList<>();

		for (WebElement el : validParentLogin.tabs) {
			actualTabs.add(el.getText().trim());
		}

		Assert.assertEquals(expectedTabs, actualTabs);
		
		
		String actualName = validParentLogin.firstName.getText();

		String expectedName = "Lutaj".trim();

		Assert.assertEquals(expectedName, actualName);
		
		
		String actualAdress = validParentLogin.adress.getText();

		String expectedAdress = "Via Roma Via Padava AL, 50013".trim();

		Assert.assertEquals(expectedAdress, actualAdress);
		
		
		
		String actualPhone = validParentLogin.homePhone.getText();

		String expectedPhone = "055-156848".trim();

		Assert.assertEquals(expectedPhone, actualPhone);
		
		
		
		String actualEmail = validParentLogin.email.getText();

		String expectedEmail = "maria@gmail.com, carmela@gmail.com".trim();

		Assert.assertEquals(expectedEmail, actualEmail);
		
		
		String actualID = validParentLogin.studentID.getText();

		String expectedID = "961".trim();

		Assert.assertEquals(expectedID, actualID);
		
		
		
		String actualStudentName = validParentLogin.studentName.getText();

		String expectedStudentName = "Lutaj Alban".trim();

		Assert.assertEquals(expectedStudentName, actualStudentName);
		
		
		
		String actualGrade = validParentLogin.gradeLevel.getText();

		String expectedGrade = "1".trim();

		Assert.assertEquals(expectedGrade, actualGrade);


	}

}
