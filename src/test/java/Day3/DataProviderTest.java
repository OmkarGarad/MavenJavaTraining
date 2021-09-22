package Day3;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "login")
  public void f(String uname ) throws Exception {
	 
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      System.out.println(uname);
      driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
      driver.findElement(By.name("txtUsername")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("txtUsername")).sendKeys(uname);
      Thread.sleep(2000);
      driver.findElement(By.name("txtPassword")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("txtPassword")).sendKeys("admin123");
      Thread.sleep(2000);
      driver.findElement(By.id("btnLogin")).click();
      Thread.sleep(2000);
      String Element = driver.findElement(By.linkText("Dashboard")).getText();
      System.out.println(Element);

  }


@DataProvider(name="login")
  public Object[]  getdata() {
    {
      Object[] data= { "admin", "admin123", };
      //Object[] data1 = { "omkar", "123456" };
      return data;
    }
	
	
  }
}
