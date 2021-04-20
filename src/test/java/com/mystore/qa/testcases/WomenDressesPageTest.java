package com.mystore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.MyAccountPage;
import com.mystore.qa.pages.MyAddressPage;
import com.mystore.qa.pages.SignInPage;
import com.mystore.qa.pages.WomenDressesPage;

public class WomenDressesPageTest extends TestBase {

	SignInPage SignInPage;
	LoginPage LoginPage;
	MyAccountPage MyAccountPage;
	MyAddressPage MyAddressPage;
	WomenDressesPage WomenDressesPage;
	
	public WomenDressesPageTest() {
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

	}
	
//	@Test(priority=1)
//	public void selectListview() {
//		WomenDressesPage.NavigateWomenDressesMenu();
//		WomenDressesPage.NavigateWomenSummerDressesMenu();
//		String womenSummerpageTitle= WomenDressesPage.validateWomenMainPageTitle();
//		Assert.assertEquals(womenSummerpageTitle, "Summer Dresses - My Store");
//		WomenDressesPage.ItemslistView();
//		Assert.assertTrue(WomenDressesPage.validationListview(), "Add cart label is missing on the page");
//	}
	
	@Test(priority=1)
	public void selectItems() {
		WomenDressesPage.NavigateWomenDressesMenu();
		WomenDressesPage.NavigateWomenSummerDressesMenu();
		WomenDressesPage.ItemslistView();
		WomenDressesPage.selectSummerDressItem1();
		WomenDressesPage.selectSummerDressItem2();
		WomenDressesPage.selectSummerDressItem3();
		Assert.assertTrue(WomenDressesPage.ValidationAfterItemsAddedtoCart(), "Items are not added properly");
		}
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
