package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;



public class LoginTest extends SeWrappers {
	
	BestBuyWrappers BB= new BestBuyWrappers();
	
	@Test
	
	public void login()
	{
		try
		{
			BB.loginbestbuy();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	

}
