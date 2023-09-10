package com.bestbuy.utils;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bestbuy.pages.CartPage;
import com.bestbuy.pages.HomePage;
import com.bestbuy.pages.LoginPage;
import com.bestbuy.pages.MenuPage;
import com.bestbuy.pages.PaymentPage;
import com.bestbuy.pages.SearchPage;
import com.bestbuy.pages.SignInPage;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;


public class BestBuyWrappers extends SeWrappers{
	SeWrappers se= new SeWrappers();
	
	public void launchbestbuy()
	{
	try
	{
		
		LoginPage lpPage=PageFactory.initElements(driver,LoginPage.class);
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		
		
		lpPage.clickCountry();
		Reports.setTCDesc("Validating login functionality with valid credentials");
		
		String pageTitle="Best Buy | Official Online Store | Shop Now & Save";
		String actualTitle=se.getTitle();
		Assert.assertTrue(driver.getTitle().equals(pageTitle));
		screenshot("launch_Bestbuy");
		lpPage.clickAccount();
		
		lpPage.clickCreateAccount();
		
		
	}
	catch(Exception ex)
	
	{
		ex.printStackTrace();
	}

}
	
	public void loginbestbuy() {
		try
		{
			LoginPage LpPage=PageFactory.initElements(driver,LoginPage.class);
			
			LpPage.enterFirstName("k");
			LpPage.enterLastName("d");
			LpPage.enterEmail("kdkarthik16@gmail.com");
			LpPage.enterPassword("KDkarthik@94");
			LpPage.enterCnffPassword("KDkarthik@94");
			LpPage.enterMobileNo("9123456789");
			LpPage.clickAccountCreate();
			
			LpPage.clickReturnPrPage();
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void SignIn()
	{
		try
		{
			SignInPage SiPage=PageFactory.initElements(driver,SignInPage.class);
			SiPage.clickaccount();
			SiPage.clicksiginIn();
			SiPage.setemail("kdkarthik16@gmail.com");
			SiPage.setpassword("KDkarthik@94");
			SiPage.clickSignIn();
			SiPage.ClickReturnPrPage();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	public void Menu() {
		try
		{
			HomePage HmPage=PageFactory.initElements(driver,HomePage.class);
			
			HmPage.clickmenu();
			
			
			String actualTitle=se.getTitle();
			
			screenshot("Get_Menu");
			
					}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void search()
	{
		try
		{
			SearchPage SpPage=PageFactory.initElements(driver,SearchPage.class);
			SpPage.Search("apple airpods");
			
			SpPage.enterSearch();
			SpPage.clickcart();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void Addtocartbymenu() {
		try
		{
			MenuPage MpPage= PageFactory.initElements(driver,MenuPage.class);
			
			MpPage.clickCloseShopping();
			MpPage.clickmenu();
			MpPage.clickAudio();
			MpPage.clickHeadphones();
			MpPage.clickAirpods();
			MpPage.clickAppleheadphones();
			MpPage.clickContinue();
			
			MpPage.clickMenu();
			MpPage.clickBRAND();
			MpPage.clickSONY();
			MpPage.clickAUDIO();
			MpPage.clickSoundBAR();
			MpPage.jsHorizontalScroll(10);
			MpPage.clickBar();
			MpPage.clickShoppingContinue();
			screenshot("Item-in-cart");
			
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void CartCheckOut() {
		try
		{
			CartPage CpPage=PageFactory.initElements(driver,CartPage.class);
			CpPage.clickCart();
			CpPage.clickAlert();
			CpPage.clickCheckOut();
			CpPage.setemail("kdkarthik16@gmail.com");
			CpPage.setpassword("KDkarthik@94");
			CpPage.clickSignIn();
			Thread.sleep(3000);
			CpPage.ClickGuest();
			CpPage.SendEmail("kdkarthik16@gmail.com");
			CpPage.SendPhoneNo("9123456789");
			Thread.sleep(2000);
			CpPage.ClickPayment();
			screenshot("Checkout-page");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void PlaceOrder() {
		try
		{
			PaymentPage PmPage=PageFactory.initElements(driver,PaymentPage.class);
			
			PmPage.clickContinuePayment();
			PmPage.EnterCardNo("4539356428127672");
			PmPage.EnterMonth();
			PmPage.EnterYear();
			PmPage.Enterccv("789");
			PmPage.EnterFname("Gregory");
			PmPage.EnterLname("Cartwright");
			PmPage.EnterAddress("936 Kiehn Route");
			PmPage.EnterCity("West Ned");
			PmPage.clickState();
			PmPage.EnterPostcode("11230");
			PmPage.ClickPalceOrder();
			screenshot("Place-Order");
			
			PmPage.closeAllBrowsers();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
