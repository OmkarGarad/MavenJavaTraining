package javaProgram;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
       // ChromeDriver driver = new ChromeDriver();
		WebDriver driver =  new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
System.out.println("enter");
	}
	}


	


