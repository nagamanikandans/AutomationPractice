package com.mystore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;

public class SignOutPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signout;
	
	public SignOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void signoutApplication() {
		signout.click();
	}
}
