package com.stepdefinition;





import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomersteps {
static WebDriver driver;
	@Given("User in telecom home page")
	public void user_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("User click on Add customer option")
	public void user_click_on_Add_customer_option() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User fill all the fields")
	public void user_fill_all_the_fields() {
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("deepak");
	    driver.findElement(By.id("lname")).sendKeys("jayaraam");
	    driver.findElement(By.id("email")).sendKeys("deepak@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("OMR");
	    driver.findElement(By.id("telephoneno")).sendKeys("12345678");
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User is generated with customer id")
	public void user_is_generated_with_customer_id() {
	    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


}
