package com.mystore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;

public class CheckoutPage extends TestBase {
 
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"order_step\"]/li[1]/span")
	WebElement summary;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]")
	WebElement procceedTocheckout;
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
	WebElement proceedTocheckout2;
	
	@FindBy(xpath="//*[@id=\"cgv\"]")
	WebElement termsAndconditions;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button")
	WebElement finalCheckout;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement payBybankWire;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	WebElement confirmOrder;
	
	@FindBy(xpath="//*[@id=\"columns\"]/div[1]/a/i")
	WebElement homeIcon;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateCheckOutPageTitle(){
		return driver.getTitle();
	}
	
	public String validateOrderConfirmationPageTitle(){
		return driver.getTitle();
	}
	
	public void NavigateTocart() {
		cart.click();
	}
	
	public void checkOut() {
		procceedTocheckout.click();
		proceedTocheckout2.click();
		termsAndconditions.click();
		finalCheckout.click();
	}
	
	public void payment() {
		payBybankWire.click();
		confirmOrder.click();
	}
	
	public void navigateHomePage() {
		homeIcon.click();
	}
}
