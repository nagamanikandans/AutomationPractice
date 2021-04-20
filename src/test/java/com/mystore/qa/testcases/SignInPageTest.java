package com.mystore.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.MyAddressPage;
import com.mystore.qa.pages.SignInPage;


public class SignInPageTest extends TestBase {

	SignInPage SignInPage;
	LoginPage LoginPage;
	
	public SignInPageTest() {
		super();
	}
	
	@BeforeSuite
	public void setUp(){
		initialization();
		SignInPage = new SignInPage();
		}
	
	@Test
	public void SignInTest() {
		String Title = SignInPage.validateLoginPageTitle();
		Assert.assertEquals(Title, "My Store");
		boolean logo = SignInPage.validateLogoImage();
		Assert.assertTrue(logo);
		LoginPage = SignInPage.SignIn();
	    boolean SignInbutton = SignInPage.SignInbtnValidation();
	    Assert.assertTrue(SignInbutton);
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
