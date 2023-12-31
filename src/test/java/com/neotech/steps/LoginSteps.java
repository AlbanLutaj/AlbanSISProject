package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("I enter username")
	public void i_enter_username() {

		sendText(login.userName, ConfigsReader.getProperty("username"));
		wait(2);
	}

	@When("I enter password")
	public void i_enter_password() {

		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(2);

	}

	@When("I click to Login")
	public void i_click_to_login() {

		click(login.login);
		wait(2);

	}

	@Then("I validate that i logged in")
	public void i_validate_that_i_logged_in() {

		Assert.assertTrue(dashboard.logo.isDisplayed());

	}

	@When("I leave the field empty")
	public void i_leave_the_field_empty() {

		sendText(login.password, "");
		wait(2);

	}

	@Then("I validate that password cannot be empty")
	public void i_validate_that_password_cannot_be_empty() {

		String actual = getAlertText();

		String expected = "Please fill required fields";

		acceptAlert();

		Assert.assertEquals(expected, actual);
	}

	@When("I enter wrong credentials")
	public void i_enter_wrong_credentials() {

		sendText(login.password, "alban");
		wait(2);
	}

	@Then("I validate that password doesnt match")
	public void i_validate_that_password_doesnt_match() {

		String actual = getAlertText();
		String expected = "Either username and password do not match "
				+ "or your account doesn't have  access for the selected Academic Year.";

		acceptAlert();

		Assert.assertEquals(expected, actual);
	}

}
