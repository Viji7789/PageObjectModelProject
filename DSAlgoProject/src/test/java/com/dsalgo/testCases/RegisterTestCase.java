package com.dsalgo.testCases;

import org.apache.log4j.Logger;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.pageObjects.RegisterPageObjects;

public class RegisterTestCase extends BaseClass{
	@Test
		public void Registerpagetest() throws InterruptedException, IOException
		{
		
		logger=Logger.getLogger(RegisterTestCase.class);

		
		logger.info("Indise Register class");
			HomePagePageObjects homepage = new HomePagePageObjects(driver);
			
			homepage.clickRegister();
			logger.info("Register page");

			logger.debug("debug ");
			RegisterPageObjects register = new RegisterPageObjects(driver);
			
			
			register.setUsername(username);
			register.setPassword1(password);
			register.setPassword2(password);
			
			 register.clickSubmit();

			String title=homepage.verifyhomepageTitle();
			CaptureScreen(driver, "Registerpage");
			Assert.assertEquals(title, "NumpyNinja");
			logger.info("Registration successful");

			String logoutText=homepage.clickSignOut();
			CaptureScreen(driver, "Registerpage_aftersignout");
			Assert.assertEquals(logoutText, "Logged in successfully");
			logger.info("Logged out successful");

			
		}
}
