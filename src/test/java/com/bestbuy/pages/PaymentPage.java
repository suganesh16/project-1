package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class PaymentPage  extends SeWrappers{
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepayment;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement creditcardnumber;
	
	@FindBy(xpath="//option[@value='02']")
	WebElement month;
	
	@FindBy(xpath="//option[@value='2026']")
	WebElement year;
	
	@FindBy(xpath="//input[@id='cvv']")
	WebElement ccv;
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement FName;
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement LName;
	
	@FindBy(xpath="//input[@id='address-input']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//option[@value='TN']")
	WebElement State;
	
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement postcode;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement PlaceOrder;
	
	public void clickContinuePayment() {
		click(continuepayment);
	}
	public void EnterCardNo(String No)
	{
		typeText(creditcardnumber,No);
	}
	public void EnterMonth() {
		click(month);
	}
	public void EnterYear() {
		click(year);
	}
	public void Enterccv(String CCV) {
		typeText(ccv,CCV);
	}
	public void EnterFname(String FirstName) {
		typeText(FName,FirstName);
	}
	public void EnterLname(String LastName) {
		typeText(LName,LastName);
	}
	public void EnterAddress(String Address) {
		typeText(address,Address);
	}
	public void EnterCity(String city) {
		typeText(City,city);
	}
	public void clickState() {
		click(State);
		
	}
	public void EnterPostcode(String code) {
		typeText(postcode,code);
	}
	
	public void ClickPalceOrder() {
		click(PlaceOrder);
	}

}
