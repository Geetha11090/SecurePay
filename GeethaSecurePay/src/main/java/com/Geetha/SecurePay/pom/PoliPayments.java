package com.Geetha.SecurePay.pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Basepage;

public class PoliPayments extends Basepage
{
	WebDriver driver;
	
	@FindBy(xpath="//body/div/div[@id='navmenu']/ul/li[3]/a[1]")
	private WebElement sellLink;
	
	@FindBy(xpath="//a[normalize-space()='Make a sales enquiry']")
	private WebElement makeSalesEnquiry;
	
	public PoliPayments(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sellLinkMethod()
	{
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles.size());
		System.out.println(driver.getTitle());
		ArrayList<String> al=new ArrayList<>();
		al.addAll(windowhandles);
		driver.switchTo().window(al.get(1));
		String actualtitle= driver.getTitle();
		System.out.println(driver.getTitle());
		if(actualtitle.equalsIgnoreCase("POLi Payments | Australia’s leading real-time online debit payment system"))
		{
			System.out.println("POLI site is opened and loaded in the new window");
		}
		
		else
		{
			System.out.println("POLI site isn't opened");
		}
		
		movetoelement(driver, sellLink);
	}
	
	public void makeSalesEnquiryMethod()
	{
		makeSalesEnquiry.click();
	}
	

}
