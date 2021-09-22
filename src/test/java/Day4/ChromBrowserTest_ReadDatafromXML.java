package Day4;

import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromBrowserTest_ReadDatafromXML {
	

	@Test
	 
	 @Parameters(username, password)
	
	  public void ChromeBrowser(String uname, String pwd) throws InterruptedException, Exception {
	      
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        WebDriverManager.firefoxdriver().setup();
	        WebDriverManager.edgedriver().setup();

	 

	        driver.manage().window().maximize();
	        
	        File file = new File("C:\\Users\\Administrator\\Desktop\\Omkar Training\\JavaTraining\\src\\test\\java\\Day4\\OrangeHRM.properties");
	          
	        FileInputStream fInput= new FileInputStream(file);
	          
	        Properties prop = new Properties();
	          
	        prop.load(fInput);
	          
	        System.out.println(prop.getProperty("objUsername"));
	          
	        
	      //This will store or rememember the cookies or navigation in terms of back and forward
	        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	        driver.findElement(By.name("txtUsername")).sendKeys(uname);
	        driver.findElement(By.name("txtPassword")).sendKeys(pwd);
	        driver.findElement(By.id("btnLogin")).click();
	        //Verify that Dashboard page displayed
	        Thread.sleep(3000);
	        String ActElement = driver.findElement(By.linkText("Dashboard")).getText();
	        String ExpElement="Dashboard";
	        AssertJUnit.assertEquals(ActElement, ExpElement);
	        System.out.println(ActElement);
	        //----------------To Verify Logout Function----------------
	        
	        /* driver.findElement(By.id("welcome")).click();
	          Thread.sleep(3000);
	            driver.findElement(By.linkText("Logout")).click();
	            String ActLogpanel = driver.findElement(By.id("logInPanelHeading")).getText();
	            String ExpLogpanel="LOGIN Panel";
	            Assert.assertEquals(ActLogpanel, ExpLogpanel);
	            System.out.println(ActLogpanel);*/
	          //----------------To Verify Logout Function without using Assert----------------
	            
	             driver.findElement(By.id("welcome")).click();
	              Thread.sleep(3000);
	                driver.findElement(By.linkText("Logout")).click();
	                boolean res=driver.findElement(By.id("logInPanelHeading")).isDisplayed();
	                AssertJUnit.assertTrue(res);
	        //driver.close();//Close will close only current chrome browser
	        driver.quit();
	  }
	  
}
