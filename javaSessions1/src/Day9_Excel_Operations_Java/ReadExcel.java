import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src = new File("D:\\Testdata1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
//		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println(data0);
		
		int rowCount = sheet1.getLastRowNum();
		
		System.out.println("Total rows is " + rowCount);
		
		for(int i=0; i <= rowCount; i++) {
			
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data0);
			
		wb.close();
		}
		
		
		
		
				
		
		
	}

}
