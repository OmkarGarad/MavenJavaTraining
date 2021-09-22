package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {
	@Test(dataProvider="Login")
    
    public void OrangeHRM_Login(String uname) {
    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println(uname);
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.findElement(By.name("txtUsername")).clear();
        driver.findElement(By.name("txtUsername")).sendKeys(uname);
        driver.findElement(By.name("txtPassword")).clear();
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        String Element = driver.findElement(By.linkText("Dashboard")).getText();
        System.out.println(Element);
}




@DataProvider(name="Login")
public Object[] getData()
{
    Object[] data = {"Admin","abcd","XYZ"};
    return data;
}


}
