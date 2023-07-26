package Maven.SeleniumProject;

//public class ExcelRead {
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;


	public class ExcelRead {

		String filepath = "C:\\Users\\KAVI\\Desktop\\Inputs.xlsx";

		public void ReadData() throws IOException{

			File F = new File(filepath);
			FileInputStream FS = new FileInputStream(F);
			//HSSFWorkbook workbook = new HSSFWorkbook(FS);

			XSSFWorkbook workbook = new XSSFWorkbook(FS);
			Sheet S = workbook.getSheet("login"); 
		
			int totalRows = S.getPhysicalNumberOfRows();
			for (int i=0; i<totalRows; i++) {
				Row inputRow = S.getRow(i);
			
			int totalColumn = inputRow.getLastCellNum();
			for (int j=0; j<totalColumn; j++) {
			
				Cell cellValue = inputRow.getCell(j);
				String actualValue = cellValue.getStringCellValue();
				System.out.print(actualValue);
				System.out.print(" ");
			}
	            System.out.println();
		}
		}	

		public static void main(String[] args) throws IOException {

			// TODO Auto-generated method stub

			ExcelRead E = new ExcelRead();
			E.ReadData();

		}
		}

	


