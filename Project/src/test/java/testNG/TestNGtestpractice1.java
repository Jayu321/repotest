package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGtestpractice1 {
	
	/*@BeforeTest
	public void befortest()
	{
		System.out.println("BEFORETEST");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Beforemethod");
	}
	*/
	
	@Test(invocationCount=2)
	public void test1()
	{
		System.out.println("username1");
		System.out.println("password1");
	}
	
	/*@Test
	public void test2()
	{
		System.out.println("This Is Test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This Is Test3");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Aftermethod");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("AFTERTEST");
	}*/
}
