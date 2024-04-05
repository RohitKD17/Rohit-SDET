package DATA_DRIVEN_TEST;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class READ {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\ExcelFiles\\Reacher.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
	//	XSSFSheet sheet=workbook.getSheetAt(0);
		
		int Rows=sheet.getLastRowNum(); //Row no.
		int Col=sheet.getRow(2).getLastCellNum();  //Col no.
		
		System.out.println("The no. of rows are : " + Rows);
		System.out.println("The no. of columns are : " + Col);
		
		for(int r=0;r<=Rows;r++)
		{
			XSSFRow CurrentRow=sheet.getRow(r);
			for(int c=0;c<Col;c++)
			{
				String CellValue=CurrentRow.getCell(c).toString();
				System.out.print(CellValue + "");
			}
			
			System.out.println(); //formatting
		}
		workbook.close();
		file.close();
	}

}
