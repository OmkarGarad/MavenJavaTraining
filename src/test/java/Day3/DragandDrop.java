package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	@Test
	public void dragdrop() {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	                
	        driver.manage().window().maximize();  
	        
	        
	        //drag and drop
	      /*  driver.get("https://jqueryui.com/droppable/");
	        WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	        driver.switchTo().frame(frm);
	        WebElement ele1 = driver.findElement(By.id("draggable"));
	        WebElement ele2 = driver.findElement(By.id("droppable"));
	        Actions act = new Actions(driver);
	        act.dragAndDrop(ele1, ele2).build().perform();*/
	        
	        //mouse hover
	        /*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        WebElement mouse = driver.findElement(By.id("mousehover"));
	        
	        JavascriptExecutor js  = (JavascriptExecutor)driver;
	        js.executeScript("window.scroll(0,1300)");
	        Actions act = new Actions(driver);
	        act.moveToElement(mouse).perform();*/
	        
	        
	        //select
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        WebElement ele = driver.findElement(By.id("dropdown-class-example"));
	        Select sel  = new Select(ele);
	      //sel.selectByIndex(2);
	      //  sel.selectByValue("option1");
	        sel.selectByVisibleText("Option1");
	        
	}



}
