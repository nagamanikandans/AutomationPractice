package com.mystore.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.pages.AddNewAddress;
import com.mystore.qa.pages.LoginPage;
import com.mystore.qa.pages.MyAccountPage;
import com.mystore.qa.pages.MyAddressPage;
import com.mystore.qa.pages.SignInPage;
import com.mystore.qa.util.TestUtil;

public class AddNewAddressPageTest extends TestBase{

	SignInPage SignInPage;
	LoginPage LoginPage;
	MyAccountPage MyAccountPage;
	MyAddressPage MyAddressPage;
	AddNewAddress AddNewAddress;
	
	String sheetName = "Address";
	
	public AddNewAddressPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		SignInPage = new SignInPage();
		SignInPage.SignIn();
		LoginPage = new LoginPage();
		LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		MyAccountPage = new MyAccountPage();
		MyAccountPage.navigateMyAddress();	
		MyAddressPage = new MyAddressPage();
		MyAddressPage.addNewAdd();
		AddNewAddress = new AddNewAddress();
		//AddNewAddress.AddnewAddressdetails(sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName, sheetName);
	}
	
//	@Test(priority=1)
//	public void AddAddressPageTitleTest() {
//		String AddnewAddTitle = AddNewAddress.validateAddNewAddressPageTitle();
//		Assert.assertEquals(AddnewAddTitle, "Address - My Store");
//	}
	
	@DataProvider
	public Object[][] getTestDatafromSheet() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider = "getTestDatafromSheet" )
	public void newAddressdetails(String firstname, String lastname, String company,String address1,String address2,String city,
			String state) {
		
		AddNewAddress.AddnewAddressdetails(firstname, lastname, company, address1, 
				address2, city, state);
	}
}
