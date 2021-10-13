package com.mindtree.Runner;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.LoginPageObjects;
import com.mindtree.Reusable.ReusableComponents;
import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Utilities.ExcelDriven;
import com.mindtree.Utilities.Sendmail;


public class Runner extends ReusableComponents
{
	
	//Logger logger=Logger.getLogger(ReusableComponents.class);
	@BeforeClass
	public void initialize() throws IOException {
		try {
			driver=setup();
			driver.get(baseURL);
			logger.info("Url is opened");
		}catch(Exception e) {
			
		}
		
	}
	@Test
	
	public void OrderDress() {
		driver.get(baseURL);
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.Login();
		lp.Logindetails();
		lp.Username();
		lp.dress();
		lp.dress1();
		lp.Cart();
	}
	
	
	
}
