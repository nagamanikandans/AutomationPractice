package com.mystore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;

public class SignInPage extends TestBase {
	
	@FindBy(xpath="//a[contains(@class, 'login')]")
	WebElement signin;
	
	@FindBy(xpath="//img[contains(@class,'logo img-responsive')]")
	WebElement yourLogo;
	
	@FindBy(id="SubmitLogin")
	WebElement SignInButton;
	
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateLogoImage(){
		return yourLogo.isDisplayed();
	}
	
	public boolean SignInbtnValidation() {
		return SignInButton.isDisplayed();
	}
	
	public LoginPage SignIn() {
		signin.click();		
		return new LoginPage();
	}
}
