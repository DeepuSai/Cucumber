package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;


	public class AddCustomerPage extends FunctionalLibrary {
		
		public AddCustomerPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//label[@for='done']")
		private WebElement doneButton;
		
		@FindBy(id="fname")
		private WebElement fName;
		
		@FindBy(id="lname")
		private WebElement lName;
		
		@FindBy(id="email")
		private WebElement mail;
		
		@FindBy(name="addr")
		private WebElement address;
		
		@FindBy(name="telephoneno")
		private WebElement phno;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement submitButton;

		public WebElement getDoneButton() {
			return doneButton;
		}

		public WebElement getfName() {
			return fName;
		}

		public WebElement getlName() {
			return lName;
		}

		public WebElement getMail() {
			return mail;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getPhno() {
			return phno;
		}

		public WebElement getSubmitButton() {
			return submitButton;
		}
		
}
