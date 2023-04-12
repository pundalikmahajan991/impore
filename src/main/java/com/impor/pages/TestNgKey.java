package com.impor.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgKey {
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@Test(invocationCount=3)
	public void TestMethod1()
	{
		System.out.println("TestMethod1");
	}
	@Test(dependsOnMethods = { "TestMethod1()"})
	public void TestMethod2()
	{
		int a =5; int b = 5;
		int c = a/b;
		System.out.println(c);
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}

}
