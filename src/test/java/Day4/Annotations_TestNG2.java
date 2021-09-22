package Day4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_TestNG2 {
  @Test
  public void testMethod4() {
      System.out.println("test method 4 running...");
  }
  
  @Test
  public void testMethod5() {
      System.out.println("test method 5 running...");
  }
  
  @BeforeMethod
  public void beforeMethod() {
      System.out.println("beforeMethod running...");
  }

 

  @AfterMethod
  public void afterMethod() {
      System.out.println("afterMethod running...");
  }

 

  @BeforeClass
  public void beforeClass() {
      System.out.println("beforeClass running...");
  }

 

  @AfterClass
  public void afterClass() {
      System.out.println("afterClass running...");
  }

 

}
 







