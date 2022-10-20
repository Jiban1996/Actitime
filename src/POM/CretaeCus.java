package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CretaeCus {
	public WebDriver driver;
	@FindBy(xpath = "//div[@class='title ellipsis']")
	private WebElement Addnew;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcus;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entername;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descr;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement customer;
	
	
	
	
	public CretaeCus(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void add() {
		Addnew.click();
	}
	public void newcuso() {
		newcus.click();
	}
	public void enternameof(String name ,String desc) {
		entername.sendKeys(name);
	descr.sendKeys(desc);}
	
	public void cus() {
		customer.click();
	}
	
	
	
	}
		
	


