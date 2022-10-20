package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;

public class Actitime_login_logout  {
 @Test
 public void Login_logout() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		LoginPage a= new LoginPage(driver);
		a.loginMethod();
		HomePage b= new HomePage(driver);
		b.logoutMethod();
		
 }
}

