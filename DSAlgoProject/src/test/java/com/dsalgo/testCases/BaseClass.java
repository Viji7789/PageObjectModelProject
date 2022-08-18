package com.dsalgo.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.dsalgo.pageObjects.GetStartedPageObjects;
import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.utilities.ReadConfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	public static WebDriver driver;
	
	static ReadConfig readconfig=new ReadConfig();

	public static  String url= readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password= readconfig.getPassword();
	public String pythoncode=readconfig.getPythonCode();
	public static Logger logger;

	
	@BeforeSuite
	public static void setup()
	{

			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			logger=Logger.getLogger(BaseClass.class);
			PropertyConfigurator.configure("log4j.properties");
			logger.info("Inside Base Class");
			GetStartedPageObjects getstart = new GetStartedPageObjects(driver);
			getstart.getStartedclick();
			logger.info("Landed on Get Started page");
				
	}
@AfterSuite
 public void tearDown()
 {
	// driver.quit();
 }

public void CaptureScreen(WebDriver driver, String name) throws IOException {
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
	File destinationFile=new File("C:\\Users\\viji7\\eclipse-workspace\\DSAlgoProject\\src\\test\\resources\\ScreenShots\\"+name+".png");
	FileHandler.copy(sourceFile, destinationFile);
	System.out.println("Screenshot taken");
}
}
