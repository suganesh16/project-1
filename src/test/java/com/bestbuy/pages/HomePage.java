package com.bestbuy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class HomePage extends SeWrappers{
	
	@FindBy(xpath="//a[@title='BestBuy.com']")
	WebElement title;
			
	@FindBy(xpath="//nav[@class='hamburger-menu']")
	WebElement menu;
          
	@FindBy(xpath="//div[@class='hamburger-menu-flyout-list-wrapper toast-arrow-up']")
	WebElement list;
	
	
	public void getTitles()
	{
		getTitle();
	}
	
	public void clickmenu() {
		click(menu);
	}
	public void getList() {
		getTitle();
	}
}

