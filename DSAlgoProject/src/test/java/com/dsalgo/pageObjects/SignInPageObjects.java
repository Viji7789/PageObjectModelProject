package com.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObjects {
WebDriver ldriver;
	
@FindBy(id= "id_username")
WebElement username;

@FindBy(id="id_password")
WebElement password;

@FindBy(xpath="//input[@value='Login']")
WebElement login;	
	public SignInPageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	public String  verifyLoginTitle() {
		return ldriver.getTitle();
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	public void clickSubmit()
	{
		login.click();
	}
	

}
