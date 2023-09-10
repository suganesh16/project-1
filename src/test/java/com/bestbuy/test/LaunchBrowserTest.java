package com.bestbuy.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;

public class LaunchBrowserTest  extends SeWrappers{
	
	SeWrappers se= new SeWrappers();
	BestBuyWrappers BB= new BestBuyWrappers();
	
	
	@Test
	public void launchBrowser()
	{
		try
		{
			launchBrowser("https://www.bestbuy.com/");
			
			BB.launchbestbuy();
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	

}
