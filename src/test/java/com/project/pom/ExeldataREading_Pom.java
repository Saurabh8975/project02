package com.project.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExeldataREading_Pom {
	XSSFWorkbook worbook;
	public  ExeldataREading_Pom() {
		
		String path="C:\\Users\\HP\\eclipse-workspace\\instgramproject\\Exseldata\\sheet1.xlsx";
		File sourse= new File(path);
	
		try {
			FileInputStream fis= new FileInputStream(sourse);
			try {
				 worbook= new XSSFWorkbook(fis);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
	}
		
	public String readExselData(String sheetname, int rownum, int cellnum) {
		
		return worbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
	}
}
