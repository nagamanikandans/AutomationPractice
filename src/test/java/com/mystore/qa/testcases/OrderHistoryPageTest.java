package com.mystore.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.CheckoutPage;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.OrderHistoryPage;
import com.mystore.qa.pages.SignInPage;
import com.mystore.qa.pages.SignOutPage;
import com.mystore.qa.pages.WomenDressesPage;

public class OrderHistoryPageTest extends TestBase {

	SignInPage SignInPage;
	LoginPage LoginPage;
	OrderHistoryPage OrderHistoryPage;
	SignOutPage SignOutPage;
	
	public OrderHistoryPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		SignInPage = new SignInPage();
		SignInPage.SignIn();
		LoginPage = new LoginPage();
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		OrderHistoryPage = new OrderHistoryPage();
	}
	
	@Test(priority=1)
	public void orderHistoryDetails() throws IOException {
		OrderHistoryPage.navigateMyordersPage();
		OrderHistoryPage.navigateOrderhistoryDetails();
		String orderHistoryTitle = OrderHistoryPage.validateOrderHistoryPageTitle();
		Assert.assertEquals(orderHistoryTitle, "Order history - My Store");
		SignOutPage = new SignOutPage();
		SignOutPage.signoutApplication();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
