package cocepts;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetriveDataFromExcel {
 public static void main(String[] args) throws IOException {
	
	 String excelpath="D:/workspace/Own_project2/config/EXCELSHEET.xlsx";
		File f =new File(excelpath) ;
		FileInputStream fp=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fp);
		XSSFSheet sh=wb.getSheet("ACCDETAIL");
		XSSFCell userCell=sh.getRow(1).getCell(0);
		String username=userCell.getStringCellValue();
		System.out.println(username);
	    XSSFCell  accnoCell=sh.getRow(1).getCell(1);
	    String accnum=accnoCell.getStringCellValue();
	    System.out.println(accnum);
		
		
}
}
