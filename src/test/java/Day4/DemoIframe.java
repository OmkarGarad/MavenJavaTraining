package Day4;

public class DemoIframe {
	System.out.println("source of web page");
    System.out.println(driver.getPageSource());
    
    System.out.println("source of parent frame");
    driver.switchTo().frame("frame1");
    
    System.out.println(driver.getPageSource());
    
    System.out.println("switching to child frame");
    driver.switchTo().frame(0);
    
    System.out.println(driver.findElement(By.tagName("P")).getText());
    
    System.out.println("source of child frame");
    
    System.out.println(driver.getPageSource());
    
    driver.switchTo().parentFrame();
    
    System.out.println(driver.getPageSource());
            
    driver.switchTo().defaultContent();
    
    /*
    //driver.navigate().to("https://www.demoqa.com/alerts");
    
    String parentWndHndl=driver.getWindowHandle();
    System.out.println(parentWndHndl);
        
    driver.findElement(By.id("opentab")).click();
    Thread.sleep(5000);
    
    Set<String> winHndls = driver.getWindowHandles();
    System.out.println(winHndls.size());
    
    for(String win:winHndls)
    {
        if(!parentWndHndl.equalsIgnoreCase(win))
        {
            driver.switchTo().window(win);
            System.out.println(win);
            driver.findElement(By.xpath("/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")).click();
            driver.close();                
        }
    }
    */
/*
    //driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL+"t"));
    ((JavascriptExecutor)driver).executeScript("window.open()");
    
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1)); //switches to new tab
    driver.get("https://www.facebook.com");



    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
    driver.get("https://www.google.com");
    
    
    //driver.switchTo().window(parentWndHndl);
      
     */
    Thread.sleep(5000);
    driver.close();

}
