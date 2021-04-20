package com.mystore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.CheckoutPage;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.MyAccountPage;
import com.mystore.qa.pages.MyAddressPage;
import com.mystore.qa.pages.SignInPage;
import com.mystore.qa.pages.SignOutPage;
import com.mystore.qa.pages.WomenDressesPage;

public class CheckoutPageTest extends TestBase {

	SignInPage SignInPage;
	LoginPage LoginPage;
	MyAccountPage MyAccountPage;
	MyAddressPage MyAddressPage;
	WomenDressesPage WomenDressesPage;
	CheckoutPage CheckoutPage;
	SignOutPage SignOutPage;
	
	public CheckoutPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		SignInPage = new SignInPage();
		SignInPage.SignIn();
		LoginPage = new LoginPage();
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		WomenDressesPage = new WomenDressesPage();
		WomenDressesPage.NavigateWomenMainMenu();
		WomenDressesPage.NavigateWomenDressesMenu();
		WomenDressesPage.NavigateWomenSummerDressesMenu();
		WomenDressesPage.ItemslistView();
		WomenDressesPage.selectSummerDressItem1();
		WomenDressesPage.selectSummerDressItem2();
		WomenDressesPage.selectSummerDressItem3();
		CheckoutPage = new CheckoutPage();
		CheckoutPage.NavigateTocart();
	}
	
	@Test(priority=1)
	public void checkoutPageTitleTest() {
		String checkOutTitle = CheckoutPage.validateCheckOutPageTitle();
		Assert.assertEquals(checkOutTitle, "Order - My Store");
	}
	
	
	@Test(priority=2)
	public void confirmOrder() {
		CheckoutPage.checkOut();
		CheckoutPage.payment();
		String confirmOrderTitle = CheckoutPage.validateOrderConfirmationPageTitle();
		Assert.assertEquals(confirmOrderTitle, "Order confirmation - My Store");
		CheckoutPage.navigateHomePage();
		SignInPage.validateLoginPageTitle();
		String Title = SignInPage.validateLoginPageTitle();
		Assert.assertEquals(Title, "My Store");
		SignOutPage = new SignOutPage();
		SignOutPage.signoutApplication();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
