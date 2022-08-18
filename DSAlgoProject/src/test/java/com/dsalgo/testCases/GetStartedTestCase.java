package com.dsalgo.testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;

public class GetStartedTestCase extends BaseClass {
	HomePagePageObjects homepage;

	@Test
	public void GetstartedTest()
	{
		
		
		GetStartedPageObjects getstart = new GetStartedPageObjects(driver);
		getstart.getStartedclick();
		
		
	}

}
