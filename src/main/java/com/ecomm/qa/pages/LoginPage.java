package com.ecomm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.baseClass;

public class LoginPage extends baseClass {

	// Page Factory or Object Repositories
	@FindBy(xpath="(//a[@href='/login'])[3]")
	WebElement loginButton;
	
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement mobileNumberInputField;
	
	@FindBy(xpath="//button[@class='login-registration_submitButton__uL_fo']")
	WebElement nextButton;
	
	@FindBy(xpath="//img[@alt='Hippo Logo Mobile']")
	WebElement ecommImage;
	
	// Initializing the Page Objects.
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions.
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	public boolean validateEcommImage() {
		return ecommImage.isDisplayed();
	}
	public void login(String mobileNumber) {
		
		mobileNumberInputField.sendKeys(mobileNumber);
		nextButton.click();
	}
}
