package Test;

import org.testng.annotations.Test;

import Generic.Base;
import POM.CretaeCus;
import POM.HomePage;

public class Createnewcustomer extends Base{
	@Test(dataProvider = "customerdata")
	public void createnewcustomer(String name ,String desc) throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.taskMethod();
		CretaeCus c=new CretaeCus(driver);
		c.add();
		c.newcuso();
		c.enternameof(name,desc);
		Thread.sleep(5000);
		c.cus();
		
		
		
	}

}
