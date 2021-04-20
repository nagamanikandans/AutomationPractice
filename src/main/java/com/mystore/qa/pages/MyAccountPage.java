package com.mystore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;

public class MyAccountPage extends TestBase {
	
	//@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
	@FindBy(xpath="//span[text()='My addresses']")
	WebElement myAdd;
	
	@FindBy(xpath="//span[text()='Add a new address']")
	WebElement addNewAddress;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMyAccountTitle(){
		return driver.getTitle();
	}
	
	public boolean validateAddNewAddressButton() {
		return addNewAddress.isDisplayed();
	}
	
	public MyAddressPage navigateMyAddress() {
		myAdd.click();
		return new MyAddressPage();
	}
	
}
