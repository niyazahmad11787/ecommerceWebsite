package com.ecomm.qa.testcases;
import org.testng.Assert;


import com.ecomm.qa.base.*;
import com.ecomm.qa.pages.*;
import com.ecomm.qa.util.otpFunction;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends baseClass {

	LoginPage loginpage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		browserInitialization();
		
		loginpage=new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login | Hippo Homes");
	}
	@Test(priority = 2)
	public void loginPageTest() throws SQLException {
		
		loginpage.login(prop.getProperty("mobile"));
//		String OTP = otpFunction.getOtp();
//		System.out.println(OTP);
	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
		
	}

}
