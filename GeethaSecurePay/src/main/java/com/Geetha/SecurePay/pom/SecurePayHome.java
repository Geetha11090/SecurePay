package com.Geetha.SecurePay.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Basepage;

public class SecurePayHome extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Pricing']")
	private WebElement pricing;
	
	@FindBy(xpath="//a[contains(text(),'Standard pricing')]")
	private WebElement standardPricing;
	
	
	public SecurePayHome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void pricingMethod()
	{
		explicitwait(driver, 100, "//span[normalize-space()='Pricing']" );
		movetoelement(driver, pricing);
	}
	
	public void StandardPricingMethod()
	{
		explicitwait(driver, 100, "//a[contains(text(),'Standard pricing')]" );
		standardPricing.click();
	}

}
