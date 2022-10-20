package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.HomePage;
import POM.LoginPage;

public class Base extends ReadDataObjectArray {
	public WebDriver driver;

	
	@BeforeMethod
	public void logintoapp() throws InterruptedException
	{   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.actitime.com");
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
	}
	@AfterMethod
	public void logout() {
		HomePage h=new HomePage(driver);
		h.logoutMethod();
		driver.quit();
	}

}
