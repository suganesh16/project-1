package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.SeWrappers;

public class CartPage  extends SeWrappers{

	@FindBy(xpath="//div[@class='cart-icon']")
	WebElement cart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement Alertclose;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkout;
	
	@FindBy(id="fld-e")
	WebElement Enteremail;
	
	@FindBy(id="fld-p1")
	WebElement Enterpassword;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement SignIn;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	WebElement Guest;
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
	WebElement Usermail;
	
	@FindBy(xpath="//input[@id='user.phone']")
	WebElement userphone;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	WebElement continuepayment;
	
	public void clickCart() {
		click(cart);
	}
	public void clickAlert() {
		click(Alertclose);
	}
	public void clickCheckOut() {
		click(checkout);
	}
	  public void setemail(String Email) {
	    	typeText(Enteremail,Email);
	    }
	    public void setpassword(String passWord) {
	    	typeText(Enterpassword,passWord);
	    }
	    public void clickSignIn() {
	    	click(SignIn);
	    }

	public void ClickGuest() {
		click(Guest);
	}
	public void SendEmail(String mail) {
		typeText(Usermail,mail);
	}
	public void SendPhoneNo(String No) {
		typeText(userphone,No);
	}
	public void ClickPayment() {
		click(continuepayment);
	}
}
