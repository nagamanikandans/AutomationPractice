package com.mystore.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;

public class MyAddressPage extends TestBase {


	@FindBy(xpath="//span[text()='Add a new address']")
	WebElement addNewAddress;
	
	@FindBy(xpath="//p[text()='To add a new address, please fill out the form below.']")
	WebElement addressText;
	
	public MyAddressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddressPageTitle(){
		return driver.getTitle();
	}
	
	public boolean addressTextValidation() {
		return addressText.isDisplayed();
	}
	
	public AddNewAddress addNewAdd() {
		addNewAddress.click();
		return new AddNewAddress();
	}
}
