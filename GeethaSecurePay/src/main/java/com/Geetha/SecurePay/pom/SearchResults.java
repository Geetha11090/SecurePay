package com.Geetha.SecurePay.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Basepage;

public class SearchResults extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//h3[contains(text(),'SecurePay | Trusted Online Payment Gateway Provide')]")
	private WebElement clickonSecurePaylink;
	
	public SearchResults(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void SearchResultsMethod()
	{
		clickonSecurePaylink.click();
	}

}
