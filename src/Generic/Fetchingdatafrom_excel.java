package Generic;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Fetchingdatafrom_excel {
	@Test
	public void fetchdata() throws IOException {
		
		                            //fetching data from excel sheet
    File f=new File("./Files/ab.xlsx");	
	FileInputStream file=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	Sheet s=wb.getSheet("Jiban");
	Row r=s.getRow(4);
	Cell c=r.getCell(1);
	
	System.out.println(c.getStringCellValue());
	
	                         //write data in excel sheet
	File g=new File("./Files/abc.xlsx");
	FileInputStream ft=new FileInputStream(g);
	XSSFWorkbook d=new XSSFWorkbook(ft);
	
	Sheet gt=d.createSheet("ert");
	Row ty=gt.createRow(2);
	Cell yu=ty.createCell(2);
	
	yu.setCellValue("djdjdjjd");
	
	FileOutputStream fos=new FileOutputStream(g);
	d.write(fos);

	
	}
}
