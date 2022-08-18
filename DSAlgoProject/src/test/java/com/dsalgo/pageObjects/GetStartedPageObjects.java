package com.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPageObjects {
WebDriver ldriver;
@FindBy(xpath = "//button[text()='Get Started']")
WebElement getStarted;

	public GetStartedPageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	
	public void getStartedclick()
	{
		getStarted.click();
		
		
	}

	
}
