package com.stepdefinition;





import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomersteps {
static WebDriver driver;
	@Given("User in telecom home page")
	public void user_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

//	@Given("User click on Add customer option")
//	public void user_click_on_Add_customer_option() {
//	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
//	}

//	@When("User fill all the fields")
//	public void user_fill_all_the_fields() {
//	    driver.findElement(By.xpath("//label[@for='done']")).click();
//	    driver.findElement(By.id("fname")).sendKeys("deepak");
//	    driver.findElement(By.id("lname")).sendKeys("jayaraam");
//	    driver.findElement(By.id("email")).sendKeys("deepak@gmail.com");
//	    driver.findElement(By.name("addr")).sendKeys("OMR");
//	    driver.findElement(By.id("telephoneno")).sendKeys("12345678");
//	}
	
//	@When("User fill all the fields.")
//	public void user_fill_all_the_fields(DataTable dataTable) {
//	    List<String> asList = dataTable.asList(String.class);
//	    driver.findElement(By.xpath("//label[@for='done']")).click();
//	    driver.findElement(By.id("fname")).sendKeys(asList.get(0));
//	    driver.findElement(By.id("lname")).sendKeys(asList.get(1));
//	    driver.findElement(By.id("email")).sendKeys(asList.get(2));
//	    driver.findElement(By.name("addr")).sendKeys(asList.get(3));
//	    driver.findElement(By.id("telephoneno")).sendKeys(asList.get(4));
//	    
//	}
//
//
//	@When("User click on submit button")
//	public void user_click_on_submit_button() {
//	    driver.findElement(By.xpath("//input[@type='submit']")).click();
//	}
//
//	@Then("User is generated with customer id")
	public void user_is_generated_with_customer_id() {
	    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}
	
	@Given("User click on Add Tariff Plan")
	public void user_click_on_Add_Tariff_Plan() {
	    driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")).click();
	}

	@When("User fill all the fields{string},{string},{string},{string},{string},{string},{string}")
	public void user_fill_all_the_fields(String A, String B, String C, String D, String E, String F, String G) {
	    driver.findElement(By.id("rental1")).sendKeys(A);
	    driver.findElement(By.id("local_minutes")).sendKeys(B);
	    driver.findElement(By.id("inter_minutes")).sendKeys(C);
	    driver.findElement(By.id("sms_pack")).sendKeys(D);
	    driver.findElement(By.id("minutes_charges")).sendKeys(E);
	    driver.findElement(By.id("inter_charges")).sendKeys(F);
	    driver.findElement(By.id("sms_charges")).sendKeys(G);
	}

	@When("User click on Submit button")
	public void user_click_on_Submit_button() {
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("User will be added with tariff plan")
	public void user_will_be_added_with_tariff_plan() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
	}

	
	

}
