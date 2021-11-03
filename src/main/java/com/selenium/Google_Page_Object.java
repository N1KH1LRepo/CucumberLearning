package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Page_Object {
		WebDriver driver=null;
		
		By textbox=By.name("q");
		By Button=By.className("gNO89b");
		
		//Cosntructor for using test class driver object
		public Google_Page_Object(WebDriver driver) {
			this.driver=driver;
			}
		public void textbox(String text)
		{
			driver.findElement(textbox).sendKeys(text);
		}
		
		public void SearchButton()
		{
			driver.findElement(Button).sendKeys(Keys.RETURN);
		}
}
