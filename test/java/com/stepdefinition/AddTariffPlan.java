package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;

import com.objectrepository.AddTariffPage;
import com.objectrepository.Homepage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddTariffPlan extends FunctionalLibrary{

	@Given("User click on Add Tariff Plan")
	public void user_click_on_Add_Tariff_Plan() {
	    Homepage page = new Homepage();
	    button(page.getAddTariffButton());
	}

	@When("User fill all the fields")
	public void user_fill_all_the_fields(DataTable custable) {
		List<List<String>> asLists = custable.asLists(String.class);
		AddTariffPage page = new AddTariffPage();
		type(page.getMonthlyRental(),asLists.get(0).get(0));
		type(page.getLocalMinutes(),asLists.get(0).get(1));
		type(page.getInternMinutes(),asLists.get(0).get(2));
		type(page.getSmspack(),asLists.get(0).get(3));
		type(page.getMinutesCharges(),asLists.get(0).get(4));
		type(page.getInterCharges(),asLists.get(0).get(5));
		type(page.getSmsCharges(),asLists.get(0).get(6));
	    
	}

	@When("User click on Submit button")
	public void user_click_on_Submit_button() {
	    AddTariffPage page = new AddTariffPage();
	    button(page.getSubmitButton());
	}

	@Then("User will be added with tariff plan")
	public void user_will_be_added_with_tariff_plan() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}


}
