package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonBrowserClass {
	
	//instance of singlton class
	private static SingletonBrowserClass instanceOfSingletonBrowserClass=null;
	
	private WebDriver driver;
	
	//Constructor
	private SingletonBrowserClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\NIKH1\\Selenium\\Selenium_Data\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	//To create instance of class
	public static SingletonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass==null) {
			instanceOfSingletonBrowserClass = new SingletonBrowserClass();
		}
		
		return instanceOfSingletonBrowserClass;
	}
	
	//To get driver
	public WebDriver getDriver()
	{
		return driver;	
	}
	
}
