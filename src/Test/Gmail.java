package Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Gmail_log_in;

public class Gmail {
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Gmail_log_in g=new Gmail_log_in(driver);
		g.enteremail();
		g.next();
	
	
		
		WebElement a=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
		String s=a.getText();
		String b="Enter an email or phone number";
		Assert.assertEquals(s,b);
		System.out.println("its working");
	}

}
