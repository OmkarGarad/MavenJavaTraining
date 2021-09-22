package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo01 {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String str = driver.findElement(By.id("txtUsername")).getAttribute("name");
        driver.manage().window().maximize();
        System.out.println(str);

       //driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//driver.findElement(By.xpath("//input[@type='submit']")).click();
///System.out.println("Pass");
	}

}
