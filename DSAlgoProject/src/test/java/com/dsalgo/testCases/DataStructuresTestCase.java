package com.dsalgo.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.dsalgo.pageObjects.DataStructurePageObjects;
import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;

public class DataStructuresTestCase extends BaseClass {
@Test
	public void DataStructures() throws InterruptedException, IOException {
	logger=Logger.getLogger(DataStructuresTestCase.class);
	logger.info("Inside DataStructures class ");
	
	HomePagePageObjects homepage = new HomePagePageObjects(driver);
		homepage.ClickDataStructLink();
		
		DataStructurePageObjects datastruct=new DataStructurePageObjects(driver);

		Actions actions=new Actions(driver);
		actions.moveToElement(datastruct.Time_Complexity).build().perform();
		
		datastruct.ClickTimeComplexity();
		logger.info("Clicked  Time Complexity link");
		
		actions.moveToElement(datastruct.Try_Editor).build().perform();
		datastruct.ClickTryHere();
	
		datastruct.WriteHello(pythoncode);
		CaptureScreen(driver, "DataStructTryEditor");
		datastruct.Run_Command();
		logger.info("written message in editor");
		driver.navigate().back();
		actions.moveToElement(homepage.NumpyNinja).build().perform();
		homepage.NumpyNinja.click();
		
		logger.info("Navigated back to home page");
		GetStartedPageObjects getstart=new GetStartedPageObjects(driver);
		getstart.getStartedclick();
		logger.info("Clicked Get Started");
	}
}
