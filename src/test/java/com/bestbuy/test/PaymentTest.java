package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;


public class PaymentTest  extends SeWrappers{
	BestBuyWrappers BB= new BestBuyWrappers();
	
	@Test
	
	public void PlaceOrder() {
		try {
			
			BB.PlaceOrder();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
