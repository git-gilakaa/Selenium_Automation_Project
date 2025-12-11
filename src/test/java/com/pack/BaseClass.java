package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
