package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomModules.NopCommerseDemoStore;
import pomModules.NopCommerseDemoStoreRegister;

public class Nnnoooo {
	public class VerifyregistrationPage {
		private WebDriver driver;
		
		private  NopCommerseDemoStore register;
		private  NopCommerseDemoStoreRegister registrationpage;
		
		@Parameters("browsersall")
		@BeforeTest
		public void luanchbrowser(String browser)
		{
			if(browser.equals("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
			}
			
			if(browser.equals("firefox"))
			{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        
			}
			
			if(browser.equals("edge"))
			{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	        driver = new EdgeDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		
		@BeforeClass
		public void pomclassobjects()
		{
			 register = new  NopCommerseDemoStore(driver);
			 registrationpage = new  NopCommerseDemoStoreRegister(driver);
		}
		
		@BeforeMethod
		public void launchapplication()
		{
			driver.get("https://demo.nopcommerce.com/");
			register.clickonRegisterOption();
			   
			  String title= driver.getTitle();
			  System.out.println(title);
		}

		
		@Test
		public void verifyregistrationpage()
		{
			registrationpage.SelectMaleRadiobutton();
			registrationpage.EnterFirstname();
			registrationpage.EnterLastName();
			registrationpage.BirthDate();
			registrationpage.BirthMonth();
			registrationpage.BirthYear();
			registrationpage.EnterEmail();
			registrationpage.EnterComapanyName();
			registrationpage.EnterPassword();
			registrationpage.ReEnterPassword();
			registrationpage.HitRegisterButton();
			registrationpage.HitContinueButton();
			
		}
		
		@AfterClass
		public void emptypomobjectforfirstbrowser()
		{
			 register = null;
			 registrationpage= null;
		}
		
		@AfterTest
		public void emptybrowser()
		{
			driver.close();
			driver=null;
			System.gc();
		}
		
	}

}
