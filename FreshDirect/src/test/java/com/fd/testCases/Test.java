package com.fd.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.expedia.com");
		driver.findElement(By.xpath("//*[@id=\'header-account-menu\']")).click();
		driver.findElement(By.xpath("//*[@id=\'account-signin\']")).click();
		driver.findElement(By.xpath("//*[@id=\'gss-signin-email\']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//*[@id=\'gss-signin-password\']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\'gss-signin-submit\']")).click();
		
		

	}

}
