package org.name;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudentDetailes {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\admin\\eclipse-workspace\\Subject\\Input\\data.xlsx");
	FileInputStream fi=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fi);
	Sheet s = w.getSheet("Tabelle1");
	Row r = s.getRow(1);
	Cell c = r.getCell(2);
	System.out.println(c);
}
}
