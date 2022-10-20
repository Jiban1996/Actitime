package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{   public WebDriver driver;

	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(id="container_tasks")
	private WebElement tasksLink;
	
	@FindBy(xpath = "//a[@class='item active']")
	private WebElement View_Time_Track;
	
	@FindBy(xpath = "//a[@class='item active']")
	private WebElement Lock_Time_Track;
	
	@FindBy(xpath = "//a[.='Approve Time-Track']")
	private WebElement Approve_Time_Track;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsLink;
	
	@FindBy(xpath ="//a[.='Types of Work']")
	private WebElement Type_of_work;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement CreateWork;
	
	@FindBy(  xpath="//input[@name='name']")
	private WebElement Text;
	
	@FindBy(xpath = "(//input[@type='submit'])")
	private WebElement Submit;
	

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logoutMethod()
	{
		logoutLink.click();
		
	}
	public void taskMethod()
	{
		tasksLink.click();
	}
	public void view_Time_Track() {
		View_Time_Track.click();
	}
	public void lock_time_track() {
		Lock_Time_Track.click();
	}
	public void approve_time_track(){
		Approve_Time_Track.click();
	}
	public void settingsMethod()
	{
		settingsLink.click();
	}
	public void typeWork() {
		Type_of_work.click();
	}
	public void createType() {
		CreateWork.click();
	}
	public void enterWork() {
		Text.sendKeys("yyrrtnfff");
	}
	public void sub() {
		Submit.click();
	}

	
}