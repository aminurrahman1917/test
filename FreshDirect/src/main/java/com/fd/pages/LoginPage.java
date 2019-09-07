package com.fd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fd.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\'locabar_user_login_link\']/div/div/div")
	WebElement navToSign;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="signinbtn")
	WebElement button;
	
	@FindBy(xpath="//*[@id=\'topnavitem_signup\']/a")
	WebElement signUp;
	
	@FindBy(xpath="/html/body/div[6]/div/a/img")
	WebElement logo;
	
	// using constructor to initialize current class object. this means current class object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions of get title
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validateImage() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		username.sendKeys(pwd);
		button.click();
		
		return new HomePage();
	}
	
	

}
