package com.techpand.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileListPage {
	
	WebDriver ldriver;
	
	public MobileListPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finding elements
	@FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
	WebElement mobileMenu;
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	public WebElement sortby;
	
	//Action methods
	public void clickmobileMenu() {
		mobileMenu.click();
	}
	
	/*public void clicksortby() {
		sortby.click();
	}*/

}
