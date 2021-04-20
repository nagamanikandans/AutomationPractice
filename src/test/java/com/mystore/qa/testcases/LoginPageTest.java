package com.mystore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.SignInPage;

public class LoginPageTest extends TestBase{

	SignInPage SignInPage;
	LoginPage LoginPage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeSuite
	public void setUp(){
		initialization();
		SignInPage = new SignInPage();
		SignInPage.SignIn();
		LoginPage = new LoginPage();
		}
	
	@Test
	public void LogInTest() {
		String LoginPageTitle = LoginPage.LoginInPageTitle();
		Assert.assertEquals(LoginPageTitle, "Login - My Store");
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Boolean searchBtn = LoginPage.ValidateSearchButton();
		Assert.assertTrue(searchBtn);
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
