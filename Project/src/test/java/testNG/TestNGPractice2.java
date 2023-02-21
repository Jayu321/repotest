package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice2 {
	@BeforeTest
	public void befortest()
	{
		System.out.println("this is BEFORETEST");
	}

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is BeforeClass");
	}

	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is Beforemethod");
	}
	
	
	@Test()
	public void test1()
	{
		System.out.println("This Is Test A");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("This Is Test B");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This Is Test C");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("THIS IS Aftermethod");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("THIS IS afterclass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("THIS IS AFTERTEST");
	}
	
}
