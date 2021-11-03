/*package com.selenium;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition {
	
	@Given("^User have opened the browser$")
	public void i_have_open_the_browser() throws Throwable {
		
		System.out.println("Opened the browser successfully");
	}
	
	@When("^User have opened EasyTesting website$")
	public void i_open_EasyTesting_website() throws Throwable {
		
		System.out.println("Opened the Login page successfully");
	}
	
	@When("^User entered username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		
		System.out.println("Enter username as "+arg1+" and Password as "+arg2);
	}
	
	@Then("^Login button should exist$")
	public void login_button_should_exist() throws Throwable {
		
		System.out.println("Button pressed successfully");
	}

}*/


/*package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.textng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step_Definition {
	WebDriver driver;	
	@Given("^User have opened the browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\NIKH1\\Selenium\\Selenium_Data\\chromedriver.exe");
		driver=new ChromeDriver();
		//System.out.println("Opened the browser successfully");
	}
	
	@When("^ User have opened Google webpage and verify the  title$")
	public void Navigate_to_Google_Page() throws Throwable {
		
		driver.get("www.google.com");
		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
		
		//soft assert applied to verify the title
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		//System.out.println("Opened the Login page successfully");
	}
	
	@When("^User entered Text as  \"([^\"]*)\" to search$")
	public void Search(String arg1) throws Throwable {
		
		Google_Page_Object pom=new Google_Page_Object(driver);
		pom.textbox(arg1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pom.SearchButton();
		//System.out.println("Enter username as "+arg1+" and Password as "+arg2);
	}

}*/

package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class Step_Definition {
	WebDriver driver;	
	@Given("^User have opened the browser$")
	public void open_the_browser() throws Throwable {
		SingletonBrowserClass sbc1= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver1 = sbc1.getDriver(); 		
		driver1.get("https://www.google.com");
		
		SingletonBrowserClass sbc2= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver2 = sbc2.getDriver();
		driver2.get("https://www.login.yahoo.com");
		//System.out.println("Opened the browser successfully");
	}
}