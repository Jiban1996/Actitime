package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_log_in {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement Email_Input;
	
	@FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")
	private WebElement NextButtun;
	
	@FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[2]")
	private WebElement Image;
	
	
	
	public Gmail_log_in(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void enteremail() {
		Email_Input.sendKeys("");
		
	}
	public void next() {
		NextButtun.click();
	}
	
}
