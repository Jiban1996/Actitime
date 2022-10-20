package Generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void satya()
	{
		System.out.println("satya");
	}
	
	@Test
	public void sangam()
	{
		System.out.println("sangam");
	}
	
	@Test
	public void ashish()
	{
		System.out.println("ashish");
	}
	
	@BeforeTest
	public void sourabh()
	{
		System.out.println("sourabh");
	}
	
	@BeforeTest
	public void mihir()
	{
		System.out.println("mihir");
	}
	
	@BeforeMethod
	public void rajesh()
	{
		System.out.println("rajesh");
	}
	
	@BeforeSuite
	public void vicky()
	{
		System.out.println("vicky");
	}
	
	@BeforeClass
	public void biswa()
	{
		System.out.println("biswa");
	}
	
	@AfterTest
	public void raja()
	{
		System.out.println("raja");
	}
	
	@AfterMethod
	public void badal()
	{
		System.out.println("badal");
	}
	
	@AfterSuite
	public void prashant()
	{
		System.out.println("prashant");
	}
	
	@AfterClass
	public void bikram()
	{
		System.out.println("bikram");
	}
}