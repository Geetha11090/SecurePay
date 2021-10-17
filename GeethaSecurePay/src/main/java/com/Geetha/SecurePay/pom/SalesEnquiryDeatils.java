package com.Geetha.SecurePay.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Geetha.SecurePay.generics.Autoconstant;
import com.Geetha.SecurePay.generics.Basepage;
import com.Geetha.SecurePay.generics.Excellibrary;

public class SalesEnquiryDeatils extends Basepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='Company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='Description']")
	private WebElement enquiry;
	
	@FindBy(xpath="//input[@id='Phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='Website']")
	private WebElement website;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email;
	
	public SalesEnquiryDeatils (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void submitMethod() throws IOException
	{
		company.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 0));
		firstName.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 1));
		lastName.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 2));
		enquiry.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 3));
		phone.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 4));
		website.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 5));
		email.sendKeys(Excellibrary.getcellvalue(Autoconstant.excel_sheet, 1, 6));
	}
	

}
