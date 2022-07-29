package com.techpanda.testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.techpand.pageObject.MobileListPage;

import junit.framework.Assert;

public class TC_MobileMenu_001 extends BaseClass {

	@Test
	public void verifyTitle() throws Exception {
		MobileListPage mlp=new MobileListPage(driver);
		
		//Verify home page
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "Home page");
		System.out.println("Home Page Title is "+pageTitle);
		
		//Click mobile menu
		mlp.clickmobileMenu();
		Thread.sleep(3000);
		
		//Verify mobbile page
		String mobilePage = driver.getTitle();
		Assert.assertEquals(mobilePage, "Mobile");
		System.out.println("Mobile Page Title is "+mobilePage);
		
		//Select sort by
		Select name = new Select(mlp.sortby);
		name.selectByVisibleText("Name");
		Thread.sleep(3000);
		
		//Verify sort by
		TakesScreenshot scrnsht = ((TakesScreenshot)driver);
		
		File sht = scrnsht.getScreenshotAs(OutputType.FILE);
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String imgLoc = "verifySortBy"+timeStamp+".png";
		FileHandler.copy(sht, new File(System.getProperty("user.dir")+ "/photos/"+imgLoc));
	}
}
