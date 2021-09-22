package Day4;

import org.testng.annotations.DataProvider;

public class DataProvider_Data {
	@DataProvider(name="Login")
    public Object[][] getData()
    {/*
        Object[] data = {"Admin","temp"};
        return data;*/
   
    
       
        return new Object[][] {

 

                {"Admin", "admin123" },
                {"kumar", "admin123" },
                {"dixit", "admin123" }
                };

 
    
    
    }	
}
