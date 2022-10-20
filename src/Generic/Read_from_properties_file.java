package Generic;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_from_properties_file {
	
	@Test
	public void login() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		File file=new File("./Files/Jiban.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		
		
		WebElement username=driver.findElement(By.xpath(prop.getProperty("Usernamelc")));
		username.sendKeys(prop.getProperty("Username"));
		
		WebElement password=driver.findElement(By.xpath(prop.getProperty("Pwdlc")));
		password.sendKeys(prop.getProperty("Password"));
		
		WebElement login=driver.findElement(By.xpath(prop.getProperty("loginbutton")));
		login.click();
		
		Thread.sleep(3000);
		 driver.quit();
		
		
	}

}
