package Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel_data_EM_GroupA {

	private XSSFWorkbook wb;

	public String[][] read_sheet() throws InvalidFormatException, IOException {

		File myfile = new File(".\\Test-data\\data_EM_GroupA.xlsx");

		wb = new XSSFWorkbook(myfile);
		XSSFSheet mysheet = wb.getSheet("Sheet1");

		int number_of_rows = mysheet.getPhysicalNumberOfRows();
		int number_of_columns = mysheet.getRow(0).getLastCellNum();

		String[][] myarray = new String[number_of_rows - 1][number_of_columns];

		for (int r = 1; r < number_of_rows; r++) {
			for (int c = 0; c < number_of_columns; c++) {
				XSSFRow row = mysheet.getRow(r);
				myarray[r - 1][c] = row.getCell(c).getStringCellValue();
			}
		}
		return myarray;

	}

}
