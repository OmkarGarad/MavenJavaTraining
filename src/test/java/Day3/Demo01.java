package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo01 {
	@Test
	public void test() {
	WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/buttons");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//button[text()='Click Me']")).click();
   String text= driver.findElement(By.xpath("//button[text()='Click Me']")).getText();
System.out.println(text);
	
	}}
