package Day4;

public class alartFrameWindows {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Resources\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    //driver.get("https://www.demoqa.com/alerts");
    //driver.get("https://www.demoqa.com/nestedframes");
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_textarea_form");
    //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    //accept, dismiss, getText, sendKeys
   
    //Alert - Interface
    //RemoteAlert - class which implements alert
   
   
   
    /*
    driver.findElement(By.id("alertButton")).click();
    Thread.sleep(2000);
   
    driver.switchTo().alert().accept();
           
    driver.findElement(By.id("timerAlertButton")).click();
    Thread.sleep(6000);
    String str=driver.switchTo().alert().getText();
    System.out.println(str);
   
    driver.switchTo().alert().accept();
   
    driver.findElement(By.id("confirmButton")).click();
    Thread.sleep(2000);
   
    driver.switchTo().alert().dismiss();
           
    driver.findElement(By.id("promtButton")).click();
    Thread.sleep(2000);
   
    driver.switchTo().alert().sendKeys("Selenium");
   
    driver.switchTo().alert().accept();
    */               
   
   
    WebElement ele = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
    driver.switchTo().frame(ele);
    driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("selenium");
   
   
    
}
