package com.mystore.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.qa.base.TestBase;
import com.mystore.qa.util.TestUtil;

public class OrderHistoryPage extends TestBase {

	@FindBy(xpath="//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]/a")
	WebElement myOrders;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
	WebElement orderReference;
	
	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMyordersPage() {
		myOrders.click();
	}
	
	public String validateOrderHistoryPageTitle(){
		return driver.getTitle();
	}
	
	public void navigateOrderhistoryDetails() throws IOException {
		orderReference.click();
		TestUtil.takeScreenshot();
	}
}
