package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class SearchPage extends SeWrappers {
	
	@FindBy(id="gh-search-input")
	WebElement search;
	
	@FindBy(xpath="//span[@class='header-search-icon']")
	WebElement Entersearch;
	
	@FindBy(xpath="//div[@class='fulfillment-add-to-cart-button']")
	WebElement addtocart;
	
	
	public void Search(String Search)
	{
		typeText(search,Search);
	}
	
	public void enterSearch() {
		click(Entersearch);
	}
	
	public void clickcart()
	{
		click(addtocart);
	}
	

}
