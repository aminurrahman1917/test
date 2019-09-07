package com.fd.testCases;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fd.base.TestBase;
import com.fd.pages.HomePage;
import com.fd.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void LoginPageTileTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Grocery Delivery & Grocery Shopping | FreshDirect");
	}
	
	@Test(priority=2)
	public void fdLogo() {
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}
	
	@Test (priority=3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
