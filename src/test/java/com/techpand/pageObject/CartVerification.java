package com.techpand.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartVerification {

	WebDriver ldriver;
	
	public CartVerification(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
	WebElement mobileMenu;
	
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")
	WebElement qty;
	
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")
	WebElement updateButton;
	
	@FindBy(id="empty_cart_button")
	WebElement emptyButton;
	
	public void clickmobileMenu() {
		mobileMenu.click();
	}
	
	public void addCart() {
		addToCart.click();
	}
	
	public void mobileQty(String quantity) {
		qty.sendKeys(quantity);
	}
	
	public void updateCart() {
		updateButton.click();
	}
	
	public void emptyCart() {
		emptyButton.click();
	}
}
