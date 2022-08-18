package com.dsalgo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LinkedListPageObjects {
	WebDriver ldriver;
@FindBy(xpath="//a[@href='introduction']")
WebElement Introduction;

@FindBy(xpath="//a[text()='Creating Linked LIst']")
WebElement CreateLinkedList;

@FindBy(xpath="//a[text()='Types of Linked List']")
WebElement TypesOfLinkedList;

@FindBy(xpath = "//a[@href='/tryEditor']")
public WebElement Try_Editor;

@FindBy(xpath="//a[text()='Implement Linked List in Python']")
WebElement ImplementListLink;

@FindBy(xpath="//a[text()='Traversal']")
WebElement Traversal;

@FindBy(xpath="//a[text()='Insertion']")
WebElement Insertion;

@FindBy(xpath="//a[text()='Deletion']")
WebElement Deletion;

@FindBy(xpath="//pre[@class=' CodeMirror-line ']")
public WebElement codeMirrorline;

@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
WebElement textArea;

@FindBy(xpath="//button[@type='button']")
public WebElement Run;

@FindBy(xpath="//a[text()='Sign out']")
public WebElement Sign_out;

@FindBy(xpath="//div[@class='alert alert-primary']")
public WebElement alert;
String expected_msg="Logged out successfully";
public LinkedListPageObjects(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
public void Introduction_link() {
	Introduction.click();
}
public void Createlinkedlist_link() {
	CreateLinkedList.click();
}
public void TypesOflinkedlist_link() {
	TypesOfLinkedList.click();
}
public void ImplementLinkedList() {
	ImplementListLink.click();
}
public void TraversalLink() {
	Traversal.click();
}
public void InsertionLink() {
	Insertion.click();
}
public void DeletionLink() {
	Deletion.click();
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
public void Sign_out() {
	Sign_out.click();
}
public void Title_alert() {
	String actual_msg=alert.getText();
	//System.out.println(actual_msg);
	Assert.assertEquals(actual_msg, expected_msg);
		
	}

}
