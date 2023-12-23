package com.medicare.Scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement loginEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(linkText="Cart")
	WebElement clickCart;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	@Test
	public void user_login()
	{
		loginEmail.sendKeys("shridhar@gmail.com");
		loginpassword.sendKeys("shri@123");
		loginbtn.click();
	}
	
	
	public void click_cart()
	{
		clickCart.click();
	}
	
	
	
	

}


