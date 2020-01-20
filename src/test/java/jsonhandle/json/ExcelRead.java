package jsonhandle.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\NewWorkspcace\\json\\qqqq.xls");
		FileInputStream in = new FileInputStream(file);
		System.out.println(in);
		
		HSSFWorkbook wb = new HSSFWorkbook(in);
		System.out.println(in);
		HSSFSheet ws = wb.getSheet("Sheet1");
		System.out.println(in);
//		ws.getRowRow(1).get
		System.out.println(ws.getRow(1).getCell(1).getStringCellValue());
		
		
		
	}

}
