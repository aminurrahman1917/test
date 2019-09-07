package com.fd.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
	


	

	public static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		
		WebDriver drive;
		
		// how to read properties file
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("E:\\workspace\\FreshDirect\\"
				+ "src\\main\\java\\com\\fd\\pages\\config.property");
		// to load the properties file use load method
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		else {
			System.out.println("No browser found");
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//*[@id=\'locabar_user_login_link\']/div/div/div")).click();
		driver.findElement(By.name("//*[@id=\'email\']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("//*[@id=\'password\']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id=\'signinbtn\']")).click();
		
		
		
	}

}
