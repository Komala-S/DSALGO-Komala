package pageobjects;
import Tests.Base;


	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.apache.poi.ss.usermodel.DataFormatter;

import java.io.File;
import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class XLUtils extends Base {
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static int getRowCount(String xlFile, String xlSheet) throws IOException {
	fi = new FileInputStream(xlFile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	int rowCount = ws.getLastRowNum();
	wb.close();
	fi.close();
	return rowCount;
	}
	public static int getCellCount(String xlFile, String xlSheet, int rowNum) throws IOException{
	fi = new FileInputStream(xlFile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	row = ws.getRow(rowNum);
	int columnCount = row.getLastCellNum();
	wb.close();
	fi.close();
	return columnCount;
	}
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int columnNum) throws IOException{
	fi = new FileInputStream(xlFile);
	wb = new XSSFWorkbook(fi);
	ws = wb.getSheet(xlSheet);
	row = ws.getRow(rowNum);
	cell = row.getCell(columnNum);
	String data;
	try {
	DataFormatter formatter = new DataFormatter();
	data = formatter.formatCellValue(cell);
	} catch (Exception e) {
	data = "";
	}
	wb.close();
	fi.close();
	return data;
	}
	
	public static void setCellData(String path, String sheetName, int rownum, int colnum, String data) throws IOException {
		{
			File xlfile = new File(path);
		
				if (!xlfile.exists()) {
					wb = new XSSFWorkbook();
					fo = new FileOutputStream(path);
					wb.write(fo);
				}
				fi = new FileInputStream(path);
				wb = new XSSFWorkbook(fi);
				if (wb.getSheetIndex(sheetName) == -1)
					wb.createSheet(sheetName);
				ws= wb.getSheet(sheetName);
				if (ws.getRow(rownum) == null)
					ws.createRow(rownum);
				row = ws.getRow(rownum);
				cell = row.createCell(colnum);
				cell.setCellValue(data);
				fo = new FileOutputStream(path);
				ws = wb.getSheet(sheetName);
				row = ws.getRow(rownum);
				cell = row.createCell(colnum);
				cell.setCellValue(data);
				fo = new FileOutputStream(path);
				wb.write(fo);
				wb.close();
				fi.close();
				fo.close();

}
	

}
	}