package com.Geetha.SecurePay.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.Geetha.SecurePay.generics.Basetest;
import com.Geetha.SecurePay.pom.GoogleHome;
import com.Geetha.SecurePay.pom.PoliPayments;
import com.Geetha.SecurePay.pom.SalesEnquiryDeatils;
import com.Geetha.SecurePay.pom.SearchResults;
import com.Geetha.SecurePay.pom.SecurePayHome;
import com.Geetha.SecurePay.pom.pricing;

public class GoogleHomeTest extends Basetest
{
	
	@Test
	  public void seraching() throws AWTException, IOException
	  {
		GoogleHome serach= new GoogleHome(driver);
		serach.GoogleHomesearchMethod();
	
	    SearchResults result =new SearchResults(driver);
	    result.SearchResultsMethod();
	
	    SecurePayHome homepage=new SecurePayHome(driver);
	    homepage.pricingMethod();
	    homepage.StandardPricingMethod();
	    
	    pricing pricinglink =new pricing(driver);
	    pricinglink.verifypageloadMethod();
	    pricinglink.learnmoreMethod();
	    
	    PoliPayments sell= new PoliPayments(driver);
	    sell.sellLinkMethod();
	    sell.makeSalesEnquiryMethod();
	    
	    SalesEnquiryDeatils details= new SalesEnquiryDeatils(driver);
	    details.submitMethod();
	

}

		
}
