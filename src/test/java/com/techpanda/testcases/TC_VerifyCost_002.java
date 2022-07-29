package com.techpanda.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.techpand.pageObject.VerifyCost;

import junit.framework.Assert;

public class TC_VerifyCost_002 extends BaseClass{
	
	@Test
	public void VerifyCost() throws Exception{
		
		VerifyCost vc = new VerifyCost(driver);
		
		vc.clickmobileMenu();
		Thread.sleep(3000);
		
		//Xperia price in List page 
		String xperiaPriceList= driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
		System.out.println("Xperia price in list page: "+xperiaPriceList);
		
		vc.clickxperia();
		Thread.sleep(2000);
		
		//Xperia price in detail page
		String xperiaPriceDetail = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span")).getText();
		System.out.println("Xperia price in Detail page: "+xperiaPriceDetail);
		
		Assert.assertEquals(xperiaPriceList, xperiaPriceDetail);
		
		System.out.println("Verified");
	}

}
