package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class SignInPage extends SeWrappers {
	
	@FindBy(xpath="//span[text()='Account']")
	WebElement Account;
	
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(id="fld-e")
	WebElement enteremail;
	
	@FindBy(id="fld-p1")
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignIn;
	
	@FindBy(xpath="//a[text()='Return to previous page']")
	WebElement ReturnPrPage;
	
	 public void clickaccount() {
	    	click(Account);
	    }
	    
	    public void clicksiginIn() {
	    	click(signin);
	    }
	    
	    public void setemail(String Email) {
	    	typeText(enteremail,Email);
	    }
	    public void setpassword(String passWord) {
	    	typeText(enterpassword,passWord);
	    }
	    public void clickSignIn() {
	    	click(SignIn);
	    }
	    public void ClickReturnPrPage() {
	    	click(ReturnPrPage);
	    }

}
