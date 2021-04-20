package com.mystore.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mystore.qa.base.TestBase;

public class AddNewAddress extends TestBase {

	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;

	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement statedropdown;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement countrydropdown;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;
	
	@FindBy(id="other")
	WebElement other;
	
	@FindBy(id="alias")
	WebElement alias;
	
	@FindBy(id="submitAddress")
	WebElement submitAddress;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/a")
	WebElement homebutton;
	
	public AddNewAddress() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateAddNewAddressPageTitle(){
		return driver.getTitle();
	}
	
	public void AddnewAddressdetails(String ftname, String ltName, String com,String add1,String add2,String cty,
			String stat) {
		
		String pcode = "12345";
		String ph_home = "1234567896";
		String ph_mob = "9988775544";
		String coun = "United States";
		String info = "Office Address";
		String ref = "Check";		
		
		firstname.clear();
		firstname.sendKeys(ftname);
		lastname.clear();
		lastname.sendKeys(ltName);
		company.sendKeys(com);
		address1.sendKeys(add1);
		address2.sendKeys(add2);
		city.sendKeys(cty);
		
		Select state=new Select(statedropdown);
		state.selectByVisibleText(stat);
		
		postcode.sendKeys(pcode);
		
		Select country=new Select(countrydropdown);
		country.selectByVisibleText(coun);
		
		phone.sendKeys(ph_home);
		phone_mobile.sendKeys(ph_mob);
		other.sendKeys(info);
		alias.clear();
		alias.sendKeys(ref);
		submitAddress.click();
		homebutton.click();
		//return new MyAddressPage();
	}
}
