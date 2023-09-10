package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class LoginPage  extends SeWrappers{
	
	@FindBy(xpath="//img[@alt='United States']")
	WebElement country;
			
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;
	
	@FindBy(xpath="//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
    WebElement createaccount;	
	
	@FindBy(id="firstName")
	WebElement Firstname;
	
	@FindBy(id="lastName")
	WebElement Lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(id="reenterPassword")
	WebElement cnpassword;
	
	@FindBy(id="phone")
	WebElement mobile;
	
	@FindBy(linkText="//button[text()='Create an Account']")
	WebElement accountcreate;
	
	@FindBy(xpath="//a[@class='mini-header__nav']")
	WebElement Return;
	
	
	
	public void clickCountry()
	{
		click(country);
	}
	
	public void clickAccount()
	{
		click(account);
	}
	
	public void clickCreateAccount()
	{
		click(createaccount);
	}
	
	
    public void enterFirstName(String firstname) {
    	
    	typeText(Firstname,firstname);
    	        }
    public void enterLastName(String lastname) {
    	
    	typeText(Lastname,lastname);
    	
    }
    
    public void enterEmail(String Email) {
    	typeText(email,Email);
    	
    }
    public void enterPassword(String Password) {
    	typeText(password,Password);
    	
    }
    public void enterCnffPassword(String CnPassword) {
    	typeText(cnpassword,CnPassword);
    	
    }
    
    public void enterMobileNo(String PhNumber) {
    	typeText(mobile,PhNumber);
    }
    
    public void clickAccountCreate() {
    	click(accountcreate);
    }
    
    public void clickReturnPrPage() {
    	click(Return);
    }
    
   
    
    
    
    
    
    
    
    
    
}
