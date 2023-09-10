package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;

public class AddToCartTest extends SeWrappers {

	BestBuyWrappers BB= new BestBuyWrappers();
	
	@Test
	public void Addtocartbymenu()
	{
		try
		{
			BB.Addtocartbymenu();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}
	@Test
	public void CartCheckout()
	{
		try
		{
			BB.CartCheckOut();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
