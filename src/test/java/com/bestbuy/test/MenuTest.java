package com.bestbuy.test;

import org.testng.annotations.Test;

import com.bestbuy.utils.BestBuyWrappers;
import com.bestbuy.utils.SeWrappers;

public class MenuTest extends SeWrappers {

	BestBuyWrappers BB= new BestBuyWrappers();
	
	@Test
	public void Menu()
	{
		try
		{
			BB.Menu();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
