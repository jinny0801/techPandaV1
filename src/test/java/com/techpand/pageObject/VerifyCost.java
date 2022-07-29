package com.techpand.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyCost {
	
	WebDriver ldriver;
	public VerifyCost(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//Finding elements
	@FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
	WebElement mobileMenu;
	
	@FindBy(id="product-collection-image-1")
	WebElement xperia;
	
	public void clickmobileMenu() {
		mobileMenu.click();
	}
	
	public void clickxperia() {
		xperia.click();
	}
}
