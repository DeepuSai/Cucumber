package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPage extends FunctionalLibrary{

	public void AddTariffPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="rental1")
	private WebElement MonthlyRental;
	
	@FindBy(id="local_minutes")
	private WebElement LocalMinutes;
	
	@FindBy(id="inter_minutes")
	private WebElement InternMinutes;
	
	@FindBy(id="sms_pack")
	private WebElement Smspack;
	
	@FindBy(id="minutes_charges")
	private WebElement MinutesCharges;
	
	@FindBy(id="inter_charges")
	private WebElement InterCharges;
	
	@FindBy(id="sms_charges")
	private WebElement SmsCharges;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit;

	public WebElement getMonthlyRental() {
		return MonthlyRental;
	}

	public WebElement getLocalMinutes() {
		return LocalMinutes;
	}

	public WebElement getInternMinutes() {
		return InternMinutes;
	}

	public WebElement getSmspack() {
		return Smspack;
	}

	public WebElement getMinutesCharges() {
		return MinutesCharges;
	}

	public WebElement getInterCharges() {
		return InterCharges;
	}

	public WebElement getSmsCharges() {
		return SmsCharges;
	}
	
	public WebElement getSubmitButton() {
		return submit;
	
}
}
