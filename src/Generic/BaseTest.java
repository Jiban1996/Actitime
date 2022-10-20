package Generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import POM.HomePage;
import POM.LoginPage;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		System.out.println("execution started");
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
	}
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void logoutfromapp()
	{
		HomePage home=new HomePage(driver);
		home.logoutMethod();
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("execution completed");
	}
}