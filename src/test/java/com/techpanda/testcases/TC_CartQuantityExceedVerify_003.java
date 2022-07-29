package com.techpanda.testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.techpand.pageObject.CartVerification;

public class TC_CartQuantityExceedVerify_003 extends BaseClass {
	
	
	@Test
	public void verifyCartQuantity() throws Exception{
		CartVerification cv=new CartVerification(driver);
		
		//Click mobile menu
		cv.clickmobileMenu();
		Thread.sleep(3000);
		
		//Click add to cart for Xperia
		cv.addCart();
		
		//adding quantity
		cv.mobileQty("1000");
		Thread.sleep(2000);
		
		//click update
		cv.updateCart();
		String errorText=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
		System.out.println("Error message is: "+errorText);
		
		cv.emptyCart();
		Thread.sleep(2000);
		
		//Verify empty cart
				TakesScreenshot scrnsht = ((TakesScreenshot)driver);
				
				File sht = scrnsht.getScreenshotAs(OutputType.FILE);
				
				String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
				String imgLoc = "verifyEmptyCart"+timeStamp+".png";
				FileHandler.copy(sht, new File(System.getProperty("user.dir")+ "/photos/"+imgLoc));
			}
}

