package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;

public class SearchTest  extends SeWrappers{
	
	BestBuyWrappers BB= new BestBuyWrappers();
	
	
	@Test
	public void Search()
	{
		try
		{
			BB.search();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	

}
