package com.mindtree.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mindtree.Reusable.ReusableMethod;
import com.mindtree.Uistore.LoginUistore;


public class LoginPageObjects extends LoginUistore {
public WebDriver driver;
ReusableMethod rm =new ReusableMethod();
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Login()
    {
		try
		{
			WebElement ClickLogin=driver.findElement(Login);
			ClickLogin.click();
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Login");
			
		}
		
    }
	public void Logindetails()
    {
		try
		{
			WebElement Clickemail=driver.findElement(User);
			Clickemail.sendKeys(rm.getUsername());
			Clickemail.sendKeys(Keys.TAB);
			WebElement Clickpassword=driver.findElement(password);
			Clickpassword.sendKeys(rm.getPassword());
			WebElement ClickSignin=driver.findElement(Sigin);
			ClickSignin.click();
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to User");
			
		}
		
    }
	public void Username()
    {
		try
		{
			WebElement HeadCheck=driver.findElement(Username);
			String Actualvalue=HeadCheck.getText();
			String Expectedvalue="Testaccount T";
			Assert.assertEquals(Expectedvalue,Actualvalue);
			System.out.println((HeadCheck).getText());
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Username");
			
		}
		
    }
	public void dress()
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement ClickSale=driver.findElement(Dress);
			a.moveToElement(ClickSale).contextClick().build().perform();
			WebElement Clickdress=driver.findElement(SummerDress);
			Clickdress.click();
			
		}
		catch(Exception e)
		{
			System.out.println("cannot able to dress");
			
		}
		
    }
	public void dress1()
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement Clickdress1=driver.findElement(Dress1);
			a.moveToElement(Clickdress1).contextClick().build().perform();
			WebElement ClickComp1=driver.findElement(comp1);
			ClickComp1.click();
			WebElement Clickdress2=driver.findElement(Dress2);
			a.moveToElement(Clickdress2).contextClick().build().perform();
			WebElement ClickComp2=driver.findElement(comp2);
			ClickComp2.click();
			WebElement ClickCompprod=driver.findElement(comppro);
			ClickCompprod.click();
			WebElement CheckProd1=driver.findElement(prop1);
			System.out.println((CheckProd1).getText());
			WebElement CheckProd2=driver.findElement(prop2);
			System.out.println((CheckProd2).getText());
		}
		catch(Exception e)
		{
			System.out.println("cannot able to dress1");
			
		}
		
    }
	public void Cart()
    {
		try
		{
			WebElement ClickCart1=driver.findElement(cart1);
			ClickCart1.click();
			WebElement Pricecart=driver.findElement(pricecart);
			String Pricevalue=Pricecart.getText();
			String Expectedpricevalue="$28.98";
			WebElement Pricecarttotal=driver.findElement(pricecarttotal);
			String Pricevaluetotal=Pricecarttotal.getText();
			Assert.assertEquals(Pricevalue,Pricevaluetotal);
			System.out.println(Expectedpricevalue);
			WebElement ClickCheckout=driver.findElement(proceedcheckout);
			ClickCheckout.click();
			WebElement CheckPricetotal=driver.findElement(pricetotalcart);
			String Total=CheckPricetotal.getText();
			Assert.assertEquals(Expectedpricevalue,Total);
			/*WebElement ClickClose1=driver.findElement(close1);
			ClickClose1.click();
			WebElement ClickCart2=driver.findElement(cart2);
			ClickCart2.click();
			Actions a=new Actions(driver);
			WebElement Clickcart=driver.findElement(cart);
			a.moveToElement(Clickcart).contextClick().build().perform();
			WebElement ClickCheckout=driver.findElement(checkout);
			ClickCheckout.click();*/
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Cart");
			
		}
		
    }
	/*public void Price()
    {
		try
		{
			WebElement CheckPrice=driver.findElement(pricetotalcart);
			String Total=CheckPrice.getText();
			System.out.println(Total);
		}
		catch(Exception e)
		{
			System.out.println("cannot able to Price");
			
		}
		
    }*/
}