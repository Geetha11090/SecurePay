package com.Geetha.SecurePay.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



public class Basepage 
{
	public void movetoelement(WebDriver driver, WebElement element)
	{
		Actions act =new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void explicitwait(WebDriver driver, int time,String expression)
    {
    	WebDriverWait wait=new WebDriverWait(driver,time);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
    	
    }
	
	public void jsexecutor(WebDriver driver, int x, int y)
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
     	//js.executeScript("arguments[0].scrollIntoView()", ele);
		js.executeScript("window.scrollBy("+x+" , "+y+")");

    }

	public void robotenter() throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
}
