package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class CreateType_work {
	
	
	@Test(priority=2 )
	public void create() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Assert.fail();
	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		LoginPage a= new LoginPage(driver);
		a.loginMethod();
		HomePage Page=new HomePage(driver);
	    Page.settingsMethod();
		Page.typeWork();
		Page.createType();
		Page.enterWork();
		Page.sub();
		Page.logoutMethod();
		driver.quit();
	}
	
	@Test(priority=1 , invocationCount = 2 ,dependsOnMethods ="create" )
	public void task() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		LoginPage a= new LoginPage(driver);
		a.loginMethod();
		
		HomePage h=new HomePage(driver);
		h.taskMethod();
		Thread.sleep(4000);
		driver.quit();
	}

	
	
	
}
