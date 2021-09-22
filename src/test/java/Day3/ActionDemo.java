package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/buttons");
	    Actions act = new Actions(driver);
	    //double click
	    WebElement ck = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	    act.doubleClick(ck).perform();
	    System.out.println(ck.getText());
	    //Click
	    WebElement ck1 = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    act.click(ck1).perform();
	    System.out.println(ck1.getText());
	    //Right Click
	    WebElement ck2 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	    act.contextClick(ck2).perform();
	    System.out.println(ck2.getText());
	    //click and hold
	    WebElement ck4 = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    act.clickAndHold(ck4).perform();
	    //hover mouse
	   WebElement ck5 = driver.findElement(By.xpath("//button[text()='Click Me']"));
	   act.moveToElement(ck5).perform();
	   act.keyDown(Keys.ARROW_DOWN).perform();
	   
	   
	}

}
