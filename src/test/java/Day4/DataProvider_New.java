package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_New {
	WebDriver driver;
	   @Test(dataProvider="LoginScenario")
	      public void LoginAllCases(String uName, String uPassword, String expectedMessage) throws InterruptedException 
	    {
	     
	        
		   driver.findElement(By.name("txtUsername")).clear();
		   driver.findElement(By.name("txtUsername")).sendKeys(uName);
		   driver.findElement(By.name("txtPassword")).clear();
		   driver.findElement(By.name("txtPassword")).sendKeys(uPassword);
		   driver.findElement(By.name("Submit")).click();
	     
	     try 
	     {
	      
	      Boolean boolDisplayed = driver.findElement(By.linkText("Dashboard")).isDisplayed();
	      
	      if (boolDisplayed) 
	      {
	       System.out.println("Successfull Login");
	       String strCurrDashboardLabel = driver.findElement(By.linkText("Dashboard")).getText();   
	       Assert.assertEquals(expectedMessage, strCurrDashboardLabel);
	     //Logout from the application
	       driver.findElement(By.partialLinkText("Welcome")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.linkText("Logout")).isDisplayed();
	       driver.findElement(By.linkText("Logout")).click();
	       driver.findElement(By.name("Submit")).isDisplayed();  
	      }
	      else {
	       System.out.println("Unsuccessfull Login");
	       String strInvalidLoginMessage = driver.findElement(By.id("spanMessage")).getText();
	       Assert.assertEquals(expectedMessage, strInvalidLoginMessage);
	      }

	 

	     }
	     catch(Exception e)
	     {
	       e.printStackTrace();
	     } 

	 

	      }
	        
	      @BeforeTest
	      public void LaunchBrowser() {
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	       
	      }

	 

	      @AfterTest
	      public void CloseBrowser() {
	    	  driver.quit();
	      }

}
