package com.impor.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataFromThePropertyFile {
	 Properties prop;
	@BeforeClass
	public  void DataFromThePropertyFile() throws IOException
	{
		 prop = new Properties();
		String path ="C:\\Users\\Asus\\eclipse-workspace\\impor\\Config.properties";
		FileInputStream file = new FileInputStream(path);
		prop.load(file);
	}
	@Test
	public  void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromejar\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("userName"));
	}


}
