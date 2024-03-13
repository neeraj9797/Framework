package Generic;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Util.fetchProperty;

public class basepage 
{
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser() throws FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./softwares.chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(fetchProperty.getpro());
	
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
}

