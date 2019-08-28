package com.Exercise.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {


	WebDriver driver = null;
	
	public void setUp()
	{
		
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.exercise1.com/values");
	}
	
	public void getUrl()
	{
		driver.get("https://www.exercise1.com/values");
	}
	
	public void logout()
	{
		
		driver.quit();
		Reporter.log("-----End of test Quit browser");
	}
}
