package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;

public class SignInTest extends SeWrappers {
	BestBuyWrappers BB= new BestBuyWrappers();
	
	@Test
	public void SignIn()
	{
		try
		{
			BB.SignIn();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
