package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class MenuPage extends SeWrappers {
	
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']")
	WebElement closecart;
	
	@FindBy(xpath="//nav[@class='hamburger-menu']")
	WebElement menu;
	
	@FindBy(xpath="//button[@data-id='node-524']")
	WebElement audio;
	
	@FindBy(xpath="//button[@data-id='node-493']")
	WebElement headphones;
	
	@FindBy(xpath="//a[@data-lid='ubr_au_hed_airpod']")
	WebElement Airpods;
	
	@FindBy(xpath="//button[@data-sku-id='6376551']")
	WebElement Appleheadphone;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShopping;                          
	
	@FindBy(xpath="//button[@aria-label='Menu']")
	WebElement MENU;
	
	@FindBy(xpath="//button[@data-id='node-86']")
	WebElement Brand;
	
	@FindBy(xpath="//a[@data-lid='ubr_shp_son']")
	WebElement sony;
	
	@FindBy(xpath="//a[text()='Home Audio & Video']")
	WebElement Audio;
	
	@FindBy(xpath="//a[text()='Sound Bars']")
	WebElement soundbar;
	
	@FindBy(xpath="//button[@data-sku-id='6467425']")
	WebElement Baraddtocart;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement ContinueShopping;
	
	public void clickCloseShopping()
	{
		click(closecart);                              
	}
	
	public void clickmenu() {
		click(menu);
	}

	public void clickAudio() {
		click(audio);
	}
	public void clickHeadphones() {
		click(headphones);
	}
	
	public void clickAirpods()
	{
		click(Airpods);
	}
	public void clickAppleheadphones() {
		click(Appleheadphone);
	}
	public void clickContinue() {
		click(continueShopping);
	}
	
	public void clickMenu() {
		click(MENU);
	}
	
	public void clickBRAND() {
		click(Brand);
	}
	public void clickSONY() {
		click(sony);
	}
	public void clickAUDIO() {
		click(Audio);
	}
	public void clickSoundBAR() {
		click(soundbar);
		
	}
	public void clickBar() {
		click(Baraddtocart);
	}
	
	public void clickShoppingContinue() {
		click(ContinueShopping);
	}
	
}
