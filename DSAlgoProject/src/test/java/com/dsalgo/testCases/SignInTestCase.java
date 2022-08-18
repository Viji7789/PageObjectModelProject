package com.dsalgo.testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.pageObjects.SignInPageObjects;

public class SignInTestCase extends BaseClass{
	@Test
	public void SignInTest() throws InterruptedException, IOException
	{
		
		logger=Logger.getLogger(SignInTestCase.class);
		
	
		HomePagePageObjects homepage = new HomePagePageObjects(driver);
		SignInPageObjects signin = new SignInPageObjects(driver);
		homepage.clickSignIn();
		signin.setUsername(username);
		signin.setPassword(password);
		 signin.clickSubmit();
			CaptureScreen(driver, "Signinpage");

		 logger.info("Signed in Successfully");
		
	}

}
