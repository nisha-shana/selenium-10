package TestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFormExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//steps 1		
FileInputStream file=new FileInputStream("./TestData/Testscriptdata.xlsx");
//steps 2
Workbook wb=WorkbookFactory.create(file);
//steps 3
String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
System.out.println(url);
int price = (int) wb.getSheet("sheet1").getRow(1).getCell(3).getNumericCellValue();
System.out.println(price);
boolean status = wb.getSheet("sheet1").getRow(1).getCell(4).getBooleanCellValue();
System.out.println(status);
Workbook datwb;
LocalDateTime date = wb.getSheet("sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
System.out.println(date);
	}

}
