package assertionhard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {

	@Test
	public void demoofassertion()
	{
		//luanch chromebrowser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
        
        //luanch url
        driver.get("https://testautomationpractice.blogspot.com/");
       String acttitle=driver.getTitle();
       System.out.println(acttitle);
       
        String exptitle= "Automation Testing Practice";
        System.out.println(exptitle);
        
        //to creat a softassertobject
        
        // ast.assertEquals(exptitle, acttitle);
        // ast.assertEquals(exptitle, acttitle, "Ttile is not verified");
        
        //or
        // boolean res=  exptitle.equals(acttitle);
        // ast.assertTrue(res);
        
      
        
        SoftAssert ast=new SoftAssert();
        ast.assertNotEquals(exptitle, acttitle);
        //  ast.assertNotEquals(exptitle, acttitle, "title ios true");
        
        //ast.fail();
    
       System.out.println("wikipidia show symbol");
     
       WebElement wikisymbol= driver.findElement(By.className("wikipedia-icon"));
       boolean result=  wikisymbol.isDisplayed();
       ast.assertTrue(result);
       
        ast.assertAll();
        driver.close();
	}
}
