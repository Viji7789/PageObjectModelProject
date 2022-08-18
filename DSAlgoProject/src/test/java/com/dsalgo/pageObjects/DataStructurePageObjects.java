package com.dsalgo.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructurePageObjects {
	WebDriver ldriver;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	public WebElement Time_Complexity;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	public WebElement Dropdown;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	public WebElement Try_Editor;
	
	@FindBy(xpath="//pre[@class=' CodeMirror-line ']")
	public WebElement codeMirrorline;
	
	@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;
	
	@FindBy(xpath="//button[@type='button']")
	public WebElement Run;
	
	
	public DataStructurePageObjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	public void ClickTimeComplexity() {
		Time_Complexity.click();
	}
	
	public void DropDownMenu() {
		Dropdown.click();
	}
	public void ClickTryHere() {
		Try_Editor.click();
	}
	public void WriteHello(String code)
	{
		codeMirrorline.click();
		textArea.sendKeys(code);
	}
	public void Run_Command() {
		Run.click();
	}
}
