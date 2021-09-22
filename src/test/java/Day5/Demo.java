package Day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void apache_xlsx() throws IOException {
		 File src = new File("C:\\Users\\Administrator\\Downloads\\XSSFWorkbook.xlsx");
	       
	        FileInputStream fis = new FileInputStream(src);
	       
	        XSSFWorkbook wb = new XSSFWorkbook(fis);
	       
	        XSSFSheet sheet = wb.getSheetAt(0);
	       
	        System.out.println(sheet.getLastRowNum());
	               
	        System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	       
	        System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
	       
	        System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	               
	        sheet.getRow(5).createCell(2).setCellValue("FAIL");
	       
	        FileOutputStream fout = new FileOutputStream(src);
	       
	        wb.write(fout);
	       
	        wb.close();
	       
	    }
	}

