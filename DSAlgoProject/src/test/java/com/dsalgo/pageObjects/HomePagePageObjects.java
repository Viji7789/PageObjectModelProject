package com.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePageObjects {

WebDriver ldriver;
@FindBy(xpath ="//a[text()=' Register ']")
WebElement register;


@FindBy(xpath = "//div[contains(text(),'New Account Created')]")
WebElement NewAccount;
@FindBy(xpath = "//a[contains(text(),'Data Structures')]")
WebElement DataStructuresbtn;

@FindBy(xpath ="//a[text()='Sign out']")
WebElement signOut;

@FindBy(xpath = "//div[contains(text(),'Logged out')]")
WebElement logoutsuccess;

@FindBy(xpath = "//a[text()='Sign in']")
WebElement signIn;

@FindBy(xpath="//a[@href='data-structures-introduction']")
WebElement DataStructures_link;

@FindBy(xpath  ="//a[@href='linked-list']")
WebElement LinkedList_link;

@FindBy(xpath="//a[text()='NumpyNinja']")
public WebElement NumpyNinja;

	public HomePagePageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	public String verifyhomepageTitle()
	{
		String title= ldriver.getTitle();
		//Assert.assertEquals(title, "NumpyNinja");
		return title;
	}
	
	public String verifyNewAccountCreated()
	{
		return NewAccount.getText();
	}
	public void clickRegister()
	{
		register.click();
	}
	
	public void clickDataStructurebutton()
	{
		DataStructuresbtn.click();
	}
	
	public String clickSignOut()
	{
		signOut.click();
		String logoutText=logoutsuccess.getText();
		//Assert.assertEquals(logoutText, "Logged out successfully");
		return logoutText;
		
	}
	
	public void clickSignIn()
	{
		signIn.click();
	}
	
	public void ClickDataStructLink() {
		DataStructures_link.click();
	}
	public void ClickNumpyNinja() {
		NumpyNinja.click();
	}
	
	public void ClickLinkedList() {
		LinkedList_link.click();
	}

}
