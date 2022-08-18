package com.dsalgo.testCases;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.pageObjects.RegisterPageObjects;
import com.dsalgo.utilities.XLUtils;

public class RegisterDataDriven extends BaseClass{
	@Test(dataProvider="RegisterData")
	public void RegisterDataTest(String Username,String Password) throws InterruptedException, IOException{
		
		logger=Logger.getLogger(RegisterDataDriven.class);
		
		logger.info("Get Started page");
		
			HomePagePageObjects homepage = new HomePagePageObjects(driver);
			
			homepage.clickRegister();
			logger.info("Register page");


			RegisterPageObjects register = new RegisterPageObjects(driver);
			
			
			register.setUsername(Username);
			register.setPassword1(Password);
			register.setPassword2(Password);
			
			 register.clickSubmit();
			 String title=homepage.verifyhomepageTitle();
			Assert.assertEquals(title, "NumpyNinja");
			logger.info("Registration successful");

			String logoutText=homepage.clickSignOut();
			Assert.assertEquals(logoutText, "Logged out successfully");
			logger.info("Logged out successful");

			//Thread.sleep(4000);
		//	homepage.clickSignIn();
			//logger.info("Perform sign in");

			
	}
	@DataProvider(name="RegisterData")
	String[][] getData() throws IOException{
		String path=System.getProperty("C:\\Users\\viji7\\eclipse-workspace\\DSAlgoProject\\src\\test\\java\\com\\dsalgo\\testData\\DataProviderPoI.xlsx");
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String registerdata[][]=new String [rownum][colcount];
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				registerdata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return registerdata;
	}
}
