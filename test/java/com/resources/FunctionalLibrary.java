package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionalLibrary {
	public static WebDriver driver;
	 
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAVI KUMAR\\eclipse-workspace\\AddCustomerOneList\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}
	
	public void type(WebElement ele,String name) {
		
		ele.sendKeys(name);

	}
	
	public void button(WebElement ele) {
		
		ele.click();

	}
	
	public void action(WebElement ele1,WebElement ele2) {

           Actions acc=new Actions(driver);
           acc.contextClick(ele1).perform();
           acc.dragAndDrop(ele1, ele2).perform();
          

	}
	


}
