package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.basepage;

public class pom_facebook extends basepage
{
  //declaration
	@FindBy(name="email")
	private WebElement Username;
	
	@FindBy(name="pass")
	private WebElement password;
	

	@FindBy(name="login")
	private WebElement login;
	
	//initialization
	
	public pom_facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void passdata(String un)
	{
		Username.sendKeys(un);
	}
	public void passdata1(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void passdata2()
	{
		login.click();
	}
	
}
