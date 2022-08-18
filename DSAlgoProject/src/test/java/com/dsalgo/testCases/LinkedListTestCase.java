package com.dsalgo.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dsalgo.pageObjects.HomePagePageObjects;
import com.dsalgo.pageObjects.LinkedListPageObjects;

public class LinkedListTestCase extends BaseClass {
	@Test
		public void linkedlist() throws IOException {
		logger=Logger.getLogger(LinkedListTestCase.class);

		HomePagePageObjects homepage = new HomePagePageObjects(driver);
		homepage.ClickLinkedList();
		
		LinkedListPageObjects linkedlist=new LinkedListPageObjects(driver);
		linkedlist.Introduction_link();
		logger.info("Clicked Introduction link in linked list");
		Actions actions=new Actions(driver);
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in first linked list link text editor");
		driver.navigate().back();
		
		linkedlist.Createlinkedlist_link();
		logger.info("Clicked Createlinkedlist link in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in second linked list link text editor");
		driver.navigate().back();
		
		linkedlist.TypesOflinkedlist_link();
		logger.info("Clicked TypesOflinkedlist link in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in third linked list linktext editor");
		driver.navigate().back();
		
		linkedlist.ImplementLinkedList();
		logger.info("Clicked ImplementLinkedList link in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in fourth linked list link text editor");
		driver.navigate().back();

		linkedlist.TraversalLink();
		logger.info("Clicked TraversalLink in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in fifth linked list link text editor");
		driver.navigate().back();

		linkedlist.InsertionLink();
		logger.info("Clicked InsertionLink in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in sixth linked list link text editor");
		driver.navigate().back();

		linkedlist.DeletionLink();
		logger.info("Clicked DeletionLink in linked list");
		actions.moveToElement(linkedlist.Try_Editor).build().perform();
		linkedlist.ClickTryHere();
		linkedlist.WriteHello(pythoncode);
		linkedlist.Run_Command();
		logger.info("written message in seven linked list link text editor");
		driver.navigate().back();

		actions.moveToElement(linkedlist.Sign_out).build().perform();
		linkedlist.Sign_out();
		logger.info("clicked Sign out");
		linkedlist.Title_alert();
		CaptureScreen(driver, "AfterSignedout from linkedlist");
		
	}
	
}