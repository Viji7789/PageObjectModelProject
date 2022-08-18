package com.dsalgo.testCases;

import org.testng.annotations.Test;
import java.time.Duration;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.pageObjects.RegisterPageObjects;

public class HomePageTestCase extends BaseClass{
	String title;
	RegisterPageObjects register;
	@Test
	public void HomepageTest()
	{
		logger.info("Inside HomePage class");
		
		
		HomePagePageObjects homepage = new HomePagePageObjects(driver);
		
		
		GetStartedPageObjects getstart = new GetStartedPageObjects(driver);
		 getstart.getStartedclick();
		
		homepage.clickRegister();
		
	}
}
