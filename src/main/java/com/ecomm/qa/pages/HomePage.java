package com.ecomm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecomm.qa.base.baseClass;

public class HomePage extends baseClass{

	
	@FindBy(xpath="//span[contains(text(),'Categories')]")
	WebElement categories;
	
	@FindBy(xpath="//span[contains(text(),'Home Solutions')]")
	WebElement homeSolutions;
	
	@FindBy(xpath="//span[contains(text(),'Knowledge Portal')]")
	WebElement knowledgePortal;
	
	@FindBy(xpath="//span[contains(text(),'Calculators')]")
	WebElement calculators;
	
	@FindBy(xpath="//span[contains(text(),'OUR BRANDS')]")
	WebElement ourBrands;
	
	@FindBy(xpath="//span[contains(text(),'SHOP BY ROOM')]")
	WebElement shopByRoom;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}

