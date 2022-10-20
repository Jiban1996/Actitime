package Generic;

import org.testng.annotations.DataProvider;

public class ReadDataObjectArray {
		@DataProvider(name="customerdata") 
		public Object[][] passdata()
		{
Object[][] data=new Object[5][2];
	
		data[0][0] = "abc";
		data[0][1] = "satya";
		
		data[1][0] = "ish";
		data[1][1] = "ashish";
		
		data[2][0] = "dmin";
		data[2][1] = "manager";
		
		data[3][0] = "jesh";
		data[3][1] = "rajesh";
		
		data[4][0] = "ngam";
		data[4][1] = "sangam";
		
		return data;
		}
	}

