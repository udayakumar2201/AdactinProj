package com.adactin.stepdefintion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ToolsStepDefintion {
	WebDriver driver;

	@Given("^user is on demoQA Home Page$")
	public void user_is_on_demoQA_Home_Page() {
	System.out.println("1");
	}

	@Given("^user navigates to textbox page$")
	public void user_navigates_to_textbox_page() {
		System.out.println("2");

	}

	@When("^user enters full name and email$")
	public void user_enters_full_name_and_email() {
		System.out.println("3");
	}

	@And("^user enters current address and permanent address$")
	public void user_enters_current_address_and_permanent_address() {
		System.out.println("4");
	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() {
		System.out.println("5");
	}

	@Then("^validate correct name is displayed$")
	public void validate_correct_name_is_displayed() {
		System.out.println("6");
	}
	@Given("^user navigates to radio button page$")
	public void user_navigates_to_radio_button_page() {

	
		System.out.println("7");
		}

	@When("^user click on Yes radio$")
	public void user_click_on_Yes_radio() {
	
		System.out.println("8");
	}

	@Then("^validate yes radio is selected$")
	public void validate_yes_radio_is_selected() {
	
		System.out.println("9");
		
	}

}