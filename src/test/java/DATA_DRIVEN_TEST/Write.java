package DATA_DRIVEN_TEST;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir") + "\\ExcelFiles\\File.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		
		//without for loop
		
	//	XSSFRow row1=sheet.createRow(0);
	//	row1.createCell(0).setCellValue("Welcome");
	//	row1.createCell(1).setCellValue("to");
	//	row1.createCell(2).setCellValue("data");
		
	//	XSSFRow row2=sheet.createRow(1);
	//	row2.createCell(0).setCellValue("John");
	//	row2.createCell(1).setCellValue("Core");
	//j	row2.createCell(2).setCellValue("Java");
		
		workbook.write(file);
		
		//with for loop
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int r=0;r<3;r++)
		{
			XSSFRow currentRow =sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				System.out.println("Enter the value : ");
				String data=sc.next();
				currentRow.createCell(c).setCellValue(data);
			 
			}
		}
	}

}
