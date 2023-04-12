package com.impor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestting {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	public void crossBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Chromejar\\chromeDriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckojar\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
