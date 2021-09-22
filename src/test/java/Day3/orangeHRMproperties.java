package Day3;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class orangeHRMproperties {
	@Test
	public void f() throws Exception {
	     
	      File file = new File("C:\\Users\\Administrator\\Desktop\\Omkar Training\\JavaTraining\\src\\test\\java\\Day3\\OrangeHRM.properties");
	     
	      FileInputStream fInput= new FileInputStream(file);
	     
	      Properties prop = new Properties();
	     
	      prop.load(fInput);
	     
	      System.out.println(prop.getProperty("objUsername"));
	      System.out.println(prop.getProperty("objPassword"));
	  }

}
