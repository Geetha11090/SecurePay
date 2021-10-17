package com.Geetha.SecurePay.pom;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Basepage;

public class GoogleHome extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@title='Search']")
	 private WebElement serachcontext;
	
	public GoogleHome(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public void GoogleHomesearchMethod() throws AWTException
	{
		serachcontext.sendKeys("SecurePay");
		robotenter();
	}

}
