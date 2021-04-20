package com.mystore.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.qa.base.TestBase;

public class WomenDressesPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womenMainMenu;
	
	@FindBy(xpath="//*[@id=\"categories_block_left\"]/div/ul/li[2]/a")
	WebElement womenDresses;
	
	@FindBy(xpath="//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")
	WebElement womenSummerDresses;
	
	@FindBy(xpath="//*[@id=\"columns\"]/div[1]/a[4]")
	WebElement womenSummerDressesMenu;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span")
	WebElement AddcardButton;
	
	@FindBy(xpath="//*[@id=\"list\"]")
	WebElement listView;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div/div[2]/h5/a")
	WebElement SelectItem1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div/div[2]/h5/a")
	WebElement SelectItem2;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[3]/div/div/div[2]/h5/a")
	WebElement SelectItem3;
	
	@FindBy(xpath="//*[@id=\"quantity_wanted\"]")
	WebElement enterQuantity;
	

	@FindBy(xpath="//*[@id=\"group_1\"]")
	WebElement SizeRequired;
	
	@FindBy(xpath="//*[@id=\"color_15\"]")
	WebElement selectcolor2;
	
	@FindBy(xpath="//*[@id=\"color_8\"]")
	WebElement selectcolor1;
	
	@FindBy(xpath="//*[@id=\"color_16\"]")
	WebElement selectcolor;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addTocart;

	@FindBy(xpath="//*[@id=\"layer_cart\"]")
	WebElement layerCart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]")
	WebElement layerCart2;
		
	@FindBy(css="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	WebElement continueShopping;
	
	@FindBy(css="#layer_cart_product_quantity")
	WebElement QuantityCount1;
	
	public WomenDressesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateWomenMainPageTitle(){
		return driver.getTitle();
	}
	
	public String validateWomenSummerDressPageTitle(){
		return driver.getTitle();
	}
	
	public String validatePrintedSummerDressPageTitle(){
		return driver.getTitle();
	}
	
	public void NavigateWomenMainMenu() {
			womenMainMenu.click();
	}
	
	public void NavigateWomenDressesMenu() {
		womenDresses.click();
	}
	
	public void NavigateWomenSummerDressesMenu() {
		womenSummerDresses.click();
	}
	
	public void ItemslistView() {
		listView.click();
	}
	
	public boolean validationListview() {
		return AddcardButton.isDisplayed();
	}
	
	public void selectSummerDressItem1() {
		SelectItem1.click();
		enterQuantity.clear();
		enterQuantity.sendKeys("5");
		Select Size=new Select(SizeRequired);
		Size.selectByVisibleText("L");
		selectcolor.click();
		addTocart.click();
		continueShopping.click();
	}
	
	public void selectSummerDressItem2() {
		womenSummerDressesMenu.click();
		SelectItem2.click();
		enterQuantity.clear();
		enterQuantity.sendKeys("5");
		Select Size=new Select(SizeRequired);
		Size.selectByVisibleText("L");
		selectcolor1.click();
		addTocart.click();
		continueShopping.click();
	}
	
	public void selectSummerDressItem3() {
		womenSummerDressesMenu.click();
		SelectItem3.click();
		enterQuantity.clear();
		enterQuantity.sendKeys("5");
		Select Size=new Select(SizeRequired);
		Size.selectByVisibleText("L");
		selectcolor2.click();
		addTocart.click();
		continueShopping.click();
	}
	
	public boolean ValidationAfterItemsAddedtoCart() {
		return womenSummerDressesMenu.isDisplayed();
	}
	
}
