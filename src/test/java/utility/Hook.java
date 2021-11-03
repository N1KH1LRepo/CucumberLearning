package utility;

import java.net.MalformedURLException;

public class Hook {
	
	private static WebDriver driver;
	
	@Before("@web")
	public void static()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("username"))
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlywait(30, TimeUnit.SECONDS);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
