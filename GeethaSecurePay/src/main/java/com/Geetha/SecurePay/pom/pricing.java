package com.Geetha.SecurePay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Basepage;

public class pricing extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://www.polipayments.com/']")
	private WebElement learnmore;
	
	public pricing(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifypageloadMethod()
	{
		explicitwait(driver, 500, "//a[@href='https://www.polipayments.com/']");
	}
	
	public void learnmoreMethod()
	{
		learnmore.click();
	}
	

}
